package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class mli extends fky {

    @fmt(a = 13)
    Boolean a;

    @Override // defpackage.fky
    public final void b(aero aeroVar) {
        Object obj = aeroVar.b;
        if (aeroVar.a == 0) {
            Boolean bool = this.a;
            boolean z = false;
            if (bool != null && !bool.booleanValue()) {
                z = true;
            }
            this.a = Boolean.valueOf(z);
        }
    }
}
