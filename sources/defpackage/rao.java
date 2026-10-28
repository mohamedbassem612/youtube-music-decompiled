package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class rao extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        qwk qwkVar = (qwk) obj;
        int iOrdinal = qwkVar.ordinal();
        if (iOrdinal == 0) {
            return atrt.TEXT_DECORATION_STYLE_SOLID;
        }
        if (iOrdinal == 1) {
            return atrt.TEXT_DECORATION_STYLE_DOUBLE;
        }
        if (iOrdinal == 2) {
            return atrt.TEXT_DECORATION_STYLE_DOTTED;
        }
        if (iOrdinal == 3) {
            return atrt.TEXT_DECORATION_STYLE_DASHED;
        }
        if (iOrdinal == 4) {
            return atrt.TEXT_DECORATION_STYLE_WAVY;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(qwkVar.toString()));
    }
}
