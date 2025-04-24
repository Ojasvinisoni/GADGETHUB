<!DOCTYPE html> 
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>GadgetHub</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" />
  <link rel="stylesheet" href="style.css" />
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" rel="stylesheet" />

  <style>
    body {
      background-color: #fff0f5 !important;
      color: #4a148c;
    }

    .navbar-custom {
      background-color: #f8bbd0 !important;
    }

    .navbar-brand {
      color: #6a1b9a !important;
      font-weight: bold;
    }

    .navbar-brand:hover {
      color: #4a148c !important;
    }

    .nav-link {
      color: #6a1b9a !important;
      transition: all 0.3s ease-in-out;
    }

    .nav-link:hover {
      background-color: #f3e5f5;
      color: #4a148c !important;
      border-radius: 5px;
    }

    .dropdown-menu {
      background-color: #fce4ec;
    }

    .dropdown-item {
      color: #6a1b9a;
      transition: background-color 0.3s ease, color 0.3s ease;
    }

    .dropdown-item:hover {
      background-color: #f8bbd0;
      color: #4a148c;
    }

    .form-section {
      background-color: #fce4ec;
      color: #6a1b9a;
    }

    .btn-primary {
      background-color: #ba68c8;
      border: none;
    }

    .btn-primary:hover {
      background-color: #ab47bc;
    }

    .fa-cart-shopping {
      background-color: #ce93d8;
      padding: 8px;
      border-radius: 6px;
      color: white;
      transition: background-color 0.3s ease;
    }

    .fa-cart-shopping:hover {
      background-color: #8e24aa;
    }
  </style>
</head>

<body>
  <!-- Navbar Sections -->
  <nav class="navbar navbar-expand-lg navbar-custom">
    <div class="container-fluid">
      <a href="index.jsp" class="navbar-brand">GadgetHub</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynav">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="mynav">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item dropdown">
            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Category</a>
            <ul class="dropdown-menu">
              <li><a href="#" class="dropdown-item">Mobile</a></li>
              <li><a href="#" class="dropdown-item">TV</a></li>
              <li><a href="#" class="dropdown-item">Speaker</a></li>
              <li><a href="#" class="dropdown-item">Cooler</a></li>
              <li><a href="#" class="dropdown-item">Ipad</a></li>
              <li><a href="#" class="dropdown-item">Pixel</a></li>
            </ul>
          </li>
          <li class="nav-item"><a href="index.jsp" class="nav-link">Products</a></li>
          <li class="nav-item"><a href="login.jsp" class="nav-link">Login</a></li>
          <li class="nav-item"><a href="register.jsp" class="nav-link">Register</a></li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Admin Navbar -->
  <nav class="navbar navbar-expand-lg navbar-custom mt-3">
    <div class="container-fluid">
      <a href="userHome.jsp" class="navbar-brand">GadgetHub</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavAdmin">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="mynavAdmin">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item"><a href="userHome.jsp" class="nav-link">Products</a></li>
          <li class="nav-item dropdown">
            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Category</a>
            <ul class="dropdown-menu">
              <li><a href="#" class="dropdown-item">Mobile</a></li>
              <li><a href="#" class="dropdown-item">TV</a></li>
              <li><a href="#" class="dropdown-item">Speaker</a></li>
              <li><a href="#" class="dropdown-item">Cooler</a></li>
              <li><a href="#" class="dropdown-item">Ipad</a></li>
              <li><a href="#" class="dropdown-item">Pixel</a></li>
            </ul>
          </li>
          <li class="nav-item"><a href="adminStock.jsp" class="nav-link">Stocks</a></li>
          <li class="nav-item"><a href="adminShipped.jsp" class="nav-link">Shipped</a></li>
          <li class="nav-item"><a href="unshippedorders.jsp" class="nav-link">Orders</a></li>
          <li class="nav-item dropdown">
            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Update items</a>
            <ul class="dropdown-menu">
              <li><a href="#" class="dropdown-item">Add Products</a></li>
              <li><a href="#" class="dropdown-item">Remove Product</a></li>
              <li><a href="#" class="dropdown-item">Update Product</a></li>
            </ul>
          </li>
          <li class="nav-item"><a href="#" class="nav-link">Logout</a></li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Customer Navbar -->
  <nav class="navbar navbar-expand-lg navbar-custom mt-3">
    <div class="container-fluid">
      <a href="userHome.jsp" class="navbar-brand">GadgetHub</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavCustomer">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="mynavCustomer">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item"><a href="userHome.jsp" class="nav-link">Products</a></li>
          <li class="nav-item"><a href="cartDetails.jsp" class="nav-link">Cart</a></li>
          <li class="nav-item">
            <a href="cartDetails.jsp" class="nav-link"><i class="fa fa-cart-shopping"></i></a>
          </li>
          <li class="nav-item"><a href="#" class="nav-link">Orders</a></li>
          <li class="nav-item"><a href="#" class="nav-link">Profile</a></li>
          <li class="nav-item"><a href="#" class="nav-link">Logout</a></li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Search Bar -->
  <div class="container-fluid text-center p-4 form-section mt-3">
    <h2 style="color: #6a1b9a;">GadgetHub</h2>
    <p style="color: #8e24aa;">We specialize in Electronics</p>
    <form action="LandingServlet">
      <div class="input-group w-50 mx-auto">
        <input type="text" name="search" class="form-control" placeholder="Search items..." />
        <input type="submit" class="btn btn-primary" value="Search" />
      </div>
    </form>
  </div>

 
</body>
</html>
