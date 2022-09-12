package com.n_droidev.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.n_droidev.ui.databinding.ActivityRunnableCodeExampleBinding

class RunnableCodeExampleActivity : AppCompatActivity() {
	private var _binding: ActivityRunnableCodeExampleBinding? = null
	private val binding get() = _binding!!
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		_binding = ActivityRunnableCodeExampleBinding.inflate(layoutInflater)
		setContentView(binding.root)
//		/////////////////////////////////////// Creational
//		// Abstract Factory
//		val motorcycle = AbstractVehicleFactory.getFactory(AbstractVehicleFactory.Brand.Honda).makeMotorcycle()
//		motorcycle.run()
//		motorcycle.go(50)
//
//
//		// Builder
//		val cake = Cake.CakeBuilder()
//			.setFlavour(Cake.Flavour.STRAWBERRY)
//			.setShape(Cake.Shape.HEART)
//			.setTopping(Cake.Topping.Cocos)
//			.build()
//		println(cake)
//
//
//		// Factory
//		println(PhoneFactory.makePhone(PhoneFactory.PhoneModel.SAMSUNG).getModelName())
//
//
//		// Object pool
//		(DownloadThreadPool.take() as FileDownloadThread).startThread()
//		Handler(mainLooper).postDelayed({
//			(DownloadThreadPool.take() as FileDownloadThread).startThread()
//		}, 6000)
//
//
//		// Singleton
//		Retrofit.getInstance().makeApiRequest()
//		com.abb.creational.singleton.kotlin_style.Retrofit.makeApiRequest()
//
//
//		// Prototype
//		PrototypeFactory.getPrototype("Rectangle").draw()
//
//
//		///////////////////////////////////////// Structural
//		// Adapter
//		val circle = Circle(4, 5, Color.RED, 54.5)
//		val rect: Rectangle = CircleToRectangleAdapter(circle)
//		Toast.makeText(this, "width: ${rect.width},    height: ${rect.height}", Toast.LENGTH_LONG).show()
//
//
//		// Bridge
//		var switcher = BridgeExample().turnOnRedStripLight(this)
//
//
//		//Composite
//		Toast.makeText(
//			this,
//			"${CompositeTester.getOrderCreator().getCount()} mal için fiyat: ${CompositeTester.getOrderCreator().getPrice()}",
//			Toast.LENGTH_LONG
//		).show()
//
//
//		//Decorator
//		val iceCream = DecoratorExample.getDecoratedIceCream()
//		Toast.makeText(
//			this,
//			"Base: ${iceCream.getBase()}   Top Flavour: ${iceCream.getTopFlavor()}    " +
//					"Top Color: ${iceCream.getTopColor()}   Topping: ${iceCream.getTopping()}",
//			Toast.LENGTH_LONG
//		).show()
//
//
//		//Facade
//		VideoRecorderFacade(this).recordeVideo()
//
//
//		//FlyWeight
//		FlyWeightExample().createUserList()
//
//
//		//Proxy
//		NameListScreen().showNameListToUser()
//
//
//		////////////////////////////////////// Behavioral
//		//Chain of Responsibility
//		ChainExample().getLevelChain(2)
//
//
//		//Memento
//		MementoExample(this).runExample()
//
//
//		//Strategy
//		val strategyContext = SortingStrategyContext(this)
//		strategyContext.strategy = ZtoAStrategy()
//		strategyContext.sort(listOf("Android", "Development", "Design", "Patterns", "33", "21"))
//
//
//		//Iterator
//		IteratorExample(this).runExample()
//
//
//		//Command
//		CommandExample().runExample()
//
//
//		//Mediator
//		MediatorExample.runExample()
//
//
//		//Observer
//		ObserverExample.runExample()
//
//
//		//State
//		StateExample.runExample()
//
//
//		//Template
//		TemplateExample().runExample()
//
//
//		//Visitor
//		VisitorExample().runExample()
		
	}
}