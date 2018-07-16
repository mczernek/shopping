package pl.mczernek.shoppinglists.list.predefined.di

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import pl.mczernek.shoppinglists.list.predefined.PredefinedListsActivity

@Module(subcomponents = arrayOf(PredefinedListActivitySubcomponent::class))
abstract class PredefinedListActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(value = PredefinedListsActivity::class)
        abstract fun bindPredefinedListActivityInjectorFactory(builder: PredefinedListActivitySubcomponent.Builder): AndroidInjector.Factory<out Activity>
}

