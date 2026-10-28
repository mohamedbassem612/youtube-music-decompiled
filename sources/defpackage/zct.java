package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class zct implements zcx {
    final zcs a;
    final /* synthetic */ zcy b;

    public zct(zcy zcyVar, zcs zcsVar) {
        this.b = zcyVar;
        this.a = zcsVar;
    }

    @Override // defpackage.zcx
    public final int b() {
        int iA = a();
        if (iA == 1) {
            return 0;
        }
        return this.b.a.a(iA - 1);
    }

    @Override // defpackage.zcx
    public final /* synthetic */ long c() {
        return -9223372036854775807L;
    }

    @Override // defpackage.zcx
    public boolean e() {
        throw null;
    }
}
