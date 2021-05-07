package ru.geekbrains.mynoiesdrawer.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import ru.geekbrains.mynoiesdrawer.domain.MockNotesRepository;
import ru.geekbrains.mynoiesdrawer.domain.Note;
import ru.geekbrains.mynoiesdrawer.domain.NotesRepository;

public class NoteListViewModel extends ViewModel {

    private final MutableLiveData<List<Note>> notesLiveData = new MutableLiveData<>();

    private final NotesRepository repository = new MockNotesRepository();

    public LiveData<List<Note>> getNotesLiveData() {
        return notesLiveData;
    }

    public void requestNotes() {
        List<Note> notes = repository.getNotes();
        notesLiveData.setValue(notes);
    }
}