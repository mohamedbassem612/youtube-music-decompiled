package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class afpu implements auph {
    private static final agrf a = agrf.h("com/google/apps/tiktok/inject/processor/generateaccount/FragmentAccountComponentManager");
    private volatile Object b;
    private volatile affd c;
    private final Object d = new Object();
    private final cc e;
    private final boolean f;
    private final ahud g;

    public afpu(cc ccVar, boolean z) {
        this.e = ccVar;
        this.f = z;
        this.g = new ahud(ccVar, (byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final void d(cc ccVar, int i) {
        ahno.Q((i ^ (-1)) >>> 31, "AccountId is invalid: %s", i);
        auom.f(ccVar);
        ccVar.getArguments().putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", i);
    }

    public static final void e(cc ccVar, affd affdVar) {
        affdVar.getClass();
        d(ccVar, affdVar.a);
    }

    public static void f(cc ccVar) {
        auom.f(ccVar);
        ccVar.getArguments().putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", -1);
    }

    private final affd g() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    cc ccVar = this.e;
                    ccVar.getHost().getClass();
                    ahno.R(ccVar.getHost() instanceof auph, "Sting Fragments must be attached to an @Sting Activity. Found: %s", ccVar.getHost().getClass());
                    b(ccVar);
                    Bundle arguments = ccVar.getArguments();
                    affd affdVarA = null;
                    if (arguments != null && arguments.containsKey("TIKTOK_FRAGMENT_ACCOUNT_ID")) {
                        affdVarA = affd.a(arguments.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID"));
                    }
                    affd affdVar = affdVarA;
                    if (this.f && affdVar == null) {
                        afpp afppVar = new afpp("Exception while injecting account Fragment bindings because of missing AccountId in account Fragment's arguments");
                        if (!((Boolean) ((afps) atqp.a(a.aJ(ccVar.getContext().getApplicationContext()), afps.class)).bn().e(Boolean.FALSE)).booleanValue()) {
                            throw new afpp("Account id is not set in the account Fragment. Possible causes:\n\t1. This account Fragment is @GenerateAccountFragment and was created without calling setBundledAccountId on itself after creation.\n\t2. This account Fragment's arguments were overridden without preserving the previous arguments.\n\t3. This account Fragment is declared in an XML but not as a navigation destination.\n\t4. This account Fragment is declared in an XML as a navigation destination, but the account navigation is not correctly setup with AccountNavigation (go/tiktok-navigation#navigating)");
                        }
                        ((agrc) ((agrc) ((agrc) a.b()).j(afppVar)).k("com/google/apps/tiktok/inject/processor/generateaccount/FragmentAccountComponentManager", "getAccountIdInternal", (char) 166, "FragmentAccountComponentManager.java")).t("Fragment AccountId check failed.");
                    }
                    if (((agev) ((afpr) atqp.a(ccVar.getHost(), afpr.class)).cx().a).g()) {
                        agev agevVarJ = ((afpt) atqp.a(aguu.ay(ccVar), afpt.class)).j();
                        if (affdVar == null) {
                            affdVar = (affd) ((agfa) agevVarJ).a;
                            int i = affdVar.a;
                            if (i != -1) {
                                d(ccVar, i);
                            }
                        } else {
                            Object obj = ((agfa) agevVarJ).a;
                            if (((affd) obj).a != -1) {
                                ahno.U(obj.equals(affdVar), "The given account id does not match the propagated account id.\n\tPropagated AccountId: %s\n\tGiven AccountId: %s", obj, affdVar);
                            }
                        }
                    }
                    this.c = affdVar;
                }
            }
        }
        return this.c;
    }

    protected Object a() {
        affd affdVarG = g();
        cc ccVar = this.e;
        gie gieVarA = ((afpq) atqp.a(aguu.ax(affdVarG, ccVar).generatedComponent(), afpq.class)).a();
        gieVarA.b = ccVar;
        gieVarA.c = ((afpx) this.g.U(this.c).a(afpx.class)).a;
        atqq.b(gieVarA.b, cc.class);
        atqq.b(gieVarA.c, afoy.class);
        cc ccVar2 = gieVarA.b;
        gjt gjtVar = gieVarA.g;
        gju gjuVar = gieVarA.e;
        return new gjx(gieVarA.a, gieVarA.d, gjuVar, gjtVar, ccVar2);
    }

    protected void b(cc ccVar) {
        if (ccVar.getArguments() != null && ccVar.getArguments().getBoolean("TIKTOK_FRAGMENT_NO_ACCOUNT_ONLY")) {
            throw new IllegalArgumentException("Account-scoped Fragment cannot be instantiated with an argument bundle marking it as no-Account only. If you are using NoAccountNavigation, you must switch to AccountNavigation to navigate to this fragment.");
        }
    }

    public final void c() {
        qpj.c();
        auor auorVar = ((afpx) this.g.U(g()).a(afpx.class)).b;
        if (auorVar.c()) {
            auorVar.b(this.e.getDefaultViewModelCreationExtras());
        }
        this.e.getLifecycle().b(new afns(auorVar, 2));
    }

    @Override // defpackage.auph
    public final Object generatedComponent() {
        if (this.b == null) {
            synchronized (this.d) {
                if (this.b == null) {
                    this.b = a();
                }
            }
        }
        return this.b;
    }
}
