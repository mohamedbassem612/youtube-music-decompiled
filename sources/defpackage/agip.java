package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agip extends agiq {
    private static final long serialVersionUID = 0;

    @Override // defpackage.agiq
    public final void c(StringBuilder sb) {
        sb.append('[');
        sb.append(this.b);
    }

    @Override // defpackage.agiq
    public final void d(StringBuilder sb) {
        sb.append(this.b);
        sb.append(')');
    }

    @Override // defpackage.agiq
    public final boolean e(Comparable comparable) {
        agpf agpfVar = agpf.a;
        return this.b.compareTo(comparable) <= 0;
    }

    @Override // defpackage.agiq
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "\\" + this.b.toString() + '/';
    }
}
