package defpackage;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lpg implements lot {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lpg(afkg afkgVar, kjc kjcVar, lqa lqaVar, int i) {
        this.$cid = i;
        this.a = afkgVar;
        this.b = kjcVar;
        this.c = lqaVar;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    @Override // defpackage.lot
    public final void a(lpa lpaVar) {
        int i = this.$cid;
        if (i == 0) {
            ((afkg) this.a).removeCallbacksAndMessages(null);
            boolean zJ = lpaVar.j();
            Object obj = this.b;
            if (zJ) {
                ((kjc) obj).x(lpaVar.f());
                return;
            } else {
                if (((lpf) lpaVar).c) {
                    ((lqa) this.c).r();
                    return;
                }
                Exception excE = lpaVar.e();
                excE.getClass();
                ((kjc) obj).w(excE);
                return;
            }
        }
        int i2 = 0;
        if (i == 1) {
            aha ahaVar = ((kli) this.a).c;
            Object obj2 = this.c;
            synchronized (ahaVar) {
                ahaVar.remove(obj2);
            }
            this.b.cancel(false);
            return;
        }
        agrf agrfVar = xtv.f;
        if (lpaVar.j()) {
            agrx agrxVar = agso.a;
            lpaVar.f();
            if (lpaVar.f() == null || ((Integer) lpaVar.f()).intValue() != 0) {
            }
            Object obj3 = this.b;
            Object obj4 = this.c;
            ((View) this.a).setVisibility(i2);
            ((View) obj4).setVisibility(i2);
            ((View) obj3).setVisibility(i2);
        }
        ((agrc) ((agrc) xtv.f.c().i(agso.a, "MDX.MdxBaseMediaRouteChooserDialog")).k("com/google/android/libraries/youtube/mdx/mediaroute/dialogfactory/MdxBaseMediaRouteChooserDialog", "setUpCastSettingsFooter", 328, "MdxBaseMediaRouteChooserDialog.java")).t("cannot read cast settings value, assuming cast enabled since it is the default value");
        i2 = 8;
        Object obj5 = this.b;
        Object obj6 = this.c;
        ((View) this.a).setVisibility(i2);
        ((View) obj6).setVisibility(i2);
        ((View) obj5).setVisibility(i2);
    }

    public /* synthetic */ lpg(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }
}
