package defpackage;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acfn extends zkk {
    public acfm a;
    public acfm b;
    public Observer c;
    public acjj g;
    private final abnc h;
    private final abmt i;
    private final aunn j;
    public int f = 4;
    public boolean e = false;
    public final Set d = new HashSet();

    public acfn(abnc abncVar, abmt abmtVar, aunn aunnVar) {
        this.h = abncVar;
        this.i = abmtVar;
        this.j = aunnVar;
    }

    public final void b() {
        this.c = new Observer() { // from class: acfk
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                this.a.notifyObservers(obj);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [acfl, acfm] */
    /* JADX WARN: Type inference failed for: r3v2, types: [acfl, acfm] */
    public final void c(acfm acfmVar) {
        avbs avbsVar = ((acfg) acfmVar).A;
        boolean zB = avbsVar.b();
        int i = this.f;
        int i2 = avbsVar.b;
        boolean z = i != i2;
        if (z) {
            this.f = i2;
        }
        ?? r3 = this.b;
        if (r3 == 0 || r3 == acfmVar) {
            ?? r4 = this.a;
            if (r4 != 0 && r4 != acfmVar) {
                r4.J();
            }
        } else {
            r3.J();
        }
        if (zB) {
            this.b = acfmVar;
        } else {
            this.b = null;
            this.a = acfmVar;
        }
        if (z) {
            for (aauw aauwVar : this.d) {
                if (avbsVar.a) {
                    if (aauwVar.b.g.l(217, 45698624L, false)) {
                        aauwVar.c.execute(afwl.i(new aadw(aauwVar, avbsVar, 18, (byte[]) null)));
                    } else {
                        aauwVar.a.h((acer) avbsVar.d);
                    }
                }
            }
        }
    }

    public final boolean d(acfm acfmVar) {
        boolean zL = this.i.g.l(315, 45742506L, false);
        acfm acfmVar2 = this.b;
        if (!zL) {
            return acfmVar2 != null ? acfmVar.equals(acfmVar2) : acfmVar.equals(this.a);
        }
        if (acfmVar2 == null) {
            acfmVar2 = this.a;
        }
        if (acfmVar2 != null) {
            return ((acfg) acfmVar).A.b == ((acfg) acfmVar2).A.b;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [acfl, acfm] */
    /* JADX WARN: Type inference failed for: r3v1, types: [acfl, acfm] */
    public final boolean e(avbs avbsVar) {
        if (avbsVar.b != this.f) {
            return false;
        }
        boolean zB = avbsVar.b();
        ?? r0 = this.b;
        if (zB) {
            if (r0 == 0 || !r0.aj()) {
                return false;
            }
        } else {
            if (r0 != 0) {
                zvl zvlVar = (zvl) this.j.io();
                zvj zvjVarA = zvk.a();
                zvjVarA.j = 21;
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.d("CurrentPlaybackServiceType tracked by MPC is non-transient, but we have non-null transient director");
                zvlVar.a(zvjVarA.a());
                return false;
            }
            ?? r3 = this.a;
            if (r3 == 0 || !r3.aj()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.agfr
    public final /* bridge */ /* synthetic */ Object io() {
        acjj acjjVar = this.g;
        if (acjjVar != null) {
            return ((abnb) acjjVar.a()).io();
        }
        return this.i.f.l(22, 45423434L, false) ? ((abnb) this.h.a).io() : zkj.a;
    }
}
