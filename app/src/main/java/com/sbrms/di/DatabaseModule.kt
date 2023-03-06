package com.sbrms.di

import android.content.Context
import com.sbrms.datasource.database.AppDatabase
import com.sbrms.model.dao.EmployeeDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {
    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getDatabase(context)
    }

    @Provides
    fun providePlantDao(appDatabase: AppDatabase): EmployeeDao {
        return appDatabase.employeeDao()
    }
}