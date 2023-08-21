package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ConversionServlet extends HttpServlet {
    @Override

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String number = request.getParameter("number");
            String system = request.getParameter("system");

            int decimal = 0;
            String result = "";

        switch (system) {
            case "2":
                decimal = Integer.parseInt(number, 2);
                result = Integer.toBinaryString(decimal);
                break;
            case "8":
                decimal = Integer.parseInt(number, 8);
                result = Integer.toOctalString(decimal);
                break;
            case "10":
                decimal = Integer.parseInt(number, 10);
                result = Integer.toString(decimal);
                break;
            case "16":
                decimal = Integer.parseInt(number, 16);
                result = Integer.toHexString(decimal);
                break;
        }

            response.setContentType("text/html");
            response.getWriter().println("Decimal value: " + decimal + "<br>");
            response.getWriter().println("Converted value: " + result);
        }
    }


