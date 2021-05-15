package co.andrea.jaxb.ubl20;

import co.andrea.common.ubl.Ubl20WriterImpl;
import co.gov.dian.contratos.facturaelectronica.v1.CreditNoteType;
import co.gov.dian.contratos.facturaelectronica.v1.ObjectFactory;

import javax.xml.bind.JAXBElement;

public class NotaCreditoJaxbWriter extends Ubl20WriterImpl<CreditNoteType> {

    @Override
    public JAXBElement<CreditNoteType> getObjectFactory(CreditNoteType creditNoteType) {
        return new ObjectFactory().createCreditNote(creditNoteType);
    }

}
