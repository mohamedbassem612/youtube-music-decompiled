package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum auir implements aihr {
    FONT_FAMILY_UNSPECIFIED(0),
    CLASSIC(1),
    LIGHT(2),
    HEAVY(3),
    MARKER(4),
    BRUSH(5),
    TYPEWRITER(6),
    YOUTUBE_SANS(7),
    HANDWRITING(8),
    MEME(9),
    FUN(10),
    CLASSY(11),
    SCRIPT(65),
    PRINTER(66),
    NARROW(67),
    COZY(68),
    JOURNAL(69),
    CHISEL(70),
    CLASSIC_INTER_TIGHT(71),
    LIGHT_INTER_TIGHT(72),
    ABORETO(63),
    AKAYA_TELIVIGALA(58),
    ALEGREYA(12),
    ALEX_BRUSH(40),
    ALFA_SLAB_ONE(48),
    ALKALAMI(13),
    ALKATRA(14),
    AMATIC_SC(39),
    ANEK_BANGLA(35),
    ANEK_LATIN(61),
    AOBOSHI_ONE(43),
    BAGEL_FAT_ONE(38),
    BARLOW(15),
    BIORHYME(16),
    BRAAH_ONE(45),
    BUNGEE(17),
    BUNGEE_SHADE(42),
    CARDO(18),
    CAVEAT_BRUSH(54),
    CHERRY_BOMB_ONE(53),
    COINY(19),
    COMFORTER(20),
    DELICIOUS_HANDDRAWN(55),
    EAST_SEA_DOKDO(47),
    FASTHAND(21),
    FIRA_MONO(36),
    FREEHAND(22),
    GAEGU(23),
    GASOEK_ONE(49),
    GAYATHRI(24),
    IBM_PLEX_MONO(37),
    INKNUT_ANTIQUA(51),
    KALAM(25),
    KUMAR_ONE(64),
    LICORICE(26),
    MOCHIY_POP_ONE(60),
    MONOTON(27),
    MONTECARLO(28),
    NEW_ROCKER(46),
    NOTO_SERIF_JP(57),
    ORBIT(29),
    OSWALD(30),
    PACIFICO(31),
    PERMANENT_MARKER(59),
    PLAYFAIR_DISPLAY(41),
    POPPINS(32),
    RUBIK_DISTRESSED(50),
    SILKSCREEN(34),
    SINGLE_DAY(56),
    SOURCE_SANS_THREE(62),
    ZEN_OLD_MINCHO(44),
    UNRECOGNIZED(-1);

    private final int av;

    auir(int i) {
        this.av = i;
    }

    public static auir a(int i) {
        switch (i) {
            case 0:
                return FONT_FAMILY_UNSPECIFIED;
            case 1:
                return CLASSIC;
            case 2:
                return LIGHT;
            case 3:
                return HEAVY;
            case 4:
                return MARKER;
            case 5:
                return BRUSH;
            case 6:
                return TYPEWRITER;
            case 7:
                return YOUTUBE_SANS;
            case 8:
                return HANDWRITING;
            case 9:
                return MEME;
            case 10:
                return FUN;
            case 11:
                return CLASSY;
            case 12:
                return ALEGREYA;
            case 13:
                return ALKALAMI;
            case 14:
                return ALKATRA;
            case 15:
                return BARLOW;
            case 16:
                return BIORHYME;
            case 17:
                return BUNGEE;
            case 18:
                return CARDO;
            case 19:
                return COINY;
            case 20:
                return COMFORTER;
            case 21:
                return FASTHAND;
            case 22:
                return FREEHAND;
            case 23:
                return GAEGU;
            case 24:
                return GAYATHRI;
            case 25:
                return KALAM;
            case 26:
                return LICORICE;
            case 27:
                return MONOTON;
            case 28:
                return MONTECARLO;
            case 29:
                return ORBIT;
            case 30:
                return OSWALD;
            case 31:
                return PACIFICO;
            case 32:
                return POPPINS;
            case 33:
            case 52:
            default:
                return null;
            case 34:
                return SILKSCREEN;
            case 35:
                return ANEK_BANGLA;
            case 36:
                return FIRA_MONO;
            case 37:
                return IBM_PLEX_MONO;
            case 38:
                return BAGEL_FAT_ONE;
            case 39:
                return AMATIC_SC;
            case 40:
                return ALEX_BRUSH;
            case 41:
                return PLAYFAIR_DISPLAY;
            case 42:
                return BUNGEE_SHADE;
            case 43:
                return AOBOSHI_ONE;
            case 44:
                return ZEN_OLD_MINCHO;
            case 45:
                return BRAAH_ONE;
            case 46:
                return NEW_ROCKER;
            case 47:
                return EAST_SEA_DOKDO;
            case 48:
                return ALFA_SLAB_ONE;
            case 49:
                return GASOEK_ONE;
            case 50:
                return RUBIK_DISTRESSED;
            case 51:
                return INKNUT_ANTIQUA;
            case 53:
                return CHERRY_BOMB_ONE;
            case 54:
                return CAVEAT_BRUSH;
            case 55:
                return DELICIOUS_HANDDRAWN;
            case 56:
                return SINGLE_DAY;
            case 57:
                return NOTO_SERIF_JP;
            case 58:
                return AKAYA_TELIVIGALA;
            case 59:
                return PERMANENT_MARKER;
            case 60:
                return MOCHIY_POP_ONE;
            case 61:
                return ANEK_LATIN;
            case 62:
                return SOURCE_SANS_THREE;
            case 63:
                return ABORETO;
            case 64:
                return KUMAR_ONE;
            case 65:
                return SCRIPT;
            case 66:
                return PRINTER;
            case 67:
                return NARROW;
            case 68:
                return COZY;
            case 69:
                return JOURNAL;
            case 70:
                return CHISEL;
            case 71:
                return CLASSIC_INTER_TIGHT;
            case 72:
                return LIGHT_INTER_TIGHT;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this == UNRECOGNIZED ? aiif.a() : this.av;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.av);
    }
}
