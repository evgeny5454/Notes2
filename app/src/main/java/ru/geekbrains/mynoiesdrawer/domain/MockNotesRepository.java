package ru.geekbrains.mynoiesdrawer.domain;

import java.util.ArrayList;
import java.util.List;

public class MockNotesRepository implements NotesRepository {
    @Override
    public List<Note> getNotes() {

        ArrayList<Note> notes = new ArrayList<>();

        notes.add(new Note("id1","Title number One","https://i.pinimg.com/originals/9f/a7/9c/9fa79c7c83b4b1369b4c3a527b4d97a7.jpg"));
        notes.add(new Note("id2","Title number Two","https://wallpapershome.ru/images/pages/ico_h/21906.jpg"));
        notes.add(new Note("id3","Title number Three","https://wallscloud.net/uploads/cache/2563221226/Windows-10-wallpaper_1497290-1024x576-MM-90.jpg"));
        notes.add(new Note("id4","Title number Four","https://i.pinimg.com/originals/aa/98/ce/aa98ce342844fe8f283bd3cb650425e7.jpg"));
        notes.add(new Note("id5","Title number Five","https://p4.wallpaperbetter.com/wallpaper/9/519/764/mountains-best-for-desktop-background-wallpaper-preview.jpg"));
        notes.add(new Note("id6","Title number Six","https://buyoncdn.ru/preset/112100256/pages_original/63/ef/45/63ef45a14a8c2f04ec3c98a2b5b3acc40afd58d9.jpg"));
        notes.add(new Note("id7","Title number Seven","https://vjoy.cc/wp-content/uploads/2019/09/1-6.jpg"));
        notes.add(new Note("id8","Title number Eight","https://portscaner.ru/Files/Wallpaper/Original/5fc4ea0d40c8b.jpg"));
        notes.add(new Note("id9","Title number Nine","https://klike.net/uploads/posts/2019-11/1574511193_3.jpg"));
        notes.add(new Note("id10","Title number Ten","https://4pubg.com/wp-content/uploads/2019/01/%D0%BE%D0%B1%D0%BE%D0%B8-pubg-%D0%BD%D0%B0-%D1%80%D0%B0%D0%B1%D0%BE%D1%87%D0%B8%D0%B9-%D1%81%D1%82%D0%BE%D0%BB-1.jpg"));
        notes.add(new Note("id11","Title number Eleven","https://proprikol.ru/wp-content/uploads/2020/03/sinij-czvet-krasivye-kartinki-33-1.jpg"));


        return notes;
    }
}