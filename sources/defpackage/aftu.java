package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aftu implements afvn {
    private final /* synthetic */ int $cid;

    @Override // defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.$cid != 0) {
            afty.k();
            return;
        }
        afty.e.add(afty.g);
        qpj.a().post(afty.h);
    }
}
