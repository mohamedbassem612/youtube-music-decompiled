package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum anxv implements aihr {
    MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_UNKNOWN(0),
    MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_DESTRUCTIVE(1),
    MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_CONSTRUCTIVE(2),
    MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_UNDO(3);

    public final int e;

    anxv(int i) {
        this.e = i;
    }

    public static anxv a(int i) {
        if (i == 0) {
            return MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_DESTRUCTIVE;
        }
        if (i == 2) {
            return MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_CONSTRUCTIVE;
        }
        if (i != 3) {
            return null;
        }
        return MUSIC_SWIPEABLE_ROW_BUTTON_BACKGROUND_STYLE_UNDO;
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
