package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ooe implements qqz, oyz {
    public final Executor a;
    public final HashMap b;
    public final HashMap c;
    private final onz d;
    private final omj e;

    public ooe(mbc mbcVar, Executor executor) {
        omj omjVar = new omj(mbcVar);
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = omjVar;
        this.a = new ahfg(executor);
        this.d = new onz(executor);
    }

    @Override // defpackage.qqz
    public final qqy a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.qqz
    public final qqy b(Uri uri) {
        synchronized (ooe.class) {
            String str = (String) this.b.get(uri);
            if (str == null) {
                return this.d.b(uri);
            }
            HashMap map = this.c;
            if (map.get(str) == null) {
                int i = onb.a;
                return null;
            }
            return (qqy) map.get(str);
        }
    }

    @Override // defpackage.oyz
    public final void e() {
        synchronized (ooe.class) {
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                int i = onb.a;
            }
            this.d.e();
        }
    }

    public final void g(String str, long j) {
        synchronized (ooe.class) {
            HashMap map = this.c;
            if (map.containsKey(str)) {
                ((qqo) map.get(str)).a.a(j);
            }
        }
    }

    public final void h(String str) {
        synchronized (ooe.class) {
            this.c.remove(str);
        }
    }

    public final void i(String str) {
        synchronized (ooe.class) {
            HashMap map = this.c;
            if (!map.containsKey(str)) {
                map.put(str, new qqo(new ood(this, str), new oof(this.e, 1), 1000L, TimeUnit.MILLISECONDS));
            }
        }
    }

    @Override // defpackage.oyz
    public final void c() {
    }

    @Override // defpackage.oyz
    public final void d() {
    }

    @Override // defpackage.qqz
    public final void f() {
    }
}
