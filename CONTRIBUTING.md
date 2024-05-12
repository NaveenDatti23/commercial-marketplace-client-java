Azure Commercial Marketplace SaaS Client SDK for Java Contributing Guide
-------------------------------------

Thank you for your interest in contributing to Azure Commercial Marketplace SaaS Client SDK for Java.

- For reporting bugs, requesting features, or asking for support, please file an issue in the [issues](https://github.com/Azure/commercial-marketplace-saas-sdk-client-java/issues) section of the project.

- To make code changes, or contribute something new, please follow the [GitHub Forks / Pull requests model](https://help.github.com/articles/fork-a-repo/): Fork the repo, make the change and propose it back by submitting a pull request.

- Refer to the [wiki](https://github.com/Azure/azure-sdk-for-java/wiki/Building#testing-for-spotbugs-and-checkstyle-issues) to learn about how Azure SDK for java generates CheckStyle, SpotBugs, Jacoco, and JavaDoc reports.

- There is one Maven project in the repo. 

Pull Requests
-------------

* **DO** submit all code changes via pull requests (PRs) rather than through a direct commit. PRs will be reviewed and potentially merged by the repo maintainers after a peer review that includes at least one maintainer.
* **DO NOT** submit "work in progress" PRs.  A PR should only be submitted when it is considered ready for review and subsequent merging by the contributor.
* **DO** give PRs short-but-descriptive names (e.g. "Improve code coverage by 10%", not "Fix #1234")
* **DO** refer to any relevant issues, and include [keywords](https://help.github.com/articles/closing-issues-via-commit-messages/) that automatically close issues when the PR is merged.
* **DO** tag any users that should know about and/or review the change.
* **DO** ensure each commit successfully builds.  The entire PR must pass all tests in the Continuous Integration (CI) system before it'll be merged.
* **DO** address PR feedback in an additional commit(s) rather than amending the existing commits, and only rebase/squash them when necessary.  This makes it easier for reviewers to track changes.
* **DO** assume that ["Squash and Merge"](https://github.com/blog/2141-squash-your-commits) will be used to merge your commit unless you request otherwise in the PR.
* **DO NOT** fix merge conflicts using a merge commit. Prefer `git rebase`.
* **DO NOT** mix independent, unrelated changes in one PR. Separate real product/test code changes from larger code formatting/dead code removal changes. Separate unrelated fixes into separate PRs, especially if they are in different assemblies.

Merging Pull Requests (for project contributors with write access)
----------------------------------------------------------

* **DO** use ["Squash and Merge"](https://github.com/blog/2141-squash-your-commits) by default for individual contributions unless requested by the PR author.
  Do so, even if the PR contains only one commit. It creates a simpler history than "Create a Merge Commit".
  Reasons that PR authors may request "Merge and Commit" may include (but are not limited to):

  - The change is easier to understand as a series of focused commits. Each commit in the series must be buildable so as not to break `git bisect`.
  - Contributor is using an e-mail address other than the primary GitHub address and wants that preserved in the history. Contributor must be willing to squash
    the commits manually before acceptance.

## Developer Guide

### Pre-requisites

Local Development:

- Install Java Development Kit 11
  - add `JAVA_HOME` to environment variables
- Install [Maven](http://maven.apache.org/download.cgi)
  - add `MAVEN_HOME` to environment variables

>**Note:** If you ran into "long path" issue on `Windows`, enable paths longer than 260 characters by: <br><br>
1.- Run this as Administrator on a command prompt:<br> 
`REG ADD HKLM\SYSTEM\CurrentControlSet\Control\FileSystem /v LongPathsEnabled /t REG_DWORD /d 1`<br>*(might need to type `yes` to override key if it already exists)*<br><br>
2.- Set up `git` by running:<br> `git config --system core.longpaths true`

Visual Studio Code:

If you would prefer to run the project in a container through Visual Studio code, you can follow the walkthrough [here](https://code.visualstudio.com/docs/remote/containers-tutorial) through the ["Install the extension"](https://code.visualstudio.com/docs/remote/containers-tutorial#_install-the-extension) step.

Then to finish the creation of the Java container: 
1. Click the green "Open a Remote Window" button in the bottom left hand corner of Visual Studio Code.
1. Select "Add Development Container Configuration Files..."
1. Select the "Java" container definition.
1. Select "11-bullseye (default)" as the Java version.
1. Select "None" for Node.js version.
1. Select "Install Maven" and select "OK".
1. Select as many of the additional features to install as desired, and select "OK".
1. Click the green "Open a Remote Window" button again, and select "Reopen in Container". 

Install extensions:

1. Lombok Annotations Support for VS Code
1. Test Runner for Java
1. Debugger for Java

### Building and Testing

This repository uses Maven to build the module that makes up the Azure Commercial Marketplace SaaS Client SDK for Java. Tests require the following values to be set as environment variables:

* AAD_TENANT_ID: Tenant ID used for your AAD.
* AAD_APP_CLIENT_ID: Client ID for your App Registration
* AAD_APP_CLIENT_SECRET: Client Secret for the App Registration
* AAD_APP_CERT: A base64-encoded version of a certificate which also contains a private key. This certificate is used to authenticate the AAD_APP_CLIENT_ID. You can do the conversion in a bash shell with the command line with "base64 &lt;certificate.pfx&gt; -w 0". Websites also exist, such as *[Base64.Guru](https://base64.guru/converter/encode/file).
* AAD_APP_CERT_SECRET: Password for the certificate.

You can build by running the following command from the sdk directory in the repository:

```
mvn -Dgpg.skip clean install
```

This will build, test and install all of the modules into your local Maven cache. Optionally, you
can also skip unit test execution by issuing the following command. This can be useful when you
just want to try out a quick change without having to worry about unit tests.

```
mvn -Dgpg.skip -DskipTests clean install
```


>**Note**: Refer to [wiki](https://github.com/Azure/azure-sdk-for-java/wiki/Building) for learning about how to build using Java 11 
>and [this wiki](https://github.com/Azure/azure-sdk-for-java/wiki/Unit-Testing) for guidelines on unit testing

### Live testing

Live tests assume a live resource exists. The Azure Marketplace team has this value set to their partner center account. You may point your local environment to your own Partner Center account as needed.

### Debugging in Visual Studio Code

1. For the debugger to recognize the variables when running, add your environment variables to Visual Studio Code's settings.json.

```json
"java.test.config":{
    "env": {
        "AAD_TENANT_ID": "",
        "AAD_APP_CLIENT_ID": "",
        "AAD_APP_CLIENT_SECRET": "",
        "AAD_APP_CERT": "",
        "AAD_APP_CERT_SECRET": ""
    }
}
```

## Versions and versioning

When updating the version of the library, make sure to make changes to [pom.xml](pom.xml) and to the documentation [start page](README.md).

### What does the process look like?

Let's say we've GA'd and I need to tick up the version of the library; how would I do it? Guidelines for incrementing versions after release can be found [here](https://github.com/Azure/azure-sdk/blob/master/docs/policies/releases.md#incrementing-after-release).

1. I'd open up sdk/pom.xml and update the `<version>` element. 
2. I'd open up sdk/README.md and update the line which reads: `- API version: x.y.z`
3. Review and submit a PR with the modified files.
