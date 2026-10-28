package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.auth.TokenData;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import libcore.io.Memory;
import org.chromium.base.Callback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kjc {
    private static volatile kjc b;
    public final Object a;

    public kjc(Context context, qeg qegVar) {
        this.a = qegVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(qegVar.a);
        application.registerComponentCallbacks(qegVar.a);
        if (Build.VERSION.SDK_INT < 37 || qegVar.b != null) {
            return;
        }
        qegVar.b = new qee();
        View.registerCalledFromWrongThreadListener(qegVar.b);
    }

    public static ListenableFuture A(lpa lpaVar) {
        ListenableFuture listenableFutureBp = qnl.bp(lpaVar);
        hqn hqnVar = new hqn(8);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i = ahbz.d;
        ahbx ahbxVar = new ahbx(listenableFutureBp, kmu.class, hqnVar);
        listenableFutureBp.addListener(ahbxVar, MoreExecutors.c(executorDirectExecutor, ahbxVar));
        return ahbxVar;
    }

    private static Object P(lpa lpaVar) {
        return ksy.d() ? qnl.bp(lpaVar).get() : mda.n(lpaVar);
    }

    private static int Q(DisplayMetrics displayMetrics, int i) {
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    public static kjc a() {
        if (b == null) {
            synchronized (kjc.class) {
                if (b == null) {
                    b = new kjc();
                }
            }
        }
        return b;
    }

    public static final void k(Account account) {
        if (account.type.equals("com.google") || account.type.equals("com.google.work")) {
            return;
        }
        throw new IllegalArgumentException("Account type " + account.type + " is not supported.");
    }

    public static Point m(Activity activity) {
        int i = dxa.a;
        Rect rectA = dxc.a.a().a(activity).a();
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        int iWidth = rectA.width();
        agrf agrfVar = twm.a;
        displayMetrics.getClass();
        float f = iWidth / displayMetrics.density;
        DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
        int iHeight = rectA.height();
        displayMetrics2.getClass();
        return new Point((int) (f + 0.5f), (int) ((iHeight / displayMetrics2.density) + 0.5f));
    }

    public static kjc y(String str) {
        return new kjc((TextUtils.isEmpty(str) || str.length() > 1) ? lge.UNINITIALIZED : lgh.e(str.charAt(0)));
    }

    public final ListenableFuture B(qmr qmrVar) {
        final String str;
        String simpleName = llu.class.getSimpleName();
        kmz kmzVar = (kmz) this.a;
        final kox koxVarY = kmzVar.y(qmrVar, simpleName);
        String strA = ksx.a();
        if (strA == null) {
            str = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            str = strA + '|' + System.identityHashCode(llu.class);
        }
        kpe kpeVar = new kpe() { // from class: llm
            @Override // defpackage.kpe
            public final void a(Object obj, Object obj2) {
                int i = llq.a;
                llt lltVar = (llt) ((llu) obj).C();
                llr llrVar = new llr(koxVarY, 0);
                Parcel parcelC = lltVar.c();
                parcelC.writeString(str);
                ClassLoader classLoader = gdc.a;
                parcelC.writeStrongBinder(llrVar);
                lltVar.e(28, parcelC);
            }
        };
        lln llnVar = new lln();
        kpd kpdVar = new kpd();
        kpdVar.c = koxVarY;
        kpdVar.a = kpeVar;
        kpdVar.b = llnVar;
        kpdVar.d = new klq[]{llf.d};
        kpdVar.e = false;
        return A(kmzVar.C(kpdVar.a()));
    }

    public final ListenableFuture C(String str) {
        return A(((llq) this.a).h(str).a(MoreExecutors.directExecutor(), new qku()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    public final qjb D(float f) {
        Random random = (Random) this.a.io();
        random.getClass();
        return new qjb(random, f);
    }

    public final void E(qed qedVar) {
        qedVar.getClass();
        qef qefVar = ((qeg) this.a).a;
        int i = qef.c;
        qefVar.a.add(qedVar);
    }

    public final void F(qed qedVar) {
        qef qefVar = ((qeg) this.a).a;
        int i = qef.c;
        qefVar.a.remove(qedVar);
    }

    public final Object G(plx plxVar, aiau aiauVar, awoq awoqVar) {
        aiav aiavVar = aiav.a;
        aiavVar.getClass();
        qbf qbfVar = (qbf) this.a;
        return awro.p(qbfVar.t, new pqd(qbfVar, "/v1/fetchlatestthreads", plxVar, aiauVar, aiavVar, awnp.a, (awoq) null, 2), awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, pgi] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final Object H(List list, awoq awoqVar) throws Throwable {
        qal qalVar;
        ?? it;
        if (awoqVar instanceof qal) {
            qalVar = (qal) awoqVar;
            int i = qalVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qalVar.c = i - Integer.MIN_VALUE;
            } else {
                qalVar = new qal(this, awoqVar);
            }
        } else {
            qalVar = new qal(this, awoqVar);
        }
        Object obj = qalVar.b;
        awox awoxVar = awox.a;
        int i2 = qalVar.c;
        if (i2 == 0) {
            atqp.j(obj);
            it = list.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = qalVar.a;
            atqp.j(obj);
            it = obj2;
        }
        while (it.hasNext()) {
            plx plxVar = (plx) it.next();
            ?? r2 = this.a;
            aidy aidyVar = aidy.LOCALE_CHANGED;
            qalVar.a = it;
            qalVar.c = 1;
            if (r2.b(plxVar, aidyVar, qalVar) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(awoq awoqVar) throws Throwable {
        pxa pxaVar;
        if (awoqVar instanceof pxa) {
            pxaVar = (pxa) awoqVar;
            int i = pxaVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pxaVar.b = i - Integer.MIN_VALUE;
            } else {
                pxaVar = new pxa(this, awoqVar);
            }
        } else {
            pxaVar = new pxa(this, awoqVar);
        }
        Object objH = pxaVar.a;
        awox awoxVar = awox.a;
        int i2 = pxaVar.b;
        if (i2 == 0) {
            atqp.j(objH);
            lpa lpaVarA = ((lmm) this.a).a();
            pxaVar.b = 1;
            objH = Callback.Helper.h(lpaVarA, pxaVar);
            if (objH == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objH);
        }
        objH.getClass();
        return objH;
    }

    public final kii J(String str) {
        List list = kii.m;
        kif kifVar = new kif((Context) this.a, "CHIME");
        kifVar.e = str;
        kifVar.f = new plf();
        return kifVar.b();
    }

    public final kii K() {
        kif kifVarF = kii.f((Context) this.a, "CHIME");
        kifVarF.f = new plf();
        return kifVarF.b();
    }

    public final void L(mew mewVar, NodeViewInterface nodeViewInterface, ElementsServices elementsServices) {
        long j = mewVar.c;
        if (Memory.peekByte(j + 14) == 0 && Memory.peekByte(j + 16) == 0) {
            return;
        }
        ovd ovdVarA = ovd.a(mewVar);
        if (Memory.peekByte(mewVar.c + 14) != 0) {
            Object obj = this.a;
            if (ovdVarA.a) {
                nodeViewInterface.N(new ovf(obj, ovdVarA, elementsServices, 0), ovdVarA);
            }
        }
        if (Memory.peekByte(mewVar.c + 16) != 0) {
            nodeViewInterface.N(new cmw(ovdVarA, elementsServices, 12), ovdVarA);
        }
    }

    public final athg M(dwr dwrVar) {
        int i;
        if (dwrVar == null) {
            return null;
        }
        athc athcVar = new athc();
        athcVar.aR();
        athcVar.bO(8, 1);
        athcVar.bK(9, true);
        dwp dwpVar = dwrVar.a;
        int i2 = 3;
        if (dwpVar == dwp.a) {
            i = 2;
        } else {
            i = dwpVar == dwp.b ? 3 : 1;
        }
        athcVar.aR();
        athcVar.bO(8, 2);
        athcVar.bQ(12, i - 1);
        if (!dwrVar.c()) {
            i2 = 2;
        } else if (dwrVar.b() != dwo.a) {
            i2 = dwrVar.b() == dwo.b ? 4 : 1;
        }
        athcVar.aR();
        athcVar.bO(8, 4);
        athcVar.bQ(16, i2 - 1);
        Rect rectA = dwrVar.a();
        ater aterVar = new ater();
        atev atevVar = new atev();
        DisplayMetrics displayMetrics = (DisplayMetrics) this.a;
        atevVar.aR(Q(displayMetrics, rectA.top));
        atey ateyVarAS = atevVar.aS();
        if (ateyVarAS != aterVar.i) {
            aterVar.i = ateyVarAS;
            aterVar.e = true;
        }
        atev atevVar2 = new atev();
        atevVar2.aR(Q(displayMetrics, rectA.left));
        atey ateyVarAS2 = atevVar2.aS();
        if (ateyVarAS2 != aterVar.m) {
            aterVar.m = ateyVarAS2;
            aterVar.g = true;
        }
        atev atevVar3 = new atev();
        atevVar3.aR(Q(displayMetrics, rectA.bottom));
        atey ateyVarAS3 = atevVar3.aS();
        if (ateyVarAS3 != aterVar.k) {
            aterVar.k = ateyVarAS3;
            aterVar.f = true;
        }
        atev atevVar4 = new atev();
        atevVar4.aR(Q(displayMetrics, rectA.right));
        atey ateyVarAS4 = atevVar4.aS();
        if (ateyVarAS4 != aterVar.n) {
            aterVar.n = ateyVarAS4;
            aterVar.h = true;
        }
        if (aterVar.d) {
            aterVar.bG();
        } else {
            aterVar.d = true;
        }
        ateu ateuVar = new ateu(aterVar.b);
        if (aterVar.i != null) {
            ateuVar.i = aterVar.i;
            ateuVar.e = aterVar.e;
        }
        if (aterVar.j != null) {
            ateuVar.j = aterVar.j;
        }
        if (aterVar.k != null) {
            ateuVar.k = aterVar.k;
            ateuVar.f = aterVar.f;
        }
        if (aterVar.l != null) {
            ateuVar.l = aterVar.l;
        }
        if (aterVar.m != null) {
            ateuVar.m = aterVar.m;
            ateuVar.g = aterVar.g;
        }
        if (aterVar.n != null) {
            ateuVar.n = aterVar.n;
            ateuVar.h = aterVar.h;
        }
        atey ateyVar = aterVar.o;
        atey ateyVar2 = aterVar.p;
        atey ateyVar3 = aterVar.q;
        ateuVar.bJ();
        if (ateuVar != athcVar.f) {
            athcVar.f = ateuVar;
            athcVar.e = true;
        }
        if (athcVar.d) {
            athcVar.bG();
        } else {
            athcVar.d = true;
        }
        athg athgVar = new athg(athcVar.b);
        if (athcVar.f != null) {
            athgVar.f = athcVar.f;
            athgVar.e = athcVar.e;
        }
        athgVar.aS();
        return athgVar;
    }

    public final ListenableFuture N(Callable callable, Executor executor) {
        long j = afwl.a;
        return ((ahek) this.a).a(new ahcz(afty.c(false), callable, 1), executor);
    }

    public final ListenableFuture O(ahcx ahcxVar, Executor executor) {
        long j = afwl.a;
        return ((ahek) this.a).b(new afwh(afty.c(false), ahcxVar, 0), executor);
    }

    public final void b(String str, Bundle bundle) {
        String string;
        ldr ldrVar = (ldr) this.a;
        ldrVar.r();
        if (ldrVar.w()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        ldrVar.g().q.b(string);
        ldrVar.g().r.b(System.currentTimeMillis());
    }

    public final boolean c() {
        return ((ldr) this.a).g().r.a() > 0;
    }

    public final boolean d() {
        if (!c()) {
            return false;
        }
        ldr ldrVar = (ldr) this.a;
        return System.currentTimeMillis() - ldrVar.g().r.a() > ldrVar.c.E(null, lcl.at);
    }

    public final int e(String str) {
        return ((Context) this.a).checkCallingOrSelfPermission(str);
    }

    public final ApplicationInfo f(String str, int i) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo g(String str, int i) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public final boolean h() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Object obj = this.a;
        if (callingUid == iMyUid) {
            return ksy.c((Context) obj);
        }
        Context context = (Context) obj;
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, jyq] */
    public final TokenData i(Context context, Account account, String str, Bundle bundle) throws jxr, IOException {
        Long l;
        List list;
        aupw aupwVar = aupw.a;
        if (aupwVar.io().d()) {
            k(account);
        }
        String packageName = context.getPackageName();
        ?? r8 = this.a;
        if (!kro.C(packageName, r8, context, klt.a)) {
            String str2 = jxs.a;
            return jxz.g(context, account, str, bundle);
        }
        try {
            String str3 = account.name;
            String str4 = jxs.a;
            String strA = jxz.a(context, str3);
            if (TextUtils.isEmpty(strA)) {
                throw new IOException("Could not fetch gaia id for account.");
            }
            jyo jyoVar = (jyo) mda.n(r8.c(aupwVar.io().g() ? kro.A(strA, str, bundle).a() : kro.B(account, str, r8, bundle).a()));
            String str5 = jyoVar.a;
            jyr jyrVar = jyoVar.b;
            if (jyrVar != null) {
                Long l2 = jyrVar.a;
                list = jyrVar.b;
                l = l2;
            } else {
                l = null;
                list = null;
            }
            TokenData tokenData = TextUtils.isEmpty(str5) ? null : new TokenData(1, str5, l, false, false, list, null);
            if (tokenData == null) {
                throw new IOException("Token is null");
            }
            return tokenData;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(e);
        } catch (ExecutionException e2) {
            kro.D(e2);
            String str6 = jxs.a;
            return jxz.g(context, account, str, bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, knd] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, jyq] */
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
    public final Account[] j(Context context) throws kmk, kmj, RemoteException {
        String packageName = context.getPackageName();
        aupw aupwVar = aupw.a;
        if (aupwVar.io().e()) {
            aiie aiieVar = aupwVar.io().b().b;
            if (!aiieVar.contains(packageName) || aiieVar.contains("-".concat(String.valueOf(packageName)))) {
                try {
                    P(klt.a.c(this.a, new knd[0]));
                    kst.a.getClass();
                    context.getPackageName();
                    agke agkeVar = agpi.a;
                    try {
                        ?? r5 = this.a;
                        xyg xygVarA = jyk.a();
                        xygVarA.f("com.google");
                        List<jyp> list = ((jyl) P(r5.b(xygVarA.e()))).a;
                        ArrayList arrayList = new ArrayList();
                        for (jyp jypVar : list) {
                            arrayList.add(new Account(jypVar.c, jypVar.b));
                        }
                        return (Account[]) arrayList.toArray(new Account[0]);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RemoteException("Fetching accounts was interrupted. ".concat(e.toString()));
                    } catch (ExecutionException e2) {
                        if (e2.getCause() instanceof RemoteException) {
                            throw ((RemoteException) e2.getCause());
                        }
                        if (e2.getCause() instanceof kmk) {
                            throw ((kmk) e2.getCause());
                        }
                        if (e2.getCause() instanceof kmj) {
                            throw ((kmj) e2.getCause());
                        }
                        throw new RemoteException("Unexpected error was thrown by GoogleAuthClient when fetching accounts. ".concat(e2.toString()));
                    }
                } catch (InterruptedException | ExecutionException unused) {
                    kst.a.getClass();
                    context.getPackageName();
                    String str = jxs.a;
                    return jxz.f(context);
                }
            }
        }
        String str2 = jxs.a;
        return jxz.f(context);
    }

    public final Point l() {
        return m((Activity) this.a);
    }

    public final boolean n() {
        Point pointL = l();
        return pointL.x >= 840 && pointL.y >= 600;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zwb] */
    public final String o() {
        ?? r1 = this.a;
        return r1.u() ? r1.e().k() : "signedout";
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, ntq] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, nru] */
    public final void p(mmb mmbVar) {
        Float f = mmbVar.b;
        double dFloatValue = 0.0d;
        if (f != null && mmbVar.c != null) {
            dFloatValue = f.floatValue() - mmbVar.c.floatValue();
        }
        mkr mkrVar = (mkr) this.a;
        View view = (View) mkrVar.a.get();
        List<aclc> list = mkrVar.n;
        if (list == null || view == null) {
            return;
        }
        for (aclc aclcVar : list) {
            aslp aslpVarG = mpo.g(view);
            aihf aihfVarCreateBuilder = asls.a.createBuilder();
            float degrees = (float) Math.toDegrees((float) dFloatValue);
            aihfVarCreateBuilder.copyOnWrite();
            asls aslsVar = (asls) aihfVarCreateBuilder.instance;
            aslsVar.c |= 1;
            aslsVar.d = degrees;
            asls aslsVar2 = (asls) aihfVarCreateBuilder.build();
            aihh aihhVar = (aihh) SenderStateOuterClass$SenderState.a.createBuilder();
            aihhVar.e(asls.b, aslsVar2);
            aihhVar.e(aslp.b, aslpVarG);
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = (SenderStateOuterClass$SenderState) aihhVar.build();
            mpo mpoVar = (mpo) aclcVar.e;
            nry nryVar = mpoVar.b;
            CommandOuterClass$Command commandOuterClass$CommandX = ((omj) aclcVar.c).x();
            ?? r8 = aclcVar.d;
            ?? r9 = aclcVar.a;
            nsl nslVar = (nsl) aclcVar.b;
            mpoVar.i(nryVar.a(commandOuterClass$CommandX, mpo.j(view, null, 10, null, senderStateOuterClass$SenderState, r8, r9, nslVar, null)).f(mpoVar.d.a(nslVar)).D(), nslVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void q(String str, nrv nrvVar) {
        synchronized (this) {
            try {
                aamo aamoVar = (aamo) this.a.get(str);
                if (aamoVar == null) {
                    return;
                }
                aamoVar.g(nrvVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void r(String str) {
        synchronized (this) {
            try {
                aamo aamoVar = (aamo) this.a.get(str);
                if (aamoVar == null) {
                    return;
                }
                aamoVar.h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final mdm s(mdh mdhVar) {
        mdn mdnVar = new mdn(mdhVar);
        this.a.put(mdhVar, mdnVar);
        return mdnVar;
    }

    public final ThreadFactory t(ThreadFactory threadFactory) {
        return new mbj(this, threadFactory, new StrictMode.ThreadPolicy.Builder());
    }

    public final void u(Exception exc) {
        ((lpf) this.a).s(exc);
    }

    public final void v(Object obj) {
        ((lpf) this.a).t(obj);
    }

    public final boolean w(Exception exc) {
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        Object obj = this.a;
        lpf lpfVar = (lpf) obj;
        synchronized (lpfVar.a) {
            if (((lpf) obj).b) {
                return false;
            }
            ((lpf) obj).b = true;
            ((lpf) obj).d = exc;
            lpfVar.e.h((lpa) obj);
            return true;
        }
    }

    public final void x(Object obj) {
        ((lpf) this.a).u(obj);
    }

    public final ListenableFuture z(String str) {
        str.getClass();
        return A(((llq) this.a).a(str));
    }

    public kjc(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public kjc(byte[] bArr) {
        this.a = new nwn();
    }

    public kjc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new lpf();
    }

    public kjc(Context context, byte[] bArr) {
        qkh.c(context);
        this.a = new jzb(context);
    }

    public kjc(Context context, byte[] bArr, byte[] bArr2) {
        this.a = context.getResources().getDisplayMetrics();
    }

    public kjc(lqa lqaVar) {
        this.a = new lpf();
        ((lpf) lqaVar.a).q(new lon(new qcb(this)));
    }

    public kjc(pgi pgiVar) {
        pgiVar.getClass();
        this.a = pgiVar;
    }

    public kjc(qbf qbfVar, awou awouVar) {
        awouVar.getClass();
        this.a = qbfVar;
    }

    public kjc(char[] cArr) {
        this.a = new ConcurrentHashMap();
        s(new mdh("Main", 1, true, mdj.a)).d(Process.myPid());
    }

    public kjc(short[] sArr) {
        this.a = new aga(3);
    }

    public kjc(Object obj) {
        this.a = obj;
    }

    public kjc(Context context, char[] cArr) {
        context.getClass();
        this.a = context;
    }

    public kjc(Bundle bundle) {
        this.a = kro.v(bundle, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES");
    }

    private kjc() {
        this.a = new CopyOnWriteArrayList();
    }

    public kjc(awmd awmdVar, char[] cArr, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public kjc(byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
    }

    public kjc(boolean z) {
        this.a = z ? new HashMap() : null;
    }

    public kjc(awmd awmdVar, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
    }
}
