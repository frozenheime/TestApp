package by.fro.testapp.network

import by.fro.testapp.dummy.DummyContent
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface Api {

    @GET("todos")
    fun getTodoList(): Observable<List<DummyContent.TodoItem>>
}