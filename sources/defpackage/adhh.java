package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Map;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adhh implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ adhh(adcw adcwVar, String str, String str2, int i) {
        this.$cid = i;
        this.c = adcwVar;
        this.b = str;
        this.a = str2;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, wek] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        alap alapVar;
        if (this.$cid == 0) {
            agfr agfrVar = adhi.a;
            akzz akzzVar = (akzz) ((weh) obj);
            String str = (String) Map.EL.getOrDefault(akzzVar.getNextStepIdOverrideMap(), akzzVar.getCurrentStepId(), ((akzp) this.a).e);
            ArrayList arrayList = new ArrayList(akzzVar.getStepIdStack());
            arrayList.add(str);
            String str2 = ((adhf) this.b).g;
            akzx akzxVarE = akzz.e(str2);
            akzxVarE.an(str);
            akzxVarE.am(arrayList);
            java.util.Map nextStepIdOverrideMap = akzzVar.getNextStepIdOverrideMap();
            if (nextStepIdOverrideMap != null && !nextStepIdOverrideMap.isEmpty()) {
                aihh aihhVar = akzxVarE.a;
                aihhVar.copyOnWrite();
                alab alabVar = (alab) aihhVar.instance;
                alab alabVar2 = alab.a;
                aiip aiipVar = alabVar.f;
                if (!aiipVar.b) {
                    alabVar.f = aiipVar.a();
                }
                alabVar.f.putAll(nextStepIdOverrideMap);
            }
            ?? r5 = this.c;
            akzz akzzVarAo = akzxVarE.ao();
            wer werVarE = r5.e();
            werVarE.k(str2, (akvd) adhi.a.io(), akzzVarAo.c());
            werVarE.b().D();
            return;
        }
        agev agevVar = (agev) obj;
        boolean zG = agevVar.g();
        Object obj2 = this.b;
        Object obj3 = this.c;
        if (zG) {
            try {
                akjq akjqVar = (akjq) aihn.parseFrom(akjq.a, (byte[]) agevVar.c(), ExtensionRegistryLite.getGeneratedRegistry());
                adcw adcwVar = (adcw) obj3;
                String str3 = (String) this.a;
                adcwVar.h(adcwVar.e, str3);
                if (akjqVar != null) {
                    aijp aijpVar = akjqVar.c;
                    if (aijpVar == null) {
                        aijpVar = aijp.a;
                    }
                    if ((akjqVar.b & 4) != 0) {
                        alapVar = akjqVar.d;
                        if (alapVar == null) {
                            alapVar = alap.a;
                        }
                    } else {
                        alapVar = null;
                    }
                    adcwVar.l(str3, (String) obj2, aijpVar, alapVar);
                }
            } catch (aiik unused) {
                adcw adcwVar2 = (adcw) obj3;
                adcwVar2.c.c(aslh.LOG_TYPE_INVALID_FIELD, adcwVar2.d, "Failed to parse DataFreshnessEntity at key %s.", obj2);
            }
        }
    }

    public /* synthetic */ adhh(akzp akzpVar, adhf adhfVar, wek wekVar, int i) {
        this.$cid = i;
        this.a = akzpVar;
        this.b = adhfVar;
        this.c = wekVar;
    }
}
