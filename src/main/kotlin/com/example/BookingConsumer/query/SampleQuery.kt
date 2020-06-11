package com.example.BookingConsumer.query

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class SampleQuery : Query {
    @GraphQLDescription("this is sample query.")
    fun getName(name: String): String {
        return "hello my name is $name."
    }
}