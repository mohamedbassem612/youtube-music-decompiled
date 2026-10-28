package defpackage;

import android.content.IntentFilter;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import org.chromium.base.JniAndroid;
import org.chromium.net.X509Util;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axkz {
    private static volatile axkz d;
    public final CertificateFactory a = CertificateFactory.getInstance("X.509");
    public KeyStore b;
    public File c;
    private final axky e;

    private axkz() throws NoSuchAlgorithmException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            this.b = keyStore;
            try {
                keyStore.load(null);
            } catch (IOException unused) {
            }
            this.c = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
        } catch (KeyStoreException unused2) {
        }
        axky axkyVar = new axky();
        this.e = axkyVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
        intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
        intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
        JniAndroid.a.registerReceiver(axkyVar, intentFilter, null, null, 0);
    }

    public static axkz a() {
        if (d == null) {
            synchronized (X509Util.sLock) {
                if (d == null) {
                    d = new axkz();
                }
            }
        }
        return d;
    }
}
