package com.arivu.aws.lambda.handler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.arivu.aws.lambda.function.ReverseStringFunction;
import com.arivu.aws.lambda.model.InputDTO;
import com.arivu.aws.lambda.model.OutputDTO;

@RunWith(MockitoJUnitRunner.class)
public class ReverseStringFunctionTest {

	@InjectMocks
    private ReverseStringFunction reverseStringFunction;
 
    @Test
    public void testReverseStringFunctionHandler() {
        InputDTO inputDTO = new InputDTO();
        inputDTO.setInputString("Spring");
        OutputDTO outputDTO = reverseStringFunction.apply(inputDTO);
        assertEquals("gnirpS", outputDTO.getReversedString());
    }
}
