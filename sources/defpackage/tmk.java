package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tmk extends tmm {
    private final tnv a;

    public tmk(tnv tnvVar) {
        this.a = tnvVar;
    }

    @Override // defpackage.tmm, defpackage.tnx
    public final tnv a() {
        return this.a;
    }

    @Override // defpackage.tnx
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tnx)) {
            return false;
        }
        tnx tnxVar = (tnx) obj;
        return tnxVar.b() == 2 && this.a.equals(tnxVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Response{failure=" + this.a.toString() + '}';
    }
}
