package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class uda extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucz auczVar = (aucz) obj;
        int iOrdinal = auczVar.ordinal();
        if (iOrdinal == 0) {
            return ancd.MDE_Y_CB_CR_MATRIX_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return ancd.MDE_Y_CB_CR_MATRIX_BT709;
        }
        if (iOrdinal == 2) {
            return ancd.MDE_Y_CB_CR_MATRIX_BT601;
        }
        if (iOrdinal == 3) {
            return ancd.MDE_Y_CB_CR_MATRIX_BT2020;
        }
        if (iOrdinal == 4) {
            return ancd.MDE_Y_CB_CR_MATRIX_SMPTE240M;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(auczVar.toString()));
    }
}
