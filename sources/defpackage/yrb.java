package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yrb implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ yrb(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wer] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r6v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r6v47, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v49, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v59, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v61, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v63, types: [awqg, java.lang.Object] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        ListenableFuture listenableFutureM;
        ?? arrayList;
        switch (this.$cid) {
            case 0:
                ?? r6 = this.a;
                int i = yrd.c;
                return a.m(r6, obj);
            case 1:
                try {
                    listenableFutureM = ahng.n(((yqo) this.a).r.f((alup) obj));
                    break;
                } catch (IOException e) {
                    listenableFutureM = ahng.m(e);
                }
                return tzk.c(listenableFutureM).k();
            case 2:
                agqr it = ((agkz) obj).iterator();
                while (true) {
                    ?? r0 = this.a;
                    if (!it.hasNext()) {
                        return r0.d();
                    }
                    r0.a((String) it.next());
                }
                break;
            case 3:
                return ((aahg) this.a).k((aoop) obj);
            case 4:
                amtc amtcVar = (amtc) obj;
                return amtcVar.getRemoteImageUrl().equals(this.a) ? avlm.q(amtcVar) : avlm.l();
            case 5:
                return avlb.n(new hmg(this.a, (byte[]) obj, 13));
            case 6:
                return this.a.g((String) obj).g(aret.class);
            case 7:
                return Collections.nCopies(this.a.size(), Optional.empty());
            case 8:
                agke agkeVar = (agke) obj;
                wer werVarE = this.a.e();
                int size = agkeVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    werVarE.a((String) agkeVar.get(i2));
                }
                return werVarE.d();
            case 9:
                wep wepVar = (wep) obj;
                return aarl.a(this.a, (aqph) wepVar.a, wepVar.b);
            case 10:
                agke<wep> agkeVarG = ((agkz) obj).g();
                arrayList = new ArrayList(agkeVarG.size());
                for (wep wepVar2 : agkeVarG) {
                    ?? r1 = this.a;
                    arrayList.add(aarl.a(r1, (aqph) wepVar2.a, wepVar2.b));
                }
                break;
            case 11:
                aazq aazqVar = (aazq) obj;
                if (aazq.a.equals(aazqVar)) {
                    return asfy.a;
                }
                Object obj2 = this.a;
                agan aganVar = (agan) ((abab) obj2).c.b(new afzb(3), new aazx(obj2, aazqVar, 4));
                aihf aihfVarCreateBuilder = asfy.a.createBuilder();
                aihf aihfVarCreateBuilder2 = asgt.a.createBuilder();
                String strH = aganVar.h();
                aihfVarCreateBuilder2.copyOnWrite();
                asgt asgtVar = (asgt) aihfVarCreateBuilder2.instance;
                strH.getClass();
                asgtVar.b |= 4;
                asgtVar.d = strH;
                String strG = aganVar.g();
                aihfVarCreateBuilder2.copyOnWrite();
                asgt asgtVar2 = (asgt) aihfVarCreateBuilder2.instance;
                strG.getClass();
                asgtVar2.b |= 2;
                asgtVar2.c = strG;
                asgt asgtVar3 = (asgt) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder.copyOnWrite();
                asfy asfyVar = (asfy) aihfVarCreateBuilder.instance;
                asgtVar3.getClass();
                asfyVar.c = asgtVar3;
                asfyVar.b |= 2;
                return (asfy) aihfVarCreateBuilder.build();
            case 12:
                obj.getClass();
                return this.a.invoke(obj);
            case 13:
                return a.z(this.a, obj);
            case 14:
                arrayList = new Object[]{this.a, (zhz) obj};
                break;
            case 15:
                return (agke) Collection.EL.stream(this.a).filter(new aajl((agkz) obj, 16)).collect(aghu.a);
            case 16:
                Duration duration = abin.a;
                obj.getClass();
                return this.a.invoke(obj);
            case 17:
                ?? r7 = this.a;
                Duration duration2 = abin.a;
                return a.z(r7, obj);
            case 18:
                Duration duration3 = abin.a;
                obj.getClass();
                return this.a.invoke(obj);
            case 19:
                abnk abnkVarF = ((abnl) this.a).f();
                abnkVarF.r = ((wjf) obj).G();
                return abnkVarF.a();
            default:
                return this.a;
        }
        return arrayList;
    }
}
