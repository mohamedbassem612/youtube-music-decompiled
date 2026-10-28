package defpackage;

import java.util.ArrayList;
import java.util.Deque;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acaw extends tzk {
    final /* synthetic */ abmt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acaw(abmt abmtVar) {
        super(null);
        this.a = abmtVar;
    }

    @Override // defpackage.tzk
    public final void G(Deque deque, Attributes attributes, String str) {
        acbu acbuVarE;
        acbv acbvVarF;
        acbp acbpVar = (acbp) deque.peekFirst();
        if (acbpVar != null) {
            acbs acbsVar = acbpVar.g;
            acbt acbtVarD = acbpVar.d(aawb.m(attributes, 0, "w"));
            if (acbtVarD != null) {
                acbuVarE = acbtVarD.b;
                acbvVarF = acbtVarD.c;
            } else {
                acbuVarE = acbpVar.e(aawb.m(attributes, 0, "wp"));
                acbvVarF = acbpVar.f(aawb.m(attributes, 0, "ws"));
            }
            acbq acbqVar = new acbq();
            acbqVar.d = acbsVar;
            acbqVar.a = aawb.o(attributes, 0L, "t");
            acbqVar.b = aawb.o(attributes, 0L, "d");
            acbqVar.c = aawb.r(attributes, "a");
            acbqVar.e = acbuVarE;
            acbqVar.f = acbvVarF;
            aawb.m(attributes, 0, "rc");
            aawb.m(attributes, 0, "cc");
            if (this.a.bw()) {
                acbqVar.h = str;
            } else {
                acbqVar.h = acbsVar.a() + str.replaceAll("\n", "<br/>") + acbsVar.b();
            }
            acbq acbqVar2 = acbpVar.f;
            if (acbqVar2 != null) {
                if (acbqVar2.b == 0) {
                    acbqVar2.b = acbqVar.a - acbqVar2.a;
                }
                acbpVar.g(acbqVar2);
            }
            acbpVar.f = acbqVar;
            acbqVar.g = acbpVar.e;
            acbpVar.e = new ArrayList();
            acbpVar.g = acbs.a;
        }
    }

    @Override // defpackage.tzk
    public final void H(Deque deque, Attributes attributes) {
        acbs acbsVarC;
        acbp acbpVar = (acbp) deque.peekFirst();
        if (acbpVar != null) {
            acbt acbtVarD = acbpVar.d(aawb.m(attributes, 0, "w"));
            String value = attributes.getValue("p");
            if (value != null) {
                acbsVarC = acbpVar.c(typ.a(value, 0));
            } else {
                acbsVarC = acbtVarD != null ? acbtVarD.d : acbpVar.c(0);
            }
            acbpVar.g = acbsVarC;
        }
    }
}
