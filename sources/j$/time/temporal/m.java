package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements l {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                int iH = temporal.h(a.DAY_OF_WEEK);
                if (iH == i) {
                    return temporal;
                }
                int i2 = iH - i;
                return temporal.b(i2 >= 0 ? 7 - i2 : -i2, ChronoUnit.DAYS);
            default:
                int iH2 = temporal.h(a.DAY_OF_WEEK);
                if (iH2 == i) {
                    return temporal;
                }
                int i3 = i - iH2;
                return temporal.y(i3 >= 0 ? 7 - i3 : -i3, ChronoUnit.DAYS);
        }
    }
}
