package defpackage;

import android.net.Uri;
import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xns {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/discovery/DialAppStatusService");
    public final String b = "m";
    public final xla c;
    private final tft d;
    private final vxz e;

    public xns(tft tftVar, xla xlaVar, vxz vxzVar) {
        this.d = tftVar;
        this.c = xlaVar;
        this.e = vxzVar;
    }

    public static final boolean b(xnq xnqVar, String str) {
        return xnqVar.c().equals(str);
    }

    public static final void c(InputStream inputStream, ContentHandler contentHandler) throws SAXException, IOException {
        Xml.parse(inputStream, Xml.Encoding.UTF_8, contentHandler);
    }

    public final xva a(Uri uri, boolean z) {
        if (uri == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "MDX.discovery")).k("com/google/android/libraries/youtube/mdx/discovery/DialAppStatusService", "requestStatus", 71, "DialAppStatusService.java")).t("URI to request App Status from is null.");
            return xva.b(-2);
        }
        tge tgeVarA = tgf.a(uri.toString());
        tgeVarA.c("Origin", "package:com.google.android.youtube");
        if (this.e.m(14, 45627566L)) {
            tgeVarA.d(tok.MDX_DISCOVERY_DIAL_APP_SERVICE);
        }
        tgf tgfVarA = tgeVarA.a();
        xnr xnrVar = new xnr(this, tgfVarA.a, z);
        yno.cL(this.d, tgfVarA, xnrVar);
        return xnrVar.a;
    }
}
