package com.plcoding.jetpackcomposepokedex.repositories

import com.plcoding.jetpackcomposepokedex.model.Pokemon
import com.plcoding.jetpackcomposepokedex.model.PokemonList
import com.plcoding.jetpackcomposepokedex.responses.PokeApi
import com.plcoding.jetpackcomposepokedex.util.Resource
import java.lang.Exception
import javax.inject.Inject

class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error(null, "An unknown error occured.")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemon(name: String): Resource<Pokemon> {
        val response = try {
            api.getPokemon(name)
        } catch(e: Exception) {
            return Resource.Error(null, "An unknown error occured.")
        }
        return Resource.Success(response)
    }
}