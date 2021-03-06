package com.example.leadershipboard.Activity
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

object Apollo_Helper {
    private val BASE_URL = "https://leadership-board.herokuapp.com/graphql"
    //apollo-codegen download-schema https://leadership-board.herokuapp.com/ --output schema.json
    private var apolloClient: com.apollographql.apollo.ApolloClient
    init {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder().build()
        apolloClient = com.apollographql.apollo.ApolloClient.builder().serverUrl(BASE_URL).okHttpClient(okHttpClient).build()
    }
    fun getApolloClient(): com.apollographql.apollo.ApolloClient {
        return apolloClient
    }
}