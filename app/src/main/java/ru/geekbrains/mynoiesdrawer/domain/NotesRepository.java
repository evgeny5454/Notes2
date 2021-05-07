package ru.geekbrains.mynoiesdrawer.domain;

import java.util.List;

public interface NotesRepository {
    List<Note> getNotes();
}
