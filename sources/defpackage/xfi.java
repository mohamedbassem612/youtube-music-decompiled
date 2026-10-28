package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xfi implements vxc {
    private static final agsn a = agsn.j();
    private final abte b;

    public xfi(abte abteVar) {
        this.b = abteVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amtu.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        amtu amtuVar = (amtu) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        int i = amtuVar.c;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) {
            ((agsj) ((agsj) a.c()).k("com/google/android/libraries/youtube/logging/flow/LogFlowLoggingEventCommandResolver", "resolve", 35, "LogFlowLoggingEventCommandResolver.java")).t("Unable to log event, missing Flow Logging parameter");
            return;
        }
        int i2 = amtuVar.d;
        int iN = atqp.N(amtuVar.e);
        if (iN == 0) {
            iN = 1;
        }
        xfh xfhVar = new xfh(i2, iN);
        if ((i & 8) != 0) {
            akzk akzkVar = amtuVar.g;
            if (akzkVar == null) {
                akzkVar = akzk.a;
            }
            xfhVar.a = akzkVar;
        }
        alai alaiVarA = alai.a(amtuVar.f);
        if (alaiVarA == null) {
            alaiVarA = alai.FLOW_TYPE_UNKNOWN;
        }
        alai alaiVar = alaiVarA;
        int iAU = a.aU(amtuVar.j);
        if (iAU != 0 && iAU == 2) {
            this.b.d(xfhVar, alaiVar);
            return;
        }
        int i3 = amtuVar.c;
        if ((i3 & 16) == 0) {
            this.b.b(xfhVar, alaiVar);
            return;
        }
        String str = amtuVar.h;
        int i4 = i3 & 32;
        abte abteVar = this.b;
        if (i4 != 0) {
            abteVar.c(xfhVar, alaiVar, str, amtuVar.i);
        } else {
            abteVar.e(xfhVar, alaiVar, str);
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
