package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aohx implements aihr {
    UNKNOWN_FORMAT_TYPE(0),
    LD(4),
    SD(1),
    HD(2),
    AUDIO_ONLY(3),
    LD_240(5),
    SD_480(6),
    HD_1080(7),
    HD_1440(8),
    HD_2160(9),
    HD_4320(10);

    public final int l;

    aohx(int i) {
        this.l = i;
    }

    public static aohx a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT_TYPE;
            case 1:
                return SD;
            case 2:
                return HD;
            case 3:
                return AUDIO_ONLY;
            case 4:
                return LD;
            case 5:
                return LD_240;
            case 6:
                return SD_480;
            case 7:
                return HD_1080;
            case 8:
                return HD_1440;
            case 9:
                return HD_2160;
            case 10:
                return HD_4320;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
