package defpackage;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwq {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public kwq() {
        kyr kyrVar = new kyr((byte[]) null);
        this.b = kyrVar;
        kwq kwqVar = new kwq((kwq) null, kyrVar);
        this.c = kwqVar;
        this.a = kwqVar.F();
        elr elrVar = new elr();
        this.d = elrVar;
        kwqVar.A("require", new fyh(elrVar));
        elrVar.e("internal.platform", new fxv(0));
        kwqVar.A("runtime.counter", new fyr(Double.valueOf(0.0d)));
    }

    public static String b(gcz gczVar) {
        return ksv.a(gczVar.toByteArray());
    }

    public static kui g(kqs kqsVar, String str, ktv ktvVar, int i, ktu ktuVar) throws kmu {
        ktj ktjVar;
        ktuVar.c(3, ktt.c);
        try {
            ktk ktkVar = (ktk) kqsVar.C();
            Parcel parcelD = ktkVar.d(2, ktkVar.c());
            IBinder strongBinder = parcelD.readStrongBinder();
            elq elqVar = null;
            if (strongBinder == null) {
                ktjVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
                ktjVar = iInterfaceQueryLocalInterface instanceof ktj ? (ktj) iInterfaceQueryLocalInterface : new ktj(strongBinder);
            }
            parcelD.recycle();
            ktuVar.c(4, ktt.c);
            kth kthVar = new kth();
            Bundle bundle = kthVar.b;
            int i2 = bundle.getInt("clientVersion");
            bundle.putInt("clientVersion", (i2 - (i2 % 10)) + 2);
            bundle.putAll(ktvVar.b);
            bundle.putInt("openHandles", i);
            try {
                Parcel parcelC = ktjVar.c();
                parcelC.writeString(str);
                gdc.c(parcelC, kthVar);
                Parcel parcelD2 = ktjVar.d(5, parcelC);
                kti ktiVar = (kti) gdc.a(parcelD2, kti.CREATOR);
                parcelD2.recycle();
                if (ktiVar == null) {
                    try {
                        Parcel parcelC2 = ktjVar.c();
                        parcelC2.writeString(str);
                        ktjVar.f(1, parcelC2);
                    } catch (RemoteException e) {
                        throw lqd.h(e, "Failed on init() call");
                    }
                }
                ktt kttVar = ktt.c;
                ktuVar.c(5, kttVar);
                if (ktiVar != null) {
                    try {
                        ahgb ahgbVarAp = ahgb.ap(kqsVar.p, ktuVar);
                        Parcelable parcelable = ktiVar.b;
                        ParcelFileDescriptor parcelFileDescriptor = ktiVar.a;
                        if (parcelable != null && parcelFileDescriptor != null) {
                            try {
                                String string = ((Bundle) parcelable).getString("h");
                                if (string == null) {
                                    throw new ktp("Missing key");
                                }
                                ktq ktqVar = new ktq(string);
                                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                                try {
                                    elq elqVarAm = ahgbVarAp.am(ktqVar, parcelable, autoCloseInputStream);
                                    ktuVar.c(10, kttVar);
                                    try {
                                        Object obj = elqVarAm.a;
                                        Object objInvoke = obj.getClass().getDeclaredMethod("init", null).invoke(obj, null);
                                        aguu.ak(objInvoke);
                                        ((Boolean) objInvoke).booleanValue();
                                        ktuVar.c(11, ktt.c);
                                        try {
                                            Object obj2 = elqVarAm.a;
                                            obj2.getClass().getDeclaredMethod("close", null).invoke(obj2, null);
                                            ktuVar.c(12, ktt.c);
                                            autoCloseInputStream.close();
                                            parcelFileDescriptor.close();
                                            elqVar = elqVarAm;
                                        } catch (Exception e2) {
                                            throw new ktp(e2);
                                        }
                                    } catch (Exception e3) {
                                        throw new ktp(e3);
                                    }
                                } catch (Throwable th) {
                                    try {
                                        autoCloseInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                try {
                                    parcelFileDescriptor.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } else if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                    } catch (IOException | ktp | ktr e4) {
                        throw lqd.g(e4, 8, "Failed to start the app-side VM process");
                    }
                }
                ktuVar.c(13, ktt.b);
                return new kui(ktjVar, elqVar);
            } catch (RemoteException e5) {
                throw lqd.h(e5, "Failed on initWithExtras() call");
            }
        } catch (RemoteException e6) {
            throw lqd.h(e6, "Failed to create DroidGuard handle");
        }
    }

    public static final xgj l(ibt ibtVar) {
        return new xgj(xhb.b(ibtVar.d));
    }

    public static final agkj p() {
        zh zhVar = new zh();
        zhVar.a = 2;
        return agkj.j("display_context", zhVar.d());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void A(String str, fyy fyyVar) {
        Object obj;
        ?? r0 = this.a;
        if (!r0.containsKey(str) && (obj = this.c) != null) {
            kwq kwqVar = (kwq) obj;
            if (kwqVar.B(str)) {
                kwqVar.A(str, fyyVar);
                return;
            }
        }
        if (this.b.containsKey(str)) {
            return;
        }
        if (fyyVar == null) {
            r0.remove(str);
        } else {
            r0.put(str, fyyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final boolean B(String str) {
        if (this.a.containsKey(str)) {
            return true;
        }
        Object obj = this.c;
        if (obj != null) {
            return ((kwq) obj).B(str);
        }
        return false;
    }

    public final void C(String str, Callable callable) {
        ((elr) this.d).e(str, callable);
    }

    public final void D(long j, bwb bwbVar) {
        if (bwbVar.d() >= 9) {
            int i = bwbVar.i();
            int i2 = bwbVar.i();
            int iN = bwbVar.n();
            if (i == 434 && i2 == 1195456820 && iN == 3) {
                ((bxl) this.d).a(j, bwbVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void E(cvk cvkVar, dev devVar) {
        int i = 0;
        while (true) {
            cwj[] cwjVarArr = (cwj[]) this.a;
            if (i >= cwjVarArr.length) {
                return;
            }
            devVar.c();
            cwj cwjVarS = cvkVar.s(devVar.a(), 3);
            bse bseVar = (bse) this.b.get(i);
            String str = bseVar.q;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            ahno.K(z, "Invalid closed caption MIME type provided: %s", str);
            bsd bsdVar = new bsd();
            bsdVar.a = devVar.b();
            bsdVar.a((String) this.c);
            bsdVar.e(str);
            bsdVar.e = bseVar.e;
            bsdVar.d = bseVar.d;
            bsdVar.M = bseVar.O;
            bsdVar.r = bseVar.t;
            cwjVarS.b(new bse(bsdVar));
            cwjVarArr[i] = cwjVarS;
            i++;
        }
    }

    public final kwq F() {
        return new kwq(this, (kyr) this.d);
    }

    public final kwq G() {
        return ((kwq) this.a).F();
    }

    public final fyy H(kwq kwqVar, ljb... ljbVarArr) {
        fyy fyyVarAs = fyy.f;
        for (ljb ljbVar : ljbVarArr) {
            fyyVarAs = fhz.as(ljbVar);
            fxw.o((kwq) this.c);
            if ((fyyVarAs instanceof fyz) || (fyyVarAs instanceof fyx)) {
                fyyVarAs = ((kyr) this.b).K(kwqVar, fyyVarAs);
            }
        }
        return fyyVarAs;
    }

    public final File a() {
        int i = ((gcw) this.d).h;
        File file = new File((File) this.a, Integer.toString(i));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String c() {
        return "FBAMTD" + ((gcw) this.d).h;
    }

    public final String d() {
        return "LATMTD" + ((gcw) this.d).h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final gcz e(int i) {
        ?? r0 = this.c;
        String string = i == 1 ? r0.getString(d(), null) : r0.getString(c(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            gcz gczVar = (gcz) aihn.parseFrom(gcz.a, aigj.v(ksv.b(string)));
            String str = gczVar.c;
            File fileV = ixt.V(str, "pcam.jar", a());
            if (!fileV.exists()) {
                fileV = ixt.V(str, "pcam", a());
            }
            File fileV2 = ixt.V(str, "pcbc", a());
            if (fileV.exists() && fileV2.exists()) {
                return gczVar;
            }
            return null;
        } catch (aiik unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final lpa f(final String str, final ktv ktvVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        final ktu ktuVar = new ktu(Arrays.asList(aura.a.io().a().split(",", -1)).contains(str) ? ktt.c : ktt.b);
        ktuVar.c(2, ktt.b);
        lpa lpaVarO = ((ahgb) this.d).O(1, 1, new kty() { // from class: kug
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
            @Override // defpackage.kty
            public final Object a(kqs kqsVar) throws kmu {
                kwq kwqVar = this.d;
                ahgb ahgbVar = (ahgb) kwqVar.d;
                String str2 = str;
                ktv ktvVar2 = ktvVar;
                int iN = ahgbVar.N();
                ktu ktuVar2 = ktuVar;
                kui kuiVarG = kwq.g(kqsVar, str2, ktvVar2, iN, ktuVar2);
                if (str2 == null) {
                    throw new NullPointerException("Null flowName");
                }
                Object obj = kwqVar.c;
                if (obj == null) {
                    throw new NullPointerException("Null eventCollectorProvider");
                }
                return new kul(ahgbVar, kwqVar.b, (kue) kwqVar.a, str2, ktvVar2, ktuVar2, (yz) obj, kuiVarG.a, kuiVarG.b);
            }
        });
        lpaVarO.l(this.b, new kuh(this, jElapsedRealtime, jCurrentTimeMillis, 0));
        return lpaVarO;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [awmd, java.lang.Object] */
    public final jgd h(View view, TextView textView) {
        cf cfVar = (cf) this.a.io();
        cfVar.getClass();
        hpy hpyVar = (hpy) this.c.io();
        hpyVar.getClass();
        hpd hpdVar = (hpd) this.d.io();
        hpdVar.getClass();
        avmb avmbVar = (avmb) this.b.io();
        avmbVar.getClass();
        view.getClass();
        textView.getClass();
        return new jgd(cfVar, hpyVar, hpdVar, avmbVar, view, textView);
    }

    public final ListenableFuture i() {
        ((hfn) this.b).an(2, 2, 1, 0, 0);
        ((syn) this.d).d("sideloaded.migration.SideloadedPlaylistMigrationTaskRunner", 0L, 1, 0, false, null, new syj(1, 10L), false);
        return ahng.n(Boolean.TRUE);
    }

    public final float j() {
        Object objAD = ((awku) this.d).aD();
        if (objAD != null) {
            return ((Number) objAD).floatValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final ibt k() {
        Object objAD = ((awku) this.a).aD();
        if (objAD != null) {
            return (ibt) objAD;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awut, java.lang.Object] */
    public final ListenableFuture m(String str) {
        str.getClass();
        return awrc.ag(this.b, awov.a, new gmc(this, str, (awoq) null, 6));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0135 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:19:0x0048, B:32:0x00b1, B:34:0x0135, B:35:0x013e, B:37:0x0151, B:38:0x0155), top: B:57:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0151 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:19:0x0048, B:32:0x00b1, B:34:0x0135, B:35:0x013e, B:37:0x0151, B:38:0x0155), top: B:57:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0172  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [hpy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zwb] */
    public final Object n(String str, awoq awoqVar) throws Exception {
        hta htaVar;
        String str2;
        AutoCloseable autoCloseable;
        ?? r2;
        Object obj;
        String str3;
        afzq afzqVar;
        Throwable th;
        ?? r3;
        Optional optional;
        hge hgeVar;
        InstanceProxy instanceProxyD;
        if (awoqVar instanceof hta) {
            htaVar = (hta) awoqVar;
            int i = htaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                htaVar.d = i - Integer.MIN_VALUE;
            } else {
                htaVar = new hta(this, awoqVar);
            }
        } else {
            htaVar = new hta(this, awoqVar);
        }
        Object objAd = htaVar.c;
        Object obj2 = awox.a;
        int i2 = htaVar.d;
        int i3 = 3;
        try {
            if (i2 == 0) {
                atqp.j(objAd);
                Optional optional2 = (Optional) this.a;
                if (optional2.isEmpty()) {
                    throw new IllegalStateException("AccountScopedBlocksProvider is not available. Make sure an implementation is provided as a non-optional binding.");
                }
                gmj gmjVar = (gmj) optional2.get();
                ListenableFuture listenableFutureAg = awrc.ag(gmjVar.c, awov.a, new gmc(gmjVar, gmjVar.a.e(), (awoq) null, 0));
                str2 = str;
                htaVar.a = str2;
                htaVar.d = 1;
                objAd = awrc.ad(listenableFutureAg, htaVar);
                if (objAd != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r2 = (AutoCloseable) htaVar.a;
                    try {
                        atqp.j(objAd);
                        r2 = r2;
                        obj2 = (akrn) objAd;
                        JniZero.j(r2, null);
                        obj2.getClass();
                        return obj2;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        r3 = r2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            JniZero.j(r3, th);
                            throw th3;
                        }
                    }
                }
                afzqVar = htaVar.e;
                obj = htaVar.b;
                str3 = (String) htaVar.a;
                try {
                    atqp.j(objAd);
                    optional = (Optional) objAd;
                    aihf aihfVarCreateBuilder = asep.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    ahub ahubVar = new ahub(aihfVarCreateBuilder);
                    Object obj3 = this.d;
                    String string = ((Context) obj3).getString(R.string.lyrics_not_available_at_this_time);
                    string.getClass();
                    Object obj4 = ahubVar.a;
                    ((aihf) obj4).copyOnWrite();
                    asep asepVar = (asep) ((aihf) obj4).instance;
                    asepVar.b |= 4;
                    asepVar.e = string;
                    String string2 = ((Context) obj3).getString(R.string.lyrics_source);
                    string2.getClass();
                    ((aihf) obj4).copyOnWrite();
                    asep asepVar2 = (asep) ((aihf) obj4).instance;
                    asepVar2.b |= 8;
                    asepVar2.f = string2;
                    String strAs = kro.as(str3);
                    strAs.getClass();
                    ((aihf) obj4).copyOnWrite();
                    asep asepVar3 = (asep) ((aihf) obj4).instance;
                    asepVar3.b |= 2;
                    asepVar3.d = strAs;
                    hgeVar = new hge(new hol(ahubVar, i3), 15);
                    if (true == optional.isPresent()) {
                        hgeVar.a.invoke(optional.get());
                    }
                    aihn aihnVarBuild = ((aihf) obj4).build();
                    aihnVarBuild.getClass();
                    asep asepVar4 = (asep) aihnVarBuild;
                    instanceProxyD = afzqVar.d();
                    if (instanceProxyD instanceof afzr) {
                        agcv agcvVar = ((afzr) instanceProxyD).a;
                    }
                    akrn akrnVar = akrn.a;
                    ListenableFuture listenableFutureE = afzqVar.e(-578532672, asepVar4, aihn.getParserForClass(akrn.class));
                    htaVar.a = obj;
                    htaVar.b = null;
                    htaVar.e = null;
                    htaVar.d = 3;
                    objAd = awrc.ad(listenableFutureE, htaVar);
                    if (objAd != obj2) {
                        r2 = obj;
                        obj2 = (akrn) objAd;
                        JniZero.j(r2, null);
                        obj2.getClass();
                    }
                    return obj2;
                } catch (Throwable th4) {
                    th = th4;
                    r3 = obj;
                    throw th;
                }
            }
            str2 = (String) htaVar.a;
            atqp.j(objAd);
            afzq afzqVar2 = (afzq) autoCloseable;
            ?? r10 = this.c;
            String strAH = kro.aH(str2);
            strAH.getClass();
            ListenableFuture listenableFutureA = r10.a(strAH);
            htaVar.a = str2;
            htaVar.b = autoCloseable;
            htaVar.e = afzqVar2;
            htaVar.d = 2;
            Object objAd2 = awrc.ad(listenableFutureA, htaVar);
            if (objAd2 != obj2) {
                obj = autoCloseable;
                objAd = objAd2;
                str3 = str2;
                afzqVar = afzqVar2;
                optional = (Optional) objAd;
                aihf aihfVarCreateBuilder2 = asep.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                ahub ahubVar2 = new ahub(aihfVarCreateBuilder2);
                Object obj5 = this.d;
                String string3 = ((Context) obj5).getString(R.string.lyrics_not_available_at_this_time);
                string3.getClass();
                Object obj6 = ahubVar2.a;
                ((aihf) obj6).copyOnWrite();
                asep asepVar5 = (asep) ((aihf) obj6).instance;
                asepVar5.b |= 4;
                asepVar5.e = string3;
                String string4 = ((Context) obj5).getString(R.string.lyrics_source);
                string4.getClass();
                ((aihf) obj6).copyOnWrite();
                asep asepVar6 = (asep) ((aihf) obj6).instance;
                asepVar6.b |= 8;
                asepVar6.f = string4;
                String strAs2 = kro.as(str3);
                strAs2.getClass();
                ((aihf) obj6).copyOnWrite();
                asep asepVar7 = (asep) ((aihf) obj6).instance;
                asepVar7.b |= 2;
                asepVar7.d = strAs2;
                hgeVar = new hge(new hol(ahubVar2, i3), 15);
                if (true == optional.isPresent()) {
                    hgeVar.a.invoke(optional.get());
                }
                aihn aihnVarBuild2 = ((aihf) obj6).build();
                aihnVarBuild2.getClass();
                asep asepVar8 = (asep) aihnVarBuild2;
                instanceProxyD = afzqVar.d();
                if (instanceProxyD instanceof afzr) {
                    agcv agcvVar2 = ((afzr) instanceProxyD).a;
                }
                akrn akrnVar2 = akrn.a;
                ListenableFuture listenableFutureE2 = afzqVar.e(-578532672, asepVar8, aihn.getParserForClass(akrn.class));
                htaVar.a = obj;
                htaVar.b = null;
                htaVar.e = null;
                htaVar.d = 3;
                objAd = awrc.ad(listenableFutureE2, htaVar);
                if (objAd != obj2) {
                    r2 = obj;
                    obj2 = (akrn) objAd;
                    JniZero.j(r2, null);
                    obj2.getClass();
                }
            }
            return obj2;
        } catch (Throwable th5) {
            th = th5;
            r2 = autoCloseable;
            th = th;
            r3 = r2;
            throw th;
        }
        autoCloseable = (AutoCloseable) objAd;
    }

    public final void o(aaui aauiVar, aaub aaubVar) {
        Dialog dialogAA;
        hml hmlVar = new hml(aauiVar, 3);
        int i = aaubVar.b;
        Object obj = this.a;
        if (i == 1) {
            dialogAA = ((xsc) obj).aA(R.string.implicit_remove_offline_playlists_title, R.string.implicit_remove_offline_playlists_message, hmlVar, R.string.implicit_remove_offline_playlists_negative_button, R.string.remove_offline_confirmed_button, xhb.b(75291));
        } else {
            dialogAA = ((xsc) obj).aA(true != txz.g((Context) this.d) ? R.string.remove_offline_playlists_title : R.string.wear_remove_download, R.string.remove_offline_playlists_message, hmlVar, R.string.cancel, R.string.remove_offline_confirmed_button, xhb.b(297967));
        }
        ((grj) this.c).g(dialogAA, aaubVar);
    }

    public final anzn q(String str, String str2, String str3) {
        aihf aihfVarCreateBuilder = anzn.a.createBuilder();
        alay alayVarD = ackj.d(str);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar = (anzn) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        anznVar.e = alayVarD;
        anznVar.b |= 4;
        alay alayVarD2 = ackj.d(str2);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar2 = (anzn) aihfVarCreateBuilder.instance;
        alayVarD2.getClass();
        anznVar2.f = alayVarD2;
        anznVar2.b |= 8;
        hlz hlzVar = (hlz) this.c;
        apji apjiVarO = hlzVar.o(str3);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar3 = (anzn) aihfVarCreateBuilder.instance;
        apjiVarO.getClass();
        anznVar3.c = apjiVarO;
        anznVar3.b |= 1;
        aihf aihfVarCreateBuilder2 = anpv.b.createBuilder();
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.OFFLINE_PIN;
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        anpv anpvVar = (anpv) aihfVarCreateBuilder2.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        anpvVar.d = aljaVar2;
        anpvVar.c |= 4;
        anpv anpvVar2 = (anpv) aihfVarCreateBuilder2.build();
        apji apjiVar = apji.a;
        aihh aihhVar2 = (aihh) apjiVar.createBuilder();
        aihhVar2.e(anpw.a, anpvVar2);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar4 = (anzn) aihfVarCreateBuilder.instance;
        apji apjiVar2 = (apji) aihhVar2.build();
        apjiVar2.getClass();
        anznVar4.b();
        anznVar4.m.add(apjiVar2);
        ajwo ajwoVarT = fhz.T(str3, false);
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar5 = (anzn) aihfVarCreateBuilder.instance;
        ajwoVarT.getClass();
        anznVar5.h = ajwoVarT;
        anznVar5.b |= 32;
        aihf aihfVarCreateBuilder3 = anst.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        anst anstVar = (anst) aihfVarCreateBuilder3.instance;
        anstVar.b = 1;
        anstVar.c = str3;
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar6 = (anzn) aihfVarCreateBuilder.instance;
        anst anstVar2 = (anst) aihfVarCreateBuilder3.build();
        anstVar2.getClass();
        anznVar6.q = anstVar2;
        anznVar6.b |= SemanticState.Multiline;
        aihh aihhVar3 = (aihh) apjiVar.createBuilder();
        aihhVar3.e(angi.a, hmy.q(hlzVar.q(str, str2, str3)));
        aihfVarCreateBuilder.copyOnWrite();
        anzn anznVar7 = (anzn) aihfVarCreateBuilder.instance;
        apji apjiVar3 = (apji) aihhVar3.build();
        apjiVar3.getClass();
        anznVar7.k = apjiVar3;
        anznVar7.b |= SemanticState.Hidden;
        aihfVarCreateBuilder.bU(hmy.u((Context) this.d, str3));
        return (anzn) aihfVarCreateBuilder.build();
    }

    public final anzi r(String str, String str2, String str3) {
        aihh aihhVar = (aihh) anzi.a.createBuilder();
        alay alayVarD = ackj.d(str);
        aihhVar.copyOnWrite();
        anzi anziVar = (anzi) aihhVar.instance;
        alayVarD.getClass();
        anziVar.g = alayVarD;
        anziVar.b |= 16;
        alay alayVarD2 = ackj.d(str2);
        aihhVar.copyOnWrite();
        anzi anziVar2 = (anzi) aihhVar.instance;
        alayVarD2.getClass();
        anziVar2.h = alayVarD2;
        anziVar2.b |= 32;
        hlz hlzVar = (hlz) this.c;
        apji apjiVarO = hlzVar.o(str3);
        aihhVar.copyOnWrite();
        anzi anziVar3 = (anzi) aihhVar.instance;
        apjiVarO.getClass();
        anziVar3.c = apjiVarO;
        anziVar3.b |= 1;
        aihhVar.copyOnWrite();
        anzi anziVar4 = (anzi) aihhVar.instance;
        anziVar4.f = 1;
        anziVar4.b |= 8;
        aihf aihfVarCreateBuilder = anpv.b.createBuilder();
        aihh aihhVar2 = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.OFFLINE_PIN;
        aihhVar2.copyOnWrite();
        alja aljaVar = (alja) aihhVar2.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anpv anpvVar = (anpv) aihfVarCreateBuilder.instance;
        alja aljaVar2 = (alja) aihhVar2.build();
        aljaVar2.getClass();
        anpvVar.d = aljaVar2;
        anpvVar.c |= 4;
        anpv anpvVar2 = (anpv) aihfVarCreateBuilder.build();
        apji apjiVar = apji.a;
        aihh aihhVar3 = (aihh) apjiVar.createBuilder();
        aihhVar3.e(anpw.a, anpvVar2);
        aihhVar.copyOnWrite();
        anzi anziVar5 = (anzi) aihhVar.instance;
        apji apjiVar2 = (apji) aihhVar3.build();
        apjiVar2.getClass();
        anziVar5.e();
        anziVar5.t.add(apjiVar2);
        ajwo ajwoVarT = fhz.T(str3, false);
        aihhVar.copyOnWrite();
        anzi anziVar6 = (anzi) aihhVar.instance;
        ajwoVarT.getClass();
        anziVar6.i = ajwoVarT;
        anziVar6.b |= 64;
        aihf aihfVarCreateBuilder2 = anst.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        anst anstVar = (anst) aihfVarCreateBuilder2.instance;
        anstVar.b = 1;
        anstVar.c = str3;
        aihhVar.copyOnWrite();
        anzi anziVar7 = (anzi) aihhVar.instance;
        anst anstVar2 = (anst) aihfVarCreateBuilder2.build();
        anstVar2.getClass();
        anziVar7.v = anstVar2;
        anziVar7.b |= 131072;
        aihh aihhVar4 = (aihh) apjiVar.createBuilder();
        aihhVar4.e(angi.a, hmy.q(hlzVar.q(str, str2, str3)));
        aihhVar.copyOnWrite();
        anzi anziVar8 = (anzi) aihhVar.instance;
        apji apjiVar3 = (apji) aihhVar4.build();
        apjiVar3.getClass();
        anziVar8.p = apjiVar3;
        anziVar8.b |= SemanticState.Multiline;
        aihhVar.copyOnWrite();
        anzi anziVar9 = (anzi) aihhVar.instance;
        anziVar9.r = 2;
        anziVar9.b |= 32768;
        aihhVar.k(hmy.u((Context) this.d, str3));
        aihhVar.copyOnWrite();
        anzi anziVar10 = (anzi) aihhVar.instance;
        anziVar10.d = 1;
        anziVar10.b |= 2;
        return (anzi) aihhVar.build();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xgm] */
    public final jir s(int i, final Runnable runnable, final boolean z) {
        xgj xgjVar = new xgj(xhb.b(331983));
        final xgj xgjVar2 = new xgj(xhb.b(true != z ? 331984 : 357461));
        ?? r2 = this.c;
        jio jioVarE = jin.e();
        hmv hmvVar = new hmv(r2.hB(), xgjVar, xgjVar2);
        jik jikVar = (jik) jioVarE;
        jikVar.a = hmvVar;
        cf cfVar = (cf) this.d;
        jikVar.k(cfVar.getText(i));
        CharSequence text = z ? cfVar.getText(R.string.download_now_action) : cfVar.getText(R.string.settings);
        text.getClass();
        jioVarE.l(text, new View.OnClickListener() { // from class: hmu
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xgm] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, vxe] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kwq kwqVar = this.d;
                kwqVar.c.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar2, null);
                if (!z) {
                    kwqVar.a.a(ixt.A());
                    return;
                }
                hqu hquVar = (hqu) ((awmd) ((agfa) kwqVar.b).a).io();
                if (hquVar != null) {
                    hquVar.a(runnable);
                }
            }
        });
        return jioVarE.b();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void t(hev hevVar, amzv amzvVar) {
        ahno.ao(new gwb(this, hevVar, amzvVar, 3, (short[]) null), this.d);
    }

    public final grn u(grn grnVar, gro groVar) {
        if (!grs.q(groVar.a) || grnVar.getClass().equals(grs.class)) {
            grnVar.l(groVar);
            return grnVar;
        }
        Object obj = this.c;
        iwe iweVar = (iwe) obj;
        grs grsVar = new grs(grnVar, iweVar, (avlh) this.a, (avmb) this.b);
        grsVar.l(groVar);
        return grsVar;
    }

    public final fyy v(fyy fyyVar) {
        return ((kyr) this.d).K(this, fyyVar);
    }

    public final fyy w(fyo fyoVar) {
        fyy fyyVarK = fyy.f;
        Iterator itK = fyoVar.k();
        while (itK.hasNext()) {
            int iIntValue = ((Integer) itK.next()).intValue();
            fyyVarK = ((kyr) this.d).K(this, fyoVar.e(iIntValue));
            if (fyyVarK instanceof fyq) {
                break;
            }
        }
        return fyyVarK;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final fyy x(String str) {
        ?? r0 = this.a;
        if (r0.containsKey(str)) {
            return (fyy) r0.get(str);
        }
        Object obj = this.c;
        if (obj != null) {
            return ((kwq) obj).x(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void y(String str, fyy fyyVar) {
        if (this.b.containsKey(str)) {
            return;
        }
        ?? r1 = this.a;
        if (fyyVar == null) {
            r1.remove(str);
        } else {
            r1.put(str, fyyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void z(String str, fyy fyyVar) {
        y(str, fyyVar);
        this.b.put(str, Boolean.TRUE);
    }

    public kwq(Context context, hlz hlzVar, hfn hfnVar, hbf hbfVar) {
        this.d = context;
        this.c = hlzVar;
        this.b = hfnVar;
        this.a = hbfVar;
    }

    public kwq(avlh avlhVar, iwe iweVar, avmb avmbVar, adxj adxjVar) {
        this.a = avlhVar;
        this.c = iweVar;
        this.b = avmbVar;
        this.d = adxjVar;
    }

    public kwq(List list, eva evaVar, ewv ewvVar, ContentResolver contentResolver) {
        this.c = evaVar;
        this.d = ewvVar;
        this.a = contentResolver;
        this.b = list;
    }

    public kwq(syn synVar, Executor executor, klc klcVar, hfn hfnVar) {
        this.d = synVar;
        this.a = executor;
        this.c = klcVar;
        this.b = hfnVar;
    }

    public kwq(wqm wqmVar, her herVar, hdr hdrVar, Executor executor) {
        this.b = wqmVar;
        this.a = herVar;
        this.c = hdrVar;
        this.d = executor;
    }

    public kwq(ahgb ahgbVar, Executor executor, kue kueVar, yz yzVar) {
        this.d = ahgbVar;
        this.b = executor;
        this.a = kueVar;
        this.c = yzVar;
    }

    public kwq(Context context, aaqg aaqgVar, xgm xgmVar, xsc xscVar, grj grjVar) {
        context.getClass();
        this.d = context;
        aaqgVar.getClass();
        this.b = xgmVar.hB();
        this.a = xscVar;
        this.c = grjVar;
    }

    public kwq(Context context, gcw gcwVar) {
        this.c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        this.a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        ixt.Z(dir2);
        this.b = dir2;
        this.d = gcwVar;
    }

    public kwq(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
    }

    public kwq(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        this.d = awmdVar4;
    }

    public kwq(cf cfVar, vxe vxeVar, jin jinVar, xgm xgmVar, agev agevVar) {
        cfVar.getClass();
        vxeVar.getClass();
        jinVar.getClass();
        xgmVar.getClass();
        this.d = cfVar;
        this.a = vxeVar;
        this.c = xgmVar;
        this.b = agevVar;
    }

    public kwq(List list) {
        this.b = list;
        this.c = "video/mp2t";
        this.a = new cwj[list.size()];
        bxl bxlVar = new bxl(new deo(this, 2));
        this.d = bxlVar;
        bxlVar.c(3);
    }

    public kwq(Context context, Optional optional, hpy hpyVar, awut awutVar) {
        context.getClass();
        hpyVar.getClass();
        awutVar.getClass();
        this.d = context;
        this.a = optional;
        this.c = hpyVar;
        this.b = awutVar;
    }

    public kwq(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
        this.d = awmdVar4;
    }

    public kwq(byte[] bArr) {
        this.b = new afv();
        this.d = new SparseArray();
        this.a = new agk(10);
        this.c = new afv();
    }

    public kwq(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.d = awmdVar3;
        awmdVar4.getClass();
        this.b = awmdVar4;
    }

    public kwq(xgn xgnVar) {
        xgnVar.getClass();
        this.b = xgnVar;
        ibt ibtVar = ibt.FILL;
        awku awkuVarAC = awku.aC(ibtVar);
        this.a = awkuVarAC;
        awku awkuVarAC2 = awku.aC(Float.valueOf(ibtVar.c));
        this.d = awkuVarAC2;
        this.c = awkuVarAC.P();
        awkuVarAC2.P();
    }

    public kwq(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, char[] cArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.d = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
        this.c = awmdVar4;
    }

    public kwq(kwq kwqVar, kyr kyrVar) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = kwqVar;
        this.d = kyrVar;
    }
}
