package winch.example.message;

import java.util.List;

public class HelloListMessageService implements MessageService {

	@Override
	public String getMessage(final List<String> args) {
		return "Hello " + args.size();
	}
}
