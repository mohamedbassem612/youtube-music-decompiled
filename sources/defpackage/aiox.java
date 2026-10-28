package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aiox implements aihr {
    UNKNOWN_CODEC(0),
    AAC(1),
    VORBIS(2),
    OPUS(3),
    DTSHD(4),
    EAC3(5),
    PCM(6),
    AC3(7),
    SPEEX(8),
    MP3(9),
    MP2(10),
    AMR(11),
    IAMF(13),
    XHEAAC(14);

    public final int o;

    aiox(int i) {
        this.o = i;
    }

    public static aiox a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CODEC;
            case 1:
                return AAC;
            case 2:
                return VORBIS;
            case 3:
                return OPUS;
            case 4:
                return DTSHD;
            case 5:
                return EAC3;
            case 6:
                return PCM;
            case 7:
                return AC3;
            case 8:
                return SPEEX;
            case 9:
                return MP3;
            case 10:
                return MP2;
            case 11:
                return AMR;
            case 12:
            default:
                return null;
            case 13:
                return IAMF;
            case 14:
                return XHEAAC;
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
