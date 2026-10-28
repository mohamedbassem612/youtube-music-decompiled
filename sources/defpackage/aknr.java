package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aknr {
    private final aknv a;

    public aknr(aknv aknvVar) {
        this.a = aknvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aknr) && this.a.equals(((aknr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "DrmErrorInfoModel{" + String.valueOf(this.a) + '}';
    }
}
