
package co.edu.javeriana.proxies.advancese.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the co.edu.javeriana.proxies.advancese.types package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Input_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "input");
    private final static QName _Output_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "output");
    private final static QName _AdvancedSearchResultDID_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "dID");
    private final static QName _AdvancedSearchResultRevision_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "revision");
    private final static QName _AdvancedSearchResultDDocName_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "dDocName");
    private final static QName _AdvancedSearchResultTitulo_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "titulo");
    private final static QName _AdvancedSearchResultTipo_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "tipo");
    private final static QName _AdvancedSearchResultAutor_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "autor");
    private final static QName _AdvancedSearchResultGrupoSeguridad_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "grupoSeguridad");
    private final static QName _AdvancedSearchResultCuenta_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "cuenta");
    private final static QName _AdvancedSearchResultExtension_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "extension");
    private final static QName _AdvancedSearchResultExtensionWeb_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "extensionWeb");
    private final static QName _AdvancedSearchResultFechaCreacion_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "fechaCreacion");
    private final static QName _AdvancedSearchResultFormato_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "formato");
    private final static QName _AdvancedSearchResultNombreOriginal_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "nombreOriginal");
    private final static QName _AdvancedSearchResultUrl_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "url");
    private final static QName _AdvancedSearchResultCustomDocMetaData_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "customDocMetaData");
    private final static QName _PropertyName_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "name");
    private final static QName _PropertyValue_QNAME =
        new QName("http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.edu.javeriana.proxies.advancese.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdvancedSearch }
     *
     */
    public AdvancedSearch createAdvancedSearch() {
        return new AdvancedSearch();
    }

    /**
     * Create an instance of {@link SearchResponse }
     *
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link Property }
     *
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link AdvancedSearchResult }
     *
     */
    public AdvancedSearchResult createAdvancedSearchResult() {
        return new AdvancedSearchResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvancedSearch }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdvancedSearch }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", name = "input")
    public JAXBElement<AdvancedSearch> createInput(AdvancedSearch value) {
        return new JAXBElement<AdvancedSearch>(_Input_QNAME, AdvancedSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", name = "output")
    public JAXBElement<SearchResponse> createOutput(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_Output_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", name = "dID",
                    scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultDID(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultDID_QNAME, String.class, AdvancedSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0",
                    name = "revision", scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultRevision(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultRevision_QNAME, String.class, AdvancedSearchResult.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0",
                    name = "dDocName", scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultDDocName(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultDDocName_QNAME, String.class, AdvancedSearchResult.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", name = "titulo",
                    scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultTitulo(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultTitulo_QNAME, String.class, AdvancedSearchResult.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", name = "tipo",
                    scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultTipo(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultTipo_QNAME, String.class, AdvancedSearchResult.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", name = "autor",
                    scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultAutor(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultAutor_QNAME, String.class, AdvancedSearchResult.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0",
                    name = "grupoSeguridad", scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultGrupoSeguridad(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultGrupoSeguridad_QNAME, String.class,
                                       AdvancedSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", name = "cuenta",
                    scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultCuenta(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultCuenta_QNAME, String.class, AdvancedSearchResult.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0",
                    name = "extension", scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultExtension(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultExtension_QNAME, String.class, AdvancedSearchResult.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0",
                    name = "extensionWeb", scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultExtensionWeb(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultExtensionWeb_QNAME, String.class,
                                       AdvancedSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0",
                    name = "fechaCreacion", scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultFechaCreacion(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultFechaCreacion_QNAME, String.class,
                                       AdvancedSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0",
                    name = "formato", scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultFormato(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultFormato_QNAME, String.class, AdvancedSearchResult.class,
                                       value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0",
                    name = "nombreOriginal", scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultNombreOriginal(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultNombreOriginal_QNAME, String.class,
                                       AdvancedSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", name = "url",
                    scope = AdvancedSearchResult.class)
    public JAXBElement<String> createAdvancedSearchResultUrl(String value) {
        return new JAXBElement<String>(_AdvancedSearchResultUrl_QNAME, String.class, AdvancedSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Property }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Property }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0",
                    name = "customDocMetaData", scope = AdvancedSearchResult.class)
    public JAXBElement<Property> createAdvancedSearchResultCustomDocMetaData(Property value) {
        return new JAXBElement<Property>(_AdvancedSearchResultCustomDocMetaData_QNAME, Property.class,
                                         AdvancedSearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", name = "name",
                    scope = Property.class)
    public JAXBElement<String> createPropertyName(String value) {
        return new JAXBElement<String>(_PropertyName_QNAME, String.class, Property.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.javeriana.edu.co/co/schemas/process/bpm/WCC_Search/v1.0", name = "value",
                    scope = Property.class)
    public JAXBElement<String> createPropertyValue(String value) {
        return new JAXBElement<String>(_PropertyValue_QNAME, String.class, Property.class, value);
    }

}
