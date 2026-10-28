package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum arft implements aihr {
    TOOLBELT_BUTTON_TYPE_UNSPECIFIED(0),
    TOOLBELT_BUTTON_TYPE_RELIGHT(1),
    TOOLBELT_BUTTON_TYPE_RETOUCH(2),
    TOOLBELT_BUTTON_TYPE_FILTER_PICKER(3),
    TOOLBELT_BUTTON_TYPE_GREEN_SCREEN(4),
    TOOLBELT_BUTTON_TYPE_PROMPT_STICKER(5),
    TOOLBELT_BUTTON_TYPE_COMMENTS_PICKER(6),
    TOOLBELT_BUTTON_TYPE_STICKER_PICKER(7),
    TOOLBELT_BUTTON_TYPE_AI_PLAYGROUND(8),
    TOOLBELT_BUTTON_TYPE_EFFECT_PICKER(9),
    TOOLBELT_BUTTON_TYPE_TEMPLATE_PICKER(10),
    TOOLBELT_BUTTON_TYPE_GENERATED_ASSET_REPORT(11),
    TOOLBELT_BUTTON_TYPE_VIBE_EDIT(12),
    TOOLBELT_BUTTON_TYPE_VIDEO_INGESTION_SCREEN(13);

    public final int o;

    arft(int i) {
        this.o = i;
    }

    public static arft a(int i) {
        switch (i) {
            case 0:
                return TOOLBELT_BUTTON_TYPE_UNSPECIFIED;
            case 1:
                return TOOLBELT_BUTTON_TYPE_RELIGHT;
            case 2:
                return TOOLBELT_BUTTON_TYPE_RETOUCH;
            case 3:
                return TOOLBELT_BUTTON_TYPE_FILTER_PICKER;
            case 4:
                return TOOLBELT_BUTTON_TYPE_GREEN_SCREEN;
            case 5:
                return TOOLBELT_BUTTON_TYPE_PROMPT_STICKER;
            case 6:
                return TOOLBELT_BUTTON_TYPE_COMMENTS_PICKER;
            case 7:
                return TOOLBELT_BUTTON_TYPE_STICKER_PICKER;
            case 8:
                return TOOLBELT_BUTTON_TYPE_AI_PLAYGROUND;
            case 9:
                return TOOLBELT_BUTTON_TYPE_EFFECT_PICKER;
            case 10:
                return TOOLBELT_BUTTON_TYPE_TEMPLATE_PICKER;
            case 11:
                return TOOLBELT_BUTTON_TYPE_GENERATED_ASSET_REPORT;
            case 12:
                return TOOLBELT_BUTTON_TYPE_VIBE_EDIT;
            case 13:
                return TOOLBELT_BUTTON_TYPE_VIDEO_INGESTION_SCREEN;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
