package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acme {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/reel/internal/common/ReelVideoWithProductPreviewController");
    public final Map a = new HashMap();
    public boolean b = false;
    private final wbz d;
    private final zwb e;
    private final acxn f;

    public acme(wbz wbzVar, zwb zwbVar, vwt vwtVar, vxz vxzVar, acxn acxnVar) {
        this.d = wbzVar;
        this.e = zwbVar;
        this.f = acxnVar;
        if (vxzVar != null) {
            vwtVar.D(new aalq(this, vxzVar, 3, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    public final void a(String str, Optional optional) {
        Optional optionalEmpty;
        if (!this.b || str.isEmpty()) {
            return;
        }
        if (!optional.isPresent() || (((apey) optional.get()).b & 1073741824) == 0) {
            optionalEmpty = Optional.empty();
        } else {
            apey apeyVar = (apey) optional.get();
            akrn akrnVar = null;
            if ((apeyVar.b & 1073741824) != 0) {
                apji apjiVar = apeyVar.l;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
                apjiVar.c(aihlVarCheckIsLite);
                if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                    apji apjiVar2 = apeyVar.l;
                    if (apjiVar2 == null) {
                        apjiVar2 = apji.a;
                    }
                    aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                    apjiVar2.c(aihlVarCheckIsLite2);
                    Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                    akrnVar = (akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                }
            }
            aguu.ak(akrnVar);
            byte[] bArr = this.f.a(akrnVar).c;
            aguu.ak(bArr);
            try {
                asow asowVar = ((asmv) aihn.parseFrom(asmv.a, bArr, ExtensionRegistryLite.getGeneratedRegistry())).c;
                if (asowVar == null) {
                    asowVar = asow.a;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(asma.b);
                asowVar.c(aihlVarCheckIsLite3);
                Object objK2 = asowVar.j.k(aihlVarCheckIsLite3.d);
                asnx asnxVar = ((asma) (objK2 == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK2))).e;
                if (asnxVar == null) {
                    asnxVar = asnx.a;
                }
                aihl aihlVar = asqh.b;
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(aihlVar);
                asnxVar.c(aihlVarCheckIsLite4);
                if (asnxVar.j.n(aihlVarCheckIsLite4.d)) {
                    aihl aihlVarCheckIsLite5 = aihn.checkIsLite(aihlVar);
                    asnxVar.c(aihlVarCheckIsLite5);
                    Object objK3 = asnxVar.j.k(aihlVarCheckIsLite5.d);
                    optionalEmpty = Optional.of((asqh) (objK3 == null ? aihlVarCheckIsLite5.b : aihlVarCheckIsLite5.c(objK3)));
                } else {
                    optionalEmpty = Optional.empty();
                }
            } catch (aiik e) {
                ((agrc) ((agrc) ((agrc) c.b()).j(e)).k("com/google/android/libraries/youtube/reel/internal/common/ReelVideoWithProductPreviewController", "getProductsInVideoWithPreviewModel", (char) 253, "ReelVideoWithProductPreviewController.java")).t("Error parsing Element ProtoBytes. \n");
            }
        }
        if (optionalEmpty.isPresent()) {
            Object obj = optionalEmpty.get();
            Map map = this.a;
            avgb avgbVar = (avgb) map.get(str);
            if (avgbVar == null) {
                asqf asqfVar = ((asqh) obj).c;
                if (asqfVar == null) {
                    asqfVar = asqf.a;
                }
                aspw aspwVar = asqfVar.b;
                if (aspwVar == null) {
                    aspwVar = aspw.a;
                }
                String str2 = aspwVar.b;
                if (!str2.isEmpty()) {
                    avgbVar = new avgb();
                    avgbVar.c = str2;
                    map.put(str, avgbVar);
                }
            } else {
                avgbVar.a = 0;
            }
            if (avgbVar == null || !this.b) {
                return;
            }
            String strG = wfs.g(168, "products_in_video".concat(str));
            strG.getClass();
            ahno.P(!strG.isEmpty(), "key cannot be empty");
            aihf aihfVarCreateBuilder = aozm.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            aozm aozmVar = (aozm) aihfVarCreateBuilder.instance;
            aozmVar.b |= 1;
            aozmVar.c = strG;
            aozj aozjVar = new aozj(aihfVarCreateBuilder);
            Integer num = 0;
            aihf aihfVar = aozjVar.a;
            num.getClass();
            aihfVar.copyOnWrite();
            aozm aozmVar2 = (aozm) aihfVar.instance;
            aozmVar2.b |= 2;
            aozmVar2.d = 0;
            wer werVarE = this.d.b(this.e.e()).e();
            werVarE.m(aozjVar);
            werVarE.b();
        }
    }

    public final void b(Map map) {
        if (this.b) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                avgb avgbVar = (avgb) entry.getValue();
                Map map2 = this.a;
                avgb avgbVar2 = (avgb) map2.get(str);
                if (avgbVar2 == null) {
                    avgbVar2 = new avgb();
                    map2.put(str, avgbVar2);
                }
                avgbVar2.a = 0;
                int i = avgbVar.b;
                avgbVar2.b = 0;
                avgbVar2.c = avgbVar.c;
            }
        }
    }
}
