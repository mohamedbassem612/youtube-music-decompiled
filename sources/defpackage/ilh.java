package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ilh extends hmy {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilh(String str) {
        super(null, null, null);
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ilh) && awrc.c(this.a, ((ilh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoResults(query=" + this.a + ')';
    }
}
