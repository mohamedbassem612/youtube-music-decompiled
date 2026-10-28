package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class abki {
    private final awmd a;
    private final Map b = new HashMap();
    private abjk c;

    public abki(abjp abjpVar) {
        this.a = new glj(abjpVar, 13);
    }

    public final synchronized abjk a() {
        return this.c;
    }

    public final synchronized abjy b() {
        if (a() == null) {
            return null;
        }
        return (abjy) this.b.get(a());
    }

    public final synchronized void c(abjy abjyVar) {
        abjyVar.getClass();
        abjk abjkVarB = abjyVar.b();
        if (abjkVarB == this.c) {
            throw new IllegalArgumentException();
        }
        this.b.put(abjkVarB, abjyVar);
    }

    public final synchronized void d(abjk abjkVar) {
        e(abjkVar, abjx.a);
    }

    public final synchronized void e(abjk abjkVar, abjx abjxVar) {
        abjk abjkVar2 = this.c;
        if (abjkVar2 != abjkVar) {
            Map map = this.b;
            abjy abjyVar = (abjy) map.get(abjkVar);
            abjyVar.getClass();
            boolean z = abjkVar2 == null;
            abjy abjyVar2 = !z ? (abjy) map.get(abjkVar2) : null;
            abjm abjmVarC = abjyVar.c(abjkVar2, abjyVar2, abjxVar);
            this.c = abjkVar;
            ((abjp) ((glj) this.a).a).x(abjyVar, abjmVarC, abjkVar);
            if (!z) {
                abjyVar2.o();
            }
        }
    }
}
