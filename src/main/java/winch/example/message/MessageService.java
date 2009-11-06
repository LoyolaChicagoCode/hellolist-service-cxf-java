package winch.example.message;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface MessageService {

	public String getMessage(@WebParam(name="args") List<String> args);

}
