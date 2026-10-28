package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abru {
    public int a = 1;
    private boolean b;

    public final synchronized void a() {
        this.a = 2;
    }

    public final synchronized void b() {
        this.a = 1;
    }

    public final synchronized void c() {
        this.a = 3;
    }

    public final synchronized void d() {
        this.b = true;
    }

    public final synchronized void e() {
        this.b = false;
    }

    public final synchronized boolean f() {
        return this.b;
    }
}
