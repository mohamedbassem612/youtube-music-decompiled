package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class xjp implements xjq {
    public static long a = -1;
    public static Set b = agpr.a;
    static final AtomicBoolean c = new AtomicBoolean();
    private final Set d = new HashSet();
    private final String e;
    private Map f;
    private String g;
    private xjo h;
    private Set i;
    private Set j;
    private boolean k;
    private final xkd l;
    private jij m;

    public xjp(String str, xkd xkdVar) {
        this.e = str;
        this.l = xkdVar;
    }

    private static void j(Object obj) {
        k(obj.getClass());
    }

    private static void k(Class cls) {
        int i;
        String name = cls.getName();
        int iIndexOf = name.indexOf(36);
        if (iIndexOf < 0 || (i = iIndexOf + 1) >= name.length()) {
            cls.getSimpleName();
        } else {
            name.substring(i);
        }
    }

    @Override // defpackage.xjq
    public final gdk a() {
        if (!i()) {
            return null;
        }
        f("conn", String.valueOf(this.l.e().a()));
        return this.h;
    }

    @Override // defpackage.xjq
    public final void b(xjm xjmVar) {
        xjp xjpVar = (xjp) xjmVar.a;
        k(xjm.class);
        j(xjpVar);
        if (!xjpVar.i() || xjpVar.k || !i() || this.k) {
            return;
        }
        Object obj = xjpVar.m.c;
        this.d.addAll(xjpVar.d);
        xjo xjoVar = xjpVar.h;
        long jLongValue = ((Long) obj).longValue();
        xjo xjoVar2 = this.h;
        jij jijVarD = xjoVar2.d(jLongValue);
        for (jij jijVar : xjoVar.a) {
            xjoVar2.e(jijVarD, ((Long) jijVar.c).longValue(), (String) jijVar.a);
        }
        Map mapB = xjoVar.b();
        if (mapB != null && !mapB.isEmpty()) {
            for (Map.Entry entry : mapB.entrySet()) {
                xjoVar2.c((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.m = jijVarD;
    }

    @Override // defpackage.xjq
    public final void c() {
        k(xjm.class);
        this.k = true;
    }

    @Override // defpackage.xjq
    public final void d(tas tasVar, Set set, Set set2) {
        if (i()) {
            k(xjm.class);
            return;
        }
        k(xjm.class);
        j(tasVar);
        this.i = set;
        this.j = set2;
        xkd xkdVar = this.l;
        int i = tqr.a;
        xjo xjoVar = new xjo(this.e, xkdVar, xkdVar.f.k(1073814159));
        this.h = xjoVar;
        this.m = xjoVar.d(tasVar.d());
        this.g = tasVar.d;
        f("yt_lt", "warm");
    }

    @Override // defpackage.xjq
    public final void e(String str) {
        xjo xjoVar = this.h;
        xjoVar.getClass();
        xjoVar.b = str;
    }

    @Override // defpackage.xjq
    public final void f(String str, String str2) {
        if (i()) {
            xjo xjoVar = this.h;
            xjoVar.getClass();
            xjoVar.c(str, str2);
        }
    }

    @Override // defpackage.xjq
    public final boolean g() {
        return this.k;
    }

    @Override // defpackage.xjq
    public final boolean h(tas tasVar) {
        if (!i()) {
            k(xjm.class);
            return false;
        }
        boolean z = tasVar instanceof tat;
        String str = tasVar.d;
        Class<?> cls = tasVar.getClass();
        if (z || !this.d.contains(str)) {
            if (a < 0 && c.compareAndSet(false, true)) {
                a = 0L;
                xkd xkdVar = this.l;
                int i = tqr.a;
                if (!xkdVar.f.k(1073814159)) {
                    xkdVar.e.c(new xdx(2)).af(new vqe(15));
                }
            }
            if (a > 0 && b.contains(str) && ((long) ThreadLocalRandom.current().nextInt(Alert.DURATION_SHOW_INDEFINITELY)) % a != 0) {
                f("debug_ticks_excluded", "1");
                k(xjm.class);
            } else if (TextUtils.isEmpty(str)) {
                k(xjm.class);
            } else {
                if (z) {
                    Map map = this.f;
                    if (map == null) {
                        map = new HashMap();
                    }
                    this.f = map;
                    Integer num = (Integer) map.get(str);
                    Map map2 = this.f;
                    if (num != null) {
                        map2.put(str, Integer.valueOf(num.intValue() + 1));
                        str = str + '_' + num;
                    } else {
                        map2.put(str, 1);
                    }
                }
                if (this.h.e(this.m, tasVar.d(), str)) {
                    this.d.add(str);
                } else {
                    k(xjm.class);
                }
            }
        } else if (!TextUtils.equals(this.g, str)) {
            k(xjm.class);
        }
        this.k |= this.j.contains(cls) && this.d.size() > 1;
        boolean z2 = this.i.contains(cls) && this.d.size() > 1;
        if (this.j.contains(cls)) {
            k(xjm.class);
            j(tasVar);
        }
        if (this.i.contains(cls)) {
            k(xjm.class);
            j(tasVar);
        }
        return z2 || this.k;
    }

    public final boolean i() {
        return (this.h == null || this.m == null) ? false : true;
    }
}
