
I forked this from https://svn.jenkins-ci.org/trunk/hudson/plugins/campfire/ at snapshot 2.2. I hacked it to follow up campfire notify with a paste message containing some summary information about the build.   Whether to include the build summary paste and the regex expressions to determine what gets included in the summary are configurable on a per project basis

###  Building

# You will need to install Maven and a JDK. and then:
mvn install

###  Installing

scp target/campfire.hpi kitchen:/data/jenkins-ci/plugins

... or you can use the campfire.hpi file in the downloads section of this project.  We use a chef recipe to get https://github.com/downloads/pathable/jenkins-campfire-plugin/campfire.hpi and put it into the jenkins plugin directory.


