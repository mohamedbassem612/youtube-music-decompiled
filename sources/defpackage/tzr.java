package defpackage;

import java.util.Deque;
import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tzr extends DefaultHandler {
    public Object a;
    private final Deque b;
    private final Deque c;
    private final Deque d;
    private final Deque e;
    private final vwt f;

    public tzr(vwt vwtVar) {
        this.f = vwtVar;
        LinkedList linkedList = new LinkedList();
        this.c = linkedList;
        linkedList.offerFirst("");
        this.d = new LinkedList();
        this.e = new LinkedList();
        this.b = new LinkedList();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.f.k((String) this.c.peekFirst()) != null) {
            ((StringBuilder) this.e.peekFirst()).append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        tzk tzkVarK = this.f.k((String) this.c.pollFirst());
        if (tzkVarK != null) {
            Attributes attributes = (Attributes) this.d.pollFirst();
            String string = ((StringBuilder) this.e.pollFirst()).toString();
            Deque deque = this.b;
            Object objPeekFirst = deque.peekFirst();
            if (objPeekFirst == null) {
                objPeekFirst = this.a;
            }
            this.a = objPeekFirst;
            tzkVarK.G(deque, attributes, string);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Deque deque = this.c;
        String str4 = ((String) deque.peekFirst()) + '/' + str3;
        deque.offerFirst(str4);
        tzk tzkVarK = this.f.k(str4);
        if (tzkVarK != null) {
            this.d.offerFirst(attributes != null ? new AttributesImpl(attributes) : tzs.a);
            this.e.offerFirst(new StringBuilder());
            tzkVarK.H(this.b, attributes);
        }
    }
}
