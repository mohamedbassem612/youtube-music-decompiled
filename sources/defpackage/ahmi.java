package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahmi implements ahge {
    private final /* synthetic */ int $cid;
    private final byte[] a;
    private final PublicKey b;
    private final String c;
    private final int d;
    private final Provider e;

    private ahmi(byte[] bArr, PublicKey publicKey, String str, int i, Provider provider, int i2) {
        this.$cid = i2;
        this.a = bArr;
        this.b = publicKey;
        this.c = str;
        this.d = i;
        this.e = provider;
    }

    public static ahge b(ahkk ahkkVar, Provider provider) {
        String str;
        PublicKey publicKeyGeneratePublic;
        int i;
        if (!afyd.q(1)) {
            throw new GeneralSecurityException("Can not use ML-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
        }
        ahkg ahkgVar = ahkkVar.a.a;
        if (ahkgVar == ahkg.a) {
            str = "ML-DSA-44";
            publicKeyGeneratePublic = KeyFactory.getInstance("ML-DSA-44", provider).generatePublic(new ahmh(ahkkVar.b.c()));
            i = 2420;
        } else if (ahkgVar == ahkg.b) {
            str = "ML-DSA-65";
            publicKeyGeneratePublic = KeyFactory.getInstance("ML-DSA-65", provider).generatePublic(new ahmh(ahkkVar.b.c()));
            i = 3309;
        } else {
            if (ahkgVar != ahkg.c) {
                throw new GeneralSecurityException("Unsupported ML-DSA instance: ".concat(ahkgVar.d));
            }
            str = "ML-DSA-87";
            publicKeyGeneratePublic = KeyFactory.getInstance("ML-DSA-87", provider).generatePublic(new ahmh(ahkkVar.b.c()));
            i = 4627;
        }
        int i2 = i;
        return new ahmi(ahkkVar.c.c(), publicKeyGeneratePublic, str, i2, provider, 0);
    }

    public static ahge c(ahjq ahjqVar, Provider provider) throws GeneralSecurityException {
        ahmv ahmvVar;
        byte[] bArrP;
        if (!afyd.q(1)) {
            throw new GeneralSecurityException("Can not use Composite ML-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
        }
        ahjo ahjoVar = ahjqVar.b;
        ahkk ahkkVar = ahjqVar.c;
        ahjl ahjlVar = ahjoVar.b;
        byte[] bArrC = ahkkVar.b.c();
        if (ahjlVar.equals(ahjl.a)) {
            bArrP = ((ahkf) ahjqVar.d).b.c();
        } else {
            ahjl ahjlVar2 = ahjl.b;
            if (ahjlVar.equals(ahjlVar2) || ahjlVar.equals(ahjl.c) || ahjlVar.equals(ahjl.d)) {
                ahjx ahjxVar = (ahjx) ahjqVar.d;
                if (ahjlVar.equals(ahjlVar2)) {
                    ahmvVar = ahmv.a;
                } else if (ahjlVar.equals(ahjl.c)) {
                    ahmvVar = ahmv.b;
                } else {
                    if (!ahjlVar.equals(ahjl.d)) {
                        throw new GeneralSecurityException("Not an ECDSA classical algorithm: ".concat(ahjlVar.k));
                    }
                    ahmvVar = ahmv.c;
                }
                ECPoint eCPoint = ahjxVar.b;
                EllipticCurve curve = aedi.y(ahmvVar).getCurve();
                ahgu.e(eCPoint, curve);
                int iX = (aedi.x(curve) + 7) / 8;
                int i = (iX << 1) + 1;
                byte[] bArr = new byte[i];
                byte[] bArrL = afyd.l(eCPoint.getAffineX());
                byte[] bArrL2 = afyd.l(eCPoint.getAffineY());
                int length = bArrL2.length;
                System.arraycopy(bArrL2, 0, bArr, i - length, length);
                int length2 = bArrL.length;
                System.arraycopy(bArrL, 0, bArr, (iX + 1) - length2, length2);
                bArr[0] = 4;
                bArrP = bArr;
            } else if (ahjlVar.equals(ahjl.e) || ahjlVar.equals(ahjl.f) || ahjlVar.equals(ahjl.g)) {
                ahlb ahlbVar = (ahlb) ahjqVar.d;
                ArrayList arrayList = new ArrayList();
                arrayList.add(afyd.n(ahlbVar.b));
                arrayList.add(afyd.n(ahlbVar.a.c));
                bArrP = afyd.p(arrayList);
            } else {
                if (!ahjlVar.equals(ahjl.h) && !ahjlVar.equals(ahjl.i) && !ahjlVar.equals(ahjl.j)) {
                    throw new GeneralSecurityException("Unsupported classical algorithm: ".concat(ahjlVar.k));
                }
                ahku ahkuVar = (ahku) ahjqVar.d;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(afyd.n(ahkuVar.b));
                arrayList2.add(afyd.n(ahkuVar.a.c));
                bArrP = afyd.p(arrayList2);
            }
        }
        int length3 = bArrC.length;
        int length4 = bArrP.length;
        byte[] bArr2 = new byte[length3 + length4];
        System.arraycopy(bArrC, 0, bArr2, 0, length3);
        System.arraycopy(bArrP, 0, bArr2, length3, length4);
        String strC = aedi.C(ahjoVar);
        return new ahmi(ahjqVar.e.c(), KeyFactory.getInstance(strC, provider).generatePublic(new ahlw(bArr2)), strC, aedi.D(strC) ? 0 : aedi.B(ahjoVar), provider, 1);
    }

    @Override // defpackage.ahge
    public final void a(byte[] bArr, byte[] bArr2) {
        int i = this.$cid;
        byte[] bArr3 = this.a;
        if (i == 0) {
            if (!ahie.c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            int length = bArr.length;
            int i2 = this.d;
            int length2 = bArr3.length;
            if (length != length2 + i2) {
                throw new GeneralSecurityException("Invalid signature length");
            }
            String str = this.c;
            Provider provider = this.e;
            PublicKey publicKey = this.b;
            Signature signature = Signature.getInstance(str, provider);
            signature.initVerify(publicKey);
            signature.update(bArr2);
            if (!signature.verify(bArr, length2, i2)) {
                throw new GeneralSecurityException("Invalid signature");
            }
            return;
        }
        if (!ahie.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str2 = this.c;
        if (!aedi.D(str2)) {
            if (bArr.length != bArr3.length + this.d) {
                throw new GeneralSecurityException("Invalid signature length");
            }
        }
        Provider provider2 = this.e;
        PublicKey publicKey2 = this.b;
        Signature signature2 = Signature.getInstance(str2, provider2);
        signature2.initVerify(publicKey2);
        signature2.update(bArr2);
        int length3 = bArr.length;
        int length4 = bArr3.length;
        if (!signature2.verify(bArr, length4, length3 - length4)) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}
