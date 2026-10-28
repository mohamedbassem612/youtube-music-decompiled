package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class raj extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        qwb qwbVar = (qwb) obj;
        int iOrdinal = qwbVar.ordinal();
        if (iOrdinal == 0) {
            return atrh.PAINT_STYLE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return atrh.PAINT_STYLE_FILL;
        }
        if (iOrdinal == 2) {
            return atrh.PAINT_STYLE_STROKE;
        }
        if (iOrdinal == 3) {
            return atrh.PAINT_STYLE_STROKE_FILL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(qwbVar.toString()));
    }
}
