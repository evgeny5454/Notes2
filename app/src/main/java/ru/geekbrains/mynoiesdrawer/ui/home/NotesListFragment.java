package ru.geekbrains.mynoiesdrawer.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.geekbrains.mynoiesdrawer.R;
import ru.geekbrains.mynoiesdrawer.domain.MockNotesRepository;
import ru.geekbrains.mynoiesdrawer.domain.Note;
import ru.geekbrains.mynoiesdrawer.domain.NotesRepository;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class NotesListFragment extends Fragment {

    private NoteListViewModel viewModel;
    NotesAdapter adapter = new NotesAdapter();
    private RecyclerView notesList;

    public NotesListFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        viewModel = new ViewModelProvider(this).get(NoteListViewModel.class);


        viewModel.getNotesLiveData().observe(requireActivity(), new Observer<List<Note>>() {
            @Override
            public void onChanged(List<Note> notes) {
                adapter.addData(notes);
                adapter.notifyDataSetChanged();
            }
        });
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        notesList.findViewById(R.id.notes_list);
        RecyclerView.LayoutManager lm = new GridLayoutManager(requireContext(),3);
        notesList.setLayoutManager(lm);
        notesList.setAdapter(adapter);

    }
}

