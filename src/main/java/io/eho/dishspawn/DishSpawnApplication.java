package io.eho.dishspawn;

import io.eho.dishspawn.model.*;
import io.eho.dishspawn.model.util.visualproperties.IngredientCategory;
import io.eho.dishspawn.model.util.visualproperties.RecipeIngredientForm;
import io.eho.dishspawn.model.util.visualproperties.RecipeIngredientCookingMethod;
import io.eho.dishspawn.model.util.visualproperties.RecipeIngredientTexture;
import io.eho.dishspawn.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DishSpawnApplication /* implements CommandLineRunner */ {
	// AFTER INIT: remove 'implements CommandLineRunner'

//	public DishSpawnApplication() {}
	// AFTER INIT: remove constructor

	public static void main(String[] args) {
		SpringApplication.run(DishSpawnApplication.class, args);
	}

	/* INIT PROCEDURE - AFTER INIT - remove all below! */
//	@Autowired
//	private RecipeService recipeService;
//	@Autowired
//	private IngredientService ingredientService;
//	@Autowired
//	private RecipeIngredientService recipeIngredientService;
//	@Autowired
//	private LikeService likeService;
//	@Autowired
//	private VisualService visualService;
//	@Autowired
//	private ChefService chefService;
//
//	@Override
//	public void run(String... args) throws Exception {

		// INIT 1 create new Chef
//		Chef newChef = new Chef();
//		newChef.setUserName("alison");
//		newChef.setEmail("alisonroman@email.food");
//		newChef.setPassword("test123");
//		newChef.setFirstName("Alison");
//		newChef.setLastName("Roman");
//		newChef.setAvatarPath("/img/default-avatar.png");
//
////		System.out.println(newChef);
//		chefService.saveChef(newChef); // id 1

		// INIT 2 add ingredients to DB (should be back-end operation only)
//		Ingredient oliveOil = new Ingredient("olive oil",
//											 IngredientCategory.OILS);
//		Ingredient tomato = new Ingredient("tomatoes",
//											  IngredientCategory.VEGETABLES_MARROW);
//		Ingredient cherryTomato = new Ingredient("cherry tomatoes",
//											 IngredientCategory.VEGETABLES_MARROW);
//		Ingredient whiteOnion = new Ingredient("white onion",
//										  IngredientCategory.VEGETABLES_ALLIUM);
//		Ingredient redOnion = new Ingredient("red onion",
//										  IngredientCategory.VEGETABLES_ALLIUM);
//		Ingredient yellowOnion = new Ingredient("yellow onion",
//										  IngredientCategory.VEGETABLES_ALLIUM);
//		Ingredient salt = new Ingredient("salt",
//										 IngredientCategory.ADDITIVE);
//		Ingredient pepper = new Ingredient("black pepper",
//										   IngredientCategory.SPICES);
//		Ingredient pepperFlakes = new Ingredient("pepper flakes",
//												 IngredientCategory.SPICES);
//		Ingredient redVinegar = new Ingredient("red wine vinegar",
//											   IngredientCategory.CONDIMENT);
//		Ingredient whiteVinegar = new Ingredient("white wine vinegar",
//												 IngredientCategory.CONDIMENT);
//		Ingredient capers = new Ingredient("capers",
//										   IngredientCategory.FRUITS_BERRIES);
//		Ingredient anchovies = new Ingredient("anchovies",
//											  IngredientCategory.FISH);
//		Ingredient basil = new Ingredient("basil", IngredientCategory.HERBS);
//
//		ingredientService.saveIngredient(oliveOil);
//		ingredientService.saveIngredient(tomato);
//		ingredientService.saveIngredient(cherryTomato);
//		ingredientService.saveIngredient(whiteOnion);
//		ingredientService.saveIngredient(redOnion);
//		ingredientService.saveIngredient(yellowOnion);
//		ingredientService.saveIngredient(salt);
//		ingredientService.saveIngredient(pepper);
//		ingredientService.saveIngredient(pepperFlakes);
//		ingredientService.saveIngredient(redVinegar);
//		ingredientService.saveIngredient(whiteVinegar);
//		ingredientService.saveIngredient(capers);
//		ingredientService.saveIngredient(anchovies);
//		ingredientService.saveIngredient(basil);

//
//		// INIT 3 create new recipe
//		Chef chefDB = chefService.findChefById(18l);
//		Recipe tomatoSalad = new Recipe();
//		tomatoSalad.setName("Tomato Salad with Anchovies and Onion");
//		tomatoSalad.setChef(chefDB);
//		List<String> instructions = new ArrayList<>();
//		instructions.add("Scatter the tomatoes and onions onto a large plate or shallow bowl.");
//		instructions.add("Drizzle with vinegar, season with flaky salt and pepper and let sit a few minutes.");
//		instructions.add("Give them a toss (you should see lots of juices accumulate).");
//		instructions.add("Top with anchovies and capers, crushed red pepper flakes of your choosing, and herbs if you’re using.");
//		instructions.add("Drizzle with a very good amount of olive oil, letting it pool into the accumulated juices to give you a bit of a broken vinaigrette vibe.");
//		tomatoSalad.setInstructions(instructions);
//
////		create recipe ingredients for recipe
//		RecipeIngredient r1 = new RecipeIngredient();
//		r1.setIngredient(ingredientService.findIngredientById(20l));
//		r1.setRecipe(tomatoSalad);
//		r1.setQuantity(2);
//		r1.setUnitName("POUND");
//		r1.massOrVolumeSetter();
//		r1.setVisualImpact(true);
//		r1.setForm(RecipeIngredientForm.WEDGES);
//		r1.setTexture(RecipeIngredientTexture.FIRM);
//		r1.setCookingMethod(RecipeIngredientCookingMethod.ADD);
//		r1.setColor("#ca321d");
//
//		RecipeIngredient r2 = new RecipeIngredient();
//		r2.setIngredient(ingredientService.findIngredientById(22l));
//		r2.setRecipe(tomatoSalad);
//		r2.setQuantity(50);
//		r2.setUnitName("GRAM");
//		r2.massOrVolumeSetter();
//		r2.setVisualImpact(true);
//		r2.setForm(RecipeIngredientForm.RINGS);
//		r2.setTexture(RecipeIngredientTexture.CHEWY);
//		r2.setCookingMethod(RecipeIngredientCookingMethod.DRIZZLE);
//		r2.setColor("#e0cac7");
//
//		RecipeIngredient r3 = new RecipeIngredient();
//		r3.setIngredient(ingredientService.findIngredientById(29l));
//		r3.setRecipe(tomatoSalad);
//		r3.setQuantity(2);
//		r3.setUnitName("TABLESPOON");
//		r3.massOrVolumeSetter();
//		r3.setVisualImpact(false);
//
//		RecipeIngredient r4 = new RecipeIngredient();
//		r4.setIngredient(ingredientService.findIngredientById(25l));
//		r4.setRecipe(tomatoSalad);
////		r4.setQuantity(2);
////		r4.setUnitName("TEASPOON");
////		r4.massOrVolumeSetter();
//		r4.setVisualImpact(false);
////		r4.setForm(RecipeIngredientForm.POWDER);
////		r4.setTexture(RecipeIngredientTexture.PASTY);
////		r4.setCookingMethod(RecipeIngredientCookingMethod.MIX);
////		r4.setColor("EE9A5D");
//
//		RecipeIngredient r5 = new RecipeIngredient();
//		r5.setIngredient(ingredientService.findIngredientById(26l));
//		r5.setRecipe(tomatoSalad);
////		r5.setQuantity(1);
////		r5.setUnitName("TABLESPOON");
////		r5.massOrVolumeSetter();
//		r5.setVisualImpact(false);
//// 		no visual properties
//
//		RecipeIngredient r6 = new RecipeIngredient();
//		r6.setIngredient(ingredientService.findIngredientById(30l));
//		r6.setRecipe(tomatoSalad);
//		r6.setQuantity(2);
//		r6.setUnitName("TABLESPOON");
//		r6.massOrVolumeSetter();
//		r6.setVisualImpact(true);
//		r6.setForm(RecipeIngredientForm.CHOPPED);
//		r6.setTexture(RecipeIngredientTexture.CHEWY);
//		r6.setCookingMethod(RecipeIngredientCookingMethod.GARNISH);
//		r6.setColor("#aaac48");
//
//		RecipeIngredient r7 = new RecipeIngredient();
//		r7.setIngredient(ingredientService.findIngredientById(31l));
//		r7.setRecipe(tomatoSalad);
//		r7.setQuantity(75);
//		r7.setUnitName("GRAM");
//		r7.massOrVolumeSetter();
//		r7.setVisualImpact(true);
//		r7.setForm(RecipeIngredientForm.CHOPPED);
//		r7.setTexture(RecipeIngredientTexture.MOIST);
//		r7.setCookingMethod(RecipeIngredientCookingMethod.ADD);
//		r7.setColor("#5c260f");
//
//		RecipeIngredient r8 = new RecipeIngredient();
//		r8.setIngredient(ingredientService.findIngredientById(27l));
//		r8.setRecipe(tomatoSalad);
//		r8.setVisualImpact(true);
//		r8.setForm(RecipeIngredientForm.CRUSHED);
//		r8.setTexture(RecipeIngredientTexture.POWDERY);
//		r8.setCookingMethod(RecipeIngredientCookingMethod.GARNISH);
//		r8.setColor("#651f0d");
//
//		RecipeIngredient r9 = new RecipeIngredient();
//		r9.setIngredient(ingredientService.findIngredientById(32l));
//		r9.setRecipe(tomatoSalad);
////		r9.setQuantity(75);
////		r9.setUnitName("GRAM");
////		r9.massOrVolumeSetter();
//		r9.setVisualImpact(true);
//		r9.setForm(RecipeIngredientForm.LEAVES);
//		r9.setTexture(RecipeIngredientTexture.FIRM);
//		r9.setCookingMethod(RecipeIngredientCookingMethod.GARNISH);
//		r9.setColor("#62824b");
//
//		RecipeIngredient r10 = new RecipeIngredient();
//		r10.setIngredient(ingredientService.findIngredientById(19l));
//		r10.setRecipe(tomatoSalad);
////		r10.setQuantity(75);
////		r10.setUnitName("GRAM");
////		r10.massOrVolumeSetter();
//		r10.setVisualImpact(true);
//		r10.setForm(RecipeIngredientForm.FLUID);
//		r10.setTexture(RecipeIngredientTexture.WATERY);
//		r10.setCookingMethod(RecipeIngredientCookingMethod.DRIZZLE);
//		r10.setColor("#f6ca8a");
//
////		no save of recipe-ingredients, cascaded through recipe save
//		tomatoSalad.addRecipeIngredient(r1);
//		tomatoSalad.addRecipeIngredient(r2);
//		tomatoSalad.addRecipeIngredient(r3);
//		tomatoSalad.addRecipeIngredient(r4);
//		tomatoSalad.addRecipeIngredient(r5);
//		tomatoSalad.addRecipeIngredient(r6);
//		tomatoSalad.addRecipeIngredient(r7);
//		tomatoSalad.addRecipeIngredient(r8);
//		tomatoSalad.addRecipeIngredient(r9);
//		tomatoSalad.addRecipeIngredient(r10);
//		recipeService.saveRecipe(tomatoSalad);
//
//		// INIT 5: create visual with recipe
//		String fileName = "testdish5.png";
//		Visual visual = new Visual();
//		visual.setFileName(fileName);
//		visual.setLocation("/img/testspawn/" + fileName);
//		visual.setRecipe(recipeService.findById(33l));
//		visualService.saveVisual(visual, chefService.findChefById(18l));

//		// INIT 6: add a Like to a visual TODO: NOT WORKING
//		Like like = new Like();
//		likeService.saveLike(visualService.findVisualById(15l), chefService.findChefById(1l));
//
//	}
}
