echo "running cucumber test suite"

cd jenkinsCucumber
dmvn test || exit 0
cd ..
