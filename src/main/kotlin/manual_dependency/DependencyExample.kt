package manual_dependency





fun main() {

    val processor = Processor()
    val amdProcessor=AmdProcessor()
    val intelProcessor = IntelProcessor()


    val computer = Computer(intelProcessor)

    computer.execute()

}

