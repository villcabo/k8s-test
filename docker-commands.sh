


# Build maven project
mvn clean -U package -Dmaven.skip.test

docker login registry.gitlab.com

# Build
docker build -t registry.gitlab.com/villcabo/polyglot-work/apppay .
docker build -t registry.gitlab.com/villcabo/polyglot-work/appsecurity .
docker build -t registry.gitlab.com/villcabo/polyglot-work/appinvoice .
docker build -t registry.gitlab.com/villcabo/polyglot-work/apptransaction .

# Push
docker push registry.gitlab.com/villcabo/polyglot-work/apppay
docker push registry.gitlab.com/villcabo/polyglot-work/appsecurity
docker push registry.gitlab.com/villcabo/polyglot-work/appinvoice
docker push registry.gitlab.com/villcabo/polyglot-work/apptransaction