package PraticeTest;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONParser2 <T>{
	private static ObjectMapper mapper;
	
	static
	{
		mapper = new ObjectMapper();
	}
	
	public static void marshalling(EmpDetails obj) throws Exception
	{
		mapper.writeValue(new File("./EmpDetails.json"),obj);
		String s = mapper.writeValueAsString(obj);
		System.out.println(s);
	}
	
	// We should create Employee class type object, but to generalize the method by <T>T, so that any data class can use it. 
	// If we make object type as EmpDetails, it can be used only for that class
	public T unmarshalling(File jsonFileObj, Class<T> cls) throws Exception
	{
		T result = null;
		result=mapper.readValue(jsonFileObj, cls);
		return result;
		
	}

}
