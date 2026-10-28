package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class wp extends FingerprintManager.AuthenticationCallback {
    final /* synthetic */ qcb a;

    public wp(qcb qcbVar) {
        this.a = qcbVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((wr) this.a.a).b.h(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        ((wr) this.a.a).b.i();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((wk) ((wr) this.a.a).b).a;
        if (weakReference.get() != null) {
            wm wmVar = (wm) weakReference.get();
            if (wmVar.q == null) {
                wmVar.q = new bop();
            }
            wm.o(wmVar.q, charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        xsc xscVar;
        wb wbVar;
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        if (cryptoObject == null) {
            xscVar = null;
        } else if (cryptoObject.getCipher() != null) {
            xscVar = new xsc(cryptoObject.getCipher());
        } else if (cryptoObject.getSignature() != null) {
            xscVar = new xsc(cryptoObject.getSignature());
        } else if (cryptoObject.getMac() != null) {
            xscVar = new xsc(cryptoObject.getMac());
        } else {
            xscVar = null;
        }
        if (xscVar == null) {
            wbVar = null;
        } else {
            Object obj = xscVar.b;
            if (obj != null) {
                wbVar = new wb((Cipher) obj);
            } else {
                Object obj2 = xscVar.a;
                if (obj2 != null) {
                    wbVar = new wb((Signature) obj2);
                } else {
                    Object obj3 = xscVar.c;
                    if (obj3 != null) {
                        wbVar = new wb((Mac) obj3);
                    } else {
                        wbVar = null;
                    }
                }
            }
        }
        ((wr) this.a.a).b.q(new aami(wbVar, 2, null));
    }
}
