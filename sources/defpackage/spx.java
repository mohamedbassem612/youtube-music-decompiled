package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class spx {
    protected static final spw a = new spw();

    protected static List j(smc smcVar, int i) {
        if (i == 1) {
            return smcVar.V();
        }
        if (i != 2) {
            return i != 3 ? Collections.EMPTY_LIST : smcVar.af();
        }
        return smcVar.Z();
    }

    public abstract sga h();

    public abstract String i();

    public abstract void k();

    public abstract void l(sgm sgmVar);

    public abstract void m(int i, int i2);

    public abstract void o();

    public abstract void p(zhz zhzVar);

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract void v();

    public abstract void w();

    public abstract void x(aazk aazkVar);

    public abstract void y(aazn aaznVar);

    public void z() {
        throw null;
    }

    public void n(long j) {
    }
}
