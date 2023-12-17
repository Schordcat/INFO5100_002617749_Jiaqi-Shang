
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class XMLParser {
    public static void main(String[] args) throws Exception {
        // Parse the XML
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("BookShelf.xml"));

        // Add a new book
        Element newBook = document.createElement("Book");
        addBookElements(document, newBook, "Book Four", "2015", "350", new String[]{"Author Six", "Author Seven"});
        document.getDocumentElement().appendChild(newBook);

        // Print XML
        printXML(document);

        // Save the modified XML
        saveXML(document, "BookShelfModified.xml");
    }

    private static void addBookElements(Document doc, Element book, String title, String year, String pages, String[] authors) {
        book.appendChild(createElementWithText(doc, "title", title));
        book.appendChild(createElementWithText(doc, "publishedYear", year));
        book.appendChild(createElementWithText(doc, "numberOfPages", pages));

        Element authorsElement = doc.createElement("authors");
        for (String author : authors) {
            authorsElement.appendChild(createElementWithText(doc, "author", author));
        }
        book.appendChild(authorsElement);
    }

    private static Element createElementWithText(Document doc, String elementName, String text) {
        Element element = doc.createElement(elementName);
        element.appendChild(doc.createTextNode(text));
        return element;
    }

    private static void printXML(Document document) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        StreamResult result = new StreamResult(new StringWriter());
        DOMSource source = new DOMSource(document);
        transformer.transform(source, result);
        String xmlString = result.getWriter().toString();
        System.out.println(xmlString);
    }

    private static void saveXML(Document document, String filename) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(filename));
        transformer.transform(source, result);
    }
}
