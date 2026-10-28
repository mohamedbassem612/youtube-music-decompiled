package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axfa extends axez {
    public final Runnable a;

    public axfa(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        Runnable runnable = this.a;
        String strA = awuw.a(runnable);
        String strB = awuw.b(runnable);
        long j = this.g;
        boolean z = this.h;
        String str = axfb.a;
        return "Task[" + strA + '@' + strB + ", " + j + ", " + (true != z ? "Non-blocking" : "Blocking") + ']';
    }
}
