package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum anmt implements aihr {
    MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_UNKNOWN(0),
    MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_ZERO_STATE(1),
    MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_KEYBOARD_OPEN(2),
    MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_TYPING(3),
    MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_VOICE_INPUT(4),
    MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_LOADING(5),
    MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_LOADING_FROM_SUGGESTION(6);

    public final int h;

    anmt(int i2) {
        this.h = i2;
    }

    public static anmt a(int i2) {
        switch (i2) {
            case 0:
                return MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_UNKNOWN;
            case 1:
                return MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_ZERO_STATE;
            case 2:
                return MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_KEYBOARD_OPEN;
            case 3:
                return MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_TYPING;
            case 4:
                return MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_VOICE_INPUT;
            case 5:
                return MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_LOADING;
            case 6:
                return MUSIC_CONVERSATIONAL_RADIO_BUILDER_STATE_LOADING_FROM_SUGGESTION;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
