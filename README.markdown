
I forked this from https://svn.jenkins-ci.org/trunk/hudson/plugins/campfire/ at snapshot 2.2. I hacked it to follow up campfire notify with a paste message containing some summary information about the build.  It's hardcoded and ugly (see, CampfireNotifier:54) but could be improved with a config screen where you git a regex to match on.

###  Building

# You will need to install Maven and a JDK. and then:
mvn install

###  Installing

scp target/campfire.hpi kitchen:/data/jenkins-ci/plugins


