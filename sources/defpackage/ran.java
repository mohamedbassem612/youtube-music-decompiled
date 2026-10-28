package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ran extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        qwj qwjVar = (qwj) obj;
        int iOrdinal = qwjVar.ordinal();
        if (iOrdinal == 0) {
            return atrs.TEXT_DECORATION_MODE_THROUGH;
        }
        if (iOrdinal == 1) {
            return atrs.TEXT_DECORATION_MODE_GAPS;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(qwjVar.toString()));
    }
}
