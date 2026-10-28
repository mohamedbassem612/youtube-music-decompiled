package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byi {
    public final Uri a;
    public final long b;
    public final String c;
    public final int d;
    public final byte[] e;
    public final Map f;

    @Deprecated
    public final long g;
    public final long h;
    public final long i;
    public final String j;
    public final int k;
    public final Object l;

    static {
        bst.b("media3.datasource");
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean, int] */
    public byi(Uri uri, long j, String str, int i, byte[] bArr, Map map, long j2, long j3, String str2, int i2, Object obj) {
        long j4;
        long j5 = j + j2;
        ahno.F(((j5 > 0L ? 1 : (j5 == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        ahno.F(((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        boolean z = true;
        if (j3 <= 0) {
            j4 = -1;
            if (j3 != -1) {
                z = false;
                j4 = j3;
            }
        } else {
            j4 = j3;
        }
        ahno.F(z);
        uri.getClass();
        this.a = uri;
        this.c = str;
        this.b = j;
        this.d = i;
        byte[] bArr2 = null;
        if (bArr != null && bArr.length != 0) {
            bArr2 = bArr;
        }
        this.e = bArr2;
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.h = j2;
        this.g = j5;
        this.i = j4;
        this.j = str2;
        this.k = i2;
        this.l = obj;
    }

    public static String e(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final byi a(long j) {
        long j2 = this.i;
        return b(j, j2 != -1 ? j2 - j : -1L);
    }

    public final byi b(long j, long j2) {
        long j3 = 0;
        if (j != 0) {
            j3 = j;
        } else if (this.i == j2) {
            return this;
        }
        return new byi(this.a, this.b, this.c, this.d, this.e, this.f, this.h + j3, j2, this.j, this.k, this.l);
    }

    public final byi c(Uri uri) {
        return new byi(uri, this.b, this.c, this.d, this.e, this.f, this.h, this.i, this.j, this.k, this.l);
    }

    public final String d() {
        return e(this.d);
    }

    public final boolean f(int i) {
        return (this.k & i) == i;
    }

    public final String toString() {
        String str = this.c;
        Uri uri = this.a;
        String strD = d();
        String string = uri.toString();
        String strConcat = str != null ? ", location=".concat(str) : "";
        int i = this.k;
        String str2 = this.j;
        long j = this.i;
        return "DataSpec[" + strD + ' ' + string + ", " + this.h + ", " + j + ", " + str2 + ", " + i + strConcat + ']';
    }

    @Deprecated
    public byi(Uri uri, long j, long j2, String str) {
        this(uri, 0L, null, 1, null, Collections.EMPTY_MAP, j, j2, str, 0, null);
    }
}
