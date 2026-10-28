package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ram extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        qwh qwhVar = (qwh) obj;
        int iOrdinal = qwhVar.ordinal();
        if (iOrdinal == 0) {
            return atrr.TEXT_CONTENT_MODE_NORMAL;
        }
        if (iOrdinal == 1) {
            return atrr.TEXT_CONTENT_MODE_HIGHLIGHT_REVEAL;
        }
        if (iOrdinal == 2) {
            return atrr.TEXT_CONTENT_MODE_LETTER_REVEAL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(qwhVar.toString()));
    }
}
