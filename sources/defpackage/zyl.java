package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zyl implements sxu {
    final /* synthetic */ zym a;
    private final sxu b;

    public zyl(zym zymVar, sxu sxuVar) {
        this.a = zymVar;
        this.b = sxuVar;
    }

    @Override // defpackage.sxu
    public final void b(Object obj, Object obj2) {
        zym zymVar = this.a;
        zymVar.a.c(obj, new zrr(obj2, zymVar.b.f().toEpochMilli()));
        this.b.b(obj, obj2);
    }

    @Override // defpackage.sxu
    public final void iT(Object obj, Exception exc) {
        this.b.iT(obj, exc);
    }
}
