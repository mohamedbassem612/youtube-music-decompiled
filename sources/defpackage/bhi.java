package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhi {
    public final String a;

    public bhi(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bhi) {
            return awrc.c(this.a, ((bhi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
