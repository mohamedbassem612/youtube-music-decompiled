package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.apps.youtube.music.R;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class vy {
    public vy() {
    }

    static int a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    static BiometricManager b(Context context) {
        return vy$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(vy$$ExternalSyntheticApiModelOutline0.m()));
    }

    static Method c() {
        try {
            return vy$$ExternalSyntheticApiModelOutline0.m().getMethod("canAuthenticate", pj$$ExternalSyntheticApiModelOutline0.m());
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static boolean g(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Context context, String str, int i) {
        if (str == null) {
            return false;
        }
        for (String str2 : context.getResources().getStringArray(i)) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        return h(context, str, R.array.hide_fingerprint_instantly_prefixes);
    }

    public static BiometricPrompt.CryptoObject j(wb wbVar) {
        KeyAgreement keyAgreement;
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (wbVar != null) {
            Cipher cipher = wbVar.b;
            if (cipher != null) {
                return new BiometricPrompt.CryptoObject(cipher);
            }
            Signature signature = wbVar.a;
            if (signature != null) {
                return new BiometricPrompt.CryptoObject(signature);
            }
            Mac mac = wbVar.c;
            if (mac != null) {
                return new BiometricPrompt.CryptoObject(mac);
            }
            if (Build.VERSION.SDK_INT >= 30 && (identityCredential = wbVar.e) != null) {
                return new BiometricPrompt.CryptoObject(identityCredential);
            }
            if (Build.VERSION.SDK_INT >= 33 && (presentationSession = wbVar.f) != null) {
                return new BiometricPrompt.CryptoObject(presentationSession);
            }
            if (Build.VERSION.SDK_INT >= 36 && a.at() >= 3600001 && (keyAgreement = wbVar.d) != null) {
                return new BiometricPrompt.CryptoObject(keyAgreement);
            }
            if (Build.VERSION.SDK_INT >= 35) {
                long j = wbVar.g;
                if (j != 0) {
                    return new BiometricPrompt.CryptoObject(j);
                }
            }
        }
        return null;
    }

    public static wb k() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("androidxBiometric", 3);
            builder.setBlockModes("CBC");
            builder.setEncryptionPaddings("PKCS7Padding");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(builder.build());
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new wb(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static boolean n(Messenger messenger) {
        if (messenger == null) {
            return false;
        }
        try {
            return messenger.getBinder() != null;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public void l(String str, Bundle bundle) {
        throw null;
    }

    public void m(Bundle bundle) {
        throw null;
    }

    public vy(byte[] bArr, byte[] bArr2) {
    }

    public void e() {
    }

    public void f() {
    }

    public void d(int i, CharSequence charSequence) {
    }
}
