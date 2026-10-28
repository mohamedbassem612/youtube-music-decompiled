package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axfo extends axcv {
    public final ahud c;

    public axfo(long j, axfo axfoVar, int i) {
        super(j, axfoVar, i);
        this.c = new ahud(axfn.f);
    }

    @Override // defpackage.axcv
    public final int a() {
        return axfn.f;
    }

    @Override // defpackage.axcv
    public final void k(int i) {
        ahud ahudVar = this.c;
        ahudVar.s(i).c(axfn.e);
        r();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + ']';
    }
}
