package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qdj implements qdl {
    private final axia a;
    private final Comparable b;

    public qdj(axia axiaVar, Comparable comparable) {
        this.a = axiaVar;
        this.b = comparable;
    }

    @Override // defpackage.qdl
    public final long a() {
        return this.a.getSerializedSize();
    }

    @Override // defpackage.qdl
    public final /* synthetic */ Object b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((qdj) obj).b);
    }
}
