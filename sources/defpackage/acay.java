package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acay extends tzk {
    public acay() {
        super(null);
    }

    @Override // defpackage.tzk
    public final void G(Deque deque, Attributes attributes, String str) {
        acbp acbpVar = (acbp) deque.peekFirst();
        if (acbpVar != null) {
            int iM = aawb.m(attributes, 0, "wp");
            acbu acbuVar = iM != 0 ? new acbu(acbpVar.e(iM)) : new acbu();
            acbuVar.b = aawb.m(attributes, 0, "id");
            acbuVar.c = aawb.l(aawb.m(attributes, 7, "ap"));
            acbuVar.d = aawb.m(attributes, 100, "av");
            acbuVar.e = aawb.m(attributes, 50, "ah");
            acbuVar.f = aawb.m(attributes, 0, "rc");
            acbuVar.g = aawb.m(attributes, 0, "cc");
            acbpVar.c.put(Integer.valueOf(acbuVar.b), acbuVar);
        }
    }
}
