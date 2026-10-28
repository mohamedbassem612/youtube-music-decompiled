package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmp {
    public static final /* synthetic */ int a = 0;
    private static final ahtv b;
    private static final ahtv c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        agvp.B(ahjf.SHA2, ahlp.a, map, map2);
        agvp.B(ahjf.SHAKE, ahlp.b, map, map2);
        b = agvp.C(map, map2);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        agvp.B(ahjj.FAST_SIGNING, ahlq.a, map3, map4);
        agvp.B(ahjj.SMALL_SIGNATURE, ahlq.b, map3, map4);
        c = agvp.C(map3, map4);
    }

    public static ahga a(ahlr ahlrVar) throws GeneralSecurityException {
        if (ahlrVar.equals(ahlr.b)) {
            return ahga.d;
        }
        if (ahlrVar.equals(ahlr.a)) {
            return ahga.b;
        }
        throw new GeneralSecurityException("unknown variant: ".concat(ahlrVar.c));
    }

    public static ahji b(ahlu ahluVar) {
        aihf aihfVarCreateBuilder = ahji.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((ahji) aihfVarCreateBuilder.instance).c = 0;
        aihf aihfVarCreateBuilder2 = ahjg.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahjg) aihfVarCreateBuilder2.instance).b = 64;
        ahtv ahtvVar = b;
        ahls ahlsVar = ahluVar.a;
        ahjf ahjfVar = (ahjf) ahtvVar.c(ahlsVar.a);
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahjg) aihfVarCreateBuilder2.instance).c = ahjfVar.getNumber();
        ahjj ahjjVar = (ahjj) c.c(ahlsVar.b);
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahjg) aihfVarCreateBuilder2.instance).d = ahjjVar.getNumber();
        ahjg ahjgVar = (ahjg) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        ahji ahjiVar = (ahji) aihfVarCreateBuilder.instance;
        ahjgVar.getClass();
        ahjiVar.e = ahjgVar;
        ahjiVar.b |= 1;
        aigj aigjVarV = aigj.v(ahluVar.b.c());
        aihfVarCreateBuilder.copyOnWrite();
        ahji ahjiVar2 = (ahji) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        ahjiVar2.d = aigjVarV;
        return (ahji) aihfVarCreateBuilder.build();
    }

    public static ahlu c(ahgb ahgbVar, ahji ahjiVar) {
        ahlr ahlrVar;
        ahjf ahjfVar;
        ahjj ahjjVar;
        ahnf ahnfVarB;
        if (ahjiVar.c != 0) {
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        }
        ahjg ahjgVar = ahjiVar.e;
        if (ahjgVar == null) {
            ahjgVar = ahjg.a;
        }
        Object obj = ahgbVar.d;
        if (obj == ahga.d) {
            ahlrVar = ahlr.b;
        } else {
            if (obj != ahga.b) {
                throw new GeneralSecurityException("unknown variant: ".concat(((ahga) obj).g));
            }
            ahlrVar = ahlr.a;
        }
        if (ahjgVar.b == 64) {
            int i = ahjgVar.c;
            if (i == 0) {
                ahjfVar = ahjf.SLH_DSA_HASH_TYPE_UNSPECIFIED;
            } else if (i != 1) {
                ahjfVar = i != 2 ? null : ahjf.SHAKE;
            } else {
                ahjfVar = ahjf.SHA2;
            }
            if (ahjfVar == null) {
                ahjfVar = ahjf.UNRECOGNIZED;
            }
            if (ahjfVar == ahjf.SHA2) {
                int i2 = ahjgVar.d;
                if (i2 == 0) {
                    ahjjVar = ahjj.SLH_DSA_SIGNATURE_TYPE_UNSPECIFIED;
                } else if (i2 != 1) {
                    ahjjVar = i2 != 2 ? null : ahjj.SMALL_SIGNATURE;
                } else {
                    ahjjVar = ahjj.FAST_SIGNING;
                }
                if (ahjjVar == null) {
                    ahjjVar = ahjj.UNRECOGNIZED;
                }
                if (ahjjVar == ahjj.SMALL_SIGNATURE) {
                    ahlp ahlpVar = ahlp.a;
                    ahlq ahlqVar = ahlq.b;
                    ahls ahlsVar = new ahls(ahlpVar, ahlqVar, ahlrVar);
                    ahnf ahnfVarB2 = ahnf.b(ahjiVar.d.G());
                    Object obj2 = ahgbVar.e;
                    Object obj3 = obj2 != null ? obj2 : null;
                    ahlr ahlrVar2 = ahlsVar.c;
                    ahlr ahlrVar3 = ahlr.b;
                    if (ahlrVar2 == ahlrVar3 && obj3 != null) {
                        throw new GeneralSecurityException("IdRequirement must be null for variant NO_PREFIX");
                    }
                    ahlr ahlrVar4 = ahlr.a;
                    if (ahlrVar2 == ahlrVar4 && obj3 == null) {
                        throw new GeneralSecurityException("Id requirement missing for parameters' variant TINK");
                    }
                    ahlp ahlpVar2 = ahlsVar.a;
                    if (ahlpVar2 != ahlpVar) {
                        throw new GeneralSecurityException("Unknown SLH-DSA hash type option " + ahlpVar2.c + "; only SHA2 is currently supported");
                    }
                    ahlq ahlqVar2 = ahlsVar.b;
                    if (ahlqVar2 != ahlqVar) {
                        throw new GeneralSecurityException("Unknown SLH-DSA signature type " + ahlqVar2.c + "; only \"S\" (SMALL_SIGNATURE) is currently supported");
                    }
                    if (ahnfVarB2.a() != 32) {
                        throw new GeneralSecurityException("Incorrect public key size for SLH-DSA-SHA2-128S: should be 32, but was " + ahnfVarB2.a());
                    }
                    if (ahlrVar2 == ahlrVar3) {
                        ahnfVarB = ahhk.a;
                    } else {
                        if (ahlrVar2 != ahlrVar4) {
                            throw new IllegalStateException("Unknown SlhDsaParameters.Variant: ".concat(ahlrVar2.c));
                        }
                        ahnfVarB = ahhk.b(((Integer) obj3).intValue());
                    }
                    return new ahlu(ahlsVar, ahnfVarB2, ahnfVarB, (Integer) obj3);
                }
            }
        }
        throw new GeneralSecurityException("Unsupported SLH-DSA parameters");
    }
}
