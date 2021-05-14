package com.myproject.notesapp.listeners;

import com.myproject.notesapp.entities.Note;

public interface NoteListener {
    void onNoteClicked(Note note, int position);
}
