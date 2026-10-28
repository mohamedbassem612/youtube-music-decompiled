package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zcw extends zct {
    final /* synthetic */ zcy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcw(zcy zcyVar, zcs zcsVar) {
        super(zcyVar, zcsVar);
        this.c = zcyVar;
    }

    @Override // defpackage.zcx
    public final int a() {
        return this.a.b;
    }

    @Override // defpackage.zcx
    public final void d() {
        this.a.b++;
    }

    @Override // defpackage.zct, defpackage.zcx
    public final boolean e() {
        int iA = a();
        if (iA <= 1) {
            return true;
        }
        wiu wiuVar = (wiu) this.c.b.io();
        return iA < ((wiuVar.d.b & 1) != 0 ? wiuVar.E().f : 10);
    }
}
