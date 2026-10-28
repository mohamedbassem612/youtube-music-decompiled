package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahlm {
    static {
        ahiy ahiyVar = ahiy.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        ahhi ahhiVar = ahhi.a;
        ahhiVar.a(ahkn.a);
        ahhiVar.b(ahkn.b);
        ahhiVar.a(ahko.a);
        ahhiVar.b(ahko.b);
        int i = ahka.b;
        if (!afyd.q(i)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        ahhj ahhjVar = ahhj.a;
        ahma.c(ahhjVar);
        ahhh ahhhVar = ahhh.a;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", ahkm.a);
        map.put("ECDSA_P256_IEEE_P1363", ahkm.d);
        ahjs ahjsVar = ahjs.a;
        map.put("ECDSA_P256_RAW", aedi.I(ahjt.a, ahjr.a, ahjsVar, ahju.d));
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", ahkm.f);
        map.put("ECDSA_P384", ahkm.b);
        map.put("ECDSA_P384_IEEE_P1363", ahkm.e);
        ahjs ahjsVar2 = ahjs.c;
        ahjr ahjrVar = ahjr.b;
        ahjt ahjtVar = ahjt.b;
        ahju ahjuVar = ahju.a;
        map.put("ECDSA_P384_SHA512", aedi.I(ahjtVar, ahjrVar, ahjsVar2, ahjuVar));
        map.put("ECDSA_P384_SHA384", aedi.I(ahjtVar, ahjrVar, ahjs.b, ahjuVar));
        map.put("ECDSA_P521", ahkm.c);
        map.put("ECDSA_P521_IEEE_P1363", ahkm.g);
        ahhhVar.a(DesugarCollections.unmodifiableMap(map));
        ahhiVar.b(ahka.c);
        ahhiVar.b(ahka.d);
        ahhf ahhfVar = ahhf.a;
        ahhfVar.a(ahka.a, ahjv.class);
        ahgx ahgxVar = ahgx.a;
        ahgxVar.c(ahka.e, i, true);
        ahgxVar.c(ahka.f, i, false);
        int i2 = ahkv.b;
        if (!afyd.q(i2)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        ahmj.c(ahhjVar);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", ahkm.h);
        BigInteger bigInteger = ahks.a;
        ahkp ahkpVar = new ahkp();
        ahkpVar.b = ahkq.a;
        ahkpVar.b(3072);
        BigInteger bigInteger2 = ahks.a;
        ahkpVar.a = bigInteger2;
        ahkr ahkrVar = ahkr.d;
        ahkpVar.c = ahkrVar;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", ahkpVar.a());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", ahkm.i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", ahkm.j);
        ahkp ahkpVar2 = new ahkp();
        ahkpVar2.b = ahkq.c;
        ahkpVar2.b(SemanticState.Obscured);
        ahkpVar2.a = bigInteger2;
        ahkpVar2.c = ahkrVar;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", ahkpVar2.a());
        ahhhVar.a(map2);
        ahhiVar.b(ahkv.c);
        ahhiVar.b(ahkv.d);
        ahhfVar.a(ahkv.a, ahks.class);
        ahgxVar.c(ahkv.e, i2, true);
        ahgxVar.c(ahkv.f, i2, false);
        int i3 = ahlc.b;
        if (!afyd.q(i3)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        ahmn.c(ahhjVar);
        HashMap map3 = new HashMap();
        BigInteger bigInteger3 = ahkz.a;
        ahkw ahkwVar = new ahkw();
        ahkx ahkxVar = ahkx.a;
        ahkwVar.b = ahkxVar;
        ahkwVar.c = ahkxVar;
        ahkwVar.c(32);
        ahkwVar.b(3072);
        BigInteger bigInteger4 = ahkz.a;
        ahkwVar.a = bigInteger4;
        ahky ahkyVar = ahky.a;
        ahkwVar.d = ahkyVar;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", ahkwVar.a());
        ahkw ahkwVar2 = new ahkw();
        ahkwVar2.b = ahkxVar;
        ahkwVar2.c = ahkxVar;
        ahkwVar2.c(32);
        ahkwVar2.b(3072);
        ahkwVar2.a = bigInteger4;
        ahky ahkyVar2 = ahky.d;
        ahkwVar2.d = ahkyVar2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", ahkwVar2.a());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", ahkm.k);
        ahkw ahkwVar3 = new ahkw();
        ahkx ahkxVar2 = ahkx.c;
        ahkwVar3.b = ahkxVar2;
        ahkwVar3.c = ahkxVar2;
        ahkwVar3.c(64);
        ahkwVar3.b(SemanticState.Obscured);
        ahkwVar3.a = bigInteger4;
        ahkwVar3.d = ahkyVar;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", ahkwVar3.a());
        ahkw ahkwVar4 = new ahkw();
        ahkwVar4.b = ahkxVar2;
        ahkwVar4.c = ahkxVar2;
        ahkwVar4.c(64);
        ahkwVar4.b(SemanticState.Obscured);
        ahkwVar4.a = bigInteger4;
        ahkwVar4.d = ahkyVar2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", ahkwVar4.a());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", ahkm.l);
        ahhhVar.a(DesugarCollections.unmodifiableMap(map3));
        ahhiVar.b(ahlc.c);
        ahhiVar.b(ahlc.d);
        ahhfVar.a(ahlc.a, ahkz.class);
        ahgxVar.c(ahlc.e, i3, true);
        ahgxVar.c(ahlc.f, i3, false);
        if (ahgm.a()) {
            return;
        }
        ahgw ahgwVar = ahke.a;
        if (!afyd.q(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        ahmd.c(ahhjVar);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new ahkc(ahkb.a));
        ahkb ahkbVar = ahkb.d;
        map4.put("ED25519_RAW", new ahkc(ahkbVar));
        map4.put("ED25519WithRawOutput", new ahkc(ahkbVar));
        ahhhVar.a(DesugarCollections.unmodifiableMap(map4));
        ahhfVar.a(ahke.a, ahkc.class);
        ConcurrentMap concurrentMap = ahhg.a.b;
        aedi aediVar = ahke.f;
        aedi aediVar2 = (aedi) concurrentMap.putIfAbsent(ahkc.class, aediVar);
        if (aediVar2 != null && !aediVar2.equals(aediVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        ahhiVar.b(ahke.b);
        ahhiVar.b(ahke.c);
        ahgxVar.b(ahke.d, true);
        ahgxVar.b(ahke.e, false);
    }
}
