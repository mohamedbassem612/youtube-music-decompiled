package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vqn implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vqn(how howVar, wby wbyVar, Class cls, int i) {
        this.$cid = i;
        this.c = howVar;
        this.b = wbyVar;
        this.a = cls;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, wek] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        if (this.$cid != 0) {
            String str = (String) obj;
            ?? r0 = this.b;
            Object obj2 = this.c;
            how howVar = (how) obj2;
            howVar.j = r0;
            avmn avmnVar = howVar.i;
            if (avmnVar == null || avmnVar.f()) {
                howVar.i = howVar.d.aI().N().D(new hbz(3)).y(new hby(obj2, 2)).al(new hjd(obj2, 16), new gfh(20));
            }
            howVar.d.kk(new hov(str, (Class) this.a));
            return;
        }
        Object obj3 = this.a;
        agev agevVar = (agev) obj;
        vqs vqsVar = (vqs) obj3;
        tss tssVar = vqsVar.j;
        tssVar.getClass();
        boolean zG = agevVar.g();
        Object obj4 = this.c;
        int i = 1;
        if (zG) {
            View view = (View) obj4;
            tuk.l(view, true);
            if (!vqsVar.d) {
                vxz vxzVar = vqsVar.k;
                if (vxzVar.l(398, 45827058L, false) || vxzVar.l(397, 45827057L, false)) {
                    view.bringToFront();
                }
            }
        }
        if (!vqsVar.b.g()) {
            agev agevVarA = ((agev) (!agevVar.g() ? vqsVar.m.c : agevVar)).a(new vzs(obj3, i));
            if (agevVarA.g()) {
                tssVar.g((tuu) agevVarA.c());
            }
            tssVar.h(agevVar.g(), true);
        }
        agev agevVar2 = vqsVar.a;
        if (agevVar2.g()) {
            ((vqt) agevVar2.c()).a((View) obj4);
        }
        if (vqsVar.c) {
            ((AccessibilityLayerLayout) this.b).b(!agevVar.g());
        }
        hed hedVar = vqsVar.l;
        if (hedVar != null) {
            if (agevVar.g() && ((vob) agevVar.c()).O() != 5) {
                ((awku) hedVar.b).kk(vpd.b);
            } else {
                ((awku) hedVar.b).kk(vpd.a);
                ((tss) hedVar.c).h(false, true);
            }
        }
    }

    public /* synthetic */ vqn(vqs vqsVar, AccessibilityLayerLayout accessibilityLayerLayout, View view, int i) {
        this.$cid = i;
        this.a = vqsVar;
        this.b = accessibilityLayerLayout;
        this.c = view;
    }
}
