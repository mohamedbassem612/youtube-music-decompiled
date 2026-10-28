package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class ucy extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucx aucxVar = (aucx) obj;
        int iOrdinal = aucxVar.ordinal();
        if (iOrdinal == 0) {
            return ancb.MDE_COLOR_RANGE_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return ancb.MDE_COLOR_RANGE_LIMITED;
        }
        if (iOrdinal == 2) {
            return ancb.MDE_COLOR_RANGE_FULL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aucxVar.toString()));
    }
}
