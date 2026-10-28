package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acaz extends tzk {
    public acaz() {
        super(null);
    }

    @Override // defpackage.tzk
    public final void G(Deque deque, Attributes attributes, String str) {
        acbp acbpVar = (acbp) deque.peekFirst();
        if (acbpVar != null) {
            int iM = aawb.m(attributes, 0, "ws");
            acbv acbvVar = iM != 0 ? new acbv(acbpVar.f(iM)) : new acbv();
            acbvVar.b = aawb.m(attributes, 0, "id");
            acbvVar.c = aawb.m(attributes, 0, "mh");
            acbvVar.d = aawb.m(attributes, 2, "ju");
            acbvVar.e = aawb.m(attributes, 0, "pd");
            acbvVar.f = aawb.m(attributes, 3, "sd");
            acbvVar.g = aawb.m(attributes, 0, "wfc");
            acbvVar.h = aawb.m(attributes, 255, "wfo");
            acbvVar.i = aawb.m(attributes, 0, "wbt");
            acbvVar.j = aawb.m(attributes, 16777215, "wbc");
            acbpVar.b.put(Integer.valueOf(acbvVar.b), acbvVar);
        }
    }
}
