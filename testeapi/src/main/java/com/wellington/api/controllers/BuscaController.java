package com.wellington.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.wellington.api.models.GenericJson;

@RestController
@RequestMapping("/busca")
public class BuscaController {

	@Value("${access.token}")
	private String accessToken;
	
	@Autowired
	private RestTemplate restTemplate = new RestTemplate();
	
	
	@RequestMapping("/{nomeArtista}")
	public List<String> getMusicas(@PathVariable("nomeArtista") String nomeArtista){
		List<String> lista = new ArrayList<String>();
		String musica = restTemplate.getForObject("https://api.genius.com/search?q=" + nomeArtista + "&access_token=" + accessToken, String.class);
		Gson gson = new Gson();
		String json = musica;
		GenericJson obj = gson.fromJson(json, GenericJson.class);
		for (int i = 0; i < 10; i++) {
			lista.add(obj.getResponse().getHits().get(i).getResult().getTitle());
		}
		return lista;
		
	}
	
}
