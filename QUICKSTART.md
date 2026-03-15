# Quick Setup Guide

## ⚡ IntelliJ Copilot Premium Models Issue?

If you cannot see premium models (GPT-4o, Claude Sonnet) in IntelliJ's GitHub Copilot plugin:

### Quick Fix (5 minutes):

1. **Update Everything**
   - Update IntelliJ IDEA to 2024.3+
   - Update GitHub Copilot plugin to 1.7.x+

2. **Re-authenticate**
   - `Settings > Languages & Frameworks > GitHub Copilot`
   - Sign out, then sign back in with Copilot Pro account

3. **Clear Cache**
   - `File > Invalidate Caches / Restart`
   - Select "Invalidate and Restart"

4. **Check Model Selection**
   - `Settings > Languages & Frameworks > GitHub Copilot > Model for completions`
   - Premium models should now appear!

### 📚 Detailed Instructions

See [.github/COPILOT_SETUP.md](.github/COPILOT_SETUP.md) for complete troubleshooting guide.

### 🚀 Project Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/Sakshi-Kumari1/Banking-Management-System.git
   cd Banking-Management-System
   ```

2. **Open in IntelliJ IDEA**
   - File > Open
   - Select the root project folder
   - IntelliJ will auto-detect the Maven project

3. **Build and Run**
   ```bash
   cd "Banking Project/CapstoneProject_"
   mvn clean install
   mvn spring-boot:run
   ```

### 📖 More Information

- [README.md](README.md) - Full project documentation
- [CONTRIBUTING.md](CONTRIBUTING.md) - Contributing guidelines and detailed setup
- [.github/COPILOT_SETUP.md](.github/COPILOT_SETUP.md) - Complete Copilot troubleshooting guide
