package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tgn {
    public static final tgn a;
    public InputStream b;
    public ArrayList c;
    private final String d;
    private final String e;
    private ByteBuffer f;
    private byte[] g;

    static {
        tgn tgnVar = new tgn(null, "0");
        tgnVar.g = new byte[0];
        a = tgnVar;
    }

    public tgn(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public static long b(ArrayList arrayList) {
        long jRemaining = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            jRemaining += (long) ((ByteBuffer) arrayList.get(i)).remaining();
        }
        return jRemaining;
    }

    private final synchronized void j() {
        if (this.b == null) {
            return;
        }
        String str = this.e;
        long j = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (NumberFormatException unused) {
            }
        }
        awpr awprVar = j >= 0 ? new awpr((int) Math.min(j, 1048576L)) : new awpr(null);
        byte[] bArr = new byte[SemanticState.Modal];
        while (true) {
            try {
                int i = this.b.read(bArr);
                if (i == -1) {
                    this.b.close();
                    this.b = null;
                    this.f = awprVar.b();
                    return;
                }
                awprVar.write(bArr, 0, i);
            } catch (Throwable th) {
                this.b.close();
                throw th;
            }
        }
    }

    public final synchronized long a() {
        int iRemaining;
        byte[] bArr = this.g;
        if (bArr != null) {
            iRemaining = bArr.length;
        } else {
            ByteBuffer byteBuffer = this.f;
            if (byteBuffer == null) {
                ArrayList arrayList = this.c;
                if (arrayList != null) {
                    return b(arrayList);
                }
                String str = this.e;
                if (str != null) {
                    try {
                        return Long.parseLong(str);
                    } catch (NumberFormatException unused) {
                    }
                }
                return -1L;
            }
            iRemaining = byteBuffer.remaining();
        }
        return iRemaining;
    }

    public final synchronized InputStream c() {
        InputStream tpgVar;
        tpgVar = this.b;
        if (tpgVar == null) {
            tpgVar = new tpg(f());
        }
        return tpgVar;
    }

    public final synchronized String d() {
        return i();
    }

    public final synchronized ByteBuffer e() {
        ByteBuffer byteBufferF;
        byteBufferF = f();
        if (!byteBufferF.hasArray()) {
            byteBufferF = ByteBuffer.wrap(h());
        }
        return byteBufferF;
    }

    public final synchronized ByteBuffer f() {
        ByteBuffer byteBufferWrap;
        j();
        byte[] bArr = this.g;
        if (bArr != null) {
            byteBufferWrap = ByteBuffer.wrap(bArr);
        } else {
            ByteBuffer byteBuffer = this.f;
            if (byteBuffer != null) {
                byteBufferWrap = byteBuffer.duplicate();
            } else {
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    throw new IllegalStateException();
                }
                if (arrayList.isEmpty()) {
                    byte[] bArr2 = new byte[0];
                    this.g = bArr2;
                    this.c = null;
                    byteBufferWrap = ByteBuffer.wrap(bArr2);
                } else {
                    int size = this.c.size();
                    ArrayList arrayList2 = this.c;
                    if (size == 1) {
                        ByteBuffer byteBuffer2 = (ByteBuffer) arrayList2.get(0);
                        this.f = byteBuffer2;
                        this.c = null;
                        byteBufferWrap = byteBuffer2.duplicate();
                    } else {
                        long jB = b(arrayList2);
                        if (jB > 2147483647L) {
                            throw new IOException("Body too big");
                        }
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) jB);
                        for (int i = 0; i < this.c.size(); i++) {
                            byteBufferAllocate.put((ByteBuffer) this.c.get(i));
                        }
                        this.c = null;
                        byte[] bArrArray = byteBufferAllocate.array();
                        this.g = bArrArray;
                        byteBufferWrap = ByteBuffer.wrap(bArrArray);
                    }
                }
            }
        }
        return byteBufferWrap;
    }

    public final synchronized void g() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.b = null;
        this.c = null;
        this.f = null;
        this.g = null;
    }

    public final synchronized byte[] h() {
        byte[] bArr = this.g;
        if (bArr != null) {
            return bArr;
        }
        ByteBuffer byteBufferF = f();
        if (byteBufferF.hasArray() && byteBufferF.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferF.array();
            if (byteBufferF.limit() == bArrArray.length) {
                this.g = bArrArray;
                return bArrArray;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferF.remaining());
        byteBufferAllocate.put(byteBufferF);
        byte[] bArrArray2 = byteBufferAllocate.array();
        this.g = bArrArray2;
        this.f = null;
        return bArrArray2;
    }

    public final synchronized String i() {
        byte[] bArrArray;
        int iArrayOffset;
        int iRemaining;
        Charset charsetForName;
        ByteBuffer byteBufferE = e();
        bArrArray = byteBufferE.array();
        iArrayOffset = byteBufferE.arrayOffset() + byteBufferE.position();
        iRemaining = byteBufferE.remaining();
        String str = this.d;
        String str2 = !TextUtils.isEmpty(str) ? (String) new tga(str).a.get("charset".toLowerCase(Locale.ENGLISH)) : null;
        String str3 = true != TextUtils.isEmpty(str2) ? str2 : null;
        if (TextUtils.isEmpty(str3)) {
            charsetForName = tfs.a;
        } else {
            try {
                charsetForName = Charset.forName(str3);
            } catch (IllegalArgumentException e) {
                throw new IOException("Invalid charset: ".concat(String.valueOf(str3)), e);
            }
        }
        return new String(bArrArray, iArrayOffset, iRemaining, charsetForName);
    }
}
