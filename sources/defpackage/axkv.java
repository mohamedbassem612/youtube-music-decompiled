package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.AndroidCertVerifyResult;
import org.chromium.net.X509Util;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axkv {
    private final Object a;
    private final Object b;

    public axkv(KeyStore keyStore) {
        this.a = new HashSet();
        this.b = X509Util.createTrustManager(keyStore);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011d A[EDGE_INSN: B:67:0x011d->B:44:0x011d BREAK  A[LOOP:1: B:31:0x00a1->B:43:0x011a]] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.Set] */
    public final AndroidCertVerifyResult a(byte[][] bArr, String str, String str2, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr[0] == null) {
            throw new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=".concat(String.valueOf(Arrays.deepToString(bArr))));
        }
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(X509Util.createCertificateFromBytes(bArr[0]));
            boolean z = true;
            for (int i = 1; i < bArr.length; i++) {
                try {
                    arrayList.add(X509Util.createCertificateFromBytes(bArr[i]));
                } catch (CertificateException unused) {
                    Log.w("cn_X509Util", a.bP(i, "intermediate ", " failed parsing"));
                }
            }
            X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
            try {
                x509CertificateArr[0].checkValidity();
                if (!X509Util.verifyKeyUsage(x509CertificateArr[0])) {
                    return new AndroidCertVerifyResult(-6);
                }
                Object obj = this.b;
                if (obj == null) {
                    return new AndroidCertVerifyResult(-1);
                }
                try {
                    List listCheckServerTrustedIgnoringRuntimeException = X509Util.checkServerTrustedIgnoringRuntimeException((X509TrustManagerExtensions) obj, x509CertificateArr, str, str2, bArr2, bArr3);
                    if (listCheckServerTrustedIgnoringRuntimeException.size() > 0) {
                        X509Certificate x509Certificate = (X509Certificate) listCheckServerTrustedIgnoringRuntimeException.get(listCheckServerTrustedIgnoringRuntimeException.size() - 1);
                        KeyStore keyStore = axkz.a().b;
                        if (keyStore != null) {
                            Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
                            ?? r12 = this.a;
                            if (!r12.contains(pair)) {
                                String strHashPrincipal = X509Util.hashPrincipal(x509Certificate.getSubjectX500Principal());
                                int i2 = 0;
                                while (true) {
                                    String str3 = strHashPrincipal + '.' + i2;
                                    if (!new File(axkz.a().c, str3).exists()) {
                                        break;
                                    }
                                    Certificate certificate = keyStore.getCertificate("system:".concat(str3));
                                    if (certificate != null) {
                                        if (certificate instanceof X509Certificate) {
                                            X509Certificate x509Certificate2 = (X509Certificate) certificate;
                                            if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                                                r12.add(pair);
                                            }
                                        } else {
                                            Log.e("cn_X509Util", "Anchor " + str3 + " not an X509Certificate: " + certificate.getClass().getName());
                                        }
                                    }
                                    i2++;
                                }
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    return new AndroidCertVerifyResult(0, z, listCheckServerTrustedIgnoringRuntimeException);
                } catch (CertificateException e) {
                    e.getMessage();
                    return new AndroidCertVerifyResult(-2);
                }
            } catch (CertificateExpiredException unused2) {
                return new AndroidCertVerifyResult(-3);
            } catch (CertificateNotYetValidException unused3) {
                return new AndroidCertVerifyResult(-4);
            } catch (CertificateException unused4) {
                return new AndroidCertVerifyResult(-1);
            }
        } catch (CertificateException unused5) {
            return new AndroidCertVerifyResult(-5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void b() {
        if (((AtomicInteger) this.a).decrementAndGet() == 0) {
            this.b.run();
        }
    }

    public final void c() {
        ((AtomicInteger) this.a).incrementAndGet();
    }

    public axkv(Runnable runnable) {
        this.a = new AtomicInteger(1);
        this.b = runnable;
    }
}
