package co.andrea.jaxb.ubl20;

import co.andrea.common.jaxb.JaxbContextFactory;
import co.andrea.common.jaxb.UblNamespacesMapper;
import co.andrea.common.ubl.Ubl20WriterImpl;
import co.andrea.common.ubl.UblNamespaces;
import co.gov.dian.contratos.facturaelectronica.v1.structures.DianExtensionsType;
import co.gov.dian.contratos.facturaelectronica.v1.structures.ObjectFactory;

import javax.xml.bind.JAXBElement;

import static co.andrea.common.Constants.ENCODING;

public class DianExtensionsJaxbWriter extends Ubl20WriterImpl<DianExtensionsType> {

    private static final JaxbContextFactory jaxbFactory;

    static {
        jaxbFactory = new JaxbContextFactory.Builder()
                .withMarshallerJAXBEncoding(ENCODING)
                .withMarshallerFormattedOutput(Boolean.TRUE)
                .withNamespacePrefixMapper(new UblNamespacesMapper(UblNamespaces.UBL_NAMESPACES_20, ""))
                .build();
    }

    @Override
    public JAXBElement getObjectFactory(DianExtensionsType dianExtensionsType) {
        return new ObjectFactory().createDianExtensions(dianExtensionsType);
    }

    public JaxbContextFactory getContextFactory() {
        return jaxbFactory;
    }

}
