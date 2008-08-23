package gwt.macaufly;

import java.io.InputStream;
import com.google.gwt.dev.GWTShell;

/**
 * 将etc/hosted-web.xml
 * @author jiangyy
 */
public class MyGWTShell {

	public static void main(String[] args) throws Exception {

		// run ant task: prepare-host
		System.out.println("prepare host environment... ");
		
		Process process = new ProcessBuilder( "java.exe", 
				"-cp", 
				"lib/ant.jar" + System.getProperty("path.separator") + "lib/ant-launcher.jar",
				"org.apache.tools.ant.Main", "-f",
				"build.xml", "prepare-host" ).redirectErrorStream(true).start();
		
		InputStream in = process.getInputStream();
		while(true){
			int c = in.read();
			if(c == -1) break;
			System.out.print((char)c);
		}

		System.out.println("run GWT Shell... ");

		GWTShell.main(args);
	}

}
