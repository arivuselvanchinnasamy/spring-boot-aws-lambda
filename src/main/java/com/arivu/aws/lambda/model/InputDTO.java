package com.arivu.aws.lambda.model;

public class InputDTO {
	 
    private String inputString;

	/**
	 * @return the inputString
	 */
	public String getInputString() {
		return inputString;
	}

	/**
	 * @param inputString the inputString to set
	 */
	public void setInputString(String inputString) {
		this.inputString = inputString;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("InputDTO [inputString=%s]", inputString);
	}
    
}
