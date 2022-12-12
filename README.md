# Project Format

1. Contactus form
    a. /contactus - ContactUsServlet.java
        i. doGet() show UI with contactus.jsp
        ii. User submitting info - doPost()
            1. Create Request.java
            2. RequestDao.saveRequest(Request)
        iii. Redirect user to /contactus - to show empty form
2. Admin login
    a. /login LoginServlet.java
        i. doGet() - show UI with login.jsp
        ii. User submitting info - doPost()
            1. Make User.java
            2. UserDao.java - UserDao.isValid User(User)
                a. If valid user redirect to /dashboard
                b. If not valid - redirect to /login - show error - optional
3. Dashboard
    a. /dashboard - DashboardServlet.java
        i. doGet()
            1. Fetch List of active and archived requests
                a. RequestDao.java -RequestDao.fetchRequests (isActive);
                b. Pass active and archived requests to dashboard.jsp
