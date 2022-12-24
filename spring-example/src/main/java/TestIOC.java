import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaolili7
 * @date 2022/12/24 19:50
 */
public class TestIOC {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		TestBean testBean = context.getBean(TestBean.class);
		testBean.helloSpring();
	}
}
