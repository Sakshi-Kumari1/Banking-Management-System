# Contributing to Banking Management System

Thank you for your interest in contributing to this project! This guide will help you set up your development environment properly.

## Development Environment Setup

### Prerequisites
- Java 1.8 or higher
- Maven 3.6+
- IntelliJ IDEA (2024.3 or newer recommended)
- GitHub account with Copilot Pro or Enterprise subscription (for AI assistance)

### IntelliJ IDEA Setup

1. **Import the Project**
   - Open IntelliJ IDEA
   - Select `File > Open` and navigate to the project directory
   - Choose the `Banking Project/CapstoneProject_` folder
   - IntelliJ will automatically detect the Maven project

2. **Configure GitHub Copilot Plugin**

   If you cannot see premium models (GPT-4o, Claude Sonnet, etc.) in the GitHub Copilot plugin:

   #### Step 1: Update Plugin and IDE
   - Ensure you're using IntelliJ IDEA 2024.3 or newer
   - Update the GitHub Copilot plugin to version 1.7.x or newer:
     - Go to `File > Settings > Plugins`
     - Search for "GitHub Copilot"
     - Click "Update" if available

   #### Step 2: Verify Your Subscription
   - Go to [GitHub Copilot Settings](https://github.com/settings/copilot)
   - Verify you have an active Copilot Pro or Enterprise subscription
   - Check [GitHub Copilot Features](https://github.com/settings/copilot/features) and ensure premium models are enabled

   #### Step 3: Re-authenticate in IntelliJ
   - Go to `File > Settings > Languages & Frameworks > GitHub Copilot`
   - Click "Sign out" and then "Sign in" again
   - Use your GitHub account with active Copilot Pro/Enterprise subscription

   #### Step 4: Clear Cache and Restart
   - Go to `File > Invalidate Caches / Restart`
   - Select "Invalidate and Restart"
   - After restart, check if premium models appear

   #### Step 5: Access Model Selection
   - Premium models can be selected at:
     - `File > Settings > Languages & Frameworks > GitHub Copilot > Model for completions`
   - Available models may include:
     - GPT-4o (premium)
     - GPT-4.1 (premium)
     - Claude 3.5 Sonnet (premium)
     - o1-preview (premium)
     - o1-mini (premium)

   #### Troubleshooting
   - If models still don't appear after 24 hours of activating Copilot Pro, wait a bit longer for subscription sync
   - Check your organization settings if using Enterprise Copilot
   - Verify no corporate firewall is blocking model access
   - For persistent issues, contact GitHub Support

### Building the Project

```bash
cd "Banking Project/CapstoneProject_"
mvn clean install
```

### Running the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

### Running Tests

```bash
mvn test
```

## Project Structure

```
Banking Project/CapstoneProject_/
├── src/
│   ├── main/
│   │   ├── java/com/wipro/
│   │   │   ├── bank/
│   │   │   ├── controller/
│   │   │   ├── exception/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   └── service/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/com/wipro/
├── pom.xml
└── HELP.md
```

## API Endpoints

The application provides RESTful APIs for:
- Customer management (CRUD operations)
- Account management
- Money transfer transactions

## Code Style

- Follow standard Java naming conventions
- Use meaningful variable and method names
- Add comments for complex business logic
- Write unit tests for new features

## Submitting Changes

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/your-feature-name`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature-name`)
5. Open a Pull Request

## Questions?

If you have questions or need help, please open an issue on GitHub.
