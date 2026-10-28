package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awus extends awom {
    public static final ahx b = new ahx();
    public final String a;

    public awus(String str) {
        super(b);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof awus) && awrc.c(this.a, ((awus) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.a + ')';
    }
}
