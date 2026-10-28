package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoes {
    private final aoeu a;

    public aoes(aoeu aoeuVar) {
        this.a = aoeuVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aoes) && this.a.equals(((aoes) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "OfflineFutureUnplayableInfoModel{" + String.valueOf(this.a) + '}';
    }
}
