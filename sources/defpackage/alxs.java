package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum alxs implements aihr {
    INPUT_METHOD_UNKNOWN(0),
    KEYBOARD(1),
    PASTE(2),
    ON_SCREEN_KEYBOARD(3),
    IME(4),
    QUERY_BUILDER(5),
    SPEECH(6),
    HANDWRITING(7),
    TAB(8),
    GESTURE_DECODING_DYM_QUERY_BUILDER(9),
    LENS_CAMERA(10);

    public final int l;

    alxs(int i) {
        this.l = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
