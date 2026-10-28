package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class way extends wbi {
    @Override // defpackage.wbi
    public Object b() {
        String str;
        int iA = a();
        if (iA != 1) {
            str = iA != 2 ? "UPDATE" : "REMOVE";
        } else {
            str = "EMPTY";
        }
        throw new UnsupportedOperationException(str);
    }
}
