package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class yew extends yex {
    private final yfi a;

    public yew(yfi yfiVar) {
        this.a = yfiVar;
    }

    @Override // defpackage.ygq
    public final int b() {
        return 1;
    }

    @Override // defpackage.yex, defpackage.ygq
    public final yfi c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ygq)) {
            return false;
        }
        ygq ygqVar = (ygq) obj;
        return ygqVar.b() == 1 && this.a.equals(ygqVar.c());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SegmentWriterOrError{writer=" + this.a.toString() + '}';
    }
}
