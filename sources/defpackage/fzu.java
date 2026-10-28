package defpackage;

import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fzu {
    static final Charset a = StandardCharsets.UTF_8;
    static boolean b = false;
    public static MessageDigest c = null;
    private static final Object e = new Object();
    private static final Object f = new Object();
    public static final CountDownLatch d = new CountDownLatch(1);

    static void a() {
        synchronized (f) {
            if (!b) {
                b = true;
                new Thread(new gkz(1)).start();
            }
        }
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (e) {
            a();
            MessageDigest messageDigest2 = null;
            try {
                if (d.await(2L, TimeUnit.SECONDS) && (messageDigest = c) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = c.digest();
        }
        return bArrDigest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] c(byte[] bArr, String str, boolean z) {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = f().toByteArray();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b2 = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i2).put(b2).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i2).put(b2).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(SemanticState.Hidden).put(b(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[SemanticState.Hidden];
        Object[] objArr = new ocr(null).cK;
        int length3 = objArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            objArr[i3].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            byte[] bytes = str.getBytes(a);
            byte[] bArr4 = new byte[SemanticState.Hidden];
            for (int i4 = 0; i4 < 256; i4++) {
                bArr4[i4] = (byte) i4;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < 256; i6++) {
                byte b3 = bArr4[i6];
                i5 = (i5 + b3 + bytes[i6 % bytes.length]) & 255;
                bArr4[i6] = bArr4[i5];
                bArr4[i5] = b3;
            }
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < 256; i9++) {
                i7 = (i7 + 1) & 255;
                byte b4 = bArr4[i7];
                i8 = (i8 + b4) & 255;
                bArr4[i7] = bArr4[i8];
                bArr4[i8] = b4;
                bArr3[i9] = (byte) (bArr3[i9] ^ bArr4[(bArr4[i7] + b4) & 255]);
            }
        }
        return bArr3;
    }

    static Vector d(byte[] bArr) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i = length + 254;
        Vector vector = new Vector();
        for (int i2 = 0; i2 < i / 255; i2++) {
            int i3 = i2 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i3 > 255) {
                    length2 = i3 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i3, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static aihf e(byte[] bArr, String str) {
        Vector vectorD = d(bArr);
        if (vectorD == null || vectorD.isEmpty()) {
            return null;
        }
        aihf aihfVarCreateBuilder = fxp.a.createBuilder();
        int size = vectorD.size();
        for (int i = 0; i < size; i++) {
            byte[] bArrC = c((byte[]) vectorD.get(i), str, false);
            aigj aigjVar = aigj.d;
            try {
                aihfVarCreateBuilder.A(aigj.H(bArrC, 0, SemanticState.Hidden));
            } catch (aiik e2) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
            }
        }
        byte[] bArrB = b(bArr);
        aigj aigjVar2 = aigj.d;
        try {
            aigj aigjVarH = aigj.H(bArrB, 0, bArrB.length);
            aihfVarCreateBuilder.copyOnWrite();
            fxp fxpVar = (fxp) aihfVarCreateBuilder.instance;
            aigjVarH.getClass();
            fxpVar.b |= 1;
            fxpVar.d = aigjVarH;
            return aihfVarCreateBuilder;
        } catch (aiik e3) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e3);
        }
    }

    static fxl f() {
        fxg fxgVar = (fxg) fxl.a.createBuilder();
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        fxlVar.b |= 524288;
        fxlVar.q = 4096L;
        return (fxl) fxgVar.build();
    }
}
