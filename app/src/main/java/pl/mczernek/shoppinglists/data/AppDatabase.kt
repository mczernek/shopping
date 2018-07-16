package pl.mczernek.shoppinglists.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import pl.mczernek.shoppinglists.list.predefined.data.ShoppingListDefinition
import pl.mczernek.shoppinglists.list.predefined.data.ShoppingListDefinitionDao

@Database(entities = arrayOf(ShoppingListDefinition::class), version = 1)
        abstract class AppDatabase: RoomDatabase() {
    abstract fun shoppingListDefinition(): ShoppingListDefinitionDao
}