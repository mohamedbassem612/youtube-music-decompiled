package defpackage;

import android.content.Context;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vrd implements vxc {
    public final vxe a;
    private final vsq b;
    private final Context c;
    private vsq d;
    private final xdi e;
    private final hed f;
    private final wjr g;

    public vrd(hed hedVar, vsq vsqVar, xdi xdiVar, wjr wjrVar, Context context, vxe vxeVar) {
        this.f = hedVar;
        this.b = vsqVar;
        this.e = xdiVar;
        this.g = wjrVar;
        this.c = context;
        this.a = vxeVar;
        Boolean bool = Boolean.FALSE;
        bool.booleanValue();
        bool.booleanValue();
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        vor vorVarB;
        apxs apxsVar;
        int i;
        avlr avlrVarJ;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apxs.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apxs apxsVar2 = (apxs) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        int i2 = 7;
        if ((apxsVar2.c & 1) != 0) {
            xdi xdiVar = this.e;
            Optional optionalB = xdi.b(ajwoVar);
            if (optionalB.isEmpty()) {
                return;
            }
            Object obj = optionalB.get();
            vxz vxzVar = (vxz) xdiVar.c;
            if ((vxzVar.l(398, 45827058L, false) || vxzVar.l(397, 45827057L, false)) && (i = (apxsVar = (apxs) obj).d) == 10) {
                akuc akucVarA = akuc.a((i == 10 ? (akud) apxsVar.e : akud.a).c);
                if (akucVarA == null) {
                    akucVarA = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
                }
                akuc akucVar = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
                if (akucVarA != akucVar) {
                    Object obj2 = xdiVar.i;
                    akuc akucVarA2 = akuc.a((apxsVar.d == 10 ? (akud) apxsVar.e : akud.a).c);
                    if (akucVarA2 != null) {
                        akucVar = akucVarA2;
                    }
                    avlrVarJ = avlr.J(((hed) obj2).b(akucVar));
                } else {
                    avlrVarJ = ((hed) xdiVar.i).a();
                }
            } else {
                avlrVarJ = ((hed) xdiVar.i).a();
            }
            ((vwt) xdiVar.e).D(new vtq(xdiVar, avlr.j(avlrVarJ, avlr.J(ajwoVar), new jnx(7)).K(new uxe(9)).an(Optional.empty()), map, 1, (byte[]) null));
            return;
        }
        akuf akufVar = apxsVar2.i;
        if (akufVar == null) {
            akufVar = akuf.a;
        }
        akuh akuhVar = (akufVar.b == 138681066 ? (akuj) akufVar.c : akuj.b).h;
        if (akuhVar == null) {
            akuhVar = akuh.a;
        }
        if (akuhVar.b == 449330433) {
            vorVarB = (vor) this.f.a().aj();
        } else {
            akuf akufVar2 = apxsVar2.i;
            if (akufVar2 == null) {
                akufVar2 = akuf.a;
            }
            akuh akuhVar2 = (akufVar2.b == 138681066 ? (akuj) akufVar2.c : akuj.b).h;
            if (akuhVar2 == null) {
                akuhVar2 = akuh.a;
            }
            if (akuhVar2.b != 2421) {
                hed hedVar = this.f;
                akuc akucVarA3 = akuc.a((apxsVar2.d == 10 ? (akud) apxsVar2.e : akud.a).c);
                if (akucVarA3 == null) {
                    akucVarA3 = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
                }
                vorVarB = hedVar.b(akucVarA3);
            } else {
                vorVarB = (vor) this.f.a().aj();
            }
        }
        vor vorVar = vorVarB;
        if (vorVar.J(apxsVar2)) {
            return;
        }
        akuf akufVar3 = apxsVar2.i;
        if ((akufVar3 == null ? akuf.a : akufVar3).b == 138681066) {
            if (akufVar3 == null) {
                akufVar3 = akuf.a;
            }
            int i3 = akufVar3.b;
            boolean z = (i3 == 138681066 ? (akuj) akufVar3.c : akuj.b).B;
            vorVar.w(i3 == 138681066 ? (akuj) akufVar3.c : akuj.b);
        }
        if ((apxsVar2.c & SemanticState.Modal) != 0) {
            try {
                final aoll aollVar = (aoll) this.g.D(apxsVar2.p.G(), aoll.a);
                aollVar.getClass();
                if ((aollVar.b & 2) != 0) {
                    aoln aolnVar = aollVar.d;
                    if (aolnVar == null) {
                        aolnVar = aoln.a;
                    }
                    int i4 = aolnVar.b;
                    if (i4 == 0) {
                        i2 = 8;
                    } else if (i4 != 2490) {
                        if (i4 == 8173) {
                            i2 = 5;
                        } else if (i4 == 36852) {
                            i2 = 6;
                        } else if (i4 == 138681066) {
                            i2 = 2;
                        } else if (i4 == 153515154) {
                            i2 = 1;
                        } else if (i4 != 434827281) {
                            i2 = i4 != 441573002 ? 0 : 3;
                        } else {
                            i2 = 4;
                        }
                    }
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i2 - 1 != 1) {
                        throw new IllegalArgumentException("Only support EPSLR in PanelResponse.");
                    }
                    aoln aolnVar2 = aollVar.d;
                    if (aolnVar2 == null) {
                        aolnVar2 = aoln.a;
                    }
                    vorVar.w(aolnVar2.b == 138681066 ? (akuj) aolnVar2.c : akuj.b);
                }
                if ((aollVar.b & 8) != 0) {
                    this.d = new vsq() { // from class: vrc
                        @Override // defpackage.vsq
                        public final void a() {
                            ajwo ajwoVar2 = aollVar.f;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            this.a.a.a(ajwoVar2);
                        }
                    };
                }
            } catch (RuntimeException e) {
                zvp.a(zvn.b, zvm.z, "Show Engagement Panel Command Exception ".concat(String.valueOf(e.getMessage())));
                tuk.o(this.c, "Engagement Panel failed to load.", 0);
            }
        }
        boolean z2 = apxsVar2.h;
        String strEP = yno.eP(apxsVar2);
        if (strEP == null) {
            strEP = (String) tym.U(map, "engagement_panel_id_key", String.class);
        }
        String str = strEP;
        vsq vsqVar = this.d;
        if (vsqVar == null) {
            vsqVar = this.b;
        }
        yno.eQ(ajwoVar, vorVar, vsqVar, (vnz) tym.U(map, "engagement_panel_close_listener_key", vnz.class), str, false);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
