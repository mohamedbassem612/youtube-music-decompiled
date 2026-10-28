package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wbm implements nsr {
    public final awmd a;
    private final wbz b;

    public wbm(awmd awmdVar, wbz wbzVar) {
        this.b = wbzVar;
        this.a = awmdVar;
    }

    private final wek c() {
        return this.b.c();
    }

    @Override // defpackage.nsr
    public final avlr a(String str) {
        return c().k(str).K(new uxe(15));
    }

    @Override // defpackage.nsr
    public final /* synthetic */ void b(String str, byte[] bArr) {
        avlb.h(new hlm(this, c(), str, bArr, 14)).F(new hrj(7), new vqe(8));
    }
}
