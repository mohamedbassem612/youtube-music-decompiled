package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gvn extends svv {
    private final cf a;

    public gvn(cf cfVar, swh swhVar, vxe vxeVar, xgn xgnVar, abfv abfvVar) {
        super(cfVar, swhVar, vxeVar, xgnVar, abfvVar);
        cfVar.getClass();
        this.a = cfVar;
    }

    private final void d(ajwo ajwoVar, bp bpVar) {
        Bundle arguments = bpVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putByteArray("navigation_endpoint", ajwoVar.toByteArray());
        bpVar.setArguments(arguments);
        av avVar = new av(this.a.getSupportFragmentManager());
        avVar.g(0, bpVar, "DialogFragmentFromNavigation", 1);
        avVar.a(true, true);
    }

    @Override // defpackage.svv, defpackage.vxc
    public final boolean b() {
        return false;
    }

    @Override // defpackage.svv, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqsy.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aqsz aqszVar = ((aqsy) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
        if (aqszVar == null) {
            aqszVar = aqsz.a;
        }
        int i = aqszVar.b;
        if (i != 127046814) {
            if (i == 127387931) {
                d(ajwoVar, taq.P((aqtb) aqszVar.c));
                return;
            } else {
                super.c(ajwoVar, map);
                return;
            }
        }
        aqtc aqtcVar = (aqtc) aqszVar.c;
        aqtcVar.getClass();
        sws swsVar = new sws();
        Bundle bundle = new Bundle();
        bundle.putByteArray("UnlimitedFamilyProfileInterstitialRenderer", aqtcVar.toByteArray());
        swsVar.setArguments(bundle);
        d(ajwoVar, swsVar);
    }
}
