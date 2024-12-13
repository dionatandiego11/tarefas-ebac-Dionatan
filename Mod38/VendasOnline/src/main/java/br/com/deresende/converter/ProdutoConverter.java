package br.com.deresende.converter;

import java.util.HashMap;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import br.com.deresende.domain.Produto;

@Named
@FacesConverter(value = "produtoConverter", forClass = Produto.class)
public class ProdutoConverter implements Converter<Produto> {
	
	private static final String key = "br.com.deresende.converter.ProdutoConverter";
	
	@Override
	public Produto getAsObject(FacesContext context, UIComponent component, String value) {
		if (value.isEmpty()) {
	        return null;
	    }
	    return (Produto) getViewMap(context).get(value); // Casting explícito para Produto
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Produto produto) {
		if (produto == null || produto.getId() == null) {
			return "";
		}
		String id = produto.getId().toString();
		getViewMap(context).put(id, produto);
	    return id;
	}
	
	private Map<String, Object> getViewMap(FacesContext context) {
	    Map<String, Object> viewMap = context.getViewRoot().getViewMap();
	    @SuppressWarnings("unchecked")
	    Map<String, Object> idMap = (Map<String, Object>) viewMap.get(key);
	    if (idMap == null) {
	        idMap = new HashMap<>();
	        viewMap.put(key, idMap);
	    }
	    return idMap;
	}

}


