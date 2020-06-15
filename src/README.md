script to download schema from graphCMS (public facing API):
```
./gradlew downloadApolloSchema -Pcom.apollographql.apollo.endpoint=https://api-us-west-2.graphcms.com/v2/ckarr49y51bc501zd7o6uh7ce/master -Pcom.apollographql.apollo.schema=src/main/graphql/com/booking/schema.json
```

script to generate ApolloSources (queries, mutation, apollo calls, etc):
```
./gradlew generateApolloSources    
```

- Need to combine the two gradle wrapper calls in the `gradle build` script