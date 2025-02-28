package com.example.data.model

import com.example.domain.model.TestModel

class TestModelReponse(val name: String?)

fun TestModelReponse.toDomainModel() : TestModel? {
    if(name != null ) {
        return TestModel(name)
    }
    return null

}