package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Carrier {
    public static void forward(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("��:" + Sentry.cmd.getView());
			try {
				request
				.getRequestDispatcher(Sentry.cmd.getView()) //��Ʈ���� �ִ���ҷ� �����⸸��
				.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
    public static void redirect(
    		HttpServletRequest request, 
    		HttpServletResponse response, 
    		String url) {
    	try {
    		System.out.println("리퀘스트"+request);
			response.sendRedirect(request.getContextPath()+url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}