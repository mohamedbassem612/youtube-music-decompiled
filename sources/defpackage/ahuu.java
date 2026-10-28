package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahuu {
    public final String a;
    public final boolean b;
    public final aglz c;
    public final ahut d = null;
    public final boolean e;
    public final int f;
    public final String g;
    public final Long h;
    public final agkz i;
    public final Integer j;
    public final Integer k;

    public ahuu(ahus ahusVar) {
        this.a = ahusVar.a;
        this.b = ahusVar.f;
        this.c = agkg.b(ahusVar.b);
        this.e = ahusVar.c;
        this.f = ahusVar.d;
        this.g = ahusVar.e;
        this.h = ahusVar.g;
        this.i = agkz.n(ahusVar.h);
        this.j = ahusVar.i;
        this.k = ahusVar.j;
    }

    public final String toString() {
        aglz aglzVar = this.c;
        return super.toString() + ": url=" + this.a + ", headers=" + aglzVar.toString() + ", allowRedirect=" + this.e + ", priority=" + this.f + ", httpMethod=" + this.g + ", postBodyData=null";
    }
}
