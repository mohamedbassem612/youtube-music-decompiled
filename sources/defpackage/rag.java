package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rag extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        qvy qvyVar = (qvy) obj;
        int iOrdinal = qvyVar.ordinal();
        if (iOrdinal == 0) {
            return atqy.FONT_STYLE_SLANT_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return atqy.FONT_STYLE_SLANT_UPRIGHT;
        }
        if (iOrdinal == 2) {
            return atqy.FONT_STYLE_SLANT_ITALIC;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(qvyVar.toString()));
    }
}
