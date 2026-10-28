package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahse {
    public static final String[] a = {"*", "FCM", "GCM", ""};
    public final SharedPreferences b;
    public final String c;

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    public ahse(ahnr ahnrVar) {
        this.b = ahnrVar.a().getSharedPreferences("com.google.android.gms.appid", 0);
        String str = ahnrVar.e().c;
        if (str == null) {
            str = ahnrVar.e().b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length == 4) {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                } else {
                    str = null;
                }
            }
        }
        this.c = str;
    }

    public static String a(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & 15) + 112);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final PublicKey b(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored ".concat(e.toString()));
            return null;
        }
    }
}
