package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class smm {
    public final String a;

    public smm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smm) {
            return this.a.equals(((smm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SelectionInstruction{opportunityId=" + this.a + '}';
    }

    public smm() {
        throw null;
    }
}
