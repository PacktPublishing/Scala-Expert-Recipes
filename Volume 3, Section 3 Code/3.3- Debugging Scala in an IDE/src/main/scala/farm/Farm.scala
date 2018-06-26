package farm

class Farm(name: String, tasker: FarmTasker) {
	def runForDays(maxAge: Int, days: Int): Seq[FarmTask] = {
		for {
			day <- 1 to days
			task <- tasker.tasksForTheDay(maxAge)
		} yield {
			task
		}
	}
}

class FarmTasker(animals: Seq[Animal]) {
	def tasksForTheDay(maxAge: Int): Seq[FarmTask] = {
		animals.flatMap {
			case animal @ Animal(_, age, Cow) if age < maxAge =>
				Seq(FarmTask(animal, "milking", age))

			case animal @ Animal(_, age, Chicken) if age < maxAge =>
				Seq(FarmTask(animal, "checking for eggs", age))

			case animal @ Animal(_, age, Horse) if age < maxAge =>
				Seq(FarmTask(animal, "plowing", age))

			case animal @ Animal(_, _, Wolf) =>
				throw new Exception("Wolves are attacking the farm!")

			case _ =>
				Seq()
		}
	}
}