package com.sachin.Annotations;
import com.sachin.Annotations.ConditionalOnProperty.DBConnection;
import com.sachin.Annotations.Controller.MyController;
import com.sachin.Annotations.Controller.PizzaController;
import com.sachin.Annotations.Lazy.LazyLoader;
import com.sachin.Annotations.propertysource.PropertySourceDemo;
import com.sachin.Annotations.repository.MyRepo;
import com.sachin.Annotations.scope.PrototypeBean;
import com.sachin.Annotations.scope.SingletonBean;
import com.sachin.Annotations.service.MyService;
import com.sachin.Annotations.service.VegPizza;
import com.sachin.Annotations.value.ValueAnnotationDemo;
import com.sun.jdi.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AnnotationsApplication
{
	public static void main(String[] args)
	{
		var context = SpringApplication.run(AnnotationsApplication.class, args);

		//DBConnection dbConnection;

		//PropertySourceDemo psd = context.getBean(PropertySourceDemo.class);
		//System.out.println(psd.getEmail() + "==" + psd.getHost()+ "==" + psd.getPassword() + "==" + psd.getAppName() + "==" + psd.getAppDesc());

	/*	ValueAnnotationDemo vd = context.getBean(ValueAnnotationDemo.class);
		System.out.println(vd.getDefaultName() + "=" + vd.getHost() + "=" + vd.getEmail() + "=" + vd.getSecret());
		System.out.println(vd.getJavaHome());

		SingletonBean sb1 = context.getBean(SingletonBean.class);
		System.out.println(sb1.hashCode());

		SingletonBean sb2 = context.getBean(SingletonBean.class);
		System.out.println(sb2.hashCode());

		SingletonBean sb3 = context.getBean(SingletonBean.class);
		System.out.println(sb3.hashCode());

		PrototypeBean pb1 = context.getBean(PrototypeBean.class);
		System.out.println(pb1.hashCode());

		PrototypeBean pb2 = context.getBean(PrototypeBean.class);
		System.out.println(pb2.hashCode());

		PrototypeBean pb3 = context.getBean(PrototypeBean.class);
		System.out.println(pb3.hashCode());
*/
		/*MyController my = context.getBean(MyController.class);
		System.out.println(my.hello());
		MyService ser = context.getBean(MyService.class);
		System.out.println(ser.hello());
		MyRepo rep = context.getBean(MyRepo.class);
		System.out.println(rep.hello());
		LazyLoader ll = context.getBean(LazyLoader.class);
		//System.out.println();
		*/
		//PizzaController pc = context.getBean(PizzaController.class);
		//PizzaController pc = (PizzaController)context.getBean("pizzaController");
		//PizzaController pc = (PizzaController)context.getBean("pizzaDemo");
		//System.out.println(pc.getPizza());
		//VegPizza vegPizza = context.getBean(VegPizza.class);
		//VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");
		//System.out.println("Pizza type is " + vegPizza.getPizza());
	}
}
