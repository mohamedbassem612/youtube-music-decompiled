package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public enum anvx implements aihr {
    MUSIC_RADIO_BUILDER_BUTTON_STATE_UKNNOWN(0),
    MUSIC_RADIO_BUILDER_BUTTON_STATE_SHOWING_INVALID_RADIO_MESSAGE(1),
    MUSIC_RADIO_BUILDER_BUTTON_STATE_SHOWING_LOADING_SPINNER(2),
    MUSIC_RADIO_BUILDER_BUTTON_STATE_CLICKABLE(3),
    MUSIC_RADIO_BUILDER_BUTTON_STATE_NO_DATA_AVAILABLE(4),
    MUSIC_RADIO_BUILDER_BUTTON_STATE_CLICKABLE_EDIT_COMMAND(5);

    public final int g;

    anvx(int i) {
        this.g = i;
    }

    public static anvx a(int i) {
        if (i == 0) {
            return MUSIC_RADIO_BUILDER_BUTTON_STATE_UKNNOWN;
        }
        if (i == 1) {
            return MUSIC_RADIO_BUILDER_BUTTON_STATE_SHOWING_INVALID_RADIO_MESSAGE;
        }
        if (i == 2) {
            return MUSIC_RADIO_BUILDER_BUTTON_STATE_SHOWING_LOADING_SPINNER;
        }
        if (i == 3) {
            return MUSIC_RADIO_BUILDER_BUTTON_STATE_CLICKABLE;
        }
        if (i == 4) {
            return MUSIC_RADIO_BUILDER_BUTTON_STATE_NO_DATA_AVAILABLE;
        }
        if (i != 5) {
            return null;
        }
        return MUSIC_RADIO_BUILDER_BUTTON_STATE_CLICKABLE_EDIT_COMMAND;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
