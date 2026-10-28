package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gcq {
    public final gbg a;
    public final String b;
    public final String c;
    public final Class[] e;
    public volatile Method d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public gcq(gbg gbgVar, String str, String str2, Class... clsArr) {
        this.a = gbgVar;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        gbgVar.b.submit(new fsu(this, 5));
    }

    public final String a(byte[] bArr, String str) {
        return new String(this.a.d.b(bArr, str), gav.a);
    }
}
