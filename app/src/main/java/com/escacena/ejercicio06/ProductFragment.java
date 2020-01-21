package com.escacena.ejercicio06;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.escacena.ejercicio06.dummy.DummyContent;
import com.escacena.ejercicio06.dummy.DummyContent.DummyItem;

import java.util.ArrayList;
import java.util.List;

public class ProductFragment extends Fragment {

    private int mColumnCount = 1;
    private IProductListener productListener;
    private List<Product> listaProductos;
    private MyProductRecyclerViewAdapter productAdadapter;

    public ProductFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_product_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            listaProductos = new ArrayList<>();
            listaProductos.add(new Product("ENACFIRE FUTURE PLUS",4,"ANTONIO",
                    35,3, "AURICULARES BLUETOOTH","MARTES 21 DE ENERO", 45,
                    "https://www.amazon.es/Auriculares-Bluetooth-inal%C3%A1mbricos-Micr%C3%B3fono-reproducci%C3%B3n/dp/B07RHXN86Z"));
            listaProductos.add(new Product("ENACFIRE FUTURE PLUS",4,"ANTONIO",
                    35,3, "AURICULARES BLUETOOTH","MARTES 21 DE ENERO", 45,
                    "https://www.amazon.es/Auriculares-Bluetooth-inal%C3%A1mbricos-Micr%C3%B3fono-reproducci%C3%B3n/dp/B07RHXN86Z"));
            listaProductos.add(new Product("ENACFIRE FUTURE PLUS",4,"ANTONIO",
                    35,3, "AURICULARES BLUETOOTH","MARTES 21 DE ENERO", 45,
                    "https://www.amazon.es/Auriculares-Bluetooth-inal%C3%A1mbricos-Micr%C3%B3fono-reproducci%C3%B3n/dp/B07RHXN86Z"));
            listaProductos.add(new Product("ENACFIRE FUTURE PLUS",4,"ANTONIO",
                    35,3, "AURICULARES BLUETOOTH","MARTES 21 DE ENERO", 45,
                    "https://www.amazon.es/Auriculares-Bluetooth-inal%C3%A1mbricos-Micr%C3%B3fono-reproducci%C3%B3n/dp/B07RHXN86Z"));
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IProductListener) {
            productListener = (IProductListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement IProductListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        productListener = null;
    }

}
