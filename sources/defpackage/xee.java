package defpackage;

import android.util.Pair;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xee implements avnn {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xee(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avnn
    public final Object a(Object obj) {
        aobh aobhVar;
        switch (this.$cid) {
            case 0:
                amuh amuhVar = ((alik) obj).n;
                if (amuhVar == null) {
                    amuhVar = amuh.a;
                }
                akvx akvxVar = amuhVar.h;
                return akvxVar == null ? akvx.a : akvxVar;
            case 1:
                int i = xdy.j;
                amuh amuhVar2 = ((alik) obj).n;
                if (amuhVar2 == null) {
                    amuhVar2 = amuh.a;
                }
                ajtl ajtlVar = amuhVar2.g;
                return ajtlVar == null ? ajtl.a : ajtlVar;
            case 2:
                amuh amuhVar3 = ((alik) obj).n;
                return amuhVar3 == null ? amuh.a : amuhVar3;
            case 3:
                amuh amuhVar4 = ((alik) obj).n;
                return amuhVar4 == null ? amuh.a : amuhVar4;
            case 4:
                amuh amuhVar5 = ((alik) obj).n;
                if (amuhVar5 == null) {
                    amuhVar5 = amuh.a;
                }
                akja akjaVar = amuhVar5.e;
                return akjaVar == null ? akja.a : akjaVar;
            case 5:
                amzd amzdVar = ((alik) obj).m;
                if (amzdVar == null) {
                    amzdVar = amzd.a;
                }
                return Boolean.valueOf(amzdVar.c);
            case 6:
                amzd amzdVar2 = ((alik) obj).m;
                if (amzdVar2 == null) {
                    amzdVar2 = amzd.a;
                }
                return Boolean.valueOf(amzdVar2.d);
            case 7:
                amuh amuhVar6 = ((alik) obj).n;
                return amuhVar6 == null ? amuh.a : amuhVar6;
            case 8:
                tfl tflVar = (tfl) obj;
                ajuf ajufVarA = ajuf.a(tflVar.e);
                int i2 = tflVar.f;
                if (ajufVarA == null) {
                    ajufVarA = ajuf.CONN_UNKNOWN;
                }
                if (tflVar.a) {
                    switch (ajufVarA.ordinal()) {
                        case 3:
                        case 6:
                        case 9:
                        case 11:
                        case 12:
                        case 13:
                            aobhVar = aobh.NETWORK_QUALITY_BUCKET_FAST;
                            break;
                        case 4:
                        case 5:
                            aobhVar = aobh.NETWORK_QUALITY_BUCKET_SLOW;
                            break;
                        case 7:
                        case 8:
                        case 10:
                        default:
                            aobhVar = aobh.NETWORK_QUALITY_BUCKET_UNKNOWN;
                            break;
                    }
                } else {
                    aobhVar = aobh.NETWORK_QUALITY_BUCKET_OFFLINE;
                }
                aihf aihfVarCreateBuilder = aobm.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                aobm aobmVar = (aobm) aihfVarCreateBuilder.instance;
                aobmVar.c = aobhVar.getNumber();
                aobmVar.b |= 1;
                return (aobm) aihfVarCreateBuilder.build();
            case 9:
                return a.J((weo) obj);
            case 10:
                weo weoVar = (weo) obj;
                wfn wfnVarC = wfs.c(weoVar.a);
                String str = wfnVarC.a;
                aaha aahaVarE = aahb.e();
                aahaVarE.b(str);
                aahaVarE.c(wfnVarC.b);
                aahaVarE.a = (!aagu.c((aohq) weoVar.c) || aagu.c((aohq) weoVar.b)) ? aahc.a(weoVar) : aahc.e;
                aahaVarE.b = weoVar;
                return aahaVarE.a();
            case 11:
                weo weoVar2 = (weo) obj;
                wfn wfnVarC2 = wfs.c(weoVar2.a);
                String str2 = wfnVarC2.a;
                aaha aahaVarE2 = aahb.e();
                aahaVarE2.b(str2);
                aahaVarE2.c(wfnVarC2.b);
                aahaVarE2.a = (!aagu.d((aqph) weoVar2.c) || aagu.d((aqph) weoVar2.b)) ? aahc.a(weoVar2) : aahc.e;
                aahaVarE2.b = weoVar2;
                return aahaVarE2.a();
            case 12:
                return ((aazq) obj).b.ar();
            case 13:
                return ((aazq) obj).b.ah();
            case 14:
                return (aboe) ((Pair) obj).second;
            case 15:
                acip acipVar = ((aazq) obj).b;
                return acipVar.J().H(new yrb(acipVar, 14));
            case 16:
                return ((aazq) obj).b.br();
            case 17:
                return ((acil) obj).b.p();
            case 18:
                return Optional.ofNullable(((aayw) obj).c);
            case 19:
                return (wjf) ((Optional) obj).get();
            default:
                return Optional.ofNullable(((aayw) obj).d);
        }
    }
}
