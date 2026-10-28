package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum jqz implements aihr {
    TRACK_TYPE_AUDIO(1),
    TRACK_TYPE_VIDEO(2),
    TRACK_TYPE_TEXT(4);

    public final int d;

    jqz(int i) {
        this.d = i;
    }

    public static jqz a(int i) {
        if (i == 1) {
            return TRACK_TYPE_AUDIO;
        }
        if (i == 2) {
            return TRACK_TYPE_VIDEO;
        }
        if (i != 4) {
            return null;
        }
        return TRACK_TYPE_TEXT;
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
