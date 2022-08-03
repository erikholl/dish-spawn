package io.eho.dishspawn;

import io.eho.dishspawn.model.Ingredient;
import io.eho.dishspawn.model.Recipe;
import io.eho.dishspawn.repository.IngredientRepository;
import io.eho.dishspawn.repository.RecipeIngredientRepository;
import io.eho.dishspawn.repository.RecipeRepository;
import io.eho.dishspawn.util.IngredientCategory;
import io.eho.dishspawn.util.IngredientForm;
import io.eho.dishspawn.util.IngredientPrepType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DishSpawnApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DishSpawnApplication.class, args);
	}

	@Autowired
	private RecipeRepository recipeRepository;

	@Autowired
	private IngredientRepository ingredientRepository;

	@Autowired
	private RecipeIngredientRepository recipeIngredientRepository;

	@Override
	public void run(String... args) throws Exception {
		Ingredient egg = new Ingredient("egg", IngredientCategory.EGGS);
		Ingredient mayonaise = new Ingredient("mayonaise",
											  IngredientCategory.CONDIMENT);
		Ingredient chives = new Ingredient("chives", IngredientCategory.HERBS);
		Ingredient curry = new Ingredient("curry", IngredientCategory.SPICES);
		Ingredient mustard = new Ingredient("mustard", IngredientCategory.ADDITIVE);
		Ingredient persil = new Ingredient("persil", IngredientCategory.HERBS);

		ingredientRepository.save(egg);
		ingredientRepository.save(mayonaise);
		ingredientRepository.save(chives);
		ingredientRepository.save(curry);
		ingredientRepository.save(mustard);
		ingredientRepository.save(persil);

		Recipe eggSalad = new Recipe("Egg salad", "Boil the eggs, mash them " +
				"in " +
				"a bowl, add mustard, mayonaise, chives and curry, season to " +
				"taste, garnish with persil, eat");

		eggSalad.addRecipeIngredient(egg, IngredientForm.EGG_LIKE,
									 IngredientPrepType.BOIL, "#FFEFAE");
		eggSalad.addRecipeIngredient(mayonaise, IngredientForm.BLOBS,
									 IngredientPrepType.MIX, "#EEE15F");
		eggSalad.addRecipeIngredient(chives, IngredientForm.CONFETTI,
									 IngredientPrepType.MIX, "#8A915D");
		eggSalad.addRecipeIngredient(curry, IngredientForm.POWDER,
									 IngredientPrepType.MIX, "#E17B09");

		eggSalad.addRecipeIngredient(mustard, IngredientForm.BLOBS,
									 IngredientPrepType.MIX, "#928222");
		eggSalad.addRecipeIngredient(persil, IngredientForm.LEAVES,
									 IngredientPrepType.GARNISH, "#1B6F1B");

		recipeRepository.save(eggSalad);
	}
}
