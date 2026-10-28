package defpackage;

import android.util.Base64;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class txp {
    public final int a;
    public final int b;
    public final int c;
    private final tqj d;
    private final dov e;

    public txp(dov dovVar, tqj tqjVar) {
        this.e = dovVar;
        this.d = tqjVar;
        int i = tqr.a;
        this.a = tqjVar.a(1074011982);
        this.b = tqjVar.a(1074011986);
        this.c = tqjVar.a(1074011990);
    }

    public final String a() {
        return this.e.af(12);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    public final String b(int i) {
        int i2 = tqr.a;
        boolean zK = this.d.k(73562);
        dov dovVar = this.e;
        if (!zK) {
            return dovVar.af(i);
        }
        byte[] bArr = new byte[i];
        ((Random) dovVar.a.io()).nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
