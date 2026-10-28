package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajhj implements aihr {
    AUDIO_QUALITY_SETTING_UNKNOWN(0),
    AUDIO_QUALITY_SETTING_HIGHER_QUALITY(1),
    AUDIO_QUALITY_SETTING_NORMAL_QUALITY(2);

    public final int d;

    ajhj(int i) {
        this.d = i;
    }

    public static ajhj a(int i) {
        if (i == 0) {
            return AUDIO_QUALITY_SETTING_UNKNOWN;
        }
        if (i == 1) {
            return AUDIO_QUALITY_SETTING_HIGHER_QUALITY;
        }
        if (i != 2) {
            return null;
        }
        return AUDIO_QUALITY_SETTING_NORMAL_QUALITY;
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
