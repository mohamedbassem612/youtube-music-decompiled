package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rio {
    public final Object a = new Object();
    public int b = 0;
    public int c = 0;
    public bta d;

    public final int a() {
        int i;
        synchronized (this.a) {
            i = this.b;
        }
        return i;
    }

    final int b() {
        int i;
        synchronized (this.a) {
            i = this.c;
        }
        return i;
    }

    public final bta c() {
        bta btaVar;
        synchronized (this.a) {
            btaVar = this.d;
        }
        return btaVar;
    }

    public final void d() {
        synchronized (this.a) {
            this.b = 0;
        }
    }
}
