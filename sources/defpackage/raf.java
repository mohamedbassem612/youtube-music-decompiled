package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class raf extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        qvx qvxVar = (qvx) obj;
        int iOrdinal = qvxVar.ordinal();
        if (iOrdinal == 0) {
            return atrp.BACKGROUND_CORNER_TYPE_ALL_CORNERS_ROUNDED;
        }
        if (iOrdinal == 1) {
            return atrp.BACKGROUND_CORNER_TYPE_SHARP_INNER_CORNERS;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(qvxVar.toString()));
    }
}
