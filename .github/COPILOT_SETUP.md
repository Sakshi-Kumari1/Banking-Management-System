# GitHub Copilot Setup Guide for IntelliJ IDEA

This guide will help you configure GitHub Copilot premium models in IntelliJ IDEA for the Banking Management System project.

## Problem: Cannot See Premium Models

If you're experiencing issues where premium models (GPT-4o, GPT-4.1, Claude 3.5 Sonnet, o1-preview, o1-mini) are not visible in your IntelliJ IDEA GitHub Copilot plugin, follow these steps:

## Prerequisites

✅ **Active Subscription**: You must have GitHub Copilot Pro or Enterprise subscription
✅ **Latest IDE**: IntelliJ IDEA 2024.3 or newer
✅ **Latest Plugin**: GitHub Copilot plugin version 1.7.x or newer

## Step-by-Step Solution

### 1. Verify Your GitHub Copilot Subscription

1. Go to [GitHub Copilot Settings](https://github.com/settings/copilot)
2. Confirm you have an active Copilot Pro or Enterprise subscription
3. Visit [GitHub Copilot Features](https://github.com/settings/copilot/features)
4. Ensure premium models are enabled for your account

### 2. Update IntelliJ IDEA

1. Open IntelliJ IDEA
2. Go to `Help > Check for Updates`
3. Install any available updates
4. Restart IntelliJ IDEA

### 3. Update GitHub Copilot Plugin

1. Go to `File > Settings > Plugins` (Windows/Linux) or `IntelliJ IDEA > Preferences > Plugins` (macOS)
2. Click on the "Installed" tab
3. Find "GitHub Copilot" in the list
4. If an update is available, click "Update"
5. Click "OK" and restart IntelliJ IDEA

### 4. Re-authenticate with GitHub

1. Go to `File > Settings > Languages & Frameworks > GitHub Copilot`
2. Click "Sign out"
3. Click "Sign in"
4. Follow the authentication flow in your browser
5. Make sure you're signing in with the GitHub account that has Copilot Pro/Enterprise

### 5. Invalidate Caches and Restart

This is a critical step that often resolves the issue:

1. Go to `File > Invalidate Caches / Restart`
2. In the dialog, select "Invalidate and Restart"
3. Wait for IntelliJ IDEA to restart
4. This may take a few minutes

### 6. Configure Model Selection

After restarting, check the model selection:

1. Go to `File > Settings > Languages & Frameworks > GitHub Copilot`
2. Look for "Model for completions" dropdown
3. You should now see premium models:
   - **GPT-4o** (Premium - Best for complex code generation)
   - **GPT-4.1** (Premium - Advanced reasoning)
   - **Claude 3.5 Sonnet** (Premium - Excellent for explanations)
   - **o1-preview** (Premium - Advanced reasoning)
   - **o1-mini** (Premium - Fast reasoning)
   - **GPT-4o-mini** (Standard - Fast and efficient)

### 7. Select Your Preferred Model

1. Choose your preferred model from the dropdown
2. Click "Apply" and "OK"
3. Premium models are now active for:
   - Code completions
   - Code generation
   - Copilot Chat

## Alternative: Copilot Chat Window

Premium models may also be accessible through the Copilot Chat window:

1. Open Copilot Chat: `View > Tool Windows > GitHub Copilot Chat`
2. Look for a model selector icon or dropdown in the chat window
3. Select your preferred premium model

## Troubleshooting

### Models Still Not Showing?

**Wait for Subscription Sync**
- After activating Copilot Pro, it may take up to 24 hours for the subscription to sync across all GitHub services
- Be patient and try again later

**Check Organization Settings**
- If you're using Copilot through an organization, check with your admin
- Organization policies may restrict certain models
- Visit your organization's Copilot settings on GitHub

**Verify Network Access**
- Corporate firewalls may block access to certain models
- Check with your IT department if you're on a corporate network
- Try from a different network to rule out firewall issues

**Plugin Logs**
- Check IntelliJ logs for errors: `Help > Show Log in Explorer/Finder`
- Look for errors related to "copilot" or "github"
- Share logs with GitHub Support if issues persist

### Still Having Issues?

1. **Try VS Code**: Sometimes the IntelliJ plugin lags behind VS Code in features
2. **GitHub Support**: Contact [GitHub Support](https://support.github.com/) with:
   - Your IntelliJ IDEA version
   - GitHub Copilot plugin version
   - Your GitHub username
   - Screenshots of the issue
3. **Community Forums**: Check [GitHub Community Discussions](https://github.com/orgs/community/discussions) for similar issues

## Recommended Model for This Project

For the Banking Management System project, we recommend:

- **For Code Generation**: GPT-4o (best balance of speed and quality)
- **For Complex Logic**: o1-preview (advanced reasoning for financial calculations)
- **For Documentation**: Claude 3.5 Sonnet (excellent explanations and documentation)
- **For Quick Completions**: GPT-4o-mini (fast and efficient)

## Verifying It's Working

Test your setup:

1. Open a Java file in the project
2. Start typing a comment like: `// Function to transfer money between accounts`
3. Press Enter and wait for Copilot suggestions
4. You should see code suggestions powered by your selected premium model
5. In Copilot Chat, ask: "What model are you using?"

## Additional Resources

- [Official GitHub Copilot Documentation](https://docs.github.com/en/copilot)
- [JetBrains GitHub Copilot Plugin](https://plugins.jetbrains.com/plugin/17718-github-copilot)
- [GitHub Copilot Features](https://github.com/features/copilot)
- [IntelliJ IDEA Documentation](https://www.jetbrains.com/help/idea/)

## Questions?

If you're still experiencing issues after following this guide, please:
1. Open an issue in this repository
2. Include your IntelliJ version, plugin version, and detailed error description
3. Attach screenshots if possible

---

**Last Updated**: March 15, 2026
