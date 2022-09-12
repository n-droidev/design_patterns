package com.n_droidev.structural.adapter

import com.n_droidev.structural.adapter.model.shape.Circle
import com.n_droidev.structural.adapter.model.shape.Rectangle


class CircleToRectangleAdapter(var circle: Circle) : Rectangle(circle.x, circle.y, circle.color, (circle.radius * 2).toInt(), (circle.radius * 2).toInt())