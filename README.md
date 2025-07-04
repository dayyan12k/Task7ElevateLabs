# Task7ElevateLabs

This Java program connects to a MySQL database, creates a table if it doesn't exist, and inserts two rows into the table.

Steps performed in the program:

1. Load the MySQL JDBC Driver using Class.forName().
   This ensures the JDBC driver is registered.

2. Establish a connection to the MySQL database using:
   URL: jdbc:mysql://localhost:3306/dayyan
   Username: 
   Password: 

3. Define a SQL query to create the 'employees' table if it doesn't already exist.
   The table contains:
   - id (INT, auto-incremented primary key)
   - name (VARCHAR)
   - Title (VARCHAR)
   - salary (INT)

4. Execute the table creation query using a PreparedStatement.

5. Define two INSERT queries that add new employee records into the table.

6. Execute both INSERT queries using PreparedStatement.

7. Close all PreparedStatement and Connection objects to free up resources.

Key Concepts Used:
- JDBC (Java Database Connectivity)
- DriverManager to connect to the database
- Connection to maintain the session
- PreparedStatement to run SQL queries
- Exception handling for both SQL and Class loading errors

This program ensures that even if the 'employees' table doesn't exist, it is created before data is inserted.
