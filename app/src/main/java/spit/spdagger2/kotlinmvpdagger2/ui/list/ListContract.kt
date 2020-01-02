package spit.spdagger2.kotlinmvpdagger2.ui.list

import spit.spdagger2.kotlinmvpdagger2.models.DetailsViewModel
import spit.spdagger2.kotlinmvpdagger2.models.Post
import spit.spdagger2.kotlinmvpdagger2.ui.base.BaseContract

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