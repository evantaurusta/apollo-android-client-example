package com.example.BookingConsumer.query

import com.apollographql.apollo.ApolloCall
import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.api.Response
import com.apollographql.apollo.exception.ApolloException
import com.booking.BookingQuery
import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class SampleQuery : Query {
    @GraphQLDescription("this is sample query.")
    fun getName(name: String): String {
        val apolloClient = ApolloClient.builder()
                .serverUrl("https://api-us-west-2.graphcms.com/v2/ckarr49y51bc501zd7o6uh7ce/master")
                .build()


        val response = apolloClient.query(BookingQuery())
                .enqueue(object : ApolloCall.Callback<BookingQuery.Data>() {
                    override fun onFailure(e: ApolloException) {
                        println(e.message)
                    }

                    override fun onResponse(response: Response<BookingQuery.Data>) {
                        response.data?.bookings?.forEach { println(it.bookingStatus) }
                    }
                })
        return "string"
    }
}