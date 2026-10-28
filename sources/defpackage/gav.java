package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gav {
    public static final Charset a = StandardCharsets.UTF_8;
    private static Cipher b = null;
    private static final Object c = new Object();
    private static final Object d = new Object();

    private static final Cipher c() {
        Cipher cipher;
        synchronized (d) {
            cipher = b;
            if (cipher == null) {
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                b = cipher;
            }
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) throws gau {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (c) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e) {
            throw new gau(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new gau(e2);
        } catch (BadPaddingException e3) {
            throw new gau(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new gau(e4);
        } catch (NoSuchPaddingException e5) {
            throw new gau(e5);
        }
    }

    public final byte[] b(byte[] bArr, String str) throws gau {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrAW = kro.aW(str);
            int length2 = bArrAW.length;
            if (length2 <= 16) {
                throw new gau();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrAW);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (c) {
                try {
                    c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    bArrDoFinal = c().doFinal(bArr3);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new gau(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new gau(e2);
        } catch (InvalidKeyException e3) {
            throw new gau(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new gau(e4);
        } catch (BadPaddingException e5) {
            throw new gau(e5);
        } catch (IllegalBlockSizeException e6) {
            throw new gau(e6);
        } catch (NoSuchPaddingException e7) {
            throw new gau(e7);
        }
    }
}
