package defpackage;

import android.graphics.Bitmap;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class acpk implements sxu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public acpk(acpl acplVar, Optional optional, int i) {
        this.$cid = i;
        this.a = optional;
        this.b = acplVar;
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void b(Object obj, Object obj2) {
        if (this.$cid == 0) {
            acpl acplVar = (acpl) this.b;
            tym tymVar = acplVar.o;
            acpj acpjVar = (acpj) tymVar;
            acpjVar.aN(acplVar.f, (Bitmap) obj2);
            ((Optional) this.a).isPresent();
            return;
        }
        gnq gnqVar = (gnq) obj2;
        Object obj3 = this.a;
        ivc ivcVar = (ivc) obj3;
        if (jku.c(ivcVar.getActivity())) {
            if (gnqVar == null) {
                ivcVar.j.g((cc) obj3);
                return;
            }
            ivcVar.i((hej) this.b, gnqVar.a);
        }
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void iT(Object obj, Exception exc) {
        if (this.$cid == 0) {
            acpl acplVar = (acpl) this.b;
            if (acplVar.m.aH() && acplVar.b != null) {
                acplVar.b = null;
            }
            ((Optional) this.a).isPresent();
            return;
        }
        ((agrc) ((agrc) ((agrc) ivc.ae.b()).j(exc)).k("com/google/android/apps/youtube/music/sideloaded/ui/SideloadedFragment$1", "onError", 'I', "SideloadedFragment.java")).t("Error in browse response");
        hej hejVar = (hej) this.b;
        if (hejVar.g != hei.e) {
            hejVar.k(hei.d);
            hejVar.i = ((ivc) this.a).c.b(exc);
            if (exc != null) {
                hejVar.n = exc;
            }
        }
        ((ivc) this.a).k(hejVar);
    }

    public acpk(ivc ivcVar, heh hehVar, int i) {
        this.$cid = i;
        this.b = hehVar;
        this.a = ivcVar;
    }
}
