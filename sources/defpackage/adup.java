package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class adup implements acjy {
    private final acjy a;
    private final apjh b;
    private Object c;

    public adup(acjy acjyVar, apjh apjhVar) {
        acjyVar.getClass();
        this.a = acjyVar;
        this.b = apjhVar;
        this.c = apjhVar;
    }

    @Override // defpackage.acjy
    public final apjh a() {
        return this.b;
    }

    @Override // defpackage.acjy
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.acjy
    public final void c(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.acjy
    public final byte[] d() {
        return this.a.d();
    }
}
