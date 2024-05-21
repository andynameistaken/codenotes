---
tags:
  - docker
---
# Docker Commands

- `docker ps`: list running Docker containers
![Alt text](assets/image.png)

-  `docker ps -a`: list all Docker containers
![Alt text](assets/image-1.png)

- `docker images`: list downloaded Docker images on Docker Host
![Alt text](assets/image-2.png)

- `docker run`: run a Docker container if present locally, otherwise download
  it from Docker Hub
![Alt text](assets/image-3.png)

- `docker run -p <host_port>:<container_port> <image_name>`: run a Docker
      container and map a port from the host to the container 

- `docker run -dp <host_port>:<container_port> <image_name>`: run a Docker
      container in detached mode and map a port from the host to the container
![Alt text](assets/image-4.png)

- `docker stop <container_id>`: stop a running Docker container
![Alt text](assets/image-7.png)

- `docker pull`: download a Docker image from Docker Hub

- `docker rm <container_id>`: remove a Docker container
![Alt text](assets/image-8.png)

- `docker rmi <image_id>`: remove a Docker image
![Alt text](assets/image-9.png)

- `docker inspect <container_id>`: inspect a Docker image

- `docker port <container_id>`: list the ports mapped to a Docker container
![Alt text](assets/image-5.png)

- `docker exec -it <container_id> <command>`: execute a command in a running
![Alt text](assets/image-6.png)

