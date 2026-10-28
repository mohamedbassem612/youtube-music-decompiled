package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class rqp implements zws {
    final /* synthetic */ rqq a;

    public rqp(rqq rqqVar) {
        this.a = rqqVar;
    }

    @Override // defpackage.zws
    public final void c() {
        this.a.a();
    }

    @Override // defpackage.zws
    public final void d() {
        rqq rqqVar = this.a;
        rqqVar.f.a();
        if (rqqVar.c) {
            rqqVar.c = false;
        }
    }

    @Override // defpackage.zws
    public final void e(Exception exc) {
        rqq rqqVar = this.a;
        rqqVar.c();
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage != null) {
            tuk.o(rqqVar.e.g, localizedMessage, 1);
        }
    }
}
