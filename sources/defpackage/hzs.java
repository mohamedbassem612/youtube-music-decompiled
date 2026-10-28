package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzs implements acdp {
    private final acdq a;
    private final List b;
    private final agke c;
    private final aunn d;

    public hzs(acdq acdqVar, hzt hztVar, hzt hztVar2, hzt hztVar3, hzu hzuVar, hzu hzuVar2, List list, aunn aunnVar) {
        this.a = acdqVar;
        this.b = list;
        this.c = agke.u(hztVar, hzuVar, hztVar2, hzuVar2, hztVar3);
        this.d = aunnVar;
    }

    public final void a() {
        this.a.w(this);
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if ((i & 262144) != 0) {
            abrt abrtVar = (abrt) this.d.io();
            List list = this.a.D() ? this.c : this.b;
            if (abrtVar.d.equals(list)) {
                return;
            }
            abrtVar.f(list);
            abrtVar.c(false);
        }
    }
}
