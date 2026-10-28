package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ajbi implements aihr {
    ANDROID_AUDIO_CONTENT_TYPE_UNKNOWN(0),
    ANDROID_AUDIO_CONTENT_TYPE_MUSIC(1),
    ANDROID_AUDIO_CONTENT_TYPE_SPEECH(2);

    private final int e;

    ajbi(int i) {
        this.e = i;
    }

    public static ajbi a(int i) {
        if (i == 0) {
            return ANDROID_AUDIO_CONTENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return ANDROID_AUDIO_CONTENT_TYPE_MUSIC;
        }
        if (i != 2) {
            return null;
        }
        return ANDROID_AUDIO_CONTENT_TYPE_SPEECH;
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
