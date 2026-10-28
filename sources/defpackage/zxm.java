package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zxm implements zsa {
    private final /* synthetic */ int $cid;
    final /* synthetic */ zsz a;

    public zxm(zsz zszVar, int i) {
        this.$cid = i;
        this.a = zszVar;
    }

    @Override // defpackage.zsa
    public final int a() {
        int i = this.$cid;
        zsz zszVar = this.a;
        return i != 0 ? (int) ((vmx) zszVar).c.c(1, 45671302L, 1L) : ((zxn) zszVar).a.a();
    }

    @Override // defpackage.zsa
    public final int b() {
        int i = this.$cid;
        zsz zszVar = this.a;
        return i != 0 ? (int) ((vmx) zszVar).c.c(0, 45671301L, 0L) : ((zxn) zszVar).a.b();
    }

    @Override // defpackage.zsa
    public final int c() {
        if (this.$cid != 0) {
            return (int) ((vmx) this.a).c.c(2, 45671303L, 0L);
        }
        return 5;
    }

    @Override // defpackage.zsa
    public final int d() {
        if (this.$cid != 0) {
            return (int) ((vmx) this.a).c.c(3, 45671304L, 30L);
        }
        return 7200;
    }

    @Override // defpackage.zsa
    public final boolean e() {
        if (this.$cid != 0) {
            return ((vmx) this.a).c.l(0, 45683537L, false);
        }
        return false;
    }
}
