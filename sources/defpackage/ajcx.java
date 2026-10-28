package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ajcx implements aihr {
    ICON_IMAGE_STYLE_DEFAULT(0),
    ICON_IMAGE_STYLE_SCALE(1),
    ICON_IMAGE_STYLE_CROP(2),
    ICON_IMAGE_STYLE_UNCHANGED(3);

    private final int f;

    ajcx(int i) {
        this.f = i;
    }

    public static ajcx a(int i) {
        if (i == 0) {
            return ICON_IMAGE_STYLE_DEFAULT;
        }
        if (i == 1) {
            return ICON_IMAGE_STYLE_SCALE;
        }
        if (i == 2) {
            return ICON_IMAGE_STYLE_CROP;
        }
        if (i != 3) {
            return null;
        }
        return ICON_IMAGE_STYLE_UNCHANGED;
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
