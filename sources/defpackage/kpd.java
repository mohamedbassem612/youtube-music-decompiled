package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpd {
    public kpe a;
    public kpe b;
    public kox c;
    public klq[] d;
    public int f;
    private final Runnable g = new gkz(3);
    public boolean e = true;

    public final hed a() {
        kro.d(this.a != null, "Must set register function");
        kro.d(this.b != null, "Must set unregister function");
        kro.d(this.c != null, "Must set holder");
        if (this.c.b != null) {
            return new hed(new kpc(this, this.c, this.d, this.e, this.f), new hhc(this), this.g);
        }
        throw new NullPointerException("Key must not be null");
    }
}
