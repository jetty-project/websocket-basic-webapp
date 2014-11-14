
Example of using WebSocket on Jetty.

This project uses maven.
This checkout is a valid ${jetty.base} directory too.

To build:

  $ mvn clean install

  This should have created a webapps/wsecho.war file for you

To run in jetty distribution:

  $ java -jar /path/to/jetty-distribution-9.2.5.v20141112/start.jar

To test:

  1) Open http://www.websocket.org/echo.html in your websocket capable web browser
  2) Find out your machine's IP address (localhost will not work due to browser restrictions)
  3) Pop in your URL into web forms "Location:" field.

     Example: ws://192.168.1.139:8080/wsecho/echo

  4) Click "Connect" button
  5) Start sending messages


