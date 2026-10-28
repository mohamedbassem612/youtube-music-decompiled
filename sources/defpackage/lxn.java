package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lxn {
    public static final lxn a = new lxn(null);
    public final lzd b = new lzd();
    private boolean c;

    private lxn(byte[] bArr) {
        b();
        b();
    }

    public static int d(int i) {
        lzu lzuVar = lzu.a;
        lzv lzvVar = lzv.a;
        throw null;
    }

    public static void e(lxh lxhVar, int i, Object obj) {
        if (lzu.j != null) {
            throw null;
        }
        lxhVar.q(i, 3);
        ((lyp) obj).G(lxhVar);
        lxhVar.q(i, 4);
    }

    public final Iterator a() {
        return c() ? Collections.emptyIterator() : this.b.entrySet().iterator();
    }

    public final void b() {
        if (this.c) {
            return;
        }
        lzd lzdVar = this.b;
        int size = lzdVar.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((lzb) lzdVar.a(i)).a;
            if (obj instanceof lxt) {
                ((lxt) obj).C();
            }
        }
        if (!lzdVar.c) {
            lzdVar.c();
            Object[] objArr = lzdVar.a;
            if (objArr != null && lzdVar.b > 0) {
                Object obj2 = ((lzb) objArr[0]).c;
                throw null;
            }
            lzdVar.c = true;
        }
        this.c = true;
    }

    final boolean c() {
        return this.b.isEmpty();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        lxn lxnVar = new lxn();
        lzd lzdVar = this.b;
        if (lzdVar.size() <= 0) {
            return lxnVar;
        }
        lzb lzbVar = (lzb) lzdVar.a(0);
        Object obj = lzbVar.c;
        Object obj2 = lzbVar.a;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lxn) {
            lzd lzdVar = this.b;
            lzd lzdVar2 = ((lxn) obj).b;
            if (lzdVar.size() == lzdVar2.size() && lzdVar.keySet().equals(lzdVar2.keySet())) {
                for (Map.Entry entry : lzdVar.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    lzdVar2.get(key);
                    if (value != null) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        lzd lzdVar = this.b;
        if (lzdVar.size() <= 0) {
            return;
        }
        Object obj = ((lzb) lzdVar.a(0)).c;
        throw null;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    private lxn() {
    }
}
