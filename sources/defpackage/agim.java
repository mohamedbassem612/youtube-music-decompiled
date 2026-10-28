package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agim extends agiq {
    public static final agim a = new agim();
    private static final long serialVersionUID = 0;

    private agim() {
        super("");
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.agiq
    /* JADX INFO: renamed from: a */
    public final int compareTo(agiq agiqVar) {
        return agiqVar == this ? 0 : 1;
    }

    @Override // defpackage.agiq
    public final Comparable b() {
        throw new IllegalStateException("range unbounded on this side");
    }

    @Override // defpackage.agiq
    public final void c(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override // defpackage.agiq, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((agiq) obj);
    }

    @Override // defpackage.agiq
    public final void d(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // defpackage.agiq
    public final boolean e(Comparable comparable) {
        return false;
    }

    @Override // defpackage.agiq
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
