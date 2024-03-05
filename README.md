Certainly! If you're using Hibernate with JPA (Java Persistence API) for your mini project, here's the revised README file:

---

# Hibernate JPA Person Aadhaar Mini Project

This Java mini project demonstrates basic CRUD (Create, Read, Update, Delete) operations for managing person and Aadhaar card details using Hibernate with JPA (Java Persistence API). It provides functionalities to interact with a MySQL database to store and retrieve data.

## Features

- **Save Person:** Allows users to save details of a person including ID, name, and address.
- **Save Aadhaar Card Details:** Enables users to save Aadhaar card details associated with a person, including Aadhaar ID, name, address, and age.
- **Update Person Details:** Allows users to update the details of an existing person.
- **Update Aadhaar Card Details:** Allows users to update the details of an existing Aadhaar card.
- **Delete Person:** Allows users to delete a person record from the database.
- **Delete Aadhaar Card Details:** Allows users to delete an Aadhaar card record from the database.
- **Fetch Person Details:** Allows users to retrieve the details of a person from the database.
- **Fetch Aadhaar Card Details:** Allows users to retrieve the details of an Aadhaar card from the database.

## Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Apache Maven for building the project.
- MySQL database server installed and running.
- Hibernate ORM framework with JPA support.
- Basic knowledge of Java programming, SQL, and JPA configuration.

## Setup

1. **Clone the Repository:**
   ```
   git clone https://github.com/shubhamp13/HibernateOneToOne.git
   ```

2. **Setup Database:**
   - Create a MySQL database named `person_aadhaar`.
   - Execute the SQL scripts provided in the `sql` folder to create the necessary tables.

3. **Hibernate JPA Configuration:**
   - Configure Hibernate properties along with JPA annotations in entity classes.
   - Ensure that `persistence.xml` file is configured properly to define persistence units.

4. **Build the Project:**
   ```
   mvn clean install
   ```

## Usage

1. **Run the Application:**
   - Navigate to the `controller` package.
   - Run the `PersonAadhaar` class.

2. **Interact with the Application:**
   - Choose from the available menu options to perform various operations.
   - Follow the prompts to input necessary details for each operation.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

This README reflects the usage of Hibernate with JPA for handling database operations in the mini project. Feel free to customize it further according to your project's specific requirements or add any additional information you deem necessary.
