package co.andrea.jaxb.ubl20;

import co.andrea.common.ubl.Ubl20WriterImpl;
import co.gov.dian.contratos.facturaelectronica.v1.InvoiceType;
import co.gov.dian.contratos.facturaelectronica.v1.ObjectFactory;

import javax.xml.bind.JAXBElement;

public class FacturaJaxbWriter extends Ubl20WriterImpl<InvoiceType> {

    @Override
    public JAXBElement getObjectFactory(InvoiceType invoiceType) {
        return new ObjectFactory().createInvoice(invoiceType);
    }

}
