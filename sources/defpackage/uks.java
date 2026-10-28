package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uks implements urv {
    public static final Optional a = Optional.empty();
    public final awli b = new awli(a);
    public final awli c = new awli(Optional.empty());
    public usc d;

    public final ukq a() {
        Optional optional = (Optional) this.b.au();
        if (optional != null) {
            return (ukq) awrc.f(optional);
        }
        return null;
    }

    @Override // defpackage.urv
    public final usd b() {
        ukq ukqVarA = a();
        if (ukqVarA != null) {
            return ukqVarA.a;
        }
        return null;
    }

    @Override // defpackage.urv
    public final auhs c() {
        usd usdVarB = b();
        if (usdVarB != null) {
            return usdVarB.c();
        }
        return null;
    }

    @Override // defpackage.urv
    public final avlr d() {
        return this.c.H();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.urv
    public final void e(auhs auhsVar) {
        aeiv aeivVar;
        ukq ukqVarA = a();
        if (ukqVarA == null || (aeivVar = ukqVarA.c) == null) {
            return;
        }
        auew auewVarA = ((urp) aeivVar.c).a();
        ?? r2 = aeivVar.b;
        ArrayList arrayList = new ArrayList(atqq.N(r2, 10));
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            arrayList.add(((urp) it.next()).a());
        }
        ?? r0 = aeivVar.a;
        ArrayList arrayList2 = new ArrayList(atqq.N(r0, 10));
        Iterator it2 = r0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((urp) it2.next()).a());
        }
        uru uruVar = new uru(auewVarA, arrayList, arrayList2);
        ukqVarA.b.c(auhsVar, agke.n(uruVar.b), agke.n(uruVar.c));
    }

    @Override // defpackage.urv
    public final aeiv f() {
        ukq ukqVarA = a();
        if (ukqVarA != null) {
            return ukqVarA.c;
        }
        return null;
    }
}
