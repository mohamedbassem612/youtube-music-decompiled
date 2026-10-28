package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aabf implements aabo {
    @Override // defpackage.aabo
    public final void a(ajda ajdaVar, xgn xgnVar, aabr aabrVar, atr atrVar) {
        if (ajdaVar != null) {
            ajcu ajcuVar = ajdaVar.e;
            if (ajcuVar == null) {
                ajcuVar = ajcu.a;
            }
            if (ajcuVar.l || !ajcuVar.k.isEmpty()) {
                atrVar.t = ajcuVar.k;
                atrVar.u = ajcuVar.m;
            }
        }
    }
}
