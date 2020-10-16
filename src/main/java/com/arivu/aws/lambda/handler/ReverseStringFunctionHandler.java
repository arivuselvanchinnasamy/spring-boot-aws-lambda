package com.arivu.aws.lambda.handler;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.arivu.aws.lambda.model.InputDTO;
import com.arivu.aws.lambda.model.OutputDTO;

public class ReverseStringFunctionHandler extends SpringBootRequestHandler<InputDTO, OutputDTO> {

}