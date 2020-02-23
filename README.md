# Centralized-mutual-exclusion-with-sockets-in-Java
This project can run 3 different clients which can be handled by a server.
To run the project, first the server is to be run and then each of the clients(same instance of Client1 to be run thrice).
Each client is connected with Client using socket and it sends its username to the server.
Each client can calculate different sequence of numbers using a four operation calculator and the results are produced in the client.
The server polls the clients and all the sequences are received by the server and the total of all the clients are calculated.
This value is sent to each of the clients.
Additionally, client can also log out from the connection with the server and thus the server closes this socket.
This project runs from the console and GUI.
