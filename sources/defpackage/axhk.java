package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axhk implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht f = new axhk(5);
    static final aiht e = new axhk(4);
    static final aiht d = new axhk(3);
    static final aiht c = new axhk(2);
    static final aiht b = new axhk(1);
    static final aiht a = new axhk(0);

    private axhk(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i) {
        int i2 = this.$cid;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (a.aS(i) == 0) {
                                return false;
                            }
                        } else if (a.aX(i) == 0) {
                            return false;
                        }
                    } else if (a.bt(i) == 0) {
                        return false;
                    }
                } else if (a.aX(i) == 0) {
                    return false;
                }
            } else if (a.bc(i) == 0) {
                return false;
            }
        } else if (a.bt(i) == 0) {
            return false;
        }
        return true;
    }
}
