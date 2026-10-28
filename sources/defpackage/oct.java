package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oct {
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

    public final String a(byte[] bArr, String str) {
        return new String(b(bArr, str), a);
    }

    public final byte[] b(byte[] bArr, String str) throws ocs {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrBo = qnl.bo(str);
            int length2 = bArrBo.length;
            if (length2 <= 16) {
                throw new ocs();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrBo);
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
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new ocs(e);
        }
    }
}
