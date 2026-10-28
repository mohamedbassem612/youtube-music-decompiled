package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lui implements lyb {
    private final /* synthetic */ int $cid;

    public lui(int i) {
        this.$cid = i;
    }

    @Override // defpackage.lyb
    public final /* synthetic */ Object a(int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            lue lueVarA = lue.a(i);
            if (lueVarA != null) {
                return lueVarA;
            }
        } else if (i2 == 1) {
            lue lueVarA2 = lue.a(i);
            if (lueVarA2 != null) {
                return lueVarA2;
            }
        } else {
            if (i2 != 2) {
                lvs lvsVarA = lvs.a(i);
                return lvsVarA == null ? lvs.SCORING_FEATURE_TYPE_UNKNOWN : lvsVarA;
            }
            lue lueVarA3 = lue.a(i);
            if (lueVarA3 != null) {
                return lueVarA3;
            }
        }
        return lue.a;
    }
}
