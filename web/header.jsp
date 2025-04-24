<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="in.gadgethub.dao.impl.*,in.gadget.dao.*,in.gadgethub.utility.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>Logout Header</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
    <link rel="stylesheet" href="mycss.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />

    <style>
        body {
            background-color: #f3e5f5;
        }

        .navbar {
            background-color: #ce93d8;
        }

        .navbar-brand {
            color: #6a1b9a !important;
            font-weight: bold;
        }

        .navbar-brand:hover {
            color: #4a148c !important;
        }

        .nav-link {
            color: #4a148c !important;
            transition: color 0.3s ease-in-out;
        }

        .nav-link:hover,
        .dropdown-item:hover {
            color: #6a1b9a !important;
            background-color: #ede7f6;
        }

        .dropdown-menu {
            background-color: #f3e5f5;
        }

        .dropdown-item {
            color: #4a148c !important;
        }

        .badge {
            background-color: #ab47bc !important;
            color: white;
        }

        .search-btn {
            background-color: #8e24aa !important;
            border: none;
        }

        .search-btn:hover {
            background-color: #6a1b9a !important;
        }

        #message {
            color: #6a1b9a;
            font-weight: bold;
        }
    </style>
</head>

<body>
<%
    String userType = (String) session.getAttribute("userType");
    if (userType == null) {
%>

<!-- Guest Navbar -->
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="LandingServlet"><%=AppInfo.appName%></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <jsp:include page="category.jsp" />
                <li class="nav-item"><a class="nav-link" href="./LandingServlet">Products</a></li>
                <li class="nav-item"><a class="nav-link" href="login.jsp">Login</a></li>
                <li class="nav-item"><a class="nav-link" href="register.jsp">Register</a></li>
            </ul>
        </div>
    </div>
</nav>

<% } else if (userType.equalsIgnoreCase("Customer")) {
    String userName = (String) session.getAttribute("userName");
    CartDaoImpl cartDao = new CartDaoImpl();
    int notf = cartDao.getAllCartItems(userName).size();
%>

<!-- Customer Navbar -->
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="UserHomeServlet"><%=AppInfo.appName%></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <jsp:include page="category.jsp" />
                <li class="nav-item"><a class="nav-link" href="./UserHomeServlet">Products</a></li>
                <% if (notf == 0) { %>
                <li class="nav-item"><a class="nav-link" href="./CartDetailsServlet">Cart</a></li>
                <% } else { %>
                <li class="nav-item">
                    <a class="nav-link" href="./CartDetailsServlet" id="mycart">
                        <i data-count="<%=notf%>" class="fa fa-shopping-cart fa-3x icon-white badge"></i>
                    </a>
                </li>
                <% } %>
                <li class="nav-item"><a class="nav-link" href="./OrderServlet">Orders</a></li>
                <li class="nav-item"><a class="nav-link" href="./UserProfileServlet">Profile</a></li>
                <li class="nav-item"><a class="nav-link" href="./LogoutServlet">Logout</a></li>
            </ul>
        </div>
    </div>
</nav>

<% } else { %>

<!-- Admin Navbar -->
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="./AdminViewServlet"><%=AppInfo.appName%></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="./AdminViewServlet">Products</a></li>
                <li class="nav-item dropdown">
                    <jsp:include page="category.jsp" />
                </li>
                <li class="nav-item"><a class="nav-link" href="./AdminStockServlet">Stock</a></li>
                <li class="nav-item"><a class="nav-link" href="./ShippedItemServlet">Shipped</a></li>
                <li class="nav-item"><a class="nav-link" href="./UnshippedItemServlet">Orders</a></li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown">
                        Update Item
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="addproduct.jsp" class="dropdown-item">Add Product</a></li>
                        <li><a href="removeProduct.jsp" class="dropdown-item">Remove Product</a></li>
                        <li><a href="updateProductById.jsp" class="dropdown-item">Update Product</a></li>
                    </ul>
                </li>
                <li class="nav-item"><a class="nav-link" href="./LogoutServlet">Logout</a></li>
            </ul>
        </div>
    </div>
</nav>

<% } %>

<!-- Company Header -->
<div class="container-fluid text-center mt-0 p-3" style="background-color: #ede7f6;">
    <h2 style="color: #6a1b9a;"><%=AppInfo.appName%></h2>
    <h6 style="color: #8e24aa;">We specialize in Electronics</h6>
    <form class="form-inline" action="LandingServlet" method="get">
        <div class="input-group">
            <input type="text" class="form-control" name="search" placeholder="Search Items" required />
            <input type="submit" class="btn btn-primary search-btn" value="Search" />
        </div>
    </form>
    <p align="center" id="message"></p>
</div>


</body>
</html>
