package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    //save customer - form data
    //CIDs - customer id
    //CName - Customer Name
    //CAddress - Customer Address
    @PostMapping
    //ModelAttribute eken okkoma attribute tika customer dto ekak widiyata wenas kara
    //front end eken ena onama widiyaka (form data...,...,..) data aragena object ekaka set karano
    public String saveCustomer(@ModelAttribute CustomerDTO customerDTO) {
        System.out.println(customerDTO);
        return "saveCustomer";
    }

    //meka weda karanne ne
//    @PostMapping
//    public String saveCustomer(String cid, String cname, String caddress) {
//        System.out.println("saveCustomer");
//        return cid + "," + cname + "," + caddress;
//    }

    //use query parameters
    @PostMapping(params = {"CID", "CName", "CAddress"})
    //query string walin ewana ewa allaganne @RequestParam meken
    public String saveCustomerQueryParams(@RequestParam("CID") String CID, @RequestParam("CName") String CName, @RequestParam("CAddress") String CAddress) {
        System.out.println("CID: " + CID
                + " CName: " + CName);
        return "save";
    }

    //use path variable
    @PostMapping(path = "saveWithPathVariable/{CID}/{CName}/{CAddress}")
    public String saveCustomerPathVariable(@PathVariable("CID") String CID, @PathVariable("CName") String CName, @PathVariable("CAddress") String CAddress) {
        System.out.println("CID: " + CID
                + " CName: " + CName);
        return "save";
    }

    //save JSON
    //request eken enna ona mokakda kiyala kiyanne consumes
    @PostMapping(path = "saveWithJSON", consumes = {MediaType.APPLICATION_JSON_VALUE})
    //model attribute eken wena de wagemai,request body eken enne
    public String saveCustomerWithJSON(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO);
        return "save";
    }

    //return JSON
    //responce eke yanna ona monawada kiyala kiyanne produces
    @GetMapping(path = "getCustomer", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getCustomer() {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCID("1");
        customerDTO.setCName("kamal");
        customerDTO.setCAddress("Galle");
        System.out.println(customerDTO);
        return customerDTO.toString();
    }
}
