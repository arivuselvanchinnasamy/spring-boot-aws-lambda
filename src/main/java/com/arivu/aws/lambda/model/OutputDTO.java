package com.arivu.aws.lambda.model;

public class OutputDTO {
	
    private String reversedString;

	public OutputDTO(String reversedString) {
		this.reversedString = reversedString;
	}

	/**
	 * @return the reversedString
	 */
	public String getReversedString() {
		return reversedString;
	}

	/**
	 * @param reversedString the reversedString to set
	 */
	public void setReversedString(String reversedString) {
		this.reversedString = reversedString;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("OutputDTO [reversedString=%s]", reversedString);
	}	
}
