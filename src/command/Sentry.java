package command;

import javax.servlet.http.HttpServletRequest;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Sentry {
	public static Command cmd = new Command();
	public static void init(HttpServletRequest request) {
		cmd = Commander.order(request);
		
		/*String servletPath=request.getServletPath(); // servletPath /member.do
		System.out.println("센트리:" + servletPath.substring(1, servletPath.indexOf(".")));// .앞에것을 가져와라
		System.out.println(servletPath);
		cmd = Commander.order(
				servletPath.substring(1,servletPath.indexOf(".")), //domain 추출	(member)
				request.getParameter("action"), // action으로 왔음 (액션move)
				request.getParameter("page")); // page로 갈거임 (페이지joinForm)
*/	}
}
