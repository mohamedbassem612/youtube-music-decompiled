package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum asmn implements aihr {
    DYNAMIC_PROP_TYPE_UNKNOWN(0),
    DYNAMIC_PROP_TYPE_BACKGROUND_COLOR(1),
    DYNAMIC_PROP_TYPE_ALPHA(2),
    DYNAMIC_PROP_TYPE_TRANSLATION_X(3),
    DYNAMIC_PROP_TYPE_TRANSLATION_Y(4),
    DYNAMIC_PROP_TYPE_SCALE(5),
    DYNAMIC_PROP_TYPE_ROTATION(6),
    DYNAMIC_PROP_TYPE_SCALE_X(7),
    DYNAMIC_PROP_TYPE_SCALE_Y(8);

    private final int k;

    asmn(int i) {
        this.k = i;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
