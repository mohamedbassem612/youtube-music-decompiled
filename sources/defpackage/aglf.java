package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aglf extends agkl {
    final /* synthetic */ aglh a;

    public aglf(aglh aglhVar) {
        this.a = aglhVar;
    }

    @Override // defpackage.agkl
    public final agkj a() {
        return this.a;
    }

    @Override // defpackage.agkz
    public final agke h() {
        return new agle(this);
    }

    @Override // defpackage.agkz, defpackage.agjw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final agqr iterator() {
        return g().listIterator(0);
    }

    @Override // defpackage.agkl, defpackage.agkz, defpackage.agjw
    public Object writeReplace() {
        return super.writeReplace();
    }
}
