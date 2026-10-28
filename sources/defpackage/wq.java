package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wq extends BiometricPrompt$AuthenticationCallback {
    final /* synthetic */ we a;

    public wq(we weVar) {
        this.a = weVar;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.h(i, charSequence);
    }

    public final void onAuthenticationFailed() {
        this.a.i();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        wb wbVar;
        BiometricPrompt.CryptoObject cryptoObject;
        KeyAgreement keyAgreement;
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (authenticationResult == null || (cryptoObject = authenticationResult.getCryptoObject()) == null) {
            wbVar = null;
        } else {
            Cipher cipher = cryptoObject.getCipher();
            if (cipher != null) {
                wbVar = new wb(cipher);
            } else {
                Signature signature = cryptoObject.getSignature();
                if (signature != null) {
                    wbVar = new wb(signature);
                } else {
                    Mac mac = cryptoObject.getMac();
                    if (mac != null) {
                        wbVar = new wb(mac);
                    } else if (Build.VERSION.SDK_INT >= 30 && (identityCredential = cryptoObject.getIdentityCredential()) != null) {
                        wbVar = new wb(identityCredential);
                    } else if (Build.VERSION.SDK_INT >= 33 && (presentationSession = cryptoObject.getPresentationSession()) != null) {
                        wbVar = new wb(presentationSession);
                    } else if (Build.VERSION.SDK_INT >= 36 && a.at() >= 3600001 && (keyAgreement = cryptoObject.getKeyAgreement()) != null) {
                        wbVar = new wb(keyAgreement);
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        long operationHandle = cryptoObject.getOperationHandle();
                        if (operationHandle != 0) {
                            wbVar = new wb(operationHandle);
                        } else {
                            wbVar = null;
                        }
                    } else {
                        wbVar = null;
                    }
                }
            }
        }
        int authenticationType = -1;
        if (Build.VERSION.SDK_INT >= 30) {
            if (authenticationResult != null) {
                authenticationType = authenticationResult.getAuthenticationType();
            }
        } else if (Build.VERSION.SDK_INT != 29) {
            authenticationType = 2;
        }
        this.a.q(new aami(wbVar, authenticationType, null));
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
