package br.com.curso.jaxb;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
public class TesteMarshal {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		// TODO Auto-generated method stub

		Produto produto = new Produto();
		produto.setNome("camisa");
		produto.setDescricao("camisa M");
		produto.setPreco(75.0);
		Categoria categoria = new Categoria();
		categoria.setNome("Vestuario");
		produto.setCategoria(categoria);
		//contexto com informacoes sobre classes anotadas
		JAXBContext context =  JAXBContext.newInstance(Produto.class);
		// Criacao do objeto responsavel pelo process de marshal
		Marshaller marshaller = context.createMarshaller();
		//Execucao do Marshal - conversao de java para xml
		marshaller.marshal(produto, new FileOutputStream("camisa.xml"));
		
		
	}

}
