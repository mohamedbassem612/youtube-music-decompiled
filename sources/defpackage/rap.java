package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rap extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        qwi qwiVar = (qwi) obj;
        int iOrdinal = qwiVar.ordinal();
        if (iOrdinal == 0) {
            return atru.TEXT_DECORATION_TYPE_NO_DECORATION;
        }
        if (iOrdinal == 1) {
            return atru.TEXT_DECORATION_TYPE_UNDERLINE;
        }
        if (iOrdinal == 2) {
            return atru.TEXT_DECORATION_TYPE_OVERLINE;
        }
        if (iOrdinal == 3) {
            return atru.TEXT_DECORATION_TYPE_LINE_THROUGH;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(qwiVar.toString()));
    }
}
