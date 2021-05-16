package com.plcoding.jetpackcomposepokedex.responses

import com.plcoding.jetpackcomposepokedex.model.Pokemon
import com.plcoding.jetpackcomposepokedex.model.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit:Int,
        @Query("offset") offset:Int
    ) : PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemon(
        @Path("name") name:String
    ) : Pokemon

}