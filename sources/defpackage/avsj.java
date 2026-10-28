package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avsj extends avse {
    private static final long serialVersionUID = 3776720187248809713L;

    @Override // defpackage.avlg
    public final void c(Object obj) {
        long j;
        if (j()) {
            return;
        }
        this.a.kk(obj);
        do {
            j = get();
            if (j == 0) {
                return;
            }
        } while (!compareAndSet(j, (-1) + j));
    }
}
