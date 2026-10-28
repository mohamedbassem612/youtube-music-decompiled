package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum aldh implements aihr {
    XENO_EFFECT_RENDERING_LAYER_UNKNOWN(0),
    XENO_EFFECT_RENDERING_LAYER_BACKGROUND(1),
    XENO_EFFECT_RENDERING_LAYER_CAMERA_PREPROCESSING(2),
    XENO_EFFECT_RENDERING_LAYER_GREEN_SCREEN(3),
    XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND(4),
    XENO_EFFECT_RENDERING_LAYER_OVERLAY(5),
    XENO_EFFECT_RENDERING_LAYER_POSTPROCESSING(6),
    XENO_EFFECT_RENDERING_LAYER_COLOR_CORRECTION(7),
    XENO_EFFECT_RENDERING_LAYER_LAYOUT(8);

    public final int j;

    aldh(int i) {
        this.j = i;
    }

    public static aldh a(int i) {
        switch (i) {
            case 0:
                return XENO_EFFECT_RENDERING_LAYER_UNKNOWN;
            case 1:
                return XENO_EFFECT_RENDERING_LAYER_BACKGROUND;
            case 2:
                return XENO_EFFECT_RENDERING_LAYER_CAMERA_PREPROCESSING;
            case 3:
                return XENO_EFFECT_RENDERING_LAYER_GREEN_SCREEN;
            case 4:
                return XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND;
            case 5:
                return XENO_EFFECT_RENDERING_LAYER_OVERLAY;
            case 6:
                return XENO_EFFECT_RENDERING_LAYER_POSTPROCESSING;
            case 7:
                return XENO_EFFECT_RENDERING_LAYER_COLOR_CORRECTION;
            case 8:
                return XENO_EFFECT_RENDERING_LAYER_LAYOUT;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
