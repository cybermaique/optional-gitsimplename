FROM airhacks/glassfish
COPY ./target/Optional.war ${DEPLOYMENT_DIR}
