package defpackage;

import j$.net.URLEncoder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class tgd {
    public final long b;
    public final String c;

    protected tgd(long j, String str) {
        this.b = Math.max(j, -1L);
        this.c = str;
    }

    public static tgd d(Map map, Charset charset) {
        if (charset == null) {
            charset = tfs.a;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), charset));
            sb.append('=');
            sb.append(URLEncoder.encode((String) entry.getValue(), charset));
        }
        return e(sb.toString().getBytes(charset), "application/x-www-form-urlencoded");
    }

    public static tgd e(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        return new tgb(bArr, bArr.length, str);
    }

    public abstract InputStream a();

    public ByteBuffer b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return ByteBuffer.wrap(bArrC);
        }
        return null;
    }

    public byte[] c() {
        throw null;
    }

    public final boolean f() {
        return this.b == -1;
    }
}
