package com.plcoding.jetpackcomposepokedex.pokemonDetail

import androidx.lifecycle.ViewModel
import com.plcoding.jetpackcomposepokedex.model.Pokemon
import com.plcoding.jetpackcomposepokedex.repositories.PokemonRepository
import com.plcoding.jetpackcomposepokedex.util.Resource
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