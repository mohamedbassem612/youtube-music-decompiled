package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aqdh implements aihr {
    STOREFRONT_MOOD_TYPE_UNSPECIFIED(0),
    STOREFRONT_MOOD_TYPE_ANGRY(1),
    STOREFRONT_MOOD_TYPE_BRIGHT(2),
    STOREFRONT_MOOD_TYPE_CHILL(3),
    STOREFRONT_MOOD_TYPE_DARK(4),
    STOREFRONT_MOOD_TYPE_DRAMATIC(5),
    STOREFRONT_MOOD_TYPE_FUNKY(6),
    STOREFRONT_MOOD_TYPE_HAPPY(7),
    STOREFRONT_MOOD_TYPE_LOVE(8),
    STOREFRONT_MOOD_TYPE_SAD(9),
    STOREFRONT_MOOD_TYPE_UPLIFTING(10);

    public final int l;

    aqdh(int i) {
        this.l = i;
    }

    public static aqdh a(int i) {
        switch (i) {
            case 0:
                return STOREFRONT_MOOD_TYPE_UNSPECIFIED;
            case 1:
                return STOREFRONT_MOOD_TYPE_ANGRY;
            case 2:
                return STOREFRONT_MOOD_TYPE_BRIGHT;
            case 3:
                return STOREFRONT_MOOD_TYPE_CHILL;
            case 4:
                return STOREFRONT_MOOD_TYPE_DARK;
            case 5:
                return STOREFRONT_MOOD_TYPE_DRAMATIC;
            case 6:
                return STOREFRONT_MOOD_TYPE_FUNKY;
            case 7:
                return STOREFRONT_MOOD_TYPE_HAPPY;
            case 8:
                return STOREFRONT_MOOD_TYPE_LOVE;
            case 9:
                return STOREFRONT_MOOD_TYPE_SAD;
            case 10:
                return STOREFRONT_MOOD_TYPE_UPLIFTING;
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
