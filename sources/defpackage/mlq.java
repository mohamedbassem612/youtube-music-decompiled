package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mlq extends fky {

    @fmt(a = 13)
    mlt a;

    @fmt(a = 13)
    nay b;

    @fmt(a = 13)
    mlw c;

    @fmt(a = 13)
    tld d;

    @Override // defpackage.fky
    public final void b(aero aeroVar) {
        Object obj = aeroVar.b;
        int i = aeroVar.a;
        if (i == Integer.MIN_VALUE) {
            this.d = (tld) ((Object[]) obj)[0];
            return;
        }
        if (i == 0) {
            nay nayVar = this.b;
            nay nayVar2 = (nay) ((Object[]) obj)[0];
            if (nayVar2 == null || !nayVar2.equals(nayVar)) {
                nayVar = nayVar2;
            }
            this.b = nayVar;
        }
    }
}
