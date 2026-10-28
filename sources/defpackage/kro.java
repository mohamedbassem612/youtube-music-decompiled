package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.net.Network;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class kro {
    public static gdg a;
    public static fhz b;
    public static fhz c;
    public static ahfi d;
    private static fma e;
    private static yy f;
    private static fhz g;

    public /* synthetic */ kro() {
    }

    public static jym A(String str, String str2, Bundle bundle) {
        jym jymVarA = jyn.a();
        jymVarA.b = str;
        jymVarA.e(true);
        if (str2.startsWith("oauth2:")) {
            jymVarA.c = agke.q(str2.replaceFirst("^oauth2:", ""));
        } else if (str2.startsWith("weblogin:")) {
            jymVarA.d = agke.q(str2.replaceFirst("^weblogin:", ""));
        } else if (str2.startsWith("audience:server:client_id:")) {
            jymVarA.f = agke.q(str2.substring(26));
        } else {
            jymVarA.e = agke.q(str2);
        }
        String string = bundle.getString("delegatee_user_id");
        if (string != null) {
            int i = bundle.getInt(rmp.DELEGATION_TYPE, 0);
            jymVarA.g = string;
            jymVarA.c(i);
        }
        String string2 = bundle.getString(jxs.a);
        if (string2 != null) {
            jymVarA.h = string2;
        }
        jymVarA.d(bundle.getBoolean("suppressProgressScreen"));
        Network network = (Network) aie.i(bundle, "networkToUse", Network.class);
        if (network != null) {
            jymVarA.i = network;
        }
        return jymVarA;
    }

    public static jym B(Account account, String str, jyq jyqVar, Bundle bundle) throws IOException {
        jyp jypVar;
        try {
            xyg xygVarA = jyk.a();
            xygVarA.f(account.type);
            Iterator it = ((jyl) mda.n(jyqVar.b(xygVarA.e()))).a.iterator();
            do {
                if (!it.hasNext()) {
                    jypVar = null;
                    break;
                }
                jypVar = (jyp) it.next();
            } while (!jypVar.c.equals(account.name));
            if (jypVar == null) {
                throw new IOException("Account not found: ".concat(String.valueOf(account.name)));
            }
            jym jymVarA = jyn.a();
            jymVarA.a = jypVar;
            jymVarA.e(true);
            if (str.startsWith("oauth2:")) {
                jymVarA.c = agke.q(str.replaceFirst("^oauth2:", ""));
            } else if (str.startsWith("weblogin:")) {
                jymVarA.d = agke.q(str.replaceFirst("^weblogin:", ""));
            } else if (str.startsWith("audience:server:client_id:")) {
                jymVarA.f = agke.q(str.substring(26));
            } else {
                jymVarA.e = agke.q(str);
            }
            String string = bundle.getString("delegatee_user_id");
            if (string != null) {
                int i = bundle.getInt(rmp.DELEGATION_TYPE, 0);
                jymVarA.g = string;
                jymVarA.c(i);
            }
            String string2 = bundle.getString(jxs.a);
            if (string2 != null) {
                jymVarA.h = string2;
            }
            jymVarA.d(bundle.getBoolean("suppressProgressScreen"));
            Network network = (Network) aie.i(bundle, "networkToUse", Network.class);
            if (network != null) {
                jymVarA.i = network;
            }
            return jymVarA;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw new IOException("Fetching accounts was interrupted", e2);
        } catch (ExecutionException e3) {
            throw new IOException("Account not found: ".concat(String.valueOf(account.name)), e3);
        }
    }

    public static boolean C(String str, jyq jyqVar, Context context, klt kltVar) {
        aupw aupwVar = aupw.a;
        boolean z = false;
        if (!aupwVar.io().f() || aupwVar.io().a().b.contains(str)) {
            kst.a.getClass();
        } else {
            if (!aupw.c()) {
                try {
                    mda.n(aupwVar.io().j() ? kltVar.d(MoreExecutors.directExecutor(), jyqVar, new knd[0]) : kltVar.c(jyqVar, new knd[0]));
                    z = true;
                } catch (InterruptedException | ExecutionException e2) {
                    if (e2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (kltVar.m(context, 234200000) == 0) {
                z = true;
            }
            kst.a.getClass();
        }
        return z;
    }

    public static void D(ExecutionException executionException) throws jxr, IOException {
        if (aupw.c() && (executionException.getCause() instanceof kmu)) {
            kmu kmuVar = (kmu) executionException.getCause();
            if (kmuVar.a() == 17 || kmuVar.a() == 22) {
                return;
            }
            if (aupw.a.io().i() && kmuVar != null) {
                int iA = kmuVar.a();
                if (iA != 7 && iA != 20 && iA != 21) {
                    switch (iA) {
                    }
                }
                throw new IOException(kmuVar);
            }
        }
        if (executionException.getCause() instanceof UserRecoverableAuthException) {
            throw ((UserRecoverableAuthException) executionException.getCause());
        }
        if (executionException.getCause() instanceof jyt) {
            throw new UserRecoverableAuthException(executionException.getCause().getMessage(), hna.S(((jyt) executionException.getCause()).a.h), 1);
        }
        if (executionException.getCause() instanceof jxr) {
            throw ((jxr) executionException.getCause());
        }
        if (executionException.getCause() instanceof jyj) {
            throw new jxr(executionException.getCause().getMessage(), executionException.getCause());
        }
        if (executionException.getCause() instanceof IOException) {
            throw ((IOException) executionException.getCause());
        }
        if (!(executionException.getCause() instanceof jyb)) {
            throw new jxr("Unexpected exception while fetching token.", executionException);
        }
        throw ((jyb) executionException.getCause());
    }

    public static Object E(agfr agfrVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return agfrVar.io();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void F(View view, int i, int i2) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void G(View view, int i, int i2) {
        view.getClass();
        float f2 = i;
        float f3 = i2;
        if (view.getX() == f2 && view.getY() == f3) {
            return;
        }
        view.setX(f2);
        view.setY(f3);
        view.requestLayout();
    }

    public static Optional H(apji apjiVar, aigw aigwVar) {
        if (apjiVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aigwVar);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                return Optional.of(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return Optional.empty();
    }

    public static List I(List list, aigw aigwVar) {
        if (list == null) {
            return agpi.a;
        }
        agjz agjzVar = new agjz(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apji apjiVar = (apji) it.next();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aigwVar);
                apjiVar.c(aihlVarCheckIsLite2);
                Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
                agjzVar.h(objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return agjzVar.g();
    }

    public static boolean J(List list, Object obj) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Objects.equals(aavv.r((apji) it.next()), obj)) {
                return true;
            }
        }
        return false;
    }

    public static ListenableFuture K() {
        aihf aihfVarCreateBuilder = anvi.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anvi anviVar = (anvi) aihfVarCreateBuilder.instance;
        anviVar.b |= 2;
        anviVar.d = false;
        aihfVarCreateBuilder.copyOnWrite();
        anvi anviVar2 = (anvi) aihfVarCreateBuilder.instance;
        anviVar2.b |= 4;
        anviVar2.e = 2592000L;
        aihfVarCreateBuilder.copyOnWrite();
        anvi anviVar3 = (anvi) aihfVarCreateBuilder.instance;
        anviVar3.b |= 8;
        anviVar3.f = true;
        aihfVarCreateBuilder.copyOnWrite();
        anvi anviVar4 = (anvi) aihfVarCreateBuilder.instance;
        anviVar4.b |= 16;
        anviVar4.g = 2592000L;
        return ahng.n((anvi) aihfVarCreateBuilder.build());
    }

    public static void L(View... viewArr) {
        View view = null;
        for (View view2 : viewArr) {
            if (view2 != null) {
                if (view != null) {
                    int id = view.getId();
                    if (id == -1) {
                        throw new IllegalStateException("Cannot specify traversal order for views without ids");
                    }
                    view2.setAccessibilityTraversalAfter(id);
                }
                view = view2;
            }
        }
    }

    public static boolean M(cc ccVar) {
        return ccVar.getView() == null;
    }

    public static jji N(anyb anybVar) {
        anybVar.getClass();
        return new jji(anybVar);
    }

    public static String O(Object obj) {
        if (obj instanceof aqof) {
            return ((aqof) obj).l;
        }
        if (obj instanceof amks) {
            return ((amks) obj).i;
        }
        if (obj instanceof anwt) {
            return ((anwt) obj).i;
        }
        if (obj instanceof aqjj) {
            return ((aqjj) obj).j;
        }
        if (obj instanceof aonl) {
            return ((aonl) obj).f;
        }
        if (obj instanceof ajnf) {
            return ((ajnf) obj).o;
        }
        return null;
    }

    @Deprecated
    public static View P(Object obj, ViewGroup viewGroup, admh admhVar, adly adlyVar) {
        View viewR = R(obj, admhVar, null, adlyVar);
        if (viewR != null) {
            viewGroup.addView(viewR);
        }
        return viewR;
    }

    public static View Q(Object obj, ViewGroup viewGroup, admh admhVar, adly adlyVar) {
        View viewR = R(obj, admhVar, viewGroup, adlyVar);
        if (viewR != null) {
            viewGroup.addView(viewR);
        }
        return viewR;
    }

    public static View R(Object obj, admh admhVar, ViewGroup viewGroup, adly adlyVar) {
        int iA = admhVar.a(obj);
        adma admaVarC = admhVar.c(iA, viewGroup);
        if (admaVarC == null) {
            return null;
        }
        admaVarC.hU(adlyVar, obj);
        View viewA = admaVarC.a();
        adul.j(viewA, admaVarC, iA);
        return viewA;
    }

    public static View S(Object obj, admh admhVar, ViewGroup viewGroup, admo admoVar) {
        int iA = admhVar.a(obj);
        adma admaVarC = admhVar.c(iA, viewGroup);
        if (admaVarC == null) {
            return null;
        }
        admaVarC.hU(admoVar.z(admaVarC, 0), obj);
        View viewA = admaVarC.a();
        adul.j(viewA, admaVarC, iA);
        return viewA;
    }

    public static adly T(View view, adly adlyVar) {
        int iB = adlyVar.b("pagePadding", -1);
        if (iB < 0) {
            return adlyVar;
        }
        view.setPadding(iB, view.getPaddingTop(), iB, view.getPaddingBottom());
        adly adlyVar2 = new adly(adlyVar);
        adlyVar2.f("pagePadding", -1);
        return adlyVar2;
    }

    public static String U(aiqe aiqeVar) {
        if (aiqeVar != null && (aiqeVar.b & 1) != 0) {
            aiqd aiqdVar = aiqeVar.c;
            if (aiqdVar == null) {
                aiqdVar = aiqd.a;
            }
            if ((aiqdVar.b & 2) != 0) {
                aiqd aiqdVar2 = aiqeVar.c;
                if (aiqdVar2 == null) {
                    aiqdVar2 = aiqd.a;
                }
                return aiqdVar2.c;
            }
        }
        return null;
    }

    @Deprecated
    public static void V(List list, ViewGroup viewGroup, admh admhVar, adly adlyVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            P(it.next(), viewGroup, admhVar, adlyVar);
        }
    }

    public static void W(List list, ViewGroup viewGroup, admh admhVar, adly adlyVar) {
        if (list == null || list.isEmpty()) {
            tuk.l(viewGroup, false);
            return;
        }
        tuk.l(viewGroup, true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apji apjiVar = (apji) it.next();
            Optional optionalH = H(apjiVar, anpw.a);
            if (optionalH.isPresent()) {
                P((anpv) optionalH.get(), viewGroup, admhVar, adlyVar);
            }
            Optional optionalH2 = H(apjiVar, annm.a);
            if (optionalH2.isPresent()) {
                P((annl) optionalH2.get(), viewGroup, admhVar, adlyVar);
            }
            Optional optionalH3 = H(apjiVar, ajkv.b);
            if (optionalH3.isPresent()) {
                P((ajkf) optionalH3.get(), viewGroup, admhVar, adlyVar);
            }
            Optional optionalH4 = H(apjiVar, anmv.a);
            if (optionalH4.isPresent()) {
                adly adlyVar2 = new adly(adlyVar);
                adlyVar2.f("customIndexOrderingIconStart", Boolean.TRUE);
                Q((anmu) optionalH4.get(), viewGroup, admhVar, adlyVar2);
            }
            Optional optionalH5 = H(apjiVar, ajkv.a);
            if (optionalH5.isPresent()) {
                Q((ajkp) optionalH5.get(), viewGroup, admhVar, adlyVar);
            }
        }
    }

    public static void X(ViewGroup viewGroup, admh admhVar) {
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = viewGroup.getChildAt(childCount);
            viewGroup.removeView(childAt);
            admhVar.e(childAt);
        }
    }

    public static void Y(List list) {
        try {
            aihf aihfVar = (aihf) alix.a.createBuilder().mergeFrom(((alix) list.get(0)).toByteArray(), ExtensionRegistryLite.getGeneratedRegistry());
            aihfVar.copyOnWrite();
            alix alixVar = (alix) aihfVar.instance;
            alixVar.e = null;
            alixVar.b &= -9;
            alix alixVar2 = (alix) aihfVar.build();
            list.remove(0);
            list.add(alixVar2);
        } catch (aiik unused) {
        }
    }

    public static void Z(View view, int i, int i2) {
        view.setPadding(i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static String aA() {
        return wfs.g(591, "radiostar_snooze_status_entity_key");
    }

    public static String aB(String str) {
        return wfs.g(148, str);
    }

    public static String aC(String str) {
        return ap(17, "sideloaded", str);
    }

    public static String aD(String str) {
        return ap(24, "sideloaded", str);
    }

    public static String aE(String str) {
        return ap(258, "sideloaded", str);
    }

    public static String aF(String str) {
        return ap(28, "sideloaded", str);
    }

    public static String aG() {
        return wfs.g(385, "smart_download_trigger");
    }

    public static String aH(String str) {
        return wfs.g(28, str);
    }

    public static String aI(String str) {
        return wfs.g(234, str);
    }

    public static String aJ(String str) {
        return wfs.g(120, str);
    }

    public static String aK(String str) {
        return wfs.g(461, str);
    }

    public static String aL(String str) {
        return wfs.g(76, str);
    }

    public static String aM() {
        return wfs.g(509, "YTM_WATCH_PAGE_ENGAGEMENT_PANEL_BACKGROUND_COLOR_ENTITY_KEY");
    }

    public static anmd aN(auiu auiuVar) {
        aihf aihfVarCreateBuilder = anmd.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar = (anmd) aihfVarCreateBuilder.instance;
        anmdVar.b |= 1;
        anmdVar.c = auiuVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar2 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar2.b |= 2;
        anmdVar2.d = auiuVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar3 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar3.b |= 4;
        anmdVar3.e = auiuVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar4 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar4.b |= 8;
        anmdVar4.f = auiuVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar5 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar5.b |= 16;
        anmdVar5.g = auiuVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar6 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar6.b |= 32;
        anmdVar6.h = auiuVar.f;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar7 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar7.b |= 64;
        anmdVar7.i = auiuVar.g;
        aihfVarCreateBuilder.copyOnWrite();
        anmd anmdVar8 = (anmd) aihfVarCreateBuilder.instance;
        anmdVar8.b |= SemanticState.Focused;
        anmdVar8.j = auiuVar.h;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (anmd) aihnVarBuild;
    }

    public static gid aO(afwv afwvVar) {
        afwvVar.h(false);
        return afwvVar.g();
    }

    public static gid aP(afwv afwvVar) {
        afwvVar.h(true);
        return afwvVar.g();
    }

    public static String aQ(String str, Map map) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('?');
        for (String str2 : map.keySet()) {
            String str3 = (String) map.get(str2);
            sb.append(str2);
            sb.append('=');
            sb.append(str3);
            sb.append('&');
        }
        if (sb.charAt(sb.length() - 1) == '&') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static boolean aR(String str) {
        return str == null || str.length() == 0;
    }

    public static void aS(String str) {
        if (Log.isLoggable("SenderHttpURLConnection", 6)) {
            Log.e("SenderHttpURLConnection", str);
        }
    }

    public static synchronized void aT(gde gdeVar) {
        String str = gdeVar.b;
        String str2 = gdeVar.a;
        if (gdeVar.e == null) {
            gdeVar.e = new gdj(gdeVar.f, gdeVar.g);
        }
        gdg gdgVar = new gdg(str, str2, "3", gdeVar.e, gdeVar.h);
        a = gdgVar;
        if (gdeVar.c <= 0) {
            Log.w("ReporterDefault", "too small batch size :0, changed to 1");
        }
        int i = gdgVar.e;
        gdgVar.f = 1;
        for (Map.Entry entry : gdeVar.d.entrySet()) {
            a.b((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public static synchronized gdg aU() {
        if (a == null) {
            aT(new gde());
        }
        return a;
    }

    public static String aV(Context context, String str, long j) {
        String strEncodeToString = "E";
        try {
            aihf aihfVarCreateBuilder = fxn.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            fxn fxnVar = (fxn) aihfVarCreateBuilder.instance;
            str.getClass();
            fxnVar.b |= 2;
            fxnVar.d = str;
            aihfVarCreateBuilder.copyOnWrite();
            fxn fxnVar2 = (fxn) aihfVarCreateBuilder.instance;
            fxnVar2.b |= 1;
            fxnVar2.c = "0.970846395";
            String packageName = context.getPackageName();
            aihfVarCreateBuilder.copyOnWrite();
            fxn fxnVar3 = (fxn) aihfVarCreateBuilder.instance;
            packageName.getClass();
            fxnVar3.b |= 8;
            fxnVar3.f = packageName;
            long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
            aihfVarCreateBuilder.copyOnWrite();
            fxn fxnVar4 = (fxn) aihfVarCreateBuilder.instance;
            fxnVar4.b |= 32;
            fxnVar4.h = jCurrentTimeMillis;
            long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
            aihfVarCreateBuilder.copyOnWrite();
            fxn fxnVar5 = (fxn) aihfVarCreateBuilder.instance;
            fxnVar5.b |= 4;
            fxnVar5.e = jCurrentTimeMillis2;
            if (((Boolean) jwp.w.d()).booleanValue()) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb = new StringBuilder();
                        for (byte b2 : bArrDigest) {
                            String hexString = Integer.toHexString(b2 & 255);
                            if (hexString.length() == 1) {
                                sb.append('0');
                            }
                            sb.append(hexString);
                        }
                        strEncodeToString = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 11);
                    }
                } catch (Exception unused) {
                }
                aihfVarCreateBuilder.copyOnWrite();
                fxn fxnVar6 = (fxn) aihfVarCreateBuilder.instance;
                strEncodeToString.getClass();
                fxnVar6.b |= 64;
                fxnVar6.i = strEncodeToString;
            }
            try {
                long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                aihfVarCreateBuilder.copyOnWrite();
                fxn fxnVar7 = (fxn) aihfVarCreateBuilder.instance;
                fxnVar7.b |= 16;
                fxnVar7.g = j2;
            } catch (PackageManager.NameNotFoundException unused2) {
                aihfVarCreateBuilder.copyOnWrite();
                fxn fxnVar8 = (fxn) aihfVarCreateBuilder.instance;
                fxnVar8.b |= 16;
                fxnVar8.g = -1L;
            }
            aihf aihfVarE = fzu.e(((fxn) aihfVarCreateBuilder.build()).toByteArray(), null);
            aihfVarE.copyOnWrite();
            fxp fxpVar = (fxp) aihfVarE.instance;
            fxp fxpVar2 = fxp.a;
            fxpVar.e = 4;
            fxpVar.b |= 2;
            aihfVarE.copyOnWrite();
            fxp fxpVar3 = (fxp) aihfVarE.instance;
            fxpVar3.f = 1;
            fxpVar3.b |= 4;
            return Base64.encodeToString(((fxp) aihfVarE.build()).toByteArray(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused3) {
            return "7";
        }
    }

    public static byte[] aW(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    public static int aX(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 1000 ? 0 : 1001;
        }
        return 3;
    }

    public static boolean aY(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String aZ(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    public static void aa(View view, aiqe aiqeVar) {
        String strU = U(aiqeVar);
        if (strU != null) {
            view.setContentDescription(strU);
        } else {
            view.setContentDescription(null);
        }
    }

    public static int ab(Context context) {
        return ((context.getResources().getDisplayMetrics().widthPixels - (jnj.w(context) << 1)) * context.getResources().getInteger(R.integer.long_text_description_shelf_width_cols)) / 12;
    }

    public static izd ac(View view, byte[] bArr, xgn xgnVar) {
        view.getClass();
        return new izd(view, bArr, xgnVar);
    }

    public static hkm ad(ajwo ajwoVar, boolean z) {
        int i = 0;
        if (ajwoVar == null) {
            return new hkm(0, 0);
        }
        int iH = tsv.h(ajwoVar);
        int i2 = R.anim.vertical_enter_fragment_animation;
        if (!z && iH != 4) {
            if (iH == 5) {
                i2 = R.anim.zoom_enter_fragment_animation;
            } else {
                i2 = iH == 2 ? 0 : R.anim.horizontal_enter_fragment_animation;
            }
        }
        int iH2 = tsv.h(ajwoVar);
        if (z || iH2 == 4) {
            i = R.anim.vertical_exit_fragment_animation;
        } else if (iH2 == 5) {
            i = R.anim.zoom_exit_fragment_animation;
        } else if (iH2 != 2) {
            i = R.anim.horizontal_exit_fragment_animation;
        }
        return new hkm(i2, i);
    }

    public static PendingIntent ae(Context context, Intent intent) {
        return qof.b(context, 16, intent, 201326592);
    }

    public static int af(Resources resources) {
        return (int) resources.getDimension(R.dimen.music_app_devicepicker_metadata_icon_layout_width);
    }

    public static hfs ag(akfy akfyVar) {
        akfyVar.getClass();
        return new hfs(akfyVar);
    }

    public static ajmf ah(ajwo ajwoVar) {
        if (!ak(ajwoVar)) {
            throw new IllegalArgumentException();
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        return (ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public static ajwo ai(String str) {
        aihf aihfVarCreateBuilder = ajmf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajmf ajmfVar = (ajmf) aihfVarCreateBuilder.instance;
        ajmfVar.b |= 1;
        ajmfVar.c = str;
        ajmf ajmfVar2 = (ajmf) aihfVarCreateBuilder.build();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(ajmj.a, ajmfVar2);
        return (ajwo) aihhVar.build();
    }

    public static String aj(ajwo ajwoVar) {
        if (!ak(ajwoVar)) {
            throw new IllegalArgumentException();
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        ajmf ajmfVar = (ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        ageu ageuVar = new ageu("BrowseEndpoint");
        ageuVar.b("id", ajmfVar.c);
        ageuVar.b("params", ajmfVar.d);
        ageuVar.b("query", ajmfVar.e);
        ageuVar.g("offline", ajmfVar.f);
        ageuVar.g("hasFormData", (ajmfVar.b & 64) != 0);
        return ageuVar.toString();
    }

    public static boolean ak(ajwo ajwoVar) {
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                return true;
            }
        }
        return false;
    }

    public static boolean al(ajwo ajwoVar) {
        ajmf ajmfVarAh = ah(ajwoVar);
        return (ajmfVarAh.f || ajmfVarAh.c.equals("FEmusic_offline") || hef.q(ajmfVarAh)) ? false : true;
    }

    public static String am(String str) {
        return wfs.g(17, str);
    }

    public static String an(String str) {
        return wfs.g(259, str);
    }

    public static String ao() {
        return wfs.g(484, "YTM_CONVERSATIONAL_RADIO_BUILDER_ENTITY");
    }

    public static String ap(int i, String... strArr) {
        return wfs.e(i, new ager("-").f(strArr));
    }

    public static String aq() {
        int i = wfs.a;
        return wfs.f(257, aigj.x("downloads_library"));
    }

    public static String ar(String str) {
        String strH = wfs.h(str);
        String string = TextUtils.concat("sideloaded", "-").toString();
        int i = agfq.a;
        if (strH.startsWith(string)) {
            return strH.substring(string.length());
        }
        return null;
    }

    public static String as(String str) {
        return wfs.g(557, str);
    }

    public static String at(String str) {
        return wfs.g(452, str);
    }

    public static String au(String str) {
        return wfs.g(307, "EDIT_PL-".concat(str));
    }

    public static String av(String str) {
        return wfs.g(130, str);
    }

    public static String aw(String str) {
        return wfs.g(198, str);
    }

    public static String ax(String str) {
        return wfs.g(119, str);
    }

    public static String ay(String str) {
        return wfs.g(24, str);
    }

    public static String az(String str) {
        return wfs.g(248, str);
    }

    public static void ba(Context context, String str, String str2, Set set) throws Throwable {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (aY(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        String.format(Locale.US, "Beginning load of %s...", str);
        bq(context, str, str2, set);
    }

    protected static File bb(Context context, String str, String str2) {
        String strAZ = aZ(str);
        return aY(str2) ? new File(context.getDir("lib", 0), strAZ) : new File(context.getDir("lib", 0), a.cl(str2, (byte) 46, strAZ));
    }

    public static void bc(Context context, String str) throws Throwable {
        ba(context, str, null, new HashSet());
    }

    public static int bd(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        throw new IllegalArgumentException(a.bR(i, "Unknown enum value: "));
    }

    public static /* synthetic */ String be(int i) {
        switch (i) {
            case 1:
                return "LEFT";
            case 2:
                return "TOP";
            case 3:
                return "RIGHT";
            case 4:
                return "BOTTOM";
            case 5:
                return "START";
            case 6:
                return "END";
            case 7:
                return "HORIZONTAL";
            case 8:
                return "VERTICAL";
            default:
                return "ALL";
        }
    }

    public static int bf(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                throw new IllegalArgumentException(a.bR(i, "Unknown enum value: "));
        }
    }

    public static boolean bg(float f2) {
        return Float.compare(f2, Float.NaN) == 0;
    }

    public static void bh(fve fveVar, Object obj) {
        yy yyVar = f;
        if (yyVar == null) {
            yyVar = new yy();
            f = yyVar;
        }
        if (obj instanceof View) {
            yyVar.a = obj;
        }
        fveVar.d(f);
        f.a = null;
    }

    public static void bi(fve fveVar) {
        fhz fhzVar = g;
        if (fhzVar == null) {
            fhzVar = new fhz();
            g = fhzVar;
        }
        fveVar.d(fhzVar);
    }

    public static void bj(fve fveVar, int i, int i2, int i3, int i4, float f2, float f3) {
        fma fmaVar = e;
        if (fmaVar == null) {
            fmaVar = new fma();
            e = fmaVar;
        }
        fmaVar.a = i;
        fmaVar.b = i2;
        fmaVar.c = i4;
        fmaVar.d = i3;
        fmaVar.f = f3;
        fmaVar.e = f2;
        fveVar.d(fmaVar);
    }

    public static boolean bk() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void bl() {
        if (!fvn.a && !bk()) {
            throw new IllegalStateException("This must run on the main thread; but is running on ".concat(String.valueOf(Thread.currentThread().getName())));
        }
    }

    public static onp bm(axfd axfdVar, nvp nvpVar, nuc nucVar, xje xjeVar, adhv adhvVar, Executor executor, Executor executor2, Executor executor3, zsl zslVar, nry nryVar, ci ciVar, mbc mbcVar) {
        return axfdVar.ae(nvpVar, new hbg(new adet(nryVar, nucVar, xjeVar, adhvVar, executor, executor2, executor3, zslVar, ciVar, mbcVar), 2), asnt.b);
    }

    private static int bn(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    private static long bo(byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    private static void bp(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jBo = j + bo(bArr, i);
        long jBo2 = bo(bArr, i + 8);
        long jBo3 = bo(bArr, i + 16);
        long jBo4 = bo(bArr, i + 24);
        long j3 = jBo2 + jBo + jBo3;
        long jRotateRight = Long.rotateRight(j2 + jBo + jBo4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + jBo4;
        jArr[1] = jRotateRight + jBo;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0214 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    private static void bq(Context context, String str, String str2, Set set) throws Throwable {
        kyr kyrVar;
        kyr kyrVar2;
        String[] strArr;
        int i;
        int i2;
        InputStream inputStream;
        kyr kyrVar3;
        ZipFile zipFile;
        InputStream inputStream2;
        InputStream inputStream3;
        ?? fileOutputStream;
        ?? r5;
        int i3;
        int i4 = 0;
        int i5 = 1;
        if (set.contains(str)) {
            String.format(Locale.US, "%s already loaded previously!", str);
            return;
        }
        try {
            System.loadLibrary(str);
            set.add(str);
            String.format(Locale.US, "%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e2) {
            String.format(Locale.US, "Loading the library normally failed: %s", Log.getStackTraceString(e2));
            String.format(Locale.US, "%s (%s) was not loaded normally, re-linking...", str, str2);
            ?? Bb = bb(context, str, str2);
            if (!Bb.exists()) {
                File dir = context.getDir("lib", 0);
                File fileBb = bb(context, str, str2);
                File[] fileArrListFiles = dir.listFiles(new fwt(aZ(str)));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (!file.getAbsolutePath().equals(fileBb.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                String[] strArr2 = Build.SUPPORTED_ABIS.length > 0 ? Build.SUPPORTED_ABIS : !aY(Build.CPU_ABI2) ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : new String[]{Build.CPU_ABI};
                String strAZ = aZ(str);
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    if (applicationInfo.splitSourceDirs == null || applicationInfo.splitSourceDirs.length == 0) {
                        strArr = new String[]{applicationInfo.sourceDir};
                    } else {
                        strArr = new String[applicationInfo.splitSourceDirs.length + 1];
                        strArr[0] = applicationInfo.sourceDir;
                        System.arraycopy(applicationInfo.splitSourceDirs, 0, strArr, 1, applicationInfo.splitSourceDirs.length);
                    }
                    int length = strArr.length;
                    int i6 = 0;
                    ZipFile zipFile2 = null;
                    loop1: while (true) {
                        int i7 = 5;
                        if (i6 >= length) {
                            i = i4;
                            i2 = i5;
                            inputStream = null;
                            kyrVar3 = null;
                            break;
                        }
                        String str3 = strArr[i6];
                        i = i4;
                        while (i4 < 5) {
                            try {
                                zipFile2 = new ZipFile(new File(str3), i5);
                                break;
                            } catch (IOException unused) {
                                i4++;
                            }
                        }
                        if (zipFile2 != null) {
                            int i8 = i;
                            while (true) {
                                int i9 = i8 + 1;
                                if (i8 >= i7) {
                                    i3 = i5;
                                    kyrVar = null;
                                    try {
                                        try {
                                            zipFile2.close();
                                            break;
                                        } catch (Throwable th) {
                                            th = th;
                                            kyrVar2 = kyrVar;
                                            if (kyrVar2 != null) {
                                                try {
                                                    ((ZipFile) kyrVar2.b).close();
                                                } catch (IOException unused2) {
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (IOException unused3) {
                                        break;
                                    }
                                }
                                int length2 = strArr2.length;
                                int i10 = i;
                                while (i10 < length2) {
                                    i2 = i5;
                                    int i11 = length2;
                                    int i12 = i9;
                                    String str4 = "lib" + File.separatorChar + strArr2[i10] + File.separatorChar + strAZ;
                                    Object[] objArr = new Object[2];
                                    objArr[i] = str4;
                                    objArr[i2] = str3;
                                    String.format(Locale.US, "Looking for %s in APK %s...", objArr);
                                    ZipEntry entry = zipFile2.getEntry(str4);
                                    if (entry != null) {
                                        inputStream = null;
                                        kyrVar = null;
                                        kyrVar3 = new kyr((Object) zipFile2, (Object) entry, (byte[]) null);
                                        break loop1;
                                    } else {
                                        i10++;
                                        i5 = i2;
                                        length2 = i11;
                                        i9 = i12;
                                        i7 = 5;
                                    }
                                }
                                i8 = i9;
                                th = th;
                                kyrVar2 = kyrVar;
                                if (kyrVar2 != null) {
                                    ((ZipFile) kyrVar2.b).close();
                                }
                                throw th;
                            }
                        }
                        i3 = i5;
                        i6++;
                        i4 = i;
                        i5 = i3;
                    }
                    try {
                        if (kyrVar3 == null) {
                            throw new fws(strAZ);
                        }
                        int i13 = i;
                        while (true) {
                            try {
                                if (i13 >= 5) {
                                    zipFile = (ZipFile) kyrVar3.b;
                                    break;
                                }
                                Object[] objArr2 = new Object[i2];
                                objArr2[i] = strAZ;
                                String.format(Locale.US, "Found %s! Extracting...", objArr2);
                                i13++;
                                try {
                                    if (Bb.exists() || Bb.createNewFile()) {
                                        try {
                                            inputStream3 = ((ZipFile) kyrVar3.b).getInputStream((ZipEntry) kyrVar3.a);
                                            try {
                                                fileOutputStream = new FileOutputStream((File) Bb);
                                                try {
                                                    byte[] bArr = new byte[SemanticState.Obscured];
                                                    long j = 0;
                                                    while (true) {
                                                        int i14 = inputStream3.read(bArr);
                                                        if (i14 == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream.write(bArr, i, i14);
                                                        j += (long) i14;
                                                        i = 0;
                                                    }
                                                    fileOutputStream.flush();
                                                    fileOutputStream.getFD().sync();
                                                    if (j == Bb.length()) {
                                                        afxw.h(inputStream3);
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (IOException unused4) {
                                                        }
                                                        ?? r3 = i;
                                                        Bb.setReadable(true, r3);
                                                        Bb.setExecutable(true, r3);
                                                        Bb.setWritable(true);
                                                        zipFile = (ZipFile) kyrVar3.b;
                                                        break;
                                                    }
                                                    afxw.h(inputStream3);
                                                    fileOutputStream.close();
                                                } catch (FileNotFoundException unused5) {
                                                    afxw.h(inputStream3);
                                                    afxw.h(fileOutputStream);
                                                    i = 0;
                                                    i2 = 1;
                                                } catch (IOException unused6) {
                                                    afxw.h(inputStream3);
                                                    afxw.h(fileOutputStream);
                                                    i = 0;
                                                    i2 = 1;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream2 = inputStream3;
                                                    r5 = fileOutputStream;
                                                    afxw.h(inputStream2);
                                                    afxw.h(r5);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused7) {
                                                fileOutputStream = inputStream;
                                            } catch (IOException unused8) {
                                                fileOutputStream = inputStream;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                inputStream2 = inputStream3;
                                                r5 = inputStream;
                                            }
                                        } catch (FileNotFoundException unused9) {
                                            inputStream3 = inputStream;
                                            fileOutputStream = inputStream3;
                                        } catch (IOException unused10) {
                                            inputStream3 = inputStream;
                                            fileOutputStream = inputStream3;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            inputStream2 = inputStream;
                                            r5 = inputStream;
                                        }
                                    }
                                } catch (IOException unused11) {
                                }
                                i = 0;
                                i2 = 1;
                            } catch (IOException unused12) {
                            }
                        }
                        zipFile.close();
                    } catch (Throwable th5) {
                        th = th5;
                        kyrVar2 = kyrVar3;
                        if (kyrVar2 != null) {
                            ((ZipFile) kyrVar2.b).close();
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    kyrVar = null;
                }
            }
            System.load(Bb.getAbsolutePath());
            set.add(str);
            String.format(Locale.US, "%s (%s) was re-linked!", str, str2);
        }
    }

    public static void c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void e(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + '.');
        }
    }

    public static void f(String str) {
        if (!ksy.d()) {
            throw new IllegalStateException(str);
        }
    }

    public static void g(String str) {
        if (ksy.d()) {
            throw new IllegalStateException(str);
        }
    }

    public static void h(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void i(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void j(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void k() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
    }

    public static void l(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void m(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static boolean n(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            if (bundle == bundle2) {
                return true;
            }
        } else if (bundle.size() == bundle2.size()) {
            Set<String> setKeySet = bundle.keySet();
            if (setKeySet.containsAll(bundle2.keySet())) {
                for (String str : setKeySet) {
                    if (!Objects.equals(bundle.get(str), bundle2.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static String o(List list, Object obj) {
        StringBuilder sb = new StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void p(String str, Object obj, List list) {
        list.add(str + '=' + String.valueOf(obj));
    }

    public static kmu q(Status status) {
        return status.h != null ? new knh(status) : new kmu(status);
    }

    public static String r(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return a.bR(i, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
            case 23:
                return "RATE_LIMIT_EXCEEDED";
        }
    }

    public static kmv s(kmx kmxVar, boolean z, knk knkVar, boolean z2) {
        kmv kmvVar = new kmv(kmxVar, z, knkVar);
        kmvVar.e = z2;
        return kmvVar;
    }

    public static long t(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        if (i > bArr2.length) {
            throw new IndexOutOfBoundsException(a.bR(i, "Out of bound index with offput: 0 and length: "));
        }
        long j = -5435081209227447693L;
        char c2 = 0;
        if (i <= 32) {
            if (i > 16) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2, 0, 8);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                long j2 = byteBufferWrap.getLong() * (-5435081209227447693L);
                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2, 8, 8);
                byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                long j3 = byteBufferWrap2.getLong();
                ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(bArr2, i - 8, 8);
                byteBufferWrap3.order(ByteOrder.LITTLE_ENDIAN);
                long j4 = ((long) (i << 1)) - 7286425919675154353L;
                long j5 = byteBufferWrap3.getLong() * j4;
                ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(bArr2, i - 16, 8);
                byteBufferWrap4.order(ByteOrder.LITTLE_ENDIAN);
                long j6 = byteBufferWrap4.getLong() * (-7286425919675154353L);
                long jRotateRight = Long.rotateRight(j2 + j3, 43) + Long.rotateRight(j5, 30);
                long jRotateRight2 = j2 + Long.rotateRight(j3 - 7286425919675154353L, 18) + j5;
                long j7 = ((jRotateRight + j6) ^ jRotateRight2) * j4;
                long j8 = (jRotateRight2 ^ (j7 ^ (j7 >>> 47))) * j4;
                return j4 * (j8 ^ (j8 >>> 47));
            }
            if (i >= 8) {
                long j9 = ((long) (i << 1)) - 7286425919675154353L;
                ByteBuffer byteBufferWrap5 = ByteBuffer.wrap(bArr2, 0, 8);
                byteBufferWrap5.order(ByteOrder.LITTLE_ENDIAN);
                long j10 = byteBufferWrap5.getLong() - 7286425919675154353L;
                ByteBuffer byteBufferWrap6 = ByteBuffer.wrap(bArr2, i - 8, 8);
                byteBufferWrap6.order(ByteOrder.LITTLE_ENDIAN);
                long j11 = byteBufferWrap6.getLong();
                long jRotateRight3 = Long.rotateRight(j11, 37) * j9;
                long jRotateRight4 = (Long.rotateRight(j10, 25) + j11) * j9;
                long j12 = ((jRotateRight3 + j10) ^ jRotateRight4) * j9;
                long j13 = (jRotateRight4 ^ (j12 ^ (j12 >>> 47))) * j9;
                return (j13 ^ (j13 >>> 47)) * j9;
            }
            if (i >= 4) {
                long j14 = ((long) (i << 1)) - 7286425919675154353L;
                long jBn = bn(bArr2, 0);
                long jBn2 = ((long) bn(bArr2, i - 4)) & 4294967295L;
                long j15 = ((((long) i) + ((jBn & 4294967295L) << 3)) ^ jBn2) * j14;
                long j16 = (jBn2 ^ (j15 ^ (j15 >>> 47))) * j14;
                return (j16 ^ (j16 >>> 47)) * j14;
            }
            if (i <= 0) {
                return -7286425919675154353L;
            }
            long j17 = (((long) ((bArr2[0] & 255) + ((bArr2[i >> 1] & 255) << 8))) * (-7286425919675154353L)) ^ (((long) (((bArr2[i - 1] & 255) << 2) + i)) * (-4348849565147123417L));
            return (-7286425919675154353L) * (j17 ^ (j17 >>> 47));
        }
        char c3 = '@';
        if (i <= 64) {
            ByteBuffer byteBufferWrap7 = ByteBuffer.wrap(bArr2, 0, 8);
            byteBufferWrap7.order(ByteOrder.LITTLE_ENDIAN);
            long j18 = byteBufferWrap7.getLong() * (-7286425919675154353L);
            ByteBuffer byteBufferWrap8 = ByteBuffer.wrap(bArr2, 8, 8);
            byteBufferWrap8.order(ByteOrder.LITTLE_ENDIAN);
            long j19 = byteBufferWrap8.getLong();
            ByteBuffer byteBufferWrap9 = ByteBuffer.wrap(bArr2, i - 8, 8);
            byteBufferWrap9.order(ByteOrder.LITTLE_ENDIAN);
            long j20 = ((long) (i << 1)) - 7286425919675154353L;
            long j21 = byteBufferWrap9.getLong() * j20;
            ByteBuffer byteBufferWrap10 = ByteBuffer.wrap(bArr2, i - 16, 8);
            byteBufferWrap10.order(ByteOrder.LITTLE_ENDIAN);
            long j22 = byteBufferWrap10.getLong() * (-7286425919675154353L);
            long jRotateRight5 = Long.rotateRight(j18 + j19, 43) + Long.rotateRight(j21, 30);
            long jRotateRight6 = Long.rotateRight(j19 - 7286425919675154353L, 18) + j18;
            ByteBuffer byteBufferWrap11 = ByteBuffer.wrap(bArr2, 16, 8);
            byteBufferWrap11.order(ByteOrder.LITTLE_ENDIAN);
            long j23 = byteBufferWrap11.getLong() * j20;
            ByteBuffer byteBufferWrap12 = ByteBuffer.wrap(bArr2, 24, 8);
            byteBufferWrap12.order(ByteOrder.LITTLE_ENDIAN);
            long j24 = byteBufferWrap12.getLong();
            ByteBuffer byteBufferWrap13 = ByteBuffer.wrap(bArr2, i - 32, 8);
            byteBufferWrap13.order(ByteOrder.LITTLE_ENDIAN);
            long j25 = jRotateRight5 + j22;
            long j26 = j25 + byteBufferWrap13.getLong();
            ByteBuffer byteBufferWrap14 = ByteBuffer.wrap(bArr2, i - 24, 8);
            byteBufferWrap14.order(ByteOrder.LITTLE_ENDIAN);
            long j27 = jRotateRight6 + j21;
            long j28 = (j25 ^ j27) * j20;
            long j29 = (j27 ^ (j28 ^ (j28 >>> 47))) * j20;
            long j30 = ((j29 ^ (j29 >>> 47)) * j20) + byteBufferWrap14.getLong();
            long j31 = j26 * j20;
            long jRotateRight7 = Long.rotateRight(j23 + j24, 43) + Long.rotateRight(j31, 30);
            long jRotateRight8 = j23 + Long.rotateRight(j24 + j18, 18) + j31;
            long j32 = ((jRotateRight7 + (j30 * j20)) ^ jRotateRight8) * j20;
            long j33 = (jRotateRight8 ^ (j32 ^ (j32 >>> 47))) * j20;
            return (j33 ^ (j33 >>> 47)) * j20;
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        ByteBuffer byteBufferWrap15 = ByteBuffer.wrap(bArr2, 0, 8);
        byteBufferWrap15.order(ByteOrder.LITTLE_ENDIAN);
        long j34 = byteBufferWrap15.getLong() + 95310865018149119L;
        long j35 = 1390051526045402406L;
        long j36 = 2480279821605975764L;
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            long j37 = j;
            int i4 = (i3 >> 6) << 6;
            long j38 = j34 + j36 + jArr[c2];
            ByteBuffer byteBufferWrap16 = ByteBuffer.wrap(bArr2, i2 + 8, 8);
            char c4 = c3;
            byteBufferWrap16.order(ByteOrder.LITTLE_ENDIAN);
            long jRotateRight9 = Long.rotateRight(j38 + byteBufferWrap16.getLong(), 37) * j37;
            long j39 = j36 + jArr[1];
            ByteBuffer byteBufferWrap17 = ByteBuffer.wrap(bArr2, i2 + 48, 8);
            byteBufferWrap17.order(ByteOrder.LITTLE_ENDIAN);
            long jRotateRight10 = Long.rotateRight(j39 + byteBufferWrap17.getLong(), 42) * j37;
            long j40 = jRotateRight9 ^ jArr2[1];
            long j41 = jArr[c2];
            ByteBuffer byteBufferWrap18 = ByteBuffer.wrap(bArr2, i2 + 40, 8);
            char c5 = c2;
            byteBufferWrap18.order(ByteOrder.LITTLE_ENDIAN);
            long j42 = byteBufferWrap18.getLong() + j41;
            long jRotateRight11 = Long.rotateRight(j35 + jArr2[c5], 33) * j37;
            int i5 = i2;
            bp(bArr2, i5, jArr[1] * j37, j40 + jArr2[c5], jArr);
            long[] jArr3 = jArr;
            long j43 = jRotateRight11 + jArr2[1];
            ByteBuffer byteBufferWrap19 = ByteBuffer.wrap(bArr2, i5 + 16, 8);
            byteBufferWrap19.order(ByteOrder.LITTLE_ENDIAN);
            long j44 = jRotateRight10 + j42;
            bp(bArr2, i5 + 32, j43, byteBufferWrap19.getLong() + j44, jArr2);
            i2 = i5 + 64;
            if (i2 == i4) {
                int i6 = i3 & 63;
                int i7 = i4 + i6;
                long j45 = ((j40 & 255) << 1) + j37;
                long j46 = jArr2[c5] + ((long) i6);
                long j47 = jArr3[c5] + j46;
                jArr3[c5] = j47;
                jArr2[c5] = j46 + j47;
                ByteBuffer byteBufferWrap20 = ByteBuffer.wrap(bArr2, i7 - 55, 8);
                byteBufferWrap20.order(ByteOrder.LITTLE_ENDIAN);
                long jRotateRight12 = Long.rotateRight(jRotateRight11 + j44 + j47 + byteBufferWrap20.getLong(), 37) * j45;
                long j48 = j44 + jArr3[1];
                ByteBuffer byteBufferWrap21 = ByteBuffer.wrap(bArr2, i7 - 15, 8);
                byteBufferWrap21.order(ByteOrder.LITTLE_ENDIAN);
                long jRotateRight13 = Long.rotateRight(j48 + byteBufferWrap21.getLong(), 42) * j45;
                long j49 = jArr2[1] * 9;
                long j50 = jArr3[c5] * 9;
                ByteBuffer byteBufferWrap22 = ByteBuffer.wrap(bArr2, i7 - 23, 8);
                byteBufferWrap22.order(ByteOrder.LITTLE_ENDIAN);
                long j51 = j50 + byteBufferWrap22.getLong();
                long jRotateRight14 = Long.rotateRight(j40 + jArr2[c5], 33) * j45;
                long j52 = jRotateRight12 ^ j49;
                bp(bArr, i7 - 63, jArr3[1] * j45, j52 + jArr2[c5], jArr3);
                long j53 = jRotateRight14 + jArr2[1];
                ByteBuffer byteBufferWrap23 = ByteBuffer.wrap(bArr, i7 - 47, 8);
                byteBufferWrap23.order(ByteOrder.LITTLE_ENDIAN);
                long j54 = jRotateRight13 + j51;
                bp(bArr, i7 - 31, j53, byteBufferWrap23.getLong() + j54, jArr2);
                long j55 = jArr3[c5];
                long j56 = jArr2[c5];
                long j57 = (j55 ^ j56) * j45;
                long j58 = jArr3[1];
                long j59 = jArr2[1];
                long j60 = (j58 ^ j59) * j45;
                long j61 = (j59 ^ (j60 ^ (j60 >>> 47))) * j45;
                long j62 = (j56 ^ (j57 ^ (j57 >>> 47))) * j45;
                long j63 = ((j61 ^ (j61 >>> 47)) * j45) + jRotateRight14;
                long j64 = (((((j62 ^ (j62 >>> 47)) * j45) + ((j54 ^ (j54 >>> 47)) * (-4348849565147123417L))) + j52) ^ j63) * j45;
                long j65 = (j63 ^ (j64 ^ (j64 >>> 47))) * j45;
                return (j65 ^ (j65 >>> 47)) * j45;
            }
            bArr2 = bArr;
            j36 = j44;
            c3 = c4;
            j = j37;
            j35 = j40;
            c2 = c5;
            j34 = jRotateRight11;
            jArr = jArr3;
        }
    }

    public static int u(String str) {
        try {
            Integer num = (Integer) Class.forName("com.google.android.gms.cast.framework.media.internal.ResourceProvider").getMethod("findResourceByName", String.class).invoke(null, str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public static Map v(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return agpn.b;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                map2.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return DesugarCollections.unmodifiableMap(map2);
    }

    public static /* synthetic */ void w(kbt kbtVar, int i) {
        kcb kcbVar = kbtVar.a.b;
        if (kcbVar != null) {
            try {
                kcbVar.g(new klo(1, i, null, null, null, null));
            } catch (RemoteException unused) {
                khn.e();
            }
        }
    }

    public static String x(String str) {
        if (str != null) {
            return new hed(str, (Collection) null).k();
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static void y(Status status, Object obj, kjc kjcVar, kmv kmvVar) {
        if (kmvVar != null) {
            ksy ksyVar = kxz.a;
        }
        z(status, obj, kjcVar);
    }

    public static void z(Status status, Object obj, kjc kjcVar) {
        if (status.c()) {
            kjcVar.x(obj);
        } else {
            kjcVar.w(q(status));
        }
    }

    public kmt a(Context context, Looper looper, kqd kqdVar, Object obj, kof kofVar, kpb kpbVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    @Deprecated
    public kmt b(Context context, Looper looper, kqd kqdVar, Object obj, kna knaVar, knb knbVar) {
        return a(context, looper, kqdVar, obj, knaVar, knbVar);
    }

    public kro(char[] cArr) {
    }
}
