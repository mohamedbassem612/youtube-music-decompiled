package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class jqn extends azw {
    final /* synthetic */ jqo a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqn(jqo jqoVar) {
        super(null);
        this.a = jqoVar;
    }

    private final void A(xhc xhcVar) {
        jqo jqoVar = this.a;
        aunn aunnVar = jqoVar.g;
        ((xgn) aunnVar.io()).o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_SWIPE, new xgj(xhcVar), null);
        if (((vxz) jqoVar.j.io()).l(122, 45828708L, false)) {
            ((abea) jqoVar.h.io()).n(new abec(((xgn) aunnVar.io()).i(), xhcVar));
        }
    }

    @Override // defpackage.azw
    public final void u(int i) {
        boolean z = true;
        if (i == 0) {
            this.b = false;
            jqo jqoVar = this.a;
            if (jqoVar.l()) {
                jqoVar.g(true);
                return;
            } else {
                jqoVar.h(true);
                return;
            }
        }
        jqo jqoVar2 = this.a;
        if (i != 1) {
            if (jqoVar2.l()) {
                jqoVar2.g(false);
                return;
            } else {
                jqoVar2.h(false);
                return;
            }
        }
        if (jqoVar2.l() && jqoVar2.l.j()) {
            z = false;
        }
        this.b = z;
        if (jqoVar2.l()) {
            jqoVar2.g(false);
        } else {
            jqoVar2.h(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    @Override // defpackage.azw
    public final void w(int i) {
        aunn aunnVar;
        abvc abvcVar;
        abtu abtuVar;
        jqo jqoVar = this.a;
        int iB = ((abjp) jqoVar.b.io()).b(jqoVar.w.q());
        if (i != iB) {
            if (this.b) {
                this.b = false;
                if (i == iB + 1) {
                    aunn aunnVar2 = jqoVar.a;
                    abvc abvcVar2 = (abvc) aunnVar2.io();
                    abtu abtuVar2 = abtu.a;
                    if (abvcVar2.n(abtuVar2)) {
                        ((abvc) aunnVar2.io()).i(abtuVar2);
                        A(y());
                    } else if (i == iB - 1) {
                        aunnVar = jqoVar.a;
                        abvcVar = (abvc) aunnVar.io();
                        abtuVar = abtu.b;
                        if (abvcVar.n(abtuVar)) {
                            ((abvc) aunnVar.io()).i(abtuVar);
                            A(z());
                        } else {
                            jqoVar.b(iB, false);
                        }
                    } else {
                        jqoVar.b(iB, false);
                    }
                } else if (i == iB - 1) {
                    aunnVar = jqoVar.a;
                    abvcVar = (abvc) aunnVar.io();
                    abtuVar = abtu.b;
                    if (abvcVar.n(abtuVar)) {
                        ((abvc) aunnVar.io()).i(abtuVar);
                        A(z());
                    } else {
                        jqoVar.b(iB, false);
                    }
                } else {
                    jqoVar.b(iB, false);
                }
            } else {
                jqoVar.b(iB, false);
            }
        }
        this.b = false;
    }

    public abstract xhc y();

    public abstract xhc z();
}
