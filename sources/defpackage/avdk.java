package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdk {
    private final avkd a;
    private final avgh b = avjt.f();
    private final avgh c = avjt.f();
    private final avgh d = avjt.f();
    private volatile long e;

    public avdk(avkd avkdVar) {
        this.a = avkdVar;
    }

    public final void a(boolean z) {
        if (z) {
            this.c.a();
        } else {
            this.d.a();
        }
    }

    public final void b() {
        this.b.a();
        this.e = this.a.a();
    }
}
