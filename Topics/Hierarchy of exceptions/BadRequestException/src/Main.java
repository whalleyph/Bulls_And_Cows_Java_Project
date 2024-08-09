// update the class
class BadRequestException extends java.lang.Exception{
    protected String message;

    BadRequestException(String message) {
        super(message);
    }
}