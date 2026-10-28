package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum lvs implements lxx {
    SCORING_FEATURE_TYPE_UNKNOWN(0),
    SCORABLE_PROPERTY_RANKING(1);

    public final int c;

    lvs(int i) {
        this.c = i;
    }

    public static lvs a(int i) {
        if (i == 0) {
            return SCORING_FEATURE_TYPE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return SCORABLE_PROPERTY_RANKING;
    }
}
