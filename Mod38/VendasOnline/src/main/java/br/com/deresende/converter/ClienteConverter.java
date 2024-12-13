package br.com.deresende.converter;

import java.util.HashMap;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import br.com.deresende.domain.Cliente;

@Named
@FacesConverter(value = "clienteConverter", forClass = Cliente.class)
public class ClienteConverter implements Converter<Cliente> {
	
	private static final String key = "br.com.deresende.converter.ClienteConverter";
	
	@Override
	public Cliente getAsObject(FacesContext context, UIComponent component, String value) {
		if (value.isEmpty()) {
	        return null;
	    }
	    return (Cliente) getViewMap(context).get(value); // Converta explicitamente para Cliente
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Cliente cliente) {
		if (cliente == null || cliente.getId() == null) {
			return "";
		}
		String id = cliente.getId().toString();
		getViewMap(context).put(id, cliente);
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

