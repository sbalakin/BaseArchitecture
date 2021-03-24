package com.android.impl

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.room.Room
import com.android.impl.data.Product
import com.android.impl.data.db.AppDatabase
import com.android.impl.databinding.FragmentCatalogBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CatalogFragment : Fragment(R.layout.fragment_catalog) {

    private lateinit var viewBinding: FragmentCatalogBinding
    private val viewModel: CatalogViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewBinding = FragmentCatalogBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.launch()
        initView()
    }

    private fun initView(){
        val someObserver = Observer<List<Product>> { someData ->
            viewBinding.someText.text = someData.toString()

//            val db = Room.databaseBuilder(
//                    requireContext(),
//                    AppDatabase::class.java, "database-name"
//            ).build()
//
//
//            GlobalScope.launch(Dispatchers.Default) {
//                db.productDao().insertAll(*someData.toTypedArray())
//                val list2 = db.productDao().getAll()
//                list2[1]
//                Log.e("YYYYY", list2.toString())
//                var d = 0
//                d++
//            }
        }

        viewModel.someLiveData.observe(viewLifecycleOwner, someObserver)
    }

}