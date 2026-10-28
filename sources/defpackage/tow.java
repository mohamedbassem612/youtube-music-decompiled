package defpackage;

import android.util.LruCache;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tow implements tdz, tmo {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final vwp c;
    private final LruCache d;
    private final mbc e;

    public tow(mbc mbcVar, int i, vwp vwpVar) {
        this.e = mbcVar;
        this.d = new tov(this, i);
        this.c = vwpVar;
        if (vwpVar != null) {
            vwpVar.e(i);
        }
    }

    @Override // defpackage.tmo
    public final synchronized int b() {
        return this.d.size();
    }

    @Override // defpackage.tmo
    public final synchronized tmr d(String str) {
        return (tmr) this.d.get(str);
    }

    @Override // defpackage.tmo
    public final synchronized void e() {
        this.a.clear();
        this.b.clear();
        vwp vwpVar = this.c;
        if (vwpVar != null) {
            vwpVar.b(this.d.size());
        }
        this.d.evictAll();
    }

    @Override // defpackage.tmo
    public final synchronized void f() {
    }

    @Override // defpackage.tmo
    public final synchronized void g(String str, boolean z) {
        LruCache lruCache = this.d;
        if (z) {
            lruCache.remove(str);
            return;
        }
        tmr tmrVar = (tmr) lruCache.get(str);
        if (tmrVar != null) {
            aftj aftjVar = new aftj(tmrVar);
            tms tmsVar = new tms(tmrVar.b);
            tmsVar.f(0L);
            aftjVar.j(tmsVar.a());
            lruCache.put(str, aftjVar.i());
        }
    }

    @Override // defpackage.tmo
    public final synchronized void h(String str, tmr tmrVar) {
        this.d.put(str, tmrVar);
    }

    @Override // defpackage.tmo
    public final synchronized void i(String str) {
        this.d.remove(str);
    }

    @Override // defpackage.tmo
    public final boolean j() {
        return false;
    }

    @Override // defpackage.tdz
    public final /* synthetic */ Object jC() {
        return nsi.l(this);
    }

    @Override // defpackage.tdz
    public final void jz() {
        e();
    }

    @Override // defpackage.tmo
    public final synchronized void k(String str, Function function) {
        LruCache lruCache = this.d;
        tmr tmrVar = (tmr) lruCache.get(str);
        if (tmrVar != null) {
            mbc mbcVar = this.e;
            tmt tmtVar = tmrVar.b;
            if (!tmtVar.b(mbcVar)) {
                tmt tmtVar2 = (tmt) function.apply(tmtVar);
                aftj aftjVar = new aftj(tmrVar);
                aftjVar.j(tmtVar2);
                lruCache.put(str, aftjVar.i());
            }
        }
    }

    public final synchronized void l(String str, String str2) {
        Map map = this.a;
        String str3 = (String) map.put(str, str2);
        if (str3 != null && !str3.equals(str2)) {
            this.b.remove(str3);
        }
        String str4 = (String) this.b.put(str2, str);
        if (str4 != null && !str4.equals(str)) {
            map.remove(str4);
        }
    }
}
