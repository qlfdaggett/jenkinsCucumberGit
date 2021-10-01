echo "running cucumber test suite"

cd jenkinsCucumber
mvn test || exit 1
cd ..
