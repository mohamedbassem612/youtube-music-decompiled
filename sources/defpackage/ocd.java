package defpackage;

import android.util.Base64;
import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ocd {
    private MessageDigest a;
    private final Object b = new Object();
    private boolean c = false;
    private SecureRandom d;
    private final omj e;

    public ocd(omj omjVar) {
        this.e = omjVar;
    }

    public final void a() {
        if (c()) {
            return;
        }
        b(new SecureRandom());
    }

    final synchronized void b(SecureRandom secureRandom) {
        ofb ofbVarH = this.e.h(202);
        try {
            try {
                try {
                    ofbVarH.c();
                    this.d = secureRandom;
                    this.a = MessageDigest.getInstance("MD5");
                    this.c = true;
                } catch (Throwable th) {
                    ofbVarH.b(th);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e) {
                ofbVarH.b(e);
            }
            ofbVarH.a();
        } catch (Throwable th2) {
            ofbVarH.a();
            throw th2;
        }
    }

    public final synchronized boolean c() {
        return this.c;
    }

    public final byte[] d(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.b) {
            this.a.reset();
            this.a.update(bArr);
            bArrDigest = this.a.digest();
        }
        return bArrDigest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final byte[] e(byte[] bArr, String str, boolean z) {
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            throw new IllegalArgumentException();
        }
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i + 1).put((byte) length);
        if (length < i) {
            int i2 = i - length;
            byte[] bArr2 = new byte[i2];
            this.d.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i2);
            System.arraycopy(bArr2, 0, bArr, length, i2);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z) {
            bArrArray = ByteBuffer.allocate(SemanticState.Hidden).put(d(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[SemanticState.Hidden];
        Object[] objArr = new ocr().cK;
        int length2 = objArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            objArr[i3].a(bArrArray, bArr3);
        }
        if (!ahno.aa(str)) {
            byte[] bytes = str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8);
            byte[] bArr4 = new byte[SemanticState.Hidden];
            for (int i4 = 0; i4 < 256; i4++) {
                bArr4[i4] = (byte) i4;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < 256; i6++) {
                byte b = bArr4[i6];
                i5 = (i5 + b + bytes[i6 % bytes.length]) & 255;
                bArr4[i6] = bArr4[i5];
                bArr4[i5] = b;
            }
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < 256; i9++) {
                i7 = (i7 + 1) & 255;
                byte b2 = bArr4[i7];
                i8 = (i8 + b2) & 255;
                bArr4[i7] = bArr4[i8];
                bArr4[i8] = b2;
                bArr3[i9] = (byte) (bArr3[i9] ^ bArr4[(bArr4[i7] + b2) & 255]);
            }
        }
        return bArr3;
    }

    public final String f(int i, String str) {
        fxg fxgVar = (fxg) fxl.a.createBuilder();
        fxgVar.copyOnWrite();
        fxl fxlVar = (fxl) fxgVar.instance;
        fxlVar.b |= 524288;
        fxlVar.q = i;
        return Base64.encodeToString(e(((fxl) fxgVar.build()).toByteArray(), str, true), 11);
    }

    public final aihf g(byte[] bArr, String str) {
        aihf aihfVarCreateBuilder = fxp.a.createBuilder();
        byte[] bArrD = d(bArr);
        aigj aigjVar = aigj.d;
        try {
            aigj aigjVarH = aigj.H(bArrD, 0, bArrD.length);
            aihfVarCreateBuilder.copyOnWrite();
            fxp fxpVar = (fxp) aihfVarCreateBuilder.instance;
            aigjVarH.getClass();
            fxpVar.b |= 1;
            fxpVar.d = aigjVarH;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int length = bArr.length;
                if (i >= ((length - 1) / 255) + 1) {
                    break;
                }
                int i2 = i * 255;
                int i3 = i2 + 255;
                if (length > i3) {
                    length = i3;
                }
                arrayList.add(Arrays.copyOfRange(bArr, i2, length));
                i++;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    aihfVarCreateBuilder.A(aigj.H(e((byte[]) it.next(), str, false), 0, SemanticState.Hidden));
                } catch (aiik e) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            }
            return aihfVarCreateBuilder;
        } catch (aiik e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }
}
