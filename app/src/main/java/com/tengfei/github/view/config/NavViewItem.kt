package com.tengfei.github.view.config

import android.support.annotation.DrawableRes
import android.support.v4.app.Fragment
import com.tengfei.github.R
import com.tengfei.github.view.fragments.AboutFragment
import com.tengfei.github.view.fragments.RepositoryFragment
import com.tengfei.github.view.fragments.RepositoryListFragment

/**
 * @author tengfei
 * date 2019-08-22 15:09
 * email tengfeigo@outlook.com
 * description
 */

class NavViewItem(val title: String, @DrawableRes val drawableId: Int, val fragmentClass: Class<out Fragment>) {

    companion object {
        private val fragmentItems = mapOf(
                R.id.repository to NavViewItem("repository", R.drawable.ic_repository, RepositoryFragment::class.java),
                R.id.people to NavViewItem("people", R.drawable.ic_people, RepositoryListFragment::class.java),
                R.id.issue to NavViewItem("issue", R.drawable.ic_issue, RepositoryListFragment::class.java),
                R.id.about to NavViewItem("about", R.drawable.ic_about_us, AboutFragment::class.java)
        )

        fun getItem(id: Int): NavViewItem {
            return fragmentItems[id] ?: (fragmentItems[R.id.repository] ?: error(""))
        }
    }


}