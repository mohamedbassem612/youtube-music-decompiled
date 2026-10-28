package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aelk implements vxc {
    public final ttm a;
    private final vxe b;
    private final xgm c;
    private final aend d;

    public aelk(aend aendVar, ttm ttmVar, vxe vxeVar, xgm xgmVar) {
        aendVar.getClass();
        this.d = aendVar;
        ttmVar.getClass();
        this.a = ttmVar;
        vxeVar.getClass();
        this.b = vxeVar;
        xgmVar.getClass();
        this.c = xgmVar;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, zwb] */
    @Override // defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        almv almvVar;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(appo.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        appo appoVar = (appo) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        almw almwVar = appoVar.e;
        if (almwVar == null) {
            almwVar = almw.a;
        }
        if (almwVar.d) {
            almvVar = null;
        } else {
            almv almvVar2 = appoVar.f;
            if (almvVar2 == null) {
                almvVar2 = almv.a;
            }
            if ((almvVar2.b & 2) != 0) {
                almvVar = appoVar.f;
                if (almvVar == null) {
                    almvVar = almv.a;
                }
            } else {
                almvVar = null;
            }
        }
        xgm xgmVar = this.c;
        xgn xgnVarHB = (xgn) tym.U(map, "interaction_logger_override", xgn.class);
        if (xgnVarHB == null) {
            xgnVarHB = xgmVar.hB();
        }
        if (almvVar != null) {
            d(map, almvVar);
            return;
        }
        byte[] bArr = (byte[]) tym.U(map, "click_tracking_params", byte[].class);
        if (bArr != null) {
            xgnVarHB.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(bArr), null);
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(appo.b);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK2 == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK2);
        aend aendVar = this.d;
        appo appoVar2 = (appo) objC;
        almy almyVar = appoVar2.d;
        if (almyVar == null) {
            almyVar = almy.a;
        }
        almw almwVar2 = appoVar2.e;
        if (almwVar2 == null) {
            almwVar2 = almw.a;
        }
        gml gmlVar = new gml(this, map, 10);
        wpf wpfVar = new wpf(aendVar.b, aendVar.c.e());
        wpfVar.a = almyVar;
        wpfVar.b = almwVar2;
        aendVar.f(almv.a, (wlp) aendVar.d, new heo(20), new hep(16)).d(wpfVar, gmlVar);
    }

    public final void d(Map map, almv almvVar) {
        if (almvVar.e.size() != 0) {
            this.b.e(almvVar.e, null);
        }
        if ((almvVar.b & 2) != 0) {
            amdd amddVar = (amdd) tym.U(map, "client_data_override", amdd.class);
            HashMap map2 = new HashMap();
            map2.put(xhd.e, amddVar);
            if (map != null && map.containsKey("com.google.android.libraries.youtube.logging.interaction_logger")) {
                map2.put("com.google.android.libraries.youtube.logging.interaction_logger", map.get("com.google.android.libraries.youtube.logging.interaction_logger"));
            }
            vxe vxeVar = this.b;
            vxe vxeVar2 = (vxe) tym.U(map, "endpoint_resolver_override", vxe.class);
            if (vxeVar2 != null) {
                vxeVar = vxeVar2;
            }
            ajwo ajwoVar = almvVar.d;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            vxeVar.c(ajwoVar, map2);
        }
        aelj aeljVar = (aelj) tym.U(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", aelj.class);
        if (aeljVar != null) {
            aeljVar.f();
        }
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
