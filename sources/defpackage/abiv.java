package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abiv implements tbu {
    final /* synthetic */ tam a;

    public abiv(tam tamVar) {
        this.a = tamVar;
    }

    @Override // defpackage.tbu
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // defpackage.tbu
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(aazj aazjVar) {
        yny ynyVar;
        if (aazjVar.a == abob.a) {
            tam tamVar = this.a;
            tamVar.b = true;
            agqr it = tamVar.a.iterator();
            while (it.hasNext()) {
                tal talVar = (tal) it.next();
                talVar.a = true;
                talVar.b();
            }
            abis abisVar = tamVar.o;
            if (abisVar != null && (ynyVar = abisVar.e) != null) {
                zhq zhqVar = zhq.ABR;
                ynyVar.a.G();
                ynyVar.g.set(true);
                synchronized (ynyVar) {
                    ynw ynwVar = ynyVar.f;
                    if (ynwVar != null) {
                        ynwVar.a(false);
                    }
                }
                abisVar.e = null;
                abisVar.c.c(new xnh());
            }
            if (!tamVar.p) {
                tamVar.e.c(new xng());
            }
            Object obj = tamVar.n;
            if (obj != null) {
                awka.f((AtomicReference) obj);
            }
        }
    }
}
