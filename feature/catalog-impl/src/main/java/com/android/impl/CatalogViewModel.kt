package com.android.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.impl.data.Product
import com.android.impl.di.CatalogFeatureComponent
import kotlinx.coroutines.launch
import javax.inject.Inject

class CatalogViewModel: ViewModel() {

    @Inject lateinit var catalogInteractor: CatalogInteractor

    val someLiveData: MutableLiveData<List<Product>> by lazy {
        MutableLiveData<List<Product>>()
    }

    init {
        (CatalogFeatureComponent.catalogFeatureComponent as CatalogFeatureComponent)
            .inject(this)
    }

    fun launch(){
        viewModelScope.launch(){
            val list = catalogInteractor.requestCatalog()
            someLiveData.value = list
        }
    }
}
