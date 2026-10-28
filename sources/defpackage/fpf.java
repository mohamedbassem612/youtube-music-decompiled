package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpf {
    private final fna i = fna.P;
    private float j = 4.0f;
    public boolean a = false;
    public boolean b = false;
    public boolean c = fox.a;
    public boolean d = fna.t;
    private final boolean k = fna.h;
    private final boolean l = fna.g;
    public int e = -1;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;

    static {
        boolean z = fna.a;
    }

    public final fpg a() {
        return new fpg(this.j, this.i, this.a, this.c, this.b, this.k, this.l, this.e, this.f, this.g, this.h, this.d);
    }

    public final void b(float f) {
        if (f >= 0.0f) {
            this.j = f;
        } else {
            throw new IllegalArgumentException("Range ratio cannot be negative: " + f);
        }
    }
}
