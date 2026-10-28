package defpackage;

import android.net.Uri;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class omu {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = a;
            cArr[i] = cArr2[(b & 255) >>> 4];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public static MessageDigest b() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (messageDigest == null) {
                return null;
            }
            return messageDigest;
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    public static String c(ayq ayqVar, Uri uri) {
        String strA;
        try {
            qqs qqsVar = new qqs();
            qqsVar.b();
            InputStream inputStream = (InputStream) ayqVar.X(uri, qqsVar);
            try {
                MessageDigest messageDigestB = b();
                if (messageDigestB == null) {
                    strA = "";
                } else {
                    byte[] bArr = new byte[SemanticState.Multiline];
                    for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                        messageDigestB.update(bArr, 0, i);
                    }
                    strA = a(messageDigestB.digest());
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return strA;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            onb.g(e, "%s: Failed to open file, uri = %s", "FileValidator", uri);
            return "";
        }
    }

    public static void d(ayq ayqVar, oin oinVar, Uri uri, String str) {
        long jV;
        try {
            if (!ayqVar.ac(uri)) {
                onb.e("%s: Downloaded file %s is not present at %s", "FileValidator", nsp.e(oinVar), uri);
                acb acbVarA = oig.a();
                acbVarA.b = oif.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                throw acbVarA.a();
            }
            int iAU = a.aU(oinVar.f);
            if (iAU == 0 || iAU != 2) {
                String strC = c(ayqVar, uri);
                if (strC.equals(str)) {
                    return;
                }
                try {
                    jV = ayqVar.V(uri);
                } catch (IOException unused) {
                    jV = -1;
                }
                onb.e("%s: Downloaded file at uri = %s, expected checksum = %s, computed checksum = %s, size = %s verification failed", "FileValidator", uri, str, strC, Long.valueOf(jV));
                acb acbVarA2 = oig.a();
                acbVarA2.b = oif.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
                String str2 = oinVar.c;
                if (str2 == null) {
                    throw new NullPointerException("Null fileId");
                }
                if (str == null) {
                    throw new NullPointerException("Null expectedChecksum");
                }
                acbVarA2.d = new oht(str2, str, strC);
                throw acbVarA2.a();
            }
        } catch (IOException e) {
            onb.g(e, "%s: Failed to validate download file %s", "FileValidator", nsp.e(oinVar));
            acb acbVarA3 = oig.a();
            acbVarA3.b = oif.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            acbVarA3.d = e;
            throw acbVarA3.a();
        }
    }

    public static boolean e(ayq ayqVar, Uri uri, String str) {
        return c(ayqVar, uri).equals(str);
    }
}
