package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.chromium.base.JniAndroid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axjk {
    public static final /* synthetic */ int a = 0;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static PackageInfo a(String str, int i) {
        try {
            return JniAndroid.a.getPackageManager().getPackageInfo(str, i);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String b(String str) {
        Signature[] signingCertificateHistory;
        int length;
        PackageInfo packageInfoA = a(str, 134217728);
        if (packageInfoA == null || packageInfoA.signingInfo == null || (signingCertificateHistory = packageInfoA.signingInfo.getSigningCertificateHistory()) == null || (length = signingCertificateHistory.length) == 0) {
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(signingCertificateHistory[length - 1].toByteArray());
            StringBuilder sb = new StringBuilder((bArrDigest.length * 3) - 1);
            int i = 0;
            while (true) {
                int length2 = bArrDigest.length;
                if (i >= length2) {
                    return sb.toString();
                }
                char[] cArr = b;
                sb.append(cArr[(bArrDigest[i] & 240) >>> 4]);
                sb.append(cArr[bArrDigest[i] & 15]);
                if (i < length2 - 1) {
                    sb.append(':');
                }
                i++;
            }
        } catch (NoSuchAlgorithmException e) {
            Log.w("cn_PackageUtils", "Unable to hash host app signature", e);
            return null;
        }
    }
}
