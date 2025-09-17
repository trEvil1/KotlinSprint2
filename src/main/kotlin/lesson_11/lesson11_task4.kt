package org.example.lesson_11

class RecipeCategory(val recipes: MutableList<Recipe>, name: String, val image:String, ) {

}

class Recipe(val name:String, ingredients: MutableList<Ingredient>, val cookWay:String) {

}

class Ingredient(val name: String, val count: Int, val countType: String)

