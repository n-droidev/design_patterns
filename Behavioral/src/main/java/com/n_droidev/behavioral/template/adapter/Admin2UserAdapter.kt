package com.n_droidev.behavioral.template.adapter

import com.n_droidev.behavioral.template.model.Admin
import com.n_droidev.behavioral.template.model.User

class Admin2UserAdapter(admin: Admin): User(admin.name,admin.age,admin.gender)