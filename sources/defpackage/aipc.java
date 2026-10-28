package defpackage;

import com.google.cardboard.sdk.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aipc implements aihr {
    QUALITY_ORDINAL_UNKNOWN(0),
    QUALITY_ORDINAL_144P_SAVER(R.styleable.AppCompatTheme_windowMinWidthMajor),
    QUALITY_ORDINAL_144P(144),
    QUALITY_ORDINAL_240P_SAVER(220),
    QUALITY_ORDINAL_240P(240),
    QUALITY_ORDINAL_360P_SAVER(340),
    QUALITY_ORDINAL_360P(360),
    QUALITY_ORDINAL_406P(406),
    QUALITY_ORDINAL_480P(480),
    QUALITY_ORDINAL_608P_SAVER(588),
    QUALITY_ORDINAL_608P(608),
    QUALITY_ORDINAL_720P(720),
    QUALITY_ORDINAL_720P_ENHANCED(740),
    QUALITY_ORDINAL_1080P(1080),
    QUALITY_ORDINAL_1080P_ENHANCED(1100),
    QUALITY_ORDINAL_1440P(1440),
    QUALITY_ORDINAL_2160P(2160),
    QUALITY_ORDINAL_HIGHRES(9999);

    public final int s;

    aipc(int i) {
        this.s = i;
    }

    public static aipc a(int i) {
        switch (i) {
            case 0:
                return QUALITY_ORDINAL_UNKNOWN;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return QUALITY_ORDINAL_144P_SAVER;
            case 144:
                return QUALITY_ORDINAL_144P;
            case 220:
                return QUALITY_ORDINAL_240P_SAVER;
            case 240:
                return QUALITY_ORDINAL_240P;
            case 340:
                return QUALITY_ORDINAL_360P_SAVER;
            case 360:
                return QUALITY_ORDINAL_360P;
            case 406:
                return QUALITY_ORDINAL_406P;
            case 480:
                return QUALITY_ORDINAL_480P;
            case 588:
                return QUALITY_ORDINAL_608P_SAVER;
            case 608:
                return QUALITY_ORDINAL_608P;
            case 720:
                return QUALITY_ORDINAL_720P;
            case 740:
                return QUALITY_ORDINAL_720P_ENHANCED;
            case 1080:
                return QUALITY_ORDINAL_1080P;
            case 1100:
                return QUALITY_ORDINAL_1080P_ENHANCED;
            case 1440:
                return QUALITY_ORDINAL_1440P;
            case 2160:
                return QUALITY_ORDINAL_2160P;
            case 9999:
                return QUALITY_ORDINAL_HIGHRES;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}
