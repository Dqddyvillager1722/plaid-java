FROM maven:3.8.4-jdk-8

# Create app directory
WORKDIR /usr/src/app

# Copy app to directory
COPY . /usr/src/app

CMD ["mvn", "-Dmaven.javadoc.skip=true", "verify", "-e"]