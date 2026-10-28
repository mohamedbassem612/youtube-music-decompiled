package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gvz extends gut {
    private static final agrf a = agrf.h("com/google/android/apps/youtube/music/command/OfflineVideoCommandResolver");
    private final awmd b;
    private final xgm c;

    public gvz(awmd awmdVar, xgm xgmVar) {
        this.b = awmdVar;
        this.c = xgmVar;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aoia aoiaVarY;
        String str;
        String str2;
        Object objS = tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aohd.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        aohd aohdVar = (aohd) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if ((aohdVar.c & 8) != 0) {
            apji apjiVar = aohdVar.g;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aoic.a);
            apjiVar.c(aihlVarCheckIsLite2);
            Object objK2 = apjiVar.j.k(aihlVarCheckIsLite2.d);
            aoiaVarY = (aoia) (objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2));
        } else {
            aoiaVarY = null;
        }
        if (aoiaVarY == null) {
            aoiaVarY = fhz.Y(objS);
        }
        if (aoiaVarY == null) {
            ((agrc) ((agrc) a.b().i(agso.a, "OfflineVideoCmd")).k("com/google/android/apps/youtube/music/command/OfflineVideoCommandResolver", "resolve", 60, "OfflineVideoCommandResolver.java")).w("Object is not an offlineable video: %s", objS);
        }
        int iBe = a.be(aohdVar.f);
        if (iBe == 0) {
            iBe = 1;
        }
        int i = iBe - 1;
        if (i == 1) {
            if (aoiaVarY != null) {
                hmt hmtVar = (hmt) this.b.io();
                str = aohdVar.d == 1 ? (String) aohdVar.e : "";
                xgn xgnVarHB = this.c.hB();
                aodn aodnVar = aohdVar.h;
                if (aodnVar == null) {
                    aodnVar = aodn.a;
                }
                hmtVar.e(str, aoiaVarY, xgnVarHB, aodnVar);
                return;
            }
            return;
        }
        if (i == 2) {
            hmt hmtVar2 = (hmt) this.b.io();
            str = aohdVar.d == 1 ? (String) aohdVar.e : "";
            typ.f(str);
            taf.k(hmtVar2.b, hmtVar2.d.a(kro.aq()), new gnx(16), new hcq(hmtVar2, str, 6));
            return;
        }
        agrc agrcVar = (agrc) ((agrc) a.c().i(agso.a, "OfflineVideoCmd")).k("com/google/android/apps/youtube/music/command/OfflineVideoCommandResolver", "resolve", 74, "OfflineVideoCommandResolver.java");
        int iBe2 = a.be(aohdVar.f);
        if (iBe2 != 0) {
            switch (iBe2) {
                case 1:
                    str2 = "ACTION_UNKNOWN";
                    break;
                case 2:
                    str2 = "ACTION_ADD";
                    break;
                case 3:
                    str2 = "ACTION_REMOVE";
                    break;
                case 4:
                    str2 = "ACTION_PAUSE";
                    break;
                case 5:
                    str2 = "ACTION_RETRY";
                    break;
                case 6:
                    str2 = "ACTION_RESUME";
                    break;
                case 7:
                    str2 = "ACTION_DOWNLOAD_IMMEDIATELY";
                    break;
                case 8:
                    str2 = "ACTION_REDOWNLOAD";
                    break;
                case 9:
                    str2 = "ACTION_RENEW";
                    break;
                case 10:
                    str2 = "ACTION_REMOVE_WITH_PROMPT";
                    break;
                case 11:
                    str2 = "ACTION_RENEW_WITH_PROMPT";
                    break;
                default:
                    str2 = "ACTION_INFER_AUTOMATICALLY";
                    break;
            }
        } else {
            str2 = "ACTION_UNKNOWN";
        }
        agrcVar.w("Unsupported Offline Video Action: %s", str2);
    }
}
