package manual_dependency

class Computer(private val processor: Processor) {
    fun execute(){
        processor.run()
    }
}