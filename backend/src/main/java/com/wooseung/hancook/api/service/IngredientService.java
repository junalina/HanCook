package com.wooseung.hancook.api.service;

import com.wooseung.hancook.api.response.IngredientCardResponseDto;
import com.wooseung.hancook.api.response.IngredientResponseDto;

import java.util.List;

public interface IngredientService {

    List<IngredientResponseDto> getRandomIngredient(int lan);
    List<IngredientResponseDto> getRandomMeatIngredient(int lan);
    List<IngredientResponseDto> getRandomVegetableIngredient(int lan);

    List<String> getLargeList(int lan);

    List<String> getMediumList(String large, int lan);

    List<String> getNameList(String medium, int lan);

    int searchName(String name);

    String searchById(Long id);

    Long getIngredientIdByName(String name);

    IngredientResponseDto getIngredientByIngredientId(Long ingredientId, int lan);
    IngredientResponseDto getIngredientByName(String name, int lan);
    IngredientCardResponseDto getIngredientCardByIngredientId(Long ingredientId, int lan);

}
