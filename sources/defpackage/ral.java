package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ral extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        qwg qwgVar = (qwg) obj;
        int iOrdinal = qwgVar.ordinal();
        if (iOrdinal == 0) {
            return atrj.PARA_STYLE_TEXT_ALIGN_LEFT;
        }
        if (iOrdinal == 1) {
            return atrj.PARA_STYLE_TEXT_ALIGN_RIGHT;
        }
        if (iOrdinal == 2) {
            return atrj.PARA_STYLE_TEXT_ALIGN_CENTER;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(qwgVar.toString()));
    }
}
