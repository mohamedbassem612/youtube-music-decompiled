package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.ResourceBusyException;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.decoder.av1.Dav1dDecoderException;
import androidx.media3.decoder.vp9.VpxDecoderException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hed {
    public final Object a;
    public final Object b;
    public final Object c;

    public hed(Map map, Map map2, nuc nucVar) {
        agkh agkhVar = new agkh(4);
        agqr it = ((agpk) ((agpn) map).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            agkhVar.e(Integer.valueOf(myh.D.a), (hed) entry.getValue());
        }
        this.b = agkhVar.d(true);
        agkh agkhVar2 = new agkh(4);
        agqr it2 = ((agpk) ((agpn) map2).entrySet()).iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            agkhVar2.e(Integer.valueOf(((nuw) ((Pair) entry2.getValue()).first).c().a()), (Pair) entry2.getValue());
        }
        this.c = agkhVar2.d(true);
        this.a = nucVar;
    }

    public static final ListenableFuture C() {
        vyq vyqVar = vyq.PRODUCTION;
        return vyqVar == null ? aher.a : new aher(vyqVar);
    }

    public static final ListenableFuture D() {
        Uri uri = vyq.values()[0].h;
        return uri == null ? aher.a : new aher(uri);
    }

    private static zhz N(long j, String str, String str2, wgs wgsVar) {
        zhv zhvVar = new zhv("fmt.decode");
        zhvVar.e(j);
        zhvVar.c = str2;
        zhvVar.b(new zhg(str, wgsVar));
        return zhvVar.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mbc] */
    private final boolean O(wja wjaVar) {
        if (wjaVar == null) {
            return false;
        }
        long jB = this.a.b();
        if (wjaVar.A(jB)) {
            return false;
        }
        return jB - wjaVar.j < TimeUnit.SECONDS.toMillis((long) ((zhl) this.b).S().L);
    }

    private static void P(zcf zcfVar, yvy yvyVar, String str) {
        Float f = yvyVar.a;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        Float f2 = yvyVar.c;
        float fFloatValue2 = f2 != null ? f2.floatValue() : 0.0f;
        Float f3 = yvyVar.e;
        float fFloatValue3 = f3 != null ? f3.floatValue() : 0.0f;
        int i = yvyVar.l;
        zcfVar.Z.w("vnorm", str + ";mode." + zik.aG(i) + ";tar." + fFloatValue + ";pre." + fFloatValue2 + ";ang." + fFloatValue3 + ";inpvol." + yvyVar.h + ";mult." + yvyVar.f + ";outvol." + yvyVar.g);
        zhq zhqVar = zhq.ABR;
    }

    private static yvy Q(float f, float f2, int i, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, boolean z, Optional optional6, Optional optional7) {
        float fZ = tym.z(f2 * f, 0.0f, 1.0f);
        yvr yvrVarAH = zik.aH();
        yvrVarAH.l(i);
        yvrVarAH.g(f);
        yvrVarAH.c(fZ);
        yvrVarAH.e(f2);
        yvrVarAH.a = z;
        yvrVarAH.b = (short) (yvrVarAH.b | 512);
        xdd xddVar = new xdd(yvrVarAH, 16);
        int i2 = 1;
        if (true == optional6.isPresent()) {
            Object obj = optional6.get();
            ((yvr) xddVar.a).i((String) obj);
        }
        xdd xddVar2 = new xdd(yvrVarAH, 17);
        if (true == optional7.isPresent()) {
            ((yvr) xddVar2.a).j((Float) optional7.get());
        }
        xdd xddVar3 = new xdd(yvrVarAH, 18);
        if (true == optional.isPresent()) {
            Object obj2 = optional.get();
            ((yvr) xddVar3.a).k((Float) obj2);
        }
        xdd xddVar4 = new xdd(yvrVarAH, 19);
        if (true == optional2.isPresent()) {
            ((yvr) xddVar4.a).d((Float) optional2.get());
        }
        xdd xddVar5 = new xdd(yvrVarAH, 20);
        if (true == optional3.isPresent()) {
            ((yvr) xddVar5.a).f((Float) optional3.get());
        }
        yyk yykVar = new yyk(yvrVarAH, i2);
        if (true == optional4.isPresent()) {
            ((yvr) yykVar.a).h((Float) optional4.get());
        }
        yyk yykVar2 = new yyk(yvrVarAH, 0);
        if (true == optional5.isPresent()) {
            ((yvr) yykVar2.a).b((Float) optional5.get());
        }
        return yvrVarAH.a();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mbc] */
    private final void R() {
        Iterator it = ((HashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            if (this.c.b() - ((yrg) ((Map.Entry) it.next()).getValue()).a > 3600000) {
                it.remove();
            }
        }
    }

    private static wfa S(wek wekVar, aijp aijpVar) {
        if (wekVar instanceof wfb) {
            return ((wfb) wekVar).f(aijpVar);
        }
        throw new IllegalStateException("EntityStore does not implement FrameworkRestrictedStoreAccess: ".concat(wekVar.toString()));
    }

    public static boolean c(fgy fgyVar, Object obj) {
        return fgyVar.R() && (obj instanceof View);
    }

    public static final void g(int i, hee heeVar, View view) {
        switch (i) {
            case 1:
                view.setAlpha(((Float) heeVar.b).floatValue());
                break;
            case 2:
                view.setTranslationX(((Float) heeVar.b).floatValue());
                break;
            case 3:
                view.setTranslationY(((Float) heeVar.b).floatValue());
                break;
            case 4:
                view.setScaleX(((Float) heeVar.b).floatValue());
                break;
            case 5:
                view.setScaleY(((Float) heeVar.b).floatValue());
                break;
            case 6:
                view.setElevation(((Float) heeVar.b).floatValue());
                break;
            case 7:
                view.setBackgroundColor(((Integer) heeVar.b).intValue());
                break;
            case 8:
                view.setRotation(((Float) heeVar.b).floatValue());
                break;
            case 9:
                view.setBackground((Drawable) heeVar.b);
                break;
            case 10:
                view.setForeground(new fnw(((Integer) heeVar.b).intValue()));
                break;
        }
    }

    public static zhz m(Throwable th, long j, String str) {
        Exception exc;
        if ((th instanceof ckn) && (exc = (Exception) th.getCause()) != null) {
            th = exc;
        }
        if (th instanceof yvl) {
            return yvq.b((yvl) th, Optional.of(Long.valueOf(j)));
        }
        String str2 = "unavailable";
        if (th instanceof MediaDrm.MediaDrmStateException) {
            String strConcat = "d.".concat(String.valueOf(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
            str = str == null ? strConcat : a.cl(strConcat, (byte) 59, str);
        } else if (!(th instanceof ResourceBusyException)) {
            str2 = "keyerror";
        }
        zhv zhvVar = new zhv(str2);
        zhvVar.e(j);
        zhvVar.d = th;
        zhvVar.b = zhw.e;
        zhvVar.c = str;
        return zhvVar.a();
    }

    public static zhz q(zhw zhwVar, yof yofVar, wja wjaVar, long j) {
        String strA = zhf.a(yofVar, true, 6);
        if (wjaVar != null) {
            List list = wjaVar.s;
            if (list.isEmpty() && wjaVar.t.isEmpty()) {
                strA = String.valueOf(strA).concat(";c.invalidStreamingData");
            } else {
                boolean zE = wjaVar.E();
                int i = zic.a;
                String str = true != zE ? "0" : "1";
                List list2 = wjaVar.t;
                strA = strA + ";o." + str + ";prog." + wja.r(list) + ";adap." + wja.r(list2);
            }
        }
        zhv zhvVar = new zhv("fmt.noneavailable");
        zhvVar.e(j);
        zhvVar.c = strA;
        zhvVar.b = zhwVar;
        return zhvVar.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final ListenableFuture A() {
        int i = tqr.a;
        ?? r0 = this.b;
        if (r0.k(1073830190) && r0.k(1073830209)) {
            return new aher(Boolean.valueOf(r0.k(1073830208)));
        }
        ListenableFuture listenableFutureA = ((syn) this.a.io()).a(new hqn(11));
        wvk wvkVar = new wvk(2);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        int i2 = ahcs.c;
        ahcr ahcrVar = new ahcr(listenableFutureA, wvkVar);
        listenableFutureA.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
        return ahcrVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, tqj] */
    public final wvl B() {
        return new wvl(this.c, this.a, this.b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final weq E(long j) {
        if (j == -2147483648L) {
            return null;
        }
        return (weq) this.c.get(Long.valueOf(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, wfl] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, wbz] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, wco] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, wfl] */
    public final wee F(zwa zwaVar, akuz akuzVar) {
        akuzVar.getClass();
        aqnk aqnkVar = akuzVar.c;
        if (aqnkVar == null) {
            aqnkVar = aqnk.a;
        }
        aihf aihfVarCreateBuilder = aijp.a.createBuilder();
        long j = aqnkVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        ((aijp) aihfVarCreateBuilder.instance).b = j;
        int i = aqnkVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        ((aijp) aihfVarCreateBuilder.instance).c = i;
        aijp aijpVar = (aijp) aihfVarCreateBuilder.build();
        wfa wfaVarS = S(this.b.e(zwaVar), aijpVar);
        wfa wfaVarS2 = S(this.c.b(zwaVar), aijpVar);
        ?? r0 = this.a;
        r0.a("EMP", "Processing response with mutations: " + akuzVar.d.size());
        Iterator it = akuzVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                afuu afuuVarD = afwt.d(74, "fut entity mutation persistent commit async", afux.a, true);
                try {
                    avlb avlbVarT = wfaVarS2.b().t(new ifu(this, 4));
                    afuuVarD.close();
                    afuu afuuVarD2 = afwt.d(75, "fut entity mutation in memory commit async", afux.a, true);
                    try {
                        avlb avlbVarS = wfaVarS.b().s();
                        afuuVarD2.close();
                        return new wee(avlbVarS, avlbVarT);
                    } catch (Throwable th) {
                        try {
                            afuuVarD2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        afuuVarD.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            akvh akvhVar = (akvh) it.next();
            try {
                ahno.P(1 == (akvhVar.b & 1), "mutation must have a key set");
                akvg akvgVar = akvhVar.g;
                if (akvgVar == null) {
                    akvgVar = akvg.a;
                }
                int iAS = a.aS(akvgVar.b);
                if (iAS == 0) {
                    iAS = 1;
                }
                Object[] objArr = iAS == 1 || iAS == 3;
                Object[] objArr2 = iAS == 2 || iAS == 3;
                int i2 = akvhVar.d;
                int iAV = a.aV(i2);
                if (iAV == 0) {
                    iAV = 1;
                }
                int i3 = iAV - 1;
                if (i3 == 1) {
                    ahno.P((akvhVar.b & 8) != 0, "replace mutation must have payload");
                    String str = akvhVar.c;
                    akvi akviVar = akvhVar.f;
                    if (akviVar == null) {
                        akviVar = akvi.a;
                    }
                    byte[] bArrJ = tzk.J(akviVar.toByteString());
                    if (bArrJ == null) {
                        throw new aiik(a.ce(str, "Failed to read the extension for"));
                    }
                    if (objArr2 != false) {
                        wfaVarS2.g(str, bArrJ);
                    }
                    if (objArr != false) {
                        wfaVarS.g(str, bArrJ);
                    }
                } else if (i3 == 2) {
                    if (objArr2 != false) {
                        akvg akvgVar2 = akvhVar.g;
                        if (akvgVar2 == null) {
                            akvgVar2 = akvg.a;
                        }
                        int iAU = a.aU(akvgVar2.c);
                        if (iAU == 0 || iAU != 2) {
                            wfaVarS2.j(akvhVar.c);
                        } else {
                            wfaVarS2.a(akvhVar.c);
                        }
                    }
                    if (objArr != false) {
                        wfaVarS.j(akvhVar.c);
                    }
                } else if (i3 != 3) {
                    int iAV2 = a.aV(i2);
                    int i4 = iAV2 != 0 ? iAV2 : 1;
                    String str2 = akvhVar.c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid mutation type ");
                    sb.append(i4 - 1);
                    sb.append(" for mutation with key: ");
                    sb.append(str2);
                    r0.a("EMP", sb.toString());
                } else {
                    ahno.P((akvhVar.b & 8) != 0, "update mutation must have payload");
                    akvi akviVar2 = akvhVar.f;
                    if (akviVar2 == null) {
                        akviVar2 = akvi.a;
                    }
                    byte[] bArrJ2 = tzk.J(akviVar2.toByteString());
                    if (bArrJ2 == null) {
                        r0.a("EMP", "update mutation must have updates");
                    } else {
                        if (objArr2 != false) {
                            String str3 = akvhVar.c;
                            akvd akvdVar = akvhVar.e;
                            if (akvdVar == null) {
                                akvdVar = akvd.a;
                            }
                            wfaVarS2.k(str3, akvdVar, bArrJ2);
                        }
                        if (objArr != false) {
                            String str4 = akvhVar.c;
                            akvd akvdVar2 = akvhVar.e;
                            if (akvdVar2 == null) {
                                akvdVar2 = akvd.a;
                            }
                            wfaVarS.k(str4, akvdVar2, bArrJ2);
                        }
                    }
                }
            } catch (aiik unused) {
                this.a.a("EMP", "Error while parsing payload extension for key ".concat(String.valueOf(akvhVar.c)));
            }
        }
    }

    public final void G(zwa zwaVar, akuz akuzVar) {
        akuzVar.getClass();
        wee weeVarF = F(zwaVar, akuzVar);
        weeVarF.a.G();
        weeVarF.b.D();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final vzx H(ohp ohpVar) {
        ohpVar.getClass();
        ahex ahexVar = (ahex) this.b.io();
        ahexVar.getClass();
        return new vzx(ohpVar, ahexVar, this.c, this.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [awut, java.lang.Object] */
    public final ListenableFuture I(zwa zwaVar) {
        return awrc.ag(this.c, awov.a, new bev(this, zwaVar, (awoq) null, 8));
    }

    public final Optional J(affd affdVar) {
        affdVar.getClass();
        return ((vyu) aguu.aw((Context) this.a, vyu.class, affdVar)).q();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    public final vry K(vnr vnrVar, xgn xgnVar) {
        Context context = (Context) this.c.io();
        context.getClass();
        aeod aeodVar = (aeod) this.b.io();
        aeodVar.getClass();
        adyc adycVar = (adyc) this.a.io();
        xgnVar.getClass();
        return new vry(context, aeodVar, adycVar, vnrVar, xgnVar);
    }

    public final tzk L(String str, byte[] bArr) {
        weq weqVarE = E(((wfr) this.b).a(str));
        return weqVarE == null ? weu.e(str, bArr) : weqVarE.a(str, bArr);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [awmd, java.lang.Object] */
    public final /* synthetic */ xpl M(aigj aigjVar) {
        ((Context) this.b.io()).getClass();
        rnj rnjVar = (rnj) this.a.io();
        rnjVar.getClass();
        ((Optional) ((aupo) this.c).b).getClass();
        return new xpl(rnjVar, aigjVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aunn, java.lang.Object] */
    public final avlr a() {
        avlh avlhVarH = ((hfn) this.a.io()).y().H(new hbn(this, 0));
        vor vorVar = (vor) this.b.io();
        vorVar.getClass();
        avwx avwxVar = new avwx(avlhVarH, avlh.G(vorVar));
        avnn avnnVar = atqp.j;
        return avwxVar.ag();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aunn, java.lang.Object] */
    public final vor b(akuc akucVar) {
        return hbm.a.contains(akucVar) ? (vor) this.b.io() : (vor) this.c.io();
    }

    public final boolean d(Class cls) {
        return ((Class) this.c).isAssignableFrom(cls);
    }

    public final boolean e(Class cls, Class cls2) {
        return d(cls) && ((Class) this.b).isAssignableFrom(cls2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    public final void f(hee heeVar, fgy fgyVar) {
        if (heeVar != null) {
            ?? r0 = this.c;
            Set hashSet = (Set) r0.get(heeVar);
            if (hashSet == null) {
                hashSet = new HashSet();
                r0.put(heeVar, hashSet);
                heeVar.a.add(this);
            }
            hashSet.add(fgyVar);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, nuc] */
    public final mfj h(myh myhVar, Bitmap bitmap, ImageView.ScaleType scaleType, nsl nslVar) {
        float fG = myhVar.g();
        DisplayMetrics displayMetrics = (DisplayMetrics) this.a;
        mng mngVar = new mng(bitmap, scaleType, TypedValue.applyDimension(1, fG, displayMetrics), myhVar.j(), TypedValue.applyDimension(1, myhVar.h(), displayMetrics), myhVar.o(), this.b, (agev) this.c);
        if (myhVar.s()) {
            mngVar.s = myhVar.n();
            if (!mngVar.e()) {
                mngVar.d();
            }
        }
        if (myhVar.u()) {
            mngVar.c(myhVar.l(), displayMetrics, nslVar);
        }
        if (myhVar.t()) {
            myk mykVarM = myhVar.m();
            int iX = mykVarM.X();
            int iAQ = mykVarM.aQ() - 1;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            switch (iAQ) {
                case 1:
                    mode = PorterDuff.Mode.DST_ATOP;
                    break;
                case 2:
                    mode = PorterDuff.Mode.DST_IN;
                    break;
                case 3:
                    mode = PorterDuff.Mode.DST_OUT;
                    break;
                case 4:
                    mode = PorterDuff.Mode.DST_OVER;
                    break;
                case 5:
                    mode = PorterDuff.Mode.SRC_ATOP;
                    break;
                case 6:
                    mode = PorterDuff.Mode.SRC_IN;
                    break;
                case 7:
                    mode = PorterDuff.Mode.SRC_OUT;
                    break;
                case 8:
                    mode = PorterDuff.Mode.SRC_OVER;
                    break;
                case 9:
                    mode = PorterDuff.Mode.ADD;
                    break;
                case 10:
                    mode = PorterDuff.Mode.DARKEN;
                    break;
                case 11:
                    mode = PorterDuff.Mode.LIGHTEN;
                    break;
                case 12:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 13:
                    mode = PorterDuff.Mode.OVERLAY;
                    break;
                case 14:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 15:
                    mode = PorterDuff.Mode.XOR;
                    break;
                case 16:
                    mode = PorterDuff.Mode.CLEAR;
                    break;
            }
            mngVar.setColorFilter(iX, mode);
        }
        if (myhVar.p()) {
            int i = myhVar.i();
            mngVar.t = new Paint();
            mngVar.t.setColor(i);
        }
        return mngVar;
    }

    public final void i() {
        j(new rri(this, 1));
    }

    public final void j(awqg awqgVar) {
        PackageInfo packageInfo;
        ComponentInfo componentInfo;
        try {
            int i = Build.VERSION.SDK_INT;
            Object obj = this.c;
            if (i >= 33) {
                packageInfo = ((PackageManager) obj).getPackageInfo(((Context) this.b).getPackageName(), PackageManager.PackageInfoFlags.of(518L));
            } else {
                packageInfo = ((PackageManager) obj).getPackageInfo(((Context) this.b).getPackageName(), 518);
            }
            ArrayList arrayList = new ArrayList();
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null) {
                arrayList.addAll(atqq.aR(activityInfoArr));
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                arrayList.addAll(atqq.aR(serviceInfoArr));
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    componentInfo = null;
                    break;
                }
                componentInfo = (ComponentInfo) it.next();
            } while (!awrc.c(((ComponentName) this.a).getClassName(), componentInfo.name));
            if (componentInfo != null) {
                awqgVar.invoke(componentInfo);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Collection] */
    public final String k() {
        StringBuilder sb = new StringBuilder((String) this.c);
        Locale locale = Locale.ROOT;
        String str = (String) this.b;
        String upperCase = str.toUpperCase(locale);
        if (!upperCase.matches("[A-F0-9]+")) {
            throw new IllegalArgumentException("Invalid application ID: ".concat(str));
        }
        sb.append('/');
        sb.append(upperCase);
        ?? r10 = this.a;
        if (r10 != 0) {
            if (r10.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            sb.append('/');
            boolean z = true;
            for (String string : r10) {
                khe.f(string);
                if (!z) {
                    sb.append(',');
                }
                if (!khe.a.matcher(string).matches()) {
                    StringBuilder sb2 = new StringBuilder(string.length());
                    for (int i = 0; i < string.length(); i++) {
                        char cCharAt = string.charAt(i);
                        if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-' || cCharAt == '.' || cCharAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb2.append(cCharAt);
                        }
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                z = false;
            }
        }
        if (r10 == 0) {
            sb.append('/');
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final agcl l() {
        agev agevVar = (agev) this.b.io();
        agevVar.getClass();
        agev agevVar2 = (agev) this.c.io();
        agevVar2.getClass();
        return new agcl((awmd) this.a, agevVar, agevVar2);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:121:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:124:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f9  */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x02cf, please report this as an issue */
    public final zhz n(cbo cboVar, long j, Surface surface, zjv zjvVar, wgs wgsVar, boolean z, wja wjaVar) {
        long j2;
        zhz zhzVar;
        Throwable cause = cboVar.getCause();
        if (cause == null) {
            return new zhz("player.exception", j, cboVar);
        }
        if (cause instanceof cjt) {
            cjt cjtVar = (cjt) cause;
            String str = "errorCode." + cjtVar.a;
            Throwable cause2 = cjtVar.getCause();
            if (cause2 != null) {
                cjtVar = cause2;
            }
            return m(cjtVar, j, str);
        }
        if (cause instanceof IOException) {
            return p(zhw.a, (IOException) cause, null, null, wjaVar, j, z, true);
        }
        if (cause instanceof MediaCodec.CryptoException) {
            MediaCodec.CryptoException cryptoException = (MediaCodec.CryptoException) cause;
            zhzVar = new zhz(zhw.e, "keyerror", j, "errorCode." + cryptoException.getErrorCode() + ";cs." + zhf.a(cryptoException, true, 2));
        } else {
            if (cause instanceof MediaCryptoException) {
                return m(cause, j, "cs.".concat(String.valueOf(zhf.a(cause, true, 2))));
            }
            if (cause instanceof MediaDrm.MediaDrmStateException) {
                return m(cause, j, null);
            }
            boolean z2 = cause instanceof clq;
            if (!z2 && !(cause instanceof jur)) {
                j2 = j;
            } else if ((cause.getCause() instanceof IOException) && (cause.getCause().getCause() instanceof TimeoutException)) {
                zhzVar = new zhz(zhw.a, "player.timeout", j, "c.codec_init", cause.getCause().getCause(), null);
            } else {
                j2 = j;
                if (z2) {
                    clq clqVar = (clq) cause;
                    clo cloVar = clqVar.c;
                    return N(j2, cloVar != null ? cloVar.b : null, yno.cG(clqVar.getCause(), cloVar != null ? cloVar.b : null, clqVar.d, clqVar.a, surface, wgsVar, cboVar.f), wgsVar);
                }
            }
            if (cause instanceof jur) {
                jur jurVar = (jur) cause;
                clo cloVar2 = jurVar.c;
                return N(j2, cloVar2 != null ? cloVar2.b : null, yno.cG(jurVar.getCause(), cloVar2 != null ? cloVar2.b : null, jurVar.d, jurVar.a, surface, wgsVar, cboVar.f), wgsVar);
            }
            if (cause instanceof cgb) {
                zhzVar = new zhz(zhw.a, "android.audiotrack", j2, "src.init;info.0", ((cgb) cause).getCause(), null);
            } else {
                long j3 = j2;
                if (cause instanceof cge) {
                    return new zhz("android.audiotrack", j3, "src.write;info." + ((cge) cause).a);
                }
                if (cause instanceof yof) {
                    return q(zhw.a, (yof) cause, wjaVar, j3);
                }
                if (cause instanceof VpxDecoderException) {
                    zhv zhvVar = new zhv("fmt.decode");
                    zhvVar.b = zhw.i;
                    zhvVar.e(j3);
                    zhvVar.d = cause;
                    StringBuilder sb = new StringBuilder();
                    yno.cI(sb, wgsVar, cboVar.f);
                    zhvVar.c = sb.toString();
                    return zhvVar.a();
                }
                if (cause instanceof Dav1dDecoderException) {
                    if (cause.getMessage() == null || !cause.getMessage().contains("Surface YUV")) {
                        zhv zhvVar2 = new zhv("fmt.decode");
                        zhvVar2.b = zhw.j;
                        zhvVar2.e(j3);
                        zhvVar2.d = cause;
                        StringBuilder sb2 = new StringBuilder();
                        yno.cI(sb2, wgsVar, cboVar.f);
                        zhvVar2.c = sb2.toString();
                        return zhvVar2.a();
                    }
                    zhzVar = new zhz(zhw.j, "surfaceunavailable", j3, cause);
                } else if (cause instanceof OutOfMemoryError) {
                    zhzVar = zjvVar == zjv.d ? new zhz(zhw.i, "player.outofmemory", j3, cause) : new zhz(zhw.a, "player.outofmemory", j, cause);
                } else {
                    if (cause instanceof clm) {
                        clm clmVar = (clm) cause;
                        bse bseVar = cboVar.f;
                        StringBuilder sb3 = new StringBuilder();
                        yno.cI(sb3, wgsVar, bseVar);
                        sb3.append("src.decfail");
                        clo cloVar3 = clmVar.a;
                        String str2 = cloVar3 != null ? cloVar3.b : null;
                        sb3.append(';');
                        sb3.append(zhf.g(clmVar.getCause()));
                        sb3.append(";name.");
                        sb3.append(str2);
                        if (clmVar instanceof csx) {
                            csx csxVar = (csx) clmVar;
                            sb3.append(";surhash.");
                            sb3.append(csxVar.c);
                            sb3.append(";sur.");
                            sb3.append(yno.cH(surface));
                            sb3.append(";esur.");
                            sb3.append(true != csxVar.d ? "invalid" : "valid");
                        }
                        zhv zhvVar3 = new zhv("fmt.decode");
                        zhvVar3.e(j3);
                        zhvVar3.c = sb3.toString();
                        zhvVar3.b(new zhg(str2, wgsVar));
                        return zhvVar3.a();
                    }
                    if ((cause instanceof can) && ((zhl) this.b).i.l(451, 45806886L, false)) {
                        zhv zhvVar4 = new zhv("fmt.decode");
                        zhvVar4.e(j3);
                        zhvVar4.d = cause;
                        StringBuilder sb4 = new StringBuilder();
                        yno.cI(sb4, wgsVar, cboVar.f);
                        zhvVar4.c = sb4.toString();
                        return zhvVar4.a();
                    }
                    if (cause instanceof IllegalStateException) {
                        StackTraceElement[] stackTrace = cause.getStackTrace();
                        if ((cause instanceof MediaCodec.CodecException) || (stackTrace.length > 0 && stackTrace[0].getClassName().contains("MediaCodec"))) {
                            IllegalStateException illegalStateException = (IllegalStateException) cause;
                            bse bseVar2 = cboVar.f;
                            if (illegalStateException instanceof MediaCodec.CodecException) {
                                StringBuilder sb5 = new StringBuilder();
                                yno.cI(sb5, wgsVar, bseVar2);
                                sb5.append("src.decfail;d.");
                                sb5.append(((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo().replace("android.media.MediaCodec", "MC"));
                                sb5.append(";sur.");
                                sb5.append(yno.cH(surface));
                                zhzVar = new zhz(zhw.a, "fmt.decode", j3, sb5.toString(), illegalStateException, null);
                            } else {
                                StringBuilder sb6 = new StringBuilder();
                                yno.cI(sb6, wgsVar, bseVar2);
                                sb6.append("src.decfail;sur.");
                                sb6.append(yno.cH(surface));
                                zhzVar = new zhz(zhw.a, "fmt.decode", j, sb6.toString(), illegalStateException, null);
                            }
                        } else {
                            if (cause instanceof cct) {
                                return cause instanceof RuntimeException ? new zhz("player.fatalexception", j3, cause) : new zhz("player.exception", j3, cause);
                            }
                            zhzVar = new zhz(zhw.a, "player.timeout", j3, "c." + ((cct) cause).a, cboVar, null);
                        }
                    } else {
                        if (cause instanceof cct) {
                            if (cause instanceof RuntimeException) {
                            }
                        }
                        zhzVar = new zhz(zhw.a, "player.timeout", j3, "c." + ((cct) cause).a, cboVar, null);
                    }
                }
            }
        }
        return zhzVar;
    }

    public final zhz o(IOException iOException) {
        return p(zhw.a, iOException, null, null, null, 0L, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:102:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:109:0x021b  */
    /* JADX WARN: Code duplicated, block: B:111:0x021e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0222  */
    /* JADX WARN: Code duplicated, block: B:114:0x0225  */
    /* JADX WARN: Code duplicated, block: B:116:0x0229  */
    /* JADX WARN: Code duplicated, block: B:117:0x022c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00df  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x010d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0142  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    /* JADX WARN: Code duplicated, block: B:65:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:68:0x0155  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159  */
    /* JADX WARN: Code duplicated, block: B:72:0x0163  */
    /* JADX WARN: Code duplicated, block: B:73:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x016c  */
    /* JADX WARN: Code duplicated, block: B:75:0x016f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0173  */
    /* JADX WARN: Code duplicated, block: B:78:0x0176  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0184  */
    /* JADX WARN: Code duplicated, block: B:83:0x018b  */
    /* JADX WARN: Code duplicated, block: B:84:0x018e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0192  */
    /* JADX WARN: Code duplicated, block: B:92:0x01af  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c1  */
    /* JADX WARN: Multi-variable type inference failed */
    public final zhz p(zhw zhwVar, IOException iOException, cnd cndVar, cni cniVar, wja wjaVar, long j, boolean z, boolean z2) {
        String str;
        String strA;
        byt bytVar;
        Object obj;
        Throwable cause;
        int i;
        byv byvVar;
        int i2;
        List list;
        int i3;
        byv byvVar2;
        byi byiVar;
        int i4;
        String queryParameter;
        byi byiVar2;
        bse bseVar;
        StringBuilder sb = new StringBuilder();
        if (cndVar == null || (byiVar2 = cndVar.b) == null || cniVar == null || (bseVar = cniVar.c) == null) {
            str = "";
        } else {
            str = "pos." + byiVar2.h + ";len." + byiVar2.i + ";loaded." + cndVar.g + ";trk." + cniVar.b + ";fmt." + bseVar.a + ';';
        }
        sb.append(str);
        Throwable cause2 = iOException.getCause();
        if (iOException instanceof zjs) {
            zjs zjsVar = (zjs) iOException;
            strA = zjsVar.a(O(wjaVar));
            if (!zjsVar.b().isEmpty()) {
                sb.append(zjsVar.b());
                sb.append(';');
            }
        } else if (iOException instanceof EOFException) {
            strA = "player.eof";
        } else if (iOException instanceof zie) {
            strA = z ? "offline.partial.nocontent" : "offline.nocontent";
        } else if (iOException instanceof zid) {
            strA = "net.accessdisallowed";
        } else if (iOException instanceof byp) {
            if (cause2 != null) {
                sb.append("c.");
                sb.append(cause2.getClass().getSimpleName());
                sb.append(";m.");
                sb.append(cause2.getMessage());
                sb.append(';');
            }
            strA = "file";
        } else if (z2) {
            if (iOException instanceof byu) {
                sb.append(((byu) iOException).d);
                sb.append(';');
            } else if (!(iOException instanceof bsz)) {
                if (iOException instanceof byt) {
                    bytVar = (byt) iOException;
                    obj = this.c;
                    if (obj != null) {
                        if (bytVar instanceof jve) {
                            sb.append("type.loadtimeout;");
                        } else if (bytVar instanceof byv) {
                            byvVar2 = (byv) bytVar;
                            int i5 = byvVar2.d;
                            sb.append("rc.");
                            sb.append(i5);
                            sb.append(';');
                            if (true == r(byvVar2, wjaVar)) {
                                strA = "staleconfig";
                            } else {
                                strA = "net.badstatus";
                            }
                        } else if (bytVar instanceof zhm) {
                            i3 = ((zhm) bytVar).e;
                            sb.append("rc.");
                            sb.append(i3);
                            sb.append(';');
                            if (i3 == 204) {
                                strA = "net.nocontent";
                            } else {
                                strA = "net.badstatus";
                            }
                        } else {
                            if (bytVar instanceof ypr) {
                                throw null;
                            }
                            cause = bytVar.getCause();
                            i = bytVar.c;
                            if (i != 1) {
                                if (i != 2) {
                                    strA = "net.closed";
                                } else if (!(cause instanceof SocketTimeoutException)) {
                                    strA = "net.read";
                                } else if (((zhl) this.b).dj()) {
                                    sb.append("type.readtimeout;");
                                } else {
                                    strA = "net.read.timeout";
                                }
                            } else if (cause instanceof UnknownHostException) {
                                strA = "net.dns";
                            } else if (!(cause instanceof SocketTimeoutException)) {
                                if (cause instanceof byv) {
                                    list = (List) byvVar.e.get("location");
                                    sb.append("unexpectedredirect.");
                                    if (list == null) {
                                        sb.append("nolocation;");
                                    } else if (list.isEmpty()) {
                                        sb.append("emptylocation;");
                                    } else {
                                        sb.append((String) list.get(0));
                                        sb.append(';');
                                    }
                                }
                                strA = "net.connect";
                            } else if (((zhl) this.b).dj()) {
                                sb.append("type.connecttimeout;");
                            } else {
                                strA = "net.connect.timeout";
                            }
                        }
                        strA = "net.timeout";
                    } else {
                        if (bytVar instanceof jve) {
                            sb.append("type.loadtimeout;");
                        } else if (bytVar instanceof byv) {
                            byvVar2 = (byv) bytVar;
                            int i6 = byvVar2.d;
                            sb.append("rc.");
                            sb.append(i6);
                            sb.append(';');
                            if (true == r(byvVar2, wjaVar)) {
                                strA = "staleconfig";
                            } else {
                                strA = "net.badstatus";
                            }
                        } else if (bytVar instanceof zhm) {
                            i3 = ((zhm) bytVar).e;
                            sb.append("rc.");
                            sb.append(i3);
                            sb.append(';');
                            if (i3 == 204) {
                                strA = "net.nocontent";
                            } else {
                                strA = "net.badstatus";
                            }
                        } else {
                            if (bytVar instanceof ypr) {
                                throw null;
                            }
                            cause = bytVar.getCause();
                            i = bytVar.c;
                            if (i != 1) {
                                if (i != 2) {
                                    strA = "net.closed";
                                } else if (!(cause instanceof SocketTimeoutException)) {
                                    strA = "net.read";
                                } else if (((zhl) this.b).dj()) {
                                    sb.append("type.readtimeout;");
                                } else {
                                    strA = "net.read.timeout";
                                }
                            } else if (cause instanceof UnknownHostException) {
                                strA = "net.dns";
                            } else if (!(cause instanceof SocketTimeoutException)) {
                                if (cause instanceof byv) {
                                    list = (List) byvVar.e.get("location");
                                    sb.append("unexpectedredirect.");
                                    if (list == null) {
                                        sb.append("nolocation;");
                                    } else if (list.isEmpty()) {
                                        sb.append("emptylocation;");
                                    } else {
                                        sb.append((String) list.get(0));
                                        sb.append(';');
                                    }
                                }
                                strA = "net.connect";
                            } else if (((zhl) this.b).dj()) {
                                sb.append("type.connecttimeout;");
                            } else {
                                strA = "net.connect.timeout";
                            }
                        }
                        strA = "net.timeout";
                    }
                    sb.append("er.");
                    sb.append(bytVar.a);
                    sb.append(';');
                    byiVar = bytVar.b;
                    if (byiVar != null) {
                        Uri uri = byiVar.a;
                        queryParameter = uri.getQueryParameter("rn");
                        if (queryParameter != null) {
                            sb.append("rn.");
                            sb.append(queryParameter);
                            sb.append(';');
                        }
                        sb.append("shost.");
                        sb.append(uri.getHost());
                        sb.append(';');
                    }
                    if (bytVar instanceof caf) {
                        sb.append("cnconstat.");
                        sb.append(i4);
                        sb.append(';');
                    }
                } else if (iOException instanceof cmj) {
                    strA = "qoe.livewindow";
                } else if (iOException instanceof zhb) {
                    strA = "policy.app";
                } else {
                    strA = "player.exception";
                }
            }
            strA = "fmt.unparseable";
        } else if (iOException instanceof byt) {
            bytVar = (byt) iOException;
            obj = this.c;
            if (obj != null || ((tfq) obj).h()) {
                if (bytVar instanceof jve) {
                    sb.append("type.loadtimeout;");
                } else if (bytVar instanceof byv) {
                    byvVar2 = (byv) bytVar;
                    int i7 = byvVar2.d;
                    sb.append("rc.");
                    sb.append(i7);
                    sb.append(';');
                    if (true == r(byvVar2, wjaVar)) {
                        strA = "staleconfig";
                    } else {
                        strA = "net.badstatus";
                    }
                } else if (bytVar instanceof zhm) {
                    i3 = ((zhm) bytVar).e;
                    sb.append("rc.");
                    sb.append(i3);
                    sb.append(';');
                    if (i3 == 204) {
                        strA = "net.nocontent";
                    } else {
                        strA = "net.badstatus";
                    }
                } else {
                    if (bytVar instanceof ypr) {
                        throw null;
                    }
                    cause = bytVar.getCause();
                    i = bytVar.c;
                    if (i != 1) {
                        if (i != 2) {
                            strA = "net.closed";
                        } else if (!(cause instanceof SocketTimeoutException)) {
                            strA = "net.read";
                        } else if (((zhl) this.b).dj()) {
                            sb.append("type.readtimeout;");
                        } else {
                            strA = "net.read.timeout";
                        }
                    } else if (cause instanceof UnknownHostException) {
                        strA = "net.dns";
                    } else if (!(cause instanceof SocketTimeoutException)) {
                        if ((cause instanceof byv) && ((i2 = (byvVar = (byv) cause).d) == 307 || i2 == 308)) {
                            list = (List) byvVar.e.get("location");
                            sb.append("unexpectedredirect.");
                            if (list == null) {
                                sb.append("nolocation;");
                            } else if (list.isEmpty()) {
                                sb.append("emptylocation;");
                            } else {
                                sb.append((String) list.get(0));
                                sb.append(';');
                            }
                        }
                        strA = "net.connect";
                    } else if (((zhl) this.b).dj()) {
                        sb.append("type.connecttimeout;");
                    } else {
                        strA = "net.connect.timeout";
                    }
                }
                strA = "net.timeout";
            } else {
                strA = "net.unavailable";
            }
            sb.append("er.");
            sb.append(bytVar.a);
            sb.append(';');
            byiVar = bytVar.b;
            if (byiVar != null) {
                Uri uri2 = byiVar.a;
                queryParameter = uri2.getQueryParameter("rn");
                if (queryParameter != null) {
                    sb.append("rn.");
                    sb.append(queryParameter);
                    sb.append(';');
                }
                sb.append("shost.");
                sb.append(uri2.getHost());
                sb.append(';');
            }
            if ((bytVar instanceof caf) && (i4 = ((caf) bytVar).d) != 0) {
                sb.append("cnconstat.");
                sb.append(i4);
                sb.append(';');
            }
        } else if (iOException instanceof cmj) {
            strA = "qoe.livewindow";
        } else if (iOException instanceof zhb) {
            strA = "policy.app";
        } else {
            strA = "player.exception";
        }
        if (cause2 instanceof NetworkException) {
            NetworkException networkException = (NetworkException) cause2;
            StringBuilder sb2 = new StringBuilder("info.cronet;;nerrcode.");
            sb2.append(networkException.getErrorCode());
            sb2.append(";cerrcode.");
            sb2.append(networkException.getCronetInternalErrorCode());
            if (networkException instanceof QuicException) {
                sb2.append(";qerrcode.");
                sb2.append(((QuicException) networkException).getQuicDetailedErrorCode());
            }
            sb.append(sb2.toString());
            sb.append(';');
        }
        int length = sb.length();
        if (length > 0) {
            int i8 = length - 1;
            if (sb.charAt(i8) == ';') {
                sb.deleteCharAt(i8);
            }
        }
        zhv zhvVar = new zhv(strA);
        zhvVar.e(j);
        zhvVar.b = zhwVar;
        zhvVar.d = iOException;
        zhvVar.c = sb.length() > 0 ? sb.toString() : null;
        return zhvVar.a();
    }

    public final boolean r(byv byvVar, wja wjaVar) {
        int i = byvVar.d;
        return ((i != 400 && i != 410 && i != 416 && i != 403 && i != 404) || wjaVar == null || O(wjaVar)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:132:0x033f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (r5 != false) goto L38;
     */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yvy s(defpackage.zcf r27, defpackage.zjr r28, float r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hed.s(zcf, zjr, float, boolean):yvy");
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, mbc] */
    public final synchronized yth t() {
        yth ythVar;
        double d;
        double d2;
        R();
        Object obj = this.a;
        ythVar = null;
        String str = null;
        yrg yrgVar = null;
        for (String str2 : ((HashMap) obj).keySet()) {
            if (!TextUtils.equals(str2, null)) {
                yrg yrgVar2 = (yrg) ((HashMap) obj).get(str2);
                ?? r7 = this.c;
                if (yrgVar2 != null) {
                    if (yrgVar != null) {
                        boolean zM = yno.m(yrgVar2, r7);
                        boolean zM2 = yno.m(yrgVar, r7);
                        if (zM) {
                            if (zM2) {
                                d = yrgVar.c.a;
                                d2 = yrgVar2.c.a;
                            }
                        } else if (!zM2) {
                            d = yrgVar.c.a;
                            d2 = yrgVar2.c.a;
                        }
                        if (((int) (d - d2)) > 0) {
                        }
                    }
                    yrgVar = (yrg) ((HashMap) obj).get(str2);
                    str = str2;
                } else if (yrgVar == null) {
                    yrgVar = null;
                }
            }
        }
        if (str != null && yrgVar != null) {
            ythVar = new yth(str, (int) yrgVar.c.a, yrgVar.b);
        }
        return ythVar;
    }

    public final synchronized void u() {
        ((HashMap) this.a).clear();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, mbc] */
    public final synchronized void v(String str, double d) {
        if (str == null) {
            return;
        }
        R();
        Object obj = this.a;
        yrg yrgVar = (yrg) ((HashMap) obj).get(str);
        if (yrgVar == null) {
            yrg yrgVar2 = new yrg((Uri) ((LruCache) this.b).get(str));
            ((HashMap) obj).put(str, yrgVar2);
            yrgVar = yrgVar2;
        }
        yrgVar.a = this.c.b();
        yrh yrhVar = yrgVar.c;
        double d2 = yrhVar.a;
        if (d2 < 0.0d) {
            yrhVar.a = d;
        } else {
            yrhVar.a = (d2 * 0.8500000238418579d) + (d * 0.1499999761581421d);
        }
    }

    public final ypm w(String str) {
        return (ypm) ((agm) this.c).b(str);
    }

    public final void x(ywn ywnVar, String str) {
        if (str != null) {
            agm agmVar = (agm) this.c;
            if (agmVar.b(str) == null) {
                vyo vyoVar = (vyo) this.a;
                apbx apbxVarAb = zhl.ab(vyoVar);
                boolean z = apbxVarAb.i || (!apbxVarAb.j.isEmpty() && Pattern.compile(apbxVarAb.j).matcher(str).find());
                apbx apbxVarAb2 = zhl.ab(vyoVar);
                boolean z2 = apbxVarAb2.k || (!apbxVarAb2.l.isEmpty() && Pattern.compile(apbxVarAb2.l).matcher(str).find());
                boolean zDk = ((zhl) this.b).dk();
                if (!z) {
                    if (!z2) {
                        return;
                    } else {
                        z2 = true;
                    }
                }
                agmVar.c(str, new ypm(ywnVar, z, z2, zDk));
                long jA = ywnVar.a();
                ywnVar.l("cat", ((ywc) ywc.b).d);
                if (zDk) {
                    ywnVar.l("cat", ((ywc) ywc.c).d);
                    long jB = ywnVar.b();
                    ywnVar.l("now", String.format(Locale.US, "%s%d;wt.%d", "t.", Long.valueOf(jB), Long.valueOf(jA + jB)));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [awmd, java.lang.Object] */
    public final CronetEngine y(boolean z) {
        ((Optional) this.c).isPresent();
        return !z ? (CronetEngine) this.b.io() : (CronetEngine) this.a.io();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Collection] */
    public final aooc z() {
        agkz agkzVarN;
        if ((((Context) this.a).getResources().getConfiguration().uiMode & 15) == 3) {
            return aooc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_ANDROID_AUDIO;
        }
        ?? r2 = this.b;
        synchronized (r2) {
            agkzVarN = agkz.n(r2);
        }
        if (agkzVarN.contains(8)) {
            return aooc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_A2DP;
        }
        if (agkzVarN.contains(7)) {
            return aooc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_HFP;
        }
        if (!agkzVarN.contains(22) && !agkzVarN.contains(4)) {
            if (agkzVarN.contains(5) || agkzVarN.contains(6) || agkzVarN.contains(13)) {
                return aooc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_LINE_OUT;
            }
            if (!agkzVarN.contains(3)) {
                if (agkzVarN.contains(12) || agkzVarN.contains(11)) {
                    return aooc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_USB_AUDIO;
                }
                if (agkzVarN.contains(9)) {
                    return aooc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HDMI;
                }
                if (agkzVarN.contains(23)) {
                    return aooc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_LE;
                }
                return agkzVarN.contains(2) ? aooc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BUILT_IN_SPEAKER : aooc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN;
            }
        }
        return aooc.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HEADPHONES;
    }

    public hed(aunn aunnVar, aunn aunnVar2, aunn aunnVar3) {
        this.b = aunnVar;
        this.a = aunnVar2;
        this.c = aunnVar3;
    }

    public hed(awmd awmdVar, awmd awmdVar2, tqj tqjVar) {
        this.c = awmdVar;
        this.a = awmdVar2;
        this.b = tqjVar;
    }

    public hed(cf cfVar, awmd awmdVar, awmd awmdVar2) {
        this.a = cfVar;
        this.b = awmdVar;
        this.c = awmdVar2;
    }

    public hed(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public hed(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public hed(Object obj, Object obj2, Object obj3, char[] cArr) {
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public hed(String str, Collection collection) {
        this.c = "com.google.android.gms.cast.CATEGORY_CAST";
        this.b = str;
        this.a = collection;
    }

    public hed(ExecutorService executorService, vyo vyoVar, zjr zjrVar) {
        this.b = vyoVar;
        this.c = zjrVar;
        this.a = executorService;
    }

    public hed(kpc kpcVar, hhc hhcVar, Runnable runnable, byte[] bArr) {
        this.b = kpcVar;
        this.c = hhcVar;
        this.a = runnable;
    }

    public hed(yoq yoqVar, zab zabVar) {
        this.c = new yyl();
        this.a = yoqVar;
        this.b = zabVar;
    }

    public hed(Context context) {
        Set setSynchronizedSet = DesugarCollections.synchronizedSet(new HashSet());
        this.b = setSynchronizedSet;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.c = audioManager;
        this.a = context;
        audioManager.registerAudioDeviceCallback(new yeu(setSynchronizedSet), null);
    }

    public hed(Context context, Class cls) {
        ComponentName componentName = new ComponentName(context, (Class<?>) cls);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        packageManager.getClass();
        this.b = context;
        this.a = componentName;
        this.c = packageManager;
        AppWidgetManager.getInstance(context);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.List] */
    public hed(List list) {
        this.a = list;
        this.b = new ArrayList(list.size());
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.b.add(((ekg) ((ekr) list.get(i)).c).a());
            this.c.add(((ekc) ((ekr) list.get(i)).d).a());
        }
    }

    public hed(vxz vxzVar, aunn aunnVar, Executor executor) {
        vxzVar.getClass();
        aunnVar.getClass();
        executor.getClass();
        this.b = vxzVar;
        this.a = aunnVar;
        this.c = executor;
    }

    public hed(wfr wfrVar, Map map) {
        this.b = wfrVar;
        this.c = map;
        agkh agkhVar = new agkh(4);
        agqr it = ((agpk) ((agpn) map).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            agkhVar.e(((weq) entry.getValue()).c(), (Long) entry.getKey());
        }
        this.a = agkhVar.d(true);
    }

    public hed(byte[] bArr) {
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public hed(awmd awmdVar, awmd awmdVar2, Optional optional, zjr zjrVar) {
        this.b = awmdVar;
        this.a = awmdVar2;
        this.c = zjrVar.j.l(165, 45545778L, false) ? optional : Optional.empty();
    }

    public hed(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
    }

    public hed(ett ettVar, euh euhVar) {
        this(ettVar, Collections.EMPTY_LIST, euhVar);
    }

    public hed(vyo vyoVar, zjr zjrVar) {
        this.a = vyoVar;
        this.b = zjrVar;
        this.c = new agm(10);
    }

    public hed(ett ettVar, List list, euh euhVar) {
        if (ettVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.b = ettVar;
        if (list != null) {
            this.c = list;
            this.a = euhVar;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public hed(mbc mbcVar) {
        this.c = mbcVar;
        this.a = new HashMap();
        this.b = new LruCache(5);
    }

    public hed(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.a = awmdVar;
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
    }

    public hed(Context context, nuc nucVar, agev agevVar) {
        this.b = nucVar;
        this.a = context.getResources().getDisplayMetrics();
        this.c = agevVar;
    }

    public hed() {
        throw null;
    }

    public hed(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        this.a = awmdVar3;
    }

    public hed(tss tssVar, vxz vxzVar) {
        this.c = tssVar;
        this.a = vxzVar;
        this.b = new awku(vpd.a);
    }

    public hed(Context context, awmd awmdVar, awut awutVar) {
        context.getClass();
        awutVar.getClass();
        this.a = context;
        this.b = awmdVar;
        this.c = awutVar;
    }

    public hed(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.c = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
    }

    public hed(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, char[] cArr) {
        awmdVar.getClass();
        this.b = awmdVar;
        awmdVar2.getClass();
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
    }
}
