echo "Checking out from github"
git branch: 'main', url: 'https://github.com/qlfdaggett/MavenTest.git'
sh "mvn package"