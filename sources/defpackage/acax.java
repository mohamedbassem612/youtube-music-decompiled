package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acax extends tzk {
    public acax() {
        super(null);
    }

    @Override // defpackage.tzk
    public final void G(Deque deque, Attributes attributes, String str) {
        acbp acbpVar = (acbp) deque.peekFirst();
        if (acbpVar != null) {
            acbt acbtVar = new acbt();
            acbtVar.a = aawb.m(attributes, 0, "id");
            acbtVar.d = acbpVar.c(aawb.m(attributes, 0, "p"));
            aawb.o(attributes, 0L, "t");
            aawb.o(attributes, Long.MAX_VALUE, "d");
            acbtVar.b = acbpVar.e(aawb.m(attributes, 0, "wp"));
            acbtVar.c = acbpVar.f(aawb.m(attributes, 0, "ws"));
            aawb.m(attributes, 0, "rc");
            aawb.m(attributes, 0, "cc");
            acbpVar.d.put(Integer.valueOf(acbtVar.a), acbtVar);
        }
    }
}
