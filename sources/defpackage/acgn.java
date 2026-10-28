package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class acgn extends acfx {
    final /* synthetic */ acgo a;
    private final agke b;
    private final agke c;
    private final boolean k;
    private final AtomicBoolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acgn(acgo acgoVar, long j, long j2, boolean z, List list, List list2, String str, boolean z2) {
        super(j, j2, z, str);
        this.a = acgoVar;
        this.l = new AtomicBoolean(false);
        this.b = agke.n(list);
        this.c = agke.n(list2);
        this.k = z2;
    }

    @Override // defpackage.acfx
    protected final void c(long j) {
        acgo acgoVar = this.a;
        if (acgoVar.e) {
            this.l.set(false);
        }
        agke agkeVar = this.c;
        if (!agkeVar.isEmpty()) {
            int size = agkeVar.size();
            for (int i = 0; i < size; i++) {
                acgoVar.a((akje) agkeVar.get(i), this, j, true);
            }
            return;
        }
        agke agkeVar2 = this.b;
        int size2 = agkeVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            acgoVar.a((akje) agkeVar2.get(i2), this, j, false);
        }
    }

    @Override // defpackage.acfx
    protected final void d(boolean z, boolean z2, boolean z3, long j) {
        acgo acgoVar = this.a;
        if (!acgoVar.e || this.l.compareAndSet(false, true)) {
            agke agkeVar = this.b;
            int size = agkeVar.size();
            for (int i = 0; i < size; i++) {
                akje akjeVar = (akje) agkeVar.get(i);
                acgl acglVar = (acgl) acgoVar.b.get(akjd.a(akjeVar.b));
                if (acglVar != null) {
                    acglVar.a(akjeVar, this, j);
                }
            }
            if (this.k) {
                acfw acfwVarH = acgoVar.a.h();
                acga acgaVarG = acfwVarH != null ? acfwVarH.g() : null;
                if (acgaVarG != null) {
                    acgaVarG.n(this);
                }
            }
        }
    }

    @Override // defpackage.acfx
    protected final void e(long j) {
        acfw acfwVarH;
        acgo acgoVar = this.a;
        boolean z = true;
        boolean z2 = !acgoVar.d.bS();
        if (!acgoVar.e || this.e || j > -9223372036854775807L || (acfwVarH = acgoVar.a.h()) == null) {
            z = z2;
        } else {
            j = acfwVarH.a();
        }
        if (z && this.d && o(j)) {
            Runnable runnableI = afwl.i(new acgm(this, j, 0));
            if (a.x()) {
                runnableI.run();
            } else {
                acgoVar.c.execute(runnableI);
            }
        }
    }
}
