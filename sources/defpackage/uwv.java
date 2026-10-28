package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uwv extends uhv {
    public static final uww b = new uww(awnq.a, new uxb(), false, 1);
    public final roq c;
    private final aunn d;
    private avmn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwv(cc ccVar, aunn aunnVar) {
        super(ccVar, true);
        ccVar.getClass();
        aunnVar.getClass();
        this.d = aunnVar;
        roq roqVar = new roq(b);
        this.c = roqVar;
        roqVar.g();
    }

    @Override // defpackage.uhv
    protected final void g() {
        Object objIo = this.d.io();
        objIo.getClass();
        this.e = ((ukp) objIo).e().ag(new usn(new hho(this, 5, (boolean[]) null), 11), new usn(uwu.a, 12));
    }

    @Override // defpackage.uhv
    protected final void iX() {
        Object obj = this.e;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        this.c.h(new uhd(3));
    }
}
