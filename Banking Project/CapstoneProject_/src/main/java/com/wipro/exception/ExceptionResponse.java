package com.wipro.exception;

public class ExceptionResponse {
private String errorMessage;
private String requestedURI;
private String getErrorMessage;
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
public String getRequestedURI() {
	return requestedURI;
}
public void setRequestedURI(String requestedURI) {
	this.requestedURI = requestedURI;
}
public String getGetErrorMessage() {
	return getErrorMessage;
}
public void setGetErrorMessage(String getErrorMessage) {
	this.getErrorMessage = getErrorMessage;
}

}
