package com.example.data.datasource

import com.example.data.model.TestModelReponse

class TestDataSource {

    fun getTestModelResponse() : TestModelReponse {
        return TestModelReponse("response")
    }
}