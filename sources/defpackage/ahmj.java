package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmj {
    private static final ahha a;
    private static final ahha d;
    private static final ahtv g;
    private static final ahub e = new ahub(ahks.class);
    private static final ahub f = new ahub("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
    private static final ahha c = new ahha("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", new ahlz(6));
    private static final ahha b = new ahha(ahkt.class, new ahly(8));

    static {
        int i = 7;
        a = new ahha(ahku.class, new ahly(i));
        d = new ahha("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", new ahlz(i));
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        agvp.B(ahio.SHA256, ahkq.a, map, map2);
        agvp.B(ahio.SHA384, ahkq.b, map, map2);
        agvp.B(ahio.SHA512, ahkq.c, map, map2);
        g = agvp.C(map, map2);
    }

    public static ahgb a(ahkt ahktVar, ahgj ahgjVar) throws GeneralSecurityException {
        ahgj.a(ahgjVar);
        aihf aihfVarCreateBuilder = ahja.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ((ahja) aihfVarCreateBuilder.instance).c = 0;
        ahjb ahjbVarG = g(ahktVar.a);
        aihfVarCreateBuilder.copyOnWrite();
        ahja ahjaVar = (ahja) aihfVarCreateBuilder.instance;
        ahjbVarG.getClass();
        ahjaVar.d = ahjbVarG;
        ahjaVar.b |= 1;
        aigj aigjVarL = l(ahktVar.b);
        aihfVarCreateBuilder.copyOnWrite();
        ahja ahjaVar2 = (ahja) aihfVarCreateBuilder.instance;
        aigjVarL.getClass();
        ahjaVar2.e = aigjVarL;
        aigj aigjVarL2 = l(ahktVar.c);
        aihfVarCreateBuilder.copyOnWrite();
        ahja ahjaVar3 = (ahja) aihfVarCreateBuilder.instance;
        aigjVarL2.getClass();
        ahjaVar3.f = aigjVarL2;
        aigj aigjVarL3 = l(ahktVar.d);
        aihfVarCreateBuilder.copyOnWrite();
        ahja ahjaVar4 = (ahja) aihfVarCreateBuilder.instance;
        aigjVarL3.getClass();
        ahjaVar4.g = aigjVarL3;
        aigj aigjVarL4 = l(ahktVar.e);
        aihfVarCreateBuilder.copyOnWrite();
        ahja ahjaVar5 = (ahja) aihfVarCreateBuilder.instance;
        aigjVarL4.getClass();
        ahjaVar5.h = aigjVarL4;
        aigj aigjVarL5 = l(ahktVar.f);
        aihfVarCreateBuilder.copyOnWrite();
        ahja ahjaVar6 = (ahja) aihfVarCreateBuilder.instance;
        aigjVarL5.getClass();
        ahjaVar6.i = aigjVarL5;
        aigj aigjVarL6 = l(ahktVar.g);
        aihfVarCreateBuilder.copyOnWrite();
        ahja ahjaVar7 = (ahja) aihfVarCreateBuilder.instance;
        aigjVarL6.getClass();
        ahjaVar7.j = aigjVarL6;
        return ahgb.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((ahja) aihfVarCreateBuilder.build()).toByteString(), ahfz.c, f(ahktVar.b().d), ahktVar.a());
    }

    public static ahkt b(ahgb ahgbVar, ahgj ahgjVar) throws GeneralSecurityException {
        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(ahgbVar.a)));
        }
        try {
            Object obj = ahgbVar.b;
            ahja ahjaVar = (ahja) aihn.parseFrom(ahja.a, (aigj) obj, ExtensionRegistryLite.a);
            if (ahjaVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ahjb ahjbVar = ahjaVar.d;
            if (ahjbVar == null) {
                ahjbVar = ahjb.a;
            }
            if (ahjbVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerJ = j(ahjbVar.e);
            int iBitLength = bigIntegerJ.bitLength();
            BigInteger bigIntegerJ2 = j(ahjbVar.f);
            BigInteger bigInteger = ahks.a;
            ahkp ahkpVar = new ahkp();
            ahtv ahtvVar = g;
            ahiz ahizVar = ahjbVar.d;
            if (ahizVar == null) {
                ahizVar = ahiz.a;
            }
            ahio ahioVarA = ahio.a(ahizVar.b);
            if (ahioVarA == null) {
                ahioVarA = ahio.UNRECOGNIZED;
            }
            ahkpVar.b = (ahkq) ahtvVar.d(ahioVarA);
            ahkpVar.a = bigIntegerJ2;
            ahkpVar.b(iBitLength);
            ahkpVar.c = h((ahga) ahgbVar.d);
            ahku ahkuVarF = aedi.F(ahkpVar.a(), bigIntegerJ, (Integer) ahgbVar.e);
            ahgj.a(ahgjVar);
            ahub ahubVarK = k(ahjaVar.f);
            ahub ahubVarK2 = k(ahjaVar.g);
            ahub ahubVarK3 = k(ahjaVar.e);
            ahub ahubVarK4 = k(ahjaVar.h);
            ahub ahubVarK5 = k(ahjaVar.i);
            ahub ahubVarK6 = k(ahjaVar.j);
            BigInteger bigInteger2 = ahkuVarF.a.c;
            BigInteger bigInteger3 = ahkuVarF.b;
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
                return new ahkt(ahkuVarF, ahubVarK, ahubVarK2, ahubVarK3, ahubVarK4, ahubVarK5, ahubVarK6);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        } catch (aiik | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
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

    public static ahku d(ahgb ahgbVar) throws GeneralSecurityException {
        if (!((String) ahgbVar.a).equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(ahgbVar.a)));
        }
        try {
            Object obj = ahgbVar.b;
            ahjb ahjbVar = (ahjb) aihn.parseFrom(ahjb.a, (aigj) obj, ExtensionRegistryLite.a);
            if (ahjbVar.c != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerJ = j(ahjbVar.e);
            int iBitLength = bigIntegerJ.bitLength();
            BigInteger bigInteger = ahks.a;
            ahkp ahkpVar = new ahkp();
            ahtv ahtvVar = g;
            ahiz ahizVar = ahjbVar.d;
            if (ahizVar == null) {
                ahizVar = ahiz.a;
            }
            ahio ahioVarA = ahio.a(ahizVar.b);
            if (ahioVarA == null) {
                ahioVarA = ahio.UNRECOGNIZED;
            }
            ahkpVar.b = (ahkq) ahtvVar.d(ahioVarA);
            ahkpVar.a = j(ahjbVar.f);
            ahkpVar.b(iBitLength);
            ahkpVar.c = h((ahga) ahgbVar.d);
            return aedi.F(ahkpVar.a(), bigIntegerJ, (Integer) ahgbVar.e);
        } catch (aiik | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    public static ahgb e(ahku ahkuVar) {
        return ahgb.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", g(ahkuVar).toByteString(), ahfz.d, f(ahkuVar.a.d), ahkuVar.d);
    }

    private static ahga f(ahkr ahkrVar) throws GeneralSecurityException {
        if (ahkrVar.equals(ahkr.d)) {
            return ahga.d;
        }
        if (ahkrVar.equals(ahkr.a)) {
            return ahga.b;
        }
        if (ahkrVar.equals(ahkr.b)) {
            return ahga.e;
        }
        if (ahkrVar.equals(ahkr.c)) {
            return ahga.c;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(ahkrVar))));
    }

    private static ahjb g(ahku ahkuVar) {
        aihf aihfVarCreateBuilder = ahjb.a.createBuilder();
        aihf aihfVarCreateBuilder2 = ahiz.a.createBuilder();
        ahks ahksVar = ahkuVar.a;
        ahio ahioVar = (ahio) g.c(ahksVar.e);
        aihfVarCreateBuilder2.copyOnWrite();
        ((ahiz) aihfVarCreateBuilder2.instance).b = ahioVar.getNumber();
        ahiz ahizVar = (ahiz) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        ahjb ahjbVar = (ahjb) aihfVarCreateBuilder.instance;
        ahizVar.getClass();
        ahjbVar.d = ahizVar;
        ahjbVar.b |= 1;
        aigj aigjVarI = i(ahkuVar.b);
        aihfVarCreateBuilder.copyOnWrite();
        ahjb ahjbVar2 = (ahjb) aihfVarCreateBuilder.instance;
        aigjVarI.getClass();
        ahjbVar2.e = aigjVarI;
        aigj aigjVarI2 = i(ahksVar.c);
        aihfVarCreateBuilder.copyOnWrite();
        ahjb ahjbVar3 = (ahjb) aihfVarCreateBuilder.instance;
        aigjVarI2.getClass();
        ahjbVar3.f = aigjVarI2;
        return (ahjb) aihfVarCreateBuilder.build();
    }

    private static ahkr h(ahga ahgaVar) throws GeneralSecurityException {
        if (ahgaVar == ahga.d) {
            return ahkr.d;
        }
        if (ahgaVar == ahga.b) {
            return ahkr.a;
        }
        if (ahgaVar == ahga.e) {
            return ahkr.b;
        }
        if (ahgaVar == ahga.c) {
            return ahkr.c;
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
