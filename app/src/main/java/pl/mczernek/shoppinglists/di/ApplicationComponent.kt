package pl.mczernek.shoppinglists.di

import dagger.Component
import pl.mczernek.shoppinglists.ShoppingListApp
import pl.mczernek.shoppinglists.list.predefined.di.PredefinedListActivityModule

@App
@Component(modules = arrayOf(DatabaseModule::class, PredefinedListActivityModule::class))
interface ApplicationComponent {
    fun inject(app: ShoppingListApp)
}