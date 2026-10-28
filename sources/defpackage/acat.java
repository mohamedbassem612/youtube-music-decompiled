package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acat extends tzk {
    public acat() {
        super(null);
    }

    @Override // defpackage.tzk
    public final void G(Deque deque, Attributes attributes, String str) {
        String strP;
        acbm acbmVar = (acbm) deque.peekFirst();
        if (acbmVar == null || (strP = aawb.p(attributes, "start")) == null) {
            return;
        }
        int iN = aawb.n(Float.parseFloat(strP));
        String value = attributes.getValue("dur");
        float f = 5.0f;
        if (value != null) {
            int i = typ.a;
            try {
                f = Float.parseFloat(value);
            } catch (NumberFormatException unused) {
            }
        }
        acbmVar.c(0, str.replaceAll("\n", "<br/>"), iN, aawb.n(f) + iN);
    }
}
