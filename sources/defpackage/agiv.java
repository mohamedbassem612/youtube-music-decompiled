package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agiv extends agqs {
    final /* synthetic */ Iterable[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agiv(Iterable[] iterableArr) {
        super(2, 0);
        this.a = iterableArr;
    }

    @Override // defpackage.agqs
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a[i].iterator();
    }
}
