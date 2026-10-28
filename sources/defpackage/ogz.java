package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ogz extends nsa {
    final /* synthetic */ ohb a;

    public ogz(ohb ohbVar) {
        this.a = ohbVar;
    }

    @Override // defpackage.nsa
    public final void a(ogy ogyVar) {
        ohb ohbVar = this.a;
        aha ahaVar = ohbVar.b;
        if (((Boolean) ahaVar.get(ogyVar)).booleanValue()) {
            return;
        }
        ahaVar.put(ogyVar, Boolean.TRUE);
        ohbVar.c++;
        ohbVar.a();
    }
}
