package com.arivu.aws.lambda.function;

import java.util.stream.IntStream;

import org.springframework.cglib.core.internal.Function;
import org.springframework.stereotype.Component;
import com.arivu.aws.lambda.model.InputDTO;
import com.arivu.aws.lambda.model.OutputDTO;

@Component
public class ReverseStringFunction implements Function<InputDTO, OutputDTO> {

	@Override
	public OutputDTO apply(InputDTO inputDTO) {
		String str2Reversed= inputDTO.getInputString();
		String reversedString = IntStream.range(0, str2Reversed.length())
				  .map(i -> str2Reversed.charAt(str2Reversed.length() - i - 1))
		            .collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append)
		            .toString();
		return new OutputDTO(reversedString);
	}
	
}
