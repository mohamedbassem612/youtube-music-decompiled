package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class rah extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        qvz qvzVar = (qvz) obj;
        switch (qvzVar.ordinal()) {
            case 0:
                return atqz.FONT_STYLE_WEIGHT_UNSPECIFIED;
            case 1:
                return atqz.FONT_STYLE_WEIGHT_THIN;
            case 2:
                return atqz.FONT_STYLE_WEIGHT_EXTRA_LIGHT;
            case 3:
                return atqz.FONT_STYLE_WEIGHT_LIGHT;
            case 4:
                return atqz.FONT_STYLE_WEIGHT_NORMAL;
            case 5:
                return atqz.FONT_STYLE_WEIGHT_MEDIUM;
            case 6:
                return atqz.FONT_STYLE_WEIGHT_SEMI_BOLD;
            case 7:
                return atqz.FONT_STYLE_WEIGHT_BOLD;
            case 8:
                return atqz.FONT_STYLE_WEIGHT_EXTRA_BOLD;
            case 9:
                return atqz.FONT_STYLE_WEIGHT_BLACK;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(qvzVar.toString()));
        }
    }
}
