package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wat extends wau {
    private final wbi a;

    public wat(wbi wbiVar) {
        this.a = wbiVar;
    }

    @Override // defpackage.wbc
    public final int b() {
        return 1;
    }

    @Override // defpackage.wau, defpackage.wbc
    public final wbi c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wbc)) {
            return false;
        }
        wbc wbcVar = (wbc) obj;
        return wbcVar.b() == 1 && this.a.equals(wbcVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Edit{write=" + this.a.toString() + '}';
    }
}
