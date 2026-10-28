package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afwx implements afwu {
    @Override // defpackage.afwu
    public final afwv a(afwy afwyVar) {
        afwv afwvVar;
        synchronized (afwyVar) {
            afwvVar = afwyVar.currentMetadata;
        }
        return afwvVar;
    }

    @Override // defpackage.afwu
    public final boolean b(afwy afwyVar, afwv afwvVar, afwv afwvVar2) {
        synchronized (afwyVar) {
            if (afwyVar.currentMetadata != afwvVar) {
                return false;
            }
            afwyVar.currentMetadata = afwvVar2;
            return true;
        }
    }
}
