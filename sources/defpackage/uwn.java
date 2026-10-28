package defpackage;

import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uwn extends uhv {
    public final roq b;
    private final uwq c;
    private final ukp d;
    private avmn e;
    private avmn f;
    private final aaok g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwn(cc ccVar, uwq uwqVar, vfq vfqVar, aaok aaokVar, ukp ukpVar, awmd awmdVar) {
        super(ccVar, true);
        ccVar.getClass();
        uwqVar.getClass();
        vfqVar.getClass();
        aaokVar.getClass();
        ukpVar.getClass();
        this.c = uwqVar;
        this.g = aaokVar;
        this.d = ukpVar;
        roq roqVar = new roq(new uwo(awno.a));
        this.b = roqVar;
        roqVar.g();
        new awli(Optional.empty());
    }

    @Override // defpackage.uhv
    protected final void g() {
        if (this.g.G()) {
            this.e = this.d.e().ag(new usn(new uwk(this, 0), 7), new usn(uwl.a, 8));
        } else {
            this.f = this.c.c.g().ag(new usn(new uwk(this, 2), 9), new usn(uwm.a, 10));
        }
    }

    @Override // defpackage.uhv
    protected final void iX() {
        Object obj = this.e;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
        }
        Object obj2 = this.f;
        if (obj2 != null) {
            avnr.b((AtomicReference) obj2);
        }
        this.b.h(new uhd(2));
    }
}
