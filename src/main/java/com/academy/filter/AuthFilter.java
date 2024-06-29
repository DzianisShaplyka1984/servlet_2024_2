package com.academy.filter;

import com.academy.model.User;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        HttpSession httpSession = httpServletRequest.getSession();

        User user = (User) httpSession.getAttribute("user");

        String url = httpServletRequest.getRequestURL().toString();

        if (user != null || url.contains("/login")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {

        }
    }
}
