package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class rai extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        qwa qwaVar = (qwa) obj;
        switch (qwaVar.ordinal()) {
            case 0:
                return atra.FONT_STYLE_WIDTH_UNSPECIFIED;
            case 1:
                return atra.FONT_STYLE_WIDTH_ULTRA_CONDENSED;
            case 2:
                return atra.FONT_STYLE_WIDTH_EXTRA_CONDENSED;
            case 3:
                return atra.FONT_STYLE_WIDTH_CONDENSED;
            case 4:
                return atra.FONT_STYLE_WIDTH_SEMI_CONDENSED;
            case 5:
                return atra.FONT_STYLE_WIDTH_NORMAL;
            case 6:
                return atra.FONT_STYLE_WIDTH_SEMI_EXPANDED;
            case 7:
                return atra.FONT_STYLE_WIDTH_EXPANDED;
            case 8:
                return atra.FONT_STYLE_WIDTH_EXTRA_EXPANDED;
            case 9:
                return atra.FONT_STYLE_WIDTH_ULTRA_EXPANDED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(qwaVar.toString()));
        }
    }
}
