package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class was extends wau {
    private final wbk a;

    public was(wbk wbkVar) {
        this.a = wbkVar;
    }

    @Override // defpackage.wau, defpackage.wbc
    public final wbk a() {
        return this.a;
    }

    @Override // defpackage.wbc
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wbc)) {
            return false;
        }
        wbc wbcVar = (wbc) obj;
        return wbcVar.b() == 2 && this.a.equals(wbcVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Edit{update=" + this.a.toString() + '}';
    }
}
