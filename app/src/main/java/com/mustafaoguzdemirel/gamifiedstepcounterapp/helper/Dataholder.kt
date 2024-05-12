package com.mustafaoguzdemirel.gamifiedstepcounterapp.helper

import com.mustafaoguzdemirel.gamifiedstepcounterapp.model.post.PostModel
import com.mustafaoguzdemirel.gamifiedstepcounterapp.model.user.UserModel

class Dataholder {
    private object InstanceHolder {
        var instance = Dataholder()
    }

    var currentUserModel: UserModel? = null
    var selectedPost: PostModel? = null

    companion object {
        val instance: Dataholder
            get() = InstanceHolder.instance
    }
}
