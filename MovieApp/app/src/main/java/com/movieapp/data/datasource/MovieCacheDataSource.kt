package com.movieapp.data.datasource

import com.movieapp.data.model.Movie

interface MovieCacheDataSource {

    suspend fun getMoviesFromCache():List<Movie>

    suspend fun saveMoviesToCache(movies:List<Movie>)
}