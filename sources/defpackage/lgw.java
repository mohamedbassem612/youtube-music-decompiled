package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lgw implements lgv {
    private final lfv b;

    public lgw(lfv lfvVar) {
        this.b = lfvVar;
    }

    public final void a(String str, String str2, String str3, int i) {
        this.b.v().T(str == null ? "" : str, str2, str3 == null ? "" : str3, i, 0L);
    }

    @Override // defpackage.lgv
    public final void e(String str, String str2) {
        a(str, "param_dropped_count", str2, 1);
    }
}
