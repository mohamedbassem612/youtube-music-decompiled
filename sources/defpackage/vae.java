package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.AssetDetail;
import com.google.research.xeno.effect.Effect;
import internal.org.jni_zero.CommonApis;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vae implements vab, vaj {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/selection/EffectsProviderImpl");
    public static final uzj b;
    private final awku A;
    private final AtomicInteger B;
    private boolean C;
    private volatile boolean D;
    private final awku E;
    private yhi F;
    private volatile yno G;
    private volatile yno H;
    public volatile uys c;
    public volatile boolean d;
    public volatile uyq e;
    public final Set f;
    public Consumer g;
    public final Map h;
    public volatile List i;
    public String j;
    public ardj k;
    public final Object l;
    public xpl m;
    public yno n;
    private volatile uyv o;
    private volatile boolean p;
    private final Set q;
    private final Set r;
    private final Set s;
    private final Map t;
    private final avmm u;
    private uxd v;
    private volatile uxn w;
    private String x;
    private final HashMap y;
    private ardj z;

    static {
        avbm avbmVarA = uzj.a();
        avbmVarA.i = ajhv.a;
        b = avbmVarA.a();
    }

    public vae() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.o = null;
        this.c = null;
        new AtomicBoolean(false);
        this.p = true;
        this.d = true;
        this.H = null;
        this.e = null;
        this.G = null;
        new HashSet();
        this.q = new HashSet();
        new HashSet();
        this.r = new HashSet();
        new HashSet();
        this.f = new HashSet();
        this.s = new HashSet();
        this.g = null;
        this.h = new HashMap();
        new HashMap();
        this.t = new EnumMap(ardj.class);
        this.u = new avmm();
        this.F = null;
        this.v = null;
        this.w = null;
        this.m = null;
        this.n = null;
        this.i = null;
        this.j = null;
        this.x = null;
        this.k = null;
        this.y = new HashMap();
        this.z = null;
        this.l = new Object();
        this.A = new awku();
        this.B = new AtomicInteger(0);
        this.C = true;
        awku awkuVar = new awku();
        this.E = awkuVar;
        new HashMap();
        new HashSet();
        executorServiceNewSingleThreadExecutor.getClass();
        awkuVar.kk(agke.q(b));
    }

    private final uzj B(String str, String str2, uyr uyrVar) {
        atte atteVar = uyrVar.e;
        if (atteVar == null) {
            atteVar = atte.a;
        }
        List list = this.i;
        uxp uxpVarA = uxp.a(null, str);
        int i = 1;
        if (uxpVarA == null) {
            ajhv ajhvVar = uyrVar.b;
            if (ajhvVar != null) {
                AssetDetail defaultInstance = ajhvVar.d;
                if (defaultInstance == null) {
                    defaultInstance = AssetDetail.getDefaultInstance();
                }
                int iG = CommonApis.g(defaultInstance.d);
                if (iG != 0) {
                    i = iG;
                }
            }
            Effect effect = uyrVar.a;
            avbm avbmVarA = uzj.a();
            avbmVarA.g = effect;
            avbmVarA.c(yno.fR(str, str2, i));
            avbmVarA.f = yno.fK(str2, i);
            avbmVarA.i = ajhvVar;
            avbmVarA.d = uyrVar.c;
            avbmVarA.b(uyrVar.d);
            avbmVarA.d(atteVar);
            avbmVarA.a = uyrVar.f;
            return avbmVarA.a();
        }
        Effect effect2 = uyrVar.a;
        avbm avbmVarA2 = uzj.a();
        avbmVarA2.g = effect2;
        boolean z = this.D;
        aihf aihfVarCreateBuilder = apsr.a.createBuilder();
        String str3 = "NORMAL";
        String lowerCase = "NORMAL".toLowerCase(Locale.ENGLISH);
        if (!uxpVarA.d()) {
            str3 = uxpVarA.a;
            lowerCase = uxpVarA.b;
        }
        if (z) {
            aihf aihfVarCreateBuilder2 = apsz.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            apsz apszVar = (apsz) aihfVarCreateBuilder2.instance;
            str3.getClass();
            apszVar.b |= 2;
            apszVar.d = str3;
            aihfVarCreateBuilder2.copyOnWrite();
            apsz apszVar2 = (apsz) aihfVarCreateBuilder2.instance;
            lowerCase.getClass();
            apszVar2.b |= 1;
            apszVar2.c = lowerCase;
            apsz apszVar3 = (apsz) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            apsr apsrVar = (apsr) aihfVarCreateBuilder.instance;
            apszVar3.getClass();
            apsrVar.c = apszVar3;
            apsrVar.b = 1;
        } else {
            aihf aihfVarCreateBuilder3 = apsg.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            apsg apsgVar = (apsg) aihfVarCreateBuilder3.instance;
            str3.getClass();
            apsgVar.b |= 1;
            apsgVar.c = str3;
            aihfVarCreateBuilder3.copyOnWrite();
            apsg apsgVar2 = (apsg) aihfVarCreateBuilder3.instance;
            lowerCase.getClass();
            apsgVar2.b |= 2;
            apsgVar2.d = lowerCase;
            apsg apsgVar3 = (apsg) aihfVarCreateBuilder3.build();
            aihfVarCreateBuilder.copyOnWrite();
            apsr apsrVar2 = (apsr) aihfVarCreateBuilder.instance;
            apsgVar3.getClass();
            apsrVar2.c = apsgVar3;
            apsrVar2.b = 2;
        }
        aihf aihfVarCreateBuilder4 = asjv.a.createBuilder();
        aihfVarCreateBuilder4.cz((apsr) aihfVarCreateBuilder.build());
        avbmVarA2.c((asjv) aihfVarCreateBuilder4.build());
        avbmVarA2.i = uyrVar.b;
        avbmVarA2.d = uyrVar.c;
        avbmVarA2.b(uyrVar.d);
        avbmVarA2.d(atteVar);
        avbmVarA2.a = uyrVar.f;
        return avbmVarA2.a();
    }

    private final String C(String str) {
        String str2;
        return (str == null || (str2 = (String) this.y.get(str)) == null) ? "" : str2;
    }

    private final void D() {
        if (this.C) {
            this.B.incrementAndGet();
            this.A.kk(vbl.b);
        }
    }

    private final void E(uzz uzzVar) {
        String str = uzzVar.a;
        if (this.n != null) {
            synchronized (this.l) {
                if (!uxp.e(this.j, str)) {
                    String str2 = this.j;
                    if (str2 == null) {
                        this.h.put(str, agfp.b(agdd.a));
                    } else {
                        HashMap map = this.y;
                        String str3 = (String) map.get(str2);
                        if (str3 == null) {
                            this.h.put(str, agfp.b(agdd.a));
                        } else {
                            String str4 = this.x;
                            if (true == uxp.e(str3, str4 != null ? (String) map.get(str4) : null)) {
                                str3 = null;
                            }
                            Object obj = this.l;
                            if (str3 != null) {
                                synchronized (obj) {
                                    agfp agfpVar = (agfp) this.h.remove(str3);
                                    if (agfpVar != null) {
                                        agfpVar.f();
                                    }
                                }
                            } else {
                                synchronized (obj) {
                                    this.h.put(str, agfp.b(agdd.a));
                                }
                            }
                        }
                    }
                }
            }
        }
        synchronized (this.l) {
            String str5 = this.j;
            String str6 = uzzVar.a;
            if (uxp.e(str5, str6)) {
                return;
            }
            this.j = str6;
            this.k = ardj.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
            this.y.put(str6, uzzVar.b);
            Iterator it = this.t.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                synchronized (((abix) entry.getValue()).c) {
                }
                synchronized (this.l) {
                    this.z = (ardj) entry.getKey();
                }
                ((abix) entry.getValue()).b(false);
            }
        }
    }

    private final boolean F() {
        ardj ardjVar;
        abix abixVar;
        synchronized (this.l) {
            ardjVar = this.z;
            if (ardjVar != null) {
                this.z = null;
            } else {
                ardjVar = null;
            }
        }
        if (ardjVar == null) {
            return false;
        }
        Map map = this.t;
        synchronized (map) {
            abixVar = (abix) map.get(ardjVar);
            if (abixVar == null) {
                abixVar = new abix(this);
                map.put(ardjVar, abixVar);
            }
        }
        abixVar.b(true);
        return true;
    }

    public final void A(String str) {
        synchronized (this.l) {
            C(str);
        }
    }

    @Override // defpackage.uzk
    public final avlh a() {
        return this.E.p();
    }

    @Override // defpackage.uzx
    public final void b() {
        this.d = true;
        synchronized (this.l) {
            if (this.j == null) {
                return;
            }
            this.j = null;
            if (F()) {
                return;
            }
            q("");
        }
    }

    @Override // defpackage.uzx
    public final void c(String str) {
        b();
    }

    @Override // defpackage.uzx
    public final void d() {
        if (this.c != null) {
            uys uysVar = this.c;
        }
        uyv uyvVar = this.o;
        this.u.b();
    }

    @Override // defpackage.uzx
    public final void e(String str) {
        synchronized (this.l) {
            if (TextUtils.isEmpty(this.j) || !this.j.equals(str)) {
                return;
            }
            this.j = null;
            if (F()) {
                return;
            }
            q("");
        }
    }

    @Override // defpackage.uzx
    public final void f(uzz uzzVar) {
        String str = uzzVar.a;
        if (ahno.aa(str)) {
            zvp.a(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]selectEffectAsset with null/empty id.");
            return;
        }
        if (this.c != null && this.c.a(str) != null) {
            D();
            E(uzzVar);
            q(str);
            u();
            return;
        }
        uxd uxdVar = this.v;
        if (uxdVar == null) {
            zvp.a(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]attempt to select new effect asset but no Xeno asset retriever");
            return;
        }
        E(uzzVar);
        D();
        String str2 = uzzVar.b;
        yhi yhiVar = this.F;
        if (yhiVar == null) {
            yhiVar = new yhi(this, str2, (char[]) null);
            this.F = yhiVar;
        }
        int i = uzzVar.h;
        int i2 = uzzVar.i;
        Optional optional = uzzVar.d;
        aihf aihfVarCreateBuilder = AssetDetail.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        AssetDetail assetDetail = (AssetDetail) aihfVarCreateBuilder.instance;
        str.getClass();
        assetDetail.b |= 1;
        assetDetail.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        AssetDetail assetDetail2 = (AssetDetail) aihfVarCreateBuilder.instance;
        if (i == 0) {
            throw null;
        }
        assetDetail2.d = i - 1;
        assetDetail2.b |= 4;
        urh urhVar = new urh(aihfVarCreateBuilder, 6);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) urhVar.a;
            aihfVar.copyOnWrite();
            AssetDetail assetDetail3 = (AssetDetail) aihfVar.instance;
            assetDetail3.b |= 32;
            assetDetail3.e = (aigj) obj;
        }
        uxdVar.c.a().isPresent();
        AssetDetail assetDetail4 = (AssetDetail) aihfVarCreateBuilder.build();
        aend aendVar = uxdVar.d;
        wqd wqdVarD = aendVar.d();
        wqdVarD.e(assetDetail4);
        wqdVarD.a = i2;
        wqdVarD.F();
        wqdVarD.m();
        Executor executor = uxdVar.a;
        ListenableFuture listenableFutureG = aendVar.g(wqdVarD, executor);
        aaok aaokVar = uxdVar.e;
        if (aaokVar.O()) {
            listenableFutureG = ahng.u(listenableFutureG, Duration.ofSeconds(((vxz) aaokVar.c).c(4, 45731798L, 30L)).toSeconds(), TimeUnit.SECONDS, uxdVar.b);
        }
        taf.i(listenableFutureG, executor, new roc(yhiVar, 8), new itt(yhiVar, str, 15), null);
    }

    @Override // defpackage.vab
    public final vaa g() {
        vaa vaaVar;
        ardj ardjVar;
        synchronized (this.l) {
            String str = this.j;
            if (str == null || (ardjVar = this.k) == null) {
                vaaVar = vaa.a;
            } else {
                Map map = agpn.b;
                if (ardjVar == ardj.EFFECT_SUBPACKAGE_ID_PRESET) {
                    float f = true != uxp.e(str, "AUTO") ? 0.5f : 0.8f;
                    map = new HashMap();
                    map.put("intensity", Float.valueOf(f));
                }
                Map map2 = map;
                List list = this.i;
                uxp uxpVarA = uxp.a(null, this.j);
                String str2 = this.j;
                str2.getClass();
                ardj ardjVar2 = this.k;
                ardjVar2.getClass();
                vaaVar = new vaa(str2, uxpVarA == null ? str2 : uxpVarA.b, C(str2), uxp.e(str2, "NORMAL") ? ardj.EFFECT_SUBPACKAGE_ID_UNSPECIFIED : ardjVar2, map2);
            }
        }
        return vaaVar;
    }

    @Override // defpackage.vab
    public final void h(uys uysVar) {
        ahno.O(this.c == null);
        this.c = uysVar;
        avmm avmmVar = this.u;
        avmmVar.b();
        avmmVar.c(uysVar.b().ak(new usn(this, 16)));
        this.D = true;
        yno.fF(this.r, null, true);
    }

    @Override // defpackage.vab
    public final void i(uxd uxdVar) {
        this.v = uxdVar;
    }

    @Override // defpackage.vab
    public final boolean j() {
        uyv uyvVar = this.o;
        return this.c != null;
    }

    @Override // defpackage.vab
    public final void k(uzz uzzVar, atte atteVar, ajhv ajhvVar, agke agkeVar, usq usqVar) {
        String str = uzzVar.a;
        if (ahno.aa(str)) {
            zvp.a(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]restoreSelectedEffectAsset with null/empty id.");
            usqVar.r(b);
            return;
        }
        uys uysVar = this.c;
        if (uysVar == null) {
            usqVar.r(b);
            return;
        }
        if (uysVar.a(str) == null) {
            E(uzzVar);
            D();
            uysVar.e(str, atteVar, null, ajhvVar, null, agkeVar, new hrr(this, usqVar, uzzVar, 8, (char[]) null));
        } else {
            D();
            E(uzzVar);
            usqVar.r(q(str));
            u();
        }
    }

    @Override // defpackage.vab
    public final uzl l(final usf usfVar) {
        uzl uzlVar;
        rzt rztVar = new rzt(this, 12);
        rzt rztVar2 = new rzt(this, 13);
        final Set set = this.q;
        synchronized (set) {
            if (((Boolean) rztVar.get()).booleanValue()) {
                usfVar.r(rztVar2.get());
                return new vah();
            }
            synchronized (set) {
                try {
                    set.add(usfVar);
                    uzlVar = new uzl() { // from class: vag
                        @Override // defpackage.uzl
                        public final void a() {
                            Set set2 = set;
                            Consumer consumer = usfVar;
                            synchronized (set2) {
                                set2.remove(consumer);
                            }
                        }
                    };
                } catch (Throwable th) {
                    throw th;
                }
            }
            return uzlVar;
        }
    }

    @Override // defpackage.vab
    public final uzl m(usf usfVar) {
        rzt rztVar = new rzt(this, 14);
        final vai vaiVar = new vai(usfVar, rztVar);
        final Set set = this.f;
        synchronized (set) {
            set.add(vaiVar);
        }
        Object obj = rztVar.get();
        if (obj != null) {
            vaiVar.r(obj);
        }
        return new uzl() { // from class: vaf
            @Override // defpackage.uzl
            public final void a() {
                Set set2 = set;
                vai vaiVar2 = vaiVar;
                synchronized (set2) {
                    set2.remove(vaiVar2);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.vab
    public final uzl n(usf usfVar) {
        agke agkeVarN;
        Consumer consumer;
        this.g = usfVar;
        Map map = this.t;
        synchronized (map) {
            try {
                for (abix abixVar : map.values()) {
                    ?? r2 = abixVar.e;
                    synchronized (r2) {
                        try {
                            ?? r3 = abixVar.b;
                            for (Map.Entry entry : r3.entrySet()) {
                                j$.util.Map.EL.computeIfAbsent(r2, (String) entry.getKey(), new uot(entry, 11));
                            }
                            r3.clear();
                            agkeVarN = agke.n(r2.keySet());
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    synchronized (r2) {
                        agqs agqsVarListIterator = agkeVarN.listIterator(0);
                        while (agqsVarListIterator.hasNext()) {
                        }
                    }
                    if (!arrayList.isEmpty() && (consumer = ((vae) abixVar.d).g) != null) {
                        consumer.r(arrayList);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new uzl() { // from class: vac
            @Override // defpackage.uzl
            public final void a() {
                this.a.g = null;
            }
        };
    }

    @Override // defpackage.vab
    public final void o(xpl xplVar) {
        this.m = xplVar;
    }

    @Override // defpackage.vab
    public final void p(yno ynoVar) {
        this.n = ynoVar;
    }

    public final uzj q(String str) {
        boolean zE;
        uzj uzjVarB = b;
        if (this.D) {
            uys uysVar = this.c;
            uysVar.getClass();
            uyr uyrVarA = uysVar.a(str);
            synchronized (this.l) {
                zE = true;
                try {
                    if (uyrVarA != null) {
                        uzjVarB = B(str, C(str), uyrVarA);
                        zE = true ^ uxp.e(this.x, str);
                        this.x = str;
                    } else {
                        this.x = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zE) {
                yno.fF(this.s, uzjVarB, false);
                this.E.kk(agke.q(uzjVarB));
            }
            w(str);
        }
        return uzjVarB;
    }

    @Override // defpackage.vbm
    public final avlh r() {
        return this.C ? this.A : avlh.w();
    }

    public final Optional s(ardj ardjVar) {
        Optional optionalOfNullable;
        Map map = this.t;
        synchronized (map) {
            optionalOfNullable = Optional.ofNullable((abix) map.get(ardjVar));
        }
        return optionalOfNullable;
    }

    public final String t() {
        String str;
        synchronized (this.l) {
            str = this.j;
        }
        return str;
    }

    public final void u() {
        if (this.C) {
            AtomicInteger atomicInteger = this.B;
            int iDecrementAndGet = atomicInteger.decrementAndGet();
            if (iDecrementAndGet < 0) {
                atomicInteger.set(0);
            } else if (iDecrementAndGet != 0) {
                return;
            }
            this.A.kk(vbl.a);
        }
    }

    public final void v(String str) {
        if (this.n != null) {
            synchronized (this.l) {
                agfp agfpVar = (agfp) this.h.get(str);
                if (agfpVar != null) {
                    agfpVar.c();
                    C(str);
                }
            }
        }
    }

    public final void w(String str) {
        if (this.n != null) {
            synchronized (this.l) {
                agfp agfpVar = (agfp) this.h.remove(str);
                if (agfpVar != null) {
                    agfpVar.f();
                    agfpVar.c();
                    C(str);
                }
            }
        }
    }

    @Override // defpackage.vaj
    public final void x() {
        List list = this.i;
        y();
    }

    public final void y() {
        if (this.p && this.d) {
            String strT = t();
            List list = this.i;
            uyr uyrVarA = null;
            uxp uxpVarA = uxp.a(null, strT);
            if (uxpVarA == null || uxpVarA.d()) {
                strT = "NORMAL";
            }
            synchronized (this.l) {
                if (!uxp.e(strT, this.x)) {
                    this.x = strT;
                    if (this.D) {
                        if (strT != null) {
                            uys uysVar = this.c;
                            uysVar.getClass();
                            uyrVarA = uysVar.a(strT);
                        }
                        if (uyrVarA != null) {
                            uzj uzjVarB = B(strT, "", uyrVarA);
                            yno.fF(this.s, uzjVarB, false);
                            this.E.kk(agke.q(uzjVarB));
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.vbm
    public final void z() {
        this.C = true;
    }
}
