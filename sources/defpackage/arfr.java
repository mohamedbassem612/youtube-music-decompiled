package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class arfr implements aiht {
    private final /* synthetic */ int $cid;
    static final aiht u = new arfr(20);
    static final aiht t = new arfr(19);
    static final aiht s = new arfr(18);
    public static final aiht r = new arfr(17);
    static final aiht q = new arfr(16);
    static final aiht p = new arfr(15);
    static final aiht o = new arfr(14);
    static final aiht n = new arfr(13);
    static final aiht m = new arfr(12);
    static final aiht l = new arfr(11);
    static final aiht k = new arfr(10);
    static final aiht j = new arfr(9);
    public static final aiht i = new arfr(8);
    public static final aiht h = new arfr(7);
    static final aiht g = new arfr(6);
    public static final aiht f = new arfr(5);
    public static final aiht e = new arfr(4);
    static final aiht d = new arfr(3);
    static final aiht c = new arfr(2);
    static final aiht b = new arfr(1);
    static final aiht a = new arfr(0);

    private arfr(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        arfq arfqVar;
        switch (this.$cid) {
            case 0:
                return a.aU(i2) != 0;
            case 1:
                switch (i2) {
                    case 0:
                        arfqVar = arfq.FONT_FAMILY_UNSPECIFIED;
                        break;
                    case 1:
                        arfqVar = arfq.FONT_FAMILY_CLASSIC;
                        break;
                    case 2:
                        arfqVar = arfq.FONT_FAMILY_LIGHT;
                        break;
                    case 3:
                        arfqVar = arfq.FONT_FAMILY_HEAVY;
                        break;
                    case 4:
                        arfqVar = arfq.FONT_FAMILY_MARKER;
                        break;
                    case 5:
                        arfqVar = arfq.FONT_FAMILY_BRUSH;
                        break;
                    case 6:
                        arfqVar = arfq.FONT_FAMILY_TYPEWRITER;
                        break;
                    case 7:
                        arfqVar = arfq.FONT_FAMILY_YOUTUBE_SANS;
                        break;
                    case 8:
                        arfqVar = arfq.FONT_FAMILY_HANDWRITING;
                        break;
                    case 9:
                        arfqVar = arfq.FONT_FAMILY_MEME;
                        break;
                    case 10:
                        arfqVar = arfq.FONT_FAMILY_FUN;
                        break;
                    case 11:
                        arfqVar = arfq.FONT_FAMILY_CLASSY;
                        break;
                    default:
                        switch (i2) {
                            case 65:
                                arfqVar = arfq.FONT_FAMILY_SCRIPT;
                                break;
                            case 66:
                                arfqVar = arfq.FONT_FAMILY_PRINTER;
                                break;
                            case 67:
                                arfqVar = arfq.FONT_FAMILY_NARROW;
                                break;
                            case 68:
                                arfqVar = arfq.FONT_FAMILY_COZY;
                                break;
                            case 69:
                                arfqVar = arfq.FONT_FAMILY_JOURNAL;
                                break;
                            case 70:
                                arfqVar = arfq.FONT_FAMILY_CHISEL;
                                break;
                            case 71:
                                arfqVar = arfq.FONT_FAMILY_CLASSIC_INTER_TIGHT;
                                break;
                            case 72:
                                arfqVar = arfq.FONT_FAMILY_LIGHT_INTER_TIGHT;
                                break;
                            default:
                                arfqVar = null;
                                break;
                        }
                        break;
                }
                return arfqVar != null;
            case 2:
                return arfs.a(i2) != null;
            case 3:
                return a.bc(i2) != 0;
            case 4:
                return a.bc(i2) != 0;
            case 5:
                return a.aV(i2) != 0;
            case 6:
                return arft.a(i2) != null;
            case 7:
                return a.bt(i2) != 0;
            case 8:
                return arfu.a(i2) != null;
            case 9:
                return argg.a(i2) != null;
            case 10:
                return a.aV(i2) != 0;
            case 11:
                return a.aS(i2) != 0;
            case 12:
                return a.aS(i2) != 0;
            case 13:
                return a.bc(i2) != 0;
            case 14:
                return a.bh(i2) != 0;
            case 15:
                return a.aU(i2) != 0;
            case 16:
                if (i2 == 31) {
                    return true;
                }
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        return true;
                    default:
                        return false;
                }
            case 17:
                return a.bi(i2) != 0;
            case 18:
                return a.aV(i2) != 0;
            case 19:
                return a.bt(i2) != 0;
            default:
                return a.aU(i2) != 0;
        }
    }
}
