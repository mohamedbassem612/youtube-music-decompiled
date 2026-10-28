package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zbc extends zbb {
    final /* synthetic */ zbd a;

    public zbc(zbd zbdVar) {
        this.a = zbdVar;
    }

    @Override // defpackage.zbb, defpackage.cwj
    public final void e(long j, int i, int i2, int i3, cwi cwiVar) {
        zbd zbdVar = this.a;
        synchronized (zbdVar) {
            try {
                zbdVar.n(j);
                super.e(j, i, i2, i3, cwiVar);
            } catch (ywu | zau | zav e) {
                this.a.o(e);
            }
        }
    }
}
