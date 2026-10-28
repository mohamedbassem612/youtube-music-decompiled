package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vhv implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public vhv(cc ccVar, int i) {
        this.$cid = i;
        this.a = ccVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        vjy vjyVar;
        xgn xgnVar;
        wxr wxrVar;
        switch (this.$cid) {
            case 0:
                vhx vhxVar = (vhx) this.a;
                ((vho) vhxVar.b).a();
                tuk.i(vhxVar.d);
                vhz vhzVar = vhxVar.c;
                vhzVar.b(3);
                vhzVar.g = null;
                vhzVar.e.removeCallbacksAndMessages(null);
                break;
            case 1:
                ((vgu) this.a).l();
                break;
            case 2:
                ((vhx) this.a).d.setText("");
                break;
            case 3:
                ((vjf) this.a).b();
                break;
            case 4:
                ((vjf) this.a).b();
                break;
            case 5:
                vjf vjfVar = (vjf) this.a;
                Object obj = vjfVar.m;
                if (obj != null) {
                    ((vjj) obj).f(new ulo(11));
                    tuk.h(((vjq) obj).d);
                }
                vjfVar.a();
                break;
            case 6:
                Object obj2 = this.a;
                Optional optionalEmpty = Optional.empty();
                vjq vjqVar = (vjq) obj2;
                if (vjqVar.t != null && optionalEmpty.isEmpty()) {
                    vjqVar.t.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(179247)), null);
                }
                if (optionalEmpty.isEmpty() && (vjyVar = vjqVar.n) != null && vjyVar.d().isPresent() && !vjqVar.v) {
                    vjqVar.v = true;
                    vjqVar.k.a((ajwo) vjqVar.n.d().get());
                } else {
                    optionalEmpty.isPresent();
                    if (!vjqVar.v) {
                        optionalEmpty.isPresent();
                        if (((Boolean) optionalEmpty.orElse(Boolean.FALSE)).booleanValue()) {
                            vjqVar.v = true;
                            vxe vxeVar = vjqVar.k;
                            ajwo ajwoVar = ((apbl) optionalEmpty.get()).d;
                            if (ajwoVar == null) {
                                ajwoVar = ajwo.a;
                            }
                            vxeVar.a(ajwoVar);
                        }
                    }
                    ((vjj) obj2).e.isPresent();
                    taf.i(ahng.n(agpi.a), vjqVar.j, new tsq(6), new rjy(obj2, (Object) optionalEmpty, (Object) optionalEmpty, 10, (byte[]) null), null);
                }
                break;
            case 7:
                vor vorVar = (vor) this.a;
                xgn xgnVarG = vorVar.g();
                if (xgnVarG != null) {
                    xgnVarG.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(31880)), null);
                }
                vob vobVarD = vorVar.d();
                akuj akujVarU = vobVarD != null ? vobVarD.u() : null;
                if (vobVarD == null || akujVarU == null || (akujVarU.c & 524288) == 0) {
                    vorVar.M(false);
                } else {
                    vxe vxeVar2 = vorVar.h;
                    ajwo ajwoVar2 = akujVarU.y;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    vxeVar2.a(ajwoVar2);
                }
                break;
            case 8:
                vpk vpkVar = (vpk) this.a;
                if (!vpkVar.l.l(5, 45363147L, false) && (xgnVar = vpkVar.j) != null) {
                    xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(33917)), null);
                }
                yhi yhiVar = vpkVar.m;
                if (yhiVar != null) {
                    yhiVar.b();
                }
                break;
            case 9:
                yhi yhiVar2 = ((vpy) this.a).a;
                if (yhiVar2 != null) {
                    yhiVar2.b();
                }
                break;
            case 10:
                ((awkx) this.a).kk(view);
                break;
            case 11:
                ((bp) this.a).iQ(false, false, false);
                break;
            case 12:
                ((wzq) this.a).d();
                break;
            case 13:
                xac xacVar = (xac) this.a;
                if (!xacVar.s) {
                    xacVar.j(view);
                } else {
                    xacVar.s = false;
                }
                break;
            case 14:
                ((xbf) this.a).P();
                break;
            case 15:
                ((xbf) this.a).J();
                break;
            case 16:
                wxl wxlVar = ((xbf) this.a).m;
                if (wxlVar != null) {
                    wxlVar.d();
                }
                break;
            case 17:
                wwn wwnVar = ((xbn) this.a).u;
                if (wwnVar != null && (wxrVar = wwnVar.e) != null) {
                    wxrVar.a();
                    break;
                }
                break;
            case 18:
                ((xbs) this.a).n();
                break;
            case 19:
                Object obj3 = this.a;
                xci xciVar = (xci) obj3;
                wxl wxlVar2 = xciVar.b;
                if (!wxlVar2.u()) {
                    xxj xxjVar = xciVar.T;
                    if (xxjVar != null) {
                        xxjVar.e();
                    }
                    xciVar.ah.z(xciVar.af, xciVar.ag, false);
                    if (!xciVar.V()) {
                        ((xcb) obj3).l().setVisibility(8);
                    } else {
                        ((xcb) obj3).l().setVisibility(4);
                    }
                } else {
                    wxlVar2.g();
                }
                break;
            default:
                xpk xpkVar = (xpk) ((xpl) this.a).a;
                Context contextRequireContext = xpkVar.requireContext();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", contextRequireContext.getPackageName(), null));
                intent.addFlags(268435456);
                afwl.m(xpkVar.requireContext(), intent);
                xpkVar.dismiss();
                break;
        }
    }

    public /* synthetic */ vhv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
