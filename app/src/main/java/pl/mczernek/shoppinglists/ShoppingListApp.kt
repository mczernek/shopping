package pl.mczernek.shoppinglists

import android.app.Application
import pl.mczernek.shoppinglists.data.AppDatabase
import pl.mczernek.shoppinglists.di.DaggerApplicationComponent
import pl.mczernek.shoppinglists.di.DatabaseModule
import javax.inject.Inject

class ShoppingListApp: Application() {

    @Inject
    lateinit var db: AppDatabase

    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent
                .builder()
                .databaseModule(DatabaseModule(this.applicationContext))
                .build()
                .inject(this)
    }

}