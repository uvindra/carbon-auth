/*
 *
 *   Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.auth.core.exception;

/**
 * Top level exception class of Auth exceptions
 *
 */
public class AuthException extends Exception {
    
    private ErrorHandler errorHandler;

    /**
     * Get error handler object.
     * @return ErrorHandler
     */
    public ErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public AuthException() {
        super();
        this.errorHandler = ExceptionCodes.INTERNAL_ERROR;
    }

    /**
     * @param message Error message
     * @param cause Error cause
     */
    public AuthException(String message, Throwable cause) {
        super(message, cause);
        this.errorHandler = ExceptionCodes.INTERNAL_ERROR;
    }

    /**
     *
     * @param cause Error cause
     */
    public AuthException(Throwable cause) {
        super(cause);
        this.errorHandler = ExceptionCodes.INTERNAL_ERROR;
    }

    /**
     *
     * @param message Error message
     * @param cause Error cause
     * @param enableSuppression whether you need enable suppression
     * @param writableStackTrace Writable error stack trace.
     */
    protected AuthException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     *
     * @param message Error message
     */
    public AuthException(String message) {
        super(message);
        this.errorHandler = ExceptionCodes.INTERNAL_ERROR;
    }

    /**
     * This is a default constructure where you can pass error code to error DTO
     * @param message Error message
     * @param code Exception code that need to pass to the error DTO
     */
    public AuthException(String message, ErrorHandler code) {
        super(message);
        this.errorHandler = code;
    }

    /**
     * This is a default constructor where you can pass error code to error DTO
     * @param message Error message
     * @param cause throwable object.
     * @param code Exception code that need to pass to the error DTO
     */
    public AuthException(String message, Throwable cause, ErrorHandler code) {
        super(message, cause);
        this.errorHandler = code;
    }

}
