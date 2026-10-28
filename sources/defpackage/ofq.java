package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
enum ofq implements ofo {
    POLLING_EVENT(false),
    VISIBILITY_CHANGE_EVENT(true);

    private final boolean d;

    ofq(boolean z) {
        this.d = z;
    }

    @Override // defpackage.ofo
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.ofo
    public final boolean b() {
        return false;
    }
}
