package com.n_droidev.behavioral.template.template.base

import com.n_droidev.behavioral.template.adapter.Admin2UserAdapter
import com.n_droidev.behavioral.template.model.Admin
import com.n_droidev.behavioral.template.model.User

abstract class AbstractParser(var data:String) {
	protected abstract fun parseData():List<Admin>
	
	private fun convertData(list:List<Admin>):List<User>{
		val userList= arrayListOf<User>()
		for(admin in list){
			userList.add(Admin2UserAdapter(admin))
		}
		return userList
	}
	
	fun getAdminsAsUsers():List<User>{
		return convertData(parseData())
	}
}