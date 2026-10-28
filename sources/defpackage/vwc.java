package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import j$.util.Base64;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vwc {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/attestation/KeyAttestationManager");
    private KeyPair b;

    public static final aigj b(byte[] bArr) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyStore.Entry entry = keyStore.getEntry("Key1", null);
            if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/innertube/attestation/KeyAttestationManager", "createSignature", 95, "KeyAttestationManager.java")).w("Not an instance of a PrivateKeyEntry: %s", entry != null ? entry.getClass().getName() : "null entry");
                return null;
            }
            Signature signature = Signature.getInstance("SHA512withECDSA");
            signature.initSign(((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
            signature.update(bArr);
            return aigj.v(signature.sign());
        } catch (IOException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | SignatureException | UnrecoverableEntryException | CertificateException e) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/innertube/attestation/KeyAttestationManager", "createSignature", 111, "KeyAttestationManager.java")).w("Error in signing: %s", e.getMessage());
            return null;
        }
    }

    public static final List c() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Certificate[] certificateChain = keyStore.getCertificateChain("Key1");
            if (certificateChain == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Certificate certificate : certificateChain) {
                arrayList.add(aigj.v(certificate.getEncoded()));
            }
            return arrayList;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/innertube/attestation/KeyAttestationManager", "getCertificateChain", 132, "KeyAttestationManager.java")).w("Error getting certificate chain: %s", e.getMessage());
            return null;
        }
    }

    public final KeyPair a() {
        KeyPair keyPair = this.b;
        if (keyPair != null) {
            return keyPair;
        }
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.getEncoder().encodeToString(bArr);
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("Key1", 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-512").setUserAuthenticationRequired(false).setAttestationChallenge(strEncodeToString.getBytes()).build());
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            this.b = keyPairGenerateKeyPair;
            return keyPairGenerateKeyPair;
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/innertube/attestation/KeyAttestationManager", "maybeCreateKeyPair", 82, "KeyAttestationManager.java")).w("Error creating key pair: %s", e.getMessage());
            return null;
        }
    }
}
