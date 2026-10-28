package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.LongSupplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class zfx implements zgn {
    private final mbc a;
    private final long b;
    private final LongSupplier c;
    private final List d = new ArrayList();
    private final List e = new ArrayList();

    public zfx(mbc mbcVar, long j, LongSupplier longSupplier) {
        this.a = mbcVar;
        this.b = j;
        this.c = longSupplier;
    }

    private final long e() {
        return yno.cB(this.a, this.b);
    }

    private final synchronized String f() {
        StringBuilder sb;
        sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.d;
            if (i < list.size()) {
                if (i != 0) {
                    sb.append(',');
                }
                sb.append(String.format(Locale.US, "%s:%s:%s", yno.cF(((Long) this.e.get(i)).longValue()), yno.cF(((Long) list.get(i)).longValue()), yno.cF(this.c.getAsLong())));
                i++;
            }
        }
        return sb.toString();
    }

    private final synchronized void g() {
        this.d.clear();
        this.e.clear();
    }

    @Override // defpackage.zgn
    public final synchronized int a() {
        if (this.d.isEmpty()) {
            return 0;
        }
        return f().length() + 5;
    }

    final synchronized long b() {
        List list = this.e;
        if (list.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return e() - ((Long) list.get(list.size() - 1)).longValue();
    }

    @Override // defpackage.zgn
    public final synchronized void c(zhg zhgVar) {
        if (!this.d.isEmpty()) {
            zhgVar.d("e2el", f());
            g();
        }
    }

    public final synchronized void d(long j) {
        this.d.add(Long.valueOf(j));
        this.e.add(Long.valueOf(e()));
    }
}
