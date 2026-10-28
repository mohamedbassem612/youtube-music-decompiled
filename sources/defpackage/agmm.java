package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
abstract class agmm implements agms {
    final Object a;
    final int b;

    public agmm(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // defpackage.agms
    public final int a() {
        return this.b;
    }

    @Override // defpackage.agms
    public agms b() {
        return null;
    }

    @Override // defpackage.agms
    public final Object c() {
        return this.a;
    }
}
