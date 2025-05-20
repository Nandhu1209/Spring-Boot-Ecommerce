

## 🛒 E-Commerce Web Application

A full-stack e-commerce platform built with **Spring Boot (Java)** on the backend and **Vanilla JavaScript** on the frontend. The application supports core features such as product management and shopping cart functionalities, with seamless RESTful integration.

### 🔧 Key Features

* **Backend (Spring Boot + H2 + JPA/Hibernate):**

  * Fixed a critical `500 Internal Server Error` caused by a primary key violation.
  * Implemented `@GeneratedValue(strategy = GenerationType.IDENTITY)` to auto-generate unique IDs for products.
  * Improved data integrity and streamlined database interactions using Spring Data JPA.

* **Frontend (JavaScript + HTML/CSS):**

  * Enhanced error handling and client-side logging.
  * Users can:

    * Add new products to the catalog.
    * Add items to their cart.
    * Remove items from the cart.
  * Integrated frontend with REST APIs for real-time server communication.

### 🧠 What I Learned

* Advanced debugging of server-side exceptions in Spring Boot.
* Best practices for auto-generating primary keys in relational databases.
* Strengthened frontend-backend synchronization techniques.
* Improved user experience with real-time cart updates.

### 🔜 What's Next

* Implementing advanced cart features (e.g., quantity updates, total calculation).
* Adding robust search and filter capabilities to enhance product discovery.
* Deploying the application for live testing and feedback.

---

Let me know if you want to generate a full `README.md` file or include screenshots, setup instructions, or API details.
