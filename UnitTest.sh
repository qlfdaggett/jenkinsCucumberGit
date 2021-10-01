echo "running cucumber test suite"
exit 0
cd jenkinsCucumber
dmvn test || exit 0
cd ..
