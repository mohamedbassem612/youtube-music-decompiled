package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeoy {
    public final String a;
    public final ajmm b;

    public aeoy(String str, ajmm ajmmVar) {
        if (str == null) {
            throw new NullPointerException("Null filterChipBarId");
        }
        this.a = str;
        if (ajmmVar == null) {
            throw new NullPointerException("Null browseFormData");
        }
        this.b = ajmmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeoy) {
            aeoy aeoyVar = (aeoy) obj;
            if (this.a.equals(aeoyVar.a) && this.b.equals(aeoyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "FilterState{filterChipBarId=" + this.a + ", browseFormData=" + this.b.toString() + '}';
    }

    public aeoy() {
        throw null;
    }
}
