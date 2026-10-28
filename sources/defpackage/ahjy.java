package defpackage;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ahjy implements ahhm {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ahjy(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahhm
    public final Object a(ahfv ahfvVar) throws GeneralSecurityException {
        String str;
        PrivateKey privateKeyGeneratePrivate;
        int i;
        switch (this.$cid) {
            case 0:
                return ahmc.b((ahjx) ahfvVar);
            case 1:
                return ahmb.b((ahjw) ahfvVar);
            case 2:
                return ahmt.b((ahkd) ahfvVar);
            case 3:
                return ahnb.c((ahkf) ahfvVar);
            case 4:
                ahgb ahgbVarC = ((ahhc) ahfvVar).c(ahgj.a);
                ahmu.c(ahgbVarC);
                ahmu.b(ahgbVarC);
                return new ahmb(2);
            case 5:
                ahgb ahgbVarC2 = ((ahhc) ahfvVar).c(ahgj.a);
                return new ahmu((ahge) ahgx.a.a((String) ahgbVarC2.a, ahge.class).d((aigj) ahgbVarC2.b), ahmu.c(ahgbVarC2), ahmu.b(ahgbVarC2), 1);
            case 6:
                return ahml.b((ahkt) ahfvVar);
            case 7:
                return ahnb.b((ahku) ahfvVar);
            case 8:
                return ahmb.c((ahla) ahfvVar);
            case 9:
                return ahnd.b((ahlb) ahfvVar);
            case 10:
                ahkj ahkjVar = (ahkj) ahfvVar;
                if (!afyd.q(1)) {
                    throw new GeneralSecurityException("Can not use ML-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                Provider providerA = ahgn.a();
                if (providerA == null) {
                    throw new GeneralSecurityException("Obtaining Conscrypt provider failed");
                }
                if (!afyd.q(1)) {
                    throw new GeneralSecurityException("Can not use ML-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                ahkk ahkkVar = ahkjVar.a;
                ahkg ahkgVar = ahkkVar.a.a;
                if (ahkgVar == ahkg.a) {
                    str = "ML-DSA-44";
                    privateKeyGeneratePrivate = KeyFactory.getInstance("ML-DSA-44", providerA).generatePrivate(new ahmh(ahkjVar.b.c()));
                    i = 2420;
                } else if (ahkgVar == ahkg.b) {
                    str = "ML-DSA-65";
                    privateKeyGeneratePrivate = KeyFactory.getInstance("ML-DSA-65", providerA).generatePrivate(new ahmh(ahkjVar.b.c()));
                    i = 3309;
                } else {
                    if (ahkgVar != ahkg.c) {
                        throw new GeneralSecurityException("Unsupported ML-DSA instance: ".concat(ahkgVar.d));
                    }
                    str = "ML-DSA-87";
                    privateKeyGeneratePrivate = KeyFactory.getInstance("ML-DSA-87", providerA).generatePrivate(new ahmh(ahkjVar.b.c()));
                    i = 4627;
                }
                byte[] bytes = "test workload".getBytes(StandardCharsets.UTF_8);
                byte[] bArrC = ahkjVar.e().c();
                Signature signature = Signature.getInstance(str, providerA);
                signature.initSign(privateKeyGeneratePrivate);
                signature.update(bytes);
                int length = bArrC.length;
                byte[] bArr = new byte[length + i];
                if (length > 0) {
                    System.arraycopy(bArrC, 0, bArr, 0, length);
                }
                signature.sign(bArr, length, i);
                ((ahmi) ahmi.b(ahkkVar, providerA)).a(bArr, "test workload".getBytes(StandardCharsets.UTF_8));
                ahkjVar.e().c();
                return new ahmb(3);
            case 11:
                ahkk ahkkVar2 = (ahkk) ahfvVar;
                if (!afyd.q(1)) {
                    throw new GeneralSecurityException("Can not use ML-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                Provider providerA2 = ahgn.a();
                if (providerA2 != null) {
                    return ahmi.b(ahkkVar2, providerA2);
                }
                throw new GeneralSecurityException("Obtaining Conscrypt provider failed");
            case 12:
                return ahml.b((ahkt) ahfvVar);
            case 13:
                return ahmb.b((ahjw) ahfvVar);
            case 14:
                return ahnb.b((ahku) ahfvVar);
            case 15:
                return ahmt.b((ahkd) ahfvVar);
            case 16:
                return ahmb.c((ahla) ahfvVar);
            case 17:
                return ahnd.b((ahlb) ahfvVar);
            case 18:
                return ahmc.b((ahjx) ahfvVar);
            case 19:
                return ahnb.c((ahkf) ahfvVar);
            default:
                ahlt ahltVar = (ahlt) ahfvVar;
                if (!afyd.q(1)) {
                    throw new GeneralSecurityException("Can not use SLH-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                Provider providerA3 = ahgn.a();
                if (providerA3 == null) {
                    throw new GeneralSecurityException("Obtaining Conscrypt provider failed");
                }
                if (!afyd.q(1)) {
                    throw new GeneralSecurityException("Can not use SLH-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                ahls ahlsVarB = ahltVar.b();
                if (ahlsVarB.a != ahlp.a || ahlsVarB.b != ahlq.b) {
                    throw new GeneralSecurityException("Unsupported SLH-DSA parameters");
                }
                PrivateKey privateKeyGeneratePrivate2 = KeyFactory.getInstance("SLH-DSA-SHA2-128S", providerA3).generatePrivate(new ahmq(ahltVar.b.c()));
                byte[] bytes2 = "test workload".getBytes(StandardCharsets.UTF_8);
                byte[] bArrC2 = ahltVar.e().c();
                Signature signature2 = Signature.getInstance("SLH-DSA-SHA2-128S", providerA3);
                signature2.initSign(privateKeyGeneratePrivate2);
                signature2.update(bytes2);
                int length2 = bArrC2.length;
                byte[] bArr2 = new byte[length2 + 7856];
                if (length2 > 0) {
                    System.arraycopy(bArrC2, 0, bArr2, 0, length2);
                }
                signature2.sign(bArr2, length2, 7856);
                ((ahmr) ahmr.b(ahltVar.a, providerA3)).a(bArr2, "test workload".getBytes(StandardCharsets.UTF_8));
                ahltVar.e().c();
                return new ahmb(5);
        }
    }
}
