package defpackage;

import android.os.Looper;
import j$.util.Objects;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vqz implements vxc {
    private final Executor a;
    private final vxz b;
    private final hed c;

    public vqz(hed hedVar, Executor executor, vxz vxzVar) {
        this.c = hedVar;
        this.a = executor;
        Boolean.FALSE.booleanValue();
        this.b = vxzVar;
    }

    @Override // defpackage.vxc
    public final void a(ajwo ajwoVar) {
        throw null;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        int i;
        vor vorVarB;
        boolean z;
        hed hedVar;
        akud akudVar;
        akuc akucVarA;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(alhf.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        alhf alhfVar = (alhf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(alhf.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        String str = null;
        boolean z2 = true;
        if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
            if (((alhfVar.d == 4 ? (akud) alhfVar.e : akud.a).b & 2) != 0) {
                str = (alhfVar.d == 4 ? (akud) alhfVar.e : akud.a).d;
            } else {
                int i2 = alhfVar.d;
                if (i2 == 1) {
                    str = i2 == 1 ? (String) alhfVar.e : "";
                }
            }
        }
        if (ahno.aa(str)) {
            str = (String) tym.U(map, "engagement_panel_id_key", String.class);
        }
        if (ahno.aa(str)) {
            return;
        }
        vxz vxzVar = this.b;
        if ((vxzVar.l(398, 45827058L, false) || vxzVar.l(397, 45827057L, false)) && (i = alhfVar.d) == 4) {
            akuc akucVarA2 = akuc.a((i == 4 ? (akud) alhfVar.e : akud.a).c);
            if (akucVarA2 == null) {
                akucVarA2 = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
            }
            akuc akucVar = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
            if (akucVarA2 != akucVar) {
                hed hedVar2 = this.c;
                akuc akucVarA3 = akuc.a((alhfVar.d == 4 ? (akud) alhfVar.e : akud.a).c);
                if (akucVarA3 != null) {
                    akucVar = akucVarA3;
                }
                vorVarB = hedVar2.b(akucVar);
            } else {
                z = alhfVar.h;
                hedVar = this.c;
                if (z) {
                    vorVarB = (vor) hedVar.a().aj();
                } else {
                    if (alhfVar.d == 4) {
                        akudVar = (akud) alhfVar.e;
                    } else {
                        akudVar = akud.a;
                    }
                    akucVarA = akuc.a(akudVar.c);
                    if (akucVarA == null) {
                        akucVarA = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
                    }
                    vorVarB = hedVar.b(akucVarA);
                }
            }
        } else {
            z = alhfVar.h;
            hedVar = this.c;
            if (z) {
                vorVarB = (vor) hedVar.a().aj();
            } else {
                if (alhfVar.d == 4) {
                    akudVar = (akud) alhfVar.e;
                } else {
                    akudVar = akud.a;
                }
                akucVarA = akuc.a(akudVar.c);
                if (akucVarA == null) {
                    akucVarA = akuc.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
                }
                vorVarB = hedVar.b(akucVarA);
            }
        }
        String str2 = alhfVar.d == 1 ? (String) alhfVar.e : "";
        String strK = vorVarB.k();
        if (alhfVar.f && !ahno.aa(strK) && Objects.equals(strK, str2) && vorVarB.h(strK).f() == vok.b) {
            if ((alhfVar.c & 2) != 0) {
                vxe vxeVar = vorVarB.h;
                ajwo ajwoVar2 = alhfVar.g;
                if (ajwoVar2 == null) {
                    ajwoVar2 = ajwo.a;
                }
                vxeVar.a(ajwoVar2);
                return;
            }
            return;
        }
        boolean z3 = alhfVar.i;
        if (!alhfVar.j && !vxzVar.l(283, 45728364L, false)) {
            z2 = false;
        }
        if (!z3 || Looper.myLooper() != Looper.getMainLooper()) {
            this.a.execute(afwl.i(new hff(z2, vorVarB, str, 2)));
        } else if (z2) {
            vorVarB.y(str);
        } else {
            vorVarB.K(str);
        }
    }
}
