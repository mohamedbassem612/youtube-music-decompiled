package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class soj {
    private final aolc a;

    public soj(aolc aolcVar) {
        this.a = aolcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof soj) {
            return this.a.equals(((soj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AdDisclosureBannerState{renderer=" + String.valueOf(this.a) + '}';
    }

    public soj() {
        throw null;
    }
}
