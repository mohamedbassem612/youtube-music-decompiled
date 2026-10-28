package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awex implements Runnable {
    final /* synthetic */ awey a;
    private final awew b;

    public awex(awey aweyVar, awew awewVar) {
        this.a = aweyVar;
        this.b = awewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.ak(this.b);
    }
}
