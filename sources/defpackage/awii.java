package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awii extends avma {
    volatile boolean a;
    private final avnt b;
    private final avmm c;
    private final avnt d;
    private final awiy e;

    public awii(awiy awiyVar) {
        this.e = awiyVar;
        avnt avntVar = new avnt();
        this.b = avntVar;
        avmm avmmVar = new avmm();
        this.c = avmmVar;
        avnt avntVar2 = new avnt();
        this.d = avntVar2;
        avntVar2.c(avntVar);
        avntVar2.c(avmmVar);
    }

    @Override // defpackage.avma
    public final avmn a(Runnable runnable) {
        if (this.a) {
            return avns.a;
        }
        return this.e.h(runnable, 0L, TimeUnit.MILLISECONDS, this.b);
    }

    @Override // defpackage.avma
    public final avmn b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.a ? avns.a : this.e.h(runnable, j, timeUnit, this.c);
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.d.dispose();
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return this.a;
    }
}
