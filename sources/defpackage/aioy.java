package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum aioy implements aihr {
    UNKNOWN_CODEC(0),
    H263(1),
    H264(2),
    VP8(3),
    VP9(4),
    H262(5),
    VP6(6),
    MPEG4(7),
    AV1(8),
    H265(9),
    FLV1(10),
    AV2(11);

    public final int m;

    aioy(int i) {
        this.m = i;
    }

    public static aioy a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CODEC;
            case 1:
                return H263;
            case 2:
                return H264;
            case 3:
                return VP8;
            case 4:
                return VP9;
            case 5:
                return H262;
            case 6:
                return VP6;
            case 7:
                return MPEG4;
            case 8:
                return AV1;
            case 9:
                return H265;
            case 10:
                return FLV1;
            case 11:
                return AV2;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
