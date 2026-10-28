package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zag implements ckc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public zag(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.ckc
    public final void a(byte[] bArr, int i) {
        if (this.$cid != 0) {
            cjp cjpVar = ((cjs) this.a).k;
            cjpVar.getClass();
            cjpVar.obtainMessage(i, bArr).sendToTarget();
        } else {
            if (bArr == null || i == 3) {
                return;
            }
            zah zahVar = (zah) this.a;
            zkf.d(zahVar.b);
            zahVar.b.post(new qd(this, bArr, i, 15, (byte[]) null));
        }
    }
}
