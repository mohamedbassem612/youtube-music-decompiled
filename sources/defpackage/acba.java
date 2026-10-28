package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acba extends tzk {
    final /* synthetic */ abmt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acba(abmt abmtVar) {
        super(null);
        this.a = abmtVar;
    }

    @Override // defpackage.tzk
    public final void G(Deque deque, Attributes attributes, String str) {
        acbp acbpVar = (acbp) deque.peekFirst();
        if (acbpVar != null) {
            acbs acbsVar = new acbs(acbpVar.c(aawb.m(attributes, 0, "p")));
            acbsVar.b = aawb.m(attributes, 0, "id");
            acbsVar.c = aawb.r(attributes, "i");
            acbsVar.d = aawb.r(attributes, "u");
            acbsVar.e = aawb.r(attributes, "b");
            acbsVar.f = aawb.m(attributes, 1, "of");
            acbsVar.g = aawb.m(attributes, 100, "sz");
            acbsVar.h = aawb.m(attributes, 0, "et");
            acbsVar.r = aawb.q(attributes, "#000000", "ec");
            acbsVar.i = aawb.m(attributes, 0, "fs");
            acbsVar.k = aawb.q(attributes, "#FFFFFF", "fc");
            acbsVar.m = aawb.m(attributes, 255, "fo");
            acbsVar.o = aawb.q(attributes, "#000000", "bc");
            acbsVar.q = aawb.m(attributes, 255, "bo");
            if (this.a.bw()) {
                acbsVar.j = aawb.p(attributes, "fc") != null;
                acbsVar.l = aawb.p(attributes, "fo") != null;
                acbsVar.n = aawb.p(attributes, "bc") != null;
                acbsVar.p = aawb.p(attributes, "bo") != null;
            }
            acbpVar.a.put(Integer.valueOf(acbsVar.b), acbsVar);
        }
    }
}
