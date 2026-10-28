package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afww implements afwu {
    final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(afwy.class, afwv.class, "currentMetadata");

    @Override // defpackage.afwu
    public final afwv a(afwy afwyVar) {
        return (afwv) this.a.get(afwyVar);
    }

    @Override // defpackage.afwu
    public final boolean b(afwy afwyVar, afwv afwvVar, afwv afwvVar2) {
        return a.aA(this.a, afwyVar, afwvVar, afwvVar2);
    }
}
