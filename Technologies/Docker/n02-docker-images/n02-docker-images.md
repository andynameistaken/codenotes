---
tags:
  - docker
---

# Docker Files

Dockerfiles are text files that contain a series of instructions that are used
to build a Docker image. The Dockerfile is used to create a Docker image that
can be used to create a Docker container. 

File naming convention is `Dockerfile` with no file extension.

## Syntax

- **FROM**: Initializes a new build stage and sets the Base Image for
  subsequent instructions. 
- **LABEL**: Adds metadata to an image.
- **COPY**: Copies local files or directories from the host system to the image.
-  **ADD**: Copies files, directories, or remote file URLs from the host system
   to the image. It can automatically unpack compressed files (gzip, bzip2, and
   tar) into the destination directory within the Docker image.
- **EXPOSE**: Informs Docker that the container listens on the specified network
  ports at runtime.
- **RUN**: Executes a command in a new layer on top of the current image and
  commits the results. This instruction can be used to install software packages.
- **CMD**: provides defaults for an executing container. There can only be one
  CMD instruction in a Dockerfile. If you list more than one CMD then only the
  last CMD will take effect. This instruction sets the default command to run
  when the container starts up. It can be overridden with command line
  arguments when starting the container. 

##  Example Dockerfile:
```dockerfile
# Use the official image as a base: latest version of nginx
FROM nginx:latest

# Label the image with the maintainer's name
LABEL maintainer="adrian@cantrill.io" 

# Copy the contents of the local directory to the image
COPY 2048 /usr/share/nginx/html

# Expose port 80 to the outside world
EXPOSE 80

# Run command: nginx -g daemon off; (run nginx in the foreground)
CMD ["nginx", "-g", "daemon off;"]
```

## Running the Dockerfile
To build the Docker image [copy example from
repository](https://github.com/acantril/docker-fundamentals) and run the
following command:
```bash
# -t flag tags the image with a name
# dot at the end specifies the build context as the current directory
docker build -t dockerized-2048 .
```
=== "Before buiding the image"
    ![Alt text](Notes/docs/Technologies/Docker/assets/image-11.png)
=== "After building the image"
    ![Alt text](Notes/docs/Technologies/Docker/assets/image-12.png)

## Running the Docker Image
=== "Terminal"
    To run the Docker image, use the following command:
    ```bash
    docker run -d -p 8081:80 dockerized-2048
    ```
=== "Browser"
    Open a browser and navigate to `http://localhost:8081` to see the
    running application.
    ![Alt text](Notes/docs/Technologies/Docker/assets/image-13.png)

--- 

Sources:

- <https://github.com/acantril/docker-fundamentals/blob/main/build-a-simple-containerized-application/build-a-simple-containerized-application.md> 