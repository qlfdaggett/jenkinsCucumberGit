echo "Checking out from github"
git branch 'main', url: 'https://github.com/qlfdaggett/MavenTest.git'
//sh "export MAVEN_HOME=/usr/local/apache-maven"
//sh "export PATH=$PATH:$MAVEN_HOME/bin"
//sh "mvn --version"
mvn package
