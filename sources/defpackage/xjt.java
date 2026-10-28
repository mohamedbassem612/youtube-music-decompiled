package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class xjt implements xjq {
    private final String a;
    private final agfr b;
    private final agfr c;
    private final Map d;
    private final Set e;
    private String f;
    private xjs g;
    private Set h;
    private Set i;
    private boolean j;
    private final awmd k;
    private final vyo l;
    private final mbc m;
    private final tqj n;
    private final int o;
    private jij p;
    private final kro q;

    public xjt(String str, xkd xkdVar) {
        agfr agfrVarAl = aguu.al(new wkw(xkdVar, 17));
        agfr agfrVarAl2 = aguu.al(new xjr(0));
        kro kroVar = new kro();
        awmd awmdVar = xkdVar.d;
        vyo vyoVar = xkdVar.e;
        tqj tqjVar = xkdVar.f;
        mbc mbcVar = xkdVar.c;
        this.a = str;
        this.q = kroVar;
        this.c = agfrVarAl2;
        this.b = agfrVarAl;
        this.k = awmdVar;
        this.l = vyoVar;
        this.n = tqjVar;
        this.m = mbcVar;
        this.e = new HashSet();
        this.d = new HashMap();
        k(this);
        this.o = agfe.a.nextInt();
    }

    private static int j(vyo vyoVar) {
        amuh amuhVar = vyoVar.b().n;
        if (amuhVar == null) {
            amuhVar = amuh.a;
        }
        akja akjaVar = amuhVar.e;
        if (akjaVar == null) {
            akjaVar = akja.a;
        }
        return akjaVar.d;
    }

    private static void k(Object obj) {
        int i;
        String name = obj.getClass().getName();
        int iIndexOf = name.indexOf(36);
        if (iIndexOf < 0 || (i = iIndexOf + 1) >= name.length()) {
            obj.getClass().getSimpleName();
        } else {
            name.substring(i);
        }
    }

    @Override // defpackage.xjq
    public final gdk a() {
        if (!i()) {
            return null;
        }
        Optional optional = (Optional) this.c.io();
        hkp hkpVar = new hkp(this, 17);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            ((xjt) hkpVar.a).f("mod_li", true != ((Boolean) obj).booleanValue() ? "0" : "1");
        }
        f("conn", String.valueOf(this.b.io()));
        return this.g;
    }

    @Override // defpackage.xjq
    public final void b(xjm xjmVar) {
        xjt xjtVar = (xjt) xjmVar.a;
        k(xjtVar);
        if (!xjtVar.i() || xjtVar.j || !i() || this.j) {
            return;
        }
        Object obj = xjtVar.p.c;
        this.e.addAll(xjtVar.e);
        xjs xjsVar = xjtVar.g;
        long jLongValue = ((Long) obj).longValue();
        xjs xjsVar2 = this.g;
        jij jijVarD = xjsVar2.d(jLongValue);
        for (jij jijVar : xjsVar.a) {
            xjsVar2.e(jijVarD, ((Long) jijVar.c).longValue(), (String) jijVar.a);
        }
        Map mapB = xjsVar.b();
        if (mapB != null && !mapB.isEmpty()) {
            for (Map.Entry entry : mapB.entrySet()) {
                xjsVar2.c((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.p = jijVarD;
    }

    @Override // defpackage.xjq
    public final void c() {
        this.j = true;
    }

    @Override // defpackage.xjq
    public final void d(tas tasVar, Set set, Set set2) {
        if (i()) {
            return;
        }
        k(tasVar);
        this.h = set;
        this.i = set2;
        xjs xjsVar = new xjs(this.a, this.k, this.m, this.n);
        this.g = xjsVar;
        this.p = xjsVar.d(tasVar.d());
        this.f = tasVar.d;
        f("yt_lt", "warm");
    }

    @Override // defpackage.xjq
    public final void e(String str) {
        xjs xjsVar = this.g;
        xjsVar.b = str;
        xjsVar.d = xjl.c(str, xjsVar.c);
    }

    @Override // defpackage.xjq
    public final void f(String str, String str2) {
        if (i()) {
            this.g.c(str, str2);
        }
    }

    @Override // defpackage.xjq
    public final boolean g() {
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0096, please report this as an issue */
    @Override // defpackage.xjq
    public final boolean h(tas tasVar) {
        Map map;
        agke agkeVar;
        if (!i()) {
            return false;
        }
        boolean z = tasVar instanceof tat;
        String str = tasVar.d;
        Class<?> cls = tasVar.getClass();
        if (!z && this.e.contains(str)) {
            TextUtils.equals(this.f, str);
        } else if (this.k.io() instanceof xjc) {
            tqj tqjVar = this.n;
            vyo vyoVar = this.l;
            int i = tqr.a;
            if (tqjVar.k(1073808347) && vyoVar.c == null) {
                agkeVar = agpi.a;
            } else {
                amuh amuhVar = vyoVar.b().n;
                if (amuhVar == null) {
                    amuhVar = amuh.a;
                }
                akja akjaVar = amuhVar.e;
                if (akjaVar == null) {
                    akjaVar = akja.a;
                }
                agkeVar = (agke) Collection.EL.stream(akjaVar.e).map(new xjh(5)).collect(aghu.a);
            }
            if (agkeVar.contains(str) && j(vyoVar) != 0 && this.o % j(vyoVar) != 0) {
                f("debug_ticks_excluded", "1");
            } else if (!TextUtils.isEmpty(str)) {
                if (z) {
                    map = this.d;
                    if (map.containsKey(str)) {
                        int iIntValue = ((Integer) map.get(str)).intValue();
                        map.put(str, Integer.valueOf(iIntValue + 1));
                        str = str + '_' + iIntValue;
                    } else {
                        map.put(str, 1);
                    }
                }
                if (this.g.e(this.p, tasVar.d(), str)) {
                    this.e.add(str);
                }
            }
        } else if (!TextUtils.isEmpty(str)) {
            if (z) {
                map = this.d;
                if (map.containsKey(str)) {
                    int iIntValue2 = ((Integer) map.get(str)).intValue();
                    map.put(str, Integer.valueOf(iIntValue2 + 1));
                    str = str + '_' + iIntValue2;
                } else {
                    map.put(str, 1);
                }
            }
            if (this.g.e(this.p, tasVar.d(), str)) {
                this.e.add(str);
            }
        }
        this.j |= this.i.contains(cls) && this.e.size() > 1;
        boolean z2 = this.h.contains(cls) && this.e.size() > 1;
        if (this.i.contains(cls)) {
            k(tasVar);
        }
        if (this.h.contains(cls)) {
            k(tasVar);
        }
        return z2 || this.j;
    }

    public final boolean i() {
        return (this.g == null || this.p == null) ? false : true;
    }
}
