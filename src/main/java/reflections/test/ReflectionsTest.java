package reflections.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;

import oracle.retail.apps.framework.SchedulerService;
//import org.springframework.scheduling.annotation.EnableScheduling;
import oracle.retail.apps.framework.annotations.EnableScheduling;

public class ReflectionsTest {
	
	public static void main(String[] args) throws Exception {
        File jarFile = new File("C:\\Users\\mbadiger\\eclipse-workspace\\POMDiagnosticJar.jar");
        URLClassLoader child = new URLClassLoader(
                new URL[] {jarFile.toURI().toURL()},
                ReflectionsTest.class.getClassLoader()
        );
        Class classToLoad = Class.forName("oracle.retail.apps.pom.test.impl.POMAnnTest", true, child);
		
		Reflections reflections = new Reflections("oracle.retail",classToLoad.getClassLoader(),new TypeAnnotationsScanner(), new SubTypesScanner());
		Set<Class<? extends Object>> schedulerClasses= reflections.getTypesAnnotatedWith(EnableScheduling.class);
		System.out.println("ann size:"+schedulerClasses.size());
		Set<Class<? extends SchedulerService>> subtypes= reflections.getSubTypesOf(SchedulerService.class);            
		System.out.println("subtypes size:"+subtypes.size());

	}

}
