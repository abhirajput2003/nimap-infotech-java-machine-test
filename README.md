Nimap Infotech Java Machine Test

This project is a machine test for Nimap Infotech, implemented using Spring Boot. It includes CRUD operations for Category and Product entities with a one-to-many relationship between them. The application also supports server-side pagination and provides detailed responses for each API.

Features
         CRUD operations for Categories and Products.
         One-to-Many Relationship between Categories and Products.
         Server-side Pagination for efficient data handling.
         REST APIs for managing Categories and Products.
         Annotation-based Configuration (No XML).
         Uses JPA & Hibernate for database interaction.

Prerequisites
         Java 8 or above
         MySQL 5(if MySQl 5 is ont available change the dependacy in pom.xml) installed and running
         Postman 
         
How to Run the Project
         1)Clone the Repository
             git clone https://github.com/abhirajput2003/nimap-infotech-java-machine-test.git  
             cd nimap-infotech-java-machine-test  

         2)Configure Database
            spring.application.name=project
            server.port=8064

            spring.datasource.url=jdbc:mysql://localhost:3306/category
            spring.datasource.username=root
            spring.datasource.password=root
            spring.datasource.driver-class-name= com.mysql.jdbc.Driver

            #spring.jpa.hibernate.ddl-auto=create-drop

            spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL5InnoDBDialect
            spring.jpa.hibernate.ddl-auto= update

         3)Run the Application
            Open the project in Spring Tool Suit(STS).
             go on project -> Write Click on project ->Go on Run AS ->Write Click on Run AS ->Click on 
             SpringBoot App
                 or 
            Open any Java IDE.

          4)Test the APIs
             Use Postman or any API testing tool to test the endpoints.


API Endpoints
        Category APIs
             GET /api/categories?page={pageNumber}
              Retrieves all categories with pagination.
             POST /api/categories
              Creates a new category.
             GET /api/categories/{id}
              Retrieves a category by its ID.
             PUT /api/categories/{id}
              Updates a category by its ID.
             DELETE /api/categories/{id}
              Deletes a category by its ID.  

          Product APIs
              GET /api/products?page={pageNumber}
               Retrieves all products with pagination.
              POST /api/products
               Creates a new product.
              GET /api/products/{id}
               Retrieves a product by its ID, including the associated category details.
              PUT /api/products/{id}
               Updates a product by its ID.
              DELETE /api/products/{id}
               Deletes a product by its ID.
    
             

         
