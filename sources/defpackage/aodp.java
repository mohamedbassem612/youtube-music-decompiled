package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aodp implements aihr {
    OFFLINE_AUDIO_QUALITY_UNKNOWN(0),
    OFFLINE_AUDIO_QUALITY_LOW(1),
    OFFLINE_AUDIO_QUALITY_MEDIUM(2),
    OFFLINE_AUDIO_QUALITY_HIGH(3);

    public final int e;

    aodp(int i) {
        this.e = i;
    }

    public static aodp a(int i) {
        if (i == 0) {
            return OFFLINE_AUDIO_QUALITY_UNKNOWN;
        }
        if (i == 1) {
            return OFFLINE_AUDIO_QUALITY_LOW;
        }
        if (i == 2) {
            return OFFLINE_AUDIO_QUALITY_MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return OFFLINE_AUDIO_QUALITY_HIGH;
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
