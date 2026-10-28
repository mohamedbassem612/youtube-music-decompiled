package defpackage;

import java.util.TreeMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acah implements acaj {
    public final acac b;
    public final acbn c;
    public final twi d;
    public final Executor e;
    public final acai f;
    public final acga g;
    private final Executor h;
    private final Executor i;
    public final TreeMap a = new TreeMap();
    private float j = -1.0f;

    public acah(acbn acbnVar, acga acgaVar, twi twiVar, acac acacVar, acai acaiVar, Executor executor, Executor executor2, Executor executor3) {
        this.b = acacVar;
        this.c = acbnVar;
        this.g = acgaVar;
        this.d = twiVar;
        this.f = acaiVar;
        this.h = new ahfg(executor);
        this.e = executor2;
        this.i = executor3;
    }

    @Override // defpackage.acaj
    public final void c(long j) {
        this.j = -1.0f;
        this.h.execute(afwl.i(new jup(this, j, 19)));
    }

    @Override // defpackage.acaj
    public final void d(long j, float f) {
        float f2 = this.j;
        if (f2 == -1.0f || Math.abs(f - f2) >= 0.001f) {
            this.j = f;
            this.i.execute(afwl.i(new jup(this, j, 20)));
        }
    }

    @Override // defpackage.acaj
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.acaj
    public final void b() {
    }
}
