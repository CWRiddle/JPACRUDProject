package com.skilldistillery.vst.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.vst.entities.Softsynth;

@Service
@Transactional
public class VSTDAOImpl implements VSTDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Softsynth findById(int id) {
		return em.find(Softsynth.class, id);
	}

	@Override
	public List<Softsynth> findAllSynths() {
		
		String jpql = "SELECT s FROM Softsynth AS s";
		
		List<Softsynth> synths = em.createQuery(jpql, Softsynth.class).getResultList();
		
		return synths;
	}
	
	@Override
	public List<Softsynth> searchByKeyword(String keyword) {
		keyword = "%" + keyword + "%";
		String jpql = "SELECT s FROM Softsynth AS s WHERE name LIKE '" + keyword + "'";
		
		List<Softsynth> synths = em.createQuery(jpql, Softsynth.class).getResultList();
		
		return synths;
	}

	@Override
	public Softsynth addSynth(Softsynth synth) {

		//em.getTransaction().begin();
		em.persist(synth);
		em.flush();
		//em.getTransaction().commit();
		
		return synth;
	}
	
	@Override
	public void updateSynth(Softsynth synth) {
		Softsynth storedSynth = em.find(Softsynth.class, synth.getId());
		
		storedSynth.setName(synth.getName());
		storedSynth.setCompany(synth.getCompany());
		storedSynth.setPrice(synth.getPrice());
		storedSynth.setOscillators(synth.getOscillators());
		storedSynth.setSynthesisType(synth.getSynthesisType());
		storedSynth.setHasSampler(synth.isHasSampler());
	}
	
	@Override
	public void deleteSynth(int synthId) {
		
		Softsynth synth = em.find(Softsynth.class, synthId);
		em.remove(synth);
		
	}
	
	
	
}
