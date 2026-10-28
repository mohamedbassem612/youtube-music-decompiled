package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rak extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        qwe qweVar = (qwe) obj;
        int iOrdinal = qweVar.ordinal();
        if (iOrdinal == 0) {
            return atri.PAINT_STYLE_STROKE_JOIN_MITER;
        }
        if (iOrdinal == 1) {
            return atri.PAINT_STYLE_STROKE_JOIN_ROUND;
        }
        if (iOrdinal == 2) {
            return atri.PAINT_STYLE_STROKE_JOIN_BEVEL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(qweVar.toString()));
    }
}
