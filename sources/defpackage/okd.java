package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class okd extends okg {
    private final ohp a;

    public okd(ohp ohpVar) {
        this.a = ohpVar;
    }

    @Override // defpackage.okg, defpackage.okh
    public final ohp a() {
        return this.a;
    }

    @Override // defpackage.okh
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof okh)) {
            return false;
        }
        okh okhVar = (okh) obj;
        return okhVar.b() == 3 && this.a.equals(okhVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
