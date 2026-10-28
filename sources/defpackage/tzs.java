package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tzs {
    public static final Attributes a = new tzq();
    public static final Map b;
    private final SAXParserFactory c;

    static {
        HashMap map = new HashMap();
        map.put("http://xml.org/sax/features/namespaces", Boolean.FALSE);
        map.put("http://xml.org/sax/features/namespace-prefixes", Boolean.TRUE);
        b = DesugarCollections.unmodifiableMap(map);
    }

    public tzs(Map map) {
        map.getClass();
        try {
            this.c = SAXParserFactory.newInstance();
            for (Map.Entry entry : map.entrySet()) {
                this.c.setFeature((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException("SAX initilization error", e);
        } catch (SAXNotRecognizedException e2) {
            throw new RuntimeException("SAX initilization error", e2);
        } catch (SAXNotSupportedException e3) {
            throw new RuntimeException("SAX initilization error", e3);
        }
    }

    public final Object a(InputStream inputStream, vwt vwtVar) throws IOException, tzp {
        XMLReader xMLReader;
        try {
            SAXParserFactory sAXParserFactory = this.c;
            synchronized (sAXParserFactory) {
                xMLReader = sAXParserFactory.newSAXParser().getXMLReader();
            }
            tzr tzrVar = new tzr(vwtVar);
            xMLReader.setContentHandler(tzrVar);
            xMLReader.parse(new InputSource(inputStream));
            Object obj = tzrVar.a;
            if (obj != null) {
                return obj;
            }
            throw new tzo();
        } catch (ParserConfigurationException e) {
            throw new tzp(e);
        } catch (SAXException e2) {
            throw new tzp(e2);
        }
    }
}
