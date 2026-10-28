package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmn {
    private static final ahha a;
    private static final ahha d;
    private static final ahtv g;
    private static final ahub e = new ahub(ahkz.class);
    private static final ahub f = new ahub("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
    private static final ahha c = new ahha("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", new ahlz(8));
    private static final ahha b = new ahha(ahla.class, new ahly(10));

    static {
        int i = 9;
        a = new ahha(ahlb.class, new ahly(i));
        d = new ahha("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", new ahlz(i));
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        agvp.B(ahio.SHA256, ahkx.a, map, map2);
        agvp.B(ahio.SHA384, ahkx.b, map, map2);
        agvp.B(ahio.SHA512, ahkx.c, map, map2);
        g = agvp.C(map, map2);
    }

    public static ahgb a(ahla ahlaVar, ahgj ahgjVar) throws GeneralSecurityException {
        ahgj.a(ahgjVar);
        aihf aihfVarCreateBuilder = ahjd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((ahjd) aihfVarCreateBuilder.instance).c = 0;
        ahje ahjeVarG = g(ahlaVar.a);
        aihfVarCreateBuilder.copyOnWrite();
        ahjd ahjdVar = (ahjd) aihfVarCreateBuilder.instance;
        ahjeVarG.getClass();
        ahjdVar.d = ahjeVarG;
        ahjdVar.b |= 1;
        aigj aigjVarL = l(ahlaVar.b);
        aihfVarCreateBuilder.copyOnWrite();
        ahjd ahjdVar2 = (ahjd) aihfVarCreateBuilder.instance;
        aigjVarL.getClass();
        ahjdVar2.e = aigjVarL;
        aigj aigjVarL2 = l(ahlaVar.c);
        aihfVarCreateBuilder.copyOnWrite();
        ahjd ahjdVar3 = (ahjd) aihfVarCreateBuilder.instance;
        aigjVarL2.getClass();
        ahjdVar3.f = aigjVarL2;
        aigj aigjVarL3 = l(ahlaVar.d);
        aihfVarCreateBuilder.copyOnWrite();
        ahjd ahjdVar4 = (ahjd) aihfVarCreateBuilder.instance;
        aigjVarL3.getClass();
        ahjdVar4.g = aigjVarL3;
        aigj aigjVarL4 = l(ahlaVar.e);
        aihfVarCreateBuilder.copyOnWrite();
        ahjd ahjdVar5 = (ahjd) aihfVarCreateBuilder.instance;
        aigjVarL4.getClass();
        ahjdVar5.h = aigjVarL4;
        aigj aigjVarL5 = l(ahlaVar.f);
        aihfVarCreateBuilder.copyOnWrite();
        ahjd ahjdVar6 = (ahjd) aihfVarCreateBuilder.instance;
        aigjVarL5.getClass();
        ahjdVar6.i = aigjVarL5;
        aigj aigjVarL6 = l(ahlaVar.g);
        aihfVarCreateBuilder.copyOnWrite();
        ahjd ahjdVar7 = (ahjd) aihfVarCreateBuilder.instance;
        aigjVarL6.getClass();
        ahjdVar7.j = aigjVarL6;
        return ahgb.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((ahjd) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, f(ahlaVar.b().d), ahlaVar.a());
    }

    public static ahla b(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
        }
        try {
            Object obj = ahgbVar.b;
            ahjd ahjdVar = (ahjd) aihn.parseFrom(ahjd.a, (aigj) obj, ExtensionRegistryLite.a);
            if (ahjdVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ahje ahjeVar = ahjdVar.d;
            if (ahjeVar == null) {
                ahjeVar = ahje.a;
            }
            if (ahjeVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerJ = j(ahjeVar.e);
            int iBitLength = bigIntegerJ.bitLength();
            BigInteger bigIntegerJ2 = j(ahjeVar.f);
            BigInteger bigInteger = ahkz.a;
            ahkw ahkwVar = new ahkw();
            ahtv ahtvVar = g;
            ahjc ahjcVar = ahjeVar.d;
            if (ahjcVar == null) {
                ahjcVar = ahjc.a;
            }
            ahio ahioVarA = ahio.a(ahjcVar.b);
            if (ahioVarA == null) {
                ahioVarA = ahio.UNRECOGNIZED;
            }
            ahkwVar.b = (ahkx) ahtvVar.d(ahioVarA);
            ahjc ahjcVar2 = ahjeVar.d;
            if (ahjcVar2 == null) {
                ahjcVar2 = ahjc.a;
            }
            ahio ahioVarA2 = ahio.a(ahjcVar2.c);
            if (ahioVarA2 == null) {
                ahioVarA2 = ahio.UNRECOGNIZED;
            }
            ahkwVar.c = (ahkx) ahtvVar.d(ahioVarA2);
            ahkwVar.a = bigIntegerJ2;
            ahkwVar.b(iBitLength);
            ahjc ahjcVar3 = ahjeVar.d;
            if (ahjcVar3 == null) {
                ahjcVar3 = ahjc.a;
            }
            ahkwVar.c(ahjcVar3.d);
            ahkwVar.d = h((ahga) ahgbVar.d);
            ahlb ahlbVarE = aedi.E(ahkwVar.a(), bigIntegerJ, (Integer) ahgbVar.e);
            ahgj.a(ahgjVar);
            ahub ahubVarK = k(ahjdVar.f);
            ahub ahubVarK2 = k(ahjdVar.g);
            ahub ahubVarK3 = k(ahjdVar.e);
            ahub ahubVarK4 = k(ahjdVar.h);
            ahub ahubVarK5 = k(ahjdVar.i);
            ahub ahubVarK6 = k(ahjdVar.j);
            BigInteger bigInteger2 = ahlbVarE.a.c;
            BigInteger bigInteger3 = ahlbVarE.b;
            Object obj2 = ahubVarK.a;
            Object obj3 = ahubVarK2.a;
            Object obj4 = ahubVarK3.a;
            Object obj5 = ahubVarK4.a;
            Object obj6 = ahubVarK5.a;
            Object obj7 = ahubVarK6.a;
            if (!((BigInteger) obj2).isProbablePrime(10)) {
                throw new GeneralSecurityException("p is not a prime");
            }
            if (!((BigInteger) obj3).isProbablePrime(10)) {
                throw new GeneralSecurityException("q is not a prime");
            }
            if (!((BigInteger) obj2).multiply((BigInteger) obj3).equals(bigInteger3)) {
                throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
            }
            BigInteger bigIntegerSubtract = ((BigInteger) obj2).subtract(BigInteger.ONE);
            BigInteger bigIntegerSubtract2 = ((BigInteger) obj3).subtract(BigInteger.ONE);
            if (!bigInteger2.multiply((BigInteger) obj4).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(BigInteger.ONE)) {
                throw new GeneralSecurityException("D is invalid.");
            }
            if (!bigInteger2.multiply((BigInteger) obj5).mod(bigIntegerSubtract).equals(BigInteger.ONE)) {
                throw new GeneralSecurityException("dP is invalid.");
            }
            if (!bigInteger2.multiply((BigInteger) obj6).mod(bigIntegerSubtract2).equals(BigInteger.ONE)) {
                throw new GeneralSecurityException("dQ is invalid.");
            }
            if (((BigInteger) obj3).multiply((BigInteger) obj7).mod((BigInteger) obj2).equals(BigInteger.ONE)) {
                return new ahla(ahlbVarE, ahubVarK, ahubVarK2, ahubVarK3, ahubVarK4, ahubVarK5, ahubVarK6);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        } catch (aiik | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    public static void c(ahhj ahhjVar) {
        ahhjVar.e(e);
        ahhjVar.f(f);
        ahhjVar.c(a);
        ahhjVar.d(c);
        ahhjVar.c(b);
        ahhjVar.d(d);
    }

    public static ahlb d(ahgb ahgbVar) throws GeneralSecurityException {
        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
        }
        try {
            Object obj = ahgbVar.b;
            ahje ahjeVar = (ahje) aihn.parseFrom(ahje.a, (aigj) obj, ExtensionRegistryLite.a);
            if (ahjeVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerJ = j(ahjeVar.e);
            int iBitLength = bigIntegerJ.bitLength();
            BigInteger bigInteger = ahkz.a;
            ahkw ahkwVar = new ahkw();
            ahtv ahtvVar = g;
            ahjc ahjcVar = ahjeVar.d;
            if (ahjcVar == null) {
                ahjcVar = ahjc.a;
            }
            ahio ahioVarA = ahio.a(ahjcVar.b);
            if (ahioVarA == null) {
                ahioVarA = ahio.UNRECOGNIZED;
            }
            ahkwVar.b = (ahkx) ahtvVar.d(ahioVarA);
            ahjc ahjcVar2 = ahjeVar.d;
            if (ahjcVar2 == null) {
                ahjcVar2 = ahjc.a;
            }
            ahio ahioVarA2 = ahio.a(ahjcVar2.c);
            if (ahioVarA2 == null) {
                ahioVarA2 = ahio.UNRECOGNIZED;
            }
            ahkwVar.c = (ahkx) ahtvVar.d(ahioVarA2);
            ahkwVar.a = j(ahjeVar.f);
            ahkwVar.b(iBitLength);
            ahjc ahjcVar3 = ahjeVar.d;
            if (ahjcVar3 == null) {
                ahjcVar3 = ahjc.a;
            }
            ahkwVar.c(ahjcVar3.d);
            ahkwVar.d = h((ahga) ahgbVar.d);
            return aedi.E(ahkwVar.a(), bigIntegerJ, (Integer) ahgbVar.e);
        } catch (aiik | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    public static ahgb e(ahlb ahlbVar) {
        return ahgb.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", g(ahlbVar).toByteString(), ahfz.d, f(ahlbVar.a.d), ahlbVar.d);
    }

    private static ahga f(ahky ahkyVar) throws GeneralSecurityException {
        if (ahkyVar.equals(ahky.d)) {
            return ahga.d;
        }
        if (ahkyVar.equals(ahky.a)) {
            return ahga.b;
        }
        if (ahkyVar.equals(ahky.b)) {
            return ahga.e;
        }
        if (ahkyVar.equals(ahky.c)) {
            return ahga.c;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(ahkyVar))));
    }

    private static ahje g(ahlb ahlbVar) {
        aihf aihfVarCreateBuilder = ahje.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ahjc.a.createBuilder();
        ahkz ahkzVar = ahlbVar.a;
        ahtv ahtvVar = g;
        ahio ahioVar = (ahio) ahtvVar.c(ahkzVar.e);
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahjc) aihfVarCreateBuilder2.instance).b = ahioVar.getNumber();
        ahio ahioVar2 = (ahio) ahtvVar.c(ahkzVar.f);
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahjc) aihfVarCreateBuilder2.instance).c = ahioVar2.getNumber();
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahjc) aihfVarCreateBuilder2.instance).d = ahkzVar.g;
        ahjc ahjcVar = (ahjc) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        ahje ahjeVar = (ahje) aihfVarCreateBuilder.instance;
        ahjcVar.getClass();
        ahjeVar.d = ahjcVar;
        ahjeVar.b |= 1;
        aigj aigjVarI = i(ahlbVar.b);
        aihfVarCreateBuilder.copyOnWrite();
        ahje ahjeVar2 = (ahje) aihfVarCreateBuilder.instance;
        aigjVarI.getClass();
        ahjeVar2.e = aigjVarI;
        aigj aigjVarI2 = i(ahkzVar.c);
        aihfVarCreateBuilder.copyOnWrite();
        ahje ahjeVar3 = (ahje) aihfVarCreateBuilder.instance;
        aigjVarI2.getClass();
        ahjeVar3.f = aigjVarI2;
        aihfVarCreateBuilder.copyOnWrite();
        ((ahje) aihfVarCreateBuilder.instance).c = 0;
        return (ahje) aihfVarCreateBuilder.build();
    }

    private static ahky h(ahga ahgaVar) throws GeneralSecurityException {
        if (ahgaVar == ahga.d) {
            return ahky.d;
        }
        if (ahgaVar == ahga.b) {
            return ahky.a;
        }
        if (ahgaVar == ahga.e) {
            return ahky.b;
        }
        if (ahgaVar == ahga.c) {
            return ahky.c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(ahgaVar.g));
    }

    private static aigj i(BigInteger bigInteger) {
        return aigj.v(afyd.l(bigInteger));
    }

    private static BigInteger j(aigj aigjVar) {
        return new BigInteger(1, aigjVar.G());
    }

    private static ahub k(aigj aigjVar) {
        return new ahub(new BigInteger(1, aigjVar.G()));
    }

    private static aigj l(ahub ahubVar) {
        return i((BigInteger) ahubVar.a);
    }
}
