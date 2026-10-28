package defpackage;

import java.util.Deque;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acav extends tzk {
    final /* synthetic */ abmt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acav(abmt abmtVar) {
        super(null);
        this.a = abmtVar;
    }

    @Override // defpackage.tzk
    public final void G(Deque deque, Attributes attributes, String str) {
        acbp acbpVar = (acbp) deque.peekFirst();
        if (acbpVar != null) {
            String value = attributes.getValue("p");
            acbs acbsVarC = value != null ? acbpVar.c(typ.a(value, 0)) : acbpVar.g;
            acbr acbrVar = new acbr();
            acbrVar.b = acbsVarC;
            acbrVar.a = aawb.m(attributes, 0, "t");
            aawb.m(attributes, 0, "ac");
            if (this.a.bw()) {
                acbrVar.c = str;
            } else {
                acbrVar.c = acbsVarC.a() + str.replaceAll("\n", "<br/>") + acbsVarC.b();
            }
            acbpVar.e.add(acbrVar);
        }
    }
}
