package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum ajvt implements aihr {
    CODEC_REUSE_MODE_UNKNOWN(0),
    CODEC_REUSE_MODE_REUSE(1),
    CODEC_REUSE_MODE_REUSE_WITH_CONFIGURE(2),
    CODEC_REUSE_MODE_REUSE_WITH_STOP_AND_CONFIGURE(3),
    CODEC_REUSE_MODE_REUSE_WITH_RECONFIGURATION(4),
    UNRECOGNIZED(-1);

    private final int h;

    ajvt(int i) {
        this.h = i;
    }

    public static ajvt a(int i) {
        if (i == 0) {
            return CODEC_REUSE_MODE_UNKNOWN;
        }
        if (i == 1) {
            return CODEC_REUSE_MODE_REUSE;
        }
        if (i == 2) {
            return CODEC_REUSE_MODE_REUSE_WITH_CONFIGURE;
        }
        if (i == 3) {
            return CODEC_REUSE_MODE_REUSE_WITH_STOP_AND_CONFIGURE;
        }
        if (i != 4) {
            return null;
        }
        return CODEC_REUSE_MODE_REUSE_WITH_RECONFIGURATION;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
