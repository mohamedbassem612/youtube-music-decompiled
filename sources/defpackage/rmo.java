package defpackage;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rmo implements rmd {
    private static final agrf h = agrf.h("com/google/android/libraries/youtube/account/identity/DefaultIdentityStoreOld");
    public final SharedPreferences a;
    public final awmd b;
    public final rmb c;
    public final boolean d;
    public final awmd e;
    public final boolean f;
    public final awmd g;
    private final Map i;
    private rlt j;
    private final Set k = new HashSet();
    private rmv l;
    private boolean m;
    private volatile boolean n;
    private final awmd o;

    public rmo(SharedPreferences sharedPreferences, awmd awmdVar, tqj tqjVar, awmd awmdVar2, rmb rmbVar, awmd awmdVar3, awmd awmdVar4) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        this.b = awmdVar;
        this.c = rmbVar;
        awmdVar2.getClass();
        this.g = awmdVar2;
        this.o = awmdVar3;
        this.e = awmdVar4;
        this.i = new HashMap();
        this.n = false;
        int i = tqr.a;
        this.d = tqjVar.k(1073807601);
        this.f = tqjVar.t(524288L);
    }

    private final synchronized void A(rlt rltVar) {
        if (!rltVar.d) {
            this.i.put(rltVar.g, rltVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0011), top: B:17:0x0003 }] */
    private final synchronized Stream B(final Predicate predicate, zwa zwaVar, agke agkeVar, final int i) {
        Stream streamEmpty;
        if (zwaVar != null) {
            streamEmpty = Stream.CC.concat(Collection.EL.stream(this.k), Stream.CC.ofNullable(zwaVar)).filter(new gqn(10)).filter(new Predicate() { // from class: rml
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
            }).map(new rmm(0)).filter(new hkn(agkeVar, 8)).map(new Function() { // from class: rmn
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public final /* synthetic */ Function mo840andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    rmo rmoVar = this.a;
                    int i2 = i;
                    afhq afhqVar = (afhq) obj;
                    if (rmoVar.f) {
                        ((Executor) rmoVar.e.io()).execute(new rir(rmoVar, i2, 2));
                    } else {
                        rmoVar.v(i2);
                    }
                    return afhqVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else if (this.k.isEmpty()) {
            streamEmpty = Stream.CC.empty();
        } else {
            streamEmpty = Stream.CC.concat(Collection.EL.stream(this.k), Stream.CC.ofNullable(zwaVar)).filter(new gqn(10)).filter(new Predicate() { // from class: rml
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
            }).map(new rmm(0)).filter(new hkn(agkeVar, 8)).map(new Function() { // from class: rmn
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public final /* synthetic */ Function mo840andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    rmo rmoVar = this.a;
                    int i2 = i;
                    afhq afhqVar = (afhq) obj;
                    if (rmoVar.f) {
                        ((Executor) rmoVar.e.io()).execute(new rir(rmoVar, i2, 2));
                    } else {
                        rmoVar.v(i2);
                    }
                    return afhqVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        throw th;
        return streamEmpty;
    }

    @Override // defpackage.rmd
    public final ListenableFuture a(rlt rltVar) {
        return afxd.f(this.c.d(rltVar)).h(new row(this, rltVar, 1), MoreExecutors.directExecutor()).g(new rmk(1), MoreExecutors.directExecutor()).b(IllegalStateException.class, new rmk(0), MoreExecutors.directExecutor());
    }

    @Override // defpackage.rmw
    public final synchronized rmv c() {
        rmv rmvVar;
        if (u()) {
            if (!this.m) {
                this.l = this.c.a(this.j);
                this.m = true;
            }
            rmvVar = this.l;
        } else {
            rmvVar = rmv.a;
        }
        return rmvVar;
    }

    @Override // defpackage.rmw
    public final synchronized rmv d(rlt rltVar) {
        return this.c.a(rltVar);
    }

    @Override // defpackage.zwb
    public final synchronized zwa e() {
        zwa zwaVar;
        if (!this.n) {
            i();
        }
        zwaVar = this.j;
        if (zwaVar == null) {
            zwaVar = zvz.a;
        }
        return zwaVar;
    }

    @Override // defpackage.zwb
    public final zwa f(String str) {
        taq.c();
        if (!this.n) {
            i();
        }
        if ("".equals(str)) {
            return zvz.a;
        }
        rlt rltVar = this.j;
        if (rltVar == null || !rltVar.a.equals(str)) {
            return rlh.b(str) ? rlt.n(str, "INCOGNITO_ACCOUNT_NAME", null, true, false, false, false, false, false, 2, str) : ((rmc) this.c).j(str, false);
        }
        return rltVar;
    }

    @Override // defpackage.rmu
    public final synchronized ListenableFuture g() {
        return afxd.f(((omj) this.b.io()).J()).h(new qmu(this, 10), MoreExecutors.directExecutor()).c(Throwable.class, new qmu(this, 11), MoreExecutors.directExecutor());
    }

    @Override // defpackage.rmu
    public final synchronized ListenableFuture h(rlt rltVar) {
        String str = rltVar.a;
        typ.f(str);
        String str2 = rltVar.b;
        typ.f(str2);
        SharedPreferences sharedPreferences = this.a;
        SharedPreferences.Editor editorPutBoolean = sharedPreferences.edit().putString(rmp.ACCOUNT_NAME, str2).putString(rmp.PAGE_ID, rltVar.c).putBoolean(rmp.PERSONA_ACCOUNT, rltVar.f);
        boolean z = rltVar.d;
        editorPutBoolean.putBoolean(rmp.IS_INCOGNITO, z).putString(rmp.EXTERNAL_ID, str).putInt(rmp.IDENTITY_VERSION, 2).putString(rmp.DATASYNC_ID, rltVar.g).putBoolean(rmp.IS_UNICORN, rltVar.h).putBoolean(rmp.IS_GRIFFIN, rltVar.i).putBoolean(rmp.IS_TEENACORN, rltVar.j).putInt(rmp.DELEGATION_TYPE, rltVar.l - 1).putString(rmp.DELEGATION_CONTEXT, rltVar.k).apply();
        if (!z) {
            sharedPreferences.edit().putBoolean(rmp.USER_SIGNED_OUT, false).remove("incognito_visitor_id").apply();
            taf.g(((omj) this.b.io()).G(), new gpq(16));
        }
        this.c.d(rltVar);
        A(rltVar);
        this.k.add(rltVar);
        return ahno.ar(((axfd) this.g.io()).Q(rltVar), new kjh(this, rltVar, 14), MoreExecutors.directExecutor());
    }

    protected final synchronized void i() {
        String str;
        rlt rltVarN;
        if (this.n) {
            return;
        }
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
        String string4 = sharedPreferences.getString(rmp.PAGE_ID, null);
        if (true == "No +Page Delegate".equals(string4)) {
            string4 = "";
        }
        String str2 = string4;
        boolean zEquals = "".equals(string3);
        String string5 = sharedPreferences.getString(rmp.DELEGATION_CONTEXT, "NO_DELEGATION_CONTEXT");
        if (!zEquals || string2 == null) {
            str = string3;
        } else {
            if (this.d) {
                zvp.a(zvn.b, zvm.I, "Data sync id is empty");
            }
            zvp.a(zvn.b, zvm.I, "[Clockwork][Database]Dropping pref acct w/ empty datasync id");
            str = string2;
        }
        if (!z && t()) {
            int i = sharedPreferences.getInt(rmp.NEXT_INCOGNITO_SESSION_INDEX, 0);
            String strA = rlh.a(i);
            while (true) {
                i++;
                if (((rmc) this.c).j(strA, false) == null) {
                    break;
                } else {
                    strA = rlh.a(i);
                }
            }
            sharedPreferences.edit().putInt(rmp.NEXT_INCOGNITO_SESSION_INDEX, i).apply();
            rltVarN = rlt.n(strA, "INCOGNITO_ACCOUNT_NAME", null, true, false, false, false, false, false, 2, strA);
            h(rltVarN);
        } else if (string == null || string2 == null) {
            rltVarN = null;
        } else if (z) {
            rltVarN = rlt.n(string2, "INCOGNITO_ACCOUNT_NAME", null, true, false, false, false, false, false, 2, str);
        } else if (z2) {
            rltVarN = rlt.n(string2, string, null, false, false, true, false, false, false, 3, str);
        } else if (z3) {
            if (iAV == 0) {
                throw null;
            }
            rltVarN = iAV == 3 ? rlt.n(string2, string, null, false, false, false, true, false, false, 3, str) : rlt.n(string2, string, null, false, false, false, true, false, z5, 2, str);
        } else if (!z4) {
            String str3 = str;
            rltVarN = ("NO_DELEGATION_CONTEXT".equals(string5) || TextUtils.isEmpty(string5)) ? rlt.n(string2, string, str2, false, false, false, false, false, false, 2, str3) : rlt.o(string2, string, str3, iAV, string5);
        } else {
            if (iAV == 0) {
                throw null;
            }
            rltVarN = iAV == 3 ? rlt.n(string2, string, null, false, false, false, false, true, false, 3, str) : rlt.n(string2, string, null, false, false, false, false, true, z5, 2, str);
        }
        this.j = rltVarN;
        this.m = false;
        this.l = rmv.a;
        this.n = true;
    }

    @Override // defpackage.rmu
    public final synchronized ListenableFuture j(boolean z) {
        this.a.edit().remove(rmp.ACCOUNT_NAME).remove(rmp.PAGE_ID).remove(rmp.PERSONA_ACCOUNT).remove(rmp.EXTERNAL_ID).remove(rmp.USERNAME).remove(rmp.DATASYNC_ID).remove(rmp.IS_UNICORN).remove(rmp.IS_GRIFFIN).remove(rmp.IS_TEENACORN).remove(rmp.DELEGATION_TYPE).remove(rmp.DELEGATION_CONTEXT).putBoolean(rmp.USER_SIGNED_OUT, z).putInt(rmp.IDENTITY_VERSION, 2).apply();
        this.n = false;
        this.j = null;
        this.l = rmv.a;
        this.m = true;
        return ahcs.e(((axfd) this.g.io()).Q(zvz.a), afwl.a(new rns(this, 1)), MoreExecutors.directExecutor());
    }

    @Override // defpackage.zvu
    public final synchronized String k() {
        boolean zT;
        SharedPreferences sharedPreferences;
        zT = t();
        sharedPreferences = this.a;
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
    public final synchronized void m() {
        if (u()) {
            this.l = rmv.a;
            this.m = true;
        }
    }

    @Override // defpackage.rmw
    public final void n(rlt rltVar) {
        String strK = e().k();
        String str = rltVar.a;
        if (strK.equals(str)) {
            this.l = rmv.a;
        }
        this.c.g(str);
    }

    public final synchronized void o(rlt rltVar) {
        this.k.remove(rltVar);
        this.j = rltVar;
        this.l = rmv.a;
        this.m = false;
        this.n = true;
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
    public final synchronized void q(String str, String str2) {
        String str3;
        if (u() && str.equals(this.j.b)) {
            rlt rltVar = this.j;
            str3 = str2;
            this.j = rlt.n(rltVar.a, str3, rltVar.c, false, false, false, false, false, false, 2, rltVar.g);
            this.a.edit().putString(rmp.ACCOUNT_NAME, str3).apply();
        } else {
            str3 = str2;
        }
        this.c.h(str, str3);
    }

    @Override // defpackage.rmw
    public final synchronized void r(rmv rmvVar) {
        if (!u() || Objects.equals(this.l, rmvVar)) {
            return;
        }
        this.l = rmvVar;
        this.m = true;
        this.c.i(this.j.a, rmvVar);
    }

    @Override // defpackage.rmw
    public final void s(rmv rmvVar) {
        ((Executor) this.e.io()).execute(afwl.i(new rhz(this, rmvVar, 11, null)));
    }

    public final boolean t() {
        return this.a.getString("incognito_visitor_id", null) != null;
    }

    @Override // defpackage.zwb
    public final synchronized boolean u() {
        if (!this.n) {
            i();
        }
        rlt rltVar = this.j;
        return (rltVar == null || rltVar.d) ? false : true;
    }

    public final void v(int i) {
        dov dovVar = (dov) this.o.io();
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

    @Override // defpackage.rqu
    public final synchronized agke w() {
        agke agkeVarB;
        taq.c();
        agkeVarB = this.c.b();
        if (this.j != null || !this.k.isEmpty()) {
            agjz agjzVar = new agjz(4);
            agjzVar.j(agkeVarB);
            B(new gqn(11), this.j, agkeVarB, 19).forEach(new jap(agjzVar, 6));
            agkeVarB = agjzVar.g();
        }
        return agkeVarB;
    }

    @Override // defpackage.rqu
    public final synchronized agke x() {
        agjz agjzVar;
        taq.c();
        agke agkeVarC = this.c.c();
        e();
        agjzVar = new agjz(4);
        agjzVar.j(agkeVarC);
        B(new gqn(9), this.j, agkeVarC, 18).forEach(new jap(agjzVar, 6));
        return agjzVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [rlt] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [zwa] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    @Override // defpackage.zwe
    public final zwa y(String str) {
        zwa zwaVarJ;
        if (!this.n) {
            i();
        }
        ?? N = this.j;
        if (N == 0 || !N.g.equals(str)) {
            synchronized (this) {
                zwa zwaVar = (zwa) this.i.get(str);
                if (zwaVar != null) {
                    N = zwaVar;
                } else if ("".equals(str)) {
                    N = zvz.a;
                } else if (rlh.b(str)) {
                    N = rlt.n(str, "INCOGNITO_ACCOUNT_NAME", null, true, false, false, false, false, false, 2, str);
                } else {
                    if (a.x()) {
                        ((agrc) ((agrc) h.c()).k("com/google/android/libraries/youtube/account/identity/DefaultIdentityStoreOld", "getIdentityByDataSyncId", SemanticState.Hidden, "DefaultIdentityStoreOld.java")).t("AbstractIdentityStore getIdentityByDataSyncId() hitting DB on main thread.");
                    }
                    synchronized (this) {
                        Map map = this.i;
                        zwaVarJ = (zwa) map.get(str);
                        if (zwaVarJ == null) {
                            zwaVarJ = ((rmc) this.c).j(str, true);
                            if (zwaVarJ != null) {
                                map.put(str, zwaVarJ);
                            }
                        }
                    }
                    N = zwaVarJ;
                }
            }
        }
        return N;
    }

    @Override // defpackage.rqu
    public final synchronized agke z() {
        agke agkeVar;
        rlt rltVar = this.j;
        Set agqjVar = this.k;
        if (agqjVar.isEmpty() && rltVar == null) {
            agkeVar = agpi.a;
        } else {
            if (agqjVar.isEmpty()) {
                rltVar.getClass();
                agqjVar = new agqj(rltVar);
            }
            agkeVar = (agke) Collection.EL.stream(agqjVar).filter(new gqn(8)).map(new rmm(2)).collect(aghu.a);
        }
        return agkeVar;
    }

    @Override // defpackage.rmd
    public final /* synthetic */ void b() {
    }
}
