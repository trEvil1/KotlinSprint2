package org.example.lesson_22

fun main() {
    val mainScreenState = MainScreenState("1234")
    val mainScreenViewModel = MainScreenViewModel(mainScreenState)
    mainScreenViewModel.loadData()
}

class MainScreenViewModel(val mainScreen: MainScreenState) {
    private var newMainScreen:MainScreenState = MainScreenState("")
    fun loadData() {
        val viewModel = ViewModel()
        newMainScreen.data = viewModel.mainScreenState.data
        newMainScreen = mainScreen.copy(isLoading = true)
        newMainScreen.data = "qwet"
        println(newMainScreen)
    }
}

class ViewModel(val mainScreenState: MainScreenState = MainScreenState(null))

data class MainScreenState(var data: String?, var isLoading: Boolean = false)