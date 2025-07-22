package com.pm.back_end_project.exceptions;

/**
 * <b>Header</b>
 * <p>
 * Description
 * </p>
 *
 * @author Ruwani Ranthika
 * @since 2025-07-14
 */
public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound(String message) {
        //mama dena msg eka exception msg eka widiyata send karanawa,ethkota exception clss eken dena msg eka neme denne
        //custom exception ekak denne
        super(message);
    }
}
