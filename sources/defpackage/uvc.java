package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvc extends uux {
    private final long a;

    /* JADX WARN: Illegal instructions before constructor call */
    public uvc(long j) {
        aihl aihlVar = augj.b;
        aihlVar.getClass();
        super(aihlVar);
        this.a = j;
    }

    @Override // defpackage.uux
    public final /* synthetic */ Object a(Object obj) {
        augj augjVar = (augj) obj;
        if (augjVar == null) {
            return null;
        }
        jrq jrqVar = (jrq) augjVar.toBuilder();
        jrqVar.getClass();
        atqo.D(jrqVar);
        atqo.F(jrqVar);
        atqo.D(jrqVar);
        aiie aiieVar = augjVar.c;
        aiieVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : aiieVar) {
            if (((augi) obj2).c != this.a) {
                arrayList.add(obj2);
            }
        }
        jrqVar.i(atqq.ap(arrayList));
        return atqo.E(jrqVar);
    }
}
