package co.andrea.jaxb.ubl20;

import co.andrea.common.ubl.Ubl20WriterImpl;
import co.gov.dian.contratos.facturaelectronica.v1.DebitNoteType;
import co.gov.dian.contratos.facturaelectronica.v1.ObjectFactory;

import javax.xml.bind.JAXBElement;

public class NotaDebitoJaxbWriter extends Ubl20WriterImpl<DebitNoteType> {

    @Override
    public JAXBElement<DebitNoteType> getObjectFactory(DebitNoteType creditNoteType) {
        return new ObjectFactory().createDebitNote(creditNoteType);
    }

}
