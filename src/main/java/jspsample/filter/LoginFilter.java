package jspsample.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "*.do")
public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest Sreq, ServletResponse Sres, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest HttpSreq= (HttpServletRequest) Sreq;
		System.out.println(HttpSreq.getRequestURI());
		if(HttpSreq.getSession().getAttribute("name") !=null)
		{
			chain.doFilter(Sreq, Sres);
		}
		else{
			HttpSreq.getRequestDispatcher("/login.do").forward(Sreq, Sres);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
