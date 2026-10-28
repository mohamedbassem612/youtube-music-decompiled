package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class addp implements nwg {
    private final /* synthetic */ int $cid;
    public final Object a;
    public final Object b;

    public addp(ci ciVar, adbr adbrVar, auor auorVar, int i) {
        this.$cid = i;
        this.b = ciVar;
        this.a = adbrVar;
        adbrVar.d.add(auorVar);
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return this.$cid != 0 ? annh.a : amtq.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return this.$cid != 0 ? a.r() : a.r();
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb c(Object obj, nwf nwfVar) {
        avlb avlbVarI;
        if (this.$cid != 0) {
            return avlb.n(new hmg(this, (anng) obj, 3));
        }
        amtq amtqVar = (amtq) obj;
        int i = amtqVar.c;
        if ((i & 2) == 0 || (i & 1) == 0) {
            return avlb.e();
        }
        if (amtqVar.g) {
            return avlb.n(new mgd(this, amtqVar, nwfVar, 18, (short[]) null));
        }
        Object obj2 = this.a;
        int iAS = a.aS(amtqVar.d);
        adbp adbpVar = (iAS == 0 || iAS != 2) ? adbp.a : adbp.b;
        adbr adbrVar = (adbr) obj2;
        if (adbrVar.b()) {
            ((agrc) ((agrc) adbr.a.b()).k("com/google/android/libraries/youtube/rendering/elements/activestate/ActiveStateLifecycleController", "attemptTransition", 166, "ActiveStateLifecycleController.java")).w("Could not transition, request is blocked %s", adbrVar.c.toString());
        }
        for (auor auorVar : adbrVar.d) {
            adbrVar.c.add(auorVar);
            adbm adbmVar = new adbm(obj2, auorVar, adbpVar);
            if (adbpVar == adbp.b) {
                auorVar.k();
                ((Handler) auorVar.b).sendEmptyMessageDelayed(153535, 1000L);
                auorVar.a = adbmVar;
                if (adbpVar.equals(adbp.a)) {
                }
            } else {
                auorVar.k();
            }
            adbrVar.c(auorVar);
        }
        if (!adbrVar.b()) {
            adbrVar.b.execute(new acnp(obj2, adbpVar, 13, null));
        }
        adbrVar.f = new awlk();
        if (adbpVar.equals(adbp.a)) {
            avlbVarI = avlb.e();
        } else {
            awlk awlkVar = adbrVar.f;
            vtu vtuVar = new vtu(obj2, 20);
            avni avniVar = avoi.d;
            avlbVarI = awlkVar.I(avniVar, avniVar, avoi.c, vtuVar);
        }
        return avlbVarI.j(new mgd(this, amtqVar, nwfVar, 19, (short[]) null));
    }

    @Override // defpackage.nwg
    public final /* synthetic */ avlb d(mew mewVar, nwf nwfVar) {
        return this.$cid != 0 ? nrb.a(this, mewVar, nwfVar) : nrb.a(this, mewVar, nwfVar);
    }

    public addp(vxe vxeVar, mfy mfyVar, int i) {
        this.$cid = i;
        this.a = vxeVar;
        this.b = mfyVar;
    }
}
