package model;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    private List<String> ingredients;
    private String name;
    private String description;
    private String recipe;

    public Dish(String name) {
        this.name = name;
        ingredients = new ArrayList<String>();
        description = "";
        recipe = "";
    }

    public Dish(String name, String description, List<String> ingredients, String recipe) {
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.recipe = recipe;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
