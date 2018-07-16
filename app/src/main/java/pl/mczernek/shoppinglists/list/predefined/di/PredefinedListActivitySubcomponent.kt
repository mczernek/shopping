package pl.mczernek.shoppinglists.list.predefined.di

import dagger.Subcomponent
import dagger.android.AndroidInjector
import pl.mczernek.shoppinglists.list.predefined.PredefinedListsActivity

@Subcomponent()
interface PredefinedListActivitySubcomponent: AndroidInjector<PredefinedListsActivity> {

    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<PredefinedListsActivity>()

}