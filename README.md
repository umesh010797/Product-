#Product Management Application
This is a Spring Boot application that manages products and charges. It provides RESTful APIs for creating, retrieving, and deleting products, as well as creating charges associated with products.

 Table of Contents
1. Technologies Used
2. Installation
3. Usage
4. API Endpoints
5. Project Description

1. Technologies Used
Java 17
Spring Boot 3.0.1
Spring Data JPA
H2 Database
Maven

2. Installation
Clone the repository: git clone https://github.com/your-username/product-management.git
Navigate to the project directory: cd product-management
Build the application: mvn clean install
Run the application: mvn spring-boot:run
The application will be accessible at: http://localhost:8080

3. Usage
Use a tool like cURL or a REST client application to interact with the API endpoints.
Refer to the API Endpoints section for details on available endpoints and their usage.
API Endpoints
POST /charges/create: Create charges for a product.

4. API EndPoint
Request Body:

json

{
      "id":1,
    "gst":24,
    "delivery":800
}
Response:
json

{
    "id": 1,
    "gst": 24.0,
    "delivery": 800.0
}
POST /product/save: Save a new product with associated charges.

Request Body:
json
curl --location 'http://localhost:8080/product/save?charges=1' \
--header 'Content-Type: application/json' \
--data '{
    "id":2,
    "productId":"1002",
  "name": "LG Washing Machine ",
  "productType": "Washing Machine",
  "category": "Home Appliances",
  "basePrice": "25000.00",
  "discount": 22
  }'
Response:
json
{
    "id": 2,
    "productId": "1002",
    "name": "LG Washing Machine ",
    "productType": "Washing Machine",
    "category": "Home Appliances",
    "basePrice": 25000.0,
    "discount": 5500.0,
    "charges": {
        "id": 1,
        "gst": 24.0,
        "delivery": 800.0
    },
    "finalPrice": 24980.0
}

GET http://localhost:8080/product/findall Retrieve all products.

Response:
css
[
    {
        "id": 2,
        "productId": "1002",
        "name": "LG Washing Machine ",
        "productType": "Washing Machine",
        "category": "Home Appliances",
        "basePrice": 25000.0,
        "discount": 5500.0,
        "charges": {
            "id": 1,
            "gst": 24.0,
            "delivery": 800.0
        },
        "finalPrice": 24980.0
    }
]
GET http://localhost:8080/product/find/{id}: Retrieve a product by ID.

Response:
json

 {
        "id": 2,
        "productId": "1002",
        "name": "LG Washing Machine ",
        "productType": "Washing Machine",
        "category": "Home Appliances",
        "basePrice": 25000.0,
        "discount": 5500.0,
        "charges": {
            "id": 1,
            "gst": 24.0,
            "delivery": 800.0
        },
        "finalPrice": 24980.0
    }
DELETE http://localhost:8080/product/delete/{id}: Delete a product by ID.

5. Project Description
Entity Classes:
Product: Represents a product and has attributes such as id, productId, name, productType, category, basePrice, discount, charges, and finalPrice.
Charges: Represents charges associated with a product and has attributes such as id, gst, and delivery.
Repository Interfaces:
ChargesRepository: Extends JpaRepository and provides database operations for the Charges entity.
ProductRepository: Extends CrudRepository and provides database operations for the Product entity.
Service Implementations:
ChargesServiceImpl: Implements the ChargesService interface and provides methods to create charges.
ProductServiceImp: Implements the ProductService interface and provides methods to create, retrieve, and delete products.
Controller Classes:
ChargesController: Handles HTTP requests related to charges, specifically the /charges/create endpoint for creating charges.
ProductController: Handles HTTP requests related to products, including saving a product, retrieving all products, retrieving a specific product by ID, and deleting a product.
Application Configuration:
application.properties: Contains the configuration properties for the Spring Boot application, including the H2 in-memory database settings.
Curl Commands:
Provides example curl commands for testing the application's endpoints.
To generate a README file for your GitHub repository, you can create a new file named README.md in the root directory of your project and add relevant information about your project, including a description, installation instructions, usage examples, and any other necessary details.
