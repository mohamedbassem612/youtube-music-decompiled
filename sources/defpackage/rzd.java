package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rzd implements ryy, sog {
    private final /* synthetic */ int $cid;
    public int a = -1;

    public rzd(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ryy
    public final String a() {
        return "-1";
    }

    @Override // defpackage.ryy
    public final String b(shh shhVar) {
        int i = this.$cid;
        int i2 = this.a;
        return i != 0 ? Integer.toString(i2) : Integer.toString(i2);
    }

    @Override // defpackage.sog
    public final void u(int i, int i2) {
        if (this.$cid != 0) {
            this.a = i;
        } else {
            this.a = i2;
        }
    }

    @Override // defpackage.sog
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.sog
    public final /* synthetic */ void y() {
    }
}
