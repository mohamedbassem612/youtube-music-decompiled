package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum aqge implements aihr {
    SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED(0),
    SURVEY_DISPLAY_TRIGGER_UI_EVENT_APP_FOREGROUNDED(1);

    private final int d;

    aqge(int i) {
        this.d = i;
    }

    public static aqge a(int i) {
        if (i == 0) {
            return SURVEY_DISPLAY_TRIGGER_UI_EVENT_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return SURVEY_DISPLAY_TRIGGER_UI_EVENT_APP_FOREGROUNDED;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
