echo "running cucumber test suite"

cd jenkinsCucumber
dmvn test || exit 1
cd ..
