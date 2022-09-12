package com.n_droidev.behavioral.visitor.visitor.base

import com.n_droidev.behavioral.visitor.acceptor.base.IMachine

interface IVisitor {
	fun visit(machine: IMachine)
}