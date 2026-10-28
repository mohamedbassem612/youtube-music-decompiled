package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abcg implements abch {
    private final /* synthetic */ int $cid;

    public abcg(int i) {
        this.$cid = i;
    }

    @Override // defpackage.abch
    public final double a(double d) {
        int i = this.$cid;
        if (i == 0) {
            double dDoubleValue = ((Double) b.clamp(Double.valueOf(d))).doubleValue();
            return dDoubleValue <= 0.08333333333333333d ? Math.sqrt(dDoubleValue * 3.0d) : (Math.log((dDoubleValue * 12.0d) - 0.28466892d) * 0.17883277d) + 0.55991073d;
        }
        if (i == 1) {
            return Math.pow(((Double) a.clamp(Double.valueOf(d))).doubleValue(), 0.45454545454545453d);
        }
        if (i == 2) {
            return ((Double) b.clamp(Double.valueOf(d))).doubleValue();
        }
        double dDoubleValue2 = ((Double) b.clamp(Double.valueOf(d))).doubleValue();
        return Math.pow(((Math.pow(dDoubleValue2, 0.1593017578125d) * 18.8515625d) + 0.8359375d) / ((Math.pow(dDoubleValue2, 0.1593017578125d) * 18.6875d) + 1.0d), 78.84375d);
    }

    @Override // defpackage.abch
    public final double b() {
        int i = this.$cid;
        if (i != 0) {
            return (i == 1 || i == 2) ? 1.0d : 10000.0d;
        }
        return 1000.0d;
    }

    @Override // defpackage.abch
    public final double c(double d) {
        double dExp;
        double d2;
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                return Math.pow(((Double) a.clamp(Double.valueOf(d))).doubleValue(), 2.2d);
            }
            if (i == 2) {
                return ((Double) b.clamp(Double.valueOf(d))).doubleValue();
            }
            double dPow = Math.pow(((Double) a.clamp(Double.valueOf(d))).doubleValue(), 0.012683313515655966d);
            return Math.pow(Math.max(0.0d, ((-0.8359375d) + dPow) / (18.8515625d - (dPow * 18.6875d))), 6.277394636015326d);
        }
        double dDoubleValue = ((Double) b.clamp(Double.valueOf(d))).doubleValue();
        if (dDoubleValue <= 0.5d) {
            dExp = dDoubleValue * dDoubleValue;
            d2 = 3.0d;
        } else {
            dExp = Math.exp((dDoubleValue - 0.55991073d) / 0.17883277d) + 0.28466892d;
            d2 = 12.0d;
        }
        return dExp / d2;
    }

    @Override // defpackage.abch
    public final boolean d() {
        int i = this.$cid;
        return (i == 1 || i == 2) ? false : true;
    }
}
