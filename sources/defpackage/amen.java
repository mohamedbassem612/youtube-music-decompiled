package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum amen implements aihr {
    INTERACTIVITY_WIDGET_ANIMATION_TYPE_UNSPECIFIED(0),
    INTERACTIVITY_WIDGET_ANIMATION_TYPE_FADE_IN(1),
    INTERACTIVITY_WIDGET_ANIMATION_TYPE_FADE_OUT(2),
    INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_UP(3),
    INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_UP_AND_FADE_OUT(4),
    INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_UP_AND_FADE_OUT_CLIPPED(6),
    INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_UP_NOT_COVER_CHAT(5),
    INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_DOWN_AND_FADE_IN_CLIPPED(7);

    private final int j;

    amen(int i2) {
        this.j = i2;
    }

    public static amen a(int i2) {
        switch (i2) {
            case 0:
                return INTERACTIVITY_WIDGET_ANIMATION_TYPE_UNSPECIFIED;
            case 1:
                return INTERACTIVITY_WIDGET_ANIMATION_TYPE_FADE_IN;
            case 2:
                return INTERACTIVITY_WIDGET_ANIMATION_TYPE_FADE_OUT;
            case 3:
                return INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_UP;
            case 4:
                return INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_UP_AND_FADE_OUT;
            case 5:
                return INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_UP_NOT_COVER_CHAT;
            case 6:
                return INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_UP_AND_FADE_OUT_CLIPPED;
            case 7:
                return INTERACTIVITY_WIDGET_ANIMATION_TYPE_SLIDE_DOWN_AND_FADE_IN_CLIPPED;
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
