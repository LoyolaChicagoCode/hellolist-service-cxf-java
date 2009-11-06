package winch.example.message;

import java.util.Arrays;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

public class HelloListMessageServiceTest extends
		AbstractDependencyInjectionSpringContextTests {

	private HelloListMessageService helloListMessageService;

	public void testMessage()
	{
		assertEquals("Hello 2", helloListMessageService.getMessage(Arrays.asList("hello", "world")));
	}

	public void testNullMessage()
	{
		assertEquals("Hello 0", helloListMessageService.getMessage(Arrays.asList(new String[0])));
	}

	public HelloListMessageService getHelloListMessageService() {
		return helloListMessageService;
	}

	public void setHelloListMessageService(
			HelloListMessageService memberVariableMessageService) {
		this.helloListMessageService = memberVariableMessageService;
	}

	@Override
	protected String[] getConfigLocations() {
		setAutowireMode(AUTOWIRE_BY_NAME);
		return new String[] { "file:src/main/webapp/WEB-INF/applicationContext-cxf.xml" };
	}
}
