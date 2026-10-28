package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class okf extends okg {
    private final oip a;

    public okf(oip oipVar) {
        this.a = oipVar;
    }

    @Override // defpackage.okh
    public final int b() {
        return 1;
    }

    @Override // defpackage.okg, defpackage.okh
    public final oip d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof okh)) {
            return false;
        }
        okh okhVar = (okh) obj;
        return okhVar.b() == 1 && this.a.equals(okhVar.d());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
