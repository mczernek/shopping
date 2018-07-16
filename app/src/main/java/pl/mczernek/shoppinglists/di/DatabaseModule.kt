package pl.mczernek.shoppinglists.di
import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import pl.mczernek.shoppinglists.data.AppDatabase

@Module
class DatabaseModule(val context: Context) {

    @Provides @App
    fun providesDatabase(): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "shopping_lists").build()
    }

}