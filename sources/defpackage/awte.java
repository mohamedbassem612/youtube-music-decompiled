package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awte implements Iterator, awrp {
    final /* synthetic */ awsu a;
    private int b = -1;
    private int c;
    private int d;
    private awsa e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, java.lang.Object] */
    public awte(awsu awsuVar) {
        this.a = awsuVar;
        int iH = awro.h(0, 0, awsuVar.b.length());
        this.c = iH;
        this.d = iH;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    private final void a() {
        Object objInvoke;
        int i = this.d;
        if (i < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        awsu awsuVar = this.a;
        ?? r3 = awsuVar.b;
        if (i <= r3.length() && (objInvoke = awsuVar.a.invoke(r3, Integer.valueOf(this.d))) != null) {
            awml awmlVar = (awml) objInvoke;
            int iIntValue = ((Number) awmlVar.a).intValue();
            int iIntValue2 = ((Number) awmlVar.b).intValue();
            this.e = awro.l(this.c, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.c = i2;
            this.d = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.e = new awsa(this.c, awrc.o(r3));
            this.d = -1;
        }
        this.b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        awsa awsaVar = this.e;
        awsaVar.getClass();
        this.e = null;
        this.b = -1;
        return awsaVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
