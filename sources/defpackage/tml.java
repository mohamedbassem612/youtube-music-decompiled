package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tml extends tmm {
    public final tnw a;

    public tml(tnw tnwVar) {
        this.a = tnwVar;
    }

    @Override // defpackage.tnx
    public final int b() {
        return 1;
    }

    @Override // defpackage.tmm, defpackage.tnx
    public final tnw c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tnx)) {
            return false;
        }
        tnx tnxVar = (tnx) obj;
        return tnxVar.b() == 1 && this.a.equals(tnxVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Response{success=" + this.a.toString() + '}';
    }
}
