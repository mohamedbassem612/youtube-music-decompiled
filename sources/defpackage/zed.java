package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zed {
    public final boolean a;
    public volatile bse b;
    public volatile bse c;

    public zed(bse bseVar, boolean z) {
        this.b = bseVar;
        this.a = z;
    }

    public final int a() {
        return this.b.k;
    }

    public final int b() {
        return wgs.g(this.b.w, this.b.x);
    }

    public final String c() {
        return ahno.Z(this.b.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zed) && this.b.equals(((zed) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public zed() {
        throw null;
    }
}
