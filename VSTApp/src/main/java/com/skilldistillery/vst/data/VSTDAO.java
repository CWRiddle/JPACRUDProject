package com.skilldistillery.vst.data;

import java.util.List;

import com.skilldistillery.vst.entities.Softsynth;

public interface VSTDAO {

	Softsynth findById(int id);
	List<Softsynth> findAllSynths();
	boolean addSynth(Softsynth synth);
	void updateSynth(Softsynth synth);
	void deleteSynth(int synthId);
	List<Softsynth> searchByKeyword(String keyword);

	
}
