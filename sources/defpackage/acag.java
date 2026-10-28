package defpackage;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acag {
    private static final agrf v = agrf.h("com/google/android/libraries/youtube/player/subtitles/CaptionController");
    private final auor A;
    public final tbt a;
    public final Context b;
    public final abww c;
    public final ScheduledExecutorService d;
    public final String e;
    public final Executor f;
    public final Executor g;
    public final Executor h;
    public final abmt i;
    public final aunn j;
    public final ListenableFuture k;
    public CaptioningManager l;
    public boolean m;
    public acca n;
    public accc o;
    public wjf p;
    public acip q;
    public boolean r;
    public boolean s;
    public abob t;
    public final aunn u;
    private final Set w = Collections.newSetFromMap(new WeakHashMap());
    private acca x;
    private int y;
    private String z;

    public acag(tbt tbtVar, Context context, abww abwwVar, ScheduledExecutorService scheduledExecutorService, String str, ListenableFuture listenableFuture, aunn aunnVar, Executor executor, Executor executor2, Executor executor3, abmt abmtVar, aunn aunnVar2) {
        Locale locale;
        tbtVar.getClass();
        this.a = tbtVar;
        abwwVar.getClass();
        this.c = abwwVar;
        context.getClass();
        this.b = context;
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
        str.getClass();
        this.e = str;
        this.j = aunnVar;
        this.f = executor;
        executor2.getClass();
        this.g = executor2;
        executor3.getClass();
        this.h = executor3;
        abmtVar.getClass();
        this.i = abmtVar;
        this.u = aunnVar2;
        listenableFuture.getClass();
        this.k = listenableFuture;
        hvf hvfVar = new hvf(this, 9);
        Executor executor4 = taf.a;
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        String language = null;
        taa taaVar = new taa(hvfVar, null, taf.b);
        long j = afwl.a;
        listenableFuture.addListener(new ahei(listenableFuture, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
        CaptioningManager captioningManager = this.l;
        awq awqVar = new awq(new awr(context.getResources().getConfiguration().getLocales()));
        String language2 = !awqVar.g() ? awqVar.f(0).getLanguage() : null;
        if (captioningManager != null && captioningManager.getLocale() != null && (locale = captioningManager.getLocale()) != null && locale.getLanguage() != null) {
            language = locale.getLanguage();
        }
        this.A = new auor(language2, language);
        this.t = abob.a;
        this.y = 0;
        this.z = "";
    }

    static boolean q(abww abwwVar, CaptioningManager captioningManager) {
        ListenableFuture listenableFutureD = abwwVar.d();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) taf.e(listenableFutureD, 1L, timeUnit, bool)).booleanValue()) {
            return ((Boolean) taf.e(abwwVar.b(), 1L, TimeUnit.SECONDS, bool)).booleanValue();
        }
        return captioningManager != null && captioningManager.isEnabled();
    }

    private final void r(boolean z) {
        this.m = z;
        acip acipVar = this.q;
        if (acipVar != null) {
            acipVar.bd().kk(new aazc(this.m));
        } else {
            this.a.c(new aazc(z));
        }
    }

    public final int a() {
        return wgq.DASH_FMP4_TT_FMT3.ep;
    }

    public final acca b() {
        Optional optional;
        Locale locale;
        aopx aopxVar;
        accc acccVar = this.o;
        acca accaVarC = null;
        if (acccVar == null) {
            return null;
        }
        accb accbVarD = acccVar.d();
        if (this.r || (((aopxVar = acccVar.b) != null && (aopxVar.b & SemanticState.Focused) != 0 && aopxVar.k) || accbVarD == accb.a)) {
            abww abwwVar = this.c;
            awmd awmdVar = abwwVar.e;
            ListenableFuture listenableFutureC = abwwVar.c();
            ListenableFuture listenableFutureN = ((((abmt) awmdVar.io()).bl() && (optional = (Optional) abwwVar.b.aD()) != null && optional.isPresent()) || listenableFutureC == null) ? ahng.n(abwwVar.f()) : ahno.ar(listenableFutureC, new aaoz(abwwVar, 16), abwwVar.i);
            accaVarC = acccVar.c((String) taf.e(listenableFutureN, 1L, TimeUnit.SECONDS, ""));
        }
        CaptioningManager captioningManager = this.l;
        if (accaVarC == null && accbVarD == accb.a && captioningManager != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
            accaVarC = acccVar.c(locale.getLanguage());
        }
        return accaVarC == null ? acccVar.b() : accaVarC;
    }

    public final String c() {
        acip acipVar = this.q;
        if (acipVar == null) {
            return null;
        }
        return acipVar.au();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    public final List d() {
        ArrayList arrayList = new ArrayList();
        accc acccVar = this.o;
        if (acccVar == null) {
            return arrayList;
        }
        List list = (List) Collection.EL.stream(acccVar.g()).map(new accu(1)).collect(Collectors.toCollection(new yoj(11)));
        auor auorVar = this.A;
        int i = 12;
        List list2 = (List) Collection.EL.stream(auorVar.b.entrySet()).filter(new aajl(list, 19)).sorted(Comparator$EL.reversed(Comparator$CC.comparingInt(new ddc(16)))).map(new accu(0)).collect(Collectors.toCollection(new yoj(i)));
        Object obj = auorVar.a;
        if (obj != null) {
            acca accaVar = (acca) obj;
            if (list.contains(accaVar.a) && accaVar.f()) {
                list2.add(0, ((acca) auorVar.a).a);
            }
        }
        List list3 = (List) Collection.EL.stream(list2).distinct().limit(3L).collect(Collectors.toCollection(new yoj(i)));
        accc acccVar2 = this.o;
        acccVar2.getClass();
        List<acca> listG = acccVar2.g();
        ArrayList arrayList2 = new ArrayList();
        for (acca accaVar2 : listG) {
            String str = accaVar2.a;
            int iIndexOf = list3.contains(str) ? list3.indexOf(str) : -1;
            acbz acbzVar = new acbz(accaVar2);
            acbzVar.b(iIndexOf);
            arrayList2.add(acbzVar.a());
        }
        return arrayList2;
    }

    public final List e() {
        String string = this.b.getString(R.string.turn_off_subtitles);
        wjf wjfVar = this.p;
        if (wjfVar == null || !p()) {
            accc acccVar = this.o;
            if (acccVar != null) {
                return acccVar.h();
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(acca.b(string));
        arrayList.addAll(aawo.e(wjfVar, a()));
        return arrayList;
    }

    public final void f(avlh avlhVar, avlh avlhVar2, abwg abwgVar, abmt abmtVar) {
        avmm avmmVar = new avmm();
        avmmVar.c(avlhVar.p().ak(new acae(this, 0)));
        int i = 19;
        avmmVar.c(avlhVar2.p().al(new acae(this, 2), new abeq(i)));
        if (abmtVar.h.l(1, 45371393L, false)) {
            avmmVar.c(((avlh) abwgVar.r).p().al(new acaa(this, 4), new abeq(i)));
        }
        if (abmtVar.bv()) {
            ListenableFuture listenableFutureD = this.c.d();
            ListenableFuture listenableFutureK = new ahud(new ahek(true, agke.p(new ListenableFuture[]{this.k, listenableFutureD})), (byte[]) null).k(new vtq(this, listenableFutureD, abmtVar, 15), this.h);
            abwu abwuVar = new abwu(8);
            Executor executor = taf.a;
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            taa taaVar = new taa(taf.c, null, abwuVar);
            long j = afwl.a;
            listenableFutureK.addListener(new ahei(listenableFutureK, new afwj(afty.c(false), taaVar, 0)), executorDirectExecutor);
        }
    }

    public final void g(acca accaVar, boolean z) {
        abmt abmtVar = this.i;
        acip acipVar = this.q;
        if ((!abmtVar.cl() && !abmtVar.bE()) || acipVar == null || Objects.equals(accaVar, this.x)) {
            return;
        }
        if (o(accaVar)) {
            this.y = 3;
        }
        this.x = accaVar;
        acipVar.bh().kk(new aazl(accaVar, acipVar.au(), this.z, this.y, z));
        if (z) {
            return;
        }
        this.y = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0127, code lost:
    
        if (r8 != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.wjf r8, defpackage.aopz r9) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acag.k(wjf, aopz):void");
    }

    public final void l() {
        this.o = null;
        this.y = 0;
        this.z = "";
        r(false);
        n(new aazb(null, aazh.b, 0, c()));
        this.p = null;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.util.Map] */
    public final void m(acca accaVar, aazh aazhVar, int i) {
        String str;
        boolean z;
        if (accaVar == null || !accaVar.e()) {
            aazb aazbVar = new aazb(accaVar, aazhVar, i, c());
            if (accaVar != null) {
                new Throwable();
                if (!this.i.bv() || i != 4) {
                    if (accaVar.g()) {
                        str = "";
                        z = false;
                    } else {
                        str = accaVar.a;
                        z = true;
                    }
                    abwv abwvVarA = this.c.a();
                    abwvVarA.b(Boolean.valueOf(z));
                    abwvVarA.a = str;
                    taf.j(abwvVarA.a(), new abwu(9));
                    this.r = true;
                }
                if (aazbVar.e) {
                    auor auorVar = this.A;
                    if (accaVar.f()) {
                        auorVar.a = accaVar;
                    }
                    auor.n(auorVar.b, accaVar.a);
                }
            }
            n(aazbVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    public final void n(aazb aazbVar) {
        accc acccVar;
        acca accaVarA;
        int i;
        int i2 = aazbVar.d;
        if (i2 != 0) {
            this.y = i2;
            acca accaVar = this.x;
            if (accaVar != null) {
                this.z = accaVar.k;
            } else {
                this.z = "";
            }
        }
        acca accaVar2 = aazbVar.b;
        this.n = accaVar2;
        if (accaVar2 != null && accaVar2.g()) {
            this.n = null;
        }
        if (this.n == null && (acccVar = this.o) != null) {
            aopx aopxVar = acccVar.b;
            if (aopxVar == null || !aopxVar.h || (i = aopxVar.g) < 0) {
                accaVarA = null;
            } else {
                aopz aopzVar = acccVar.a;
                if (i < aopzVar.b.size()) {
                    acbz acbzVarA = acccVar.a((aopy) aopzVar.b.get(aopxVar.g));
                    acbzVarA.g(true);
                    accaVarA = acbzVarA.a();
                } else {
                    accaVarA = null;
                }
            }
            this.n = accaVarA;
        }
        boolean z = false;
        if (accaVar2 != null && !accaVar2.g()) {
            z = true;
        }
        g(null, z);
        acca accaVar3 = this.n;
        aazh aazhVar = aazbVar.c;
        if (true == o(accaVar3)) {
            i2 = 3;
        }
        aazb aazbVar2 = new aazb(accaVar3, aazhVar, i2, c());
        acip acipVar = this.q;
        if (acipVar != null) {
            acipVar.bc().kk(aazbVar2);
        } else {
            this.a.e(aazbVar2);
        }
    }

    public final boolean o(acca accaVar) {
        return accaVar != null && accaVar.q;
    }

    public final boolean p() {
        wja wjaVarG;
        wjf wjfVar = this.p;
        return (wjfVar == null || (wjaVarG = wjfVar.g()) == null || !wjaVarG.D() || aawo.e(wjfVar, a()).isEmpty()) ? false : true;
    }
}
