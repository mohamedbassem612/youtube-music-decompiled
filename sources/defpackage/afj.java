package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class afj {
    private final Map a;
    private final boolean b;
    private final Map c = new HashMap();
    private final PackageManager d;
    private final boolean e;

    static {
        new afj(null, new HashMap(), true);
    }

    public afj(PackageManager packageManager, Map map, boolean z) {
        this.d = packageManager;
        this.a = map;
        this.b = z;
        boolean z2 = false;
        if (packageManager != null && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
            z2 = true;
        }
        this.e = z2;
    }

    private static MessageDigest b() {
        try {
            return MessageDigest.getInstance("SHA256");
        } catch (NoSuchAlgorithmException e) {
            Log.e("CarApp.Val", "Could not find SHA256 hash algorithm", e);
            return null;
        }
    }

    private static final String c(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        MessageDigest messageDigestB = b();
        if (messageDigestB == null) {
            return null;
        }
        messageDigestB.update(byteArray);
        byte[] bArrDigest = messageDigestB.digest();
        StringBuilder sb = new StringBuilder((bArrDigest.length * 3) - 1);
        for (byte b : bArrDigest) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x004e, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.xx r13) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afj.a(xx):boolean");
    }
}
