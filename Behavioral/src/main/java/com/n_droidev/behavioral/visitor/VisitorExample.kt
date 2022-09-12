package com.n_droidev.behavioral.visitor

import android.os.Handler
import android.os.Looper
import com.n_droidev.behavioral.visitor.acceptor.GrinderMachine
import com.n_droidev.behavioral.visitor.visitor.MeatVisitor
import com.n_droidev.behavioral.visitor.visitor.VegetableVisitor

class VisitorExample {
	fun runExample(){
		val grinder=GrinderMachine()
		val meat=MeatVisitor()
		val vegetable=VegetableVisitor()
		
		meat.visit(grinder)
		
		Handler(Looper.getMainLooper()).postDelayed({
			vegetable.visit(grinder)
		}, 10000)
	}
}