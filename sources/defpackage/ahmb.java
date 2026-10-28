package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmb implements ahgd {
    private final /* synthetic */ int $cid;

    public ahmb(RSAPrivateCrtKey rSAPrivateCrtKey, ahna ahnaVar, ahna ahnaVar2, int i) throws GeneralSecurityException {
        this.$cid = i;
        if (ahgm.a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        ahne.c(ahnaVar);
        if (!ahnaVar.equals(ahnaVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        ahne.a(rSAPrivateCrtKey.getModulus().bitLength());
        ahne.b(rSAPrivateCrtKey.getPublicExponent());
    }

    public static ahgd b(ahjw ahjwVar) {
        Provider providerA = ahgn.a();
        ahna ahnaVar = (ahna) ahmc.a.c(ahjwVar.b().c);
        ahjwVar.e().c();
        ahjwVar.b().d.equals(ahju.c);
        return new ahmb(ahnaVar, 0);
    }

    public static ahgd c(ahla ahlaVar) throws NoSuchAlgorithmException {
        try {
            Provider providerC = ahmo.c();
            if (providerC == null) {
                throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
            }
            KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerC);
            ahkz ahkzVarB = ahlaVar.b();
            BigInteger bigInteger = ahlaVar.a.b;
            BigInteger bigInteger2 = ahkzVarB.c;
            Object obj = ahlaVar.b.a;
            Object obj2 = ahlaVar.c.a;
            Object obj3 = ahlaVar.d.a;
            Object obj4 = ahlaVar.e.a;
            BigInteger bigInteger3 = (BigInteger) obj4;
            BigInteger bigInteger4 = (BigInteger) obj3;
            BigInteger bigInteger5 = (BigInteger) obj2;
            BigInteger bigInteger6 = (BigInteger) obj;
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, bigInteger6, bigInteger5, bigInteger4, bigInteger3, (BigInteger) ahlaVar.f.a, (BigInteger) ahlaVar.g.a));
            ahkx ahkxVar = ahkzVarB.e;
            ahkx ahkxVar2 = ahkzVarB.f;
            int i = ahkzVarB.g;
            ahlaVar.e().c();
            ahkzVarB.d.equals(ahky.c);
            return new ahmb(rSAPrivateCrtKey, ahkxVar, ahkxVar2, i, 4);
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory2 = (KeyFactory) ahmx.c.a("RSA");
            ahlb ahlbVar = ahlaVar.a;
            BigInteger bigInteger7 = ahlaVar.b().c;
            ahub ahubVar = ahlaVar.b;
            ahub ahubVar2 = ahlaVar.c;
            ahub ahubVar3 = ahlaVar.d;
            ahub ahubVar4 = ahlaVar.e;
            ahub ahubVar5 = ahlaVar.f;
            BigInteger bigInteger8 = (BigInteger) ahlaVar.g.a;
            BigInteger bigInteger9 = (BigInteger) ahubVar5.a;
            BigInteger bigInteger10 = (BigInteger) ahubVar4.a;
            BigInteger bigInteger11 = (BigInteger) ahubVar3.a;
            BigInteger bigInteger12 = (BigInteger) ahubVar2.a;
            RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory2.generatePrivate(new RSAPrivateCrtKeySpec(ahlbVar.b, bigInteger7, (BigInteger) ahubVar.a, bigInteger12, bigInteger11, bigInteger10, bigInteger9, bigInteger8));
            ahkz ahkzVarB2 = ahlaVar.b();
            ahkx ahkxVar3 = ahkzVarB2.e;
            ahtv ahtvVar = ahnd.a;
            ahna ahnaVar = (ahna) ahtvVar.c(ahkxVar3);
            ahna ahnaVar2 = (ahna) ahtvVar.c(ahkzVarB2.f);
            ahlaVar.e().c();
            ahlaVar.b().d.equals(ahky.c);
            return new ahmb(rSAPrivateCrtKey2, ahnaVar, ahnaVar2, 7);
        }
    }

    @Override // defpackage.ahgd
    public final void a(byte[] bArr) {
        throw null;
    }

    private ahmb(ahna ahnaVar, int i) throws GeneralSecurityException {
        this.$cid = i;
        if (afyd.q(2)) {
            aedi.v(ahnaVar);
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }

    public ahmb(RSAPrivateCrtKey rSAPrivateCrtKey, ahkx ahkxVar, ahkx ahkxVar2, int i, int i2) throws GeneralSecurityException {
        this.$cid = i2;
        if (afyd.q(2)) {
            ahne.a(rSAPrivateCrtKey.getModulus().bitLength());
            ahne.b(rSAPrivateCrtKey.getPublicExponent());
            ahmo.b(ahkxVar);
            ahmo.d(ahkxVar, ahkxVar2, i);
            return;
        }
        throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }

    public ahmb(int i) {
        this.$cid = i;
    }
}
