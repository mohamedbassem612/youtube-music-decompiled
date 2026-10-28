package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acar extends tzk {
    public acar() {
        super(null);
    }

    @Override // defpackage.tzk
    public final void G(Deque deque, Attributes attributes, String str) {
        acbm acbmVar = (acbm) deque.peekFirst();
        if (acbmVar != null) {
            int iM = aawb.m(attributes, 0, "w", "win", "id");
            String strP = aawb.p(attributes, "t", "start");
            if (strP != null) {
                int i = Integer.parseInt(strP);
                String value = attributes.getValue("op");
                if (value == null || !value.equals("define")) {
                    return;
                }
                String strP2 = aawb.p(attributes, "ap");
                int iL = strP2 != null ? aawb.l(Integer.parseInt(strP2)) : 34;
                String strP3 = aawb.p(attributes, "ah");
                int iMax = strP3 != null ? Math.max(0, Math.min(Integer.parseInt(strP3), 100)) : 50;
                String strP4 = aawb.p(attributes, "av");
                int iMax2 = strP4 != null ? Math.max(0, Math.min(Integer.parseInt(strP4), 100)) : 95;
                String strP5 = aawb.p(attributes, "vs");
                acbmVar.b(iM).e(i, new accf(iL, iMax, iMax2, strP5 != null ? Boolean.parseBoolean(strP5) : true, aawb.p(attributes, "sd") != null, null));
            }
        }
    }
}
