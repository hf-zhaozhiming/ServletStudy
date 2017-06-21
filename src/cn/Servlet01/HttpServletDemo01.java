package cn.Servlet01;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 编写一个servlet类，在前台界面访问
 * 1：编写servlet类，重写doGet方法
 * 2：在webapp站点内新建网站目录，新建web-inf/classes，把编译后的class文件放进去，在web-inf目录新建web.xml文件
 *    在文件内，编写servlet相关配置
 * 3：之后就可以在浏览器内访问class文件了
 */
public class HttpServletDemo01 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		resp.getWriter().write("当前时间为：" + new Date());
	}
}
