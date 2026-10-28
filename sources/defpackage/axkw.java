package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axkw {
    private static final Object b = new Object();
    public volatile axkv a;
    private final axkx c;

    public axkw(axkx axkxVar) {
        this.c = axkxVar;
    }

    public final axkv a() {
        if (this.a == null) {
            synchronized (b) {
                if (this.a == null) {
                    b();
                }
            }
        }
        return this.a;
    }

    public final void b() {
        this.a = this.c.supply();
    }
}
