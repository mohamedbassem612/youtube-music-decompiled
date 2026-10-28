package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avwj extends avwd {
    private static final long serialVersionUID = -5898283885385201806L;
    final int d = 1;

    @Override // defpackage.avwd
    public final void d() {
        if (this.b > this.d) {
            avwf avwfVar = (avwf) ((avwf) get()).get();
            if (avwfVar == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.b--;
            set(avwfVar);
        }
    }
}
