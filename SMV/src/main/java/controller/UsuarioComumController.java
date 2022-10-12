package controller;

import java.util.List;

import entidade.UsuarioComumEntity;
import repositories.UsuarioComumRespository;

@RestController
@RequestMapping("/usuarios")

public class UsuarioComumController {
	
	
	private final UsuarioComumRespository UsuarioComumRepository;
	
	public UsuarioComumController(UsuarioComumRespository UsuarioComumRepository) {
		
		this.UsuarioComumRepository = UsuarioComumRepository;
		
	}
	
	@PostMapping
	
	public UsuarioComumEntity create(@RequestBody UsuarioComumEntity usuario ) {
		
		UsuarioComumEntity UCEntity = new UsuarioComumEntity();
		UCEntity.setNome(usuario.getNome());
		UCEntity.setEmail(usuario.getEmail());
		UCEntity.setSenha(usuario.getSenha());
		
		return usuario;
		
	}
	
	@GetMapping(path = "{id}")
	public UsuarioComumEntity get(@PathVariable Long id){
		
		UsuarioComumEntity entity = UsuarioComumRepository.getById(id);
		UsuarioComumEntity usuario = new UsuarioComumEntity();
		usuario.setEmail(entity.getEmail());
		usuario.setId(entity.getId());
		usuario.setNome(entity.getNome());
		usuario.setNome(entity.getNome());
		
		return usuario;
	

}
	
	@PutMapping
	public UsuarioComumEntity update(@RequestBody UsuarioComumEntity usuario){
		
			UsuarioComumEntity usuarioEntity = new UsuarioComumEntity();
			usuarioEntity.setId(usuario.getId());
			usuarioEntity.setNome(usuario.getNome());
			usuarioEntity.setSenha(usuario.getSenha());
			usuarioEntity.setEmail(usuario.getEmail());
			usuarioEntity.setSenha(usuario.getSenha());
			usuarioEntity = UsuarioComumRepository.save(usuarioEntity);
			usuario.setId(usuarioEntity.getId());
		
			return usuario;
		}
	
	@DeleteMapping(path = "{id}")
	public void delete(@PathVariable Long id){
		
		UsuarioComumRepository.deleteById(id);

	
}
	

	@GetMapping 
	public List<UsuarioComumEntity> listAll(){
		
		List<UsuarioComumEntity> listEntity = UsuarioComumRepository.findAll();
		List<UsuarioComumEntity> listPojo = new ArrayList<>();
		
		for (UsuarioComumEntity entity:listEntity){
			
			UsuarioComumEntity usuario = new UsuarioComumEntity();
			usuario.setId(entity.getId());
			usuario.setNome(entity.getNome());
			usuario.setSenha(entity.getSenha());
			usuario.setEmail(entity.getEmail());
			listPojo.add(usuario);
		}
		
		return listPojo;
	
	}
	
}
