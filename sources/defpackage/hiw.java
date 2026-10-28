package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hiw {
    private final String a;

    public final boolean equals(Object obj) {
        return (obj instanceof hiw) && awrc.c(this.a, ((hiw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResponseId(value=" + this.a + ')';
    }
}
