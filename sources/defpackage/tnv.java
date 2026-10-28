package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tnv {
    public final toe a;

    public tnv(toe toeVar) {
        if (toeVar == null) {
            throw new NullPointerException("Null cause");
        }
        this.a = toeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tnv) {
            return this.a.equals(((tnv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Failure{cause=" + this.a.toString() + '}';
    }

    public tnv() {
        throw null;
    }
}
