package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class rnu implements vxc {
    private final awmd a;

    public rnu(awmd awmdVar) {
        this.a = awmdVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        rog rogVar = (rog) this.a.io();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(alkk.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        alkk alkkVar = (alkk) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        rnv rnvVar = (rnv) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", rnv.class);
        if (rnvVar != null) {
            rogVar.a(rnvVar);
        }
        dd ddVar = rogVar.h;
        rogVar.i = (roi) ddVar.g("INLINE_AUTH_FRAGMENT_TAG");
        roi roiVar = rogVar.i;
        if (roiVar == null) {
            roi roiVar2 = new roi();
            roiVar2.g = rogVar;
            rogVar.i = roiVar2;
            av avVar = new av(ddVar);
            avVar.g(0, rogVar.i, "INLINE_AUTH_FRAGMENT_TAG", 1);
            avVar.a(false, true);
        } else {
            roiVar.g = rogVar;
            if (!roiVar.isVisible()) {
                av avVar2 = new av(ddVar);
                avVar2.m(rogVar.i);
                avVar2.a(false, true);
            }
        }
        rogVar.k(alkkVar);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
