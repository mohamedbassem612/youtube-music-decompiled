package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sad implements sae {
    private static final agkj a = agpn.b;
    private static final agkz b = agkz.u("CLICK_MS", "CONN", "LACT", "WT", "AD_TOS", "AD_WAT", "FINAL");
    private final Map c;
    private final vyo d;
    private final abmt e;
    private final ruq f;

    public sad(ruq ruqVar, Map map, vyo vyoVar, abmt abmtVar) {
        this.f = ruqVar;
        this.c = map;
        this.d = vyoVar;
        this.e = abmtVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ab A[PHI: r13
      0x00ab: PHI (r13v3 shh) = (r13v2 shh), (r13v1 shh) binds: [B:30:0x00a9, B:27:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.sae
    public final skj a(smr smrVar, sko skoVar, shh shhVar, aivk aivkVar, aixr aixrVar) throws sat {
        shh shhVarC;
        String strA;
        try {
            Uri uriC = tyu.c(aivkVar.c);
            Set<String> setB = zzj.b(Arrays.asList(uriC), a);
            HashMap map = new HashMap();
            for (String str : setB) {
                ryy ryyVar = (ryy) this.c.get(str);
                if (ryyVar != null) {
                    ryx ryxVar = (ryx) ryyVar.getClass().getAnnotation(ryx.class);
                    if (ryxVar == null) {
                        shhVarC = shh.a;
                    } else {
                        Class clsA = ryxVar.a();
                        if (shhVar.e(clsA)) {
                            shhVarC = shhVar;
                        } else {
                            shh shhVar2 = skoVar.o;
                            if (!shhVar2.e(clsA)) {
                                shhVar2 = smrVar.g;
                                if (shhVar2.e(clsA)) {
                                    shhVarC = shhVar2;
                                } else {
                                    shhVarC = null;
                                }
                            } else if ((smrVar.e(sid.class) && ((wjf) smrVar.d(sid.class)).T()) || this.e.ao()) {
                                shhVarC = shh.c(smrVar.g, shhVar2);
                            } else {
                                shhVarC = shhVar2;
                            }
                        }
                    }
                    if (shhVarC != null) {
                        strA = ryyVar.b(shhVarC);
                        if (strA == null) {
                            throw new sat("PingFulfillment MacroAdapter returns null value for ".concat(String.valueOf(str)), 64);
                        }
                    } else {
                        strA = ryyVar.a();
                    }
                    map.put(str, strA);
                } else if (!b.contains(str) && taq.aI(this.d)) {
                    rmp.n(smrVar, "Ping migration null MacroAdapter for macro ".concat(String.valueOf(str)));
                }
            }
            try {
                try {
                    Uri uriA = ((zzj) this.f.a.io()).a(uriC, new ruo(map));
                    if (uriA == null) {
                        throw new sat("PingFulfillment returns a null URI", 82);
                    }
                    wjk wjkVar = new wjk(aivkVar.e, 1);
                    boolean z = aivkVar.f;
                    shh shhVar3 = skoVar.o;
                    long jLongValue = shhVar3.e(sik.class) ? ((Long) shhVar3.d(sik.class)).longValue() : Long.MAX_VALUE;
                    agke agkeVarN = agke.n(map.keySet());
                    int iAX = a.aX(aivkVar.h);
                    return new skj(uriA, wjkVar, z, jLongValue, agkeVarN, iAX == 0 ? 1 : iAX, smrVar, skoVar, aixrVar);
                } catch (tzn e) {
                    throw new rso(e.toString(), e);
                }
            } catch (rso e2) {
                throw new sat("PingFulfillment ExternalApiException when applying macros map", e2, 4, e2.a);
            }
        } catch (MalformedURLException e3) {
            throw new sat("PingFulfillment gets a malformed URL", e3, 3, 81);
        }
    }
}
