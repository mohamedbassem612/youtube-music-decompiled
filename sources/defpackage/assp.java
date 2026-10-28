package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class assp implements aiht {
    private final /* synthetic */ int $cid;
    public static final aiht u = new assp(20);
    public static final aiht t = new assp(19);
    public static final aiht s = new assp(18);
    public static final aiht r = new assp(17);
    public static final aiht q = new assp(16);
    public static final aiht p = new assp(15);
    public static final aiht o = new assp(14);
    public static final aiht n = new assp(13);
    public static final aiht m = new assp(12);
    public static final aiht l = new assp(11);
    public static final aiht k = new assp(10);
    public static final aiht j = new assp(9);
    public static final aiht i = new assp(8);
    public static final aiht h = new assp(7);
    public static final aiht g = new assp(6);
    public static final aiht f = new assp(5);
    public static final aiht e = new assp(4);
    public static final aiht d = new assp(3);
    static final aiht c = new assp(2);
    static final aiht b = new assp(1);
    static final aiht a = new assp(0);

    private assp(int i2) {
        this.$cid = i2;
    }

    @Override // defpackage.aiht
    public final boolean isInRange(int i2) {
        Enum r2 = null;
        switch (this.$cid) {
            case 0:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 1:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 2:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 3:
                if (atol.a(i2) == null) {
                    return false;
                }
                break;
            case 4:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 5:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 6:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 7:
                if (a.aV(i2) == 0) {
                    return false;
                }
                break;
            case 8:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 9:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 10:
                if (i2 == 0) {
                    r2 = atqy.FONT_STYLE_SLANT_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = atqy.FONT_STYLE_SLANT_UPRIGHT;
                } else if (i2 == 2) {
                    r2 = atqy.FONT_STYLE_SLANT_ITALIC;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 11:
                switch (i2) {
                    case 0:
                        r2 = atqz.FONT_STYLE_WEIGHT_UNSPECIFIED;
                        break;
                    case 1:
                        r2 = atqz.FONT_STYLE_WEIGHT_THIN;
                        break;
                    case 2:
                        r2 = atqz.FONT_STYLE_WEIGHT_NORMAL;
                        break;
                    case 3:
                        r2 = atqz.FONT_STYLE_WEIGHT_BOLD;
                        break;
                    case 4:
                        r2 = atqz.FONT_STYLE_WEIGHT_EXTRA_LIGHT;
                        break;
                    case 5:
                        r2 = atqz.FONT_STYLE_WEIGHT_LIGHT;
                        break;
                    case 6:
                        r2 = atqz.FONT_STYLE_WEIGHT_MEDIUM;
                        break;
                    case 7:
                        r2 = atqz.FONT_STYLE_WEIGHT_SEMI_BOLD;
                        break;
                    case 8:
                        r2 = atqz.FONT_STYLE_WEIGHT_EXTRA_BOLD;
                        break;
                    case 9:
                        r2 = atqz.FONT_STYLE_WEIGHT_BLACK;
                        break;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 12:
                switch (i2) {
                    case 0:
                        r2 = atra.FONT_STYLE_WIDTH_UNSPECIFIED;
                        break;
                    case 1:
                        r2 = atra.FONT_STYLE_WIDTH_NORMAL;
                        break;
                    case 2:
                        r2 = atra.FONT_STYLE_WIDTH_EXPANDED;
                        break;
                    case 3:
                        r2 = atra.FONT_STYLE_WIDTH_ULTRA_CONDENSED;
                        break;
                    case 4:
                        r2 = atra.FONT_STYLE_WIDTH_EXTRA_CONDENSED;
                        break;
                    case 5:
                        r2 = atra.FONT_STYLE_WIDTH_CONDENSED;
                        break;
                    case 6:
                        r2 = atra.FONT_STYLE_WIDTH_SEMI_CONDENSED;
                        break;
                    case 7:
                        r2 = atra.FONT_STYLE_WIDTH_SEMI_EXPANDED;
                        break;
                    case 8:
                        r2 = atra.FONT_STYLE_WIDTH_EXTRA_EXPANDED;
                        break;
                    case 9:
                        r2 = atra.FONT_STYLE_WIDTH_ULTRA_EXPANDED;
                        break;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 13:
                if (i2 == 0) {
                    r2 = atrh.PAINT_STYLE_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = atrh.PAINT_STYLE_FILL;
                } else if (i2 == 2) {
                    r2 = atrh.PAINT_STYLE_STROKE;
                } else if (i2 == 3) {
                    r2 = atrh.PAINT_STYLE_STROKE_FILL;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 14:
                if (i2 == 0) {
                    r2 = atri.PAINT_STYLE_STROKE_JOIN_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = atri.PAINT_STYLE_STROKE_JOIN_MITER;
                } else if (i2 == 2) {
                    r2 = atri.PAINT_STYLE_STROKE_JOIN_ROUND;
                } else if (i2 == 3) {
                    r2 = atri.PAINT_STYLE_STROKE_JOIN_BEVEL;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 15:
                if (i2 == 0) {
                    r2 = atrj.PARA_STYLE_TEXT_ALIGN_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = atrj.PARA_STYLE_TEXT_ALIGN_LEFT;
                } else if (i2 == 2) {
                    r2 = atrj.PARA_STYLE_TEXT_ALIGN_RIGHT;
                } else if (i2 == 3) {
                    r2 = atrj.PARA_STYLE_TEXT_ALIGN_CENTER;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 16:
                if (a.aS(i2) == 0) {
                    return false;
                }
                break;
            case 17:
                if (i2 == 0) {
                    r2 = atrp.BACKGROUND_CORNER_TYPE_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = atrp.BACKGROUND_CORNER_TYPE_ALL_CORNERS_ROUNDED;
                } else if (i2 == 2) {
                    r2 = atrp.BACKGROUND_CORNER_TYPE_SHARP_INNER_CORNERS;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 18:
                if (i2 == 0) {
                    r2 = atrr.TEXT_CONTENT_MODE_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = atrr.TEXT_CONTENT_MODE_NORMAL;
                } else if (i2 == 2) {
                    r2 = atrr.TEXT_CONTENT_MODE_HIGHLIGHT_REVEAL;
                } else if (i2 == 3) {
                    r2 = atrr.TEXT_CONTENT_MODE_LETTER_REVEAL;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 19:
                if (i2 == 0) {
                    r2 = atrs.TEXT_DECORATION_MODE_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = atrs.TEXT_DECORATION_MODE_THROUGH;
                } else if (i2 == 2) {
                    r2 = atrs.TEXT_DECORATION_MODE_GAPS;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            default:
                if (i2 == 0) {
                    r2 = atrt.TEXT_DECORATION_STYLE_UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = atrt.TEXT_DECORATION_STYLE_SOLID;
                } else if (i2 == 2) {
                    r2 = atrt.TEXT_DECORATION_STYLE_DOUBLE;
                } else if (i2 == 3) {
                    r2 = atrt.TEXT_DECORATION_STYLE_DOTTED;
                } else if (i2 == 4) {
                    r2 = atrt.TEXT_DECORATION_STYLE_DASHED;
                } else if (i2 == 5) {
                    r2 = atrt.TEXT_DECORATION_STYLE_WAVY;
                }
                if (r2 == null) {
                    return false;
                }
                break;
        }
        return true;
    }
}
