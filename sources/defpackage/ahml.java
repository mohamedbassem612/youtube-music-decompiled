package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahml implements ahgd {
    private static final byte[] b = new byte[0];
    private static final byte[] c = {0};
    private static final byte[] d = {1, 2, 3};
    Provider a;
    private final RSAPrivateCrtKey e;
    private final String f;
    private final byte[] g;
    private final byte[] h;
    private final ahge i;

    private ahml(RSAPrivateCrtKey rSAPrivateCrtKey, ahkq ahkqVar, byte[] bArr, byte[] bArr2, ahge ahgeVar, Provider provider) throws GeneralSecurityException {
        if (!afyd.q(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (ahkqVar != ahkq.a && ahkqVar != ahkq.b && ahkqVar != ahkq.c) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(String.valueOf(ahkqVar))));
        }
        ahne.a(rSAPrivateCrtKey.getModulus().bitLength());
        ahne.b(rSAPrivateCrtKey.getPublicExponent());
        this.e = rSAPrivateCrtKey;
        this.f = ahmm.c(ahkqVar);
        this.g = bArr;
        this.h = bArr2;
        this.i = ahgeVar;
        this.a = provider;
    }

    public static ahgd b(ahkt ahktVar) {
        Provider providerD = ahmm.d();
        KeyFactory keyFactory = providerD != null ? KeyFactory.getInstance("RSA", providerD) : (KeyFactory) ahmx.c.a("RSA");
        ahku ahkuVar = ahktVar.a;
        BigInteger bigInteger = ahktVar.b().c;
        ahub ahubVar = ahktVar.b;
        ahub ahubVar2 = ahktVar.c;
        ahub ahubVar3 = ahktVar.d;
        ahub ahubVar4 = ahktVar.e;
        ahub ahubVar5 = ahktVar.f;
        BigInteger bigInteger2 = (BigInteger) ahktVar.g.a;
        BigInteger bigInteger3 = (BigInteger) ahubVar5.a;
        BigInteger bigInteger4 = (BigInteger) ahubVar4.a;
        BigInteger bigInteger5 = (BigInteger) ahubVar3.a;
        ahml ahmlVar = new ahml((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(ahkuVar.b, bigInteger, (BigInteger) ahubVar.a, (BigInteger) ahubVar2.a, bigInteger5, bigInteger4, bigInteger3, bigInteger2)), ahktVar.b().e, ahktVar.e().c(), ahktVar.b().d.equals(ahkr.c) ? c : b, providerD != null ? ahmm.b(ahkuVar, providerD) : ahnb.b(ahkuVar), providerD);
        ahmlVar.a(d);
        return ahmlVar;
    }

    @Override // defpackage.ahgd
    public final void a(byte[] bArr) throws GeneralSecurityException {
        Provider provider = this.a;
        String str = this.f;
        Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) ahmx.a.a(str);
        signature.initSign(this.e);
        signature.update(bArr);
        byte[] bArr2 = this.h;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.g;
        if (bArr3.length > 0) {
            bArrSign = aedi.A(bArr3, bArrSign);
        }
        try {
            this.i.a(bArrSign, bArr);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("RSA signature computation error", e);
        }
    }
}
