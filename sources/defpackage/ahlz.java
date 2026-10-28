package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ahlz implements ahgy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ahlz(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahgy
    public final ahfv a(ahgb ahgbVar, ahgj ahgjVar) {
        switch (this.$cid) {
            case 0:
                return ahma.b(ahgbVar, ahgjVar);
            case 1:
                return ahma.d(ahgbVar);
            case 2:
                return ahmd.d(ahgbVar);
            case 3:
                return ahmd.b(ahgbVar, ahgjVar);
            case 4:
                return ahmg.c(ahgbVar);
            case 5:
                return ahmg.b(ahgbVar, ahgjVar);
            case 6:
                return ahmj.d(ahgbVar);
            case 7:
                return ahmj.b(ahgbVar, ahgjVar);
            case 8:
                return ahmn.d(ahgbVar);
            default:
                return ahmn.b(ahgbVar, ahgjVar);
        }
    }
}
