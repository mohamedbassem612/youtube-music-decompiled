package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ardj implements aihr {
    EFFECT_SUBPACKAGE_ID_UNSPECIFIED(0),
    EFFECT_SUBPACKAGE_ID_EXPRESSIVE(1),
    EFFECT_SUBPACKAGE_ID_PRESET(2);

    public final int d;

    ardj(int i) {
        this.d = i;
    }

    public static ardj a(int i) {
        if (i == 0) {
            return EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
        }
        if (i == 1) {
            return EFFECT_SUBPACKAGE_ID_EXPRESSIVE;
        }
        if (i != 2) {
            return null;
        }
        return EFFECT_SUBPACKAGE_ID_PRESET;
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
