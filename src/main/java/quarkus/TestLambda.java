package quarkus;

import javax.inject.Inject;
import javax.inject.Named;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.springframework.beans.factory.annotation.Autowired;

@Named("test")
public class TestLambda implements RequestHandler<InputObject, OutputObject> {

    @Autowired
    private ProcessingService service;

    @Override
    public OutputObject handleRequest(InputObject input, Context context) {
        return service.process(input);
    }
}
