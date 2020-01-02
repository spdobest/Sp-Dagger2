package spit.spdagger2.main.kotlinexample.ui.list

import spit.spdagger2.main.kotlinexample.models.DetailsViewModel
import spit.spdagger2.main.kotlinexample.models.Post
import spit.spdagger2.main.kotlinexample.ui.base.BaseContract

class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Post>)
        fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun loadDataAll()
        fun deleteItem(item: Post)
    }
}