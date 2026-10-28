package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wqe {
    public final alrc a;
    private final int b;

    public wqe(alrc alrcVar, int i) {
        this.a = alrcVar;
        this.b = i;
    }

    public final airk a() {
        alrc alrcVar = this.a;
        if ((alrcVar.b & 64) == 0) {
            return null;
        }
        alqz alqzVar = alrcVar.f;
        if (alqzVar == null) {
            alqzVar = alqz.a;
        }
        return alqzVar.b == 77195710 ? (airk) alqzVar.c : airk.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wqe) {
            return this.a.equals(((wqe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Guide{ type = " + (this.b != 3 ? "NEW" : "CACHED") + ", proto = " + this.a.toString() + " }";
    }
}
