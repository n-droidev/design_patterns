package com.n_droidev.behavioral.visitor.visitor

import android.os.Handler
import android.os.Looper
import com.n_droidev.behavioral.visitor.acceptor.base.IMachine
import com.n_droidev.behavioral.visitor.visitor.base.IVisitor

class MeatVisitor : IVisitor {
	override fun visit(machine: IMachine) {
		machine.grind(3)
		
		Handler(Looper.getMainLooper()).postDelayed({
			machine.stop()
			Handler(Looper.getMainLooper()).postDelayed({
				machine.reverse(2)
				Handler(Looper.getMainLooper()).postDelayed({
					machine.stop()
				}, 1000)
			}, 1000)
		}, 4000)
	}
}