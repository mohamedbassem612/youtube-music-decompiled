package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zco {
    public final zcf a;
    public final yoe b;
    public final zjv c;
    public final yus d;
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    public zco(zcf zcfVar, yoe yoeVar, zjv zjvVar, boolean z) {
        boolean z2 = false;
        if (z && yoeVar.k()) {
            z2 = true;
        }
        this(zcfVar, yoeVar, zjvVar, z2, yus.a);
    }

    public final zco a(yus yusVar) {
        return new zco(this.a, this.b, this.c, this.e, yusVar);
    }

    private zco(zcf zcfVar, yoe yoeVar, zjv zjvVar, boolean z, yus yusVar) {
        this.a = zcfVar;
        this.b = yoeVar;
        this.c = zjvVar;
        this.e = z;
        this.d = yusVar;
    }
}
