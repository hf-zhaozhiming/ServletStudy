package cn.Servlet01;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ��дһ��servlet�࣬��ǰ̨�������
 * 1����дservlet�࣬��дdoGet����
 * 2����webappվ�����½���վĿ¼���½�web-inf/classes���ѱ�����class�ļ��Ž�ȥ����web-infĿ¼�½�web.xml�ļ�
 *    ���ļ��ڣ���дservlet�������
 * 3��֮��Ϳ�����������ڷ���class�ļ���
 */
public class HttpServletDemo01 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().write("��ǰʱ��Ϊ��" + new Date());
	}
}
