let jobs = [];

$(document).ready(function () {
    loadJobs();
    $(document).on("click", ".delete-btn", function () {
        const jobId = $(this).data("id");

        if (confirm("Are you sure you want to delete this job?")) {
            $.ajax({
                type: "DELETE",
                url: `http://localhost:8080/api/v1/job/delete/${jobId}`,
                success: function (response) {
                    console.log("Deleted:", response);
                    loadJobs();
                },
                error: function (xhr, status, error) {
                    console.error("Delete failed:", xhr.responseText);
                }
            });
        }
    });

    function populatedEditModel(jobId) {
        const job = jobs.find(j => j.id === jobId);
        if (job) {
            $("#editJobId").val(job.id);
            $("#editJobTitle").val(job.jobtitle);
            $("#editCompanyName").val(job.company);
            $("#editJobLocation").val(job.jobLocation);
            $("#editJobType").val(job.jobType);
            $("#editJobDescription").val(job.jobDescription);

            const editModal = new bootstrap.Modal(document.getElementById('editJobModal'));
            editModal.show();
        }
    }

    $(document).on("click", ".edit-btn", function () {
        const jobId = $(this).data("id");
        populatedEditModel(jobId);
    })
    $(document).on("change", ".status-dropdown", function () {
        const jobId = $(this).data("id");
        const newStatus = $(this).val();
        $.ajax({
            type: "PATCH",
            url: `http://localhost:8080/api/v1/job/status/${jobId}`,
            data: JSON.stringify({ status: newStatus }),
            contentType: "application/json",
            success: function (response) {
                console.log("Status updated:", response);
                loadJobs();
            },
            error: function (xhr, status, error) {
                console.error("Status update failed:", xhr.responseText);
            }
        });
    });
})

$("#searchInput").on("input", function () {
    const keyword = $(this).val().trim();
    if (keyword === "") {
        loadJobs();
        return;
    }
    $.ajax({
        url: `http://localhost:8080/api/v1/job/search/${encodeURIComponent(keyword)}`,
        type: "GET",
        dataType: "json",
        success: function (data) {
            jobs = data;
            $("#jobsTableBody").empty();
            $.each(data, function (index, job) {
                var status = job.status === "Active" ? "Active" : "Deactive";
                var row =
                    `<tr>
                        <td>${index + 1}</td>
                        <td>${job.jobtitle || job.title}</td>
                        <td>${job.company}</td>
                        <td>${job.jobLocation || job.location}</td>
                        <td>${job.jobType || job.type}</td>
                        <td>
                            <select class="form-select form-select-sm status-dropdown" data-id="${job.id}">
                                <option value="Active"${status === "Active" ? " selected" : ""}>Active</option>
                                <option value="Deactive"${status === "Deactive" ? " selected" : ""}>Deactive</option>
                            </select>
                        </td>
                        <td>
                            <button class="btn btn-sm btn-warning me-1 edit-btn" data-id="${job.id}">Edit</button>
                            <button class="btn btn-sm btn-danger delete-btn" data-id="${job.id}">Delete</button>
                        </td>
                     </tr>`;
                $("#jobsTableBody").append(row);
            });
        },
        error: function (xhr, status, error) {
            console.log(xhr.responseText);
        }
    });
});

function loadJobs() {
    $.ajax({
        url: "http://localhost:8080/api/v1/job/getall",
        type: "GET",
        dataType: "json",
        success: function (data) {
            jobs = data.data; //use data.data for jobs array
            $("#jobsTableBody").empty();

            $.each(jobs, function (index, job) {
                var status = job.status === "Active" ? "Active" : "Deactive";
                var row =
                    `<tr>
                        <td>${index + 1}</td>
                        <td>${job.jobtitle || job.title}</td>
                        <td>${job.company}</td>
                        <td>${job.jobLocation || job.location}</td>
                        <td>${job.jobType || job.type}</td>
                        <td>
                            <select class="form-select form-select-sm status-dropdown" data-id="${job.id}">
                                <option value="Active"${status === "Active" ? " selected" : ""}>Active</option>
                                <option value="Deactive"${status === "Deactive" ? " selected" : ""}>Deactive</option>
                            </select>
                        </td>
                        <td>
                            <button class="btn btn-sm btn-warning me-1 edit-btn" data-id="${job.id}">Edit</button>
                            <button class="btn btn-sm btn-danger delete-btn" data-id="${job.id}">Delete</button>
                        </td>
                     </tr>`;
                $("#jobsTableBody").append(row);
            })
        },
        error: function (xhr, status, error) {
            console.log(xhr.responseText);
        }
    })
}

$("#saveJobBtn").click(function () {
    var jobTitle = $("#jobTitle").val();
    var company = $("#companyName").val();
    var location = $("#jobLocation").val();
    var jobType = $("#jobType").val();
    var jobDescription = $("#jobDescription").val();

    var job = {
        jobTitle: jobTitle,
        company: company,
        location: location,
        jobType: jobType,
        jobDescription: jobDescription
    }
    console.log(job);

    $.ajax({
        type: "POST",
        url: "http://localhost:8080/api/v1/job/create",
        data: JSON.stringify(job),
        contentType: "application/json",
        dataType: "json",
        success: function (job) {
            Swal.fire({
                icon: 'success',
                title: 'Job Saved!',
                showConfirmButton: false,
                timer: 1500
            });
            loadJobs();
        },
        error: function (xhr, status, error) {
            //sweet alerts kiyanne mewata
            Swal.fire({
                icon: 'error',
                title: 'Save Failed',
                text: xhr.responseText
            });
        }
    })
})

$("#updateJobBtn").click(function () {
    var job = {
        id: $("#editJobId").val(),
        jobTitle: $("#editJobTitle").val(),
        company: $("#editCompanyName").val(),
        location: $("#editJobLocation").val(),
        jobType: $("#editJobType").val(),
        jobDescription: $("#editJobDescription").val(),
    };

    $.ajax({
        type: "PUT",
        url: "http://localhost:8080/api/v1/job/update",
        data: JSON.stringify(job),
        contentType: "application/json",
        success: function (response) {
            Swal.fire({
                icon: 'success',
                title: 'Job Updated!',
                showConfirmButton: false,
                timer: 1500
            });
            loadJobs();
        },
        error: function (xhr, status, error) {
            Swal.fire({
                icon: 'error',
                title: 'Update Failed',
                text: xhr.responseText
            });
        }
    });
});