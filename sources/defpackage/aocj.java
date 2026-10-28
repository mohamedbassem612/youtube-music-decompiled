package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aocj implements aihr {
    NOTIFICATION_SURVEY_LAYOUT_TYPE_UNKNOWN(0),
    NOTIFICATION_SURVEY_LAYOUT_TYPE_FIVE_SCALE(1),
    NOTIFICATION_SURVEY_LAYOUT_TYPE_FIVE_SCALE_12_PLUS(2);

    private final int e;

    aocj(int i) {
        this.e = i;
    }

    public static aocj a(int i) {
        if (i == 0) {
            return NOTIFICATION_SURVEY_LAYOUT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return NOTIFICATION_SURVEY_LAYOUT_TYPE_FIVE_SCALE;
        }
        if (i != 2) {
            return null;
        }
        return NOTIFICATION_SURVEY_LAYOUT_TYPE_FIVE_SCALE_12_PLUS;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
