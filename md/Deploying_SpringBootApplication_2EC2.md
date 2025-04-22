# Steps to Deployee Spring Boot Application to AWS EC2 Server
1. Create **DockerFile** At project level (pom.xml level)
   [Dockerfile](../Dockerfile)
2. Create repository at Docker Hub.
   
       vishal637yadav/springboot-api-reskilling
3. Build the Projct on Local :

       mvn clean package
4. Build Docker Image on Local Using the Below Docker Command

       docker build --platform linux/amd64 -t vishal637yadav/springboot-api-reskilling:tag-version-1.7 .
5. Push the image to Docker Hub Repository.
   
       docker push vishal637yadav/springboot-api-reskilling:tag-version-1.7
6. Connect to EC2 server

       docker run -p 9090:8080 -d vishal637yadav/springboot-api-reskilling:tag-version-1.7 
7. On EC2 server -Security-Group -> inbound
   Allow All Traffic.
8. Now update the localhost with public ipv4 of ec2 instance and hit the rest api url. 
