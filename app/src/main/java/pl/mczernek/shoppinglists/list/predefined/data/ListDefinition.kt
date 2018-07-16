package pl.mczernek.shoppinglists.list.predefined.data

import android.arch.persistence.room.*
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Entity
import io.reactivex.Single

@Entity(tableName = "shopping_list_definition")
data class ShoppingListDefinition(@ColumnInfo(name = "name") var name: String) {
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true) var id: Long = 0
}

@Dao
interface ShoppingListDefinitionDao {
    @Query("SELECT * from shopping_list_definition")
    fun getAllTasks(): Single<List<ShoppingListDefinition>>
}