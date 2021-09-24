
Example of using WebSocket on Jetty with the Jetty WebSocket API.

This project uses maven.
This checkout is a valid ${jetty.base} directory too.

To build:

  $ mvn clean install

  This should have created a webapps/wsecho.war file for you

To run in jetty distribution:

  $ java -jar /path/to/jetty-home-9.4.x/start.jar

To test:

  1) Open http://www.localhost:8080 in your websocket capable web browser
  2) Click "Join" button
  3) Start sending messages

