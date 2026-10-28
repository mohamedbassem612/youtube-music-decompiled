package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acnb implements dqn {
    public final SwipeRefreshLayout a;
    public final acqz b;
    public final xgm c;
    public final actm d;
    public final xeu e;
    public final acpo f;
    public final aclm g;
    public final aunn h;
    public final xgj i;
    public boolean j;
    public String k;
    public final hno l;
    private final acmz m;
    private final mbc n;

    public acnb(SwipeRefreshLayout swipeRefreshLayout, acqz acqzVar, xgm xgmVar, acmz acmzVar, actm actmVar, xeu xeuVar, hno hnoVar, mbc mbcVar, acpo acpoVar, aclm aclmVar, aunn aunnVar) {
        swipeRefreshLayout.getClass();
        acqzVar.getClass();
        xgmVar.getClass();
        actmVar.getClass();
        xeuVar.getClass();
        hnoVar.getClass();
        mbcVar.getClass();
        acpoVar.getClass();
        aclmVar.getClass();
        aunnVar.getClass();
        this.a = swipeRefreshLayout;
        this.b = acqzVar;
        this.c = xgmVar;
        this.m = acmzVar;
        this.d = actmVar;
        this.e = xeuVar;
        this.l = hnoVar;
        this.n = mbcVar;
        this.f = acpoVar;
        this.g = aclmVar;
        this.h = aunnVar;
        this.i = new xgj(xhb.b(244443));
    }

    @Override // defpackage.dqn
    public final void a() {
        String str;
        if (this.j) {
            return;
        }
        this.j = true;
        xih xihVarB = null;
        this.c.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, this.i, null);
        mbc mbcVar = this.n;
        long epochMilli = mbcVar.f().toEpochMilli();
        aunn aunnVar = this.h;
        if (((aenu) aunnVar.io()).m()) {
            String string = UUID.randomUUID().toString();
            string.getClass();
            this.k = string;
            xihVarB = ((aenu) aunnVar.io()).p(string, Long.valueOf(epochMilli)).b();
        }
        this.d.m(0, 5, null, xihVarB, mbcVar.f().toEpochMilli(), "warm", this.f.hx());
        acqz acqzVar = this.b;
        acqh acqhVar = acqzVar.ag;
        int iC = acqhVar == null ? -1 : acqhVar.C();
        if (iC == -1) {
            c();
            b();
            return;
        }
        acqzVar.p(acqj.b);
        acqzVar.Q = 0;
        acrn acrnVar = acqzVar.b;
        acrt acrtVar = acrt.CRITICAL;
        synchronized (acrnVar.g) {
            str = acrnVar.j.b;
        }
        if (ahno.aa(str)) {
            c();
            b();
            if (this.l.V()) {
                return;
            }
        } else {
            acrnVar.l(acrnVar.j, null, null, str, acrnVar.l, acrtVar, false, false);
        }
        acna acnaVar = new acna(this, iC);
        if ((!acqzVar.at.V() || acqzVar.P()) && acqzVar.b.i(acnaVar)) {
            return;
        }
        c();
        b();
    }

    public final void b() {
        String str;
        aunn aunnVar = this.h;
        if (!((aenu) aunnVar.io()).m() || (str = this.k) == null) {
            return;
        }
        ((aenu) aunnVar.io()).g(str);
        this.k = null;
    }

    public final void c() {
        this.a.k(false);
        this.j = false;
    }

    public final boolean d() {
        boolean zA;
        if (((vxz) this.l.i).l(249, 45798230L, false)) {
            return false;
        }
        acrn acrnVar = this.b.b;
        synchronized (acrnVar.g) {
            zA = acrnVar.j.a();
        }
        return zA && this.m.d() && !this.b.L();
    }
}
