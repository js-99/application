package com.example.rest.response;

/**
 * Error response for subscription operations
 */
public class ErrorResponse extends SubscriptionResponse {

    private ErrorCode errorCode;

    public ErrorResponse(final ErrorCode errorCode, final String message) {
        super(false, message);
        this.errorCode = errorCode;
    }

    public ErrorResponse(final ErrorCode errorCode) {
        super(false, null);
        this.errorCode = errorCode;
    }

    private ErrorResponse() {
        // For Json
        super();
    }

    /**
     * @return the errorCode
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
