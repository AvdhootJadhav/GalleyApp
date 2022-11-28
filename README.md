# PhotosUp

This is a simple gallery website wherein people can add images, delete and view them. The backend of the website is build using Spring Boot and frontend is build using Thymeleaf template. For storing the images MongoDB database is used.

# Steps (Github)
1. Fork the project from PhotosUp repo 
``` bash
https://github.com/AvdhootJadhav/GalleyApp
```
2. Add your mongo-uri in application.properties file in src/java/resource
3. Now just run the project

# Steps (Docker)
1. Pull the image for the project from the dockerhub using following command
```bash
docker pull avdhootj/photosup:0.0.1
```
2. Once the image is downloaded run the image using following command
```bash
docker run -p 8080:8080 avdhootj/photosup:0.0.1
```
3. After running the image just open your browser and type the url to view the project
```bash
http://localhost:8080
```
PS: The application was hosted on Heroku but due to the shut down of free tier I can't host it anymore.

# Screenhots of the project

<img src="https://github.com/AvdhootJadhav/GalleyApp/blob/master/src/main/resources/static/images/photosup-1.png">
<br>
<img src="https://github.com/AvdhootJadhav/GalleyApp/blob/master/src/main/resources/static/images/photosup-2.png">
<br>
<img src="https://github.com/AvdhootJadhav/GalleyApp/blob/master/src/main/resources/static/images/photosup-3.png">
<br>
<img src="https://github.com/AvdhootJadhav/GalleyApp/blob/master/src/main/resources/static/images/photosup-4.png">
<br>
<img src="https://github.com/AvdhootJadhav/GalleyApp/blob/master/src/main/resources/static/images/photosup-5.png">
