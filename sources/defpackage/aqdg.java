package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public enum aqdg implements aihr {
    STOREFRONT_GENRE_TYPE_UNSPECIFIED(0),
    STOREFRONT_GENRE_TYPE_UNKNOWN(1),
    STOREFRONT_GENRE_TYPE_AFRICAN(2),
    STOREFRONT_GENRE_TYPE_AMBIENT(3),
    STOREFRONT_GENRE_TYPE_ARABIC(4),
    STOREFRONT_GENRE_TYPE_ASIAN(5),
    STOREFRONT_GENRE_TYPE_BLUES(6),
    STOREFRONT_GENRE_TYPE_BOLLYWOOD_DESI(7),
    STOREFRONT_GENRE_TYPE_BRAZILIAN(8),
    STOREFRONT_GENRE_TYPE_CHRISTIAN_GOSPEL(9),
    STOREFRONT_GENRE_TYPE_CLASSICAL(10),
    STOREFRONT_GENRE_TYPE_COUNTRY_AMERICANA(11),
    STOREFRONT_GENRE_TYPE_DANCE_ELECTRONIC(12),
    STOREFRONT_GENRE_TYPE_FOLK_ACOUSTIC(13),
    STOREFRONT_GENRE_TYPE_HIP_HOP(14),
    STOREFRONT_GENRE_TYPE_INDIE_ALTERNATIVE(15),
    STOREFRONT_GENRE_TYPE_JAZZ(16),
    STOREFRONT_GENRE_TYPE_KIDS_FAMILY(17),
    STOREFRONT_GENRE_TYPE_LATIN(18),
    STOREFRONT_GENRE_TYPE_METAL(19),
    STOREFRONT_GENRE_TYPE_POP(20),
    STOREFRONT_GENRE_TYPE_R_B_SOUL(21),
    STOREFRONT_GENRE_TYPE_REGGAE_CARIBBEAN(22),
    STOREFRONT_GENRE_TYPE_ROCK(23),
    STOREFRONT_GENRE_TYPE_SEASONAL(24),
    STOREFRONT_GENRE_TYPE_SOUNDTRACKS_MUSICALS(25),
    STOREFRONT_GENRE_TYPE_SOUND_EFFECTS(26),
    STOREFRONT_GENRE_TYPE_SOUTH_EAST_ASIAN(27),
    STOREFRONT_GENRE_TYPE_K_POP(28),
    STOREFRONT_GENRE_TYPE_CANTOPOP_AND_MANDOPOP(29),
    STOREFRONT_GENRE_TYPE_JAPANESE(30),
    STOREFRONT_GENRE_TYPE_KOREAN(31),
    STOREFRONT_GENRE_TYPE_COMEDY_SPOKEN_WORD_OTHER(32),
    STOREFRONT_GENRE_TYPE_SOUNDTRACK(33),
    STOREFRONT_GENRE_TYPE_HOLIDAY(34),
    STOREFRONT_GENRE_TYPE_LATIN_POP(35),
    STOREFRONT_GENRE_TYPE_COMEDY(36);

    public final int L;

    aqdg(int i) {
        this.L = i;
    }

    public static aqdg a(int i) {
        switch (i) {
            case 0:
                return STOREFRONT_GENRE_TYPE_UNSPECIFIED;
            case 1:
                return STOREFRONT_GENRE_TYPE_UNKNOWN;
            case 2:
                return STOREFRONT_GENRE_TYPE_AFRICAN;
            case 3:
                return STOREFRONT_GENRE_TYPE_AMBIENT;
            case 4:
                return STOREFRONT_GENRE_TYPE_ARABIC;
            case 5:
                return STOREFRONT_GENRE_TYPE_ASIAN;
            case 6:
                return STOREFRONT_GENRE_TYPE_BLUES;
            case 7:
                return STOREFRONT_GENRE_TYPE_BOLLYWOOD_DESI;
            case 8:
                return STOREFRONT_GENRE_TYPE_BRAZILIAN;
            case 9:
                return STOREFRONT_GENRE_TYPE_CHRISTIAN_GOSPEL;
            case 10:
                return STOREFRONT_GENRE_TYPE_CLASSICAL;
            case 11:
                return STOREFRONT_GENRE_TYPE_COUNTRY_AMERICANA;
            case 12:
                return STOREFRONT_GENRE_TYPE_DANCE_ELECTRONIC;
            case 13:
                return STOREFRONT_GENRE_TYPE_FOLK_ACOUSTIC;
            case 14:
                return STOREFRONT_GENRE_TYPE_HIP_HOP;
            case 15:
                return STOREFRONT_GENRE_TYPE_INDIE_ALTERNATIVE;
            case 16:
                return STOREFRONT_GENRE_TYPE_JAZZ;
            case 17:
                return STOREFRONT_GENRE_TYPE_KIDS_FAMILY;
            case 18:
                return STOREFRONT_GENRE_TYPE_LATIN;
            case 19:
                return STOREFRONT_GENRE_TYPE_METAL;
            case 20:
                return STOREFRONT_GENRE_TYPE_POP;
            case 21:
                return STOREFRONT_GENRE_TYPE_R_B_SOUL;
            case 22:
                return STOREFRONT_GENRE_TYPE_REGGAE_CARIBBEAN;
            case 23:
                return STOREFRONT_GENRE_TYPE_ROCK;
            case 24:
                return STOREFRONT_GENRE_TYPE_SEASONAL;
            case 25:
                return STOREFRONT_GENRE_TYPE_SOUNDTRACKS_MUSICALS;
            case 26:
                return STOREFRONT_GENRE_TYPE_SOUND_EFFECTS;
            case 27:
                return STOREFRONT_GENRE_TYPE_SOUTH_EAST_ASIAN;
            case 28:
                return STOREFRONT_GENRE_TYPE_K_POP;
            case 29:
                return STOREFRONT_GENRE_TYPE_CANTOPOP_AND_MANDOPOP;
            case 30:
                return STOREFRONT_GENRE_TYPE_JAPANESE;
            case 31:
                return STOREFRONT_GENRE_TYPE_KOREAN;
            case 32:
                return STOREFRONT_GENRE_TYPE_COMEDY_SPOKEN_WORD_OTHER;
            case 33:
                return STOREFRONT_GENRE_TYPE_SOUNDTRACK;
            case 34:
                return STOREFRONT_GENRE_TYPE_HOLIDAY;
            case 35:
                return STOREFRONT_GENRE_TYPE_LATIN_POP;
            case 36:
                return STOREFRONT_GENRE_TYPE_COMEDY;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.L;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.L);
    }
}
