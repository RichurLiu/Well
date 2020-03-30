package com.well.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author richur
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalErrorException extends RuntimeException {

    public InternalErrorException(String s) {
        super(s);
    }

    /**
     *
     */
    public InternalErrorException() {
        super();
    }

    /**
     * @param arg0
     * @param arg1
     */
    public InternalErrorException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    /**
     * @param arg0
     */
    public InternalErrorException(Throwable arg0) {
        super(arg0);
    }

}
