package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yev extends yex {
    private final ygr a;

    public yev(ygr ygrVar) {
        this.a = ygrVar;
    }

    @Override // defpackage.yex, defpackage.ygq
    public final ygr a() {
        return this.a;
    }

    @Override // defpackage.ygq
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ygq)) {
            return false;
        }
        ygq ygqVar = (ygq) obj;
        return ygqVar.b() == 2 && this.a.equals(ygqVar.a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SegmentWriterOrError{error=" + this.a.toString() + '}';
    }
}
