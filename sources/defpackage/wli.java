package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class wli {
    public aihn f;
    public final aihn g;
    final byte h;
    final boolean i;
    final /* synthetic */ wll k;
    public long b = -1;
    public long c = -1;
    public long e = -1;
    long d = -1;
    public String a = "";
    public final awli j = new awli();

    public wli(wll wllVar, aihn aihnVar, byte b, boolean z) {
        this.k = wllVar;
        this.g = aihnVar;
        this.f = aihnVar;
        this.h = b;
        this.i = z;
    }

    final void a(aihn aihnVar, long j) {
        this.f = aihnVar;
        this.b = j;
        if (this.i) {
            this.c = j;
            this.j.kk(aihnVar);
        }
    }

    final void b() {
        this.b = -1L;
        this.c = -1L;
        this.a = "";
        this.f = this.g;
    }

    public final void c() {
        if (this.e <= 0) {
            this.e = this.k.b.b();
            this.j.kk(this.f);
        }
    }

    public final String toString() {
        return this.g.getClass().toString();
    }
}
