package defpackage;

import android.content.Context;
import android.util.Pair;
import j$.util.Collection;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zaz implements agfr {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ zaz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r5v56, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r5v78, types: [java.lang.Object, tqj] */
    @Override // defpackage.agfr
    public final Object io() {
        Object zjfVar;
        switch (this.$cid) {
            case 0:
                return ((zba) this.a).a;
            case 1:
                wgs wgsVar = ((zcf) this.a).q;
                return Integer.valueOf(wgsVar == null ? 0 : wgsVar.g);
            case 2:
                return ((zba) this.a).b;
            case 3:
                akxc akxcVar = ((wiu) this.a.io()).E().e;
                return akxcVar == null ? akxc.a : akxcVar;
            case 4:
                return this.a;
            case 5:
                return ((zdg) this.a).a;
            case 6:
                return ((zcf) this.a).y;
            case 7:
                return ((zfj) this.a).d();
            case 8:
                akxc akxcVar2 = ((zhl) this.a).aa().i;
                return akxcVar2 == null ? akxc.a : akxcVar2;
            case 9:
                wiu wiuVarB = ((wis) this.a).io();
                zjfVar = new zjf(wiuVarB.c(), wiuVarB.ah());
                break;
            case 10:
                Pair pairP = twm.p((Context) this.a);
                zjfVar = new zkj(((Integer) pairP.first).intValue(), ((Integer) pairP.second).intValue(), true);
                break;
            case 11:
                Pair pairP2 = twm.p((Context) this.a);
                zjfVar = new zkj(Math.min(((Integer) pairP2.first).intValue(), ((Integer) pairP2.second).intValue()), Math.max(((Integer) pairP2.first).intValue(), ((Integer) pairP2.second).intValue()), true);
                break;
            case 12:
                ?? r5 = this.a;
                aqrv aqrvVarM = r5.m();
                aqmv aqmvVarA = aqmv.a(aczl.j(r5).e);
                if (aqmvVarA == null) {
                    aqmvVarA = aqmv.TIME_SENSITIVITY_UNKNOWN;
                }
                return aczl.k(aqrvVarM, aqmvVarA, r5.s());
            case 13:
                ?? r6 = this.a;
                try {
                    aihf aihfVarCreateBuilder = atxn.a.createBuilder();
                    String strS = r6.s();
                    aihfVarCreateBuilder.copyOnWrite();
                    atxn atxnVar = (atxn) aihfVarCreateBuilder.instance;
                    strS.getClass();
                    atxnVar.c = strS;
                    agke agkeVar = (agke) Collection.EL.stream(r6.e().entrySet()).map(new yom(20)).collect(aghu.a);
                    aihfVarCreateBuilder.copyOnWrite();
                    atxn atxnVar2 = (atxn) aihfVarCreateBuilder.instance;
                    aiie aiieVar = atxnVar2.d;
                    if (!aiieVar.c()) {
                        atxnVar2.d = aihn.mutableCopy(aiieVar);
                    }
                    aifs.addAll(agkeVar, atxnVar2.d);
                    aigj aigjVarV = aigj.v(r6.ae());
                    aihfVarCreateBuilder.copyOnWrite();
                    atxn atxnVar3 = (atxn) aihfVarCreateBuilder.instance;
                    aigjVarV.getClass();
                    atxnVar3.e = aigjVarV;
                    String strAF = tym.aF(r6.M());
                    aihfVarCreateBuilder.copyOnWrite();
                    ((atxn) aihfVarCreateBuilder.instance).b = strAF;
                    return (atxn) aihfVarCreateBuilder.build();
                } catch (tmg e) {
                    throw new zys(e);
                }
            case 14:
                aihf aihfVarCreateBuilder2 = atxn.a.createBuilder();
                String strS2 = this.a.s();
                aihfVarCreateBuilder2.copyOnWrite();
                atxn atxnVar4 = (atxn) aihfVarCreateBuilder2.instance;
                strS2.getClass();
                atxnVar4.c = strS2;
                return (atxn) aihfVarCreateBuilder2.build();
            case 15:
                ArrayList arrayList = new ArrayList();
                final wcu wcuVar = aagt.d;
                int i = aqpc.TRANSFER_STATE_FAILED.i;
                abxv abxvVar = (abxv) this.a;
                tzk.ag(wcuVar, 2, Long.valueOf(i), abxvVar, arrayList);
                final Long lValueOf = Long.valueOf(aqpc.TRANSFER_STATE_COMPLETE.i);
                abxvVar.p(wcuVar);
                arrayList.add(new wct() { // from class: wcp
                    @Override // defpackage.wct
                    public final void a(omr omrVar) {
                        omrVar.i(" AND ");
                        wcu wcuVar2 = wcuVar;
                        wcuVar2.b(omrVar);
                        tzk.R(omrVar, 2);
                        omrVar.i("?");
                        wcuVar2.c(omrVar, lValueOf);
                    }
                });
                return tzk.ai(abxvVar, arrayList);
            case 16:
                alik alikVarB = ((vyo) this.a).b();
                if (alikVarB != null && (alikVarB.b & 1073741824) != 0) {
                    apdy apdyVar = alikVarB.r;
                    if (apdyVar == null) {
                        apdyVar = apdy.a;
                    }
                    if ((apdyVar.b & 8) != 0) {
                        apdy apdyVar2 = alikVarB.r;
                        if (apdyVar2 == null) {
                            apdyVar2 = apdy.a;
                        }
                        apeq apeqVar = apdyVar2.c;
                        return apeqVar == null ? apeq.a : apeqVar;
                    }
                }
                return apeq.a;
            case 17:
                int i2 = tqr.a;
                return Boolean.valueOf(this.a.k(1073828825));
            case 18:
                return this.a;
            case 19:
                return ((aczb) this.a).e();
            default:
                return this.a;
        }
        return zjfVar;
    }
}
