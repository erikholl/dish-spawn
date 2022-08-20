package io.eho.dishspawn.service.implementation;

import io.eho.dishspawn.model.Ingredient;
import io.eho.dishspawn.repository.IngredientRepository;
import io.eho.dishspawn.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class IngredientServiceImpl implements IngredientService {
    private IngredientRepository ingredientRepository;

    public IngredientServiceImpl() {

    }

    @Autowired
    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public void saveIngredient(Ingredient ingredient) {
        this.ingredientRepository.save(ingredient);
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @Override
    public Set<Ingredient> getAllIngredientsByNameContaining(String name) {
        return ingredientRepository.findAllByNameContaining(name);
    }
}
