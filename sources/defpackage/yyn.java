package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yyn implements yug {
    private final /* synthetic */ int $cid;

    public /* synthetic */ yyn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.yug
    public final yuh a(wiu wiuVar, wja wjaVar) {
        int i = this.$cid;
        if (i == 0) {
            return new yuh(wiuVar, wjaVar.k(), zhu.DISABLE_AV1);
        }
        if (i != 1) {
            return i != 2 ? new yuh(wiuVar, wjaVar, zhu.DRM_SDR_FALLBACK) : new yuh(wiuVar, wjaVar.k(), zhu.DISABLE_AV1);
        }
        return new yuh(wiuVar, wjaVar, zhu.DRM_SDR_FALLBACK);
    }
}
