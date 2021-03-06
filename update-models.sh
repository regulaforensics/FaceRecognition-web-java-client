#!/bin/sh

ENUM_MAPPINGS="ImageSource=Integer,FaceSDKResultCode=Integer,LivenessStatus=Integer" \
\
&& docker run --user "$(id -u):$(id -g)" --rm -v "${PWD}:/client" -v "${PWD}/../FaceSDK-web-openapi:/definitions" \
openapitools/openapi-generator-cli:v5.0.1 generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
\
&& docker run --user "$(id -u):$(id -g)" --rm -v "${PWD}:/client" -v "${PWD}/../FaceSDK-web-openapi:/definitions" \
openapitools/openapi-generator-cli:v5.0.1 generate \
-i /definitions/index.yml -g java -o /client/client \
-c /client/java-generator-config.json -t /client/client/generator-templates/ \
--import-mappings $ENUM_MAPPINGS || exit 1

./gradlew -p ./ goJF || exit 0
