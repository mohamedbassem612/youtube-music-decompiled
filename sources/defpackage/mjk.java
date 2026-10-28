package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mjk extends fky {

    @fmt(a = 13)
    AtomicInteger a;

    @fmt(a = 13)
    AtomicReference b;

    @fmt(a = 13)
    Map c;

    @fmt(a = 5)
    agke d;

    @fmt(a = 13)
    AtomicBoolean e;

    @fmt(a = 13)
    AtomicBoolean f;

    @fmt(a = 13)
    AtomicReference g;

    @fmt(a = 13)
    Boolean h;

    @Override // defpackage.fky
    public final void b(aero aeroVar) {
        avmn avmnVar;
        Object obj = aeroVar.b;
        int i = aeroVar.a;
        if (i != 0) {
            if (i == 1) {
                Boolean bool = this.h;
                agke agkeVarN = this.d;
                Object[] objArr = (Object[]) obj;
                int iIntValue = ((Integer) objArr[0]).intValue();
                int iIntValue2 = ((Integer) objArr[1]).intValue();
                if (agkeVarN != null) {
                    ArrayList arrayList = new ArrayList(agkeVarN);
                    arrayList.add(iIntValue2, (String) arrayList.remove(iIntValue));
                    agkeVarN = agke.n(arrayList);
                    bool = Boolean.TRUE;
                }
                this.h = bool;
                this.d = agkeVarN;
                return;
            }
            return;
        }
        Boolean bool2 = this.h;
        agke agkeVarG = this.d;
        Map map = this.c;
        Object[] objArr2 = (Object[]) obj;
        nsl nslVar = (nsl) objArr2[0];
        nuc nucVar = (nuc) objArr2[1];
        nro nroVar = (nro) objArr2[2];
        avmm avmmVar = (avmm) objArr2[3];
        agjw agjwVarN = agpr.a;
        try {
            agjwVarN = agkz.n(nroVar.identifiers());
        } catch (RuntimeException e) {
            nucVar.f(aslh.LOG_TYPE_INTERNAL_ERROR, nslVar, e, "DDC is unable to obtain item identifiers.", new Object[0]);
        }
        if (map != null) {
            synchronized (map) {
                if (agkeVarG != null) {
                    agqs agqsVarListIterator = agkeVarG.listIterator(0);
                    while (agqsVarListIterator.hasNext()) {
                        String str = (String) agqsVarListIterator.next();
                        if (!agjwVarN.contains(str) && map.containsKey(str) && (avmnVar = (avmn) map.remove(str)) != null) {
                            avmmVar.h(avmnVar);
                            avmnVar.dispose();
                        }
                    }
                }
            }
            agkeVarG = agjwVarN.g();
            bool2 = Boolean.FALSE;
        }
        this.h = bool2;
        this.d = agkeVarG;
        this.c = map;
    }
}
