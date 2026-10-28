package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.chromium.base.Callback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ppv implements ppe {
    public static final /* synthetic */ int h = 0;
    private static final long i;
    private static final long j;
    public final Context a;
    public final pls b;
    public final pwf c;
    public final axff d;
    public final Map e;
    public final axff f;
    public final lmm g;
    private final jyq k;
    private final mbc l;
    private final awut m;
    private final klt n;
    private final Map o;

    static {
        agsn.h("GnpSdk");
        TimeUnit timeUnit = TimeUnit.MINUTES;
        i = 300000L;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        j = 3600000L;
    }

    public ppv(Context context, lmm lmmVar, jyq jyqVar, mbc mbcVar, pls plsVar, pwf pwfVar, awut awutVar, awou awouVar, klt kltVar) {
        context.getClass();
        lmmVar.getClass();
        jyqVar.getClass();
        mbcVar.getClass();
        plsVar.getClass();
        pwfVar.getClass();
        awouVar.getClass();
        kltVar.getClass();
        this.a = context;
        this.g = lmmVar;
        this.k = jyqVar;
        this.l = mbcVar;
        this.b = plsVar;
        this.c = pwfVar;
        this.m = awutVar;
        this.n = kltVar;
        this.o = new LinkedHashMap();
        this.d = new axfi(false);
        this.e = new LinkedHashMap();
        this.f = new axfi(false);
    }

    private final boolean q(ppg ppgVar) {
        Long l = ppgVar.c;
        if (l != null) {
            if (TimeUnit.SECONDS.toMillis(l.longValue()) - this.l.f().toEpochMilli() > i) {
                return true;
            }
        } else if (this.l.f().toEpochMilli() - ppgVar.b < j - i) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private static final boolean r(java.lang.Throwable r1) {
        /*
            boolean r0 = r1 instanceof defpackage.kmu
            if (r0 == 0) goto L16
            kmu r1 = (defpackage.kmu) r1
            int r1 = r1.a()
            r0 = 7
            if (r1 == r0) goto L14
            switch(r1) {
                case 14: goto L14;
                case 15: goto L14;
                case 16: goto L14;
                case 17: goto L14;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 20: goto L14;
                case 21: goto L14;
                case 22: goto L14;
                default: goto L13;
            }
        L13:
            goto L16
        L14:
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppv.r(java.lang.Throwable):boolean");
    }

    @Override // defpackage.ppe
    public final Object a(String str, awoq awoqVar) {
        return awro.p(((axcw) this.m).a, new gmc(this, str, (awoq) null, 19), awoqVar);
    }

    @Override // defpackage.ppe
    public final Object b(awoq awoqVar) {
        return awro.p(((axcw) this.m).a, new dnz(this, (awoq) null, 9), awoqVar);
    }

    @Override // defpackage.ppe
    public final Object c(String str, awoq awoqVar) {
        return awro.p(((axcw) this.m).a, new gme(this, str, null, 10), awoqVar);
    }

    @Override // defpackage.ppe
    public final Object d(String str, awoq awoqVar) {
        return awro.p(((axcw) this.m).a, new ppo(this, str, null), awoqVar);
    }

    public final pky e(pky pkyVar) {
        pky ppcVar;
        if (pkyVar instanceof pla) {
            return pkyVar;
        }
        pkyVar.getClass();
        pku pkuVar = (pku) pkyVar;
        Throwable thB = pkuVar.b();
        int iA = nxj.a(thB);
        if (iA == 0) {
            ppcVar = new ppc((UserRecoverableAuthException) thB, pkuVar.a());
        } else if (iA != 1) {
            ppcVar = r(thB) ? new ppd(new IOException(thB), pkuVar.a()) : new ppb(thB, pkuVar.a());
        } else {
            ppcVar = new ppd((IOException) thB, pkuVar.a());
        }
        return ppcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ppg ppgVar, awoq awoqVar) throws Throwable {
        pph pphVar;
        if (awoqVar instanceof pph) {
            pphVar = (pph) awoqVar;
            int i2 = pphVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pphVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pphVar = new pph(this, awoqVar);
            }
        } else {
            pphVar = new pph(this, awoqVar);
        }
        Object objP = pphVar.a;
        Object obj = awox.a;
        int i3 = pphVar.c;
        if (i3 != 0) {
            if (i3 == 1) {
                ppgVar = pphVar.d;
                atqp.j(objP);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(objP);
            }
            return awmy.a;
        }
        atqp.j(objP);
        pphVar.d = ppgVar;
        pphVar.c = 1;
        objP = p(pphVar);
        if (objP == obj) {
            return obj;
        }
        if (((Boolean) objP).booleanValue()) {
            pphVar.d = null;
            pphVar.c = 2;
            if (g(ppgVar, pphVar) == obj) {
                return obj;
            }
            return awmy.a;
        }
        Context context = this.a;
        String str = ppgVar.a;
        String str2 = jxs.a;
        jxz.c(context, str);
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ppg ppgVar, awoq awoqVar) throws Throwable {
        ppi ppiVar;
        if (awoqVar instanceof ppi) {
            ppiVar = (ppi) awoqVar;
            int i2 = ppiVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ppiVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ppiVar = new ppi(this, awoqVar);
            }
        } else {
            ppiVar = new ppi(this, awoqVar);
        }
        Object obj = ppiVar.a;
        awox awoxVar = awox.a;
        int i3 = ppiVar.c;
        if (i3 == 0) {
            atqp.j(obj);
            lpa lpaVarA = this.k.a(ppgVar.a);
            ppiVar.c = 1;
            if (Callback.Helper.h(lpaVarA, ppiVar) == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, String str2, awoq awoqVar) {
        ppj ppjVar;
        ppf ppfVar;
        awrm awrmVar;
        axff axffVar;
        pky pkyVarE;
        if (awoqVar instanceof ppj) {
            ppjVar = (ppj) awoqVar;
            int i2 = ppjVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ppjVar.d = i2 - Integer.MIN_VALUE;
            } else {
                ppjVar = new ppj(this, awoqVar);
            }
        } else {
            ppjVar = new ppj(this, awoqVar);
        }
        Object objC = ppjVar.b;
        awox awoxVar = awox.a;
        int i3 = ppjVar.d;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    axffVar = ppjVar.f;
                    awrmVar = ppjVar.e;
                    ppfVar = (ppf) ppjVar.a;
                    atqp.j(objC);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (ppv) ppjVar.a;
                    atqp.j(objC);
                }
                pkyVarE = this.e((pky) objC);
                if (pkyVarE instanceof pla) {
                    return new pla(((ppg) ((pla) pkyVarE).a).a);
                }
                pkyVarE.getClass();
                return (pku) pkyVarE;
            }
            atqp.j(objC);
            ppfVar = new ppf(new Account(str, "com.google"), str2);
            awrmVar = new awrm();
            axffVar = this.f;
            ppjVar.a = ppfVar;
            ppjVar.e = awrmVar;
            ppjVar.f = (axfi) axffVar;
            ppjVar.d = 1;
            if (axffVar.a(ppjVar) == awoxVar) {
                return awoxVar;
            }
            Map map = this.e;
            awuz awuzVar = (awuz) map.get(ppfVar);
            if (awuzVar == null) {
                awuz awuzVarR = awro.r(this.m, awov.a, 1, new ppl(this, ppfVar, null));
                map.put(ppfVar, awuzVarR);
                awrmVar.a = awuzVarR;
            } else {
                awrmVar.a = awuzVar;
            }
            axffVar.c();
            awuz awuzVar2 = (awuz) awrmVar.a;
            ppjVar.a = this;
            ppjVar.e = null;
            ppjVar.f = null;
            ppjVar.d = 2;
            objC = awuzVar2.c(ppjVar);
            if (objC == awoxVar) {
                return awoxVar;
            }
            pkyVarE = this.e((pky) objC);
            if (pkyVarE instanceof pla) {
                return new pla(((ppg) ((pla) pkyVarE).a).a);
            }
            pkyVarE.getClass();
            return (pku) pkyVarE;
        } catch (Throwable th) {
            axffVar.c();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, awoq awoqVar) throws Throwable {
        ppm ppmVar;
        Exception e;
        pkx pkxVar;
        pky pkvVar;
        if (awoqVar instanceof ppm) {
            ppmVar = (ppm) awoqVar;
            int i2 = ppmVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ppmVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ppmVar = new ppm(this, awoqVar);
            }
        } else {
            ppmVar = new ppm(this, awoqVar);
        }
        Object obj = ppmVar.a;
        awox awoxVar = awox.a;
        int i3 = ppmVar.c;
        if (i3 == 0) {
            atqp.j(obj);
            pkx pkxVar2 = pkx.aB;
            try {
                ppmVar.d = pkxVar2;
                ppmVar.e = this;
                ppmVar.c = 1;
                Object objO = o(str, "com.google", ppmVar);
                if (objO == awoxVar) {
                    return awoxVar;
                }
                obj = objO;
                pkxVar = pkxVar2;
            } catch (Exception e2) {
                e = e2;
                pkxVar = pkxVar2;
                awro.A(ppmVar.getContext());
                pkvVar = new pkv(e, pkxVar);
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = ppmVar.e;
            pkxVar = ppmVar.d;
            try {
                atqp.j(obj);
            } catch (Exception e3) {
                e = e3;
                awro.A(ppmVar.getContext());
                pkvVar = new pkv(e, pkxVar);
            }
        }
        pkvVar = new pla(((jyp) obj).a);
        return this.e(pkvVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(ppf ppfVar, awoq awoqVar) throws Exception {
        ppn ppnVar;
        if (awoqVar instanceof ppn) {
            ppnVar = (ppn) awoqVar;
            int i2 = ppnVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ppnVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ppnVar = new ppn(this, awoqVar);
            }
        } else {
            ppnVar = new ppn(this, awoqVar);
        }
        Object objL = ppnVar.a;
        Object obj = awox.a;
        int i3 = ppnVar.c;
        if (i3 == 0) {
            atqp.j(objL);
            Account account = ppfVar.a;
            String str = ppfVar.b;
            ppnVar.d = ppfVar;
            ppnVar.c = 1;
            objL = l(account, str, ppnVar);
            if (objL == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ppfVar = ppnVar.d;
            atqp.j(objL);
        }
        this.o.put(ppfVar, (ppg) objL);
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x011d A[Catch: Exception -> 0x0123, TryCatch #2 {Exception -> 0x0123, blocks: (B:13:0x0033, B:40:0x00dd, B:42:0x011d, B:43:0x011f), top: B:65:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0133  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code duplicated, block: B:57:0x0140  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object k(Account account, String str, awoq awoqVar) throws Exception {
        ppp pppVar;
        long j2;
        String str2;
        long j3;
        String str3;
        if (awoqVar instanceof ppp) {
            pppVar = (ppp) awoqVar;
            int i2 = pppVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pppVar.d = i2 - Integer.MIN_VALUE;
            } else {
                pppVar = new ppp(this, awoqVar);
            }
        } else {
            pppVar = new ppp(this, awoqVar);
        }
        Object objO = pppVar.b;
        Object ppgVar = awox.a;
        int i3 = pppVar.d;
        if (i3 == 0) {
            atqp.j(objO);
            long jB = this.l.b();
            try {
                String str4 = account.name;
                str4.getClass();
                String str5 = account.type;
                str5.getClass();
                pppVar.e = str;
                pppVar.a = jB;
                pppVar.d = 1;
                objO = o(str4, str5, pppVar);
                if (objO != ppgVar) {
                    str2 = str;
                    j3 = jB;
                }
                return ppgVar;
            } catch (Exception e) {
                e = e;
                j2 = jB;
                long jB2 = this.l.b() - j2;
                if (e instanceof UserRecoverableAuthException) {
                    str3 = "RECOVERABLE";
                } else if (e instanceof IOException) {
                    str3 = "NETWORK";
                } else {
                    str3 = "NETWORK";
                }
                String str6 = str3;
                pwf pwfVar = this.c;
                Context context = this.a;
                pls plsVar = this.b;
                String packageName = context.getPackageName();
                String str7 = plsVar.a;
                pwfVar.n(jB2, packageName, str7, "AANG", "FAILURE", str6);
                pwfVar.a(context.getPackageName(), str7, "AANG", "FAILURE", str6);
                throw e;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = pppVar.a;
            try {
                atqp.j(objO);
                jyo jyoVar = (jyo) objO;
                mbc mbcVar = this.l;
                long jB3 = mbcVar.b() - j2;
                pwf pwfVar2 = this.c;
                Context context2 = this.a;
                String packageName2 = context2.getPackageName();
                String str8 = this.b.a;
                pwfVar2.n(jB3, packageName2, str8, "AANG", "SUCCESS", "NONE");
                pwfVar2.a(context2.getPackageName(), str8, "AANG", "SUCCESS", "NONE");
                String str9 = jyoVar.a;
                str9.getClass();
                long epochMilli = mbcVar.f().toEpochMilli();
                jyr jyrVar = jyoVar.b;
                ppgVar = new ppg(str9, epochMilli, jyrVar != null ? jyrVar.a : null);
                return ppgVar;
            } catch (Exception e2) {
                e = e2;
                long jB4 = this.l.b() - j2;
                if (e instanceof UserRecoverableAuthException) {
                    str3 = "RECOVERABLE";
                } else if (e instanceof IOException) {
                    str3 = "NETWORK";
                } else {
                    str3 = "NETWORK";
                }
                String str10 = str3;
                pwf pwfVar3 = this.c;
                Context context3 = this.a;
                pls plsVar2 = this.b;
                String packageName3 = context3.getPackageName();
                String str11 = plsVar2.a;
                pwfVar3.n(jB4, packageName3, str11, "AANG", "FAILURE", str10);
                pwfVar3.a(context3.getPackageName(), str11, "AANG", "FAILURE", str10);
                throw e;
            }
        }
        j3 = pppVar.a;
        str2 = pppVar.e;
        try {
            atqp.j(objO);
        } catch (Exception e3) {
            e = e3;
            j2 = j3;
            long jB5 = this.l.b() - j2;
            if (e instanceof UserRecoverableAuthException) {
                str3 = "RECOVERABLE";
            } else if ((e instanceof IOException) || r(e)) {
                str3 = "NETWORK";
            } else {
                str3 = "PERMANENT";
            }
            String str12 = str3;
            pwf pwfVar4 = this.c;
            Context context4 = this.a;
            pls plsVar3 = this.b;
            String packageName4 = context4.getPackageName();
            String str13 = plsVar3.a;
            pwfVar4.n(jB5, packageName4, str13, "AANG", "FAILURE", str12);
            pwfVar4.a(context4.getPackageName(), str13, "AANG", "FAILURE", str12);
            throw e;
        }
        jym jymVarA = jyn.a();
        jymVarA.a = (jyp) objO;
        if (awrc.n(str2, "oauth2:", false)) {
            jymVarA.c = awrc.F(awrc.r(str2, "oauth2:"), new String[]{" "});
        } else if (awrc.n(str2, "weblogin:", false)) {
            jymVarA.d = awrc.F(awrc.r(str2, "weblogin:"), new String[]{" "});
        } else if (awrc.n(str2, "audience:server:client_id:", false)) {
            String strSubstring = str2.substring(26);
            strSubstring.getClass();
            jymVarA.f = atqq.H(strSubstring);
        } else {
            jymVarA.e = awrc.F(str2, new String[]{" "});
        }
        lpa lpaVarC = this.k.c(jymVarA.a());
        pppVar.e = null;
        pppVar.a = j3;
        pppVar.d = 2;
        objO = Callback.Helper.h(lpaVarC, pppVar);
        if (objO != ppgVar) {
            j2 = j3;
            jyo jyoVar2 = (jyo) objO;
            mbc mbcVar2 = this.l;
            long jB6 = mbcVar2.b() - j2;
            pwf pwfVar5 = this.c;
            Context context5 = this.a;
            String packageName5 = context5.getPackageName();
            String str14 = this.b.a;
            pwfVar5.n(jB6, packageName5, str14, "AANG", "SUCCESS", "NONE");
            pwfVar5.a(context5.getPackageName(), str14, "AANG", "SUCCESS", "NONE");
            String str15 = jyoVar2.a;
            str15.getClass();
            long epochMilli2 = mbcVar2.f().toEpochMilli();
            jyr jyrVar2 = jyoVar2.b;
            ppgVar = new ppg(str15, epochMilli2, jyrVar2 != null ? jyrVar2.a : null);
        }
        return ppgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object l(Account account, String str, awoq awoqVar) throws Exception {
        ppq ppqVar;
        Object obj;
        String str2;
        Object objP;
        String str3;
        if (awoqVar instanceof ppq) {
            ppqVar = (ppq) awoqVar;
            int i2 = ppqVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ppqVar.d = i2 - Integer.MIN_VALUE;
            } else {
                ppqVar = new ppq(this, awoqVar);
            }
        } else {
            ppqVar = new ppq(this, awoqVar);
        }
        Object obj2 = ppqVar.b;
        Object obj3 = awox.a;
        int i3 = ppqVar.d;
        if (i3 == 0) {
            atqp.j(obj2);
            obj = account;
            ppqVar.a = obj;
            str2 = str;
            ppqVar.e = str2;
            ppqVar.d = 1;
            objP = p(ppqVar);
            if (objP != obj3) {
            }
            return obj3;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj2);
            return obj2;
        }
        str2 = ppqVar.e;
        Object obj4 = ppqVar.a;
        atqp.j(obj2);
        objP = obj2;
        obj = obj4;
        if (((Boolean) objP).booleanValue()) {
            ppqVar.a = null;
            ppqVar.e = null;
            ppqVar.d = 2;
            Object objK = k((Account) obj, str2, ppqVar);
            if (objK != obj3) {
                return objK;
            }
            return obj3;
        }
        long jB = this.l.b();
        try {
            Context context = this.a;
            Bundle bundle = Bundle.EMPTY;
            bundle.getClass();
            obj.getClass();
            str2.getClass();
            String str4 = jxs.a;
            TokenData tokenDataG = jxz.g(context, (Account) obj, str2, bundle);
            tokenDataG.getClass();
            mbc mbcVar = this.l;
            long jB2 = mbcVar.b() - jB;
            pwf pwfVar = this.c;
            Context context2 = this.a;
            pls plsVar = this.b;
            String packageName = context2.getPackageName();
            String str5 = plsVar.a;
            pwfVar.n(jB2, packageName, str5, "LEGACY", "SUCCESS", "NONE");
            pwfVar.a(context2.getPackageName(), str5, "LEGACY", "SUCCESS", "NONE");
            String str6 = tokenDataG.b;
            str6.getClass();
            return new ppg(str6, mbcVar.f().toEpochMilli(), tokenDataG.c);
        } catch (Exception e) {
            long jB3 = this.l.b() - jB;
            int iA = nxj.a(e);
            if (iA != 0) {
                str3 = iA != 1 ? "PERMANENT" : "NETWORK";
            } else {
                str3 = "RECOVERABLE";
            }
            String str7 = str3;
            pwf pwfVar2 = this.c;
            Context context3 = this.a;
            pls plsVar2 = this.b;
            String packageName2 = context3.getPackageName();
            String str8 = plsVar2.a;
            pwfVar2.n(jB3, packageName2, str8, "LEGACY", "FAILURE", str7);
            pwfVar2.a(context3.getPackageName(), str8, "LEGACY", "FAILURE", str7);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [ppv] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [ppv] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [ppv] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [pkx] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final Object m(String str, String str2, awoq awoqVar) throws Throwable {
        ppr pprVar;
        pky pkvVar;
        ?? r8;
        Account account;
        String str3;
        ?? r10;
        String str4;
        ppg ppgVar;
        ?? r9;
        ?? r11;
        if (awoqVar instanceof ppr) {
            pprVar = (ppr) awoqVar;
            int i2 = pprVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pprVar.e = i2 - Integer.MIN_VALUE;
            } else {
                pprVar = new ppr(this, awoqVar);
            }
        } else {
            pprVar = new ppr(this, awoqVar);
        }
        Object objL = pprVar.c;
        awox awoxVar = awox.a;
        int i3 = pprVar.e;
        try {
            try {
                if (i3 != 0) {
                    try {
                        if (i3 == 1) {
                            ppv ppvVar = pprVar.g;
                            pkx pkxVar = (pkx) pprVar.b;
                            account = (Account) pprVar.a;
                            str3 = pprVar.f;
                            atqp.j(objL);
                            r10 = ppvVar;
                            str = pkxVar;
                        } else if (i3 == 2) {
                            ppv ppvVar2 = pprVar.g;
                            pkx pkxVar2 = (pkx) pprVar.b;
                            account = (Account) pprVar.a;
                            str4 = pprVar.f;
                            atqp.j(objL);
                            r10 = ppvVar2;
                            str = pkxVar2;
                            pprVar.f = str4;
                            pprVar.a = str;
                            pprVar.b = r10;
                            pprVar.g = null;
                            pprVar.e = 3;
                            objL = l(account, str4, pprVar);
                            if (objL != awoxVar) {
                                return awoxVar;
                            }
                            r11 = r10;
                            r9 = str;
                        } else {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ppv ppvVar3 = (ppv) pprVar.b;
                            pkx pkxVar3 = (pkx) pprVar.a;
                            atqp.j(objL);
                            r11 = ppvVar3;
                            r9 = pkxVar3;
                        }
                        ppgVar = (ppg) objL;
                        this = r11;
                        str = r9;
                        Long l = ppgVar.c;
                        pkvVar = new pla(ppgVar.a);
                        r8 = this;
                    } catch (Exception e) {
                        e = e;
                        this = str;
                        str = str2;
                        awro.A(pprVar.getContext());
                        pkvVar = new pkv(e, (pkx) str);
                        r8 = this;
                    }
                    return r8.e(pkvVar);
                }
                atqp.j(objL);
                Account account2 = new Account(str, "com.google");
                pkx pkxVar4 = pkx.aD;
                pprVar.f = str2;
                pprVar.a = account2;
                pprVar.b = pkxVar4;
                pprVar.g = this;
                pprVar.e = 1;
                Object objL2 = l(account2, str2, pprVar);
                if (objL2 == awoxVar) {
                    return awoxVar;
                }
                account = account2;
                objL = objL2;
                str3 = str2;
                r10 = this;
                str = pkxVar4;
                ppgVar = (ppg) objL;
                if (q(ppgVar)) {
                    this = r10;
                    str = str;
                } else {
                    Long l2 = ppgVar.c;
                    pprVar.f = str3;
                    pprVar.a = account;
                    pprVar.b = str;
                    pprVar.g = r10;
                    pprVar.e = 2;
                    if (f(ppgVar, pprVar) == awoxVar) {
                        return awoxVar;
                    }
                    str4 = str3;
                    str = str;
                    r10 = r10;
                    pprVar.f = str4;
                    pprVar.a = str;
                    pprVar.b = r10;
                    pprVar.g = null;
                    pprVar.e = 3;
                    objL = l(account, str4, pprVar);
                    if (objL != awoxVar) {
                        return awoxVar;
                    }
                    r11 = r10;
                    r9 = str;
                    ppgVar = (ppg) objL;
                    this = r11;
                    str = r9;
                }
                Long l3 = ppgVar.c;
                pkvVar = new pla(ppgVar.a);
                r8 = this;
            } catch (Exception e2) {
                ?? r7 = r10;
                e = e2;
                this = r7;
                awro.A(pprVar.getContext());
                pkvVar = new pkv(e, (pkx) str);
                r8 = this;
            }
        } catch (Exception e3) {
            e = e3;
        }
        return r8.e(pkvVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(ppf ppfVar, awoq awoqVar) throws Exception {
        pps ppsVar;
        if (awoqVar instanceof pps) {
            ppsVar = (pps) awoqVar;
            int i2 = ppsVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ppsVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ppsVar = new pps(this, awoqVar);
            }
        } else {
            ppsVar = new pps(this, awoqVar);
        }
        Object obj = ppsVar.a;
        Object obj2 = awox.a;
        int i3 = ppsVar.c;
        if (i3 == 0) {
            atqp.j(obj);
            ppg ppgVar = (ppg) this.o.get(ppfVar);
            if (ppgVar != null) {
                if (q(ppgVar)) {
                    return ppgVar;
                }
                ppsVar.d = ppfVar;
                ppsVar.c = 1;
                if (f(ppgVar, ppsVar) != obj2) {
                }
            }
            return obj2;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
            return obj;
        }
        ppfVar = ppsVar.d;
        atqp.j(obj);
        ppsVar.d = null;
        ppsVar.c = 2;
        Object objJ = j(ppfVar, ppsVar);
        if (objJ != obj2) {
            return objJ;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(String str, String str2, awoq awoqVar) throws Throwable {
        ppt pptVar;
        Object next;
        if (awoqVar instanceof ppt) {
            pptVar = (ppt) awoqVar;
            int i2 = pptVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pptVar.c = i2 - Integer.MIN_VALUE;
            } else {
                pptVar = new ppt(this, awoqVar);
            }
        } else {
            pptVar = new ppt(this, awoqVar);
        }
        Object objH = pptVar.a;
        Object obj = awox.a;
        int i3 = pptVar.c;
        if (i3 == 0) {
            atqp.j(objH);
            jyq jyqVar = this.k;
            xyg xygVarA = jyk.a();
            xygVarA.f(str2);
            lpa lpaVarB = jyqVar.b(xygVarA.e());
            pptVar.d = str;
            pptVar.c = 1;
            objH = Callback.Helper.h(lpaVarB, pptVar);
            if (objH != obj) {
            }
            return obj;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = pptVar.d;
        atqp.j(objH);
        List list = ((jyl) objH).a;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!awrc.c(((jyp) next).c, str));
        obj = (jyp) next;
        if (obj == null) {
            throw new jxr("Account not found: ".concat(String.valueOf(str)));
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(awoq awoqVar) throws Throwable {
        ppu ppuVar;
        Exception e;
        pkx pkxVar;
        pky pkvVar;
        if (awoqVar instanceof ppu) {
            ppuVar = (ppu) awoqVar;
            int i2 = ppuVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ppuVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ppuVar = new ppu(this, awoqVar);
            }
        } else {
            ppuVar = new ppu(this, awoqVar);
        }
        Object obj = ppuVar.a;
        awox awoxVar = awox.a;
        int i3 = ppuVar.c;
        boolean z = false;
        if (i3 == 0) {
            atqp.j(obj);
            if (auuj.a.io().b()) {
                pkx pkxVar2 = pkx.b;
                try {
                    lpa lpaVarD = this.n.d(MoreExecutors.directExecutor(), this.k, new knd[0]);
                    ppuVar.d = pkxVar2;
                    ppuVar.c = 1;
                    Object objH = Callback.Helper.h(lpaVarD, ppuVar);
                    if (objH == awoxVar) {
                        return awoxVar;
                    }
                    obj = objH;
                    pkxVar = pkxVar2;
                } catch (Exception e2) {
                    e = e2;
                    pkxVar = pkxVar2;
                    awro.A(ppuVar.getContext());
                    pkvVar = new pkv(e, pkxVar);
                }
            }
            return Boolean.valueOf(z);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pkxVar = ppuVar.d;
        try {
            atqp.j(obj);
        } catch (Exception e3) {
            e = e3;
            awro.A(ppuVar.getContext());
            pkvVar = new pkv(e, pkxVar);
        }
        pkvVar = new pla(obj);
        if (pkvVar.i()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
