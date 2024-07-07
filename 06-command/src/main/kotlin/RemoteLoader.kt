package org.hf_design_patterns.command

fun main() {
    val remoteControl = RemoteControlWithUndo()
    val livingRoomLight = Light("Living Room")
    val kitchenLight = Light("Kitchen")
    val ceilingFan = CeilingFan("Living Room")
    val garageDoor = GarageDoor("Garage")
    val stereo = Stereo("Living Room")

    val partyOn = listOf(LightOnCommand(livingRoomLight), LightOnCommand(kitchenLight), CeilingFanHighCommand(ceilingFan), StereoOnWithCDCommand(stereo))
    val partyOff = listOf(LightOffCommand(livingRoomLight), LightOffCommand(kitchenLight), CeilingFanOffCommand(ceilingFan), StereoOffCommand(stereo))

    remoteControl.setCommand(0, LightOnCommand(livingRoomLight), LightOffCommand(livingRoomLight))
    remoteControl.setCommand(1, LightOnCommand(kitchenLight), LightOffCommand(kitchenLight))
    remoteControl.setCommand(3, GarageDoorUpCommand(garageDoor), GarageDoorDownCommand(garageDoor))
    remoteControl.setCommand(4, StereoOnWithCDCommand(stereo), StereoOffCommand(stereo))

    remoteControl.setCommand(2, CeilingFanMediumCommand(ceilingFan), CeilingFanOffCommand(ceilingFan))
    remoteControl.setCommand(5, CeilingFanHighCommand(ceilingFan), CeilingFanOffCommand(ceilingFan))

    remoteControl.setCommand(6, MacroCommand(partyOn), MacroCommand(partyOff))

    println(remoteControl)

    remoteControl.onButtonWasPushed(6)

    println(remoteControl)
}