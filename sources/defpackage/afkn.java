package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afkn implements aheh {
    final /* synthetic */ afko a;

    public afkn(afko afkoVar) {
        this.a = afkoVar;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.aheh
    public final void b(Object obj) {
        afko afkoVar = this.a;
        afkoVar.e = obj;
        afkoVar.b = true;
        afkoVar.a();
    }
}
