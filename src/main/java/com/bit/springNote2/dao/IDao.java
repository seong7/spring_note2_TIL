package com.bit.springNote2.dao;

import java.util.ArrayList;

import com.bit.springNote2.dto.NoteDto;

public interface IDao {
	
	public ArrayList<NoteDto> listDao();
	public void writeDao(String writer, String content);
	public void deleteDao(String id);
}
