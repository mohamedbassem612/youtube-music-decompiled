package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class plq {
    private final boolean a;

    public plq(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plq)) {
            return false;
        }
        boolean z = ((plq) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "ExpeditedJobs(registration=false)";
    }

    public plq() {
        this(null);
    }
}
