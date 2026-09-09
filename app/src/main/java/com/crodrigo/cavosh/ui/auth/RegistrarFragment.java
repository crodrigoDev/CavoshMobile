package com.crodrigo.cavosh.ui.auth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crodrigo.cavosh.R;
import com.crodrigo.cavosh.databinding.FragmentRegistrarBinding;

public class RegistrarFragment extends Fragment {

    private FragmentRegistrarBinding binding;

    public RegistrarFragment() {
        super(R.layout.fragment_registrar);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding = FragmentRegistrarBinding.bind(view);

        binding.btnTabLogin.setOnClickListener(v ->
                NavHostFragment.findNavController(this).popBackStack());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}