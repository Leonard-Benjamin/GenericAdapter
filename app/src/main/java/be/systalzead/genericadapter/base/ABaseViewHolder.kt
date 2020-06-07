package be.systalzead.genericadapter.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

open class ABaseViewHolder<T> (view: View) : RecyclerView.ViewHolder(view) {

    open fun bindView(item: T) {

    }

}