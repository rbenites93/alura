package br.com.alura.teste;

import br.com.alura.model.Produto;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Sistema {

    public static void main (String[] argsa) throws IOException, SAXException, ParserConfigurationException {

        DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = fabrica.newDocumentBuilder();
        Document document = builder.parse("src/Venda");

        NodeList produtos = document.getElementsByTagName("Produto");

        for (int i = 0; i < produtos.getLength(); i++){

            Element produto = (Element) produtos.item(i);

            String nome = produto.getElementsByTagName("nome").item(0).getTextContent();
            double preco = Double.parseDouble(produto.getElementsByTagName("preco").item(0).getTextContent());
            Produto prod = new Produto(nome, preco);

            System.out.println(prod);
        }

    }
}
