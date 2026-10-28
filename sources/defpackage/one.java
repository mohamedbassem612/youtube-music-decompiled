package defpackage;

import android.app.ActivityManager;
import android.util.Log;
import app.rive.semantics.SemanticState;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class one implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ one(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        rmh rmhVar;
        switch (this.$cid) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (omy omyVar : (List) obj) {
                    aihf aihfVarCreateBuilder = ahak.a.createBuilder();
                    ahap ahapVar = omyVar.a;
                    aihfVarCreateBuilder.copyOnWrite();
                    ahak ahakVar = (ahak) aihfVarCreateBuilder.instance;
                    ahakVar.h = ahapVar;
                    ahakVar.b |= Integer.MIN_VALUE;
                    ahai ahaiVar = omyVar.b;
                    aihfVarCreateBuilder.copyOnWrite();
                    ahak ahakVar2 = (ahak) aihfVarCreateBuilder.instance;
                    ahakVar2.e = ahaiVar;
                    ahakVar2.b |= SemanticState.Hidden;
                    arrayList.add((ahak) aihfVarCreateBuilder.build());
                }
                return arrayList;
            case 1:
                ahaw ahawVar = (ahaw) obj;
                aihf aihfVarCreateBuilder2 = ahak.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                ahak ahakVar3 = (ahak) aihfVarCreateBuilder2.instance;
                ahawVar.getClass();
                ahakVar3.j = ahawVar;
                ahakVar3.c |= SemanticState.Multiline;
                return Arrays.asList((ahak) aihfVarCreateBuilder2.build());
            case 2:
                ahat ahatVar = (ahat) obj;
                aihf aihfVarCreateBuilder3 = ahak.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                ahak ahakVar4 = (ahak) aihfVarCreateBuilder3.instance;
                ahatVar.getClass();
                ahakVar4.l = ahatVar;
                ahakVar4.c |= 65536;
                return Arrays.asList((ahak) aihfVarCreateBuilder3.build());
            case 3:
                aihf aihfVarCreateBuilder4 = ahat.a.createBuilder();
                long j = 0;
                long j2 = 0;
                for (oit oitVar : (List) obj) {
                    aihf aihfVarCreateBuilder5 = ahas.a.createBuilder();
                    aihf aihfVarCreateBuilder6 = ahai.a.createBuilder();
                    oiw oiwVar = oitVar.c;
                    if (oiwVar == null) {
                        oiwVar = oiw.a;
                    }
                    String str = oiwVar.d;
                    aihfVarCreateBuilder6.copyOnWrite();
                    ahai ahaiVar2 = (ahai) aihfVarCreateBuilder6.instance;
                    str.getClass();
                    ahaiVar2.b |= 4;
                    ahaiVar2.e = str;
                    oiw oiwVar2 = oitVar.c;
                    if (oiwVar2 == null) {
                        oiwVar2 = oiw.a;
                    }
                    String str2 = oiwVar2.c;
                    aihfVarCreateBuilder6.copyOnWrite();
                    ahai ahaiVar3 = (ahai) aihfVarCreateBuilder6.instance;
                    str2.getClass();
                    ahaiVar3.b |= 1;
                    ahaiVar3.c = str2;
                    int i = oitVar.f;
                    aihfVarCreateBuilder6.copyOnWrite();
                    ahai ahaiVar4 = (ahai) aihfVarCreateBuilder6.instance;
                    ahaiVar4.b |= 2;
                    ahaiVar4.d = i;
                    long j3 = oitVar.d;
                    aihfVarCreateBuilder6.copyOnWrite();
                    ahai ahaiVar5 = (ahai) aihfVarCreateBuilder6.instance;
                    ahaiVar5.b |= 64;
                    ahaiVar5.i = j3;
                    String str3 = oitVar.e;
                    aihfVarCreateBuilder6.copyOnWrite();
                    ahai ahaiVar6 = (ahai) aihfVarCreateBuilder6.instance;
                    str3.getClass();
                    ahaiVar6.b |= SemanticState.Focused;
                    ahaiVar6.j = str3;
                    ahai ahaiVar7 = (ahai) aihfVarCreateBuilder6.build();
                    aihfVarCreateBuilder5.copyOnWrite();
                    ahas ahasVar = (ahas) aihfVarCreateBuilder5.instance;
                    ahaiVar7.getClass();
                    ahasVar.c = ahaiVar7;
                    ahasVar.b |= 1;
                    long j4 = oitVar.h;
                    aihfVarCreateBuilder5.copyOnWrite();
                    ahas ahasVar2 = (ahas) aihfVarCreateBuilder5.instance;
                    ahasVar2.b |= 2;
                    ahasVar2.d = j4;
                    long j5 = oitVar.g;
                    aihfVarCreateBuilder5.copyOnWrite();
                    ahas ahasVar3 = (ahas) aihfVarCreateBuilder5.instance;
                    ahasVar3.b |= 4;
                    ahasVar3.e = j5;
                    aihfVarCreateBuilder4.copyOnWrite();
                    ahat ahatVar2 = (ahat) aihfVarCreateBuilder4.instance;
                    ahas ahasVar4 = (ahas) aihfVarCreateBuilder5.build();
                    ahasVar4.getClass();
                    aiie aiieVar = ahatVar2.c;
                    if (!aiieVar.c()) {
                        ahatVar2.c = aihn.mutableCopy(aiieVar);
                    }
                    ahatVar2.c.add(ahasVar4);
                    j += oitVar.h;
                    j2 += oitVar.g;
                }
                aihfVarCreateBuilder4.copyOnWrite();
                ahat ahatVar3 = (ahat) aihfVarCreateBuilder4.instance;
                ahatVar3.b |= 1;
                ahatVar3.d = j;
                aihfVarCreateBuilder4.copyOnWrite();
                ahat ahatVar4 = (ahat) aihfVarCreateBuilder4.instance;
                ahatVar4.b |= 2;
                ahatVar4.e = j2;
                return (ahat) aihfVarCreateBuilder4.build();
            case 4:
                int i2 = oni.e;
                return oiy.a;
            case 5:
                return agev.h(((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
            case 6:
                return agke.n((List) obj);
            case 7:
                return ((qci) obj).a;
            case 8:
                ((agrc) ((agrc) ((agrc) qcq.a.c()).j((RuntimeException) obj)).k("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "record", 406, "MemoryMetricServiceImpl.java")).t("Metric extension provider failed.");
                return null;
            case 9:
                return Integer.valueOf(Integer.parseInt((String) obj));
            case 10:
                return aedi.t((String) obj);
            case 11:
                return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
            case 12:
                return Boolean.FALSE;
            case 13:
                return null;
            case 14:
                return null;
            case 15:
                return qnc.a((qkr) obj);
            case 16:
                qkt qktVar = (qkt) obj;
                if (qktVar.a != 29514) {
                    throw qktVar;
                }
                aihf aihfVarCreateBuilder7 = qli.a.createBuilder();
                aihf aihfVarCreateBuilder8 = qlf.b.createBuilder();
                long jCurrentTimeMillis = System.currentTimeMillis();
                aihfVarCreateBuilder8.copyOnWrite();
                qlf qlfVar = (qlf) aihfVarCreateBuilder8.instance;
                qlfVar.c |= 8;
                qlfVar.g = jCurrentTimeMillis;
                aihfVarCreateBuilder7.copyOnWrite();
                qli qliVar = (qli) aihfVarCreateBuilder7.instance;
                qlf qlfVar2 = (qlf) aihfVarCreateBuilder8.build();
                qlfVar2.getClass();
                qliVar.c = qlfVar2;
                qliVar.b |= 1;
                return (qli) aihfVarCreateBuilder7.build();
            case 17:
                rmhVar = new rmh((affd) obj, null);
                break;
            case 18:
                rmhVar = new rmh(null, (Throwable) obj);
                break;
            case 19:
                return Optional.of((affd) obj);
            default:
                return Optional.empty();
        }
        return rmhVar;
    }
}
