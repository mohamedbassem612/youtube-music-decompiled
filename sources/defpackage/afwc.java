package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afwc extends afvk {
    final /* synthetic */ afvl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwc(afuu afuuVar, afvl afvlVar) {
        super(afuuVar);
        this.a = afvlVar;
    }

    @Override // defpackage.afvk, defpackage.afvn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        afvl afvlVar = this.a;
        if (afvlVar != null) {
            afty.d(afvlVar);
        }
    }
}
