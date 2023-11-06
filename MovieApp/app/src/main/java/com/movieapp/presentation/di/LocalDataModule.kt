package com.movieapp.presentation.di

import com.movieapp.data.datasource.MovieLocalDataSource
import com.movieapp.data.datasourceImpl.MovieLocalDataSourceImpl
import com.movieapp.data.db.MovieDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {
    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao):MovieLocalDataSource{
        return MovieLocalDataSourceImpl(movieDao)
    }
}