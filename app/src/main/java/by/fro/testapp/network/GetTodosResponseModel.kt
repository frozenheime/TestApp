package by.fro.testapp.network


class GetTodosResponseModel : ArrayList<GetTodosResponseModel.GetTodosResponseModelItem>(){
    data class GetTodosResponseModelItem(
        var completed: Boolean?,
        var id: Int?,
        var title: String?,
        var userId: Int?
    )
}