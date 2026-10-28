package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahma {
    private static final ahha a;
    private static final ahha d;
    private static final ahub e = new ahub(ahjv.class);
    private static final ahub f = new ahub("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
    private static final ahha c = new ahha("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", new ahlz(1));
    private static final ahha b = new ahha(ahjw.class, new ahly(2));

    static {
        int i = 0;
        a = new ahha(ahjx.class, new ahly(i));
        d = new ahha("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", new ahlz(i));
    }

    public static ahgb a(ahjw ahjwVar, ahgj ahgjVar) throws GeneralSecurityException {
        int iF = f(ahjwVar.b().b);
        aihf aihfVarCreateBuilder = ahik.a.createBuilder();
        ahil ahilVarH = h(ahjwVar.a);
        aihfVarCreateBuilder.copyOnWrite();
        ahik ahikVar = (ahik) aihfVarCreateBuilder.instance;
        ahilVarH.getClass();
        ahikVar.d = ahilVarH;
        ahikVar.b |= 1;
        ahgj.a(ahgjVar);
        aigj aigjVarV = aigj.v(afyd.m((BigInteger) ahjwVar.b.a, iF));
        aihfVarCreateBuilder.copyOnWrite();
        ahik ahikVar2 = (ahik) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        ahikVar2.e = aigjVarV;
        return ahgb.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((ahik) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, g(ahjwVar.b().d), ahjwVar.a());
    }

    public static ahjw b(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
        ECPoint eCPoint;
        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
        }
        try {
            ahik ahikVar = (ahik) aihn.parseFrom(ahik.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
            if (ahikVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ahil ahilVar = ahikVar.d;
            if (ahilVar == null) {
                ahilVar = ahil.a;
            }
            if (ahilVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ahij ahijVar = ahilVar.d;
            if (ahijVar == null) {
                ahijVar = ahij.a;
            }
            ahio ahioVarA = ahio.a(ahijVar.b);
            if (ahioVarA == null) {
                ahioVarA = ahio.UNRECOGNIZED;
            }
            ahjs ahjsVarI = i(ahioVarA);
            ahij ahijVar2 = ahilVar.d;
            if (ahijVar2 == null) {
                ahijVar2 = ahij.a;
            }
            int iAT = a.aT(ahijVar2.d);
            if (iAT == 0) {
                iAT = 1;
            }
            ahjt ahjtVarL = l(iAT);
            ahij ahijVar3 = ahilVar.d;
            if (ahijVar3 == null) {
                ahijVar3 = ahij.a;
            }
            int iP = agvp.p(ahijVar3.c);
            if (iP == 0) {
                iP = 1;
            }
            ahjx ahjxVarH = aedi.H(aedi.I(ahjtVarL, k(iP), ahjsVarI, j((ahga) ahgbVar.d)), new ECPoint(new BigInteger(1, ahilVar.e.G()), new BigInteger(1, ahilVar.f.G())), (Integer) ahgbVar.e);
            BigInteger bigInteger = new BigInteger(1, ahikVar.e.G());
            ahgj.a(ahgjVar);
            ahub ahubVar = new ahub(bigInteger);
            Object obj = ahubVar.a;
            ECPoint eCPoint2 = ahjxVarH.b;
            ECParameterSpec eCParameterSpec = ahjxVarH.a.b.e;
            BigInteger order = eCParameterSpec.getOrder();
            if (((BigInteger) obj).signum() <= 0 || ((BigInteger) obj).compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private value");
            }
            if (!ahgu.f(eCParameterSpec, ahgu.a) && !ahgu.f(eCParameterSpec, ahgu.b) && !ahgu.f(eCParameterSpec, ahgu.c)) {
                throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
            }
            if (((BigInteger) obj).signum() != 1) {
                throw new GeneralSecurityException("k must be positive");
            }
            if (((BigInteger) obj).compareTo(eCParameterSpec.getOrder()) >= 0) {
                throw new GeneralSecurityException("k must be smaller than the order of the generator");
            }
            EllipticCurve curve = eCParameterSpec.getCurve();
            ECPoint generator = eCParameterSpec.getGenerator();
            ahgu.e(generator, curve);
            BigInteger a2 = eCParameterSpec.getCurve().getA();
            BigInteger bigIntegerD = ahgu.d(curve);
            ahgt ahgtVarC = ahgu.c(ECPoint.POINT_INFINITY, bigIntegerD);
            ahgt ahgtVarC2 = ahgu.c(generator, bigIntegerD);
            for (int iBitLength = ((BigInteger) obj).bitLength(); iBitLength >= 0; iBitLength--) {
                if (((BigInteger) obj).testBit(iBitLength)) {
                    ahgtVarC = ahgu.a(ahgtVarC, ahgtVarC2, a2, bigIntegerD);
                    ahgtVarC2 = ahgu.b(ahgtVarC2, a2, bigIntegerD);
                } else {
                    ahgtVarC2 = ahgu.a(ahgtVarC, ahgtVarC2, a2, bigIntegerD);
                    ahgtVarC = ahgu.b(ahgtVarC, a2, bigIntegerD);
                }
            }
            if (ahgtVarC.a()) {
                eCPoint = ECPoint.POINT_INFINITY;
            } else {
                BigInteger bigIntegerModInverse = ahgtVarC.d.modInverse(bigIntegerD);
                BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerD);
                eCPoint = new ECPoint(ahgtVarC.b.multiply(bigIntegerMod).mod(bigIntegerD), ahgtVarC.c.multiply(bigIntegerMod).mod(bigIntegerD).multiply(bigIntegerModInverse).mod(bigIntegerD));
            }
            ahgu.e(eCPoint, curve);
            if (eCPoint.equals(eCPoint2)) {
                return new ahjw(ahjxVarH, ahubVar);
            }
            throw new GeneralSecurityException("Invalid private value");
        } catch (aiik | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
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

    public static ahjx d(ahgb ahgbVar) throws GeneralSecurityException {
        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
        }
        try {
            ahil ahilVar = (ahil) aihn.parseFrom(ahil.a, (aigj) ahgbVar.b, ExtensionRegistryLite.a);
            if (ahilVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ahij ahijVar = ahilVar.d;
            if (ahijVar == null) {
                ahijVar = ahij.a;
            }
            ahio ahioVarA = ahio.a(ahijVar.b);
            if (ahioVarA == null) {
                ahioVarA = ahio.UNRECOGNIZED;
            }
            ahjs ahjsVarI = i(ahioVarA);
            ahij ahijVar2 = ahilVar.d;
            if (ahijVar2 == null) {
                ahijVar2 = ahij.a;
            }
            int iAT = a.aT(ahijVar2.d);
            if (iAT == 0) {
                iAT = 1;
            }
            ahjt ahjtVarL = l(iAT);
            ahij ahijVar3 = ahilVar.d;
            if (ahijVar3 == null) {
                ahijVar3 = ahij.a;
            }
            int iP = agvp.p(ahijVar3.c);
            if (iP == 0) {
                iP = 1;
            }
            return aedi.H(aedi.I(ahjtVarL, k(iP), ahjsVarI, j((ahga) ahgbVar.d)), new ECPoint(new BigInteger(1, ahilVar.e.G()), new BigInteger(1, ahilVar.f.G())), (Integer) ahgbVar.e);
        } catch (aiik | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static ahgb e(ahjx ahjxVar) {
        return ahgb.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", h(ahjxVar).toByteString(), ahfz.d, g(ahjxVar.a.d), ahjxVar.d);
    }

    private static int f(ahjr ahjrVar) throws GeneralSecurityException {
        if (ahjrVar.equals(ahjr.a)) {
            return 33;
        }
        if (ahjrVar.equals(ahjr.b)) {
            return 49;
        }
        if (ahjrVar.equals(ahjr.c)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(ahjrVar.d));
    }

    private static ahga g(ahju ahjuVar) throws GeneralSecurityException {
        if (ahjuVar.equals(ahju.a)) {
            return ahga.b;
        }
        if (ahjuVar.equals(ahju.b)) {
            return ahga.e;
        }
        if (ahjuVar.equals(ahju.d)) {
            return ahga.d;
        }
        if (ahjuVar.equals(ahju.c)) {
            return ahga.c;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ahjuVar.e));
    }

    private static ahil h(ahjx ahjxVar) throws GeneralSecurityException {
        ahio ahioVar;
        int i;
        ahjv ahjvVar = ahjxVar.a;
        ahjr ahjrVar = ahjvVar.b;
        int iF = f(ahjrVar);
        aihf aihfVarCreateBuilder = ahil.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ahij.a.createBuilder();
        ahjs ahjsVar = ahjvVar.c;
        if (ahjsVar.equals(ahjs.a)) {
            ahioVar = ahio.SHA256;
        } else if (ahjsVar.equals(ahjs.b)) {
            ahioVar = ahio.SHA384;
        } else {
            if (!ahjsVar.equals(ahjs.c)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(ahjsVar.d));
            }
            ahioVar = ahio.SHA512;
        }
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahij) aihfVarCreateBuilder2.instance).b = ahioVar.getNumber();
        int i2 = 4;
        if (ahjrVar.equals(ahjr.a)) {
            i = 4;
        } else if (ahjrVar.equals(ahjr.b)) {
            i = 5;
        } else {
            if (!ahjrVar.equals(ahjr.c)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(ahjrVar.d));
            }
            i = 6;
        }
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahij) aihfVarCreateBuilder2.instance).c = agvp.o(i);
        ahjt ahjtVar = ahjvVar.a;
        if (ahjtVar.equals(ahjt.a)) {
            i2 = 3;
        } else if (!ahjtVar.equals(ahjt.b)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(ahjtVar.c));
        }
        ECPoint eCPoint = ahjxVar.b;
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahij) aihfVarCreateBuilder2.instance).d = agvp.q(i2);
        ahij ahijVar = (ahij) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        ahil ahilVar = (ahil) aihfVarCreateBuilder.instance;
        ahijVar.getClass();
        ahilVar.d = ahijVar;
        ahilVar.b |= 1;
        aigj aigjVarV = aigj.v(afyd.m(eCPoint.getAffineX(), iF));
        aihfVarCreateBuilder.copyOnWrite();
        ahil ahilVar2 = (ahil) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        ahilVar2.e = aigjVarV;
        aigj aigjVarV2 = aigj.v(afyd.m(eCPoint.getAffineY(), iF));
        aihfVarCreateBuilder.copyOnWrite();
        ahil ahilVar3 = (ahil) aihfVarCreateBuilder.instance;
        aigjVarV2.getClass();
        ahilVar3.f = aigjVarV2;
        return (ahil) aihfVarCreateBuilder.build();
    }

    private static ahjs i(ahio ahioVar) throws GeneralSecurityException {
        int iOrdinal = ahioVar.ordinal();
        if (iOrdinal == 2) {
            return ahjs.b;
        }
        if (iOrdinal == 3) {
            return ahjs.a;
        }
        if (iOrdinal == 4) {
            return ahjs.c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + ahioVar.getNumber());
    }

    private static ahju j(ahga ahgaVar) throws GeneralSecurityException {
        if (ahgaVar.equals(ahga.b)) {
            return ahju.a;
        }
        if (ahgaVar.equals(ahga.e)) {
            return ahju.b;
        }
        if (ahgaVar.equals(ahga.c)) {
            return ahju.c;
        }
        if (ahgaVar.equals(ahga.d)) {
            return ahju.d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(ahgaVar.g));
    }

    private static ahjr k(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return ahjr.a;
        }
        if (i2 == 3) {
            return ahjr.b;
        }
        if (i2 == 4) {
            return ahjr.c;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + agvp.o(i));
    }

    private static ahjt l(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return ahjt.a;
        }
        if (i2 == 2) {
            return ahjt.b;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + agvp.q(i));
    }
}
