package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aoer {
    private final aoet a;

    public aoer(aoet aoetVar) {
        this.a = aoetVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aoer) && this.a.equals(((aoer) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "ClientEndpointBuilderDataModel{" + String.valueOf(this.a) + '}';
    }
}
