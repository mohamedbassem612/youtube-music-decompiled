package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.youtube.media.interfaces.MediaFetchController;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class auym {
    static ArrayList a;
    public Object b;

    public auym(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.w();
        swipeDismissBehavior.v();
        swipeDismissBehavior.x();
    }

    public static synchronized auym a() {
        auym auymVar;
        if (a == null) {
            a = new ArrayList();
        }
        auymVar = new auym();
        a.add(auymVar);
        return auymVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final synchronized SecretKey k() {
        SecretKey secretKey;
        SecretKey secretKeyGenerateKey;
        SecretKey secretKey2;
        try {
            Object obj = this.b;
            secretKeyGenerateKey = obj;
            if (obj == null) {
                try {
                    Key key = m().getKey("youtube_web_view_auth_key", null);
                    if (key instanceof SecretKey) {
                        secretKey2 = (SecretKey) key;
                    } else {
                        secretKey = null;
                    }
                    if (secretKey != null) {
                        secretKey = secretKey2;
                        this.b = secretKey;
                        secretKeyGenerateKey = secretKey;
                    } else {
                        secretKey = secretKey2;
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("youtube_web_view_auth_key", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(SemanticState.Hidden).setRandomizedEncryptionRequired(true).build();
                        keyGenParameterSpecBuild.getClass();
                        keyGenerator.init(keyGenParameterSpecBuild);
                        secretKeyGenerateKey = keyGenerator.generateKey();
                        this.b = secretKeyGenerateKey;
                        secretKeyGenerateKey.getClass();
                    }
                } catch (IOException e) {
                    throw new GeneralSecurityException("Failed to load keystore", e);
                } catch (GeneralSecurityException e2) {
                    throw e2;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return secretKeyGenerateKey;
    }

    private final synchronized void l(KeyPermanentlyInvalidatedException keyPermanentlyInvalidatedException) {
        this.b = null;
        try {
            try {
                m().deleteEntry("youtube_web_view_auth_key");
            } catch (GeneralSecurityException e) {
                avkz.d(keyPermanentlyInvalidatedException, e);
            }
        } catch (IOException e2) {
            avkz.d(keyPermanentlyInvalidatedException, e2);
        }
        throw new GeneralSecurityException("Keystore key was permanently invalidated", keyPermanentlyInvalidatedException);
    }

    private static final KeyStore m() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.getClass();
        return keyStore;
    }

    public final InputStream b() {
        Object obj = this.b;
        this.b = null;
        return (InputStream) obj;
    }

    public final void c() {
        this.b = null;
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding", "AndroidKeyStoreBCWorkaround");
            cipher.init(1, k());
            if (bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            byte[] iv = cipher.getIV();
            if (iv == null) {
                throw new GeneralSecurityException("Cipher IV was null");
            }
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            bArrDoFinal.getClass();
            int length = iv.length;
            int length2 = bArrDoFinal.length;
            byte[] bArrCopyOf = Arrays.copyOf(iv, length + length2);
            System.arraycopy(bArrDoFinal, 0, bArrCopyOf, length, length2);
            bArrCopyOf.getClass();
            return bArrCopyOf;
        } catch (KeyPermanentlyInvalidatedException e) {
            l(e);
            throw new awmh();
        }
    }

    public final synchronized void e(adxv adxvVar) {
        this.b = adxvVar;
    }

    public final synchronized boolean f() {
        return this.b == null;
    }

    public final synchronized long g() {
        Long bandwidthEstimateBytesPerSec;
        if (this.b != null) {
            synchronized (zik.class) {
                try {
                    bandwidthEstimateBytesPerSec = ((MediaFetchController) this.b).getBandwidthEstimateBytesPerSec();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bandwidthEstimateBytesPerSec != null) {
                return bandwidthEstimateBytesPerSec.longValue();
            }
        }
        return 0L;
    }

    public final synchronized void h(MediaFetchController mediaFetchController) {
        this.b = mediaFetchController;
    }

    public final uzi i() {
        Object obj = this.b;
        if (obj != null) {
            return new uzi((String) obj);
        }
        throw new IllegalStateException("Missing required properties: unpublishedAssetId");
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null unpublishedAssetId");
        }
        this.b = str;
    }

    public auym(Object obj) {
        this.b = obj;
    }

    private auym() {
    }
}
