package defpackage;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rmj implements rmd {
    private static final agrf f = agrf.h("com/google/android/libraries/youtube/account/identity/DefaultIdentityStoreLockFix");
    public final SharedPreferences a;
    public final awmd b;
    public final rmb c;
    public final AtomicReference d;
    public final awmd e;
    private final Map g = new ConcurrentHashMap();
    private final boolean h;
    private final awmd i;
    private final awmd j;

    public rmj(SharedPreferences sharedPreferences, awmd awmdVar, tqj tqjVar, awmd awmdVar2, rmb rmbVar, awmd awmdVar3, awmd awmdVar4) {
        this.a = sharedPreferences;
        this.b = awmdVar;
        this.c = rmbVar;
        this.e = awmdVar2;
        this.i = awmdVar3;
        this.j = awmdVar4;
        int i = tqr.a;
        this.h = tqjVar.k(1073807601);
        this.d = new AtomicReference(rmi.c().e());
    }

    private final Stream C(final Predicate predicate, zwa zwaVar, agkz agkzVar, agke agkeVar, final int i) {
        return (zwaVar == null && agkzVar.isEmpty()) ? Stream.CC.empty() : Stream.CC.concat(Collection.EL.stream(agkzVar), Stream.CC.ofNullable(zwaVar)).filter(new rej(9)).filter(new Predicate() { // from class: rmf
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public final /* synthetic */ Predicate mo841negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                zwa zwaVar2 = (zwa) obj;
                zwaVar2.getClass();
                return predicate.test(zwaVar2);
            }
        }).map(new ris(12)).filter(new jmy(agkeVar, 16)).map(new Function() { // from class: rmg
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public final /* synthetic */ Function mo840andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                afhq afhqVar = (afhq) obj;
                this.a.A(i);
                return afhqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    static final void v(zvn zvnVar, String str) {
        zvp.a(zvnVar, zvm.I, str);
    }

    public final void A(int i) {
        dov dovVar = (dov) this.i.io();
        alos alosVar = (alos) alou.a.createBuilder();
        aihf aihfVarCreateBuilder = aiqy.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aiqy aiqyVar = (aiqy) aihfVarCreateBuilder.instance;
        aiqyVar.e = i - 1;
        aiqyVar.b |= 4;
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aiqy aiqyVar2 = (aiqy) aihfVarCreateBuilder.build();
        aiqyVar2.getClass();
        alouVar.d = aiqyVar2;
        alouVar.c = 389;
        dovVar.R((alou) alosVar.build());
    }

    public final boolean B(rmi rmiVar, wnt wntVar) {
        return a.av(this.d, rmiVar, wntVar.e());
    }

    @Override // defpackage.rmd
    public final ListenableFuture a(rlt rltVar) {
        return afxd.f(this.c.d(rltVar)).h(new ols(this, rltVar, 20), MoreExecutors.directExecutor()).g(new one(19), MoreExecutors.directExecutor()).b(IllegalStateException.class, new one(20), MoreExecutors.directExecutor());
    }

    @Override // defpackage.rmd
    public final void b() {
        rlt rltVarN;
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString(rmp.ACCOUNT_NAME, null);
        String string2 = sharedPreferences.getString(rmp.EXTERNAL_ID, null);
        String string3 = sharedPreferences.getString(rmp.DATASYNC_ID, "");
        boolean z = sharedPreferences.getBoolean(rmp.IS_INCOGNITO, false);
        boolean z2 = sharedPreferences.getBoolean(rmp.PERSONA_ACCOUNT, false);
        boolean z3 = sharedPreferences.getBoolean(rmp.IS_UNICORN, false);
        boolean z4 = sharedPreferences.getBoolean(rmp.IS_GRIFFIN, false);
        boolean z5 = sharedPreferences.getBoolean(rmp.IS_TEENACORN, false);
        int iAV = a.aV(sharedPreferences.getInt(rmp.DELEGATION_TYPE, 1));
        if (iAV == 0) {
            iAV = 2;
        }
        String string4 = sharedPreferences.getString(rmp.PAGE_ID, null);
        String string5 = sharedPreferences.getString(rmp.DELEGATION_CONTEXT, "NO_DELEGATION_CONTEXT");
        if (true == Objects.equals(string4, "No +Page Delegate")) {
            string4 = "";
        }
        if (Objects.equals(string3, "") && string2 != null) {
            zvn zvnVar = zvn.b;
            o(zvnVar, "Data sync id is empty");
            v(zvnVar, "[Clockwork][Database]Dropping pref acct w/ empty datasync id");
            string3 = string2;
        }
        if (!z && t()) {
            boolean z6 = false;
            int i = sharedPreferences.getInt(rmp.NEXT_INCOGNITO_SESSION_INDEX, 0);
            String strA = rlh.a(i);
            while (true) {
                i++;
                if (((rmc) this.c).j(strA, z6) == null) {
                    break;
                }
                strA = rlh.a(i);
                z6 = false;
            }
            sharedPreferences.edit().putInt(rmp.NEXT_INCOGNITO_SESSION_INDEX, i).apply();
            rltVarN = rlt.n(strA, "INCOGNITO_ACCOUNT_NAME", null, true, false, false, false, false, false, 2, strA);
            i(rltVarN, false);
        } else if (string == null || string2 == null) {
            rltVarN = null;
        } else if (z) {
            rltVarN = rlt.n(string2, "INCOGNITO_ACCOUNT_NAME", null, true, false, false, false, false, false, 2, string3);
        } else {
            String str = string3;
            if (z2) {
                rltVarN = rlt.n(string2, string, null, false, false, true, false, false, false, 3, str);
            } else if (z3) {
                rltVarN = iAV == 3 ? rlt.n(string2, string, null, false, false, false, true, false, false, 3, str) : rlt.n(string2, string, null, false, false, false, true, false, z5, 2, str);
            } else if (z4) {
                rltVarN = iAV == 3 ? rlt.n(string2, string, null, false, false, false, false, true, false, 3, str) : rlt.n(string2, string, null, false, false, false, false, true, z5, 2, str);
            } else {
                rltVarN = (Objects.equals(string5, "NO_DELEGATION_CONTEXT") || TextUtils.isEmpty(string5)) ? rlt.n(string2, string, string4, false, false, false, false, false, false, 2, str) : rlt.o(string2, string, str, iAV, string5);
            }
        }
        AtomicReference atomicReference = this.d;
        wnt wntVarC = rmi.c();
        wntVarC.a = rltVarN;
        wntVarC.b = null;
        atomicReference.set(wntVarC.e());
    }

    @Override // defpackage.rmw
    public final rmv c() {
        rmi rmiVar;
        rmv rmvVarA;
        wnt wntVar;
        rlt rltVar = null;
        do {
            rmiVar = (rmi) this.d.get();
            rmvVarA = rmiVar.c;
            if (rmvVarA != null) {
                break;
            }
            rlt rltVar2 = rmiVar.b;
            if (rltVar != rltVar2) {
                rltVar2.getClass();
                rmvVarA = this.c.a(rltVar2);
                rltVar = rltVar2;
            }
            if (rmvVarA == null) {
                rmvVarA = rmv.a;
            }
            wntVar = new wnt(rmiVar);
            wntVar.b = rmvVarA;
        } while (!B(rmiVar, wntVar));
        return rmvVarA;
    }

    @Override // defpackage.rmw
    public final rmv d(rlt rltVar) {
        return this.c.a(rltVar);
    }

    @Override // defpackage.zwb
    public final zwa e() {
        return ((rmi) this.d.get()).a();
    }

    @Override // defpackage.zwb
    public final zwa f(String str) {
        taq.c();
        if ("".equals(str)) {
            return zvz.a;
        }
        rlt rltVar = ((rmi) this.d.get()).b;
        if (rltVar == null || !rltVar.a.equals(str)) {
            return rlh.b(str) ? rlt.n(str, "INCOGNITO_ACCOUNT_NAME", null, true, false, false, false, false, false, 2, str) : ((rmc) this.c).j(str, false);
        }
        return rltVar;
    }

    @Override // defpackage.rmu
    public final ListenableFuture g() {
        return ahng.o(afxd.f(((omj) this.b.io()).J()).g(new onn(this, 19), MoreExecutors.directExecutor()).b(Throwable.class, new onn(this, 20), MoreExecutors.directExecutor()).h(new qmu(this, 9), MoreExecutors.directExecutor()));
    }

    @Override // defpackage.rmu
    public final ListenableFuture h(rlt rltVar) {
        return i(rltVar, false);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Set] */
    public final ListenableFuture i(rlt rltVar, boolean z) {
        rmi rmiVar;
        wnt wntVar;
        SharedPreferences.Editor editorPutInt = this.a.edit().putInt(rmp.IDENTITY_VERSION, 2);
        if (rltVar == null) {
            editorPutInt.remove(rmp.ACCOUNT_NAME).remove(rmp.PAGE_ID).remove(rmp.PERSONA_ACCOUNT).remove(rmp.EXTERNAL_ID).remove(rmp.USERNAME).remove(rmp.DATASYNC_ID).remove(rmp.IS_UNICORN).remove(rmp.IS_GRIFFIN).remove(rmp.IS_TEENACORN).remove(rmp.DELEGATION_TYPE).remove(rmp.DELEGATION_CONTEXT).putBoolean(rmp.USER_SIGNED_OUT, z);
        } else {
            SharedPreferences.Editor editorPutBoolean = editorPutInt.putString(rmp.ACCOUNT_NAME, rltVar.b).putString(rmp.PAGE_ID, rltVar.c).putBoolean(rmp.PERSONA_ACCOUNT, rltVar.f);
            boolean z2 = rltVar.d;
            editorPutBoolean.putBoolean(rmp.IS_INCOGNITO, z2).putString(rmp.EXTERNAL_ID, rltVar.a).putString(rmp.DATASYNC_ID, rltVar.g).putBoolean(rmp.IS_UNICORN, rltVar.h).putBoolean(rmp.IS_GRIFFIN, rltVar.i).putBoolean(rmp.IS_TEENACORN, rltVar.j).putInt(rmp.DELEGATION_TYPE, rltVar.l - 1).putString(rmp.DELEGATION_CONTEXT, rltVar.k);
            if (!z2) {
                editorPutInt.putBoolean(rmp.USER_SIGNED_OUT, false).remove("incognito_visitor_id");
                taf.g(((omj) this.b.io()).G(), new gpq(12));
            }
        }
        editorPutInt.apply();
        if (rltVar != null) {
            typ.f(rltVar.a);
            typ.f(rltVar.b);
            this.c.d(rltVar);
            if (!rltVar.d) {
                this.g.put(rltVar.g, rltVar);
            }
            do {
                rmiVar = (rmi) this.d.get();
                wntVar = new wnt(rmiVar);
                Object hashSet = wntVar.d;
                if (hashSet == null) {
                    hashSet = new HashSet();
                }
                wntVar.d = hashSet;
                wntVar.d.add(rltVar);
            } while (!B(rmiVar, wntVar));
        }
        axfd axfdVar = (axfd) this.e.io();
        return ahng.o(afxd.f(axfdVar.Q(rltVar == null ? zvz.a : rltVar)).g(new one(17), MoreExecutors.directExecutor()).b(Throwable.class, new one(18), MoreExecutors.directExecutor()).h(new qzc(this, rltVar, axfdVar, 3), MoreExecutors.directExecutor()));
    }

    @Override // defpackage.rmu
    public final ListenableFuture j(boolean z) {
        return i(null, z);
    }

    @Override // defpackage.zvu
    public final String k() {
        boolean zT = t();
        SharedPreferences sharedPreferences = this.a;
        return zT ? sharedPreferences.getString("incognito_visitor_id", null) : sharedPreferences.getString("visitor_id", null);
    }

    @Override // defpackage.rmu
    public final List l(Account[] accountArr) {
        taq.c();
        accountArr.getClass();
        int length = accountArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = accountArr[i].name;
        }
        return this.c.e(strArr);
    }

    @Override // defpackage.rmw
    public final void m() {
        rmi rmiVar;
        wnt wntVar;
        do {
            rmiVar = (rmi) this.d.get();
            if (!rmiVar.b()) {
                return;
            }
            wntVar = new wnt(rmiVar);
            wntVar.b = rmv.a;
        } while (!B(rmiVar, wntVar));
    }

    @Override // defpackage.rmw
    public final void n(rlt rltVar) {
        rmi rmiVar;
        String str;
        wnt wntVar;
        do {
            rmiVar = (rmi) this.d.get();
            String strK = rmiVar.a().k();
            str = rltVar.a;
            if (!strK.equals(str)) {
                break;
            }
            wntVar = new wnt(rmiVar);
            wntVar.b = rmv.a;
        } while (!B(rmiVar, wntVar));
        this.c.g(str);
    }

    public final void o(zvn zvnVar, String str) {
        if (this.h) {
            v(zvnVar, str);
        }
    }

    @Override // defpackage.rmu
    public final void p(List list) {
        taq.c();
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((rlt) list.get(i)).b;
        }
        this.c.f(strArr);
    }

    @Override // defpackage.rmu
    public final void q(String str, String str2) {
        String str3;
        while (true) {
            rmi rmiVar = (rmi) this.d.get();
            if (!rmiVar.b()) {
                break;
            }
            rlt rltVar = rmiVar.b;
            if (!str.equals(rltVar.b)) {
                break;
            }
            str3 = str2;
            rlt rltVarN = rlt.n(rltVar.a, str3, rltVar.c, false, false, false, false, false, false, 2, rltVar.g);
            wnt wntVar = new wnt(rmiVar);
            wntVar.a = rltVarN;
            if (B(rmiVar, wntVar)) {
                this.a.edit().putString(rmp.ACCOUNT_NAME, str3).apply();
            } else {
                str2 = str3;
            }
            this.c.h(str, str3);
        }
        str3 = str2;
        this.c.h(str, str3);
    }

    @Override // defpackage.rmw
    public final void r(rmv rmvVar) {
        rmi rmiVar;
        rlt rltVar;
        wnt wntVar;
        do {
            rmiVar = (rmi) this.d.get();
            if (!rmiVar.b() || Objects.equals(rmiVar.c, rmvVar)) {
                return;
            }
            rltVar = rmiVar.b;
            wntVar = new wnt(rmiVar);
            wntVar.b = rmvVar;
        } while (!B(rmiVar, wntVar));
        this.c.i(rltVar.a, rmvVar);
    }

    @Override // defpackage.rmw
    public final void s(rmv rmvVar) {
        ((Executor) this.j.io()).execute(afwl.i(new rhz(this, rmvVar, 10, null)));
    }

    public final boolean t() {
        return this.a.getString("incognito_visitor_id", null) != null;
    }

    @Override // defpackage.zwb
    public final boolean u() {
        return ((rmi) this.d.get()).b();
    }

    @Override // defpackage.rqu
    public final agke w() {
        taq.c();
        AtomicReference atomicReference = this.d;
        agke agkeVarB = this.c.b();
        rmi rmiVar = (rmi) atomicReference.get();
        rlt rltVar = rmiVar.b;
        agkz agkzVar = rmiVar.a;
        if (rltVar == null && agkzVar.isEmpty()) {
            return agkeVarB;
        }
        agjz agjzVar = new agjz(4);
        agjzVar.j(agkeVarB);
        C(new rej(8), rltVar, agkzVar, agkeVarB, 19).forEach(new rme(agjzVar, 0));
        return agjzVar.g();
    }

    @Override // defpackage.rqu
    public final agke x() {
        taq.c();
        AtomicReference atomicReference = this.d;
        agke agkeVarC = this.c.c();
        rmi rmiVar = (rmi) atomicReference.get();
        rlt rltVar = rmiVar.b;
        agkz agkzVar = rmiVar.a;
        if (rltVar == null && agkzVar.isEmpty()) {
            A(20);
            return agkeVarC;
        }
        agjz agjzVar = new agjz(4);
        agjzVar.j(agkeVarC);
        C(new rej(11), rltVar, agkzVar, agkeVarC, 18).forEach(new rme(agjzVar, 0));
        return agjzVar.g();
    }

    @Override // defpackage.zwe
    public final zwa y(String str) {
        rlt rltVar = ((rmi) this.d.get()).b;
        if (rltVar != null && rltVar.g.equals(str)) {
            return rltVar;
        }
        Map map = this.g;
        zwa zwaVar = (zwa) map.get(str);
        if (zwaVar == null) {
            if ("".equals(str)) {
                return zvz.a;
            }
            if (rlh.b(str)) {
                return rlt.n(str, "INCOGNITO_ACCOUNT_NAME", null, true, false, false, false, false, false, 2, str);
            }
            if (!taq.e()) {
                ((agrc) ((agrc) f.c()).k("com/google/android/libraries/youtube/account/identity/DefaultIdentityStoreLockFix", "getIdentityByDataSyncId", 218, "DefaultIdentityStoreLockFix.java")).t("AbstractIdentityStore getIdentityByDataSyncId() hitting DB on main thread.");
            }
            zwaVar = (zwa) map.get(str);
            if (zwaVar == null) {
                zwa zwaVarJ = ((rmc) this.c).j(str, true);
                if (zwaVarJ != null) {
                    map.put(str, zwaVarJ);
                }
                return zwaVarJ;
            }
        }
        return zwaVar;
    }

    @Override // defpackage.rqu
    public final agke z() {
        rmi rmiVar = (rmi) this.d.get();
        rlt rltVar = rmiVar.b;
        agkz agqjVar = rmiVar.a;
        if (agqjVar.isEmpty() && rltVar == null) {
            return agpi.a;
        }
        if (agqjVar.isEmpty()) {
            rltVar.getClass();
            agqjVar = new agqj(rltVar);
        }
        return (agke) Collection.EL.stream(agqjVar).filter(new rej(10)).map(new ris(13)).collect(aghu.a);
    }
}
