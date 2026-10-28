package defpackage;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ahlj implements ahhm {
    @Override // defpackage.ahhm
    public final Object a(ahfv ahfvVar) throws GeneralSecurityException {
        byte[] bArrA;
        int i;
        byte[] bArrP;
        byte[] bArrSign;
        ahjp ahjpVar = (ahjp) ahfvVar;
        Provider providerA = ahgn.a();
        if (providerA == null) {
            throw new GeneralSecurityException("Obtaining Conscrypt provider failed");
        }
        if (!afyd.q(1)) {
            throw new GeneralSecurityException("Can not use Composite ML-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
        }
        ahjo ahjoVarB = ahjpVar.b();
        ahkj ahkjVar = ahjpVar.b;
        ahjl ahjlVar = ahjoVarB.b;
        byte[] bArrC = ahkjVar.b.c();
        if (ahjlVar.equals(ahjl.a)) {
            bArrP = ((ahkd) ahjpVar.c).b.c();
        } else if (ahjlVar.equals(ahjl.b) || ahjlVar.equals(ahjl.c) || ahjlVar.equals(ahjl.d)) {
            ahjw ahjwVar = (ahjw) ahjpVar.c;
            byte[] bArr = ahlx.a;
            ahjv ahjvVarB = ahjwVar.b();
            ahju ahjuVar = ahjvVarB.d;
            if (ahjuVar != ahju.d) {
                throw new GeneralSecurityException("Unsupported ECDSA variant for SEC1 encoding: ".concat(ahjuVar.e));
            }
            ahjt ahjtVar = ahjvVarB.a;
            if (ahjtVar != ahjt.b) {
                throw new GeneralSecurityException("Unsupported ECDSA signature encoding for SEC1 encoding: ".concat(ahjtVar.c));
            }
            ahjr ahjrVar = ahjvVarB.b;
            ahjs ahjsVar = ahjvVarB.c;
            if (ahjrVar == ahjr.a) {
                if (ahjsVar != ahjs.a) {
                    throw new GeneralSecurityException("Unsupported hash type for NIST_P256 in SEC1 encoding: ".concat(ahjsVar.d));
                }
                bArrA = ahlx.a(ahlx.a);
                i = 32;
            } else if (ahjrVar == ahjr.b) {
                if (ahjsVar != ahjs.b) {
                    throw new GeneralSecurityException("Unsupported hash type for NIST_P384 in SEC1 encoding: ".concat(ahjsVar.d));
                }
                bArrA = ahlx.a(ahlx.b);
                i = 48;
            } else {
                if (ahjrVar != ahjr.c) {
                    throw new GeneralSecurityException("Unsupported curve type: ".concat(ahjrVar.d));
                }
                if (ahjsVar != ahjs.c) {
                    throw new GeneralSecurityException("Unsupported hash type for NIST_P521 in SEC1 encoding: ".concat(ahjsVar.d));
                }
                bArrA = ahlx.a(ahlx.c);
                i = 66;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(afyd.n(BigInteger.ONE));
            byte[] bArrM = afyd.m((BigInteger) ahjwVar.b.a, i);
            int length = bArrM.length;
            byte[] bArrO = afyd.o(length);
            int length2 = bArrO.length;
            int i2 = length2 + 1;
            byte[] bArr2 = new byte[i2 + length];
            bArr2[0] = 4;
            System.arraycopy(bArrO, 0, bArr2, 1, length2);
            System.arraycopy(bArrM, 0, bArr2, i2, length);
            arrayList.add(bArr2);
            arrayList.add(bArrA);
            bArrP = afyd.p(arrayList);
        } else if (ahjlVar.equals(ahjl.e) || ahjlVar.equals(ahjl.f) || ahjlVar.equals(ahjl.g)) {
            ahla ahlaVar = (ahla) ahjpVar.c;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(afyd.n(BigInteger.ZERO));
            ahlb ahlbVar = ahlaVar.a;
            arrayList2.add(afyd.n(ahlbVar.b));
            arrayList2.add(afyd.n(ahlbVar.a.c));
            arrayList2.add(afyd.n((BigInteger) ahlaVar.b.a));
            arrayList2.add(afyd.n((BigInteger) ahlaVar.c.a));
            arrayList2.add(afyd.n((BigInteger) ahlaVar.d.a));
            arrayList2.add(afyd.n((BigInteger) ahlaVar.e.a));
            arrayList2.add(afyd.n((BigInteger) ahlaVar.f.a));
            arrayList2.add(afyd.n((BigInteger) ahlaVar.g.a));
            bArrP = afyd.p(arrayList2);
        } else {
            if (!ahjlVar.equals(ahjl.h) && !ahjlVar.equals(ahjl.i) && !ahjlVar.equals(ahjl.j)) {
                throw new GeneralSecurityException("Unsupported classical algorithm: ".concat(ahjlVar.k));
            }
            ahkt ahktVar = (ahkt) ahjpVar.c;
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(afyd.n(BigInteger.ZERO));
            ahku ahkuVar = ahktVar.a;
            arrayList3.add(afyd.n(ahkuVar.b));
            arrayList3.add(afyd.n(ahkuVar.a.c));
            arrayList3.add(afyd.n((BigInteger) ahktVar.b.a));
            arrayList3.add(afyd.n((BigInteger) ahktVar.c.a));
            arrayList3.add(afyd.n((BigInteger) ahktVar.d.a));
            arrayList3.add(afyd.n((BigInteger) ahktVar.e.a));
            arrayList3.add(afyd.n((BigInteger) ahktVar.f.a));
            arrayList3.add(afyd.n((BigInteger) ahktVar.g.a));
            bArrP = afyd.p(arrayList3);
        }
        int length3 = bArrC.length;
        int length4 = bArrP.length;
        byte[] bArr3 = new byte[length3 + length4];
        System.arraycopy(bArrC, 0, bArr3, 0, length3);
        System.arraycopy(bArrP, 0, bArr3, length3, length4);
        String strC = aedi.C(ahjoVarB);
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance(strC, providerA).generatePrivate(new ahlw(bArr3));
        int iB = !aedi.D(strC) ? aedi.B(ahjoVarB) : 0;
        byte[] bytes = "test workload".getBytes(StandardCharsets.UTF_8);
        byte[] bArrC2 = ahjpVar.e().c();
        Signature signature = Signature.getInstance(strC, providerA);
        signature.initSign(privateKeyGeneratePrivate);
        signature.update(bytes);
        if (aedi.D(strC)) {
            bArrSign = signature.sign();
            int length5 = bArrC2.length;
            if (length5 != 0) {
                int length6 = bArrSign.length;
                byte[] bArr4 = new byte[length5 + length6];
                System.arraycopy(bArrC2, 0, bArr4, 0, length5);
                System.arraycopy(bArrSign, 0, bArr4, length5, length6);
                bArrSign = bArr4;
            }
        } else {
            int length7 = bArrC2.length;
            byte[] bArr5 = new byte[length7 + iB];
            if (length7 > 0) {
                System.arraycopy(bArrC2, 0, bArr5, 0, length7);
            }
            signature.sign(bArr5, length7, iB);
            bArrSign = bArr5;
        }
        ahmi.c(ahjpVar.a, providerA).a(bArrSign, "test workload".getBytes(StandardCharsets.UTF_8));
        ahjpVar.e().c();
        return new ahmb(1);
    }
}
