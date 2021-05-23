package com.example.jetpackcomposepokedex.pokemonDetail

import androidx.lifecycle.ViewModel
import com.example.jetpackcomposepokedex.model.Pokemon
import com.example.jetpackcomposepokedex.repositories.PokemonRepository
import com.example.jetpackcomposepokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailsViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemon(pokemonName)
    }
}