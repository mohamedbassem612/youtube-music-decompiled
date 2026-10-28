package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class iav implements sxu {
    final /* synthetic */ iaw a;
    private final String b;

    public iav(iaw iawVar, String str) {
        this.a = iawVar;
        this.b = str;
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        if (((absh) obj2).c - 1 == 2) {
            iaw iawVar = this.a;
            String str = this.b;
            iawVar.f.f(str);
            iawVar.c(str);
            String str2 = iawVar.d.d;
            iawVar.e.d(str, false);
        }
    }

    @Override // defpackage.sxu
    public final /* bridge */ /* synthetic */ void iT(Object obj, Exception exc) {
        zvp.a(zvn.b, zvm.k, "Could not get playability result: ".concat(String.valueOf(String.valueOf(exc))));
    }
}
