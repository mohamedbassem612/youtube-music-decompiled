package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kjn extends kmz implements kij {
    public static final kkc a = new kkc();

    public kjn(Context context) {
        khn khnVar = kii.l;
        kmr kmrVar = kms.f;
        gat gatVar = new gat();
        gatVar.b = new kro();
        super(context, null, khnVar, kmrVar, gatVar.f());
    }

    public static boolean d(ListenableFuture listenableFuture) {
        if (!listenableFuture.isDone() || listenableFuture.isCancelled()) {
            return false;
        }
        try {
            a.i(listenableFuture);
            return true;
        } catch (RuntimeException | ExecutionException unused) {
            return false;
        }
    }

    private final lpa f(kic kicVar, kid kidVar) {
        return kidVar != null ? g(kicVar, new kjh(this, kidVar, 0)) : g(kicVar, new gqq(this, 15));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final lpa g(kic kicVar, agek agekVar) {
        ListenableFuture listenableFuture;
        int i;
        int i2 = 1;
        if (kicVar.k) {
            Log.e("AbstractLogEventBuilder", "resolveComplianceData should not be invoked more than once per log.");
            listenableFuture = aher.a;
        } else {
            kicVar.k = true;
            kib kibVar = kicVar.a;
            kio kioVar = kibVar.j;
            kiq kiqVar = null;
            kiq kiqVarA = kioVar != null ? kioVar.a() : null;
            if (kiqVarA == null || (i = kiqVarA.b) == 4 || i == 5) {
                kiqVar = kiqVarA;
            } else {
                Log.e("AbstractLogEventBuilder", "The provided logger-level ProductIdOrigin value " + Integer.toString(i - 1) + " is not one of the values expected for a logger-level provider: 3 or 4");
            }
            int i3 = 2;
            if (kiqVar == null || kiqVar.b != 4) {
                kiq kiqVar2 = kicVar.i;
                if (kiqVar2 != null && kiqVar2.b == 2) {
                    kicVar.g(kiqVar2);
                } else if (kiqVar != null) {
                    kicVar.g(kiqVar);
                } else if (kiqVar2 != null) {
                    kicVar.g(kiqVar2);
                }
            } else {
                kicVar.g(kiqVar);
            }
            if (kibVar.d()) {
                listenableFuture = aher.a;
            } else {
                ListenableFuture listenableFuture2 = aher.a;
                idm idmVar = new idm(kicVar, listenableFuture2, i3);
                Executor executorDirectExecutor = MoreExecutors.directExecutor();
                int i4 = ahcs.c;
                ahcq ahcqVar = new ahcq(listenableFuture2, idmVar);
                listenableFuture2.addListener(ahcqVar, MoreExecutors.c(executorDirectExecutor, ahcqVar));
                gqq gqqVar = new gqq(kicVar, 14);
                Executor executorDirectExecutor2 = MoreExecutors.directExecutor();
                ahcr ahcrVar = new ahcr(ahcqVar, gqqVar);
                ahcqVar.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor2, ahcrVar));
                listenableFuture = ahcrVar;
            }
        }
        return d(listenableFuture) ? (lpa) agekVar.apply(kicVar) : nre.a(listenableFuture).b(MoreExecutors.directExecutor(), new kji(agekVar, kicVar, i2));
    }

    @Override // defpackage.kij
    public final lpa a(kih kihVar) {
        return f(kihVar, ((kii) kihVar.a).n);
    }

    @Override // defpackage.kij
    public final lpa b(kjd kjdVar) {
        return f(kjdVar, null);
    }

    public final lpa c(kic kicVar, kiz kizVar) {
        kjs.b().d(1007, this.v);
        kjm kjmVar = new kjm(this, kicVar, this.C, kizVar);
        super.B(2, kjmVar);
        return krn.b(kjmVar, new krk());
    }

    public final void e(kjg kjgVar) {
        if (kjgVar.a.isEmpty()) {
            mda.m(Status.a);
            return;
        }
        kpj kpjVar = new kpj();
        kpjVar.a = new kak(kjgVar, 3);
        kpjVar.b = new klq[]{kiu.a};
        kpjVar.b();
        super.A(2, kpjVar.a());
    }
}
