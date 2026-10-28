package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aldi implements aihr {
    XENO_EFFECT_RENDERING_PRIORITY_UNKNOWN(0),
    XENO_EFFECT_RENDERING_PRIORITY_LAYER_FIRST(1),
    XENO_EFFECT_RENDERING_PRIORITY_LAYER_EXCLUSIVE(2),
    XENO_EFFECT_RENDERING_PRIORITY_EXCLUSIVE(3);

    private final int f;

    aldi(int i) {
        this.f = i;
    }

    public static aldi a(int i) {
        if (i == 0) {
            return XENO_EFFECT_RENDERING_PRIORITY_UNKNOWN;
        }
        if (i == 1) {
            return XENO_EFFECT_RENDERING_PRIORITY_LAYER_FIRST;
        }
        if (i == 2) {
            return XENO_EFFECT_RENDERING_PRIORITY_LAYER_EXCLUSIVE;
        }
        if (i != 3) {
            return null;
        }
        return XENO_EFFECT_RENDERING_PRIORITY_EXCLUSIVE;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
