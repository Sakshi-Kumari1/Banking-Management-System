# Banking Management System

A Spring Boot application for managing banking operations including customer management, account management, and money transfer transactions.

## Features

- **Customer Management**: Create, Read, Update, and Delete customer records
- **Account Management**: Handle customer bank accounts
- **Transaction Processing**: Process money transfers between accounts
- **RESTful APIs**: Well-structured REST endpoints for all operations
- **H2 Database**: In-memory database for development and testing
- **Spring Data JPA**: For database operations

## Technology Stack

- **Java**: 1.8
- **Spring Boot**: 2.7.5
- **Spring Data JPA**: For data persistence
- **H2 Database**: In-memory database
- **Maven**: Build tool
- **Spring Boot DevTools**: For development

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 1.8 or higher
- Maven 3.6+
- IntelliJ IDEA (recommended) or any Java IDE

### Installation

1. Clone the repository:
```bash
git clone https://github.com/Sakshi-Kumari1/Banking-Management-System.git
cd Banking-Management-System
```

2. Navigate to the project directory:
```bash
cd "Banking Project/CapstoneProject_"
```

3. Build the project:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

### Running Tests

```bash
mvn test
```

## IntelliJ IDEA Setup

### GitHub Copilot Configuration

If you're using GitHub Copilot and cannot see premium models (GPT-4o, Claude Sonnet, etc.), please refer to our [CONTRIBUTING.md](CONTRIBUTING.md#configure-github-copilot-plugin) guide for detailed setup instructions.

**Quick Fix:**
1. Update IntelliJ IDEA to 2024.3 or newer
2. Update GitHub Copilot plugin to 1.7.x or newer
3. Sign out and sign back in with your Copilot Pro/Enterprise account
4. Invalidate caches and restart: `File > Invalidate Caches / Restart`
5. Check model selection at: `File > Settings > Languages & Frameworks > GitHub Copilot > Model for completions`

## Project Structure

```
Banking Project/CapstoneProject_/
├── src/
│   ├── main/
│   │   ├── java/com/wipro/
│   │   │   ├── bank/                    # Bank domain models
│   │   │   ├── controller/              # REST controllers
│   │   │   ├── exception/               # Exception handling
│   │   │   ├── model/                   # JPA entities
│   │   │   ├── repository/              # Data repositories
│   │   │   ├── service/                 # Business logic
│   │   │   └── CapstoneProject40128782Application.java
│   │   └── resources/
│   │       └── application.properties   # Application configuration
│   └── test/
│       └── java/com/wipro/             # Test classes
├── pom.xml                              # Maven configuration
└── HELP.md                              # Spring Boot reference
```

## API Documentation

### Customer Endpoints

The application provides RESTful APIs for managing customers and their accounts. Detailed API documentation will be available once you run the application.

### Database Console

When running the application, you can access the H2 database console at:
```
http://localhost:8080/h2-console
```

Default connection details are configured in `application.properties`.

## Development

### Using GitHub Copilot

This project is optimized for development with GitHub Copilot. We recommend using premium models for best results:
- **GPT-4o**: For complex code generation and refactoring
- **Claude 3.5 Sonnet**: For detailed explanations and documentation
- **o1-preview/o1-mini**: For advanced reasoning tasks

See [CONTRIBUTING.md](CONTRIBUTING.md) for setup instructions.

### Code Style

- Follow Java naming conventions
- Use meaningful variable and method names
- Add Javadoc comments for public methods
- Write unit tests for new features

## Contributing

Contributions are welcome! Please read our [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct and the process for submitting pull requests.

## License

This project was developed as a capstone project for educational purposes.

## Authors

- Sakshi Kumari

## Acknowledgments

- Spring Boot team for the excellent framework
- Wipro for the project requirements and guidance
