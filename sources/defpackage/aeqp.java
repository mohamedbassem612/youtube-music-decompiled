package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public enum aeqp implements aeqs {
    UNKNOWN(aeqr.a, 1),
    SHORTS_FRAGMENT(aeqr.c, 3),
    SHORTS_VE_F(aeqr.g, 3),
    ENGAGEMENT_PANEL(aeqr.e, 4),
    SHORT_TO_SHORT(aeqr.d, 5);

    public final int f;
    private final aeqr h;

    aeqp(aeqr aeqrVar, int i) {
        this.h = aeqrVar;
        this.f = i;
    }

    @Override // defpackage.aeqs
    public final qci a() {
        return qci.a(qci.b(null, this.h), qci.b("-", this));
    }
}
