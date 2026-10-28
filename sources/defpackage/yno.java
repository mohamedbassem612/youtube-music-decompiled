package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.service.notification.StatusBarNotification;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ScaleXSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.util.TypedValue;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.Surface;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.car.app.model.Alert;
import androidx.media3.decoder.av1.Dav1dLibrary;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import com.google.android.apps.youtube.proto.streaming.FormatIdOuterClass$FormatId;
import com.google.android.apps.youtube.proto.streaming.MediaCapabilitiesOuterClass$MediaCapabilities;
import com.google.android.libraries.youtube.logging.sampling.LogSamplerImpl;
import com.google.android.libraries.youtube.media.interfaces.FormatInitializationMetadataReceiver;
import com.google.android.libraries.youtube.media.interfaces.HttpHeader;
import com.google.android.libraries.youtube.media.interfaces.PlaybackAgnosticUserPreferences;
import com.google.android.libraries.youtube.media.player.exo2.platypus.PlaybackControllerWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.AssetDetail;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ClientError;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorMetaData;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$LogMessage;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.research.xeno.effect.Effect;
import com.youtube.android.libraries.elements.StatusOr;
import internal.org.jni_zero.CommonApis;
import io.grpc.Status;
import j$.time.Duration;
import j$.util.DesugarArrays;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.NetworkException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class yno {
    public yno(awut awutVar, Executor executor, zdj zdjVar, afki afkiVar, umk umkVar, aaok aaokVar, xsc xscVar, awmd awmdVar, awmd awmdVar2) {
        awutVar.getClass();
        executor.getClass();
        zdjVar.getClass();
        afkiVar.getClass();
        umkVar.getClass();
        aaokVar.getClass();
        xscVar.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
    }

    public static long A(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - j2;
    }

    public static /* synthetic */ PlaybackAgnosticUserPreferences B(boolean z, String str, ajhj ajhjVar, yog yogVar, int i) {
        int iE;
        int iE2;
        if (yogVar != null) {
            int i2 = yogVar.c;
            iE = zeh.e(yogVar.b);
            iE2 = zeh.e(i2);
        } else {
            iE = 1;
            iE2 = 1;
        }
        return new PlaybackAgnosticUserPreferences(z, str, ajhjVar.d, iE2 - 1, iE - 1, i);
    }

    public static /* synthetic */ boolean C(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static /* synthetic */ boolean D(String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    public static /* synthetic */ int E(Object obj, Object obj2, Object obj3, Object obj4) {
        return (((((Objects.hashCode(obj) * 31) + Objects.hashCode(obj2)) * 31) + Objects.hashCode(obj3)) * 31) + Objects.hashCode(obj4);
    }

    public static /* synthetic */ byte[] F(ajwo ajwoVar) {
        return (ajwoVar == null || (ajwoVar.b & 1) == 0) ? vzh.b : ajwoVar.c.G();
    }

    public static /* synthetic */ boolean G(float f) {
        return (Float.isInfinite(f) || Float.isNaN(f)) ? false : true;
    }

    public static /* synthetic */ boolean H(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static /* synthetic */ void I(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static /* synthetic */ void J(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static /* synthetic */ FrameLayout K(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }

    public static /* synthetic */ tnm L(int i, atzc atzcVar, byte[] bArr) {
        afv afvVar = new afv();
        for (String str : atzcVar.c()) {
            afvVar.put(str, atzcVar.a(str));
        }
        return new tnm(i, bArr, (Map) afvVar, false);
    }

    public static /* synthetic */ int M(int i) {
        int i2 = i - 1;
        switch (i2) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                throw new IllegalArgumentException(a.bR(i2, "Unrecognized layout exit reason: "));
        }
    }

    public static cvi N(String str, Set set, zaw zawVar) {
        if (ahno.ag("audio/mp4", str) || ahno.ag("video/mp4", str) || ahno.ag("text/mp4", str)) {
            return new daa(dbl.a, 32, new ArrayList(), new zax(set, zawVar));
        }
        if (ahno.ag("video/x-vnd.on2.vp9", str) || ahno.ag("audio/webm", str) || ahno.ag("video/webm", str)) {
            return new zal(new xur(set, zawVar));
        }
        throw new IllegalArgumentException("ManifestlessExtractorFactory does not support MimeType ".concat(String.valueOf(str)));
    }

    public static zjv O(wgs wgsVar) {
        if (wir.v().contains(Integer.valueOf(wgsVar.e()))) {
            return zjv.f;
        }
        return wgs.p(wgsVar.z()) == wgr.b ? zjv.e : zjv.b;
    }

    public static zjv P(zjr zjrVar, wiu wiuVar, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities, wgs wgsVar) {
        switch (wgs.p(wgsVar.z()).ordinal()) {
            case 7:
                return zjv.b;
            case 8:
            case 10:
                if (mediaCapabilitiesOuterClass$MediaCapabilities != null) {
                    for (jro jroVar : mediaCapabilitiesOuterClass$MediaCapabilities.c) {
                        aioy aioyVarA = aioy.a(jroVar.c);
                        if (aioyVarA == null) {
                            aioyVarA = aioy.UNKNOWN_CODEC;
                        }
                        if (aioyVarA == aioy.VP9 && !jroVar.d) {
                            return zjv.d;
                        }
                    }
                    return zjv.c;
                }
                break;
            case 9:
                if (mediaCapabilitiesOuterClass$MediaCapabilities == null) {
                    return zjv.c;
                }
                for (jro jroVar2 : mediaCapabilitiesOuterClass$MediaCapabilities.c) {
                    aioy aioyVarA2 = aioy.a(jroVar2.c);
                    if (aioyVarA2 == null) {
                        aioyVarA2 = aioy.UNKNOWN_CODEC;
                    }
                    if (aioyVarA2 == aioy.AV1 && !jroVar2.d) {
                        if (wiuVar.ak() && zjrVar.cC() && ((!zjrVar.aY() || zic.i()) && Dav1dLibrary.isAvailable())) {
                            return zjv.g;
                        }
                        return (zjrVar.aL() && zjrVar.fr("av1_supported", "video/av01", false, wiuVar.V(), agpr.a, wiuVar.B(), 0)) ? zjv.b : zjv.g;
                    }
                }
                break;
                break;
            default:
                return zjv.a;
        }
        return zjv.c;
    }

    public static void Q(xeu xeuVar, Throwable th, String str) {
        ajtx ajtxVarCx = cx(th, 13, ajtv.ERROR_LEVEL_WARNING, str);
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(ajtxVarCx, alot.CLIENT_ERROR);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVarCx.build();
        clientErrorOuterClass$ClientError.getClass();
        alouVar.d = clientErrorOuterClass$ClientError;
        alouVar.c = 163;
        xeuVar.b((alou) alosVar.build());
    }

    public static void R(ywn ywnVar, Throwable th) {
        zhv zhvVar = new zhv("player.exception");
        zhvVar.d = th;
        zhvVar.d();
        zhvVar.c("c.plat_ex");
        ywnVar.k(zhvVar.a());
    }

    public static void S(ahey aheyVar, Runnable runnable, long j, ywn ywnVar, xeu xeuVar, String str) {
        Runnable runnableI = afwl.i(runnable);
        taf.j(j > 0 ? aheyVar.schedule(runnableI, j, TimeUnit.MILLISECONDS) : aheyVar.submit(runnableI), new gwc(ywnVar, str, xeuVar, 8));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    public static int[] T(cio cioVar, aami aamiVar) {
        ArrayList arrayList = new ArrayList();
        ?? r5 = cioVar.d(0).f;
        for (int i = 0; i < r5.size(); i++) {
            if (((cij) r5.get(i)).b == aamiVar.a) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }

    public static void U(Intent intent, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        intent.putExtra("push_notification_clientstreamz_logging", str);
    }

    public static void V(Intent intent, aisd aisdVar) {
        if (aisdVar != null) {
            intent.putExtra("identity_token", aisdVar.toByteArray());
        }
    }

    public static void W(xgn xgnVar, Notification notification) {
        amud amudVarC = aabq.c(notification.extras);
        xgt xgtVarB = aabp.b(notification.extras);
        if (amudVarC == null || xgtVarB == null) {
            return;
        }
        xgnVar.C(xgtVarB);
        xgj xgjVar = new xgj(amudVarC.d, (amud) null);
        xgj xgjVar2 = new xgj(xhb.b(82046));
        xgnVar.e(xgjVar2, xgjVar);
        xgnVar.w(xgjVar2, null);
        xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar2, null);
    }

    public static void X(Context context, xgn xgnVar, Intent intent) {
        aabr aabrVarN = aagu.n(intent);
        int i = aabrVarN.b;
        if (i != -666) {
            for (StatusBarNotification statusBarNotification : Y(context)) {
                String str = aabrVarN.c;
                if (TextUtils.isEmpty(str) || (aagu.o(statusBarNotification).g() && TextUtils.equals(str, (CharSequence) aagu.o(statusBarNotification).c()) && TextUtils.equals(statusBarNotification.getTag(), aabrVarN.a) && statusBarNotification.getId() == i)) {
                    W(xgnVar, statusBarNotification.getNotification());
                    ((NotificationManager) context.getSystemService("notification")).cancel(aabrVarN.a, i);
                }
            }
        }
    }

    public static StatusBarNotification[] Y(Context context) {
        try {
            return ((NotificationManager) context.getSystemService("notification")).getActiveNotifications();
        } catch (Exception e) {
            zvp.a(zvn.a, zvm.h, e.getMessage());
            return new StatusBarNotification[0];
        }
    }

    public static String Z(String str) {
        if (str == null) {
            return null;
        }
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0);
    }

    public static Map a(List list, StatusOr statusOr, int i) {
        ArrayList arrayList;
        Set setO;
        statusOr.getClass();
        LinkedHashMap linkedHashMap = null;
        if (!list.isEmpty() && statusOr.hasValue && (arrayList = (ArrayList) statusOr.value) != null) {
            awtc awtcVar = new awtc(new awsu(new awss(atqq.ax(arrayList), true, new uvr(i, 2)), new yta(1), 2));
            if (awtcVar.hasNext()) {
                Object next = awtcVar.next();
                if (awtcVar.hasNext()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(next);
                    while (awtcVar.hasNext()) {
                        linkedHashSet.add(awtcVar.next());
                    }
                    setO = linkedHashSet;
                } else {
                    setO = atqq.o(next);
                }
            } else {
                setO = awnq.a;
            }
            if (!setO.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (setO.contains(((wgs) obj).o())) {
                        arrayList2.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj2 : arrayList2) {
                    wgs wgsVar = (wgs) obj2;
                    jqz jqzVar = wgsVar.I() ? jqz.TRACK_TYPE_AUDIO : wgsVar.af() ? jqz.TRACK_TYPE_VIDEO : jqz.TRACK_TYPE_TEXT;
                    Object arrayList3 = linkedHashMap2.get(jqzVar);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap2.put(jqzVar, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                linkedHashMap = new LinkedHashMap(atqq.u(linkedHashMap2.size()));
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    linkedHashMap.put(entry.getKey(), aguu.T((Collection) entry.getValue()));
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[RETURN, SYNTHETIC] */
    public static boolean aA(wiu wiuVar, byi byiVar, String str) {
        if (wiuVar.aw(akwl.EXO_PLAYER_CONFIG_FEATURES_DEBUG_LOGGING_FOR_PACING) && byiVar != null) {
            if (str != null) {
                Uri uri = byiVar.a;
                if (uri.getQueryParameter("cpn") == null || !str.equals(uri.getQueryParameter("cpn"))) {
                    if (byiVar.a.getQueryParameter("mpr") != null) {
                        return true;
                    }
                }
            } else if (byiVar.a.getQueryParameter("mpr") != null) {
                return true;
            }
        }
        return false;
    }

    public static void aB(zjd zjdVar) {
        zjdVar.aR(new yif());
    }

    public static void aC(zjd zjdVar, long j, long j2) {
        yie yieVar = new yie();
        yieVar.e(j - j2);
        zjdVar.aR(yieVar);
        yid yidVar = new yid();
        yidVar.e(j);
        zjdVar.aR(yidVar);
    }

    public static void aD(zjd zjdVar) {
        zjdVar.aR(new yig());
    }

    public static void aE(zjd zjdVar) {
        zjdVar.aR(new yih());
    }

    public static void aF(zjd zjdVar) {
        zjdVar.aS(new yii());
    }

    public static void aG(zjd zjdVar) {
        zjdVar.aS(new yij());
    }

    public static void aH(zjd zjdVar, int i, boolean z) {
        if (z) {
            zjdVar.aS(new yin(i));
        } else {
            zjdVar.aS(new yip());
        }
    }

    public static void aI(zjd zjdVar) {
        zjdVar.aS(new yis());
    }

    public static void aJ(zjd zjdVar) {
        zjdVar.aS(new yit());
    }

    public static void aK(zjd zjdVar) {
        zjdVar.aS(new yiu());
    }

    public static void aL(zjd zjdVar, ajvs ajvsVar) {
        zjdVar.aS(new yiv(ajvsVar));
    }

    public static void aM(zjd zjdVar, ajvt ajvtVar) {
        zjdVar.aS(new yiw(ajvtVar));
    }

    public static void aN(zjd zjdVar) {
        zjdVar.aS(new yiz());
    }

    public static void aO(zjd zjdVar) {
        zjdVar.aS(new yja());
    }

    public static void aP(zjd zjdVar) {
        zjdVar.aS(new yjb());
    }

    public static void aQ(zjd zjdVar) {
        zjdVar.aS(new yjc());
    }

    public static void aR(zjd zjdVar) {
        zjdVar.aS(new yjd());
    }

    public static void aS(zjd zjdVar) {
        zjdVar.aS(new yje());
    }

    public static void aT(zjd zjdVar) {
        zjdVar.aS(new yjf());
    }

    public static void aU(zjd zjdVar) {
        zjdVar.aS(new yjg());
    }

    public static void aV(zjd zjdVar) {
        zjdVar.aS(new yjh());
    }

    public static void aW(zjd zjdVar) {
        zjdVar.aS(new yji());
    }

    public static void aX(zjd zjdVar, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                zjdVar.aS(new ymr());
                return;
            } else {
                zjdVar.aS(new ymq());
                return;
            }
        }
        if (z2) {
            zjdVar.aS(new yil());
        } else {
            zjdVar.aS(new yik());
        }
    }

    public static void aY(zjd zjdVar, long j) {
        yjj yjjVar = new yjj();
        yjjVar.e(j);
        zjdVar.aS(yjjVar);
    }

    public static void aZ(zjd zjdVar) {
        zjdVar.aS(new yjk());
    }

    public static boolean aa(toe toeVar) {
        tnm tnmVar;
        int i;
        if (toeVar instanceof zxa) {
            return true;
        }
        if (toeVar instanceof tni) {
            tnmVar = ((tni) toeVar).b;
        } else {
            tnmVar = toeVar instanceof tob ? ((tob) toeVar).b : null;
        }
        return tnmVar != null && ((i = tnmVar.d) == 400 || i == 403);
    }

    public static void ab(zxs zxsVar) {
        zxsVar.a(Optional.empty());
    }

    public static String ac(String str, String str2) {
        return str2.isEmpty() ? String.valueOf(str).concat("||") : a.cd(str2, str, "||");
    }

    public static void ad(zvr zvrVar, zvn zvnVar, zvm zvmVar, String str, Throwable th, Map map) {
        zvrVar.i(zvnVar, zvmVar, str, th, map, new yom(18));
    }

    public static tpq ae(Context context, awmd awmdVar) {
        rrq rrqVar = (rrq) awmdVar.io();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("net");
        qpqVar.d("prodnet.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        qrlVarA.f(uriA);
        atpp atppVar = atpp.a;
        qrlVarA.e(atppVar);
        return new tpn(omj.U(rrqVar.c(qrlVarA.a())), atppVar);
    }

    public static UUID af() {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        return uuidRandomUUID;
    }

    public static /* synthetic */ int ag(Object obj) {
        Objects.checkIndex(0, 5);
        if (obj instanceof zra) {
            return 0;
        }
        if (obj instanceof zqz) {
            return 1;
        }
        if (obj instanceof zqi) {
            return 2;
        }
        return obj instanceof zrf ? 3 : -2;
    }

    public static Object ah(String str) {
        Object next;
        if (str == null || str.length() == 0) {
            return atqp.i(new IllegalArgumentException("MediaId value is null or empty"));
        }
        Iterator it = znf.k.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!awrc.c(((znf) ((Map.Entry) next).getValue()).l, str));
        Map.Entry entry = (Map.Entry) next;
        znf znfVar = entry != null ? (znf) entry.getValue() : null;
        return znfVar == null ? new znf(str) : znfVar;
    }

    public static znf ai(String str) {
        Object objAh = ah(str);
        if (true == (objAh instanceof awmm)) {
            objAh = null;
        }
        znf znfVar = (znf) objAh;
        return znfVar == null ? znf.a : znfVar;
    }

    public static boolean aj(znf znfVar, zne zneVar) {
        return zneVar != null && awrc.c(znfVar, zneVar.a());
    }

    public static int ak(int... iArr) throws zlj {
        int iGlCreateProgram = GLES20.glCreateProgram();
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            GLES20.glAttachShader(iGlCreateProgram, i2);
            GLES20.glDeleteShader(i2);
        }
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] == 1) {
            return iGlCreateProgram;
        }
        throw new zlj(String.format("Failed to link program : %s", GLES20.glGetProgramInfoLog(iGlCreateProgram)));
    }

    public static int al(int i, String str) throws zlj {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateShader;
        }
        throw new zlj(String.format("Failed to compile shader : %s", GLES20.glGetShaderInfoLog(iGlCreateShader)));
    }

    public static int am(int i, String str) throws zlj {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        ao("glGetAttribLocation");
        return iGlGetAttribLocation;
    }

    public static int an(int i, String str) throws zlj {
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        ao("glGetUniformLocation");
        return iGlGetUniformLocation;
    }

    public static void ao(String str) throws zlj {
        String hexString;
        StringBuilder sb = null;
        while (true) {
            int iEglGetError = EGL14.eglGetError();
            if (iEglGetError != 12288) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                Integer numValueOf = Integer.valueOf(iEglGetError);
                switch (iEglGetError) {
                    case 12288:
                        hexString = "EGL_SUCCESS";
                        break;
                    case 12289:
                        hexString = "EGL_NOT_INITIALIZED";
                        break;
                    case 12290:
                        hexString = "EGL_BAD_ACCESS";
                        break;
                    case 12291:
                        hexString = "EGL_BAD_ALLOC";
                        break;
                    case 12292:
                        hexString = "EGL_BAD_ATTRIBUTE";
                        break;
                    case 12293:
                        hexString = "EGL_BAD_CONFIG";
                        break;
                    case 12294:
                        hexString = "EGL_BAD_CONTEXT";
                        break;
                    case 12295:
                        hexString = "EGL_BAD_CURRENT_SURFACE";
                        break;
                    case 12296:
                        hexString = "EGL_BAD_DISPLAY";
                        break;
                    case 12297:
                        hexString = "EGL_BAD_MATCH";
                        break;
                    case 12298:
                        hexString = "EGL_BAD_NATIVE_PIXMAP";
                        break;
                    case 12299:
                        hexString = "EGL_BAD_NATIVE_WINDOW";
                        break;
                    case 12300:
                        hexString = "EGL_BAD_PARAMETER";
                        break;
                    case 12301:
                        hexString = "EGL_BAD_SURFACE";
                        break;
                    case 12302:
                        hexString = "EGL_CONTEXT_LOST";
                        break;
                    default:
                        hexString = Integer.toHexString(iEglGetError);
                        break;
                }
                sb.append(String.format("EGL Error: 0x%x %s ", numValueOf, hexString));
            } else {
                while (true) {
                    int iGlGetError = GLES20.glGetError();
                    if (iGlGetError == 0) {
                        if (sb != null) {
                            throw new zlj(String.format("%s: %s", str, sb));
                        }
                        return;
                    } else {
                        if (sb == null) {
                            sb = new StringBuilder();
                        }
                        sb.append(String.format("GLES Error: 0x%x %s ", Integer.valueOf(iGlGetError), GLU.gluErrorString(iGlGetError)));
                    }
                }
            }
        }
    }

    public static void ap(String str) throws zlc {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new zlc(str + ": " + sb.toString());
        }
    }

    public static void aq(Surface surface, final Bitmap bitmap, final sxu sxuVar, Handler handler) {
        final PixelCopy$OnPixelCopyFinishedListener pixelCopy$OnPixelCopyFinishedListener = new PixelCopy$OnPixelCopyFinishedListener() { // from class: zkq
            public final void onPixelCopyFinished(int i) {
                sxu sxuVar2 = sxuVar;
                Bitmap bitmap2 = bitmap;
                if (i == 0) {
                    sxuVar2.b(bitmap2, bitmap2);
                } else {
                    sxuVar2.iT(bitmap2, null);
                }
            }
        };
        long j = afwl.a;
        final afvl afvlVarC = afty.c(false);
        PixelCopy.request(surface, bitmap, new PixelCopy$OnPixelCopyFinishedListener() { // from class: afwe
            public final void onPixelCopyFinished(int i) {
                long j2 = afwl.a;
                afvh afvhVarA = afty.a();
                afvl afvlVarE = afty.e(afvhVarA, afvlVarC);
                try {
                    pixelCopy$OnPixelCopyFinishedListener.onPixelCopyFinished(i);
                    afty.e(afvhVarA, afvlVarE);
                } catch (Throwable th) {
                    try {
                        aftt.a(th);
                        throw th;
                    } catch (Throwable th2) {
                        afty.e(afvhVarA, afvlVarE);
                        throw th2;
                    }
                }
            }
        }, handler);
    }

    public static int ar(zjv zjvVar, boolean z) {
        if (zjvVar == null) {
            return 0;
        }
        int iOrdinal = zjvVar.ordinal();
        if (iOrdinal != 4) {
            return iOrdinal == 5 ? 4 : 0;
        }
        return !z ? 3 : 0;
    }

    public static int as(zjv zjvVar, boolean z, boolean z2) {
        if (z && !z2) {
            return 6;
        }
        if (zjvVar != null) {
            int iOrdinal = zjvVar.ordinal();
            if (iOrdinal == 3) {
                return 2;
            }
            if (iOrdinal == 6) {
                return 5;
            }
        }
        return 1;
    }

    public static clo at(zjr zjrVar, String str, boolean z, Set set, Set set2, agkj agkjVar, int i) {
        return au(zjrVar, str, set, set2, agkjVar, i, cma.e(str, z, false), false);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00eb  */
    public static clo au(zjr zjrVar, String str, Set set, Set set2, agkj agkjVar, int i, List list, boolean z) {
        boolean z2;
        zjt zixVar;
        boolean z3;
        boolean z4 = false;
        if (zjrVar.j.m(233, 45647777L)) {
            if (str.startsWith("audio")) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zixVar = ziy.a;
                        break;
                    }
                    clo cloVar = (clo) it.next();
                    if (gM(cloVar.b, set) && gO(cloVar, i, 0)) {
                        cloVar.getClass();
                        zixVar = new ziv(cloVar);
                        break;
                    }
                }
            } else {
                int i2 = i;
                boolean zEqualsIgnoreCase = "video/avc".equalsIgnoreCase(str);
                int i3 = true != zEqualsIgnoreCase ? 0 : 64;
                if (true == zEqualsIgnoreCase) {
                    i2 = 2;
                }
                boolean zIsEmpty = set2.isEmpty();
                Iterator it2 = list.iterator();
                clo cloVar2 = null;
                while (true) {
                    if (!it2.hasNext()) {
                        if (cloVar2 == null) {
                            zixVar = ziy.a;
                            break;
                        }
                        zixVar = new zix(cloVar2);
                        break;
                    }
                    clo cloVar3 = (clo) it2.next();
                    String str2 = cloVar3.b;
                    if (gM(str2, set)) {
                        if (!((!zjrVar.eo() || Build.VERSION.SDK_INT < 29) ? agkjVar.containsKey(str2) : cloVar3.j) && gN(cloVar3, zjrVar, set2) && gO(cloVar3, i2, i3)) {
                            cloVar3.getClass();
                            zixVar = new ziw(cloVar3);
                            break;
                        }
                        if (z) {
                            z3 = true;
                        } else if (!zjrVar.eo() || Build.VERSION.SDK_INT < 29 || cloVar3.j) {
                            z3 = z4;
                        }
                        if ((z3 || (zIsEmpty && agkjVar.containsKey(str2))) && gO(cloVar3, i2, i3)) {
                            if (cloVar2 != null) {
                                Object obj = cloVar2.b;
                                Object objValueOf = Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
                                if (((Integer) agkjVar.getOrDefault(str2, objValueOf)).intValue() < ((Integer) agkjVar.getOrDefault(obj, objValueOf)).intValue()) {
                                    cloVar2 = cloVar3;
                                }
                            } else {
                                cloVar2 = cloVar3;
                            }
                        }
                    }
                    z4 = false;
                }
            }
            int iB = zixVar.b() - 1;
            if (iB != 0) {
                if (iB != 1) {
                    return iB != 2 ? zixVar.c() : zixVar.d();
                }
                return zixVar.a();
            }
        } else {
            boolean zEqualsIgnoreCase2 = "video/avc".equalsIgnoreCase(str);
            char c = true != zEqualsIgnoreCase2 ? (char) 0 : '@';
            int i4 = true != zEqualsIgnoreCase2 ? i : 2;
            boolean zIsEmpty2 = set2.isEmpty();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                clo cloVar4 = (clo) it3.next();
                String str3 = cloVar4.b;
                if (z) {
                    z2 = true;
                } else if (!zjrVar.eo() || Build.VERSION.SDK_INT < 29 || !cloVar4.c.startsWith("video") || zIsEmpty2 || !cloVar4.j) {
                    z2 = false;
                }
                if (!set.contains(str3) && (z2 || (!set2.contains(str3) && gN(cloVar4, zjrVar, set2)))) {
                    if (i4 > 0) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : cloVar4.k()) {
                            if (codecProfileLevel.profile != i4 || (c > 0 && codecProfileLevel.level < 64)) {
                            }
                        }
                    }
                    return cloVar4;
                }
            }
        }
        return null;
    }

    public static Integer av(MediaCodecInfo.VideoCapabilities videoCapabilities, int i) {
        int iIntValue = ((Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
        int iIntValue2 = ((Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
        if (i != 1 && i != 2) {
            Range<Integer> supportedFrameRates = videoCapabilities.getSupportedFrameRates();
            if (supportedFrameRates != null) {
                return (Integer) supportedFrameRates.getUpper();
            }
        } else if (videoCapabilities.isSizeSupported(iIntValue, iIntValue2)) {
            Range<Double> achievableFrameRatesFor = i == 1 ? videoCapabilities.getAchievableFrameRatesFor(iIntValue, iIntValue2) : videoCapabilities.getSupportedFrameRatesFor(iIntValue, iIntValue2);
            if (achievableFrameRatesFor != null) {
                return Integer.valueOf(((Double) achievableFrameRatesFor.getUpper()).intValue());
            }
        }
        return null;
    }

    public static /* synthetic */ String aw(int i) {
        if (i == 1) {
            return "UNSUPPORTED";
        }
        if (i != 2) {
            return i != 3 ? "HARDWARE_VIDEO" : "SOFTWARE_VIDEO";
        }
        return "AUDIO";
    }

    public static Integer ax(wja wjaVar) {
        return (wjaVar == null || !wjaVar.L) ? null : 30;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:41:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x0182  */
    public static aihf ay(zjn zjnVar, Set set, Set set2, agkj agkjVar, zjr zjrVar, boolean z) {
        String str;
        String str2;
        int i;
        clo cloVarAt;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Integer numAv;
        atpk atpkVarET;
        String str3;
        String str4;
        String str5;
        aihf aihfVarCreateBuilder = jro.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        jro jroVar = (jro) aihfVarCreateBuilder.instance;
        aioy aioyVar = zjnVar.a;
        jroVar.c = aioyVar.m;
        jroVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        jro jroVar2 = (jro) aihfVarCreateBuilder.instance;
        jroVar2.b |= 2;
        boolean z2 = zjnVar.d;
        jroVar2.d = z2;
        if (z2) {
            boolean z3 = zjnVar.c;
            int i2 = zjo.a;
            int iOrdinal = aioyVar.ordinal();
            if (iOrdinal == 2) {
                str = "h264_main_profile_supported";
                str2 = "video/avc";
            } else if (iOrdinal == 4) {
                str3 = "video/x-vnd.on2.vp9";
                if (z3) {
                    str5 = "vp9_profile_2_supported";
                    i = 4096;
                    str2 = str3;
                    str = str5;
                    if (str2 != null) {
                        if (zjrVar.aq()) {
                            atpkVarET = zjrVar.eT(str, str2, false, set, set2, agkjVar, i);
                            if (atpkVarET.c) {
                                int i3 = atpkVarET.d;
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar3 = (jro) aihfVarCreateBuilder.instance;
                                jroVar3.b |= 16;
                                jroVar3.g = i3;
                                int i4 = atpkVarET.e;
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar4 = (jro) aihfVarCreateBuilder.instance;
                                jroVar4.b |= 4;
                                jroVar4.e = i4;
                                int i5 = atpkVarET.f;
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar5 = (jro) aihfVarCreateBuilder.instance;
                                jroVar5.b |= 32;
                                jroVar5.h = i5;
                                int i6 = atpkVarET.g;
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar6 = (jro) aihfVarCreateBuilder.instance;
                                jroVar6.b |= 8;
                                jroVar6.f = i6;
                                if (zjrVar.bx()) {
                                    int i7 = atpkVarET.h;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    jro jroVar7 = (jro) aihfVarCreateBuilder.instance;
                                    jroVar7.b |= SemanticState.ReadOnly;
                                    jroVar7.i = i7;
                                }
                            }
                        } else {
                            cloVarAt = at(zjrVar, str2, false, set, set2, agkjVar, i);
                            if (cloVarAt != null) {
                                int iIntValue = ((Integer) videoCapabilities.getSupportedHeights().getLower()).intValue();
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar8 = (jro) aihfVarCreateBuilder.instance;
                                jroVar8.b |= 16;
                                jroVar8.g = iIntValue;
                                int iIntValue2 = ((Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar9 = (jro) aihfVarCreateBuilder.instance;
                                jroVar9.b |= 4;
                                jroVar9.e = iIntValue2;
                                int iIntValue3 = ((Integer) videoCapabilities.getSupportedWidths().getLower()).intValue();
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar10 = (jro) aihfVarCreateBuilder.instance;
                                jroVar10.b |= 32;
                                jroVar10.h = iIntValue3;
                                int iIntValue4 = ((Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar11 = (jro) aihfVarCreateBuilder.instance;
                                jroVar11.b |= 8;
                                jroVar11.f = iIntValue4;
                                if (zjrVar.bx()) {
                                    int iIntValue5 = numAv.intValue();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    jro jroVar12 = (jro) aihfVarCreateBuilder.instance;
                                    jroVar12.b |= SemanticState.ReadOnly;
                                    jroVar12.i = iIntValue5;
                                }
                            }
                        }
                    }
                } else {
                    str4 = "vp9_supported";
                    str2 = str3;
                    str = str4;
                }
            } else if (iOrdinal != 8) {
                str = "";
                str2 = null;
            } else {
                str3 = "video/av01";
                if (!z3 || Build.VERSION.SDK_INT < 29) {
                    str4 = "av1_supported";
                    str2 = str3;
                    str = str4;
                } else {
                    str5 = "av1_profile_main_10_supported";
                    i = 4096;
                    str2 = str3;
                    str = str5;
                    if (str2 != null) {
                        if (zjrVar.aq()) {
                            atpkVarET = zjrVar.eT(str, str2, false, set, set2, agkjVar, i);
                            if (atpkVarET.c && (atpkVarET.b & 2) != 0) {
                                int i8 = atpkVarET.d;
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar13 = (jro) aihfVarCreateBuilder.instance;
                                jroVar13.b |= 16;
                                jroVar13.g = i8;
                                int i9 = atpkVarET.e;
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar14 = (jro) aihfVarCreateBuilder.instance;
                                jroVar14.b |= 4;
                                jroVar14.e = i9;
                                int i10 = atpkVarET.f;
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar15 = (jro) aihfVarCreateBuilder.instance;
                                jroVar15.b |= 32;
                                jroVar15.h = i10;
                                int i11 = atpkVarET.g;
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar16 = (jro) aihfVarCreateBuilder.instance;
                                jroVar16.b |= 8;
                                jroVar16.f = i11;
                                if (zjrVar.bx() && (atpkVarET.b & 32) != 0) {
                                    int i12 = atpkVarET.h;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    jro jroVar17 = (jro) aihfVarCreateBuilder.instance;
                                    jroVar17.b |= SemanticState.ReadOnly;
                                    jroVar17.i = i12;
                                }
                            }
                        } else {
                            try {
                                cloVarAt = at(zjrVar, str2, false, set, set2, agkjVar, i);
                            } catch (cly unused) {
                                cloVarAt = null;
                            }
                            if (cloVarAt != null && (codecCapabilities = cloVarAt.e) != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                                int iIntValue6 = ((Integer) videoCapabilities.getSupportedHeights().getLower()).intValue();
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar18 = (jro) aihfVarCreateBuilder.instance;
                                jroVar18.b |= 16;
                                jroVar18.g = iIntValue6;
                                int iIntValue7 = ((Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar19 = (jro) aihfVarCreateBuilder.instance;
                                jroVar19.b |= 4;
                                jroVar19.e = iIntValue7;
                                int iIntValue8 = ((Integer) videoCapabilities.getSupportedWidths().getLower()).intValue();
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar110 = (jro) aihfVarCreateBuilder.instance;
                                jroVar110.b |= 32;
                                jroVar110.h = iIntValue8;
                                int iIntValue9 = ((Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
                                aihfVarCreateBuilder.copyOnWrite();
                                jro jroVar111 = (jro) aihfVarCreateBuilder.instance;
                                jroVar111.b |= 8;
                                jroVar111.f = iIntValue9;
                                if (zjrVar.bx() && (numAv = av(videoCapabilities, zjrVar.u())) != null) {
                                    int iIntValue10 = numAv.intValue();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    jro jroVar112 = (jro) aihfVarCreateBuilder.instance;
                                    jroVar112.b |= SemanticState.ReadOnly;
                                    jroVar112.i = iIntValue10;
                                }
                            }
                        }
                    }
                }
            }
            i = 0;
            if (str2 != null) {
                if (zjrVar.aq()) {
                    atpkVarET = zjrVar.eT(str, str2, false, set, set2, agkjVar, i);
                    if (atpkVarET.c) {
                        int i13 = atpkVarET.d;
                        aihfVarCreateBuilder.copyOnWrite();
                        jro jroVar113 = (jro) aihfVarCreateBuilder.instance;
                        jroVar113.b |= 16;
                        jroVar113.g = i13;
                        int i14 = atpkVarET.e;
                        aihfVarCreateBuilder.copyOnWrite();
                        jro jroVar114 = (jro) aihfVarCreateBuilder.instance;
                        jroVar114.b |= 4;
                        jroVar114.e = i14;
                        int i15 = atpkVarET.f;
                        aihfVarCreateBuilder.copyOnWrite();
                        jro jroVar115 = (jro) aihfVarCreateBuilder.instance;
                        jroVar115.b |= 32;
                        jroVar115.h = i15;
                        int i16 = atpkVarET.g;
                        aihfVarCreateBuilder.copyOnWrite();
                        jro jroVar116 = (jro) aihfVarCreateBuilder.instance;
                        jroVar116.b |= 8;
                        jroVar116.f = i16;
                        if (zjrVar.bx()) {
                            int i17 = atpkVarET.h;
                            aihfVarCreateBuilder.copyOnWrite();
                            jro jroVar117 = (jro) aihfVarCreateBuilder.instance;
                            jroVar117.b |= SemanticState.ReadOnly;
                            jroVar117.i = i17;
                        }
                    }
                } else {
                    cloVarAt = at(zjrVar, str2, false, set, set2, agkjVar, i);
                    if (cloVarAt != null) {
                        int iIntValue11 = ((Integer) videoCapabilities.getSupportedHeights().getLower()).intValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        jro jroVar118 = (jro) aihfVarCreateBuilder.instance;
                        jroVar118.b |= 16;
                        jroVar118.g = iIntValue11;
                        int iIntValue12 = ((Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        jro jroVar119 = (jro) aihfVarCreateBuilder.instance;
                        jroVar119.b |= 4;
                        jroVar119.e = iIntValue12;
                        int iIntValue13 = ((Integer) videoCapabilities.getSupportedWidths().getLower()).intValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        jro jroVar1110 = (jro) aihfVarCreateBuilder.instance;
                        jroVar1110.b |= 32;
                        jroVar1110.h = iIntValue13;
                        int iIntValue14 = ((Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
                        aihfVarCreateBuilder.copyOnWrite();
                        jro jroVar1111 = (jro) aihfVarCreateBuilder.instance;
                        jroVar1111.b |= 8;
                        jroVar1111.f = iIntValue14;
                        if (zjrVar.bx()) {
                            int iIntValue15 = numAv.intValue();
                            aihfVarCreateBuilder.copyOnWrite();
                            jro jroVar1112 = (jro) aihfVarCreateBuilder.instance;
                            jroVar1112.b |= SemanticState.ReadOnly;
                            jroVar1112.i = iIntValue15;
                        }
                    }
                }
            }
        } else {
            int i18 = zjnVar.e;
            if (i18 > 0) {
                aihfVarCreateBuilder.copyOnWrite();
                jro jroVar20 = (jro) aihfVarCreateBuilder.instance;
                jroVar20.b |= 4;
                jroVar20.e = i18;
                aihfVarCreateBuilder.copyOnWrite();
                jro jroVar21 = (jro) aihfVarCreateBuilder.instance;
                jroVar21.b |= 8;
                jroVar21.f = i18;
                aihfVarCreateBuilder.copyOnWrite();
                jro jroVar22 = (jro) aihfVarCreateBuilder.instance;
                jroVar22.b |= 16;
                jroVar22.g = 1;
                aihfVarCreateBuilder.copyOnWrite();
                jro jroVar23 = (jro) aihfVarCreateBuilder.instance;
                jroVar23.b |= 32;
                jroVar23.h = 1;
            }
        }
        if (zjrVar.j.m(252, 45664669L)) {
            jro jroVar24 = (jro) aihfVarCreateBuilder.instance;
            if (jroVar24.f == 0 || jroVar24.e == 0) {
                return null;
            }
        }
        if (zjnVar.b) {
            if (z) {
                aihfVarCreateBuilder.copyOnWrite();
                jro jroVar25 = (jro) aihfVarCreateBuilder.instance;
                jroVar25.b |= 16384;
                jroVar25.k = 1;
            } else {
                aihfVarCreateBuilder.copyOnWrite();
                jro jroVar26 = (jro) aihfVarCreateBuilder.instance;
                jroVar26.b |= 16384;
                jroVar26.k = 8;
            }
        }
        if (zjnVar.c) {
            aihfVarCreateBuilder.copyOnWrite();
            jro jroVar27 = (jro) aihfVarCreateBuilder.instance;
            jroVar27.b |= SemanticState.Multiline;
            jroVar27.j = true;
        }
        Integer num = zjnVar.f;
        if (num == null) {
            return aihfVarCreateBuilder;
        }
        num.intValue();
        int iIntValue16 = num.intValue();
        aihfVarCreateBuilder.copyOnWrite();
        jro jroVar28 = (jro) aihfVarCreateBuilder.instance;
        jroVar28.b |= SemanticState.ReadOnly;
        jroVar28.i = iIntValue16;
        return aihfVarCreateBuilder;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r4.i != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long az(defpackage.wgs r4, defpackage.wiu r5, int r6, int r7) {
        /*
            boolean r0 = r4.W()
            if (r0 != 0) goto L5b
            boolean r0 = r5.ae()
            if (r0 == 0) goto L5b
            java.util.List r0 = r5.U()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r0.contains(r7)
            if (r7 == 0) goto L5b
            long r0 = r5.z()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L5b
            boolean r7 = r4.af()
            r2 = 8
            if (r7 == 0) goto L4d
            r7 = 2
            if (r6 == r7) goto L36
            r7 = 10000(0x2710, float:1.4013E-41)
            if (r6 != r7) goto L4d
        L36:
            int r6 = r4.g
            int r4 = r4.d()
            r7 = 240(0xf0, float:3.36E-43)
            if (r4 <= r7) goto L44
            r4 = 128000(0x1f400, float:1.79366E-40)
            goto L47
        L44:
            r4 = 48000(0xbb80, float:6.7262E-41)
        L47:
            int r6 = r6 + r4
            long r6 = (long) r6
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L59
        L4d:
            aoqd r4 = r5.d
            akjx r4 = r4.x
            if (r4 != 0) goto L55
            akjx r4 = defpackage.akjx.b
        L55:
            boolean r4 = r4.i
            if (r4 == 0) goto L5b
        L59:
            long r0 = r0 / r2
            goto L5d
        L5b:
            r0 = 0
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yno.az(wgs, wiu, int, int):long");
    }

    public static /* synthetic */ String b(int i) {
        return i != 2 ? "THROWABLE" : "ONESIE_INNERTUBE_RESPONSE";
    }

    public static void bA(zjd zjdVar) {
        zjdVar.aS(new yky());
    }

    public static void bB(zjd zjdVar) {
        zjdVar.aS(new ylb());
    }

    public static void bC(zjd zjdVar, String str) {
        zjdVar.aS(new yld(str));
    }

    public static void bD(zjd zjdVar) {
        zjdVar.aR(new ylp());
    }

    public static void bE(zjd zjdVar) {
        zjdVar.aR(new ylq());
    }

    public static void bF(zjd zjdVar) {
        zjdVar.aS(new ylr());
    }

    public static void bG(zjd zjdVar) {
        zjdVar.aR(new yls());
    }

    public static void bH(zjd zjdVar) {
        zjdVar.aR(new ylu(null));
    }

    public static void bI(zjd zjdVar) {
        zjdVar.aR(new ylt());
    }

    public static void bJ(zjd zjdVar) {
        zjdVar.aR(new ylu());
    }

    public static void bK(zjd zjdVar) {
        zjdVar.aR(new ylv());
    }

    public static void bL(zjd zjdVar) {
        zjdVar.aR(new ylw());
    }

    public static void bM(zjd zjdVar) {
        zjdVar.aR(new ylx());
    }

    public static void bN(zjd zjdVar) {
        zjdVar.aR(new yly());
    }

    public static void bO(zjd zjdVar) {
        zjdVar.aS(new ylz());
    }

    public static void bP(zjd zjdVar) {
        zjdVar.aR(new yma());
    }

    public static void bQ(zjd zjdVar) {
        zjdVar.aR(new ymb());
    }

    public static void bR(zjd zjdVar) {
        zjdVar.aR(new ymc());
    }

    public static void bS(zjd zjdVar) {
        zjdVar.aR(new yme());
    }

    public static void bT(zjd zjdVar) {
        zjdVar.aR(new ymf());
    }

    public static void bU(zjd zjdVar, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                zjdVar.aS(new ymu());
                return;
            } else {
                zjdVar.aS(new ymw());
                return;
            }
        }
        if (z2) {
            zjdVar.aS(new yio());
        } else {
            zjdVar.aS(new yiq());
        }
    }

    public static void bV(zjd zjdVar, long j, long j2) {
        ymi ymiVar = new ymi();
        ymiVar.e(j);
        zjdVar.aR(ymiVar);
        ymh ymhVar = new ymh();
        ymhVar.e(j2);
        zjdVar.aR(ymhVar);
    }

    public static void bW(zjd zjdVar) {
        zjdVar.aR(new yml());
    }

    public static void bX(zjd zjdVar, long j, long j2) {
        ymk ymkVar = new ymk();
        ymkVar.e(j - j2);
        zjdVar.aR(ymkVar);
        ymj ymjVar = new ymj();
        ymjVar.e(j);
        zjdVar.aR(ymjVar);
    }

    public static void bY(zjd zjdVar) {
        zjdVar.aR(new ymm());
    }

    public static void bZ(zjd zjdVar) {
        zjdVar.aR(new ymn());
    }

    public static void ba(zjd zjdVar, boolean z) {
        if (z) {
            zjdVar.aS(new yms());
        } else {
            zjdVar.aS(new yim());
        }
    }

    public static void bb(zjd zjdVar) {
        zjdVar.aS(new yjn());
    }

    public static void bc(zjd zjdVar) {
        zjdVar.aS(new yjo());
    }

    public static void bd(zjd zjdVar) {
        zjdVar.aS(new yjp());
    }

    public static void be(zjd zjdVar) {
        zjdVar.aR(new yjl());
    }

    public static void bf(zjd zjdVar) {
        zjdVar.aR(new yjm());
    }

    public static void bg(zjd zjdVar) {
        zjdVar.aS(new yjq());
    }

    public static void bh(zjd zjdVar) {
        zjdVar.aS(new yjr());
    }

    public static void bi(zjd zjdVar) {
        zjdVar.aS(new ymg());
    }

    public static void bj(zjd zjdVar) {
        zjdVar.aS(new yjy());
    }

    public static void bk(zjd zjdVar) {
        zjdVar.aS(new yjz());
    }

    public static void bl(zjd zjdVar) {
        zjdVar.aS(new ykb());
    }

    public static void bm(zjd zjdVar) {
        zjdVar.aS(new ykd());
    }

    public static void bn(zjd zjdVar) {
        zjdVar.aS(new yke());
    }

    public static void bo(zjd zjdVar) {
        zjdVar.aS(new ykg());
    }

    public static void bp(zjd zjdVar) {
        zjdVar.aS(new ykh());
    }

    public static void bq(zjd zjdVar) {
        zjdVar.aS(new yki());
    }

    public static void br(zjd zjdVar) {
        zjdVar.aS(new ykj());
    }

    public static void bs(zjd zjdVar) {
        zjdVar.aR(new ykn());
    }

    public static void bt(zjd zjdVar) {
        zjdVar.aS(new ykq());
    }

    public static void bu(zjd zjdVar) {
        zjdVar.aS(new ykr());
    }

    public static void bv(zjd zjdVar) {
        zjdVar.aS(new yks());
    }

    public static void bw(zjd zjdVar) {
        zjdVar.aS(new ykt());
    }

    public static void bx(zjd zjdVar) {
        zjdVar.aS(new ykv());
    }

    public static void by(zjd zjdVar) {
        zjdVar.aS(new ykw());
    }

    public static void bz(zjd zjdVar) {
        zjdVar.aS(new ykx());
    }

    public static ArrayList c(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                arrayList.add(new HttpHeader((String) entry.getKey(), (String) it.next()));
            }
        }
        return arrayList;
    }

    public static float cA(wiu wiuVar, float f) {
        float fMin;
        if (wiuVar == null) {
            return f;
        }
        aoqd aoqdVar = wiuVar.d;
        if ((aoqdVar.b & 32) != 0) {
            ajhg ajhgVar = aoqdVar.g;
            if (ajhgVar == null) {
                ajhgVar = ajhg.a;
            }
            fMin = Math.min(1.0f, (float) Math.pow(10.0d, (-ajhgVar.c) / 20.0f));
        } else {
            fMin = 1.0f;
        }
        return tym.z(f * fMin, 0.0f, 1.0f);
    }

    public static long cB(mbc mbcVar, long j) {
        if (j >= 0) {
            return mbcVar.b() - j;
        }
        return 0L;
    }

    public static String cC(apbv apbvVar) {
        return Base64.encodeToString(apbvVar.toByteArray(), 11);
    }

    public static String cD(apbx apbxVar, double d, int i) {
        if (!new aihx(apbxVar.r, apbx.a).contains(apbw.QOE_HOT_CONFIG_FEATURES_USE_STRING_FORMAT_FOR_ELAPSED_TIME)) {
            return String.format(Locale.US, a.ci((byte) 102, i, "%."), Double.valueOf(d));
        }
        double d2 = i != 2 ? 1000.0d : 100.0d;
        double dRound = Math.round(d * d2) / d2;
        long j = (long) dRound;
        return dRound == ((double) j) ? Long.toString(j) : Double.toString(dRound);
    }

    public static String cE(mbc mbcVar, long j) {
        return cF(cB(mbcVar, j));
    }

    public static String cF(long j) {
        int i;
        char[] cArr = new char[21];
        int i2 = 20;
        long j2 = j;
        while (true) {
            cArr[i2] = (char) (Math.abs((int) (j2 % 10)) + 48);
            if (i2 == 18) {
                cArr[17] = '.';
                i2 = 17;
            }
            j2 /= 10;
            i = i2 - 1;
            if (j2 == 0 && i < 16) {
                break;
            }
            i2 = i;
        }
        if (j < 0) {
            cArr[i] = '-';
            i = i2 - 2;
        }
        int i3 = i + 1;
        return new String(cArr, i3, 21 - i3);
    }

    public static String cG(Throwable th, String str, String str2, String str3, Surface surface, wgs wgsVar, bse bseVar) {
        StringBuilder sb = new StringBuilder();
        cI(sb, wgsVar, bseVar);
        sb.append("src.decinit");
        if ((th instanceof IllegalArgumentException) && "The surface has been released".equals(th.getMessage())) {
            sb.append(";c.sur.released");
        }
        sb.append(";name.");
        sb.append(str);
        sb.append(";info.");
        if (str2 != null || th == null) {
            sb.append(str2);
        } else {
            sb.append(zhf.g(th));
        }
        sb.append(";mime.");
        sb.append(str3);
        sb.append(";sur.");
        sb.append(cH(surface));
        return sb.toString();
    }

    public static String cH(Surface surface) {
        if (surface == null) {
            return "null";
        }
        return surface.isValid() ? "valid" : "invalid";
    }

    public static void cI(StringBuilder sb, wgs wgsVar, bse bseVar) {
        String str;
        if (bseVar == null || (str = bseVar.a) == null) {
            if (wgsVar != null) {
                sb.append("itag.");
                sb.append(wgsVar.e());
                sb.append(";xtags.");
                sb.append(wgsVar.C());
                sb.append(';');
                return;
            }
            return;
        }
        int iCn = zik.cn(str);
        if (iCn != -1) {
            sb.append("itag.");
            sb.append(iCn);
            sb.append(';');
        }
        String strCp = zik.cp(str);
        if (strCp.isEmpty()) {
            return;
        }
        sb.append("xtags.");
        sb.append(strCp);
        sb.append(';');
    }

    public static tyt cJ(Uri uri, String str, String str2, String str3, abuz abuzVar, arie arieVar, wiu wiuVar) {
        tyt tytVar = new tyt(uri);
        tytVar.f("event", "streamingstats");
        tytVar.f("cpn", str);
        tytVar.f("ns", "yt");
        if (!TextUtils.isEmpty(str2)) {
            tytVar.f("cotn", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            tytVar.f("docid", str3);
        }
        if (arieVar != null && (arieVar.b & 1) != 0) {
            tytVar.c(arieVar.c);
        }
        if (wiuVar.av()) {
            if (wiuVar.ag()) {
                tytVar.f("dai", "ss");
            } else {
                tytVar.f("dai", "cs");
            }
        }
        abuzVar.f(tytVar);
        return tytVar;
    }

    public static /* synthetic */ String cK(int i) {
        return i != 1 ? "ERROR" : "WRITER";
    }

    public static void cL(tft tftVar, tgf tgfVar, yeb yebVar) {
        tftVar.getClass();
        taq.c();
        tgo tgoVarA = null;
        try {
            try {
                try {
                    tgoVarA = tftVar.a(tgfVar);
                    tgoVarA.getClass();
                    yebVar.b(tgoVarA);
                    tgn tgnVar = tgoVarA.d;
                    if (tgnVar != null) {
                        tgnVar.g();
                    }
                } catch (IOException e) {
                    yebVar.a(e);
                    if (tgoVarA != null && (tgnVar = tgoVarA.d) != null) {
                    }
                }
            } catch (Throwable th) {
                if (tgoVarA != null) {
                    try {
                        tgn tgnVar2 = tgoVarA.d;
                        if (tgnVar2 != null) {
                            tgnVar2.g();
                        }
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }

    public static String cM(boolean z, String str) {
        return String.format("android%s-%s-%s", cZ() ? ".m" : "", true != z ? "phone" : "tablet", str);
    }

    public static void cN(xgj xgjVar, amdd amddVar, xgn xgnVar) {
        xgnVar.getClass();
        xgnVar.d(xgjVar);
        xgnVar.w(xgjVar, amddVar);
    }

    public static amdd cO(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        aihf aihfVarCreateBuilder = amdd.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aihf aihfVarCreateBuilder2 = amds.a.createBuilder();
        aihfVarCreateBuilder2.getClass();
        aihfVarCreateBuilder2.copyOnWrite();
        amds amdsVar = (amds) aihfVarCreateBuilder2.instance;
        amdsVar.c = i2 - 1;
        amdsVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        amds amdsVar2 = (amds) aihfVarCreateBuilder2.instance;
        amdsVar2.d = i - 1;
        amdsVar2.b |= 2;
        aihn aihnVarBuild = aihfVarCreateBuilder2.build();
        aihnVarBuild.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder.instance;
        amddVar.C = (amds) aihnVarBuild;
        amddVar.d |= 4194304;
        aihn aihnVarBuild2 = aihfVarCreateBuilder.build();
        aihnVarBuild2.getClass();
        return (amdd) aihnVarBuild2;
    }

    public static int cP(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            return i != 3 ? 1 : 5;
        }
        return 3;
    }

    public static Intent cQ(Context context) {
        return new Intent().setClassName(context, "com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity");
    }

    public static Object cR(Duration duration, awoq awoqVar) {
        if (duration.compareTo(Duration.ZERO) > 0) {
            Object objR = afyd.r(duration, awoqVar);
            if (objR == awox.a) {
                return objR;
            }
        } else {
            Object objJ = awuw.j(awoqVar);
            if (objJ == awox.a) {
                return objJ;
            }
        }
        return awmy.a;
    }

    public static xzd cS(String str) {
        xzd xzdVar = new xzd();
        if (str == null) {
            str = UUID.randomUUID().toString();
            str.getClass();
        }
        xzdVar.h(str);
        return xzdVar;
    }

    public static xyw cT(int i) {
        xyw xywVar = xyw.UNSTARTED;
        if (i == xywVar.o) {
            return xywVar;
        }
        xyw xywVar2 = xyw.ENDED;
        if (i != xywVar2.o) {
            xywVar2 = xyw.PLAYING;
            if (i != xywVar2.o) {
                xywVar2 = xyw.PAUSED;
                if (i != xywVar2.o) {
                    xywVar2 = xyw.BUFFERING;
                    if (i != xywVar2.o) {
                        xywVar2 = xyw.VIDEO_CUED;
                        if (i != xywVar2.o) {
                            xywVar2 = xyw.AD_UNSTARTED;
                            if (i != xywVar2.o) {
                                xywVar2 = xyw.AD_PLAYING;
                                if (i != xywVar2.o) {
                                    xywVar2 = xyw.AD_SKIPPED;
                                    if (i != xywVar2.o) {
                                        xywVar2 = xyw.AD_ENDED;
                                        if (i != xywVar2.o) {
                                            xywVar2 = xyw.AD_PAUSED;
                                            if (i != xywVar2.o) {
                                                xywVar2 = xyw.AD_BUFFERING;
                                                if (i != xywVar2.o) {
                                                    xywVar2 = xyw.ERROR;
                                                    if (i != xywVar2.o) {
                                                        return xywVar;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return xywVar2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    public static long cU(wjf wjfVar, aazk aazkVar, acfw acfwVar, mbc mbcVar) {
        Uri uriC;
        char c = 0;
        if (wjfVar != null) {
            if (wjfVar.V()) {
                wja wjaVarG = wjfVar.g();
                if (wjaVarG != null && (uriC = wjaVarG.c()) != null) {
                    String string = uriC.toString();
                    if (string.contains("manifest_duration") && string.contains("start_walltime")) {
                        long jGP = gP(wjfVar, "start_walltime_us/(\\d*)", TimeUnit.MICROSECONDS);
                        long jGP2 = gP(wjfVar, "manifest_duration/(\\d*)", TimeUnit.SECONDS) + jGP;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        long epochMilli = mbcVar.f().toEpochMilli() / 1000;
                        if (jGP >= epochMilli || jGP2 <= epochMilli) {
                            c = 3;
                        } else {
                            c = 2;
                        }
                    } else {
                        c = 2;
                    }
                }
            } else {
                c = 1;
            }
        }
        agrx agrxVar = agso.a;
        if ((c == 2 || c == 3) && aazkVar != null) {
            return aazkVar.b;
        }
        if (c == 2) {
            return -1L;
        }
        if (c == 3) {
            return 0L;
        }
        if (aazkVar != null) {
            long j = aazkVar.a;
            if (aazkVar.d - j >= 1500) {
                return j;
            }
            return 0L;
        }
        if (acfwVar != null) {
            return acfwVar.a();
        }
        if (wjfVar != null) {
            return wjfVar.f().v();
        }
        return 0L;
    }

    public static boolean cV(vxz vxzVar, amyu amyuVar, boolean z, acfw acfwVar, boolean z2) {
        return vxzVar.l(42, 45383916L, false) && vxzVar.l(53, 45391510L, false) && Objects.equals(amyuVar, amyu.MDX_SESSION_DISCONNECT_REASON_DISCONNECTED_BY_USER) && z && acfwVar != null && z2;
    }

    public static xvk cW(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xvk xvkVar = (xvk) it.next();
            if (xvkVar.l().equals(str)) {
                return xvkVar;
            }
        }
        return null;
    }

    public static vxe cX() {
        return vxe.d;
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
    public static tza cY(aeda aedaVar) {
        boolean z = false;
        if (aedaVar.f() && aedaVar.g()) {
            z = true;
        }
        ajet ajetVar = ajet.USER_INTERFACE_THEME_DARK;
        boolean zEquals = ajetVar.equals(ajetVar);
        int i = true != zEquals ? R.style.Mdx_Theme_Settings : R.style.Mdx_Theme_Settings_Dark;
        int i2 = true != zEquals ? R.style.Mdx_Theme_Settings_DarkerPalette : R.style.Mdx_Theme_Settings_Dark_DarkerPalette;
        if (true == z) {
            i = i2;
        }
        return new tza(i);
    }

    public static boolean cZ() {
        return true;
    }

    public static void ca(zjd zjdVar) {
        zjdVar.aS(new ymo());
    }

    public static void cb(zjd zjdVar) {
        zjdVar.aS(new ymp());
    }

    public static void cc(zjd zjdVar, int i, boolean z) {
        if (z) {
            zjdVar.aS(new ymt(i));
        } else {
            zjdVar.aS(new ymv());
        }
    }

    public static void cd(zjd zjdVar) {
        zjdVar.aS(new ymx());
    }

    public static void ce(zjd zjdVar) {
        zjdVar.aS(new ymy());
    }

    public static void cf(zjd zjdVar) {
        zjdVar.aS(new ymz());
    }

    public static void cg(zjd zjdVar) {
        zjdVar.aS(new yna());
    }

    public static void ch(zjd zjdVar) {
        zjdVar.aS(new ynb());
    }

    public static void ci(zjd zjdVar) {
        zjdVar.aS(new ync());
    }

    public static void cj(zjd zjdVar) {
        zjdVar.aS(new ynd());
    }

    public static void ck(zjd zjdVar) {
        zjdVar.aS(new yne());
    }

    public static void cl(zjd zjdVar) {
        zjdVar.aS(new ynf());
    }

    public static void cm(zjd zjdVar) {
        zjdVar.aS(new yng());
    }

    public static void cn(zjd zjdVar) {
        zjdVar.aS(new ynh());
    }

    public static void co(zjd zjdVar) {
        zjdVar.aS(new ynk());
    }

    public static void cp(zjd zjdVar) {
        zjdVar.aS(new ynl());
    }

    public static void cq(zjd zjdVar) {
        zjdVar.aS(new ynm());
    }

    public static void cr(zjd zjdVar) {
        zjdVar.aS(new ynn());
    }

    public static void cs(zjd zjdVar, tas tasVar) {
        if (tasVar instanceof ynp) {
            zjdVar.aS((ynp) tasVar);
        } else if (tasVar instanceof yjs) {
            zjdVar.aR((yjs) tasVar);
        }
    }

    public static zjl ct(wja wjaVar) {
        wjaVar.getClass();
        return new zit(wjaVar);
    }

    public static zij cu(wgs wgsVar) {
        if (wgsVar.V() && !wgsVar.T()) {
            if (!wgsVar.N()) {
                return zij.b;
            }
            if (wgsVar.ag()) {
                return zij.c;
            }
            if (wgsVar.S()) {
                return zij.d;
            }
        }
        return zij.a;
    }

    public static String cv(int i) {
        if (i == 1) {
            return "i";
        }
        if (i == 2) {
            return "m";
        }
        if (i == 3) {
            return "a";
        }
        switch (i) {
            case 10000:
                return "s";
            case 10001:
                return "r";
            case 10002:
                return "v";
            default:
                return null;
        }
    }

    public static boolean cw(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        switch (i) {
            case 10000:
            case 10001:
            case 10002:
            case 10003:
                return true;
            default:
                return false;
        }
    }

    public static ajtx cx(Throwable th, int i, ajtv ajtvVar, String str) {
        aihf aihfVarCreateBuilder = ClientErrorOuterClass$ErrorMetaData.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aorb.a.createBuilder();
        aihfVarCreateBuilder2.ca(i);
        String strC = zhf.c(th, 0, 5, ":");
        aihfVarCreateBuilder2.copyOnWrite();
        aorb aorbVar = (aorb) aihfVarCreateBuilder2.instance;
        aorbVar.b |= 1;
        aorbVar.d = strC;
        aihfVarCreateBuilder.copyOnWrite();
        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.instance;
        aorb aorbVar2 = (aorb) aihfVarCreateBuilder2.build();
        aorbVar2.getClass();
        clientErrorOuterClass$ErrorMetaData.f = aorbVar2;
        clientErrorOuterClass$ErrorMetaData.b |= 8;
        aihf aihfVarCreateBuilder3 = ClientErrorOuterClass$LogMessage.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder3.instance;
        clientErrorOuterClass$LogMessage.d = ajtvVar.e;
        clientErrorOuterClass$LogMessage.b |= 2;
        aihfVarCreateBuilder3.copyOnWrite();
        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage2 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder3.instance;
        clientErrorOuterClass$LogMessage2.b |= 1;
        clientErrorOuterClass$LogMessage2.c = str;
        ajtx ajtxVar = (ajtx) ClientErrorOuterClass$ClientError.a.createBuilder();
        ajtxVar.copyOnWrite();
        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
        ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData2 = (ClientErrorOuterClass$ErrorMetaData) aihfVarCreateBuilder.build();
        clientErrorOuterClass$ErrorMetaData2.getClass();
        clientErrorOuterClass$ClientError.c = clientErrorOuterClass$ErrorMetaData2;
        clientErrorOuterClass$ClientError.b |= 1;
        ajtxVar.copyOnWrite();
        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError2 = (ClientErrorOuterClass$ClientError) ajtxVar.instance;
        ClientErrorOuterClass$LogMessage clientErrorOuterClass$LogMessage3 = (ClientErrorOuterClass$LogMessage) aihfVarCreateBuilder3.build();
        clientErrorOuterClass$LogMessage3.getClass();
        clientErrorOuterClass$ClientError2.e = clientErrorOuterClass$LogMessage3;
        clientErrorOuterClass$ClientError2.b |= 4;
        return ajtxVar;
    }

    public static alou cy(Throwable th, int i, ajtv ajtvVar, String str) {
        alos alosVar = (alos) alou.a.createBuilder();
        ajtx ajtxVarCx = cx(th, i, ajtvVar, str);
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        ClientErrorOuterClass$ClientError clientErrorOuterClass$ClientError = (ClientErrorOuterClass$ClientError) ajtxVarCx.build();
        clientErrorOuterClass$ClientError.getClass();
        alouVar.d = clientErrorOuterClass$ClientError;
        alouVar.c = 163;
        return (alou) alosVar.build();
    }

    public static float cz(float f) {
        return Math.min(1.0f, (float) Math.pow(10.0d, f / 20.0f));
    }

    public static boolean d(Exception exc) {
        return exc.getCause() != null && (exc.getCause() instanceof SocketTimeoutException);
    }

    public static void dA(Context context, View view) {
        int iC = twm.c(context.getResources().getDisplayMetrics(), 48);
        if (view == null || gQ(view, iC)) {
            return;
        }
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.addOnLayoutChangeListener(new aeab(view, iC, 1));
        } else {
            dB(view, iC);
        }
    }

    public static void dB(View view, int i) {
        if (gQ(view, i) || view.getParent() == null) {
            return;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (rect.width() < i) {
            int iWidth = ((i - rect.width()) + 1) / 2;
            rect.left -= iWidth;
            rect.right += iWidth;
        }
        if (rect.height() < i) {
            int iHeight = ((i - rect.height()) + 1) / 2;
            rect.top -= iHeight;
            rect.bottom += iHeight;
        }
        twa.a((View) view.getParent(), view, new TouchDelegate(rect, view));
    }

    public static boolean dC(amqm amqmVar) {
        return (amqmVar.d.size() == 0 || (((amqo) amqmVar.d.get(0)).b & 1) == 0) ? false : true;
    }

    public static int dD(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{android.R.attr.textColor});
        int color = typedArrayObtainStyledAttributes.getColor(0, -16777216);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static void dE(Context context, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i, boolean z) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        if (i != 0) {
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, i), length, charSequence.length() + length, (true != z ? 0 : 65536) | 33);
        }
    }

    public static void dF(SpannableStringBuilder spannableStringBuilder, float f) {
        char[] cArr = new char[1];
        Arrays.fill(cArr, 0, 1, ' ');
        spannableStringBuilder.append((CharSequence) new String(cArr));
        if (f != 0.0f) {
            dG(spannableStringBuilder, 1, new ScaleXSpan(f));
        }
    }

    public static void dG(SpannableStringBuilder spannableStringBuilder, int i, Object obj) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(obj, length - i, length, 33);
    }

    public static void dH(View view) {
        if (view.getVisibility() == 0 && view.getAlpha() == 1.0f) {
            return;
        }
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(200L).setInterpolator(aedd.a).setListener(null);
    }

    public static void dI(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(8);
        } else {
            view.animate().alpha(0.0f).setDuration(200L).setInterpolator(aedd.a).setListener(new xcw(view));
        }
    }

    public static alay dJ(ammr ammrVar, amms ammsVar) {
        if (ammrVar != null) {
            alay alayVar = ammrVar.d;
            return alayVar == null ? alay.a : alayVar;
        }
        if (ammsVar == null) {
            return null;
        }
        alay alayVar2 = ammsVar.d;
        return alayVar2 == null ? alay.a : alayVar2;
    }

    public static alay dK(ammr ammrVar, amms ammsVar) {
        if (ammrVar != null) {
            alay alayVar = ammrVar.e;
            return alayVar == null ? alay.a : alayVar;
        }
        if (ammsVar == null) {
            return null;
        }
        alay alayVar2 = ammsVar.e;
        return alayVar2 == null ? alay.a : alayVar2;
    }

    public static boolean dL(ammr ammrVar, amms ammsVar) {
        return (ammrVar == null && ammsVar == null) ? false : true;
    }

    public static Object dM(amow amowVar) {
        int i = amowVar.b;
        if (i == 117300536) {
            return (ampd) amowVar.c;
        }
        if (i == 129492606) {
            return (amoz) amowVar.c;
        }
        if (i == 165252689) {
            return (ampe) amowVar.c;
        }
        if (i == 130661514) {
            return (amox) amowVar.c;
        }
        if (i == 232396290) {
            return (amoy) amowVar.c;
        }
        if (i == 132496275) {
            return (ampq) amowVar.c;
        }
        if (i == 146966970) {
            return (amou) amowVar.c;
        }
        if (i == 146948953) {
            return (ampc) amowVar.c;
        }
        if (i == 133279312) {
            return (ampa) amowVar.c;
        }
        if (i == 197064214) {
            return (ampr) amowVar.c;
        }
        if (i == 251664483) {
            return (amov) amowVar.c;
        }
        if (i != 153515154) {
            return null;
        }
        return (akrn) amowVar.c;
    }

    public static String dN(Object obj) {
        apji apjiVar;
        if (obj instanceof ampd) {
            return ((ampd) obj).f;
        }
        if (obj instanceof amox) {
            return ((amox) obj).d;
        }
        if (obj instanceof amoy) {
            return ((amoy) obj).f;
        }
        if (obj instanceof ampq) {
            return ((ampq) obj).g;
        }
        if (obj instanceof ampr) {
            return ((ampr) obj).k;
        }
        if (obj instanceof amrc) {
            return ((amrc) obj).n;
        }
        if (obj instanceof amrd) {
            return ((amrd) obj).m;
        }
        if (obj instanceof amra) {
            return ((amra) obj).i;
        }
        if (obj instanceof amou) {
            amou amouVar = (amou) obj;
            if ((amouVar.b & 8) != 0) {
                apjiVar = amouVar.d;
                if (apjiVar == null) {
                    apjiVar = apji.a;
                }
            } else {
                apjiVar = null;
            }
            if (apjiVar != null) {
                return dN(aavv.r(apjiVar));
            }
        } else if (obj instanceof acxm) {
            akro akroVar = ((acxm) obj).a.c;
            if (akroVar == null) {
                akroVar = akro.a;
            }
            return akroVar.e;
        }
        return null;
    }

    public static String dO(amow amowVar) {
        return dP(dM(amowVar));
    }

    public static String dP(Object obj) {
        if (obj != null) {
            if (obj instanceof ampd) {
                ampd ampdVar = (ampd) obj;
                if ((ampdVar.b & 1) != 0) {
                    return ampdVar.c;
                }
            } else {
                if (obj instanceof amoz) {
                    return ((amoz) obj).c;
                }
                if (obj instanceof amox) {
                    return ((amox) obj).c;
                }
                if (obj instanceof amoy) {
                    return ((amoy) obj).e;
                }
                if (obj instanceof ampq) {
                    return ((ampq) obj).e;
                }
                if (obj instanceof amou) {
                    return ((amou) obj).c;
                }
                if (obj instanceof ampc) {
                    ampc ampcVar = (ampc) obj;
                    if ((ampcVar.b & 1) != 0) {
                        return ampcVar.c;
                    }
                } else {
                    if (obj instanceof ampe) {
                        return ((ampe) obj).e;
                    }
                    if (obj instanceof ampa) {
                        ampa ampaVar = (ampa) obj;
                        if ((ampaVar.b & 2) != 0) {
                            return ampaVar.d;
                        }
                    } else if (obj instanceof ampr) {
                        ampr amprVar = (ampr) obj;
                        if ((amprVar.b & 1) != 0) {
                            return amprVar.c;
                        }
                    } else {
                        if (obj instanceof amov) {
                            return ((amov) obj).c;
                        }
                        if (obj instanceof akrn) {
                            akro akroVar = ((akrn) obj).c;
                            if (akroVar == null) {
                                akroVar = akro.a;
                            }
                            return akroVar.d;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static boolean dQ(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apyi.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return true;
        }
        aihl aihlVar = akrx.a;
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        if (ajwoVar.j.n(aihlVarCheckIsLite2.d)) {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite3);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite3.d);
            CommandOuterClass$Command commandOuterClass$Command = (CommandOuterClass$Command) (objK == null ? aihlVarCheckIsLite3.b : aihlVarCheckIsLite3.c(objK));
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(asst.b);
            commandOuterClass$Command.c(aihlVarCheckIsLite4);
            if (commandOuterClass$Command.j.n(aihlVarCheckIsLite4.d)) {
                return true;
            }
            aihl aihlVarCheckIsLite5 = aihn.checkIsLite(asss.b);
            commandOuterClass$Command.c(aihlVarCheckIsLite5);
            if (commandOuterClass$Command.j.n(aihlVarCheckIsLite5.d)) {
                return true;
            }
        }
        return false;
    }

    public static aigj dR(anfv anfvVar) {
        int i = anfvVar.b;
        if (i == 66441108) {
            return ((anfw) anfvVar.c).g;
        }
        if (i == 66441155) {
            return ((anga) anfvVar.c).g;
        }
        if (i == 77262503) {
            return ((anfs) anfvVar.c).f;
        }
        if (i == 77258115) {
            return ((anft) anfvVar.c).f;
        }
        if (i == 78861357) {
            return ((angh) anfvVar.c).n;
        }
        return i == 253602307 ? ((aqwp) anfvVar.c).g : aigj.d;
    }

    public static ajwo dS(anfv anfvVar) {
        int i = anfvVar.b;
        if (i == 66441108) {
            anfw anfwVar = (anfw) anfvVar.c;
            if ((anfwVar.b & 32) != 0) {
                ajwo ajwoVar = anfwVar.f;
                return ajwoVar == null ? ajwo.a : ajwoVar;
            }
        } else if (i == 77262503) {
            anfs anfsVar = (anfs) anfvVar.c;
            if ((anfsVar.b & 4) != 0) {
                ajwo ajwoVar2 = anfsVar.e;
                return ajwoVar2 == null ? ajwo.a : ajwoVar2;
            }
        } else if (i == 253602307) {
            ajwo ajwoVar3 = ((aqwp) anfvVar.c).f;
            return ajwoVar3 == null ? ajwo.a : ajwoVar3;
        }
        return null;
    }

    public static ajwo dT(anfv anfvVar) {
        int i = anfvVar.b;
        if (i == 66441155) {
            anga angaVar = (anga) anfvVar.c;
            if ((angaVar.b & 64) != 0) {
                ajwo ajwoVar = angaVar.e;
                return ajwoVar == null ? ajwo.a : ajwoVar;
            }
        } else if (i == 77258115) {
            anft anftVar = (anft) anfvVar.c;
            if ((anftVar.b & 4) != 0) {
                ajwo ajwoVar2 = anftVar.e;
                return ajwoVar2 == null ? ajwo.a : ajwoVar2;
            }
        } else if (i == 78861357) {
            angh anghVar = (angh) anfvVar.c;
            if (anghVar.m) {
                if ((anghVar.b & SemanticState.LiveRegion) != 0) {
                    ajwo ajwoVar3 = anghVar.l;
                    return ajwoVar3 == null ? ajwo.a : ajwoVar3;
                }
            } else if ((anghVar.b & 16) != 0) {
                ajwo ajwoVar4 = anghVar.g;
                return ajwoVar4 == null ? ajwo.a : ajwoVar4;
            }
        }
        return null;
    }

    public static alja dU(anfv anfvVar) {
        int i = anfvVar.b;
        if (i == 66441108) {
            alja aljaVar = ((anfw) anfvVar.c).d;
            return aljaVar == null ? alja.a : aljaVar;
        }
        if (i == 66441155) {
            alja aljaVar2 = ((anga) anfvVar.c).d;
            return aljaVar2 == null ? alja.a : aljaVar2;
        }
        if (i == 77262503) {
            alja aljaVar3 = ((anfs) anfvVar.c).d;
            return aljaVar3 == null ? alja.a : aljaVar3;
        }
        if (i == 77258115) {
            alja aljaVar4 = ((anft) anfvVar.c).d;
            return aljaVar4 == null ? alja.a : aljaVar4;
        }
        if (i != 78861357) {
            if ((i == 253602307 ? (aqwp) anfvVar.c : aqwp.a).c != 2) {
                return null;
            }
            aqwp aqwpVar = anfvVar.b == 253602307 ? (aqwp) anfvVar.c : aqwp.a;
            return aqwpVar.c == 2 ? (alja) aqwpVar.d : alja.a;
        }
        angh anghVar = (angh) anfvVar.c;
        if (anghVar.m) {
            alja aljaVar5 = anghVar.k;
            return aljaVar5 == null ? alja.a : aljaVar5;
        }
        alja aljaVar6 = anghVar.f;
        return aljaVar6 == null ? alja.a : aljaVar6;
    }

    public static CharSequence dV(anfv anfvVar) {
        alay alayVar;
        alay alayVar2;
        alay alayVar3;
        alay alayVar4;
        alay alayVar5;
        alay alayVar6;
        alay alayVar7;
        alay alayVar8;
        int i = anfvVar.b;
        if (i == 66441108) {
            anfw anfwVar = (anfw) anfvVar.c;
            if ((anfwVar.b & 1) != 0) {
                alayVar8 = anfwVar.c;
                if (alayVar8 == null) {
                    alayVar8 = alay.a;
                }
            } else {
                alayVar8 = null;
            }
            return ackj.k(null, alayVar8, null, false);
        }
        if (i == 66441155) {
            anga angaVar = (anga) anfvVar.c;
            if ((angaVar.b & 1) != 0) {
                alayVar7 = angaVar.c;
                if (alayVar7 == null) {
                    alayVar7 = alay.a;
                }
            } else {
                alayVar7 = null;
            }
            return ackj.k(null, alayVar7, null, false);
        }
        if (i == 77262503) {
            anfs anfsVar = (anfs) anfvVar.c;
            if ((anfsVar.b & 1) != 0) {
                alayVar6 = anfsVar.c;
                if (alayVar6 == null) {
                    alayVar6 = alay.a;
                }
            } else {
                alayVar6 = null;
            }
            return ackj.k(null, alayVar6, null, false);
        }
        if (i == 77258115) {
            anft anftVar = (anft) anfvVar.c;
            if ((anftVar.b & 1) != 0) {
                alayVar5 = anftVar.c;
                if (alayVar5 == null) {
                    alayVar5 = alay.a;
                }
            } else {
                alayVar5 = null;
            }
            return ackj.k(null, alayVar5, null, false);
        }
        if (i == 78861357) {
            angh anghVar = (angh) anfvVar.c;
            if (anghVar.m) {
                if ((anghVar.b & 32) != 0) {
                    alayVar4 = anghVar.h;
                    if (alayVar4 == null) {
                        alayVar4 = alay.a;
                    }
                } else {
                    alayVar4 = null;
                }
                return ackj.k(null, alayVar4, null, false);
            }
            if ((anghVar.b & 1) != 0) {
                alayVar3 = anghVar.c;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
            } else {
                alayVar3 = null;
            }
            return ackj.k(null, alayVar3, null, false);
        }
        if (i == 253602307) {
            aqwp aqwpVar = (aqwp) anfvVar.c;
            if ((aqwpVar.b & 2) != 0) {
                alayVar2 = aqwpVar.e;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            return ackj.k(null, alayVar2, null, false);
        }
        if (i != 245169829) {
            return null;
        }
        angc angcVar = (angc) anfvVar.c;
        if ((angcVar.b & 1) != 0) {
            alayVar = angcVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        return ackj.k(null, alayVar, null, false);
    }

    public static int dW(anfv anfvVar) {
        int iAU;
        int i = anfvVar.b;
        if (i == 66441108) {
            int iAU2 = a.aU(((anfw) anfvVar.c).j);
            if (iAU2 != 0) {
                return iAU2;
            }
        } else if (i == 66441155 && (iAU = a.aU(((anga) anfvVar.c).j)) != 0) {
            return iAU;
        }
        return 1;
    }

    public static void dX(aihf aihfVar, ajwo ajwoVar) {
        anfv anfvVar = (anfv) aihfVar.instance;
        int i = anfvVar.b;
        if (i == 66441155) {
            aihf builder = ((anga) anfvVar.c).toBuilder();
            builder.copyOnWrite();
            anga angaVar = (anga) builder.instance;
            ajwoVar.getClass();
            angaVar.e = ajwoVar;
            angaVar.b |= 64;
            aihfVar.copyOnWrite();
            anfv anfvVar2 = (anfv) aihfVar.instance;
            anga angaVar2 = (anga) builder.build();
            angaVar2.getClass();
            anfvVar2.c = angaVar2;
            anfvVar2.b = 66441155;
            return;
        }
        if (i == 77258115) {
            aihf builder2 = ((anft) anfvVar.c).toBuilder();
            builder2.copyOnWrite();
            anft anftVar = (anft) builder2.instance;
            ajwoVar.getClass();
            anftVar.e = ajwoVar;
            anftVar.b |= 4;
            aihfVar.copyOnWrite();
            anfv anfvVar3 = (anfv) aihfVar.instance;
            anft anftVar2 = (anft) builder2.build();
            anftVar2.getClass();
            anfvVar3.c = anftVar2;
            anfvVar3.b = 77258115;
            return;
        }
        if (i == 78861357) {
            angh anghVar = angh.a;
            aihf aihfVarCreateBuilder = anghVar.createBuilder();
            anfv anfvVar4 = (anfv) aihfVar.instance;
            if (anfvVar4.b == 78861357) {
                anghVar = (angh) anfvVar4.c;
            }
            if (anghVar.m) {
                aihfVarCreateBuilder.copyOnWrite();
                angh anghVar2 = (angh) aihfVarCreateBuilder.instance;
                ajwoVar.getClass();
                anghVar2.l = ajwoVar;
                anghVar2.b |= SemanticState.LiveRegion;
            } else {
                aihfVarCreateBuilder.copyOnWrite();
                angh anghVar3 = (angh) aihfVarCreateBuilder.instance;
                ajwoVar.getClass();
                anghVar3.g = ajwoVar;
                anghVar3.b |= 16;
            }
            aihfVar.copyOnWrite();
            anfv anfvVar5 = (anfv) aihfVar.instance;
            angh anghVar4 = (angh) aihfVarCreateBuilder.build();
            anghVar4.getClass();
            anfvVar5.c = anghVar4;
            anfvVar5.b = 78861357;
        }
    }

    public static void dY(aihf aihfVar, alay alayVar) {
        anfv anfvVar = (anfv) aihfVar.instance;
        int i = anfvVar.b;
        if (i == 66441108) {
            aihf builder = ((anfw) anfvVar.c).toBuilder();
            builder.copyOnWrite();
            anfw anfwVar = (anfw) builder.instance;
            alayVar.getClass();
            anfwVar.c = alayVar;
            anfwVar.b |= 1;
            aihfVar.copyOnWrite();
            anfv anfvVar2 = (anfv) aihfVar.instance;
            anfw anfwVar2 = (anfw) builder.build();
            anfwVar2.getClass();
            anfvVar2.c = anfwVar2;
            anfvVar2.b = 66441108;
            return;
        }
        if (i == 66441155) {
            aihf builder2 = ((anga) anfvVar.c).toBuilder();
            builder2.copyOnWrite();
            anga angaVar = (anga) builder2.instance;
            alayVar.getClass();
            angaVar.c = alayVar;
            angaVar.b |= 1;
            aihfVar.copyOnWrite();
            anfv anfvVar3 = (anfv) aihfVar.instance;
            anga angaVar2 = (anga) builder2.build();
            angaVar2.getClass();
            anfvVar3.c = angaVar2;
            anfvVar3.b = 66441155;
            return;
        }
        if (i == 77262503) {
            aihf builder3 = ((anfs) anfvVar.c).toBuilder();
            builder3.copyOnWrite();
            anfs anfsVar = (anfs) builder3.instance;
            alayVar.getClass();
            anfsVar.c = alayVar;
            anfsVar.b |= 1;
            aihfVar.copyOnWrite();
            anfv anfvVar4 = (anfv) aihfVar.instance;
            anfs anfsVar2 = (anfs) builder3.build();
            anfsVar2.getClass();
            anfvVar4.c = anfsVar2;
            anfvVar4.b = 77262503;
            return;
        }
        if (i == 77258115) {
            aihf builder4 = ((anft) anfvVar.c).toBuilder();
            builder4.copyOnWrite();
            anft anftVar = (anft) builder4.instance;
            alayVar.getClass();
            anftVar.c = alayVar;
            anftVar.b |= 1;
            aihfVar.copyOnWrite();
            anfv anfvVar5 = (anfv) aihfVar.instance;
            anft anftVar2 = (anft) builder4.build();
            anftVar2.getClass();
            anfvVar5.c = anftVar2;
            anfvVar5.b = 77258115;
            return;
        }
        if (i == 78861357) {
            angh anghVar = angh.a;
            aihf aihfVarCreateBuilder = anghVar.createBuilder();
            anfv anfvVar6 = (anfv) aihfVar.instance;
            if (anfvVar6.b == 78861357) {
                anghVar = (angh) anfvVar6.c;
            }
            if (anghVar.m) {
                aihfVarCreateBuilder.copyOnWrite();
                angh anghVar2 = (angh) aihfVarCreateBuilder.instance;
                alayVar.getClass();
                anghVar2.h = alayVar;
                anghVar2.b |= 32;
            } else {
                aihfVarCreateBuilder.copyOnWrite();
                angh anghVar3 = (angh) aihfVarCreateBuilder.instance;
                alayVar.getClass();
                anghVar3.c = alayVar;
                anghVar3.b |= 1;
            }
            aihfVar.copyOnWrite();
            anfv anfvVar7 = (anfv) aihfVar.instance;
            angh anghVar4 = (angh) aihfVarCreateBuilder.build();
            anghVar4.getClass();
            anfvVar7.c = anghVar4;
            anfvVar7.b = 78861357;
        }
    }

    public static void dZ(anfv anfvVar) {
        int i = anfvVar.b;
        if (i == 78861357) {
            if (((i == 78861357 ? (angh) anfvVar.c : angh.a).b & 131072) != 0) {
                String str = (anfvVar.b == 78861357 ? (angh) anfvVar.c : angh.a).o;
            }
        }
    }

    public static int da(double d) {
        return (int) ((d / 100.0d) * 256.0d);
    }

    public static Drawable db(Context context, Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        drawable.setTint(tzk.i(context, R.attr.ytTextPrimary));
        return drawable;
    }

    public static void dc(Context context, Intent intent) {
        try {
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                afwl.m(context, intent);
            }
        } catch (ActivityNotFoundException | SecurityException unused) {
        }
    }

    public static void dd(Context context, Drawable drawable) {
        drawable.setTint(tzk.i(context, R.attr.ytIconInactive));
    }

    public static Intent de(Context context, boolean z) {
        TypedValue typedValue = new TypedValue();
        Intent intentDf = df(context, !context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) || typedValue.data == 0, z);
        intentDf.putExtra("useTvCode", 1);
        return intentDf;
    }

    public static Intent df(Context context, boolean z, boolean z2) {
        Intent className = new Intent().setClassName(context, "com.google.android.libraries.youtube.mdx.manualpairing.PairWithTvActivity");
        className.putExtra("com.google.android.libraries.youtube.mdx.manualpairing.darkTheme", z);
        className.putExtra("com.google.android.libraries.youtube.mdx.manualpairing.darkerColorPalette", z2);
        return className;
    }

    public static /* synthetic */ xni dg(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (xni) aihnVarBuild;
    }

    public static void dh(amyt amytVar, aihf aihfVar) {
        amytVar.getClass();
        aihfVar.copyOnWrite();
        xni xniVar = (xni) aihfVar.instance;
        xni xniVar2 = xni.a;
        xniVar.c = amytVar.e;
        xniVar.b |= 1;
    }

    public static void di(Context context, Class cls, int i, Bundle bundle) {
        if (context != null) {
            Intent intent = new Intent(context, (Class<?>) cls);
            intent.addFlags(536870912);
            intent.addFlags(67108864);
            intent.putExtra("com.google.android.libraries.youtube.mdx.common.newIndex", i);
            intent.putExtra("com.google.android.libraries.youtube.mdx.common.data", bundle);
            context.startActivity(intent);
        }
    }

    public static xkq dj(vxu vxuVar, awmd awmdVar) {
        try {
            System.loadLibrary("logsampler");
            return new LogSamplerImpl(vxuVar, (xeu) awmdVar.io());
        } catch (UnsatisfiedLinkError e) {
            twu.c(5, "Failed to load logsampler native library", e);
            return xkr.a;
        }
    }

    public static zrx dk(zrw zrwVar) {
        zrwVar.getClass();
        return new xko(zrwVar.f());
    }

    public static amdd dl(ajwo ajwoVar, aihl aihlVar) {
        if (ajwoVar != null) {
            ajwp ajwpVar = ajwoVar.e;
            if (ajwpVar == null) {
                ajwpVar = ajwp.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
            ajwpVar.c(aihlVarCheckIsLite);
            if (ajwpVar.j.n(aihlVarCheckIsLite.d)) {
                ajwp ajwpVar2 = ajwoVar.e;
                if (ajwpVar2 == null) {
                    ajwpVar2 = ajwp.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
                ajwpVar2.c(aihlVarCheckIsLite2);
                Object objK = ajwpVar2.j.k(aihlVarCheckIsLite2.d);
                return (amdd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        return null;
    }

    public static void dm() {
        throw new UnsupportedOperationException();
    }

    public static void dn(xfq xfqVar, ajij ajijVar) {
        xfqVar.L(xfqVar.E(ajijVar));
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static void m947do(xfq xfqVar, ajij ajijVar) {
        xfqVar.M(xfqVar.E(ajijVar));
    }

    public static void dp(xfq xfqVar, ajij ajijVar) {
        xfqVar.N(xfqVar.E(ajijVar));
    }

    public static void dq(xfq xfqVar, ajij ajijVar) {
        xfqVar.O(xfqVar.E(ajijVar));
    }

    public static void dr(xfq xfqVar, xhc xhcVar, xgu xguVar, ajwo ajwoVar, amdd amddVar, amdd amddVar2, ajij ajijVar) {
        xfqVar.R(xhcVar.a, xguVar, ajwoVar, amddVar, amddVar2, xfqVar.E(ajijVar));
    }

    public static void ds(xfq xfqVar, xhc xhcVar, xgu xguVar, argn argnVar, String str, String str2, amdd amddVar, amdd amddVar2, ajij ajijVar) {
        xfqVar.S(xhcVar.a, xguVar, argnVar, str, str2, amddVar, amddVar2, xfqVar.E(ajijVar));
    }

    public static void dt(xev xevVar, xic xicVar, xdz xdzVar, alox aloxVar, zwa zwaVar) {
        aiie<aloy> aiieVar = aloxVar.c;
        if (aiieVar != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (aloy aloyVar : aiieVar) {
                if (aloyVar != null) {
                    akwf akwfVar = aloyVar.b;
                    if (akwfVar == null) {
                        akwfVar = akwf.a;
                    }
                    if (!akwfVar.d) {
                        long epochMilli = aloyVar.c <= 0 ? Long.MAX_VALUE : xevVar.b.f().toEpochMilli() + TimeUnit.MINUTES.toMillis(aloyVar.c);
                        akwf akwfVar2 = aloyVar.b;
                        if (akwfVar2 == null) {
                            akwfVar2 = akwf.a;
                        }
                        alot alotVarA = alot.a(akwfVar2.c);
                        if (alotVarA != null) {
                            concurrentHashMap.put(alotVarA, Long.valueOf(epochMilli));
                        }
                    }
                }
            }
            xevVar.g = concurrentHashMap;
        }
        xicVar.c.execute(afwl.i(new wtg(xicVar, aloxVar.c, 20)));
        xdzVar.b(aloxVar.d, zwaVar.k());
    }

    public static amer du(amej amejVar) {
        apji apjiVar = amejVar.d;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amer.b);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return (amer) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
    }

    public static Optional dv(amej amejVar) {
        if ((amejVar.c & 2) == 0) {
            return Optional.empty();
        }
        apji apjiVar = amejVar.e;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(amer.b);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        return Optional.of((amer) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK)));
    }

    public static String dw(amer amerVar) {
        amep amepVar = amerVar.f;
        if (amepVar == null) {
            amepVar = amep.a;
        }
        return dx(amepVar) ? "_queue_id_above_chat_placement" : amerVar.i;
    }

    public static boolean dx(amep amepVar) {
        int iAV;
        int iAV2;
        int iAV3;
        int i = amepVar.b;
        if (i == 6) {
            return (i == 6 && (iAV3 = a.aV(((Integer) amepVar.c).intValue())) != 0 && iAV3 == 2) || (amepVar.b == 6 && (iAV2 = a.aV(((Integer) amepVar.c).intValue())) != 0 && iAV2 == 4) || (amepVar.b == 6 && (iAV = a.aV(((Integer) amepVar.c).intValue())) != 0 && iAV == 3);
        }
        return false;
    }

    public static void dy(amen amenVar) {
        int i = xcz.a[amenVar.ordinal()];
    }

    public static void dz(Window window, mbc mbcVar, tun tunVar) {
        if (window == null || (window.getCallback() instanceof xcy)) {
            return;
        }
        window.setCallback(new xcy(window.getCallback(), mbcVar, tunVar));
    }

    public static String e(Uri uri) {
        List listH;
        String queryParameter = uri.getQueryParameter("mn");
        if (TextUtils.isEmpty(queryParameter) || (listH = agfm.b(',').h(queryParameter)) == null || listH.size() <= 1) {
            return null;
        }
        return (String) listH.get(1);
    }

    public static void eA(vxe vxeVar, List list, Map map) {
        if (vxeVar == null || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajwo ajwoVar = (ajwo) it.next();
            if (ajwoVar != null) {
                vxeVar.c(ajwoVar, map);
            }
        }
    }

    public static void eB(vxe vxeVar, ajwo ajwoVar) {
        vxeVar.c(ajwoVar, agpn.b);
    }

    public static void eC(vxe vxeVar, List list) {
        vxeVar.d(list, agpn.b);
    }

    @Deprecated
    public static void eD(vxe vxeVar, List list, Map map) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vxeVar.c((ajwo) it.next(), map);
        }
    }

    @Deprecated
    public static void eE(vxe vxeVar, List list, Object obj) {
        vxeVar.d(list, obj != null ? agkj.j("com.google.android.libraries.youtube.innertube.endpoint.tag", obj) : agpn.b);
    }

    public static void eF(omr omrVar, String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            Character chValueOf = Character.valueOf(cCharAt);
            chValueOf.getClass();
            if (cCharAt != '_') {
                switch (cCharAt) {
                    case '0':
                        omrVar.i("0");
                        break;
                    case '1':
                        omrVar.i("1");
                        break;
                    case '2':
                        omrVar.i("2");
                        break;
                    case '3':
                        omrVar.i("3");
                        break;
                    case '4':
                        omrVar.i("4");
                        break;
                    case '5':
                        omrVar.i("5");
                        break;
                    case '6':
                        omrVar.i("6");
                        break;
                    case '7':
                        omrVar.i("7");
                        break;
                    case '8':
                        omrVar.i("8");
                        break;
                    case '9':
                        omrVar.i("9");
                        break;
                    default:
                        switch (cCharAt) {
                            case 'A':
                                omrVar.i("A");
                                break;
                            case 'B':
                                omrVar.i("B");
                                break;
                            case 'C':
                                omrVar.i("C");
                                break;
                            case 'D':
                                omrVar.i("D");
                                break;
                            case 'E':
                                omrVar.i("E");
                                break;
                            case 'F':
                                omrVar.i("F");
                                break;
                            case 'G':
                                omrVar.i("G");
                                break;
                            case 'H':
                                omrVar.i("H");
                                break;
                            case 'I':
                                omrVar.i("I");
                                break;
                            case 'J':
                                omrVar.i("J");
                                break;
                            case 'K':
                                omrVar.i("K");
                                break;
                            case 'L':
                                omrVar.i("L");
                                break;
                            case 'M':
                                omrVar.i("M");
                                break;
                            case 'N':
                                omrVar.i("N");
                                break;
                            case 'O':
                                omrVar.i("O");
                                break;
                            case 'P':
                                omrVar.i("P");
                                break;
                            case 'Q':
                                omrVar.i("Q");
                                break;
                            case 'R':
                                omrVar.i("R");
                                break;
                            case 'S':
                                omrVar.i("S");
                                break;
                            case 'T':
                                omrVar.i("T");
                                break;
                            case 'U':
                                omrVar.i("U");
                                break;
                            case 'V':
                                omrVar.i("V");
                                break;
                            case 'W':
                                omrVar.i("W");
                                break;
                            case 'X':
                                omrVar.i("X");
                                break;
                            case 'Y':
                                omrVar.i("Y");
                                break;
                            case 'Z':
                                omrVar.i("Z");
                                break;
                            default:
                                switch (cCharAt) {
                                    case 'a':
                                        omrVar.i("a");
                                        break;
                                    case 'b':
                                        omrVar.i("b");
                                        break;
                                    case 'c':
                                        omrVar.i("c");
                                        break;
                                    case 'd':
                                        omrVar.i("d");
                                        break;
                                    case 'e':
                                        omrVar.i("e");
                                        break;
                                    case 'f':
                                        omrVar.i("f");
                                        break;
                                    case 'g':
                                        omrVar.i("g");
                                        break;
                                    case 'h':
                                        omrVar.i("h");
                                        break;
                                    case 'i':
                                        omrVar.i("i");
                                        break;
                                    case 'j':
                                        omrVar.i("j");
                                        break;
                                    case 'k':
                                        omrVar.i("k");
                                        break;
                                    case 'l':
                                        omrVar.i("l");
                                        break;
                                    case 'm':
                                        omrVar.i("m");
                                        break;
                                    case 'n':
                                        omrVar.i("n");
                                        break;
                                    case 'o':
                                        omrVar.i("o");
                                        break;
                                    case 'p':
                                        omrVar.i("p");
                                        break;
                                    case 'q':
                                        omrVar.i("q");
                                        break;
                                    case 'r':
                                        omrVar.i("r");
                                        break;
                                    case 's':
                                        omrVar.i("s");
                                        break;
                                    case 't':
                                        omrVar.i("t");
                                        break;
                                    case 'u':
                                        omrVar.i("u");
                                        break;
                                    case 'v':
                                        omrVar.i("v");
                                        break;
                                    case 'w':
                                        omrVar.i("w");
                                        break;
                                    case 'x':
                                        omrVar.i("x");
                                        break;
                                    case 'y':
                                        omrVar.i("y");
                                        break;
                                    case 'z':
                                        omrVar.i("z");
                                        break;
                                    default:
                                        throw new IllegalStateException("Unhandled table name char:".concat(chValueOf.toString()));
                                }
                                break;
                        }
                        break;
                }
            } else {
                omrVar.i("_");
            }
        }
    }

    public static boolean eG(vwx vwxVar, ajwo ajwoVar) {
        return (ajwoVar == null || vwxVar.f(ajwoVar) == vxc.j) ? false : true;
    }

    public static asdw eH(weh wehVar) {
        aihf aihfVarCreateBuilder = asdw.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        aigj aigjVarV = aigj.v(wehVar.c());
        aigjVarV.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        asdw asdwVar = (asdw) aihfVarCreateBuilder.instance;
        asdwVar.b |= 1;
        asdwVar.c = aigjVarV;
        aihn aihnVarBuild = aihfVarCreateBuilder.build();
        aihnVarBuild.getClass();
        return (asdw) aihnVarBuild;
    }

    public static tyt eI(String str) {
        return new tyt(Uri.parse("?".concat(String.valueOf(str))));
    }

    public static Optional eJ(Throwable th) {
        return ((th instanceof tni) && (th.getCause() instanceof NetworkException)) ? Optional.ofNullable((NetworkException) th.getCause()) : Optional.empty();
    }

    public static String eK(String str) {
        tyt tytVar = new tyt(Uri.parse("?".concat(String.valueOf(str))));
        if (!eN(tytVar, "c5b")) {
            return "";
        }
        String strB = tytVar.b("c5b");
        strB.getClass();
        return strB;
    }

    public static void eL(String str) {
        zvp.a(zvn.b, zvm.m, str);
    }

    public static boolean eM(String str) {
        tyt tytVarEI = eI(str);
        if (eN(tytVarEI, "c5a")) {
            String strB = tytVarEI.b("c5a");
            strB.getClass();
            if (strB.equals("1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean eN(tyt tytVar, String str) {
        return tytVar.b(str) != null;
    }

    public static akuh eO(akrn akrnVar) {
        aihf aihfVarCreateBuilder = akuh.a.createBuilder();
        aihf aihfVarCreateBuilder2 = apoq.a.createBuilder();
        aihf aihfVarCreateBuilder3 = apox.a.createBuilder();
        aihh aihhVar = (aihh) amgg.a.createBuilder();
        aihf aihfVarCreateBuilder4 = amgj.a.createBuilder();
        aihfVarCreateBuilder4.copyOnWrite();
        amgj amgjVar = (amgj) aihfVarCreateBuilder4.instance;
        amgjVar.dP = akrnVar;
        amgjVar.i |= SemanticState.LiveRegion;
        aihhVar.copyOnWrite();
        amgg amggVar = (amgg) aihhVar.instance;
        amgj amgjVar2 = (amgj) aihfVarCreateBuilder4.build();
        amgjVar2.getClass();
        amggVar.d();
        amggVar.e.add(amgjVar2);
        aihfVarCreateBuilder3.copyOnWrite();
        apox apoxVar = (apox) aihfVarCreateBuilder3.instance;
        amgg amggVar2 = (amgg) aihhVar.build();
        amggVar2.getClass();
        apoxVar.m = amggVar2;
        apoxVar.b |= 32;
        aihfVarCreateBuilder2.ck(aihfVarCreateBuilder3);
        aihn aihnVarBuild = aihfVarCreateBuilder2.build();
        aihnVarBuild.getClass();
        aihfVarCreateBuilder.copyOnWrite();
        akuh akuhVar = (akuh) aihfVarCreateBuilder.instance;
        akuhVar.c = (apoq) aihnVarBuild;
        akuhVar.b = 49399797;
        aihn aihnVarBuild2 = aihfVarCreateBuilder.build();
        aihnVarBuild2.getClass();
        return (akuh) aihnVarBuild2;
    }

    public static String eP(apxs apxsVar) {
        if ((apxsVar.c & 2) != 0) {
            return apxsVar.g;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, vsq] */
    public static Optional eQ(ajwo ajwoVar, vor vorVar, vsq vsqVar, vnz vnzVar, String str, boolean z) {
        Optional optionalOfNullable;
        String strK = vorVar.k();
        if (ahno.aa(strK) || ahno.aa(str)) {
            if (vorVar.u.l(10, 45619755L, false) && vorVar.e.a() == null) {
                vorVar.z("InteractionLoggingScreen is null.");
            }
            optionalOfNullable = Optional.ofNullable(vorVar.f(vorVar.e.f(vor.j(ajwoVar)), vnzVar, true, false));
        } else {
            optionalOfNullable = Objects.equals(str, strK) ? Optional.ofNullable(vorVar.e(ajwoVar, vnzVar)) : Optional.empty();
        }
        urh urhVar = new urh(vsqVar, 19);
        if (true == optionalOfNullable.isPresent()) {
            urhVar.a.a();
        }
        return optionalOfNullable;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ boolean eR(int i, int[] iArr, boolean[] zArr, int i2, String str) {
        int i3;
        if (!zArr[i2]) {
            try {
                switch (str.hashCode()) {
                    case -1533557510:
                        if (str.equals("ENGAGEMENT_PANEL_BACKGROUND_STYLE_DARK")) {
                            i3 = 4;
                            iArr[i2] = i3;
                            zArr[i2] = true;
                            break;
                        }
                        throw new IllegalArgumentException();
                    case -1090951326:
                        if (str.equals("ENGAGEMENT_PANEL_BACKGROUND_STYLE_CUSTOM_TRANSPARENCY")) {
                            i3 = 6;
                            iArr[i2] = i3;
                            zArr[i2] = true;
                            break;
                        }
                        throw new IllegalArgumentException();
                    case -1043328514:
                        if (str.equals("ENGAGEMENT_PANEL_BACKGROUND_STYLE_CUSTOM_TRANSPARENCY_LANDSCAPE")) {
                            i3 = 7;
                            iArr[i2] = i3;
                            zArr[i2] = true;
                            break;
                        }
                        throw new IllegalArgumentException();
                    case -890845933:
                        if (str.equals("ENGAGEMENT_PANEL_BACKGROUND_STYLE_UNSPECIFIED")) {
                            i3 = 1;
                            iArr[i2] = i3;
                            zArr[i2] = true;
                            break;
                        }
                        throw new IllegalArgumentException();
                    case -541432291:
                        if (str.equals("ENGAGEMENT_PANEL_BACKGROUND_STYLE_DEFAULT")) {
                            i3 = 2;
                            iArr[i2] = i3;
                            zArr[i2] = true;
                            break;
                        }
                        throw new IllegalArgumentException();
                    case -174434692:
                        if (str.equals("ENGAGEMENT_PANEL_BACKGROUND_STYLE_RAISED")) {
                            i3 = 3;
                            iArr[i2] = i3;
                            zArr[i2] = true;
                            break;
                        }
                        throw new IllegalArgumentException();
                    case 238529126:
                        if (str.equals("ENGAGEMENT_PANEL_BACKGROUND_STYLE_USING_ENTITY_COLOR")) {
                            i3 = 5;
                            iArr[i2] = i3;
                            zArr[i2] = true;
                            break;
                        }
                        throw new IllegalArgumentException();
                    default:
                        throw new IllegalArgumentException();
                }
            } catch (Throwable unused) {
            }
        }
        return iArr != null && i == iArr[i2];
    }

    public static void eS(vmn vmnVar, Canvas canvas, String str, int i, Optional optional, float f) {
        if (i < 0 || i >= str.length() || f <= (-vmnVar.c)) {
            return;
        }
        vmnVar.a(i % 10);
        optional.isPresent();
        canvas.drawText(str, i, i + 1, ((Float) optional.orElse(Float.valueOf(0.0f))).floatValue(), f, (Paint) vmnVar.a);
    }

    public static float eT(fhd fhdVar, float f) {
        return rpi.p(TypedValue.applyDimension(2, f, fhdVar.a.getResources().getDisplayMetrics()));
    }

    public static Optional eU(vmn vmnVar, String str, vmd vmdVar) {
        float f = vmnVar.c;
        float[] fArr = vmnVar.b.a;
        float fMax = Math.max(f, 1.0f);
        float f2 = fArr[1];
        float fMeasureText = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            fMeasureText = Character.isDigit(str.charAt(i)) ? fMeasureText + f2 : fMeasureText + vmnVar.a.measureText(str.toCharArray(), i, 1);
        }
        float fMax2 = Math.max(fMeasureText, 1.0f);
        if (vmdVar != null) {
            fMax2 = Math.max(fMax2, vmdVar.a);
            fMax = Math.max(fMax, vmdVar.b);
        }
        return (vmdVar == null || ((float) vmdVar.a) < fMax2 || ((float) vmdVar.b) < fMax) ? Optional.of(vmd.b((int) Math.ceil(fMax2), (int) Math.ceil(fMax))) : Optional.empty();
    }

    public static int eV(afuy afuyVar, aguu aguuVar) {
        afuv afuvVarJ = afuy.j(aguuVar, afuyVar);
        if (!afuvVarJ.b()) {
            return 0;
        }
        Object objA = afuvVarJ.a();
        objA.getClass();
        return ((Number) objA).intValue();
    }

    public static void eW(int i, dov dovVar) {
        eX(i, dovVar, Optional.empty());
    }

    public static void eX(int i, dov dovVar, Optional optional) {
        aihf aihfVarCreateBuilder = alda.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alda aldaVar = (alda) aihfVarCreateBuilder.instance;
        aldaVar.c = i - 1;
        aldaVar.b |= 1;
        int errorCode = optional.isPresent() ? ((NetworkException) optional.get()).getErrorCode() : 0;
        aihfVarCreateBuilder.copyOnWrite();
        alda aldaVar2 = (alda) aihfVarCreateBuilder.instance;
        aldaVar2.b |= 2;
        aldaVar2.d = errorCode;
        int cronetInternalErrorCode = optional.isPresent() ? ((NetworkException) optional.get()).getCronetInternalErrorCode() : 0;
        aihfVarCreateBuilder.copyOnWrite();
        alda aldaVar3 = (alda) aihfVarCreateBuilder.instance;
        aldaVar3.b |= 4;
        aldaVar3.e = cronetInternalErrorCode;
        alda aldaVar4 = (alda) aihfVarCreateBuilder.build();
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aldaVar4.getClass();
        alouVar.d = aldaVar4;
        alouVar.c = 312;
        dovVar.R((alou) alosVar.build());
    }

    public static adox eY(aplq aplqVar) {
        int i = aplqVar.b;
        int i2 = 6;
        if (i != 0) {
            if (i == 2) {
                i2 = 1;
            } else if (i == 3) {
                i2 = 2;
            } else if (i == 4) {
                i2 = 3;
            } else if (i != 5) {
                i2 = i != 6 ? 0 : 5;
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            return new adov((float) (i == 2 ? ((Double) aplqVar.c).doubleValue() : 0.0d));
        }
        if (i3 == 1) {
            String str = i == 3 ? (String) aplqVar.c : "";
            str.getClass();
            return new adow(str);
        }
        if (i3 == 2) {
            return new ados(i == 4 ? ((Boolean) aplqVar.c).booleanValue() : false);
        }
        if (i3 == 3) {
            return new adot(i == 5 ? ((Integer) aplqVar.c).intValue() : 0);
        }
        return null;
    }

    public static String eZ(String str, String str2) {
        if (str.length() != 0) {
            return str2.length() != 0 ? a.cl(str2, (byte) 47, str) : str;
        }
        return str2;
    }

    public static amlg ea(aihh aihhVar) {
        aihl aihlVar = amkr.b;
        if (!aihhVar.c(aihlVar) || !((Boolean) aihhVar.b(aihlVar)).booleanValue()) {
            aihl aihlVar2 = amkr.c;
            amlg amlgVarA = amlg.a(((amks) aihhVar.instance).d);
            if (amlgVarA == null) {
                amlgVarA = amlg.LIKE;
            }
            aihhVar.e(aihlVar2, amlgVarA);
            aihhVar.e(aihlVar, Boolean.TRUE);
        }
        return (amlg) aihhVar.b(amkr.c);
    }

    public static Optional eb(amlg amlgVar, aihh aihhVar) {
        for (ajwo ajwoVar : DesugarCollections.unmodifiableList(((amks) aihhVar.instance).g)) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(amla.b);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                amlg amlgVarA = amlg.a(((amla) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).f);
                if (amlgVarA == null) {
                    amlgVarA = amlg.LIKE;
                }
                if (amlgVarA.equals(amlgVar)) {
                    return Optional.of(ajwoVar);
                }
            }
        }
        return Optional.empty();
    }

    public static void ec(aihh aihhVar, amlg amlgVar) {
        aihl aihlVar = amkr.b;
        if (!aihhVar.c(aihlVar) || !((Boolean) aihhVar.b(aihlVar)).booleanValue()) {
            aihhVar.e(aihlVar, Boolean.TRUE);
        }
        aihhVar.e(amkr.c, amlgVar);
    }

    public static int ed(int i) {
        boolean z = false;
        if (i >= 0 && i < 2048) {
            z = true;
        }
        ahno.G(z, "sizeInMb must be between 0 and 2048");
        return i << 20;
    }

    public static tmt ee(Map map, alop alopVar, mbc mbcVar, boolean z) {
        if (alopVar == null || (z && alopVar.e <= 0)) {
            return null;
        }
        long epochMilli = mbcVar.f().plusSeconds(alopVar.e).toEpochMilli();
        tms tmsVarA = tmt.a();
        tmsVarA.f(epochMilli);
        tmsVarA.g(epochMilli);
        tmsVarA.e(0L);
        if (map == null) {
            map = agpn.b;
        }
        tmsVarA.d(map);
        if ((alopVar.b & 16) != 0) {
            ajnv ajnvVar = alopVar.f;
            if (ajnvVar == null) {
                ajnvVar = ajnv.a;
            }
            if ((ajnvVar.b & 4) != 0) {
                tmsVarA.b = Optional.of(Integer.valueOf(ajnvVar.d));
            }
            if (ajnvVar.e) {
                tmsVarA.d = 2;
            }
        }
        return tmsVarA.a();
    }

    public static void ef(zwy zwyVar, ListenableFuture listenableFuture, Executor executor, int i) {
        zwx zwxVarP = zwyVar.p(i);
        taf.i(listenableFuture, executor, new wuy(zwxVarP, 0), new ixb(zwxVarP, 12), null);
    }

    public static wtu eg(ajul ajulVar) {
        boolean z = ajulVar.j;
        boolean z2 = ajulVar.g;
        boolean z3 = ajulVar.i;
        boolean z4 = ajulVar.h;
        agke agkeVarN = agke.n(new aihx(ajulVar.k, ajul.a));
        agke agkeVarN2 = agke.n(new aihx(ajulVar.l, ajul.b));
        aohx aohxVarA = aohx.a(ajulVar.m);
        if (aohxVarA == null) {
            aohxVarA = aohx.UNKNOWN_FORMAT_TYPE;
        }
        aohx aohxVar = aohxVarA;
        if (agkeVarN != null && agkeVarN2 != null) {
            return new wtu(z, z2, z3, z4, agkeVarN, agkeVarN2, aohxVar);
        }
        StringBuilder sb = new StringBuilder();
        if (agkeVarN == null) {
            sb.append(" downloadQualityFormats");
        }
        if (agkeVarN2 == null) {
            sb.append(" smartDownloadsQualityFormats");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static List eh(alye alyeVar, List list) {
        MessageLite messageLite;
        aigj aigjVar;
        ArrayList arrayList = new ArrayList();
        if (alyeVar != null) {
            int i = alyeVar.b;
            if (i == 88478200) {
                ajul ajulVar = (ajul) alyeVar.c;
                if (ajulVar.f) {
                    arrayList.add(eg(ajulVar));
                }
                if (ajulVar.e) {
                    arrayList.add(new wtq());
                    return arrayList;
                }
            } else {
                if (i == 61520386) {
                    messageLite = (apqv) alyeVar.c;
                } else if (i == 66930374) {
                    messageLite = (apqt) alyeVar.c;
                } else if (i == 153515154) {
                    messageLite = (akrn) alyeVar.c;
                } else if (i == 85446662) {
                    messageLite = (apqj) alyeVar.c;
                } else if (i == 155905127) {
                    messageLite = (alcm) alyeVar.c;
                } else if (i == 93763033) {
                    messageLite = (apqp) alyeVar.c;
                } else if (i == 94214034) {
                    messageLite = (ajuv) alyeVar.c;
                } else if (i == 173548507) {
                    messageLite = (ajuu) alyeVar.c;
                } else if (i == 144484052) {
                    messageLite = (ajuw) alyeVar.c;
                } else if (i == 88478200) {
                    messageLite = (ajul) alyeVar.c;
                    i = 88478200;
                } else if (i == 124189785) {
                    messageLite = (ajum) alyeVar.c;
                } else if (i == 203803278) {
                    messageLite = (ajuq) alyeVar.c;
                } else if (i == 230577543) {
                    messageLite = (ajus) alyeVar.c;
                } else if (i == 324886099) {
                    messageLite = (ajun) alyeVar.c;
                } else if (i == 359641852) {
                    messageLite = (ajuo) alyeVar.c;
                } else if (i == 369870935) {
                    messageLite = (ajut) alyeVar.c;
                } else if (i == 75120871) {
                    messageLite = (apqw) alyeVar.c;
                } else if (i == 1806) {
                    messageLite = (ajux) alyeVar.c;
                } else if (i == 2263) {
                    messageLite = (aokz) alyeVar.c;
                    i = 2263;
                } else {
                    messageLite = null;
                }
                if (messageLite != null) {
                    if (((i == 61520386 ? (apqv) alyeVar.c : apqv.a).b & SemanticState.Focused) != 0) {
                        aigjVar = (alyeVar.b == 61520386 ? (apqv) alyeVar.c : apqv.a).e;
                    } else {
                        if (((alyeVar.b == 66930374 ? (apqt) alyeVar.c : apqt.a).b & SemanticState.Hidden) != 0) {
                            aigjVar = (alyeVar.b == 66930374 ? (apqt) alyeVar.c : apqt.a).f;
                        } else {
                            if (((alyeVar.b == 153515154 ? (akrn) alyeVar.c : akrn.a).b & 8) != 0) {
                                aigjVar = (alyeVar.b == 153515154 ? (akrn) alyeVar.c : akrn.a).d;
                            } else {
                                if (((alyeVar.b == 93763033 ? (apqp) alyeVar.c : apqp.a).b & 16) != 0) {
                                    aigjVar = (alyeVar.b == 93763033 ? (apqp) alyeVar.c : apqp.a).c;
                                } else {
                                    if (((alyeVar.b == 94214034 ? (ajuv) alyeVar.c : ajuv.a).b & 32) != 0) {
                                        aigjVar = (alyeVar.b == 94214034 ? (ajuv) alyeVar.c : ajuv.a).c;
                                    } else {
                                        if (((alyeVar.b == 173548507 ? (ajuu) alyeVar.c : ajuu.a).b & 32) != 0) {
                                            aigjVar = (alyeVar.b == 173548507 ? (ajuu) alyeVar.c : ajuu.a).c;
                                        } else {
                                            if (((alyeVar.b == 144484052 ? (ajuw) alyeVar.c : ajuw.a).b & 16) != 0) {
                                                aigjVar = (alyeVar.b == 144484052 ? (ajuw) alyeVar.c : ajuw.a).c;
                                            } else {
                                                if (((alyeVar.b == 88478200 ? (ajul) alyeVar.c : ajul.c).d & SemanticState.Obscured) != 0) {
                                                    aigjVar = (alyeVar.b == 88478200 ? (ajul) alyeVar.c : ajul.c).n;
                                                } else {
                                                    if (((alyeVar.b == 124189785 ? (ajum) alyeVar.c : ajum.a).b & 8) != 0) {
                                                        aigjVar = (alyeVar.b == 124189785 ? (ajum) alyeVar.c : ajum.a).c;
                                                    } else {
                                                        if (((alyeVar.b == 203803278 ? (ajuq) alyeVar.c : ajuq.a).b & 4) != 0) {
                                                            aigjVar = (alyeVar.b == 203803278 ? (ajuq) alyeVar.c : ajuq.a).c;
                                                        } else {
                                                            if (((alyeVar.b == 230577543 ? (ajus) alyeVar.c : ajus.a).b & 8) != 0) {
                                                                aigjVar = (alyeVar.b == 230577543 ? (ajus) alyeVar.c : ajus.a).c;
                                                            } else {
                                                                if (((alyeVar.b == 324886099 ? (ajun) alyeVar.c : ajun.a).b & 16) != 0) {
                                                                    aigjVar = (alyeVar.b == 324886099 ? (ajun) alyeVar.c : ajun.a).c;
                                                                } else {
                                                                    if (((alyeVar.b == 359641852 ? (ajuo) alyeVar.c : ajuo.a).b & 32) != 0) {
                                                                        aigjVar = (alyeVar.b == 359641852 ? (ajuo) alyeVar.c : ajuo.a).c;
                                                                    } else {
                                                                        if (((alyeVar.b == 369870935 ? (ajut) alyeVar.c : ajut.a).b & 32) != 0) {
                                                                            aigjVar = (alyeVar.b == 369870935 ? (ajut) alyeVar.c : ajut.a).c;
                                                                        } else {
                                                                            if (((alyeVar.b == 75120871 ? (apqw) alyeVar.c : apqw.a).b & SemanticState.Hidden) != 0) {
                                                                                aigjVar = (alyeVar.b == 75120871 ? (apqw) alyeVar.c : apqw.a).f;
                                                                            } else {
                                                                                aigjVar = aigj.d;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (list != null && !aigjVar.E()) {
                        list.add(aigjVar.G());
                    }
                    arrayList.add(messageLite);
                }
            }
        }
        return arrayList;
    }

    public static void ei(String str, Map map, int i) {
        j$.util.Map.EL.merge(map, str, Integer.valueOf(i), new ito(wmh.a, 4));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x011e A[Catch: Exception -> 0x0149, TryCatch #1 {Exception -> 0x0149, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0022, B:9:0x002e, B:11:0x003a, B:13:0x0046, B:15:0x004d, B:17:0x007d, B:19:0x0085, B:21:0x008b, B:22:0x0094, B:24:0x009a, B:26:0x00a2, B:27:0x00ac, B:29:0x00b0, B:30:0x00be, B:32:0x00c4, B:33:0x00d3, B:35:0x00d7, B:37:0x00dd, B:38:0x00eb, B:40:0x00f5, B:42:0x011e, B:44:0x0126, B:45:0x0130, B:47:0x0134, B:48:0x0142), top: B:58:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0126 A[Catch: Exception -> 0x0149, TryCatch #1 {Exception -> 0x0149, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0022, B:9:0x002e, B:11:0x003a, B:13:0x0046, B:15:0x004d, B:17:0x007d, B:19:0x0085, B:21:0x008b, B:22:0x0094, B:24:0x009a, B:26:0x00a2, B:27:0x00ac, B:29:0x00b0, B:30:0x00be, B:32:0x00c4, B:33:0x00d3, B:35:0x00d7, B:37:0x00dd, B:38:0x00eb, B:40:0x00f5, B:42:0x011e, B:44:0x0126, B:45:0x0130, B:47:0x0134, B:48:0x0142), top: B:58:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0130 A[Catch: Exception -> 0x0149, TryCatch #1 {Exception -> 0x0149, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0022, B:9:0x002e, B:11:0x003a, B:13:0x0046, B:15:0x004d, B:17:0x007d, B:19:0x0085, B:21:0x008b, B:22:0x0094, B:24:0x009a, B:26:0x00a2, B:27:0x00ac, B:29:0x00b0, B:30:0x00be, B:32:0x00c4, B:33:0x00d3, B:35:0x00d7, B:37:0x00dd, B:38:0x00eb, B:40:0x00f5, B:42:0x011e, B:44:0x0126, B:45:0x0130, B:47:0x0134, B:48:0x0142), top: B:58:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0134 A[Catch: Exception -> 0x0149, TryCatch #1 {Exception -> 0x0149, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0022, B:9:0x002e, B:11:0x003a, B:13:0x0046, B:15:0x004d, B:17:0x007d, B:19:0x0085, B:21:0x008b, B:22:0x0094, B:24:0x009a, B:26:0x00a2, B:27:0x00ac, B:29:0x00b0, B:30:0x00be, B:32:0x00c4, B:33:0x00d3, B:35:0x00d7, B:37:0x00dd, B:38:0x00eb, B:40:0x00f5, B:42:0x011e, B:44:0x0126, B:45:0x0130, B:47:0x0134, B:48:0x0142), top: B:58:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0142 A[Catch: Exception -> 0x0149, TRY_LEAVE, TryCatch #1 {Exception -> 0x0149, blocks: (B:3:0x000b, B:5:0x0014, B:7:0x0022, B:9:0x002e, B:11:0x003a, B:13:0x0046, B:15:0x004d, B:17:0x007d, B:19:0x0085, B:21:0x008b, B:22:0x0094, B:24:0x009a, B:26:0x00a2, B:27:0x00ac, B:29:0x00b0, B:30:0x00be, B:32:0x00c4, B:33:0x00d3, B:35:0x00d7, B:37:0x00dd, B:38:0x00eb, B:40:0x00f5, B:42:0x011e, B:44:0x0126, B:45:0x0130, B:47:0x0134, B:48:0x0142), top: B:58:0x000b }] */
    public static JSONObject ej(MessageLite messageLite) {
        Object objInvoke;
        JSONObject jSONObject = new JSONObject();
        Class<?> cls = messageLite.getClass();
        try {
            for (Method method : cls.getDeclaredMethods()) {
                method.setAccessible(true);
                if ((method.getModifiers() & 8) == 0 && method.getName().startsWith("get") && !method.getName().endsWith("Bytes") && !method.getName().endsWith("Count") && method.getParameterTypes().length <= 0) {
                    String str = Character.toLowerCase(method.getName().charAt(3)) + method.getName().substring(4);
                    JSONArray jSONArray = null;
                    if (method.getReturnType() == List.class) {
                        List list = (List) method.invoke(messageLite, null);
                        if (list != null && !list.isEmpty()) {
                            jSONArray = new JSONArray();
                            for (Object obj : list) {
                                if (obj instanceof MessageLite) {
                                    jSONArray.put(ej((MessageLite) obj));
                                } else if (obj instanceof aigj) {
                                    jSONArray.put(Base64.encodeToString(((aigj) obj).G(), 10));
                                } else {
                                    jSONArray.put(obj);
                                }
                            }
                        }
                        if (jSONArray != null) {
                            jSONObject.put(str.substring(0, str.length() - 4), jSONArray);
                        }
                    } else if ((messageLite instanceof InnertubeContext$ClientInfo) && str.equals("clientName")) {
                        jSONObject.put("clientName", ((alol) method.invoke(messageLite, null)).name());
                    } else if (method.getReturnType().isEnum()) {
                        objInvoke = method.invoke(messageLite, null);
                        if (objInvoke instanceof MessageLite) {
                            jSONObject.put(str, ej((MessageLite) objInvoke));
                        } else if (objInvoke instanceof aigj) {
                            jSONObject.put(str, Base64.encodeToString(((aigj) objInvoke).G(), 10));
                        } else {
                            jSONObject.put(str, objInvoke);
                        }
                    } else {
                        if (((Boolean) cls.getMethod("has" + method.getName().substring(3), null).invoke(messageLite, null)).booleanValue()) {
                            objInvoke = method.invoke(messageLite, null);
                            if (objInvoke instanceof MessageLite) {
                                jSONObject.put(str, ej((MessageLite) objInvoke));
                            } else if (objInvoke instanceof aigj) {
                                jSONObject.put(str, Base64.encodeToString(((aigj) objInvoke).G(), 10));
                            } else {
                                jSONObject.put(str, objInvoke);
                            }
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception e) {
            try {
                twu.c(6, "Exception while trying to convert protoMessage: " + messageLite.getClass().getSimpleName(), e);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("PROTO CONVERSION FAILED", "See error logs and file bug.");
                return jSONObject2;
            } catch (JSONException e2) {
                throw new RuntimeException("This should never happen.", e2);
            }
        }
    }

    public static ajvu ek(ajvu ajvuVar) {
        ajvuVar.getClass();
        if (!ep(ajvuVar)) {
            return ajvuVar;
        }
        aihf builder = ajvuVar.toBuilder();
        builder.getClass();
        builder.copyOnWrite();
        ajvu ajvuVar2 = (ajvu) builder.instance;
        ajvuVar2.u = null;
        ajvuVar2.c &= -33;
        aihn aihnVarBuild = builder.build();
        aihnVarBuild.getClass();
        return (ajvu) aihnVarBuild;
    }

    public static alik el(alik alikVar, alik alikVar2) {
        if (!eq(alikVar)) {
            return alikVar;
        }
        vyl.d();
        if (alikVar2 == null) {
            return alikVar;
        }
        aihf builder = alikVar.toBuilder();
        builder.getClass();
        akww akwwVar = alikVar2.v;
        if (akwwVar == null) {
            akwwVar = akww.a;
        }
        aihf builder2 = akwwVar.toBuilder();
        akww akwwVar2 = alikVar.v;
        if (akwwVar2 == null) {
            akwwVar2 = akww.a;
        }
        akda akdaVar = akwwVar2.d;
        if (akdaVar == null) {
            akdaVar = akda.a;
        }
        builder2.copyOnWrite();
        akww akwwVar3 = (akww) builder2.instance;
        akdaVar.getClass();
        akwwVar3.d = akdaVar;
        akwwVar3.b |= 1;
        aihn aihnVarBuild = builder2.build();
        aihnVarBuild.getClass();
        builder.copyOnWrite();
        alik alikVar3 = (alik) builder.instance;
        alikVar3.v = (akww) aihnVarBuild;
        alikVar3.c |= SemanticState.Focused;
        return afyd.E(builder);
    }

    public static alik em(alik alikVar) {
        alikVar.getClass();
        if (!eq(alikVar)) {
            return alikVar;
        }
        aihf builder = alikVar.toBuilder();
        builder.getClass();
        builder.copyOnWrite();
        alik alikVar2 = (alik) builder.instance;
        alikVar2.v = null;
        alikVar2.c &= -129;
        return afyd.E(builder);
    }

    public static String en(ajvu ajvuVar) {
        return ajvuVar == null ? "" : gR(ek(ajvuVar).toByteArray());
    }

    public static String eo(alik alikVar) {
        return alikVar == null ? "" : gR(em(alikVar).toByteArray());
    }

    public static boolean ep(ajvu ajvuVar) {
        akda akdaVar = null;
        if (ajvuVar != null) {
            akww akwwVar = ajvuVar.u;
            if (akwwVar == null) {
                akwwVar = akww.a;
            }
            if (akwwVar != null && (akdaVar = akwwVar.d) == null) {
                akdaVar = akda.a;
            }
        }
        return gS(akdaVar);
    }

    public static boolean eq(alik alikVar) {
        akda akdaVar = null;
        if (alikVar != null) {
            akww akwwVar = alikVar.v;
            if (akwwVar == null) {
                akwwVar = akww.a;
            }
            if (akwwVar != null && (akdaVar = akwwVar.d) == null) {
                akdaVar = akda.a;
            }
        }
        return gS(akdaVar);
    }

    public static void er(SharedPreferences sharedPreferences, tqj tqjVar, boolean z, boolean z2) {
        sharedPreferences.getClass();
        if (!z) {
            if (!z2) {
                return;
            } else {
                z2 = true;
            }
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        if (z) {
            editorEdit.remove("com.google.android.libraries.youtube.innertube.hot_config_group");
            editorEdit.remove("com.google.android.libraries.youtube.innertube.hot_hash_data");
            editorEdit.remove("com.google.android.libraries.youtube.innertube.hot_stored_timestamp");
        }
        if (z2) {
            editorEdit.remove("com.google.android.libraries.youtube.innertube.cold_config_group");
            editorEdit.remove("com.google.android.libraries.youtube.innertube.cold_hash_data");
            editorEdit.remove("com.google.android.libraries.youtube.innertube.cold_stored_timestamp");
        }
        editorEdit.apply();
        if (z2 && tqjVar != null) {
            tqjVar.h();
        }
        vyl.e();
    }

    public static boolean es(tqj tqjVar) {
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(88621)) {
                tqh tqhVarD = tqjVar.d(1);
                tqhVarD.b(88621, 0L);
                tqhVarD.a();
                return true;
            }
        }
        return false;
    }

    public static wgs et(Uri.Builder builder, String str, aihh aihhVar) {
        String string = builder.build().toString();
        aihhVar.copyOnWrite();
        alaw alawVar = (alaw) aihhVar.instance;
        aihw aihwVar = alaw.a;
        string.getClass();
        alawVar.c |= 2;
        alawVar.f = string;
        return new wgs((alaw) aihhVar.build(), str, false, null);
    }

    public static MessageLite eu(amgj amgjVar) {
        if (amgjVar != null) {
            int i = amgjVar.b;
            if ((i & 1) != 0) {
                amtp amtpVar = amgjVar.q;
                return amtpVar == null ? amtp.a : amtpVar;
            }
            if ((i & 2) != 0) {
                aiwl aiwlVar = amgjVar.r;
                return aiwlVar == null ? aiwl.a : aiwlVar;
            }
            if ((i & 4) != 0) {
                amih amihVar = amgjVar.s;
                return amihVar == null ? amih.a : amihVar;
            }
            if ((i & 8) != 0) {
                amhz amhzVar = amgjVar.t;
                return amhzVar == null ? amhz.a : amhzVar;
            }
            if ((i & 16) != 0) {
                akci akciVar = amgjVar.u;
                return akciVar == null ? akci.a : akciVar;
            }
            if ((i & 32) != 0) {
                akfy akfyVar = amgjVar.v;
                return akfyVar == null ? akfy.a : akfyVar;
            }
            if ((i & 64) != 0) {
                akbv akbvVar = amgjVar.w;
                return akbvVar == null ? akbv.a : akbvVar;
            }
            if ((i & SemanticState.Focused) != 0) {
                akay akayVar = amgjVar.x;
                return akayVar == null ? akay.a : akayVar;
            }
            if ((i & SemanticState.Hidden) != 0) {
                akbq akbqVar = amgjVar.y;
                return akbqVar == null ? akbq.a : akbqVar;
            }
            if ((i & SemanticState.LiveRegion) != 0) {
                akcc akccVar = amgjVar.z;
                return akccVar == null ? akcc.a : akccVar;
            }
            if ((i & SemanticState.ReadOnly) != 0) {
                akbx akbxVar = amgjVar.A;
                return akbxVar == null ? akbx.a : akbxVar;
            }
            if ((i & SemanticState.Modal) != 0) {
                akbr akbrVar = amgjVar.B;
                return akbrVar == null ? akbr.a : akbrVar;
            }
            if ((i & SemanticState.Obscured) != 0) {
                akrj akrjVar = amgjVar.C;
                return akrjVar == null ? akrj.a : akrjVar;
            }
            if ((i & SemanticState.Multiline) != 0) {
                akbw akbwVar = amgjVar.D;
                return akbwVar == null ? akbw.a : akbwVar;
            }
            if ((i & 16384) != 0) {
                akbj akbjVar = amgjVar.E;
                return akbjVar == null ? akbj.a : akbjVar;
            }
            if ((i & 32768) != 0) {
                akbi akbiVar = amgjVar.F;
                return akbiVar == null ? akbi.a : akbiVar;
            }
            if ((i & 65536) != 0) {
                akcg akcgVar = amgjVar.G;
                return akcgVar == null ? akcg.a : akcgVar;
            }
            if ((i & 131072) != 0) {
                akbo akboVar = amgjVar.H;
                return akboVar == null ? akbo.a : akboVar;
            }
            if ((i & 262144) != 0) {
                aobr aobrVar = amgjVar.I;
                return aobrVar == null ? aobr.a : aobrVar;
            }
            if ((i & 524288) != 0) {
                aknd akndVar = amgjVar.J;
                return akndVar == null ? aknd.a : akndVar;
            }
            if ((i & 1048576) != 0) {
                arfe arfeVar = amgjVar.K;
                return arfeVar == null ? arfe.a : arfeVar;
            }
            if ((i & 2097152) != 0) {
                argb argbVar = amgjVar.L;
                return argbVar == null ? argb.a : argbVar;
            }
            if ((4194304 & i) != 0) {
                ajrn ajrnVar = amgjVar.M;
                return ajrnVar == null ? ajrn.a : ajrnVar;
            }
            if ((8388608 & i) != 0) {
                anjb anjbVar = amgjVar.N;
                return anjbVar == null ? anjb.a : anjbVar;
            }
            if ((16777216 & i) != 0) {
                aouw aouwVar = amgjVar.O;
                return aouwVar == null ? aouw.a : aouwVar;
            }
            if ((33554432 & i) != 0) {
                apcl apclVar = amgjVar.P;
                return apclVar == null ? apcl.a : apclVar;
            }
            if ((67108864 & i) != 0) {
                apyh apyhVar = amgjVar.Q;
                return apyhVar == null ? apyh.a : apyhVar;
            }
            if ((134217728 & i) != 0) {
                aqal aqalVar = amgjVar.R;
                return aqalVar == null ? aqal.a : aqalVar;
            }
            if ((268435456 & i) != 0) {
                aqam aqamVar = amgjVar.S;
                return aqamVar == null ? aqam.a : aqamVar;
            }
            if ((536870912 & i) != 0) {
                aqcl aqclVar = amgjVar.T;
                return aqclVar == null ? aqcl.a : aqclVar;
            }
            if ((1073741824 & i) != 0) {
                apnq apnqVar = amgjVar.U;
                return apnqVar == null ? apnq.a : apnqVar;
            }
            if ((i & Integer.MIN_VALUE) != 0) {
                apnj apnjVar = amgjVar.V;
                return apnjVar == null ? apnj.a : apnjVar;
            }
            int i2 = amgjVar.c;
            if ((i2 & 1) != 0) {
                akfs akfsVar = amgjVar.W;
                return akfsVar == null ? akfs.a : akfsVar;
            }
            if ((i2 & 2) != 0) {
                akfu akfuVar = amgjVar.X;
                return akfuVar == null ? akfu.a : akfuVar;
            }
            if ((i2 & 4) != 0) {
                akfx akfxVar = amgjVar.Y;
                return akfxVar == null ? akfx.a : akfxVar;
            }
            if ((i2 & 8) != 0) {
                akft akftVar = amgjVar.Z;
                return akftVar == null ? akft.a : akftVar;
            }
            if ((i2 & 16) != 0) {
                akfv akfvVar = amgjVar.aa;
                return akfvVar == null ? akfv.a : akfvVar;
            }
            if ((i2 & 32) != 0) {
                akfw akfwVar = amgjVar.ab;
                return akfwVar == null ? akfw.a : akfwVar;
            }
            if ((i2 & 64) != 0) {
                apnt apntVar = amgjVar.ac;
                return apntVar == null ? apnt.a : apntVar;
            }
            if ((i2 & SemanticState.Focused) != 0) {
                akxa akxaVar = amgjVar.ad;
                return akxaVar == null ? akxa.a : akxaVar;
            }
            if ((i2 & SemanticState.Hidden) != 0) {
                arht arhtVar = amgjVar.ae;
                return arhtVar == null ? arht.a : arhtVar;
            }
            if ((i2 & SemanticState.LiveRegion) != 0) {
                arhw arhwVar = amgjVar.af;
                return arhwVar == null ? arhw.a : arhwVar;
            }
            if ((i2 & SemanticState.ReadOnly) != 0) {
                arhr arhrVar = amgjVar.ag;
                return arhrVar == null ? arhr.a : arhrVar;
            }
            if ((i2 & SemanticState.Modal) != 0) {
                arhs arhsVar = amgjVar.ah;
                return arhsVar == null ? arhs.a : arhsVar;
            }
            if ((i2 & SemanticState.Obscured) != 0) {
                arhu arhuVar = amgjVar.ai;
                return arhuVar == null ? arhu.a : arhuVar;
            }
            if ((i2 & SemanticState.Multiline) != 0) {
                arej arejVar = amgjVar.aj;
                return arejVar == null ? arej.a : arejVar;
            }
            if ((i2 & 16384) != 0) {
                aren arenVar = amgjVar.ak;
                return arenVar == null ? aren.a : arenVar;
            }
            if ((i2 & 32768) != 0) {
                area areaVar = amgjVar.al;
                return areaVar == null ? area.a : areaVar;
            }
            if ((i2 & 65536) != 0) {
                arcz arczVar = amgjVar.am;
                return arczVar == null ? arcz.a : arczVar;
            }
            if ((i2 & 131072) != 0) {
                ajzs ajzsVar = amgjVar.an;
                return ajzsVar == null ? ajzs.a : ajzsVar;
            }
            if ((i2 & 262144) != 0) {
                ajza ajzaVar = amgjVar.ao;
                return ajzaVar == null ? ajza.a : ajzaVar;
            }
            if ((i2 & 524288) != 0) {
                ajye ajyeVar = amgjVar.ap;
                return ajyeVar == null ? ajye.a : ajyeVar;
            }
            if ((i2 & 1048576) != 0) {
                ajxz ajxzVar = amgjVar.aq;
                return ajxzVar == null ? ajxz.a : ajxzVar;
            }
            if ((i2 & 2097152) != 0) {
                ajya ajyaVar = amgjVar.ar;
                return ajyaVar == null ? ajya.a : ajyaVar;
            }
            if ((4194304 & i2) != 0) {
                ajzi ajziVar = amgjVar.as;
                return ajziVar == null ? ajzi.a : ajziVar;
            }
            if ((8388608 & i2) != 0) {
                ajzk ajzkVar = amgjVar.at;
                return ajzkVar == null ? ajzk.a : ajzkVar;
            }
            if ((16777216 & i2) != 0) {
                akyg akygVar = amgjVar.au;
                return akygVar == null ? akyg.a : akygVar;
            }
            if ((33554432 & i2) != 0) {
                alin alinVar = amgjVar.av;
                return alinVar == null ? alin.a : alinVar;
            }
            if ((67108864 & i2) != 0) {
                arax araxVar = amgjVar.aw;
                return araxVar == null ? arax.a : araxVar;
            }
            if ((134217728 & i2) != 0) {
                alkx alkxVar = amgjVar.ax;
                return alkxVar == null ? alkx.a : alkxVar;
            }
            if ((268435456 & i2) != 0) {
                akyn akynVar = amgjVar.ay;
                return akynVar == null ? akyn.a : akynVar;
            }
            if ((536870912 & i2) != 0) {
                ajrr ajrrVar = amgjVar.az;
                return ajrrVar == null ? ajrr.a : ajrrVar;
            }
            if ((1073741824 & i2) != 0) {
                aobw aobwVar = amgjVar.aA;
                return aobwVar == null ? aobw.a : aobwVar;
            }
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alfr alfrVar = amgjVar.aB;
                return alfrVar == null ? alfr.a : alfrVar;
            }
            int i3 = amgjVar.d;
            if ((i3 & 1) != 0) {
                alfw alfwVar = amgjVar.aC;
                return alfwVar == null ? alfw.a : alfwVar;
            }
            if ((i3 & 2) != 0) {
                apun apunVar = amgjVar.aD;
                return apunVar == null ? apun.a : apunVar;
            }
            if ((i3 & 4) != 0) {
                apuj apujVar = amgjVar.aE;
                return apujVar == null ? apuj.a : apujVar;
            }
            if ((i3 & 8) != 0) {
                apuf apufVar = amgjVar.aF;
                return apufVar == null ? apuf.a : apufVar;
            }
            if ((i3 & 16) != 0) {
                ajpl ajplVar = amgjVar.aG;
                return ajplVar == null ? ajpl.a : ajplVar;
            }
            if ((i3 & 32) != 0) {
                aipn aipnVar = amgjVar.aH;
                return aipnVar == null ? aipn.a : aipnVar;
            }
            if ((i3 & 64) != 0) {
                ajpg ajpgVar = amgjVar.aI;
                return ajpgVar == null ? ajpg.a : ajpgVar;
            }
            if ((i3 & SemanticState.Focused) != 0) {
                ajqi ajqiVar = amgjVar.aJ;
                return ajqiVar == null ? ajqi.a : ajqiVar;
            }
            if ((i3 & SemanticState.Hidden) != 0) {
                ajqh ajqhVar = amgjVar.aK;
                return ajqhVar == null ? ajqh.a : ajqhVar;
            }
            if ((i3 & SemanticState.LiveRegion) != 0) {
                aoud aoudVar = amgjVar.aL;
                return aoudVar == null ? aoud.a : aoudVar;
            }
            if ((i3 & SemanticState.ReadOnly) != 0) {
                aovo aovoVar = amgjVar.aM;
                return aovoVar == null ? aovo.a : aovoVar;
            }
            if ((i3 & SemanticState.Modal) != 0) {
                aovx aovxVar = amgjVar.aN;
                return aovxVar == null ? aovx.a : aovxVar;
            }
            if ((i3 & SemanticState.Obscured) != 0) {
                aoux aouxVar = amgjVar.aO;
                return aouxVar == null ? aoux.a : aouxVar;
            }
            if ((i3 & SemanticState.Multiline) != 0) {
                angn angnVar = amgjVar.aP;
                return angnVar == null ? angn.a : angnVar;
            }
            if ((i3 & 16384) != 0) {
                akwv akwvVar = amgjVar.aQ;
                return akwvVar == null ? akwv.a : akwvVar;
            }
            if ((i3 & 32768) != 0) {
                apbi apbiVar = amgjVar.aR;
                return apbiVar == null ? apbi.a : apbiVar;
            }
            if ((i3 & 65536) != 0) {
                apbg apbgVar = amgjVar.aS;
                return apbgVar == null ? apbg.a : apbgVar;
            }
            if ((i3 & 131072) != 0) {
                anjc anjcVar = amgjVar.aT;
                return anjcVar == null ? anjc.a : anjcVar;
            }
            if ((i3 & 262144) != 0) {
                akbk akbkVar = amgjVar.aU;
                return akbkVar == null ? akbk.a : akbkVar;
            }
            if ((i3 & 524288) != 0) {
                akbc akbcVar = amgjVar.aV;
                return akbcVar == null ? akbc.a : akbcVar;
            }
            if ((i3 & 1048576) != 0) {
                apbt apbtVar = amgjVar.aW;
                return apbtVar == null ? apbt.a : apbtVar;
            }
            if ((i3 & 2097152) != 0) {
                aqqg aqqgVar = amgjVar.aX;
                return aqqgVar == null ? aqqg.a : aqqgVar;
            }
            if ((4194304 & i3) != 0) {
                ajsi ajsiVar = amgjVar.aY;
                return ajsiVar == null ? ajsi.a : ajsiVar;
            }
            if ((8388608 & i3) != 0) {
                ajqq ajqqVar = amgjVar.aZ;
                return ajqqVar == null ? ajqq.a : ajqqVar;
            }
            if ((16777216 & i3) != 0) {
                akil akilVar = amgjVar.ba;
                return akilVar == null ? akil.a : akilVar;
            }
            if ((33554432 & i3) != 0) {
                aqdz aqdzVar = amgjVar.bb;
                return aqdzVar == null ? aqdz.a : aqdzVar;
            }
            if ((67108864 & i3) != 0) {
                ajxy ajxyVar = amgjVar.bc;
                return ajxyVar == null ? ajxy.a : ajxyVar;
            }
            if ((134217728 & i3) != 0) {
                akar akarVar = amgjVar.bd;
                return akarVar == null ? akar.a : akarVar;
            }
            if ((268435456 & i3) != 0) {
                akis akisVar = amgjVar.be;
                return akisVar == null ? akis.a : akisVar;
            }
            if ((536870912 & i3) != 0) {
                aktd aktdVar = amgjVar.bf;
                return aktdVar == null ? aktd.a : aktdVar;
            }
            if ((1073741824 & i3) != 0) {
                akxq akxqVar = amgjVar.bg;
                return akxqVar == null ? akxq.a : akxqVar;
            }
            if ((i3 & Integer.MIN_VALUE) != 0) {
                antl antlVar = amgjVar.bh;
                return antlVar == null ? antl.a : antlVar;
            }
            int i4 = amgjVar.e;
            if ((i4 & 1) != 0) {
                antk antkVar = amgjVar.bi;
                return antkVar == null ? antk.a : antkVar;
            }
            if ((i4 & 2) != 0) {
                anti antiVar = amgjVar.bj;
                return antiVar == null ? anti.a : antiVar;
            }
            if ((i4 & 4) != 0) {
                ajqp ajqpVar = amgjVar.bk;
                return ajqpVar == null ? ajqp.a : ajqpVar;
            }
            if ((i4 & 8) != 0) {
                ajiy ajiyVar = amgjVar.bl;
                return ajiyVar == null ? ajiy.a : ajiyVar;
            }
            if ((i4 & 16) != 0) {
                alkt alktVar = amgjVar.bm;
                return alktVar == null ? alkt.a : alktVar;
            }
            if ((i4 & 32) != 0) {
                ajse ajseVar = amgjVar.bn;
                return ajseVar == null ? ajse.a : ajseVar;
            }
            if ((i4 & 64) != 0) {
                aocw aocwVar = amgjVar.bo;
                return aocwVar == null ? aocw.a : aocwVar;
            }
            if ((i4 & SemanticState.Focused) != 0) {
                akbl akblVar = amgjVar.bp;
                return akblVar == null ? akbl.a : akblVar;
            }
            if ((i4 & SemanticState.Hidden) != 0) {
                akbm akbmVar = amgjVar.bq;
                return akbmVar == null ? akbm.a : akbmVar;
            }
            if ((i4 & SemanticState.LiveRegion) != 0) {
                akbn akbnVar = amgjVar.br;
                return akbnVar == null ? akbn.a : akbnVar;
            }
            if ((i4 & SemanticState.ReadOnly) != 0) {
                aptv aptvVar = amgjVar.bs;
                return aptvVar == null ? aptv.a : aptvVar;
            }
            if ((i4 & SemanticState.Modal) != 0) {
                ajro ajroVar = amgjVar.bt;
                return ajroVar == null ? ajro.a : ajroVar;
            }
            if ((i4 & SemanticState.Obscured) != 0) {
                apca apcaVar = amgjVar.bu;
                return apcaVar == null ? apca.a : apcaVar;
            }
            if ((i4 & SemanticState.Multiline) != 0) {
                alde aldeVar = amgjVar.bv;
                return aldeVar == null ? alde.a : aldeVar;
            }
            if ((i4 & 16384) != 0) {
                akbs akbsVar = amgjVar.bw;
                return akbsVar == null ? akbs.a : akbsVar;
            }
            if ((i4 & 32768) != 0) {
                akbt akbtVar = amgjVar.bx;
                return akbtVar == null ? akbt.a : akbtVar;
            }
            if ((i4 & 65536) != 0) {
                arpu arpuVar = amgjVar.by;
                return arpuVar == null ? arpu.a : arpuVar;
            }
            if ((i4 & 131072) != 0) {
                apnl apnlVar = amgjVar.bz;
                return apnlVar == null ? apnl.a : apnlVar;
            }
            if ((i4 & 262144) != 0) {
                ardw ardwVar = amgjVar.bA;
                return ardwVar == null ? ardw.a : ardwVar;
            }
            if ((i4 & 524288) != 0) {
                alfc alfcVar = amgjVar.bB;
                return alfcVar == null ? alfc.a : alfcVar;
            }
            if ((i4 & 1048576) != 0) {
                apnr apnrVar = amgjVar.bC;
                return apnrVar == null ? apnr.a : apnrVar;
            }
            if ((i4 & 2097152) != 0) {
                aqpl aqplVar = amgjVar.bD;
                return aqplVar == null ? aqpl.a : aqplVar;
            }
            if ((4194304 & i4) != 0) {
                akbg akbgVar = amgjVar.bE;
                return akbgVar == null ? akbg.a : akbgVar;
            }
            if ((8388608 & i4) != 0) {
                ajhn ajhnVar = amgjVar.bF;
                return ajhnVar == null ? ajhn.a : ajhnVar;
            }
            if ((16777216 & i4) != 0) {
                ajho ajhoVar = amgjVar.bG;
                return ajhoVar == null ? ajho.a : ajhoVar;
            }
            if ((33554432 & i4) != 0) {
                ajhr ajhrVar = amgjVar.bH;
                return ajhrVar == null ? ajhr.a : ajhrVar;
            }
            if ((67108864 & i4) != 0) {
                ajhp ajhpVar = amgjVar.bI;
                return ajhpVar == null ? ajhp.a : ajhpVar;
            }
            if ((134217728 & i4) != 0) {
                ajhq ajhqVar = amgjVar.bJ;
                return ajhqVar == null ? ajhq.a : ajhqVar;
            }
            if ((268435456 & i4) != 0) {
                akbd akbdVar = amgjVar.bK;
                return akbdVar == null ? akbd.a : akbdVar;
            }
            if ((536870912 & i4) != 0) {
                albn albnVar = amgjVar.bL;
                return albnVar == null ? albn.a : albnVar;
            }
            if ((1073741824 & i4) != 0) {
                akbe akbeVar = amgjVar.bM;
                return akbeVar == null ? akbe.a : akbeVar;
            }
            if ((i4 & Integer.MIN_VALUE) != 0) {
                akbf akbfVar = amgjVar.bN;
                return akbfVar == null ? akbf.a : akbfVar;
            }
            int i5 = amgjVar.f;
            if ((i5 & 1) != 0) {
                akjc akjcVar = amgjVar.bO;
                return akjcVar == null ? akjc.a : akjcVar;
            }
            if ((i5 & 2) != 0) {
                apzl apzlVar = amgjVar.bP;
                return apzlVar == null ? apzl.a : apzlVar;
            }
            if ((i5 & 4) != 0) {
                apzv apzvVar = amgjVar.bQ;
                return apzvVar == null ? apzv.a : apzvVar;
            }
            if ((i5 & 8) != 0) {
                aqet aqetVar = amgjVar.bR;
                return aqetVar == null ? aqet.a : aqetVar;
            }
            if ((i5 & 16) != 0) {
                aqen aqenVar = amgjVar.bS;
                return aqenVar == null ? aqen.a : aqenVar;
            }
            if ((i5 & 32) != 0) {
                aqex aqexVar = amgjVar.bT;
                return aqexVar == null ? aqex.a : aqexVar;
            }
            if ((i5 & 64) != 0) {
                alie alieVar = amgjVar.bU;
                return alieVar == null ? alie.a : alieVar;
            }
            if ((i5 & SemanticState.Focused) != 0) {
                akdj akdjVar = amgjVar.bV;
                return akdjVar == null ? akdj.a : akdjVar;
            }
            if ((i5 & SemanticState.Hidden) != 0) {
                akdi akdiVar = amgjVar.bW;
                return akdiVar == null ? akdi.a : akdiVar;
            }
            if ((i5 & SemanticState.LiveRegion) != 0) {
                akdk akdkVar = amgjVar.bX;
                return akdkVar == null ? akdk.a : akdkVar;
            }
            if ((i5 & SemanticState.ReadOnly) != 0) {
                aoaj aoajVar = amgjVar.bY;
                return aoajVar == null ? aoaj.a : aoajVar;
            }
            if ((i5 & SemanticState.Modal) != 0) {
                ansi ansiVar = amgjVar.bZ;
                return ansiVar == null ? ansi.a : ansiVar;
            }
            if ((i5 & SemanticState.Obscured) != 0) {
                anrf anrfVar = amgjVar.ca;
                return anrfVar == null ? anrf.a : anrfVar;
            }
            if ((i5 & SemanticState.Multiline) != 0) {
                aoah aoahVar = amgjVar.cb;
                return aoahVar == null ? aoah.a : aoahVar;
            }
            if ((i5 & 16384) != 0) {
                ansg ansgVar = amgjVar.cc;
                return ansgVar == null ? ansg.a : ansgVar;
            }
            if ((i5 & 32768) != 0) {
                anrd anrdVar = amgjVar.cd;
                return anrdVar == null ? anrd.a : anrdVar;
            }
            if ((i5 & 65536) != 0) {
                anzz anzzVar = amgjVar.ce;
                return anzzVar == null ? anzz.a : anzzVar;
            }
            if ((i5 & 131072) != 0) {
                anwt anwtVar = amgjVar.cf;
                return anwtVar == null ? anwt.a : anwtVar;
            }
            if ((i5 & 262144) != 0) {
                anwb anwbVar = amgjVar.cg;
                return anwbVar == null ? anwb.a : anwbVar;
            }
            if ((i5 & 524288) != 0) {
                anoz anozVar = amgjVar.ch;
                return anozVar == null ? anoz.a : anozVar;
            }
            if ((i5 & 1048576) != 0) {
                ajrk ajrkVar = amgjVar.ci;
                return ajrkVar == null ? ajrk.a : ajrkVar;
            }
            if ((i5 & 2097152) != 0) {
                aotb aotbVar = amgjVar.cj;
                return aotbVar == null ? aotb.a : aotbVar;
            }
            if ((4194304 & i5) != 0) {
                aotz aotzVar = amgjVar.ck;
                return aotzVar == null ? aotz.a : aotzVar;
            }
            if ((8388608 & i5) != 0) {
                aroz arozVar = amgjVar.cl;
                return arozVar == null ? aroz.a : arozVar;
            }
            if ((16777216 & i5) != 0) {
                arpl arplVar = amgjVar.cm;
                return arplVar == null ? arpl.a : arplVar;
            }
            if ((33554432 & i5) != 0) {
                ajjk ajjkVar = amgjVar.cn;
                return ajjkVar == null ? ajjk.a : ajjkVar;
            }
            if ((67108864 & i5) != 0) {
                aqtf aqtfVar = amgjVar.co;
                return aqtfVar == null ? aqtf.a : aqtfVar;
            }
            if ((134217728 & i5) != 0) {
                aqto aqtoVar = amgjVar.cp;
                return aqtoVar == null ? aqto.a : aqtoVar;
            }
            if ((268435456 & i5) != 0) {
                aqti aqtiVar = amgjVar.cq;
                return aqtiVar == null ? aqti.a : aqtiVar;
            }
            if ((536870912 & i5) != 0) {
                aozs aozsVar = amgjVar.cr;
                return aozsVar == null ? aozs.a : aozsVar;
            }
            if ((1073741824 & i5) != 0) {
                aozt aoztVar = amgjVar.cs;
                return aoztVar == null ? aozt.a : aoztVar;
            }
            if ((i5 & Integer.MIN_VALUE) != 0) {
                aozw aozwVar = amgjVar.ct;
                return aozwVar == null ? aozw.a : aozwVar;
            }
            int i6 = amgjVar.g;
            if ((i6 & 1) != 0) {
                aozx aozxVar = amgjVar.cu;
                return aozxVar == null ? aozx.a : aozxVar;
            }
            if ((i6 & 2) != 0) {
                apaa apaaVar = amgjVar.cv;
                return apaaVar == null ? apaa.a : apaaVar;
            }
            if ((i6 & 4) != 0) {
                apab apabVar = amgjVar.cw;
                return apabVar == null ? apab.a : apabVar;
            }
            if ((i6 & 8) != 0) {
                apae apaeVar = amgjVar.cx;
                return apaeVar == null ? apae.a : apaeVar;
            }
            if ((i6 & 16) != 0) {
                apap apapVar = amgjVar.cy;
                return apapVar == null ? apap.a : apapVar;
            }
            if ((i6 & 32) != 0) {
                apaq apaqVar = amgjVar.cz;
                return apaqVar == null ? apaq.a : apaqVar;
            }
            if ((i6 & 64) != 0) {
                apas apasVar = amgjVar.cA;
                return apasVar == null ? apas.a : apasVar;
            }
            if ((i6 & SemanticState.Focused) != 0) {
                apbb apbbVar = amgjVar.cB;
                return apbbVar == null ? apbb.a : apbbVar;
            }
            if ((i6 & SemanticState.Hidden) != 0) {
                apbc apbcVar = amgjVar.cC;
                return apbcVar == null ? apbc.a : apbcVar;
            }
            if ((i6 & SemanticState.LiveRegion) != 0) {
                apbd apbdVar = amgjVar.cD;
                return apbdVar == null ? apbd.a : apbdVar;
            }
            if ((i6 & SemanticState.ReadOnly) != 0) {
                apat apatVar = amgjVar.cE;
                return apatVar == null ? apat.a : apatVar;
            }
            if ((i6 & SemanticState.Modal) != 0) {
                apau apauVar = amgjVar.cF;
                return apauVar == null ? apau.a : apauVar;
            }
            if ((i6 & SemanticState.Obscured) != 0) {
                apav apavVar = amgjVar.cG;
                return apavVar == null ? apav.a : apavVar;
            }
            if ((i6 & SemanticState.Multiline) != 0) {
                apax apaxVar = amgjVar.cH;
                return apaxVar == null ? apax.a : apaxVar;
            }
            if ((i6 & 16384) != 0) {
                apal apalVar = amgjVar.cI;
                return apalVar == null ? apal.a : apalVar;
            }
            if ((i6 & 32768) != 0) {
                apak apakVar = amgjVar.cJ;
                return apakVar == null ? apak.a : apakVar;
            }
            if ((i6 & 65536) != 0) {
                apar aparVar = amgjVar.cK;
                return aparVar == null ? apar.a : aparVar;
            }
            if ((i6 & 131072) != 0) {
                apam apamVar = amgjVar.cL;
                return apamVar == null ? apam.a : apamVar;
            }
            if ((i6 & 262144) != 0) {
                apao apaoVar = amgjVar.cM;
                return apaoVar == null ? apao.a : apaoVar;
            }
            if ((i6 & 524288) != 0) {
                apan apanVar = amgjVar.cN;
                return apanVar == null ? apan.a : apanVar;
            }
            if ((i6 & 1048576) != 0) {
                apay apayVar = amgjVar.cO;
                return apayVar == null ? apay.a : apayVar;
            }
            if ((i6 & 2097152) != 0) {
                apba apbaVar = amgjVar.cP;
                return apbaVar == null ? apba.a : apbaVar;
            }
            if ((4194304 & i6) != 0) {
                aozy aozyVar = amgjVar.cQ;
                return aozyVar == null ? aozy.a : aozyVar;
            }
            if ((8388608 & i6) != 0) {
                apbf apbfVar = amgjVar.cR;
                return apbfVar == null ? apbf.a : apbfVar;
            }
            if ((16777216 & i6) != 0) {
                apbe apbeVar = amgjVar.cS;
                return apbeVar == null ? apbe.a : apbeVar;
            }
            if ((33554432 & i6) != 0) {
                aqar aqarVar = amgjVar.cT;
                return aqarVar == null ? aqar.a : aqarVar;
            }
            if ((67108864 & i6) != 0) {
                aqez aqezVar = amgjVar.cU;
                return aqezVar == null ? aqez.a : aqezVar;
            }
            if ((134217728 & i6) != 0) {
                aqfa aqfaVar = amgjVar.cV;
                return aqfaVar == null ? aqfa.a : aqfaVar;
            }
            if ((268435456 & i6) != 0) {
                aqfb aqfbVar = amgjVar.cW;
                return aqfbVar == null ? aqfb.a : aqfbVar;
            }
            if ((536870912 & i6) != 0) {
                aqvx aqvxVar = amgjVar.cX;
                return aqvxVar == null ? aqvx.a : aqvxVar;
            }
            if ((1073741824 & i6) != 0) {
                aqvv aqvvVar = amgjVar.cY;
                return aqvvVar == null ? aqvv.a : aqvvVar;
            }
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aqxm aqxmVar = amgjVar.cZ;
                return aqxmVar == null ? aqxm.a : aqxmVar;
            }
            int i7 = amgjVar.h;
            if ((i7 & 1) != 0) {
                aqxt aqxtVar = amgjVar.da;
                return aqxtVar == null ? aqxt.a : aqxtVar;
            }
            if ((i7 & 2) != 0) {
                aqtm aqtmVar = amgjVar.db;
                return aqtmVar == null ? aqtm.a : aqtmVar;
            }
            if ((i7 & 4) != 0) {
                aqtl aqtlVar = amgjVar.dc;
                return aqtlVar == null ? aqtl.a : aqtlVar;
            }
            if ((i7 & 8) != 0) {
                albu albuVar = amgjVar.dd;
                return albuVar == null ? albu.a : albuVar;
            }
            if ((i7 & 16) != 0) {
                alco alcoVar = amgjVar.de;
                return alcoVar == null ? alco.a : alcoVar;
            }
            if ((i7 & 32) != 0) {
                alch alchVar = amgjVar.df;
                return alchVar == null ? alch.a : alchVar;
            }
            if ((i7 & 64) != 0) {
                alci alciVar = amgjVar.dg;
                return alciVar == null ? alci.a : alciVar;
            }
            if ((i7 & SemanticState.Focused) != 0) {
                ajyq ajyqVar = amgjVar.dh;
                return ajyqVar == null ? ajyq.a : ajyqVar;
            }
            if ((i7 & SemanticState.Hidden) != 0) {
                aqok aqokVar = amgjVar.di;
                return aqokVar == null ? aqok.a : aqokVar;
            }
            if ((i7 & SemanticState.LiveRegion) != 0) {
                amgm amgmVar = amgjVar.dj;
                return amgmVar == null ? amgm.a : amgmVar;
            }
            if ((i7 & SemanticState.ReadOnly) != 0) {
                arbw arbwVar = amgjVar.dk;
                return arbwVar == null ? arbw.a : arbwVar;
            }
            if ((i7 & SemanticState.Modal) != 0) {
                arbx arbxVar = amgjVar.dl;
                return arbxVar == null ? arbx.a : arbxVar;
            }
            if ((i7 & SemanticState.Obscured) != 0) {
                apqs apqsVar = amgjVar.dm;
                return apqsVar == null ? apqs.a : apqsVar;
            }
            if ((i7 & SemanticState.Multiline) != 0) {
                amqm amqmVar = amgjVar.dn;
                return amqmVar == null ? amqm.a : amqmVar;
            }
            if ((i7 & 16384) != 0) {
                aqfo aqfoVar = amgjVar.f4do;
                return aqfoVar == null ? aqfo.a : aqfoVar;
            }
            if ((i7 & 32768) != 0) {
                amon amonVar = amgjVar.dp;
                return amonVar == null ? amon.a : amonVar;
            }
            if ((i7 & 65536) != 0) {
                amss amssVar = amgjVar.dq;
                return amssVar == null ? amss.a : amssVar;
            }
            if ((i7 & 131072) != 0) {
                amsa amsaVar = amgjVar.dr;
                return amsaVar == null ? amsa.a : amsaVar;
            }
            if ((i7 & 262144) != 0) {
                ajqx ajqxVar = amgjVar.ds;
                return ajqxVar == null ? ajqx.a : ajqxVar;
            }
            if ((i7 & 524288) != 0) {
                akmt akmtVar = amgjVar.dt;
                return akmtVar == null ? akmt.a : akmtVar;
            }
            if ((i7 & 1048576) != 0) {
                aker akerVar = amgjVar.du;
                return akerVar == null ? aker.a : akerVar;
            }
            if ((i7 & 2097152) != 0) {
                akav akavVar = amgjVar.dv;
                return akavVar == null ? akav.a : akavVar;
            }
            if ((4194304 & i7) != 0) {
                aqmn aqmnVar = amgjVar.dw;
                return aqmnVar == null ? aqmn.a : aqmnVar;
            }
            if ((8388608 & i7) != 0) {
                angj angjVar = amgjVar.dx;
                return angjVar == null ? angj.a : angjVar;
            }
            if ((16777216 & i7) != 0) {
                apdf apdfVar = amgjVar.dy;
                return apdfVar == null ? apdf.a : apdfVar;
            }
            if ((33554432 & i7) != 0) {
                alic alicVar = amgjVar.dz;
                return alicVar == null ? alic.a : alicVar;
            }
            if ((67108864 & i7) != 0) {
                ajow ajowVar = amgjVar.dA;
                return ajowVar == null ? ajow.a : ajowVar;
            }
            if ((134217728 & i7) != 0) {
                alef alefVar = amgjVar.dB;
                return alefVar == null ? alef.a : alefVar;
            }
            if ((268435456 & i7) != 0) {
                apog apogVar = amgjVar.dC;
                return apogVar == null ? apog.a : apogVar;
            }
            if ((536870912 & i7) != 0) {
                ajrl ajrlVar = amgjVar.dD;
                return ajrlVar == null ? ajrl.a : ajrlVar;
            }
            if ((1073741824 & i7) != 0) {
                akdl akdlVar = amgjVar.dE;
                return akdlVar == null ? akdl.a : akdlVar;
            }
            if ((i7 & Integer.MIN_VALUE) != 0) {
                ajnf ajnfVar = amgjVar.dF;
                return ajnfVar == null ? ajnf.a : ajnfVar;
            }
            int i8 = amgjVar.i;
            if ((i8 & 1) != 0) {
                ajno ajnoVar = amgjVar.dG;
                return ajnoVar == null ? ajno.a : ajnoVar;
            }
            if ((i8 & 2) != 0) {
                aiwq aiwqVar = amgjVar.dH;
                return aiwqVar == null ? aiwq.a : aiwqVar;
            }
            if ((i8 & 4) != 0) {
                aoml aomlVar = amgjVar.dI;
                return aomlVar == null ? aoml.a : aomlVar;
            }
            if ((i8 & 8) != 0) {
                apfe apfeVar = amgjVar.dJ;
                return apfeVar == null ? apfe.a : apfeVar;
            }
            if ((i8 & 16) != 0) {
                apdx apdxVar = amgjVar.dK;
                return apdxVar == null ? apdx.a : apdxVar;
            }
            if ((i8 & 32) != 0) {
                apdz apdzVar = amgjVar.dL;
                return apdzVar == null ? apdz.a : apdzVar;
            }
            if ((i8 & 64) != 0) {
                apwv apwvVar = amgjVar.dM;
                return apwvVar == null ? apwv.a : apwvVar;
            }
            if ((i8 & SemanticState.Focused) != 0) {
                apfc apfcVar = amgjVar.dN;
                return apfcVar == null ? apfc.a : apfcVar;
            }
            if ((i8 & SemanticState.Hidden) != 0) {
                aqmp aqmpVar = amgjVar.dO;
                return aqmpVar == null ? aqmp.a : aqmpVar;
            }
            if ((i8 & SemanticState.LiveRegion) != 0) {
                akrn akrnVar = amgjVar.dP;
                return akrnVar == null ? akrn.a : akrnVar;
            }
            if ((i8 & SemanticState.ReadOnly) != 0) {
                aoga aogaVar = amgjVar.dQ;
                return aogaVar == null ? aoga.a : aogaVar;
            }
            if ((i8 & SemanticState.Modal) != 0) {
                amhb amhbVar = amgjVar.dR;
                return amhbVar == null ? amhb.a : amhbVar;
            }
            if ((i8 & SemanticState.Obscured) != 0) {
                amhc amhcVar = amgjVar.dS;
                return amhcVar == null ? amhc.a : amhcVar;
            }
            if ((i8 & SemanticState.Multiline) != 0) {
                amhe amheVar = amgjVar.dT;
                return amheVar == null ? amhe.a : amheVar;
            }
            if ((i8 & 16384) != 0) {
                ajtg ajtgVar = amgjVar.dU;
                return ajtgVar == null ? ajtg.a : ajtgVar;
            }
            if ((i8 & 32768) != 0) {
                akxi akxiVar = amgjVar.dV;
                return akxiVar == null ? akxi.a : akxiVar;
            }
            if ((i8 & 65536) != 0) {
                amlj amljVar = amgjVar.dW;
                return amljVar == null ? amlj.a : amljVar;
            }
            if ((i8 & 131072) != 0) {
                aite aiteVar = amgjVar.dX;
                return aiteVar == null ? aite.a : aiteVar;
            }
            if ((i8 & 262144) != 0) {
                aity aityVar = amgjVar.dY;
                return aityVar == null ? aity.a : aityVar;
            }
            if ((i8 & 524288) != 0) {
                aivz aivzVar = amgjVar.dZ;
                return aivzVar == null ? aivz.a : aivzVar;
            }
            if ((i8 & 1048576) != 0) {
                aqew aqewVar = amgjVar.ea;
                return aqewVar == null ? aqew.a : aqewVar;
            }
            if ((i8 & 2097152) != 0) {
                aoxh aoxhVar = amgjVar.eb;
                return aoxhVar == null ? aoxh.a : aoxhVar;
            }
            if ((4194304 & i8) != 0) {
                apdj apdjVar = amgjVar.ec;
                return apdjVar == null ? apdj.a : apdjVar;
            }
            if ((8388608 & i8) != 0) {
                ajjp ajjpVar = amgjVar.ed;
                return ajjpVar == null ? ajjp.a : ajjpVar;
            }
            if ((16777216 & i8) != 0) {
                ajjy ajjyVar = amgjVar.ee;
                return ajjyVar == null ? ajjy.a : ajjyVar;
            }
            if ((33554432 & i8) != 0) {
                ajka ajkaVar = amgjVar.ef;
                return ajkaVar == null ? ajka.a : ajkaVar;
            }
            if ((67108864 & i8) != 0) {
                aozd aozdVar = amgjVar.eg;
                return aozdVar == null ? aozd.a : aozdVar;
            }
            if ((134217728 & i8) != 0) {
                amhy amhyVar = amgjVar.eh;
                return amhyVar == null ? amhy.a : amhyVar;
            }
            if ((268435456 & i8) != 0) {
                amsx amsxVar = amgjVar.ei;
                return amsxVar == null ? amsx.a : amsxVar;
            }
            if ((536870912 & i8) != 0) {
                amif amifVar = amgjVar.ej;
                return amifVar == null ? amif.a : amifVar;
            }
            if ((1073741824 & i8) != 0) {
                aqqf aqqfVar = amgjVar.ek;
                return aqqfVar == null ? aqqf.a : aqqfVar;
            }
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aodj aodjVar = amgjVar.el;
                return aodjVar == null ? aodj.a : aodjVar;
            }
            int i9 = amgjVar.j;
            if ((i9 & 1) != 0) {
                aqon aqonVar = amgjVar.em;
                return aqonVar == null ? aqon.a : aqonVar;
            }
            if ((i9 & 2) != 0) {
                albb albbVar = amgjVar.en;
                return albbVar == null ? albb.a : albbVar;
            }
            if ((i9 & 4) != 0) {
                albc albcVar = amgjVar.eo;
                return albcVar == null ? albc.a : albcVar;
            }
            if ((i9 & 8) != 0) {
                ajad ajadVar = amgjVar.ep;
                return ajadVar == null ? ajad.a : ajadVar;
            }
            if ((i9 & 16) != 0) {
                arhq arhqVar = amgjVar.eq;
                return arhqVar == null ? arhq.a : arhqVar;
            }
            if ((i9 & 32) != 0) {
                amst amstVar = amgjVar.er;
                return amstVar == null ? amst.a : amstVar;
            }
            if ((i9 & 64) != 0) {
                aoyl aoylVar = amgjVar.es;
                return aoylVar == null ? aoyl.a : aoylVar;
            }
            if ((i9 & SemanticState.Focused) != 0) {
                ajgv ajgvVar = amgjVar.et;
                return ajgvVar == null ? ajgv.a : ajgvVar;
            }
            if ((i9 & SemanticState.Hidden) != 0) {
                amij amijVar = amgjVar.eu;
                return amijVar == null ? amij.a : amijVar;
            }
            if ((i9 & SemanticState.LiveRegion) != 0) {
                amik amikVar = amgjVar.ev;
                return amikVar == null ? amik.a : amikVar;
            }
            if ((i9 & SemanticState.ReadOnly) != 0) {
                akpd akpdVar = amgjVar.ew;
                return akpdVar == null ? akpd.a : akpdVar;
            }
            if ((i9 & SemanticState.Modal) != 0) {
                amim amimVar = amgjVar.ex;
                return amimVar == null ? amim.a : amimVar;
            }
            if ((i9 & SemanticState.Obscured) != 0) {
                aoyg aoygVar = amgjVar.ey;
                return aoygVar == null ? aoyg.a : aoygVar;
            }
            if ((i9 & SemanticState.Multiline) != 0) {
                aqoj aqojVar = amgjVar.ez;
                return aqojVar == null ? aqoj.a : aqojVar;
            }
            if ((i9 & 16384) != 0) {
                apry apryVar = amgjVar.eA;
                return apryVar == null ? apry.a : apryVar;
            }
            if ((i9 & 32768) != 0) {
                aprx aprxVar = amgjVar.eB;
                return aprxVar == null ? aprx.a : aprxVar;
            }
            if ((i9 & 65536) != 0) {
                aokw aokwVar = amgjVar.eC;
                return aokwVar == null ? aokw.a : aokwVar;
            }
            if ((i9 & 131072) != 0) {
                aqno aqnoVar = amgjVar.eD;
                return aqnoVar == null ? aqno.a : aqnoVar;
            }
            if ((i9 & 262144) != 0) {
                aqbs aqbsVar = amgjVar.eE;
                return aqbsVar == null ? aqbs.a : aqbsVar;
            }
            if ((i9 & 524288) != 0) {
                aqbw aqbwVar = amgjVar.eF;
                return aqbwVar == null ? aqbw.a : aqbwVar;
            }
            if ((i9 & 1048576) != 0) {
                aqcd aqcdVar = amgjVar.eG;
                return aqcdVar == null ? aqcd.a : aqcdVar;
            }
            if ((i9 & 2097152) != 0) {
                aqbq aqbqVar = amgjVar.eH;
                return aqbqVar == null ? aqbq.a : aqbqVar;
            }
            if ((4194304 & i9) != 0) {
                aqbx aqbxVar = amgjVar.eI;
                return aqbxVar == null ? aqbx.a : aqbxVar;
            }
            if ((8388608 & i9) != 0) {
                aqbz aqbzVar = amgjVar.eJ;
                return aqbzVar == null ? aqbz.a : aqbzVar;
            }
            if ((16777216 & i9) != 0) {
                aqby aqbyVar = amgjVar.eK;
                return aqbyVar == null ? aqby.a : aqbyVar;
            }
            if ((33554432 & i9) != 0) {
                aqbu aqbuVar = amgjVar.eL;
                return aqbuVar == null ? aqbu.a : aqbuVar;
            }
            if ((67108864 & i9) != 0) {
                ajna ajnaVar = amgjVar.eM;
                return ajnaVar == null ? ajna.a : ajnaVar;
            }
            if ((134217728 & i9) != 0) {
                aodr aodrVar = amgjVar.eN;
                return aodrVar == null ? aodr.a : aodrVar;
            }
            if ((268435456 & i9) != 0) {
                ajfl ajflVar = amgjVar.eO;
                return ajflVar == null ? ajfl.a : ajflVar;
            }
            if ((536870912 & i9) != 0) {
                akxh akxhVar = amgjVar.eP;
                return akxhVar == null ? akxh.a : akxhVar;
            }
            if ((1073741824 & i9) != 0) {
                akau akauVar = amgjVar.eQ;
                return akauVar == null ? akau.a : akauVar;
            }
            if ((i9 & Integer.MIN_VALUE) != 0) {
                akmq akmqVar = amgjVar.eR;
                return akmqVar == null ? akmq.a : akmqVar;
            }
            int i10 = amgjVar.k;
            if ((i10 & 1) != 0) {
                ajoo ajooVar = amgjVar.eS;
                return ajooVar == null ? ajoo.a : ajooVar;
            }
            if ((i10 & 2) != 0) {
                ariq ariqVar = amgjVar.eT;
                return ariqVar == null ? ariq.a : ariqVar;
            }
            if ((i10 & 4) != 0) {
                ajvd ajvdVar = amgjVar.eU;
                return ajvdVar == null ? ajvd.a : ajvdVar;
            }
            if ((i10 & 8) != 0) {
                ajvf ajvfVar = amgjVar.eV;
                return ajvfVar == null ? ajvf.a : ajvfVar;
            }
            if ((i10 & 16) != 0) {
                ajon ajonVar = amgjVar.eW;
                return ajonVar == null ? ajon.a : ajonVar;
            }
            if ((i10 & 32) != 0) {
                ajoq ajoqVar = amgjVar.eX;
                return ajoqVar == null ? ajoq.a : ajoqVar;
            }
            if ((i10 & 64) != 0) {
                ajor ajorVar = amgjVar.eY;
                return ajorVar == null ? ajor.a : ajorVar;
            }
            if ((i10 & SemanticState.Focused) != 0) {
                ajos ajosVar = amgjVar.eZ;
                return ajosVar == null ? ajos.a : ajosVar;
            }
            if ((i10 & SemanticState.Hidden) != 0) {
                arjd arjdVar = amgjVar.fa;
                return arjdVar == null ? arjd.a : arjdVar;
            }
            if ((i10 & SemanticState.LiveRegion) != 0) {
                arjj arjjVar = amgjVar.fb;
                return arjjVar == null ? arjj.a : arjjVar;
            }
            if ((i10 & SemanticState.ReadOnly) != 0) {
                aqaj aqajVar = amgjVar.fc;
                return aqajVar == null ? aqaj.a : aqajVar;
            }
            if ((i10 & SemanticState.Modal) != 0) {
                ajzo ajzoVar = amgjVar.fd;
                return ajzoVar == null ? ajzo.a : ajzoVar;
            }
            if ((i10 & SemanticState.Obscured) != 0) {
                ajzn ajznVar = amgjVar.fe;
                return ajznVar == null ? ajzn.a : ajznVar;
            }
            if ((i10 & SemanticState.Multiline) != 0) {
                alhh alhhVar = amgjVar.ff;
                return alhhVar == null ? alhh.a : alhhVar;
            }
            if ((i10 & 16384) != 0) {
                akcf akcfVar = amgjVar.fg;
                return akcfVar == null ? akcf.a : akcfVar;
            }
            if ((i10 & 32768) != 0) {
                aonz aonzVar = amgjVar.fh;
                return aonzVar == null ? aonz.a : aonzVar;
            }
            if ((i10 & 65536) != 0) {
                aizy aizyVar = amgjVar.fi;
                return aizyVar == null ? aizy.a : aizyVar;
            }
            if ((i10 & 131072) != 0) {
                akmj akmjVar = amgjVar.fj;
                return akmjVar == null ? akmj.a : akmjVar;
            }
            if ((i10 & 262144) != 0) {
                ajou ajouVar = amgjVar.fk;
                return ajouVar == null ? ajou.a : ajouVar;
            }
            if ((i10 & 524288) != 0) {
                aisr aisrVar = amgjVar.fl;
                return aisrVar == null ? aisr.a : aisrVar;
            }
            if ((i10 & 1048576) != 0) {
                aqmq aqmqVar = amgjVar.fm;
                return aqmqVar == null ? aqmq.a : aqmqVar;
            }
            if ((i10 & 2097152) != 0) {
                amko amkoVar = amgjVar.fn;
                return amkoVar == null ? amko.a : amkoVar;
            }
            if ((4194304 & i10) != 0) {
                aoyf aoyfVar = amgjVar.fo;
                return aoyfVar == null ? aoyf.a : aoyfVar;
            }
            if ((8388608 & i10) != 0) {
                alkh alkhVar = amgjVar.fp;
                return alkhVar == null ? alkh.a : alkhVar;
            }
            if ((16777216 & i10) != 0) {
                alki alkiVar = amgjVar.fq;
                return alkiVar == null ? alki.a : alkiVar;
            }
            if ((33554432 & i10) != 0) {
                akei akeiVar = amgjVar.fr;
                return akeiVar == null ? akei.a : akeiVar;
            }
            if ((67108864 & i10) != 0) {
                akej akejVar = amgjVar.fs;
                return akejVar == null ? akej.a : akejVar;
            }
            if ((134217728 & i10) != 0) {
                algz algzVar = amgjVar.ft;
                return algzVar == null ? algz.a : algzVar;
            }
            if ((268435456 & i10) != 0) {
                aiqn aiqnVar = amgjVar.fu;
                return aiqnVar == null ? aiqn.a : aiqnVar;
            }
            if ((536870912 & i10) != 0) {
                aiqo aiqoVar = amgjVar.fv;
                return aiqoVar == null ? aiqo.a : aiqoVar;
            }
            if ((1073741824 & i10) != 0) {
                anzn anznVar = amgjVar.fw;
                return anznVar == null ? anzn.a : anznVar;
            }
            if ((i10 & Integer.MIN_VALUE) != 0) {
                ajta ajtaVar = amgjVar.fx;
                return ajtaVar == null ? ajta.a : ajtaVar;
            }
            int i11 = amgjVar.l;
            if ((i11 & 1) != 0) {
                aqco aqcoVar = amgjVar.fy;
                return aqcoVar == null ? aqco.a : aqcoVar;
            }
            if ((i11 & 2) != 0) {
                aklf aklfVar = amgjVar.fz;
                return aklfVar == null ? aklf.a : aklfVar;
            }
            if ((i11 & 4) != 0) {
                ajvg ajvgVar = amgjVar.fA;
                return ajvgVar == null ? ajvg.a : ajvgVar;
            }
            if ((i11 & 8) != 0) {
                aozh aozhVar = amgjVar.fB;
                return aozhVar == null ? aozh.a : aozhVar;
            }
            if ((i11 & 16) != 0) {
                ajsb ajsbVar = amgjVar.fC;
                return ajsbVar == null ? ajsb.a : ajsbVar;
            }
            if ((i11 & 32) != 0) {
                ajrh ajrhVar = amgjVar.fD;
                return ajrhVar == null ? ajrh.a : ajrhVar;
            }
            if ((i11 & 64) != 0) {
                amwm amwmVar = amgjVar.fE;
                return amwmVar == null ? amwm.a : amwmVar;
            }
            if ((i11 & SemanticState.Focused) != 0) {
                ajob ajobVar = amgjVar.fF;
                return ajobVar == null ? ajob.a : ajobVar;
            }
            if ((i11 & SemanticState.Hidden) != 0) {
                alig aligVar = amgjVar.fG;
                return aligVar == null ? alig.a : aligVar;
            }
            if ((i11 & SemanticState.LiveRegion) != 0) {
                akvw akvwVar = amgjVar.fH;
                return akvwVar == null ? akvw.a : akvwVar;
            }
            if ((i11 & SemanticState.ReadOnly) != 0) {
                akaq akaqVar = amgjVar.fI;
                return akaqVar == null ? akaq.a : akaqVar;
            }
            if ((i11 & SemanticState.Modal) != 0) {
                akap akapVar = amgjVar.fJ;
                return akapVar == null ? akap.a : akapVar;
            }
            if ((i11 & SemanticState.Obscured) != 0) {
                akyl akylVar = amgjVar.fK;
                return akylVar == null ? akyl.a : akylVar;
            }
            if ((i11 & SemanticState.Multiline) != 0) {
                akqz akqzVar = amgjVar.fL;
                return akqzVar == null ? akqz.a : akqzVar;
            }
            if ((i11 & 16384) != 0) {
                aplh aplhVar = amgjVar.fM;
                return aplhVar == null ? aplh.a : aplhVar;
            }
            if ((i11 & 32768) != 0) {
                akvs akvsVar = amgjVar.fN;
                return akvsVar == null ? akvs.a : akvsVar;
            }
            if ((i11 & 65536) != 0) {
                apdb apdbVar = amgjVar.fO;
                return apdbVar == null ? apdb.a : apdbVar;
            }
            if ((i11 & 131072) != 0) {
                aozb aozbVar = amgjVar.fP;
                return aozbVar == null ? aozb.a : aozbVar;
            }
            if ((i11 & 262144) != 0) {
                algi algiVar = amgjVar.fQ;
                return algiVar == null ? algi.a : algiVar;
            }
            if ((i11 & 524288) != 0) {
                algj algjVar = amgjVar.fR;
                return algjVar == null ? algj.a : algjVar;
            }
            if ((i11 & 1048576) != 0) {
                algl alglVar = amgjVar.fS;
                return alglVar == null ? algl.a : alglVar;
            }
            if ((i11 & 2097152) != 0) {
                algk algkVar = amgjVar.fT;
                return algkVar == null ? algk.a : algkVar;
            }
            if ((4194304 & i11) != 0) {
                algm algmVar = amgjVar.fU;
                return algmVar == null ? algm.a : algmVar;
            }
            if ((8388608 & i11) != 0) {
                algh alghVar = amgjVar.fV;
                return alghVar == null ? algh.a : alghVar;
            }
            if ((16777216 & i11) != 0) {
                aivt aivtVar = amgjVar.fW;
                return aivtVar == null ? aivt.a : aivtVar;
            }
            if ((33554432 & i11) != 0) {
                algs algsVar = amgjVar.fX;
                return algsVar == null ? algs.a : algsVar;
            }
            if ((67108864 & i11) != 0) {
                aowc aowcVar = amgjVar.fY;
                return aowcVar == null ? aowc.a : aowcVar;
            }
            if ((134217728 & i11) != 0) {
                aplj apljVar = amgjVar.fZ;
                return apljVar == null ? aplj.a : apljVar;
            }
            if ((268435456 & i11) != 0) {
                apob apobVar = amgjVar.ga;
                return apobVar == null ? apob.a : apobVar;
            }
            if ((536870912 & i11) != 0) {
                amln amlnVar = amgjVar.gb;
                return amlnVar == null ? amln.a : amlnVar;
            }
            if ((1073741824 & i11) != 0) {
                anps anpsVar = amgjVar.gc;
                return anpsVar == null ? anps.a : anpsVar;
            }
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aphm aphmVar = amgjVar.gd;
                return aphmVar == null ? aphm.a : aphmVar;
            }
            int i12 = amgjVar.m;
            if ((i12 & 1) != 0) {
                aoze aozeVar = amgjVar.ge;
                return aozeVar == null ? aoze.a : aozeVar;
            }
            if ((i12 & 2) != 0) {
                apnk apnkVar = amgjVar.gf;
                return apnkVar == null ? apnk.a : apnkVar;
            }
            if ((i12 & 4) != 0) {
                apbz apbzVar = amgjVar.gg;
                return apbzVar == null ? apbz.a : apbzVar;
            }
            if ((i12 & 8) != 0) {
                anic anicVar = amgjVar.gh;
                return anicVar == null ? anic.a : anicVar;
            }
            if ((i12 & 16) != 0) {
                anpt anptVar = amgjVar.gi;
                return anptVar == null ? anpt.a : anptVar;
            }
            if ((i12 & 32) != 0) {
                apvc apvcVar = amgjVar.gj;
                return apvcVar == null ? apvc.a : apvcVar;
            }
            if ((i12 & 64) != 0) {
                apuz apuzVar = amgjVar.gk;
                return apuzVar == null ? apuz.a : apuzVar;
            }
            if ((i12 & SemanticState.Focused) != 0) {
                apuy apuyVar = amgjVar.gl;
                return apuyVar == null ? apuy.a : apuyVar;
            }
            if ((i12 & SemanticState.Hidden) != 0) {
                apva apvaVar = amgjVar.gm;
                return apvaVar == null ? apva.a : apvaVar;
            }
            if ((i12 & SemanticState.LiveRegion) != 0) {
                aoks aoksVar = amgjVar.gn;
                return aoksVar == null ? aoks.a : aoksVar;
            }
            if ((i12 & SemanticState.ReadOnly) != 0) {
                akfz akfzVar = amgjVar.go;
                return akfzVar == null ? akfz.a : akfzVar;
            }
            if ((i12 & SemanticState.Modal) != 0) {
                arcx arcxVar = amgjVar.gp;
                return arcxVar == null ? arcx.a : arcxVar;
            }
            if ((i12 & SemanticState.Obscured) != 0) {
                akga akgaVar = amgjVar.gq;
                return akgaVar == null ? akga.a : akgaVar;
            }
            if ((i12 & SemanticState.Multiline) != 0) {
                akgb akgbVar = amgjVar.gr;
                return akgbVar == null ? akgb.a : akgbVar;
            }
            if ((i12 & 16384) != 0) {
                akkz akkzVar = amgjVar.gs;
                return akkzVar == null ? akkz.a : akkzVar;
            }
            if ((i12 & 32768) != 0) {
                arcy arcyVar = amgjVar.gt;
                return arcyVar == null ? arcy.a : arcyVar;
            }
            if ((i12 & 65536) != 0) {
                akwu akwuVar = amgjVar.gu;
                return akwuVar == null ? akwu.a : akwuVar;
            }
            if ((i12 & 131072) != 0) {
                aqpa aqpaVar = amgjVar.gv;
                return aqpaVar == null ? aqpa.a : aqpaVar;
            }
            if ((i12 & 262144) != 0) {
                aqne aqneVar = amgjVar.gw;
                return aqneVar == null ? aqne.a : aqneVar;
            }
            if ((i12 & 524288) != 0) {
                aqnd aqndVar = amgjVar.gx;
                return aqndVar == null ? aqnd.a : aqndVar;
            }
            if ((i12 & 1048576) != 0) {
                arcn arcnVar = amgjVar.gy;
                return arcnVar == null ? arcn.a : arcnVar;
            }
            if ((i12 & 2097152) != 0) {
                amuz amuzVar = amgjVar.gz;
                return amuzVar == null ? amuz.a : amuzVar;
            }
            if ((4194304 & i12) != 0) {
                arcm arcmVar = amgjVar.gA;
                return arcmVar == null ? arcm.a : arcmVar;
            }
            if ((8388608 & i12) != 0) {
                akxp akxpVar = amgjVar.gB;
                return akxpVar == null ? akxp.a : akxpVar;
            }
            if ((16777216 & i12) != 0) {
                akxm akxmVar = amgjVar.gC;
                return akxmVar == null ? akxm.a : akxmVar;
            }
            if ((33554432 & i12) != 0) {
                akxn akxnVar = amgjVar.gD;
                return akxnVar == null ? akxn.a : akxnVar;
            }
            if ((67108864 & i12) != 0) {
                akxo akxoVar = amgjVar.gE;
                return akxoVar == null ? akxo.a : akxoVar;
            }
            if ((134217728 & i12) != 0) {
                akxl akxlVar = amgjVar.gF;
                return akxlVar == null ? akxl.a : akxlVar;
            }
            if ((268435456 & i12) != 0) {
                aref arefVar = amgjVar.gG;
                return arefVar == null ? aref.a : arefVar;
            }
            if ((536870912 & i12) != 0) {
                ajjc ajjcVar = amgjVar.gH;
                return ajjcVar == null ? ajjc.a : ajjcVar;
            }
            if ((1073741824 & i12) != 0) {
                akvt akvtVar = amgjVar.gI;
                return akvtVar == null ? akvt.a : akvtVar;
            }
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aleg alegVar = amgjVar.gJ;
                return alegVar == null ? aleg.a : alegVar;
            }
            int i13 = amgjVar.n;
            if ((i13 & 1) != 0) {
                aomf aomfVar = amgjVar.gK;
                return aomfVar == null ? aomf.a : aomfVar;
            }
            if ((i13 & 2) != 0) {
                apoc apocVar = amgjVar.gL;
                return apocVar == null ? apoc.a : apocVar;
            }
            if ((i13 & 4) != 0) {
                aoun aounVar = amgjVar.gM;
                return aounVar == null ? aoun.a : aounVar;
            }
            if ((i13 & 8) != 0) {
                apus apusVar = amgjVar.gN;
                return apusVar == null ? apus.a : apusVar;
            }
            if ((i13 & 16) != 0) {
                arng arngVar = amgjVar.gO;
                return arngVar == null ? arng.a : arngVar;
            }
            if ((i13 & 32) != 0) {
                ajsq ajsqVar = amgjVar.gP;
                return ajsqVar == null ? ajsq.a : ajsqVar;
            }
            if ((i13 & 64) != 0) {
                ajaj ajajVar = amgjVar.gQ;
                return ajajVar == null ? ajaj.a : ajajVar;
            }
            if ((i13 & SemanticState.Focused) != 0) {
                ajsp ajspVar = amgjVar.gR;
                return ajspVar == null ? ajsp.a : ajspVar;
            }
            if ((i13 & SemanticState.Hidden) != 0) {
                ajsr ajsrVar = amgjVar.gS;
                return ajsrVar == null ? ajsr.a : ajsrVar;
            }
            if ((i13 & SemanticState.LiveRegion) != 0) {
                ajso ajsoVar = amgjVar.gT;
                return ajsoVar == null ? ajso.a : ajsoVar;
            }
            if ((i13 & SemanticState.ReadOnly) != 0) {
                aqfm aqfmVar = amgjVar.gU;
                return aqfmVar == null ? aqfm.a : aqfmVar;
            }
            if ((i13 & SemanticState.Modal) != 0) {
                arem aremVar = amgjVar.gV;
                return aremVar == null ? arem.a : aremVar;
            }
            if ((i13 & SemanticState.Obscured) != 0) {
                ardu arduVar = amgjVar.gW;
                return arduVar == null ? ardu.a : arduVar;
            }
            if ((i13 & SemanticState.Multiline) != 0) {
                aodm aodmVar = amgjVar.gX;
                return aodmVar == null ? aodm.a : aodmVar;
            }
            if ((i13 & 16384) != 0) {
                ajal ajalVar = amgjVar.gY;
                return ajalVar == null ? ajal.a : ajalVar;
            }
            if ((i13 & 32768) != 0) {
                apll apllVar = amgjVar.gZ;
                return apllVar == null ? apll.a : apllVar;
            }
            if ((i13 & 65536) != 0) {
                ajte ajteVar = amgjVar.ha;
                return ajteVar == null ? ajte.a : ajteVar;
            }
            if ((i13 & 131072) != 0) {
                aiqg aiqgVar = amgjVar.hb;
                return aiqgVar == null ? aiqg.a : aiqgVar;
            }
            if ((i13 & 262144) != 0) {
                amkh amkhVar = amgjVar.hc;
                return amkhVar == null ? amkh.a : amkhVar;
            }
            if ((i13 & 524288) != 0) {
                amkg amkgVar = amgjVar.hd;
                return amkgVar == null ? amkg.a : amkgVar;
            }
            if ((i13 & 1048576) != 0) {
                amki amkiVar = amgjVar.he;
                return amkiVar == null ? amki.a : amkiVar;
            }
            if ((i13 & 2097152) != 0) {
                alfk alfkVar = amgjVar.hf;
                return alfkVar == null ? alfk.a : alfkVar;
            }
            if ((4194304 & i13) != 0) {
                akmn akmnVar = amgjVar.hg;
                return akmnVar == null ? akmn.a : akmnVar;
            }
            if ((8388608 & i13) != 0) {
                apvh apvhVar = amgjVar.hh;
                return apvhVar == null ? apvh.a : apvhVar;
            }
            if ((16777216 & i13) != 0) {
                akii akiiVar = amgjVar.hi;
                return akiiVar == null ? akii.a : akiiVar;
            }
            if ((33554432 & i13) != 0) {
                aozi aoziVar = amgjVar.hj;
                return aoziVar == null ? aozi.a : aoziVar;
            }
            if ((67108864 & i13) != 0) {
                alij alijVar = amgjVar.hk;
                return alijVar == null ? alij.a : alijVar;
            }
            if ((134217728 & i13) != 0) {
                aiwi aiwiVar = amgjVar.hl;
                return aiwiVar == null ? aiwi.a : aiwiVar;
            }
            if ((268435456 & i13) != 0) {
                aqht aqhtVar = amgjVar.hm;
                return aqhtVar == null ? aqht.a : aqhtVar;
            }
            if ((536870912 & i13) != 0) {
                akys akysVar = amgjVar.hn;
                return akysVar == null ? akys.a : akysVar;
            }
            if ((1073741824 & i13) != 0) {
                ajky ajkyVar = amgjVar.ho;
                return ajkyVar == null ? ajky.a : ajkyVar;
            }
            if ((i13 & Integer.MIN_VALUE) != 0) {
                amlk amlkVar = amgjVar.hp;
                return amlkVar == null ? amlk.a : amlkVar;
            }
            int i14 = amgjVar.o;
            if ((i14 & 1) != 0) {
                apkr apkrVar = amgjVar.hq;
                return apkrVar == null ? apkr.a : apkrVar;
            }
            if ((i14 & 2) != 0) {
                ajfq ajfqVar = amgjVar.hr;
                return ajfqVar == null ? ajfq.a : ajfqVar;
            }
            if ((i14 & 4) != 0) {
                aktr aktrVar = amgjVar.hs;
                return aktrVar == null ? aktr.a : aktrVar;
            }
            if ((i14 & 8) != 0) {
                ajfo ajfoVar = amgjVar.ht;
                return ajfoVar == null ? ajfo.a : ajfoVar;
            }
            if ((i14 & 16) != 0) {
                ajfp ajfpVar = amgjVar.hu;
                return ajfpVar == null ? ajfp.a : ajfpVar;
            }
            if ((i14 & 32) != 0) {
                akes akesVar = amgjVar.hv;
                return akesVar == null ? akes.a : akesVar;
            }
            if ((i14 & 64) != 0) {
                ajzl ajzlVar = amgjVar.hw;
                return ajzlVar == null ? ajzl.a : ajzlVar;
            }
            if ((i14 & SemanticState.Focused) != 0) {
                akvy akvyVar = amgjVar.hx;
                return akvyVar == null ? akvy.a : akvyVar;
            }
            if ((i14 & SemanticState.Hidden) != 0) {
                akvz akvzVar = amgjVar.hy;
                return akvzVar == null ? akvz.a : akvzVar;
            }
            if ((i14 & SemanticState.LiveRegion) != 0) {
                akwa akwaVar = amgjVar.hz;
                return akwaVar == null ? akwa.a : akwaVar;
            }
            if ((i14 & SemanticState.ReadOnly) != 0) {
                akwb akwbVar = amgjVar.hA;
                return akwbVar == null ? akwb.a : akwbVar;
            }
            if ((i14 & SemanticState.Modal) != 0) {
                akwc akwcVar = amgjVar.hB;
                return akwcVar == null ? akwc.a : akwcVar;
            }
            if ((i14 & SemanticState.Obscured) != 0) {
                akyr akyrVar = amgjVar.hC;
                return akyrVar == null ? akyr.a : akyrVar;
            }
            if ((i14 & SemanticState.Multiline) != 0) {
                aqnx aqnxVar = amgjVar.hD;
                return aqnxVar == null ? aqnx.a : aqnxVar;
            }
            if ((i14 & 16384) != 0) {
                ajot ajotVar = amgjVar.hE;
                return ajotVar == null ? ajot.a : ajotVar;
            }
            if ((32768 & i14) != 0) {
                amkk amkkVar = amgjVar.hF;
                return amkkVar == null ? amkk.a : amkkVar;
            }
            if ((65536 & i14) != 0) {
                akcn akcnVar = amgjVar.hG;
                return akcnVar == null ? akcn.a : akcnVar;
            }
            if ((131072 & i14) != 0) {
                ajxc ajxcVar = amgjVar.hH;
                return ajxcVar == null ? ajxc.a : ajxcVar;
            }
            if ((262144 & i14) != 0) {
                aqnf aqnfVar = amgjVar.hI;
                return aqnfVar == null ? aqnf.a : aqnfVar;
            }
            if ((524288 & i14) != 0) {
                aqea aqeaVar = amgjVar.hJ;
                return aqeaVar == null ? aqea.a : aqeaVar;
            }
            if ((1048576 & i14) != 0) {
                aoyj aoyjVar = amgjVar.hK;
                return aoyjVar == null ? aoyj.a : aoyjVar;
            }
            if ((2097152 & i14) != 0) {
                aoyi aoyiVar = amgjVar.hL;
                return aoyiVar == null ? aoyi.a : aoyiVar;
            }
            if ((4194304 & i14) != 0) {
                aqbi aqbiVar = amgjVar.hM;
                return aqbiVar == null ? aqbi.a : aqbiVar;
            }
            if ((8388608 & i14) != 0) {
                ajaf ajafVar = amgjVar.hN;
                return ajafVar == null ? ajaf.a : ajafVar;
            }
            if ((16777216 & i14) != 0) {
                ajah ajahVar = amgjVar.hO;
                return ajahVar == null ? ajah.a : ajahVar;
            }
            if ((33554432 & i14) != 0) {
                arda ardaVar = amgjVar.hP;
                return ardaVar == null ? arda.a : ardaVar;
            }
            if ((67108864 & i14) != 0) {
                ajwa ajwaVar = amgjVar.hQ;
                return ajwaVar == null ? ajwa.a : ajwaVar;
            }
            if ((134217728 & i14) != 0) {
                akwt akwtVar = amgjVar.hR;
                return akwtVar == null ? akwt.a : akwtVar;
            }
            if ((268435456 & i14) != 0) {
                anhf anhfVar = amgjVar.hS;
                return anhfVar == null ? anhf.a : anhfVar;
            }
            if ((536870912 & i14) != 0) {
                aplm aplmVar = amgjVar.hT;
                return aplmVar == null ? aplm.a : aplmVar;
            }
            if ((1073741824 & i14) != 0) {
                aqmm aqmmVar = amgjVar.hU;
                return aqmmVar == null ? aqmm.a : aqmmVar;
            }
            if ((i14 & Integer.MIN_VALUE) != 0) {
                ajsf ajsfVar = amgjVar.hV;
                return ajsfVar == null ? ajsf.a : ajsfVar;
            }
            if ((amgjVar.p & 1) != 0) {
                arnr arnrVar = amgjVar.hW;
                return arnrVar == null ? arnr.a : arnrVar;
            }
        }
        return null;
    }

    public static MessageLite ev(allx allxVar) {
        if (allxVar == null) {
            return null;
        }
        int i = allxVar.b;
        if (i == 91395562) {
            return (ajav) allxVar.c;
        }
        if (i == 46407682) {
            return (ajns) allxVar.c;
        }
        if (i == 81531855) {
            return (akim) allxVar.c;
        }
        if (i == 50236216) {
            return (akym) allxVar.c;
        }
        if (i == 96706488) {
            return (aotb) allxVar.c;
        }
        if (i == 53272665) {
            return (aotv) allxVar.c;
        }
        if (i == 173693512) {
            return (anpr) allxVar.c;
        }
        if (i == 225413481) {
            return (anzx) allxVar.c;
        }
        if (i == 173602558) {
            return (anne) allxVar.c;
        }
        if (i == 259982244) {
            return (anrs) allxVar.c;
        }
        if (i == 173690432) {
            return (annx) allxVar.c;
        }
        if (i == 252479813) {
            return (anxm) allxVar.c;
        }
        if (i == 287582849) {
            return (anzl) allxVar.c;
        }
        if (i == 355720823) {
            return (anpi) allxVar.c;
        }
        if (i == 84636745) {
            return (apoa) allxVar.c;
        }
        if (i == 64375887) {
            return (akhz) allxVar.c;
        }
        if (i == 101397128) {
            return (apzy) allxVar.c;
        }
        if (i == 102284451) {
            return (aqoq) allxVar.c;
        }
        if (i == 63832717) {
            return (aqpz) allxVar.c;
        }
        if (i == 72757052) {
            return (aqqd) allxVar.c;
        }
        if (i == 85538925) {
            return (alcb) allxVar.c;
        }
        if (i == 87361605) {
            return (alcc) allxVar.c;
        }
        if (i == 90074186) {
            return (alca) allxVar.c;
        }
        if (i == 97168018) {
            return (aquv) allxVar.c;
        }
        if (i == 116164391) {
            return (aqwq) allxVar.c;
        }
        if (i == 125787527) {
            return (aqvt) allxVar.c;
        }
        if (i == 220023574) {
            return (aqve) allxVar.c;
        }
        if (i == 380650365) {
            return (aqvk) allxVar.c;
        }
        if (i == 99965204) {
            return (anpf) allxVar.c;
        }
        if (i == 100402590) {
            return (amrx) allxVar.c;
        }
        if (i == 102883021) {
            return (akdn) allxVar.c;
        }
        if (i == 111153703) {
            return (ajyp) allxVar.c;
        }
        if (i == 155144651) {
            return (aliw) allxVar.c;
        }
        if (i == 155554693) {
            return (aqpm) allxVar.c;
        }
        if (i == 156098381) {
            return (arep) allxVar.c;
        }
        if (i == 159058187) {
            return (aklh) allxVar.c;
        }
        if (i == 188799247) {
            return (amei) allxVar.c;
        }
        if (i == 144757704) {
            return (ajow) allxVar.c;
        }
        if (i == 196904101) {
            return (amhd) allxVar.c;
        }
        if (i == 208257221) {
            return (amgz) allxVar.c;
        }
        if (i == 369918284) {
            return (amic) allxVar.c;
        }
        if (i == 251530672) {
            return (ajov) allxVar.c;
        }
        if (i == 247977373) {
            return (akxr) allxVar.c;
        }
        if (i == 200097345) {
            return (albv) allxVar.c;
        }
        if (i == 211108887) {
            return (akxb) allxVar.c;
        }
        if (i == 149687644) {
            return (anmw) allxVar.c;
        }
        if (i == 217771576) {
            return (akat) allxVar.c;
        }
        if (i == 313670307) {
            return (apsa) allxVar.c;
        }
        if (i == 311386127) {
            return (algx) allxVar.c;
        }
        if (i == 338099421) {
            return (apem) allxVar.c;
        }
        if (i == 153515154) {
            return (akrn) allxVar.c;
        }
        if (i == 361905772) {
            return (ajrc) allxVar.c;
        }
        if (i == 361650780) {
            return (anob) allxVar.c;
        }
        if (i == 359119476) {
            return (anzk) allxVar.c;
        }
        if (i == 423195318) {
            return (ajwb) allxVar.c;
        }
        if (i == 416861471) {
            return (anwa) allxVar.c;
        }
        if (i == 320273507) {
            return (anfj) allxVar.c;
        }
        if (i == 100977426) {
            return (aocn) allxVar.c;
        }
        if (i == 431580795) {
            return (aoax) allxVar.c;
        }
        if (i == 509923604) {
            return (aoku) allxVar.c;
        }
        if (i == 1208) {
            return (apux) allxVar.c;
        }
        if (i == 1790) {
            return (akrk) allxVar.c;
        }
        if (i == 58508690) {
            return (angn) allxVar.c;
        }
        return null;
    }

    public static avlb ew() {
        throw new UnsupportedOperationException("not implemented");
    }

    public static void ex(wer werVar, Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            weh wehVar = (weh) it.next();
            if (wehVar != null) {
                werVar.e(wehVar);
            }
        }
    }

    public static void ey(wer werVar, weh wehVar) {
        wehVar.getClass();
        werVar.j(wehVar.b());
    }

    public static void ez(vxe vxeVar, List list, Object obj) {
        eA(vxeVar, list, obj != null ? agkj.j("com.google.android.libraries.youtube.innertube.endpoint.tag", obj) : null);
    }

    public static boolean f(Uri uri, Uri uri2) {
        return uri2 != null && TextUtils.equals(uri.getAuthority(), uri2.getAuthority()) && TextUtils.equals(uri.getPath(), uri2.getPath()) && TextUtils.equals(uri.getQueryParameter("signature"), uri2.getQueryParameter("signature")) && TextUtils.equals(uri.getQueryParameter("sig"), uri2.getQueryParameter("sig")) && TextUtils.equals(uri.getQueryParameter("lsig"), uri2.getQueryParameter("lsig"));
    }

    public static arlj fA(uyr uyrVar) {
        if (uyrVar == null) {
            return null;
        }
        return fC(uyrVar.b);
    }

    public static arlj fB(uzj uzjVar) {
        return fC(uzjVar.c);
    }

    public static arlj fC(ajhv ajhvVar) {
        int i;
        if (ajhvVar == null || (i = ajhvVar.b) != 5) {
            return null;
        }
        return i == 5 ? (arlj) ajhvVar.c : arlj.a;
    }

    public static boolean fD(uzj uzjVar, aldi aldiVar) {
        arlj arljVarFB;
        if (uzjVar == null || (arljVarFB = fB(uzjVar)) == null) {
            return false;
        }
        aldi aldiVarA = aldi.a(arljVarFB.f);
        if (aldiVarA == null) {
            aldiVarA = aldi.XENO_EFFECT_RENDERING_PRIORITY_UNKNOWN;
        }
        return aldiVarA == aldiVar;
    }

    public static agke fE(agke agkeVar) {
        if (agkeVar.isEmpty()) {
            return agkeVar;
        }
        int iG = aguu.G(agkeVar.a(), new bym(17));
        int i = iG != -1 ? (((agpi) agkeVar).d - 1) - iG : -1;
        int i2 = ((agpi) agkeVar).d;
        if (i == i2 - 1) {
            return agke.q((uzj) agkeVar.get(i));
        }
        EnumMap enumMap = new EnumMap(aldh.class);
        int i3 = i + 1;
        while (true) {
            if (i3 >= i2) {
                agjz agjzVar = new agjz(4);
                for (int i4 = 0; i4 < aldh.values().length; i4++) {
                    List list = (List) enumMap.get(aldh.a(i4));
                    if (list != null) {
                        agjzVar.j(list);
                    }
                }
                return agjzVar.g();
            }
            uzj uzjVar = (uzj) agkeVar.get(i3);
            arlj arljVarFB = fB(uzjVar);
            if (arljVarFB != null) {
                aldh aldhVarFz = fz(arljVarFB);
                aldi aldiVarA = aldi.a(arljVarFB.f);
                if (aldiVarA == null) {
                    aldiVarA = aldi.XENO_EFFECT_RENDERING_PRIORITY_UNKNOWN;
                }
                List list2 = (List) j$.util.Map.EL.computeIfAbsent(enumMap, aldhVarFz, new ush(14));
                aldh aldhVar = aldh.XENO_EFFECT_RENDERING_LAYER_GREEN_SCREEN;
                if (aldhVarFz == aldhVar) {
                    gW(enumMap, aldh.XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND);
                }
                if (aldhVarFz == aldh.XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND) {
                    gW(enumMap, aldhVar);
                }
                int iOrdinal = aldiVarA.ordinal();
                if (iOrdinal == 0) {
                    Optional optionalFindFirst = j$.util.Collection.EL.stream(list2).findFirst();
                    if (optionalFindFirst.isPresent() && fD((uzj) optionalFindFirst.get(), aldi.XENO_EFFECT_RENDERING_PRIORITY_LAYER_EXCLUSIVE)) {
                        list2.clear();
                    }
                    list2.add(uzjVar);
                } else if (iOrdinal == 1) {
                    Optional optionalFindFirst2 = j$.util.Collection.EL.stream(list2).findFirst();
                    if (true == optionalFindFirst2.isPresent()) {
                        optionalFindFirst2 = Optional.ofNullable(fB((uzj) optionalFindFirst2.get()));
                    }
                    if (true == optionalFindFirst2.isPresent()) {
                        aldi aldiVarA2 = aldi.a(((arlj) optionalFindFirst2.get()).f);
                        if (aldiVarA2 == null) {
                            aldiVarA2 = aldi.XENO_EFFECT_RENDERING_PRIORITY_UNKNOWN;
                        }
                        optionalFindFirst2 = Optional.ofNullable(aldiVarA2);
                    }
                    if (optionalFindFirst2.isPresent() && optionalFindFirst2.get() == aldi.XENO_EFFECT_RENDERING_PRIORITY_LAYER_FIRST) {
                        list2.remove(0);
                    }
                    list2.add(0, uzjVar);
                } else if (iOrdinal == 2) {
                    list2.clear();
                    list2.add(uzjVar);
                } else if (iOrdinal == 3) {
                    throw new IllegalStateException("Exclusive priority should've been handled already.");
                }
            }
            i3++;
        }
    }

    public static void fF(Set set, Object obj, boolean z) {
        HashSet hashSet;
        synchronized (set) {
            hashSet = new HashSet(set);
            if (z) {
                set.clear();
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            a$$ExternalSyntheticApiModelOutline0.m7m(it.next()).r(obj);
        }
    }

    @Deprecated
    public static void fG(final Activity activity, zf zfVar, final Bitmap bitmap, final aihf aihfVar, final vii viiVar) {
        zfVar.K(bitmap, new vbs() { // from class: vig
            @Override // defpackage.vbs
            public final void a(vbu vbuVar) {
                Activity activity2 = activity;
                if (activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                Bitmap bitmap2 = bitmap;
                vii viiVar2 = viiVar;
                aihf aihfVar2 = aihfVar;
                aihf aihfVarCreateBuilder = atzz.a.createBuilder();
                String str = vbuVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                atzz atzzVar = (atzz) aihfVarCreateBuilder.instance;
                str.getClass();
                atzzVar.b = 1;
                atzzVar.c = str;
                atzz atzzVar2 = (atzz) aihfVarCreateBuilder.build();
                auas auasVar = ((auat) aihfVar2.instance).e;
                if (auasVar == null) {
                    auasVar = auas.a;
                }
                aihf builder = auasVar.toBuilder();
                auas auasVar2 = (auas) builder.instance;
                int i = auasVar2.c;
                if (i == 3) {
                    aihf builder2 = ((auaq) auasVar2.d).toBuilder();
                    builder2.copyOnWrite();
                    auaq auaqVar = (auaq) builder2.instance;
                    atzzVar2.getClass();
                    auaqVar.c = atzzVar2;
                    auaqVar.b |= 1;
                    builder.copyOnWrite();
                    auas auasVar3 = (auas) builder.instance;
                    auaq auaqVar2 = (auaq) builder2.build();
                    auaqVar2.getClass();
                    auasVar3.d = auaqVar2;
                    auasVar3.c = 3;
                } else if (i == 4) {
                    aihf builder3 = ((auac) auasVar2.d).toBuilder();
                    builder3.copyOnWrite();
                    auac auacVar = (auac) builder3.instance;
                    atzzVar2.getClass();
                    auacVar.c = atzzVar2;
                    auacVar.b |= 1;
                    builder.copyOnWrite();
                    auas auasVar4 = (auas) builder.instance;
                    auac auacVar2 = (auac) builder3.build();
                    auacVar2.getClass();
                    auasVar4.d = auacVar2;
                    auasVar4.c = 4;
                } else if (i == 6) {
                    aihf builder4 = ((auaa) auasVar2.d).toBuilder();
                    builder4.copyOnWrite();
                    auaa auaaVar = (auaa) builder4.instance;
                    atzzVar2.getClass();
                    auaaVar.c = atzzVar2;
                    auaaVar.b |= 1;
                    builder.copyOnWrite();
                    auas auasVar5 = (auas) builder.instance;
                    auaa auaaVar2 = (auaa) builder4.build();
                    auaaVar2.getClass();
                    auasVar5.d = auaaVar2;
                    auasVar5.c = 6;
                } else if (i == 7) {
                    aihf builder5 = ((aubb) auasVar2.d).toBuilder();
                    builder5.copyOnWrite();
                    aubb aubbVar = (aubb) builder5.instance;
                    atzzVar2.getClass();
                    aubbVar.c = atzzVar2;
                    aubbVar.b |= 1;
                    builder.copyOnWrite();
                    auas auasVar6 = (auas) builder.instance;
                    aubb aubbVar2 = (aubb) builder5.build();
                    aubbVar2.getClass();
                    auasVar6.d = aubbVar2;
                    auasVar6.c = 7;
                } else if (i == 1) {
                    aihf builder6 = ((auaz) auasVar2.d).toBuilder();
                    builder6.copyOnWrite();
                    auaz auazVar = (auaz) builder6.instance;
                    atzzVar2.getClass();
                    auazVar.c = atzzVar2;
                    auazVar.b |= SemanticState.Focused;
                    builder.copyOnWrite();
                    auas auasVar7 = (auas) builder.instance;
                    auaz auazVar2 = (auaz) builder6.build();
                    auazVar2.getClass();
                    auasVar7.d = auazVar2;
                    auasVar7.c = 1;
                } else if (i == 8) {
                    aihf builder7 = ((auba) auasVar2.d).toBuilder();
                    builder7.copyOnWrite();
                    auba aubaVar = (auba) builder7.instance;
                    atzzVar2.getClass();
                    aubaVar.c = atzzVar2;
                    aubaVar.b |= 1;
                    builder.copyOnWrite();
                    auas auasVar8 = (auas) builder.instance;
                    auba aubaVar2 = (auba) builder7.build();
                    aubaVar2.getClass();
                    auasVar8.d = aubaVar2;
                    auasVar8.c = 8;
                } else if (i == 9) {
                    aihf builder8 = ((auad) auasVar2.d).toBuilder();
                    builder8.copyOnWrite();
                    auad auadVar = (auad) builder8.instance;
                    atzzVar2.getClass();
                    auadVar.c = atzzVar2;
                    auadVar.b |= 1;
                    builder.copyOnWrite();
                    auas auasVar9 = (auas) builder.instance;
                    auad auadVar2 = (auad) builder8.build();
                    auadVar2.getClass();
                    auasVar9.d = auadVar2;
                    auasVar9.c = 9;
                } else if (i == 10) {
                    aihf builder9 = ((aubd) auasVar2.d).toBuilder();
                    builder9.copyOnWrite();
                    aubd aubdVar = (aubd) builder9.instance;
                    atzzVar2.getClass();
                    aubdVar.c = atzzVar2;
                    aubdVar.b |= 1;
                    builder.copyOnWrite();
                    auas auasVar10 = (auas) builder.instance;
                    aubd aubdVar2 = (aubd) builder9.build();
                    aubdVar2.getClass();
                    auasVar10.d = aubdVar2;
                    auasVar10.c = 10;
                } else if (i == 12) {
                    aihf builder10 = ((auae) auasVar2.d).toBuilder();
                    builder10.copyOnWrite();
                    auae auaeVar = (auae) builder10.instance;
                    atzzVar2.getClass();
                    auaeVar.c = atzzVar2;
                    auaeVar.b |= 1;
                    builder.copyOnWrite();
                    auas auasVar11 = (auas) builder.instance;
                    auae auaeVar2 = (auae) builder10.build();
                    auaeVar2.getClass();
                    auasVar11.d = auaeVar2;
                    auasVar11.c = 12;
                } else if (i == 13) {
                    aihf builder11 = ((auao) auasVar2.d).toBuilder();
                    builder11.copyOnWrite();
                    auao auaoVar = (auao) builder11.instance;
                    atzzVar2.getClass();
                    auaoVar.c = atzzVar2;
                    auaoVar.b |= 1;
                    builder.copyOnWrite();
                    auas auasVar12 = (auas) builder.instance;
                    auao auaoVar2 = (auao) builder11.build();
                    auaoVar2.getClass();
                    auasVar12.d = auaoVar2;
                    auasVar12.c = 13;
                } else if (i == 15) {
                    aihf builder12 = ((auaw) auasVar2.d).toBuilder();
                    builder12.copyOnWrite();
                    auaw auawVar = (auaw) builder12.instance;
                    atzzVar2.getClass();
                    auawVar.c = atzzVar2;
                    auawVar.b |= 1;
                    builder.copyOnWrite();
                    auas auasVar13 = (auas) builder.instance;
                    auaw auawVar2 = (auaw) builder12.build();
                    auawVar2.getClass();
                    auasVar13.d = auawVar2;
                    auasVar13.c = 15;
                }
                aihfVar2.copyOnWrite();
                auat auatVar = (auat) aihfVar2.instance;
                auas auasVar14 = (auas) builder.build();
                auasVar14.getClass();
                auatVar.e = auasVar14;
                auatVar.b |= 4;
                int i2 = vbuVar.d;
                aihfVar2.copyOnWrite();
                auat auatVar2 = (auat) aihfVar2.instance;
                auatVar2.b |= 1;
                auatVar2.c = i2;
                int i3 = vbuVar.e;
                aihfVar2.copyOnWrite();
                auat auatVar3 = (auat) aihfVar2.instance;
                auatVar3.b |= 2;
                auatVar3.d = i3;
                viiVar2.a(aihfVar2);
                bitmap2.recycle();
            }
        });
    }

    public static void fH(Activity activity, zf zfVar, View view, aihf aihfVar, vii viiVar) {
        fG(activity, zfVar, fu(activity, view), aihfVar, viiVar);
    }

    public static void fI(final Activity activity, zf zfVar, final Bitmap bitmap, final jrr jrrVar, final vih vihVar) {
        zfVar.K(bitmap, new vbs() { // from class: vif
            @Override // defpackage.vbs
            public final void a(vbu vbuVar) {
                Activity activity2 = activity;
                if (activity2.isFinishing() || activity2.isDestroyed()) {
                    return;
                }
                jrr jrrVar2 = jrrVar;
                agrf agrfVar = usj.a;
                augy augyVar = (augy) jrrVar2.instance;
                int i = augyVar.c;
                if (i == 102) {
                    aihf builder = ((augt) augyVar.d).toBuilder();
                    String str = vbuVar.c;
                    builder.copyOnWrite();
                    augt augtVar = (augt) builder.instance;
                    str.getClass();
                    augtVar.b |= 4;
                    augtVar.e = str;
                    jrrVar2.copyOnWrite();
                    augy augyVar2 = (augy) jrrVar2.instance;
                    augt augtVar2 = (augt) builder.build();
                    augtVar2.getClass();
                    augyVar2.d = augtVar2;
                    augyVar2.c = 102;
                } else if (i == 103) {
                    aihf builder2 = ((augr) augyVar.d).toBuilder();
                    String str2 = vbuVar.c;
                    builder2.copyOnWrite();
                    augr augrVar = (augr) builder2.instance;
                    str2.getClass();
                    augrVar.b |= 1;
                    augrVar.c = str2;
                    jrrVar2.copyOnWrite();
                    augy augyVar3 = (augy) jrrVar2.instance;
                    augr augrVar2 = (augr) builder2.build();
                    augrVar2.getClass();
                    augyVar3.d = augrVar2;
                    augyVar3.c = 103;
                } else if (i == 101) {
                    aihf builder3 = ((augu) augyVar.d).toBuilder();
                    String str3 = vbuVar.c;
                    builder3.copyOnWrite();
                    augu auguVar = (augu) builder3.instance;
                    str3.getClass();
                    auguVar.b |= 16;
                    auguVar.g = str3;
                    jrrVar2.copyOnWrite();
                    augy augyVar4 = (augy) jrrVar2.instance;
                    augu auguVar2 = (augu) builder3.build();
                    auguVar2.getClass();
                    augyVar4.d = auguVar2;
                    augyVar4.c = 101;
                } else if (i == 106) {
                    aihf builder4 = ((augv) augyVar.d).toBuilder();
                    String str4 = vbuVar.c;
                    builder4.copyOnWrite();
                    augv augvVar = (augv) builder4.instance;
                    str4.getClass();
                    augvVar.b |= 1;
                    augvVar.c = str4;
                    jrrVar2.copyOnWrite();
                    augy augyVar5 = (augy) jrrVar2.instance;
                    augv augvVar2 = (augv) builder4.build();
                    augvVar2.getClass();
                    augyVar5.d = augvVar2;
                    augyVar5.c = 106;
                } else if (i == 107) {
                    aihf builder5 = ((auhv) augyVar.d).toBuilder();
                    String str5 = vbuVar.c;
                    builder5.copyOnWrite();
                    auhv auhvVar = (auhv) builder5.instance;
                    str5.getClass();
                    auhvVar.b |= 1;
                    auhvVar.e = str5;
                    jrrVar2.copyOnWrite();
                    augy augyVar6 = (augy) jrrVar2.instance;
                    auhv auhvVar2 = (auhv) builder5.build();
                    auhvVar2.getClass();
                    augyVar6.d = auhvVar2;
                    augyVar6.c = 107;
                } else {
                    ((agrc) ((agrc) usj.a.b()).k("com/google/android/libraries/youtube/creation/editor/mediaengineintegration/mediacomposition/CreationMediaCompositions", "updateAssetContent", 614, "CreationMediaCompositions.java")).t("Unknown GraphicalSegment type to set sticker asset");
                }
                Bitmap bitmap2 = bitmap;
                vihVar.a(jrrVar2, vbuVar);
                bitmap2.recycle();
            }
        });
    }

    public static void fJ(Activity activity, zf zfVar, View view, jrr jrrVar, vih vihVar) {
        fI(activity, zfVar, fu(activity, view), jrrVar, vihVar);
    }

    public static uzi fK(String str, int i) {
        auym auymVarA = uzi.a();
        if (i == 12 || i == 13) {
            auymVarA.j(str);
        }
        return auymVarA.i();
    }

    public static aimy fL(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        aihf aihfVarCreateBuilder = aimy.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aimy aimyVar = (aimy) aihfVarCreateBuilder.instance;
        aimyVar.b |= 1;
        aimyVar.c = 3;
        aihfVarCreateBuilder.copyOnWrite();
        aimy aimyVar2 = (aimy) aihfVarCreateBuilder.instance;
        aimyVar2.b |= 2;
        aimyVar2.d = 3;
        aihfVarCreateBuilder.copyOnWrite();
        aimy aimyVar3 = (aimy) aihfVarCreateBuilder.instance;
        aimyVar3.f = 1;
        aimyVar3.b |= 4;
        for (int i = 0; i < 9; i++) {
            aihfVarCreateBuilder.aA(fArr[i]);
        }
        return (aimy) aihfVarCreateBuilder.build();
    }

    public static void fM(String str) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 40;
        zvjVarA.i = 397;
        zvjVarA.d("[Creation][Android][Effects]".concat(str));
        zvs.a(zvjVarA.a());
    }

    public static void fN(zvl zvlVar, String str, Throwable th) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 40;
        zvjVarA.i = 68;
        zvjVarA.d(str);
        zvjVarA.f(th);
        zvlVar.a(zvjVarA.a());
    }

    public static void fO(zvl zvlVar, String str, Throwable th) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 71;
        zvjVarA.i = 260;
        zvjVarA.d(str);
        zvjVarA.f(th);
        zvlVar.a(zvjVarA.a());
    }

    public static void fP(zvl zvlVar, String str) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 71;
        zvjVarA.i = 261;
        zvjVarA.d("[ShortsCreation][Android][ShortsEffectPipeline]Effect processing error: ".concat(str));
        zvlVar.a(zvjVarA.a());
    }

    public static void fQ(zvl zvlVar, String str, Throwable th) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.j = 71;
        zvjVarA.i = 261;
        zvjVarA.d("[ShortsCreation][Android][ShortsEffectPipeline]Effect processing error: ".concat(str));
        zvjVarA.f(th);
        zvlVar.a(zvjVarA.a());
    }

    public static asjv fR(String str, String str2, int i) {
        aihf aihfVarCreateBuilder;
        if (i == 12 || i == 13) {
            aihfVarCreateBuilder = apsr.a.createBuilder();
            apsf apsfVar = apsf.a;
            aihfVarCreateBuilder.copyOnWrite();
            apsr apsrVar = (apsr) aihfVarCreateBuilder.instance;
            apsfVar.getClass();
            apsrVar.c = apsfVar;
            apsrVar.b = 5;
        } else {
            aihfVarCreateBuilder = apsr.a.createBuilder();
            aihf aihfVarCreateBuilder2 = apse.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            apse apseVar = (apse) aihfVarCreateBuilder2.instance;
            str.getClass();
            apseVar.b |= 1;
            apseVar.c = str;
            aihfVarCreateBuilder2.copyOnWrite();
            apse apseVar2 = (apse) aihfVarCreateBuilder2.instance;
            str2.getClass();
            apseVar2.b |= 2;
            apseVar2.d = str2;
            aihfVarCreateBuilder.copyOnWrite();
            apsr apsrVar2 = (apsr) aihfVarCreateBuilder.instance;
            apse apseVar3 = (apse) aihfVarCreateBuilder2.build();
            apseVar3.getClass();
            apsrVar2.c = apseVar3;
            apsrVar2.b = 4;
        }
        aihf aihfVarCreateBuilder3 = asjv.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        asjv asjvVar = (asjv) aihfVarCreateBuilder3.instance;
        apsr apsrVar3 = (apsr) aihfVarCreateBuilder.build();
        apsrVar3.getClass();
        asjvVar.a();
        asjvVar.d.add(apsrVar3);
        return (asjv) aihfVarCreateBuilder3.build();
    }

    public static atsg fS(arll arllVar) {
        aihf aihfVarCreateBuilder = atsg.a.createBuilder();
        String str = arllVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        atsg atsgVar = (atsg) aihfVarCreateBuilder.instance;
        str.getClass();
        atsgVar.b |= 1;
        atsgVar.c = str;
        String str2 = arllVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        atsg atsgVar2 = (atsg) aihfVarCreateBuilder.instance;
        str2.getClass();
        atsgVar2.b |= 2;
        atsgVar2.d = str2;
        return (atsg) aihfVarCreateBuilder.build();
    }

    public static atso fT(arlj arljVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        aihh aihhVar = (aihh) atso.a.createBuilder();
        arlh arlhVar = arljVar.h;
        if (arlhVar == null) {
            arlhVar = arlh.a;
        }
        int i6 = 4;
        if ((arlhVar.b & 4) != 0) {
            armz armzVar = arlhVar.e;
            if (armzVar == null) {
                armzVar = armz.a;
            }
            aihf aihfVarCreateBuilder = atsm.a.createBuilder();
            if ((armzVar.b & 1) != 0) {
                arlg arlgVar = armzVar.c;
                if (arlgVar == null) {
                    arlgVar = arlg.a;
                }
                aihf aihfVarCreateBuilder2 = atsl.a.createBuilder();
                if (!arlgVar.b.isEmpty()) {
                    String str = arlgVar.b;
                    aihfVarCreateBuilder2.copyOnWrite();
                    atsl atslVar = (atsl) aihfVarCreateBuilder2.instance;
                    str.getClass();
                    atslVar.b |= 1;
                    atslVar.c = str;
                }
                aihfVarCreateBuilder.copyOnWrite();
                atsm atsmVar = (atsm) aihfVarCreateBuilder.instance;
                atsl atslVar2 = (atsl) aihfVarCreateBuilder2.build();
                atslVar2.getClass();
                atsmVar.c = atslVar2;
                atsmVar.b |= 1;
            }
            aihhVar.copyOnWrite();
            atso atsoVar = (atso) aihhVar.instance;
            atsm atsmVar2 = (atsm) aihfVarCreateBuilder.build();
            atsmVar2.getClass();
            atsoVar.c = atsmVar2;
            atsoVar.b |= 1;
        }
        int i7 = 2;
        if ((arlhVar.b & 1) != 0) {
            aihf aihfVarCreateBuilder3 = atsk.a.createBuilder();
            arli arliVar = arlhVar.c;
            if (arliVar == null) {
                arliVar = arli.a;
            }
            for (arna arnaVar : arliVar.b) {
                aihf aihfVarCreateBuilder4 = atsj.a.createBuilder();
                if (!arnaVar.c.isEmpty()) {
                    String str2 = arnaVar.c;
                    aihfVarCreateBuilder4.copyOnWrite();
                    atsj atsjVar = (atsj) aihfVarCreateBuilder4.instance;
                    str2.getClass();
                    atsjVar.b |= 1;
                    atsjVar.c = str2;
                }
                for (army armyVar : arnaVar.b) {
                    aihf aihfVarCreateBuilder5 = atsi.a.createBuilder();
                    if (!armyVar.c.isEmpty()) {
                        String str3 = armyVar.c;
                        aihfVarCreateBuilder5.copyOnWrite();
                        atsi atsiVar = (atsi) aihfVarCreateBuilder5.instance;
                        str3.getClass();
                        atsiVar.b |= 1;
                        atsiVar.e = str3;
                    }
                    if ((armyVar.b & 2) != 0) {
                        int iBt = a.bt(armyVar.d);
                        if (iBt == 0) {
                            iBt = 1;
                        }
                        aihfVarCreateBuilder5.copyOnWrite();
                        atsi atsiVar2 = (atsi) aihfVarCreateBuilder5.instance;
                        atsiVar2.d = Integer.valueOf(fW(iBt) - 2);
                        atsiVar2.c = 2;
                    }
                    aihfVarCreateBuilder4.copyOnWrite();
                    atsj atsjVar2 = (atsj) aihfVarCreateBuilder4.instance;
                    atsi atsiVar3 = (atsi) aihfVarCreateBuilder5.build();
                    atsiVar3.getClass();
                    aiie aiieVar = atsjVar2.d;
                    if (!aiieVar.c()) {
                        atsjVar2.d = aihn.mutableCopy(aiieVar);
                    }
                    atsjVar2.d.add(atsiVar3);
                }
                aihfVarCreateBuilder3.copyOnWrite();
                atsk atskVar = (atsk) aihfVarCreateBuilder3.instance;
                atsj atsjVar3 = (atsj) aihfVarCreateBuilder4.build();
                atsjVar3.getClass();
                aiie aiieVar2 = atskVar.b;
                if (!aiieVar2.c()) {
                    atskVar.b = aihn.mutableCopy(aiieVar2);
                }
                atskVar.b.add(atsjVar3);
            }
            aihhVar.copyOnWrite();
            atso atsoVar2 = (atso) aihhVar.instance;
            atsk atskVar2 = (atsk) aihfVarCreateBuilder3.build();
            atskVar2.getClass();
            atsoVar2.d = atskVar2;
            atsoVar2.b |= 2;
        }
        if ((arlhVar.b & 2) != 0) {
            arnb arnbVar = arlhVar.d;
            if (arnbVar == null) {
                arnbVar = arnb.a;
            }
            int i8 = arnbVar.b;
            if (i8 == 1) {
                arkw arkwVar = (arkw) arnbVar.c;
                aihf aihfVarCreateBuilder6 = atsn.a.createBuilder();
                aihf aihfVarCreateBuilder7 = aifv.a.createBuilder();
                aihfVarCreateBuilder7.copyOnWrite();
                ((aifv) aihfVarCreateBuilder7.instance).b = "type.googleapis.com/xeno.effect.capabilities.ArcadeCapabilityInterface";
                aihf aihfVarCreateBuilder8 = atwu.a.createBuilder();
                for (arlf arlfVar : arkwVar.c) {
                    aihf aihfVarCreateBuilder9 = atwt.a.createBuilder();
                    if ((arlfVar.b & 1) != 0) {
                        String str4 = arlfVar.c;
                        aihfVarCreateBuilder9.copyOnWrite();
                        atwt atwtVar = (atwt) aihfVarCreateBuilder9.instance;
                        str4.getClass();
                        atwtVar.b |= 1;
                        atwtVar.c = str4;
                    }
                    if ((arlfVar.b & i7) != 0) {
                        arkv arkvVar = arlfVar.d;
                        if (arkvVar == null) {
                            arkvVar = arkv.a;
                        }
                        aipd aipdVarFU = fU(arkvVar);
                        aihfVarCreateBuilder9.copyOnWrite();
                        atwt atwtVar2 = (atwt) aihfVarCreateBuilder9.instance;
                        aipdVarFU.getClass();
                        atwtVar2.d = aipdVarFU;
                        atwtVar2.b |= i7;
                    }
                    if ((arlfVar.b & i6) != 0) {
                        arld arldVar = arlfVar.e;
                        if (arldVar == null) {
                            arldVar = arld.a;
                        }
                        aihf aihfVarCreateBuilder10 = atws.a.createBuilder();
                        for (arle arleVar : arldVar.b) {
                            aihf aihfVarCreateBuilder11 = atwr.a.createBuilder();
                            if ((arleVar.b & 1) != 0) {
                                int iBt2 = a.bt(arleVar.e);
                                if (iBt2 == 0) {
                                    iBt2 = 1;
                                }
                                aihfVarCreateBuilder11.copyOnWrite();
                                atwr atwrVar = (atwr) aihfVarCreateBuilder11.instance;
                                atwrVar.c = Integer.valueOf(fW(iBt2) - 2);
                                atwrVar.b = 1;
                            }
                            int i9 = arleVar.c;
                            if (i9 == 0) {
                                i5 = 3;
                            } else if (i9 != i7) {
                                i5 = i9 != 3 ? 0 : i7;
                            } else {
                                i5 = 1;
                            }
                            int i10 = i5 - 1;
                            if (i5 == 0) {
                                throw null;
                            }
                            if (i10 == 0) {
                                aipd aipdVarFU2 = fU(i9 == 2 ? (arkv) arleVar.d : arkv.a);
                                aihfVarCreateBuilder11.copyOnWrite();
                                atwr atwrVar2 = (atwr) aihfVarCreateBuilder11.instance;
                                aipdVarFU2.getClass();
                                atwrVar2.e = aipdVarFU2;
                                atwrVar2.d = 3;
                            } else if (i10 == 1) {
                                String str5 = i9 == 3 ? (String) arleVar.d : "";
                                aihfVarCreateBuilder11.copyOnWrite();
                                atwr atwrVar3 = (atwr) aihfVarCreateBuilder11.instance;
                                str5.getClass();
                                atwrVar3.d = 4;
                                atwrVar3.e = str5;
                            }
                            aihfVarCreateBuilder10.copyOnWrite();
                            atws atwsVar = (atws) aihfVarCreateBuilder10.instance;
                            atwr atwrVar4 = (atwr) aihfVarCreateBuilder11.build();
                            atwrVar4.getClass();
                            aiie aiieVar3 = atwsVar.b;
                            if (!aiieVar3.c()) {
                                atwsVar.b = aihn.mutableCopy(aiieVar3);
                            }
                            atwsVar.b.add(atwrVar4);
                            i7 = 2;
                        }
                        aihfVarCreateBuilder9.copyOnWrite();
                        atwt atwtVar3 = (atwt) aihfVarCreateBuilder9.instance;
                        atws atwsVar2 = (atws) aihfVarCreateBuilder10.build();
                        atwsVar2.getClass();
                        atwtVar3.e = atwsVar2;
                        atwtVar3.b |= 4;
                    }
                    atwt atwtVar4 = (atwt) aihfVarCreateBuilder9.build();
                    aihfVarCreateBuilder8.copyOnWrite();
                    atwu atwuVar = (atwu) aihfVarCreateBuilder8.instance;
                    atwtVar4.getClass();
                    aiie aiieVar4 = atwuVar.e;
                    if (!aiieVar4.c()) {
                        atwuVar.e = aihn.mutableCopy(aiieVar4);
                    }
                    atwuVar.e.add(atwtVar4);
                    i6 = 4;
                    i7 = 2;
                }
                if ((arkwVar.b & 1) != 0) {
                    arkz arkzVar = arkwVar.d;
                    if (arkzVar == null) {
                        arkzVar = arkz.a;
                    }
                    aihf aihfVarCreateBuilder12 = atwo.a.createBuilder();
                    for (arla arlaVar : arkzVar.b) {
                        aihf aihfVarCreateBuilder13 = atwn.a.createBuilder();
                        if ((arlaVar.b & 1) != 0) {
                            String str6 = arlaVar.e;
                            aihfVarCreateBuilder13.copyOnWrite();
                            atwn atwnVar = (atwn) aihfVarCreateBuilder13.instance;
                            str6.getClass();
                            atwnVar.b |= 1;
                            atwnVar.e = str6;
                        }
                        int i11 = arlaVar.c;
                        if (i11 == 0) {
                            i3 = 3;
                            i4 = 3;
                        } else if (i11 != 2) {
                            i3 = 3;
                            i4 = i11 != 3 ? 0 : 2;
                        } else {
                            i3 = 3;
                            i4 = 1;
                        }
                        int i12 = i4 - 1;
                        if (i4 == 0) {
                            throw null;
                        }
                        if (i12 == 0) {
                            aipd aipdVarFU3 = fU(i11 == 2 ? (arkv) arlaVar.d : arkv.a);
                            aihfVarCreateBuilder13.copyOnWrite();
                            atwn atwnVar2 = (atwn) aihfVarCreateBuilder13.instance;
                            aipdVarFU3.getClass();
                            atwnVar2.d = aipdVarFU3;
                            atwnVar2.c = 3;
                        } else if (i12 == 1) {
                            String str7 = i11 == i3 ? (String) arlaVar.d : "";
                            aihfVarCreateBuilder13.copyOnWrite();
                            atwn atwnVar3 = (atwn) aihfVarCreateBuilder13.instance;
                            str7.getClass();
                            atwnVar3.c = 4;
                            atwnVar3.d = str7;
                        }
                        aihfVarCreateBuilder12.copyOnWrite();
                        atwo atwoVar = (atwo) aihfVarCreateBuilder12.instance;
                        atwn atwnVar4 = (atwn) aihfVarCreateBuilder13.build();
                        atwnVar4.getClass();
                        aiie aiieVar5 = atwoVar.b;
                        if (!aiieVar5.c()) {
                            atwoVar.b = aihn.mutableCopy(aiieVar5);
                        }
                        atwoVar.b.add(atwnVar4);
                    }
                    atwo atwoVar2 = (atwo) aihfVarCreateBuilder12.build();
                    aihfVarCreateBuilder8.copyOnWrite();
                    atwu atwuVar2 = (atwu) aihfVarCreateBuilder8.instance;
                    atwoVar2.getClass();
                    atwuVar2.f = atwoVar2;
                    atwuVar2.b |= 1;
                }
                if ((arkwVar.b & 2) != 0) {
                    arky arkyVar = arkwVar.e;
                    if (arkyVar == null) {
                        arkyVar = arky.a;
                    }
                    aihf aihfVarCreateBuilder14 = atwm.a.createBuilder();
                    for (arkx arkxVar : arkyVar.b) {
                        aihf aihfVarCreateBuilder15 = atwl.a.createBuilder();
                        if ((arkxVar.b & 1) != 0) {
                            String str8 = arkxVar.e;
                            aihfVarCreateBuilder15.copyOnWrite();
                            atwl atwlVar = (atwl) aihfVarCreateBuilder15.instance;
                            str8.getClass();
                            atwlVar.b |= 1;
                            atwlVar.e = str8;
                        }
                        if ((arkxVar.b & 2) != 0) {
                            String str9 = arkxVar.f;
                            aihfVarCreateBuilder15.copyOnWrite();
                            atwl atwlVar2 = (atwl) aihfVarCreateBuilder15.instance;
                            str9.getClass();
                            atwlVar2.b |= 2;
                            atwlVar2.f = str9;
                        }
                        int i13 = arkxVar.c;
                        if (i13 == 0) {
                            i2 = 5;
                        } else if (i13 == 3) {
                            i2 = 1;
                        } else if (i13 == 4) {
                            i2 = 2;
                        } else if (i13 != 5) {
                            i2 = i13 != 6 ? 0 : 4;
                        } else {
                            i2 = 3;
                        }
                        int i14 = i2 - 1;
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i14 == 0) {
                            armd armdVar = i13 == 3 ? (armd) arkxVar.d : armd.a;
                            aihf aihfVarCreateBuilder16 = atts.a.createBuilder();
                            int i15 = armdVar.c;
                            aihfVarCreateBuilder16.copyOnWrite();
                            atts attsVar = (atts) aihfVarCreateBuilder16.instance;
                            attsVar.b |= 1;
                            attsVar.c = i15;
                            if ((armdVar.b & 2) != 0) {
                                int i16 = armdVar.d;
                                aihfVarCreateBuilder16.copyOnWrite();
                                atts attsVar2 = (atts) aihfVarCreateBuilder16.instance;
                                attsVar2.b |= 2;
                                attsVar2.d = i16;
                            }
                            if ((armdVar.b & 4) != 0) {
                                int i17 = armdVar.e;
                                aihfVarCreateBuilder16.copyOnWrite();
                                atts attsVar3 = (atts) aihfVarCreateBuilder16.instance;
                                attsVar3.b |= 4;
                                attsVar3.e = i17;
                            }
                            aihfVarCreateBuilder15.copyOnWrite();
                            atwl atwlVar3 = (atwl) aihfVarCreateBuilder15.instance;
                            atts attsVar4 = (atts) aihfVarCreateBuilder16.build();
                            attsVar4.getClass();
                            atwlVar3.d = attsVar4;
                            atwlVar3.c = 3;
                        } else if (i14 == 1) {
                            arlu arluVar = i13 == 4 ? (arlu) arkxVar.d : arlu.a;
                            aihf aihfVarCreateBuilder17 = attp.a.createBuilder();
                            float f = arluVar.c;
                            aihfVarCreateBuilder17.copyOnWrite();
                            attp attpVar = (attp) aihfVarCreateBuilder17.instance;
                            attpVar.b |= 1;
                            attpVar.c = f;
                            if ((arluVar.b & 2) != 0) {
                                float f2 = arluVar.d;
                                aihfVarCreateBuilder17.copyOnWrite();
                                attp attpVar2 = (attp) aihfVarCreateBuilder17.instance;
                                attpVar2.b |= 2;
                                attpVar2.d = f2;
                            }
                            if ((arluVar.b & 4) != 0) {
                                float f3 = arluVar.e;
                                aihfVarCreateBuilder17.copyOnWrite();
                                attp attpVar3 = (attp) aihfVarCreateBuilder17.instance;
                                attpVar3.b |= 4;
                                attpVar3.e = f3;
                            }
                            aihfVarCreateBuilder15.copyOnWrite();
                            atwl atwlVar4 = (atwl) aihfVarCreateBuilder15.instance;
                            attp attpVar4 = (attp) aihfVarCreateBuilder17.build();
                            attpVar4.getClass();
                            atwlVar4.d = attpVar4;
                            atwlVar4.c = 4;
                        } else if (i14 == 2) {
                            arlm arlmVar = i13 == 5 ? (arlm) arkxVar.d : arlm.a;
                            aihf aihfVarCreateBuilder18 = attm.a.createBuilder();
                            boolean z = arlmVar.b;
                            aihfVarCreateBuilder18.copyOnWrite();
                            attm attmVar = (attm) aihfVarCreateBuilder18.instance;
                            attmVar.b |= 1;
                            attmVar.c = z;
                            aihfVarCreateBuilder15.copyOnWrite();
                            atwl atwlVar5 = (atwl) aihfVarCreateBuilder15.instance;
                            attm attmVar2 = (attm) aihfVarCreateBuilder18.build();
                            attmVar2.getClass();
                            atwlVar5.d = attmVar2;
                            atwlVar5.c = 5;
                        } else if (i14 == 3) {
                            armp armpVar = i13 == 6 ? (armp) arkxVar.d : armp.a;
                            jrq jrqVar = (jrq) attx.a.createBuilder();
                            String str10 = armpVar.b;
                            jrqVar.copyOnWrite();
                            attx attxVar = (attx) jrqVar.instance;
                            str10.getClass();
                            attxVar.b |= 1;
                            attxVar.c = str10;
                            jrqVar.k(armpVar.c);
                            aihfVarCreateBuilder15.copyOnWrite();
                            atwl atwlVar6 = (atwl) aihfVarCreateBuilder15.instance;
                            attx attxVar2 = (attx) jrqVar.build();
                            attxVar2.getClass();
                            atwlVar6.d = attxVar2;
                            atwlVar6.c = 6;
                        }
                        aihfVarCreateBuilder14.copyOnWrite();
                        atwm atwmVar = (atwm) aihfVarCreateBuilder14.instance;
                        atwl atwlVar7 = (atwl) aihfVarCreateBuilder15.build();
                        atwlVar7.getClass();
                        aiie aiieVar6 = atwmVar.b;
                        if (!aiieVar6.c()) {
                            atwmVar.b = aihn.mutableCopy(aiieVar6);
                        }
                        atwmVar.b.add(atwlVar7);
                    }
                    atwm atwmVar2 = (atwm) aihfVarCreateBuilder14.build();
                    aihfVarCreateBuilder8.copyOnWrite();
                    atwu atwuVar3 = (atwu) aihfVarCreateBuilder8.instance;
                    atwmVar2.getClass();
                    atwuVar3.g = atwmVar2;
                    atwuVar3.b |= 2;
                }
                if ((arkwVar.b & 8) != 0) {
                    int iAS = a.aS(arkwVar.g);
                    if (iAS == 0) {
                        iAS = 1;
                    }
                    int i18 = iAS - 1;
                    int i19 = i18 != 1 ? i18 != 2 ? 2 : 4 : 3;
                    aihfVarCreateBuilder8.copyOnWrite();
                    atwu atwuVar4 = (atwu) aihfVarCreateBuilder8.instance;
                    atwuVar4.j = i19 - 2;
                    atwuVar4.b |= 16;
                }
                aihfVarCreateBuilder8.copyOnWrite();
                atwu atwuVar5 = (atwu) aihfVarCreateBuilder8.instance;
                atwuVar5.i = 0;
                atwuVar5.b |= 8;
                if ((arkwVar.b & 4) != 0) {
                    arlc arlcVar = arkwVar.f;
                    if (arlcVar == null) {
                        arlcVar = arlc.a;
                    }
                    aihf aihfVarCreateBuilder19 = atwq.a.createBuilder();
                    for (arlb arlbVar : arlcVar.b) {
                        aihf aihfVarCreateBuilder20 = atwp.a.createBuilder();
                        String str11 = arlbVar.b;
                        aihfVarCreateBuilder20.copyOnWrite();
                        atwp atwpVar = (atwp) aihfVarCreateBuilder20.instance;
                        str11.getClass();
                        atwpVar.b |= 1;
                        atwpVar.c = str11;
                        arkv arkvVar2 = arlbVar.c;
                        if (arkvVar2 == null) {
                            arkvVar2 = arkv.a;
                        }
                        aipd aipdVarFU4 = fU(arkvVar2);
                        aihfVarCreateBuilder20.copyOnWrite();
                        atwp atwpVar2 = (atwp) aihfVarCreateBuilder20.instance;
                        aipdVarFU4.getClass();
                        atwpVar2.d = aipdVarFU4;
                        atwpVar2.b |= 2;
                        aihfVarCreateBuilder19.copyOnWrite();
                        atwq atwqVar = (atwq) aihfVarCreateBuilder19.instance;
                        atwp atwpVar3 = (atwp) aihfVarCreateBuilder20.build();
                        atwpVar3.getClass();
                        aiie aiieVar7 = atwqVar.b;
                        if (!aiieVar7.c()) {
                            atwqVar.b = aihn.mutableCopy(aiieVar7);
                        }
                        atwqVar.b.add(atwpVar3);
                    }
                    atwq atwqVar2 = (atwq) aihfVarCreateBuilder19.build();
                    aihfVarCreateBuilder8.copyOnWrite();
                    atwu atwuVar6 = (atwu) aihfVarCreateBuilder8.instance;
                    atwqVar2.getClass();
                    atwuVar6.h = atwqVar2;
                    atwuVar6.b |= 4;
                }
                Iterator it = arkwVar.h.iterator();
                while (it.hasNext()) {
                    atse atseVarFV = fV((armj) it.next());
                    aihfVarCreateBuilder8.copyOnWrite();
                    atwu atwuVar7 = (atwu) aihfVarCreateBuilder8.instance;
                    atseVarFV.getClass();
                    aiie aiieVar8 = atwuVar7.c;
                    if (!aiieVar8.c()) {
                        atwuVar7.c = aihn.mutableCopy(aiieVar8);
                    }
                    atwuVar7.c.add(atseVarFV);
                }
                Iterator it2 = arkwVar.i.iterator();
                while (it2.hasNext()) {
                    atse atseVarFV2 = fV((armj) it2.next());
                    aihfVarCreateBuilder8.copyOnWrite();
                    atwu atwuVar8 = (atwu) aihfVarCreateBuilder8.instance;
                    atseVarFV2.getClass();
                    aiie aiieVar9 = atwuVar8.d;
                    if (!aiieVar9.c()) {
                        atwuVar8.d = aihn.mutableCopy(aiieVar9);
                    }
                    atwuVar8.d.add(atseVarFV2);
                }
                aigj byteString = ((atwu) aihfVarCreateBuilder8.build()).toByteString();
                aihfVarCreateBuilder7.copyOnWrite();
                ((aifv) aihfVarCreateBuilder7.instance).c = byteString;
                aifv aifvVar = (aifv) aihfVarCreateBuilder7.build();
                aihfVarCreateBuilder6.copyOnWrite();
                atsn atsnVar = (atsn) aihfVarCreateBuilder6.instance;
                aifvVar.getClass();
                atsnVar.c = aifvVar;
                atsnVar.b |= 1;
                atsn atsnVar2 = (atsn) aihfVarCreateBuilder6.build();
                aihhVar.copyOnWrite();
                atso atsoVar3 = (atso) aihhVar.instance;
                atsnVar2.getClass();
                atsoVar3.e = atsnVar2;
                atsoVar3.b |= 4;
            } else {
                int i20 = 6;
                if (i8 == 2) {
                    try {
                        aihf aihfVarCreateBuilder21 = atsn.a.createBuilder();
                        aihf aihfVarCreateBuilder22 = aifv.a.createBuilder();
                        aihfVarCreateBuilder22.copyOnWrite();
                        ((aifv) aihfVarCreateBuilder22.instance).b = "type.googleapis.com/xeno.effect.capabilities.RawGraphVideoProcessingCapabilityInterface";
                        arms armsVar = arnbVar.b == 2 ? (arms) arnbVar.c : arms.a;
                        armsVar.getClass();
                        aihf aihfVarCreateBuilder23 = atxb.a.createBuilder();
                        if ((armsVar.b & 1) != 0) {
                            ahnl ahnlVar = (ahnl) aihn.parseFrom(ahnl.a, armsVar.c, ExtensionRegistryLite.getGeneratedRegistry());
                            aihfVarCreateBuilder23.copyOnWrite();
                            atxb atxbVar = (atxb) aihfVarCreateBuilder23.instance;
                            ahnlVar.getClass();
                            atxbVar.c = ahnlVar;
                            atxbVar.b |= 1;
                        }
                        if (armsVar.d.size() > 0) {
                            ArrayList arrayList = new ArrayList(armsVar.d.size());
                            for (armi armiVar : armsVar.d) {
                                aihf aihfVarCreateBuilder24 = atsa.a.createBuilder();
                                String str12 = armiVar.b;
                                aihfVarCreateBuilder24.copyOnWrite();
                                atsa atsaVar = (atsa) aihfVarCreateBuilder24.instance;
                                str12.getClass();
                                atsaVar.b |= 1;
                                atsaVar.e = str12;
                                armj armjVar = armiVar.c;
                                if (armjVar == null) {
                                    armjVar = armj.a;
                                }
                                aihf aihfVarCreateBuilder25 = atse.a.createBuilder();
                                String str13 = armjVar.b;
                                aihfVarCreateBuilder25.copyOnWrite();
                                atse atseVar = (atse) aihfVarCreateBuilder25.instance;
                                str13.getClass();
                                atseVar.c = 1;
                                atseVar.d = str13;
                                atse atseVar2 = (atse) aihfVarCreateBuilder25.build();
                                aihfVarCreateBuilder24.copyOnWrite();
                                atsa atsaVar2 = (atsa) aihfVarCreateBuilder24.instance;
                                atseVar2.getClass();
                                atsaVar2.d = atseVar2;
                                atsaVar2.c = 2;
                                arrayList.add((atsa) aihfVarCreateBuilder24.build());
                            }
                            jrr jrrVar = (jrr) atsf.a.createBuilder();
                            jrrVar.copyOnWrite();
                            atsf atsfVar = (atsf) jrrVar.instance;
                            atsfVar.a();
                            aifs.addAll(arrayList, atsfVar.b);
                            atsf atsfVar2 = (atsf) jrrVar.build();
                            aihfVarCreateBuilder23.copyOnWrite();
                            atxb atxbVar2 = (atxb) aihfVarCreateBuilder23.instance;
                            atsfVar2.getClass();
                            atxbVar2.d = atsfVar2;
                            atxbVar2.b |= 2;
                        }
                        if ((armsVar.b & 2) != 0) {
                            String str14 = armsVar.e;
                            aihfVarCreateBuilder23.copyOnWrite();
                            atxb atxbVar3 = (atxb) aihfVarCreateBuilder23.instance;
                            str14.getClass();
                            atxbVar3.b |= 4;
                            atxbVar3.e = str14;
                        }
                        if (armsVar.f.size() > 0) {
                            for (armx armxVar : armsVar.f) {
                                armxVar.getClass();
                                aihf aihfVarCreateBuilder26 = atxa.a.createBuilder();
                                if ((armxVar.b & 1) != 0) {
                                    String str15 = armxVar.c;
                                    aihfVarCreateBuilder26.copyOnWrite();
                                    atxa atxaVar = (atxa) aihfVarCreateBuilder26.instance;
                                    str15.getClass();
                                    atxaVar.b |= 1;
                                    atxaVar.c = str15;
                                }
                                if ((armxVar.b & 2) != 0) {
                                    String str16 = armxVar.d;
                                    aihfVarCreateBuilder26.copyOnWrite();
                                    atxa atxaVar2 = (atxa) aihfVarCreateBuilder26.instance;
                                    str16.getClass();
                                    atxaVar2.b |= 2;
                                    atxaVar2.d = str16;
                                }
                                if ((armxVar.b & 4) != 0) {
                                    armv armvVar = armxVar.e;
                                    if (armvVar == null) {
                                        armvVar = armv.a;
                                    }
                                    aihf aihfVarCreateBuilder27 = atwz.a.createBuilder();
                                    for (armw armwVar : armvVar.b) {
                                        aihf aihfVarCreateBuilder28 = atwy.a.createBuilder();
                                        if ((armwVar.b & 1) != 0) {
                                            int iBt3 = a.bt(armwVar.c);
                                            if (iBt3 == 0) {
                                                iBt3 = 1;
                                            }
                                            int i21 = iBt3 - 1;
                                            if (i21 == 1) {
                                                i = 3;
                                            } else if (i21 == 2) {
                                                i = 4;
                                            } else if (i21 == 3) {
                                                i = 5;
                                            } else if (i21 != 4) {
                                                i = i21 != 5 ? 2 : 7;
                                            } else {
                                                i = i20;
                                            }
                                            aihfVarCreateBuilder28.copyOnWrite();
                                            atwy atwyVar = (atwy) aihfVarCreateBuilder28.instance;
                                            atwyVar.d = Integer.valueOf(i - 2);
                                            atwyVar.c = 1;
                                        }
                                        if ((armwVar.b & 2) != 0) {
                                            String str17 = armwVar.d;
                                            aihfVarCreateBuilder28.copyOnWrite();
                                            atwy atwyVar2 = (atwy) aihfVarCreateBuilder28.instance;
                                            str17.getClass();
                                            atwyVar2.b |= 1;
                                            atwyVar2.e = str17;
                                        }
                                        aihfVarCreateBuilder27.copyOnWrite();
                                        atwz atwzVar = (atwz) aihfVarCreateBuilder27.instance;
                                        atwy atwyVar3 = (atwy) aihfVarCreateBuilder28.build();
                                        atwyVar3.getClass();
                                        aiie aiieVar10 = atwzVar.b;
                                        if (!aiieVar10.c()) {
                                            atwzVar.b = aihn.mutableCopy(aiieVar10);
                                        }
                                        atwzVar.b.add(atwyVar3);
                                        i20 = 6;
                                    }
                                    atwz atwzVar2 = (atwz) aihfVarCreateBuilder27.build();
                                    aihfVarCreateBuilder26.copyOnWrite();
                                    atxa atxaVar3 = (atxa) aihfVarCreateBuilder26.instance;
                                    atwzVar2.getClass();
                                    atxaVar3.e = atwzVar2;
                                    atxaVar3.b |= 4;
                                }
                                atxa atxaVar4 = (atxa) aihfVarCreateBuilder26.build();
                                aihfVarCreateBuilder23.copyOnWrite();
                                atxb atxbVar4 = (atxb) aihfVarCreateBuilder23.instance;
                                atxaVar4.getClass();
                                aiie aiieVar11 = atxbVar4.f;
                                if (!aiieVar11.c()) {
                                    atxbVar4.f = aihn.mutableCopy(aiieVar11);
                                }
                                atxbVar4.f.add(atxaVar4);
                                i20 = 6;
                            }
                        }
                        if ((armsVar.b & 4) != 0) {
                            armt armtVar = armsVar.g;
                            if (armtVar == null) {
                                armtVar = armt.a;
                            }
                            aihf aihfVarCreateBuilder29 = atwx.a.createBuilder();
                            for (armu armuVar : armtVar.b) {
                                aihf aihfVarCreateBuilder30 = atww.a.createBuilder();
                                if ((armuVar.b & 1) != 0) {
                                    String str18 = armuVar.c;
                                    aihfVarCreateBuilder30.copyOnWrite();
                                    atww atwwVar = (atww) aihfVarCreateBuilder30.instance;
                                    str18.getClass();
                                    atwwVar.b |= 1;
                                    atwwVar.c = str18;
                                }
                                if ((armuVar.b & 2) != 0) {
                                    String str19 = armuVar.d;
                                    aihfVarCreateBuilder30.copyOnWrite();
                                    atww atwwVar2 = (atww) aihfVarCreateBuilder30.instance;
                                    str19.getClass();
                                    atwwVar2.b |= 2;
                                    atwwVar2.d = str19;
                                }
                                aihfVarCreateBuilder29.copyOnWrite();
                                atwx atwxVar = (atwx) aihfVarCreateBuilder29.instance;
                                atww atwwVar3 = (atww) aihfVarCreateBuilder30.build();
                                atwwVar3.getClass();
                                aiie aiieVar12 = atwxVar.b;
                                if (!aiieVar12.c()) {
                                    atwxVar.b = aihn.mutableCopy(aiieVar12);
                                }
                                atwxVar.b.add(atwwVar3);
                            }
                            atwx atwxVar2 = (atwx) aihfVarCreateBuilder29.build();
                            aihfVarCreateBuilder23.copyOnWrite();
                            atxb atxbVar5 = (atxb) aihfVarCreateBuilder23.instance;
                            atwxVar2.getClass();
                            atxbVar5.g = atwxVar2;
                            atxbVar5.b |= 8;
                        }
                        if ((armsVar.b & 16) != 0) {
                            arlz arlzVar = armsVar.i;
                            if (arlzVar == null) {
                                arlzVar = arlz.a;
                            }
                            atup atupVarB = uyl.b(arlzVar);
                            aihfVarCreateBuilder23.copyOnWrite();
                            atxb atxbVar6 = (atxb) aihfVarCreateBuilder23.instance;
                            atupVarB.getClass();
                            atxbVar6.h = atupVarB;
                            atxbVar6.b |= 16;
                        }
                        int i22 = armsVar.h;
                        if (i22 > 0) {
                            aihfVarCreateBuilder23.copyOnWrite();
                            atxb atxbVar7 = (atxb) aihfVarCreateBuilder23.instance;
                            atxbVar7.b |= 32;
                            atxbVar7.i = i22;
                        }
                        if (armsVar.j.size() > 0) {
                            aiie aiieVar13 = armsVar.j;
                            aihfVarCreateBuilder23.copyOnWrite();
                            atxb atxbVar8 = (atxb) aihfVarCreateBuilder23.instance;
                            aiie aiieVar14 = atxbVar8.j;
                            if (!aiieVar14.c()) {
                                atxbVar8.j = aihn.mutableCopy(aiieVar14);
                            }
                            aifs.addAll(aiieVar13, atxbVar8.j);
                        }
                        aigj byteString2 = ((atxb) aihfVarCreateBuilder23.build()).toByteString();
                        aihfVarCreateBuilder22.copyOnWrite();
                        ((aifv) aihfVarCreateBuilder22.instance).c = byteString2;
                        aifv aifvVar2 = (aifv) aihfVarCreateBuilder22.build();
                        aihfVarCreateBuilder21.copyOnWrite();
                        atsn atsnVar3 = (atsn) aihfVarCreateBuilder21.instance;
                        aifvVar2.getClass();
                        atsnVar3.c = aifvVar2;
                        atsnVar3.b |= 1;
                        atsn atsnVar4 = (atsn) aihfVarCreateBuilder21.build();
                        aihhVar.copyOnWrite();
                        atso atsoVar4 = (atso) aihhVar.instance;
                        atsnVar4.getClass();
                        atsoVar4.e = atsnVar4;
                        atsoVar4.b |= 4;
                    } catch (aiik e) {
                        uyl.c("raw graph capability interface parse failed.", e);
                    }
                }
            }
        }
        return (atso) aihhVar.build();
    }

    public static aipd fU(arkv arkvVar) {
        aihf aihfVarCreateBuilder = aipd.a.createBuilder();
        if ((arkvVar.b & 1) != 0) {
            String str = arkvVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            aipd aipdVar = (aipd) aihfVarCreateBuilder.instance;
            str.getClass();
            aipdVar.b |= 1;
            aipdVar.c = str;
        }
        if ((arkvVar.b & 2) != 0) {
            int iAU = a.aU(arkvVar.d);
            if (iAU == 0) {
                iAU = 1;
            }
            int i = iAU + (-1) == 1 ? 2 : 1;
            aihfVarCreateBuilder.copyOnWrite();
            aipd aipdVar2 = (aipd) aihfVarCreateBuilder.instance;
            aipdVar2.d = i - 1;
            aipdVar2.b |= 2;
        }
        return (aipd) aihfVarCreateBuilder.build();
    }

    public static atse fV(armj armjVar) {
        aihf aihfVarCreateBuilder = atse.a.createBuilder();
        String str = armjVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        atse atseVar = (atse) aihfVarCreateBuilder.instance;
        str.getClass();
        atseVar.c = 1;
        atseVar.d = str;
        return (atse) aihfVarCreateBuilder.build();
    }

    static int fW(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3) {
            return 5;
        }
        if (i2 != 4) {
            return i2 != 5 ? 2 : 7;
        }
        return 6;
    }

    public static Uri fX(augy augyVar) {
        String scheme;
        augyVar.getClass();
        Uri uriFY = fY(augyVar);
        if (uriFY == null || gc(uriFY) || !((scheme = uriFY.getScheme()) == null || awrc.c(scheme, "file") || awrc.c(scheme, "content"))) {
            return null;
        }
        return fY(augyVar);
    }

    public static Uri fY(augy augyVar) {
        int i = augyVar.c;
        int iE = atxy.e(i);
        if (iE == 0) {
            throw null;
        }
        int i2 = iE - 1;
        if (i2 == 7) {
            auhc auhcVar = i == 108 ? (auhc) augyVar.d : auhc.a;
            String str = (auhcVar.c == 1 ? (auhl) auhcVar.d : auhl.a).c;
            str.getClass();
            Uri uri = Uri.parse(str);
            uri.getClass();
            return uri;
        }
        if (i2 != 8) {
            return null;
        }
        augz augzVar = i == 109 ? (augz) augyVar.d : augz.a;
        String str2 = (augzVar.b == 1 ? (auhk) augzVar.c : auhk.a).c;
        str2.getClass();
        Uri uri2 = Uri.parse(str2);
        uri2.getClass();
        return uri2;
    }

    public static vfz fZ(augy augyVar) {
        Duration durationV;
        augyVar.getClass();
        long j = augyVar.e;
        aigu aiguVar = augyVar.i;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        aiguVar.getClass();
        Duration durationV2 = aext.v(aiguVar);
        aigu aiguVar2 = augyVar.j;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        aiguVar2.getClass();
        Duration durationV3 = aext.v(aiguVar2);
        int i = augyVar.c;
        Duration durationV4 = null;
        if (i == 108) {
            aigu aiguVar3 = (i == 108 ? (auhc) augyVar.d : auhc.a).e;
            if (aiguVar3 == null) {
                aiguVar3 = aigu.a;
            }
            aiguVar3.getClass();
            durationV = aext.v(aiguVar3);
        } else {
            durationV = null;
        }
        aiie aiieVar = augyVar.t;
        aiieVar.getClass();
        aihl aihlVar = augm.b;
        aihlVar.getClass();
        augm augmVar = (augm) gh(aiieVar, aihlVar);
        if (augmVar != null && (augmVar.c & 1) != 0) {
            aigu aiguVar4 = augmVar.d;
            if (aiguVar4 == null) {
                aiguVar4 = aigu.a;
            }
            aiguVar4.getClass();
            durationV4 = aext.v(aiguVar4);
        }
        return new vfz(j, durationV2, durationV3, durationV, durationV4);
    }

    public static void fa(Map map, apln aplnVar, String str) {
        for (aplq aplqVar : aplnVar.c) {
            aplqVar.getClass();
            Object objEY = eY(aplqVar);
            if (objEY != null || (objEY = gT(aplqVar)) != null) {
                String str2 = aplqVar.d;
                str2.getClass();
                map.put(eZ(str, str2), objEY);
            }
        }
        for (apln aplnVar2 : aplnVar.d) {
            aplnVar2.getClass();
            String str3 = aplnVar2.b;
            str3.getClass();
            fa(map, aplnVar2, eZ(str, str3));
        }
        for (aplo aploVar : aplnVar.e) {
            aploVar.getClass();
            gV(map, aploVar, str);
        }
    }

    public static ljt fb(Context context) {
        return new lji(context, new ljs());
    }

    public static String fc(auir auirVar) {
        switch (auirVar.ordinal()) {
            case 20:
                return "Aboreto";
            case 21:
                return "Akaya Telivigala";
            case 22:
                return "Alegreya";
            case 23:
                return "Alex Brush";
            case 24:
                return "Alfa Slab One";
            case 25:
                return "Alkalami";
            case 26:
                return "Alkatra";
            case 27:
                return "Amatic SC";
            case 28:
                return "Anek Bangla";
            case 29:
                return "Anek Latin";
            case 30:
                return "Aoboshi One";
            case 31:
                return "Bagel Fat One";
            case 32:
                return "Barlow";
            case 33:
                return "BioRhyme";
            case 34:
                return "Braah One";
            case 35:
                return "Bungee";
            case 36:
                return "Bungee Shade";
            case 37:
                return "Cardo";
            case 38:
                return "Caveat Brush";
            case 39:
                return "Cherry Bomb One";
            case 40:
                return "Coiny";
            case 41:
                return "Comforter";
            case 42:
                return "Delicious Handdrawn";
            case 43:
                return "East Sea Dokdo";
            case 44:
                return "Fasthand";
            case 45:
                return "Fira Mono";
            case 46:
                return "Freehand";
            case 47:
                return "Gaegu";
            case 48:
                return "Gasoek One";
            case 49:
                return "Gayathri";
            case 50:
                return "IBM Plex Mono";
            case 51:
                return "Inknut Antiqua";
            case 52:
                return "Kalam";
            case 53:
                return "Kumar One";
            case 54:
                return "Licorice";
            case 55:
                return "Mochiy Pop One";
            case 56:
                return "Monoton";
            case 57:
                return "Montecarlo";
            case 58:
                return "New Rocker";
            case 59:
                return "Noto Serif Japanese";
            case 60:
                return "Orbit";
            case 61:
                return "Oswald";
            case 62:
                return "Pacifico";
            case 63:
                return "Permanent Marker";
            case 64:
                return "Playfair Display";
            case 65:
                return "Poppins";
            case 66:
                return "Rubik Distressed";
            case 67:
                return "Silkscreen";
            case 68:
                return "Single Day";
            case 69:
                return "Source Sans 3";
            case 70:
                return "Zen Old Mincho";
            default:
                return null;
        }
    }

    public static Rect fd(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    public static boolean fe(augy augyVar) {
        auhv auhvVar = augyVar.c == 107 ? (auhv) augyVar.d : auhv.a;
        int iBi = a.bi((auhvVar.c == 2 ? (auih) auhvVar.d : auih.a).f);
        return iBi != 0 && iBi == 9;
    }

    public static boolean ff(augy augyVar) {
        int i = augyVar.c;
        if (i != 102) {
            return (i == 107 ? (auhv) augyVar.d : auhv.a).c == 2;
        }
        return true;
    }

    public static void fg(vjb vjbVar, Canvas canvas, Paint paint) {
        if (canvas != null) {
            int iMin = (Math.min(vjbVar.getHeight(), vjbVar.getWidth()) - vjbVar.getPaddingLeft()) - vjbVar.getPaddingRight();
            int height = vjbVar.getHeight() / 2;
            int width = vjbVar.getWidth() / 2;
            paint.setColor(vjbVar.c());
            float f = width;
            float f2 = height;
            float f3 = iMin / 2;
            canvas.drawCircle(f, f2, f3, paint);
            paint.setColor(vjbVar.b());
            canvas.drawCircle(f, f2, f3 - vjbVar.a(), paint);
        }
    }

    public static xgj fh(aqcr aqcrVar) {
        int iBi = a.bi(aqcrVar.c);
        if (iBi != 0 && iBi == 4) {
            return new xgj(xhb.b(65451));
        }
        amud amudVarA = xia.a(aqcrVar);
        return new xgj(amudVarA != null ? amudVarA.d : aigj.d, (amud) null);
    }

    public static Optional fi(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return Optional.empty();
        }
        String str = vcb.a;
        return Optional.ofNullable(new File("stickers", lastPathSegment).getPath());
    }

    public static Optional fj(apji apjiVar) {
        apjiVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqct.a);
        apjiVar.c(aihlVarCheckIsLite);
        if (!apjiVar.j.n(aihlVarCheckIsLite.d)) {
            return Optional.empty();
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqct.a);
        apjiVar.c(aihlVarCheckIsLite2);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
        aqcs aqcsVar = (aqcs) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        if ((aqcsVar.b & 1) == 0) {
            return aqcsVar.d.size() != 0 ? Optional.ofNullable(aawb.F((aqmh) aqcsVar.d.get(0))) : Optional.empty();
        }
        aqmh aqmhVar = aqcsVar.c;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        return Optional.ofNullable(aawb.F(aqmhVar));
    }

    public static List fk(apji apjiVar) {
        apjiVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aqct.a);
        apjiVar.c(aihlVarCheckIsLite);
        ahno.O(apjiVar.j.n(aihlVarCheckIsLite.d));
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aqct.a);
        apjiVar.c(aihlVarCheckIsLite2);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((aqcs) objC).d.iterator();
        while (it.hasNext()) {
            Uri uriF = aawb.F((aqmh) it.next());
            if (uriF != null) {
                arrayList.add(uriF.toString());
            }
        }
        return arrayList;
    }

    public static aigj fl(MessageLite messageLite) {
        amud amudVarA = xia.a(messageLite);
        return amudVarA != null ? amudVarA.d : aigj.d;
    }

    public static float fm(Context context, float f) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    public static boolean fn(String str) {
        return (str == null || str.isEmpty() || uxp.c(str)) ? false : true;
    }

    public static ukh fo(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6 = f / f2;
        float f7 = 0.0f;
        if (f6 > f3) {
            f5 = (1.0f - (f3 / f6)) / 2.0f;
            f4 = 0.0f;
            f7 = f5;
        } else {
            f4 = (1.0f - (f6 / f3)) / 2.0f;
            f5 = 0.0f;
        }
        ukg ukgVar = new ukg();
        ukgVar.c(f7);
        ukgVar.d(f5);
        ukgVar.e(f4);
        ukgVar.b(f4);
        return ukgVar.a();
    }

    public static ajfj fp(alqv alqvVar) {
        Object next;
        ajwo ajwoVar;
        aihl aihlVarCheckIsLite;
        ajwo[] ajwoVarArr = new ajwo[2];
        ajwo ajwoVar2 = alqvVar.f;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        int i = alqvVar.b;
        if ((i & SemanticState.Modal) == 0) {
            ajwoVar2 = null;
        }
        ajwoVarArr[0] = ajwoVar2;
        ajwo ajwoVar3 = alqvVar.g;
        if (ajwoVar3 == null) {
            ajwoVar3 = ajwo.a;
        }
        if ((i & SemanticState.Obscured) == 0) {
            ajwoVar3 = null;
        }
        ajwoVarArr[1] = ajwoVar3;
        Iterator it = atqq.aQ(ajwoVarArr).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ajwoVar = (ajwo) next;
            aihlVarCheckIsLite = aihn.checkIsLite(ajfj.b);
            ajwoVar.c(aihlVarCheckIsLite);
        } while (!ajwoVar.j.n(aihlVarCheckIsLite.d));
        ajwo ajwoVar4 = (ajwo) next;
        if (ajwoVar4 == null) {
            return null;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajfj.b);
        ajwoVar4.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar4.j.k(aihlVarCheckIsLite2.d);
        return (ajfj) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
    }

    public static /* synthetic */ vcr fq(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (vcr) aihnVarBuild;
    }

    public static qvk fs(Effect effect, String str, String str2, ajhv ajhvVar) {
        if (ajhvVar != null) {
            str2 = ajhvVar.e;
        }
        int i = 1;
        if (ajhvVar != null) {
            AssetDetail defaultInstance = ajhvVar.d;
            if (defaultInstance == null) {
                defaultInstance = AssetDetail.getDefaultInstance();
            }
            int iG = CommonApis.g(defaultInstance.d);
            if (iG != 0) {
                i = iG;
            }
        }
        qvk qvkVar = new qvk(effect);
        qvkVar.g = new rbl(fR(str, str2, i));
        return qvkVar;
    }

    public static qvk ft(uzj uzjVar) {
        Effect effect = uzjVar.a;
        if (effect == null) {
            return null;
        }
        qvk qvkVar = new qvk(effect);
        qvkVar.g = new rbl(uzjVar.b);
        return qvkVar;
    }

    public static Bitmap fu(Context context, View view) {
        float f;
        int i;
        ahno.O(view.getParent() == null);
        Configuration configuration = context.getResources().getConfiguration();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutDirection(configuration.getLayoutDirection());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        frameLayout.measure(0, 0);
        int measuredWidth = frameLayout.getMeasuredWidth();
        int measuredHeight = frameLayout.getMeasuredHeight();
        float f2 = measuredWidth;
        float f3 = measuredHeight;
        int i2 = SemanticState.Modal;
        if (measuredWidth > 2048 || measuredHeight > 2048) {
            float f4 = f2 / f3;
            if (measuredWidth >= measuredHeight) {
                f = 2048.0f / f2;
                i2 = (int) (2048.0f / f4);
                i = 2048;
            } else {
                f = 2048.0f / f3;
                i = (int) (f4 * 2048.0f);
            }
        } else {
            i2 = measuredHeight;
            i = measuredWidth;
            f = 1.0f;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
        layoutParams2.gravity = 17;
        view.setLayoutParams(layoutParams2);
        view.setScaleX(f);
        view.setScaleY(f);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        frameLayout.measure(0, 0);
        frameLayout.layout(0, 0, i, i2);
        vbv vbvVar = new vbv(frameLayout, layoutParams, i, i2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(vbvVar.c, vbvVar.d, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        FrameLayout frameLayout2 = vbvVar.a;
        ViewGroup.LayoutParams layoutParams3 = vbvVar.b;
        frameLayout2.draw(canvas);
        frameLayout2.removeView(view);
        view.setLayoutParams(layoutParams3);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        return bitmapCreateBitmap;
    }

    public static Drawable fv(aduv aduvVar, Context context, alja aljaVar) {
        aliz alizVarA = aliz.a(aljaVar.c);
        if (alizVarA == null) {
            alizVarA = aliz.UNKNOWN;
        }
        int iA = aduvVar.a(alizVarA);
        if (iA == 0) {
            return null;
        }
        return dl.d(context, iA);
    }

    public static Drawable fw(adxj adxjVar, Context context, arqz arqzVar) {
        int iB = adxjVar.b(arqzVar);
        if (iB == 0) {
            return null;
        }
        return dl.d(context, iB);
    }

    public static xgz fx(ajnf ajnfVar) {
        int i = ajnfVar.b;
        if ((4194304 & i) != 0) {
            amud amudVar = ajnfVar.z;
            if (amudVar == null) {
                amudVar = amud.b;
            }
            return new xgj(amudVar);
        }
        if ((i & 2097152) != 0) {
            return new xgj(ajnfVar.y, (amud) null);
        }
        aipe aipeVar = ajnfVar.w;
        if (aipeVar == null) {
            aipeVar = aipe.a;
        }
        return new xgj(xhb.b(aipeVar.b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r4.b <= 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean fy(defpackage.ajnf r4) {
        /*
            int r0 = r4.b
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L43
            int r1 = r4.e
            r3 = 8
            if (r1 == r3) goto L18
            r3 = 35
            if (r1 == r3) goto L18
            java.lang.String r4 = "ButtonRenderer invalid, missing icon."
            fM(r4)
            goto L48
        L18:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L3d
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 != 0) goto L3b
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 != 0) goto L3b
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L35
            aipe r4 = r4.w
            if (r4 != 0) goto L31
            aipe r4 = defpackage.aipe.a
        L31:
            int r4 = r4.b
            if (r4 > 0) goto L3b
        L35:
            java.lang.String r4 = "ButtonRenderer invalid, missing data for VE logging."
            fM(r4)
            goto L48
        L3b:
            r2 = 1
            goto L48
        L3d:
            java.lang.String r4 = "ButtonRenderer invalid, missing command."
            fM(r4)
            goto L48
        L43:
            java.lang.String r4 = "ButtonRenderer invalid, missing accessibility data."
            fM(r4)
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yno.fy(ajnf):boolean");
    }

    public static aldh fz(arlj arljVar) {
        aldh aldhVarA = aldh.a(arljVar.g);
        if (aldhVarA == null) {
            aldhVarA = aldh.XENO_EFFECT_RENDERING_LAYER_UNKNOWN;
        }
        return aldhVarA == aldh.XENO_EFFECT_RENDERING_LAYER_UNKNOWN ? aldh.XENO_EFFECT_RENDERING_LAYER_CAMERA_FOREGROUND : aldhVarA;
    }

    public static boolean g(Uri uri) {
        String authority = uri.getAuthority();
        return (TextUtils.isEmpty(authority) || !authority.endsWith(".googlevideo.com") || TextUtils.isEmpty(uri.getQueryParameter("fvip")) || TextUtils.isEmpty(e(uri))) ? false : true;
    }

    public static boolean gA(auih auihVar) {
        int iBi;
        return auihVar.c == 10 || ((iBi = a.bi(auihVar.f)) != 0 && iBi == 9);
    }

    public static boolean gB(auih auihVar) {
        int iBi;
        return auihVar.c == 9 || ((iBi = a.bi(auihVar.f)) != 0 && iBi == 7);
    }

    public static boolean gC(auih auihVar) {
        if (auihVar.c == 8) {
            return true;
        }
        int iBi = a.bi(auihVar.f);
        if (iBi != 0 && iBi == 6) {
            return true;
        }
        if ((auihVar.b & 1) != 0) {
            ameh amehVar = auihVar.e;
            if (amehVar == null) {
                amehVar = ameh.a;
            }
            int iBi2 = a.bi(amehVar.g);
            if (iBi2 != 0 && iBi2 == 6) {
                return true;
            }
        }
        return false;
    }

    public static float gD(Size size, Size size2) {
        float width;
        int width2;
        if (size.getWidth() <= 0 || size.getHeight() <= 0 || size2.getWidth() <= 0 || size2.getHeight() <= 0) {
            return 1.0f;
        }
        if (size.getWidth() / size.getHeight() >= size2.getWidth() / size2.getHeight()) {
            width = size2.getHeight();
            width2 = size.getHeight();
        } else {
            width = size2.getWidth();
            width2 = size.getWidth();
        }
        return width / width2;
    }

    public static Duration gE(aufa aufaVar, Duration duration, Duration duration2) {
        Duration durationV;
        aiie aiieVar = aufaVar.k;
        aiieVar.getClass();
        aihl aihlVar = auft.b;
        aihlVar.getClass();
        auft auftVar = (auft) gh(aiieVar, aihlVar);
        Duration durationMinus = null;
        if (auftVar == null) {
            twu.d("AddedSoundCompCtrl", 6, "Failed to find derived source mixin.", null);
            aigu aiguVar = aufaVar.g;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aiguVar.getClass();
            return aext.v(aiguVar);
        }
        int i = auftVar.c;
        if ((i & SemanticState.Hidden) == 0 || (i & 16) == 0) {
            twu.d("AddedSoundCompCtrl", 6, "Missing max allowed duration or initial selected duration.", null);
            aigu aiguVar2 = aufaVar.g;
            if (aiguVar2 == null) {
                aiguVar2 = aigu.a;
            }
            aiguVar2.getClass();
            return aext.v(aiguVar2);
        }
        aiie aiieVar2 = aufaVar.k;
        aiieVar2.getClass();
        aihlVar.getClass();
        auft auftVar2 = (auft) gh(aiieVar2, aihlVar);
        if (auftVar2 != null) {
            aigu aiguVar3 = auftVar2.k;
            if (aiguVar3 == null) {
                aiguVar3 = aigu.a;
            }
            aiguVar3.getClass();
            Duration durationV2 = aext.v(aiguVar3);
            Duration durationB = ahng.B(auftVar2.g);
            aigu aiguVar4 = aufaVar.h;
            if (aiguVar4 == null) {
                aiguVar4 = aigu.a;
            }
            aiguVar4.getClass();
            Duration durationV3 = aext.v(aiguVar4);
            if ((auftVar2.c & 2) != 0) {
                aigu aiguVar5 = auftVar2.e;
                if (aiguVar5 == null) {
                    aiguVar5 = aigu.a;
                }
                aiguVar5.getClass();
                durationV = aext.v(aiguVar5);
            } else {
                durationV = null;
            }
            if (!durationV2.isZero()) {
                durationB = (Duration) atqq.h(durationV2, durationB);
            }
            Duration durationMinus2 = duration.minus(duration2);
            durationMinus2.getClass();
            durationMinus = durationV != null ? durationV.minus(durationV3) : null;
            if (durationMinus != null) {
                durationMinus2 = (Duration) atqq.h(durationMinus2, durationMinus);
            }
            durationMinus = (Duration) atqq.h(durationB, durationMinus2);
        }
        if (durationMinus != null) {
            return durationMinus;
        }
        aigu aiguVar6 = aufaVar.g;
        if (aiguVar6 == null) {
            aiguVar6 = aigu.a;
        }
        aiguVar6.getClass();
        return aext.v(aiguVar6);
    }

    public static void gF(cc ccVar) {
        yno ynoVar = new yno((byte[]) null);
        View view = ccVar.getView();
        int i = 0;
        if (view != null) {
            qpj.c();
            aha ahaVarX = afxw.x(R.id.tiktok_event_fragment_listeners, view);
            if (ahaVarX == null) {
                ahaVarX = new afv();
                view.setTag(R.id.tiktok_event_fragment_listeners, ahaVarX);
            }
            for (int i2 = 0; i2 < ahaVarX.d; i2++) {
                Class cls = (Class) ahaVarX.d(i2);
                if (unq.class.equals(cls)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Class %s is already registered as a listener. Are you adding the same View instance twice?", unq.class.getSimpleName()));
                }
                if (unq.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a subtype: %s", unq.class.getSimpleName(), cls.getSimpleName()));
                }
                if (cls.isAssignableFrom(unq.class)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a supertype: %s", unq.class.getSimpleName(), cls.getSimpleName()));
                }
            }
            ahaVarX.put(unq.class, ynoVar);
            return;
        }
        ahub ahubVar = ((uns) ccVar).a;
        while (true) {
            aha ahaVar = (aha) ahubVar.a;
            if (i >= ahaVar.d) {
                ahaVar.put(unq.class, ynoVar);
                return;
            }
            Class cls2 = (Class) ahaVar.d(i);
            ahno.K(!unq.class.equals(cls2), "Class %s is already registered as a listener. Are you adding the same listener twice?", unq.class.getSimpleName());
            ahno.M(!unq.class.isAssignableFrom(cls2), "For class %s, a listener is already registered as a subtype: %s", unq.class.getSimpleName(), cls2.getSimpleName());
            ahno.M(!cls2.isAssignableFrom(unq.class), "For class %s, a listener is already registered as a supertype: %s", unq.class.getSimpleName(), cls2.getSimpleName());
            i++;
        }
    }

    public static /* bridge */ /* synthetic */ afxj gG(afxh afxhVar) {
        throw null;
    }

    public static /* synthetic */ umo gH(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (umo) aihnVarBuild;
    }

    public static PointF gI(Rect rect, Rect rect2, xpl xplVar) {
        PointF pointF;
        if (!xplVar.o()) {
            float fHeight = rect2.height() / Math.min(rect.width(), rect.height());
            pointF = new PointF(fHeight, fHeight);
        } else {
            if (!xplVar.n() && (rect.width() <= 0 || rect.height() <= 0)) {
                return new PointF(1.0f, 1.0f);
            }
            pointF = new PointF(rect2.width() / rect.width(), rect2.height() / rect.height());
        }
        return pointF;
    }

    public static vbf gJ(cc ccVar, vao vaoVar, qcb qcbVar) {
        if (!unn.i(ccVar, vaoVar)) {
            return new vbe();
        }
        gjt gjtVar = ((gif) qcbVar.a).d;
        return new vbg((zf) gjtVar.bp.io(), vbd.b);
    }

    private static Map gK(MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities) {
        HashMap map = new HashMap();
        for (jrn jrnVar : mediaCapabilitiesOuterClass$MediaCapabilities.d) {
            int i = jrnVar.e;
            if (i != 0) {
                aiox aioxVarA = aiox.a(jrnVar.c);
                if (aioxVarA == null) {
                    aioxVarA = aiox.UNKNOWN_CODEC;
                }
                map.put(aioxVarA, Integer.valueOf(i));
            }
        }
        return map;
    }

    private static bto gL(cjz cjzVar, bse[] bseVarArr) {
        if (cjzVar != null) {
            bseVarArr = (bse[]) DesugarArrays.stream(bseVarArr).map(new woi(cjzVar, 9)).toArray(new hhv(12));
        }
        return new bto("", bseVarArr);
    }

    private static boolean gM(String str, Set set) {
        return !set.contains(str);
    }

    private static boolean gN(clo cloVar, zjr zjrVar, Set set) {
        if (!zjrVar.i.m(389, 45781240L) || cloVar.c.startsWith("audio")) {
            return true;
        }
        return !set.contains(cloVar.b) && (Build.VERSION.SDK_INT < 29 || cloVar.i);
    }

    private static boolean gO(clo cloVar, int i, int i2) {
        if (i <= 0 && i2 <= 0) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : cloVar.k()) {
            if ((i <= 0 || codecProfileLevel.profile == i) && (i2 <= 0 || codecProfileLevel.level >= i2)) {
                return true;
            }
        }
        return false;
    }

    private static long gP(wjf wjfVar, String str, TimeUnit timeUnit) {
        wja wjaVarG = wjfVar.g();
        Uri uriC = wjaVarG != null ? wjaVarG.c() : null;
        if (uriC != null) {
            Matcher matcher = Pattern.compile(str).matcher(uriC.toString());
            if (matcher.find()) {
                return timeUnit.toSeconds(Long.parseLong(matcher.group(1)));
            }
        }
        return 0L;
    }

    private static boolean gQ(View view, int i) {
        return view.getWidth() >= i && view.getHeight() >= i;
    }

    private static String gR(byte[] bArr) {
        String strEncodeToString = Base64.encodeToString(bArr, 8);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    private static boolean gS(akda akdaVar) {
        if (akdaVar != null) {
            aigj aigjVar = akdaVar.c;
            aigjVar.getClass();
            if (aext.y(aigjVar)) {
                return true;
            }
        }
        return false;
    }

    private static adpv gT(aplq aplqVar) {
        asno asnoVar;
        int i = aplqVar.b;
        adpv adptVar = null;
        if (i == 6) {
            asnoVar = i == 6 ? (asno) aplqVar.c : asno.a;
        } else {
            asnoVar = null;
        }
        if (asnoVar != null) {
            String str = asnoVar.c == 1 ? (String) asnoVar.d : "";
            str.getClass();
            if (str.length() > 0) {
                String str2 = asnoVar.c == 1 ? (String) asnoVar.d : "";
                str2.getClass();
                adptVar = new adpu(str2);
            } else {
                if (!(asnoVar.c == 2 ? (aigj) asnoVar.d : aigj.d).E()) {
                    adptVar = new adpt((asnoVar.c == 2 ? (aigj) asnoVar.d : aigj.d).G());
                }
            }
        }
        return adptVar;
    }

    private static void gU(Map map, String str, int i, apln aplnVar, String str2) {
        StringBuilder sb;
        for (aplq aplqVar : aplnVar.c) {
            aplqVar.getClass();
            Object objEY = eY(aplqVar);
            if (objEY != null || (objEY = gT(aplqVar)) != null) {
                String str3 = aplqVar.d;
                str3.getClass();
                String strEZ = eZ(str2, str3);
                String str4 = str + '[' + i + "]/" + strEZ;
                Objects.checkIndex(0, 3);
                if (objEY != null) {
                    if (objEY instanceof adox) {
                        map.put(str4, new adpx(str, i, strEZ, (adox) objEY));
                    } else if (objEY instanceof adpv) {
                        map.put(str4, new adpw(str, i, strEZ, (adpv) objEY));
                    }
                }
            }
        }
        for (apln aplnVar2 : aplnVar.d) {
            aplnVar2.getClass();
            String str5 = aplnVar2.b;
            str5.getClass();
            gU(map, str, i, aplnVar2, eZ(str2, str5));
        }
        for (aplo aploVar : aplnVar.e) {
            if (str2.length() == 0) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append('[');
                sb.append(i);
                sb.append(']');
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append('[');
                sb.append(i);
                sb.append("]/");
                sb.append(str2);
            }
            String string = sb.toString();
            aploVar.getClass();
            gV(map, aploVar, string);
        }
    }

    private static void gV(Map map, aplo aploVar, String str) {
        String str2 = aploVar.b;
        str2.getClass();
        String strEZ = eZ(str, str2);
        map.put(strEZ.concat("#size"), new adpy(strEZ, aploVar.c.size()));
        int i = 0;
        for (apln aplnVar : aploVar.c) {
            aplnVar.getClass();
            gU(map, strEZ, i, aplnVar, "");
            i++;
        }
    }

    private static void gW(Map map, aldh aldhVar) {
        List list = (List) map.get(aldhVar);
        if (list != null) {
            list.clear();
        }
    }

    public static augy ga(augy augyVar, augf... augfVarArr) {
        aihl aihlVar = augg.c;
        aihlVar.getClass();
        return gf(augyVar, aihlVar, new rla(augfVarArr, 17));
    }

    public static boolean gb(augy augyVar, augf augfVar) {
        augyVar.getClass();
        aiie aiieVar = augyVar.t;
        aiieVar.getClass();
        aihl aihlVar = augg.c;
        aihlVar.getClass();
        augg auggVar = (augg) gh(aiieVar, aihlVar);
        if (auggVar != null) {
            return new aihx(auggVar.d, augg.a).contains(augfVar);
        }
        return false;
    }

    public static boolean gc(Uri uri) {
        if (!awrc.c(uri, Uri.EMPTY)) {
            String string = uri.toString();
            string.getClass();
            if (!awrc.v(string)) {
                return false;
            }
        }
        return true;
    }

    public static boolean gd(augy augyVar) {
        augyVar.getClass();
        aiie aiieVar = augyVar.t;
        aiieVar.getClass();
        aihl aihlVar = augm.b;
        aihlVar.getClass();
        augm augmVar = (augm) gh(aiieVar, aihlVar);
        return (augmVar == null || (augmVar.c & 16) == 0 || !augmVar.f) ? false : true;
    }

    public static int ge(List list, aigw aigwVar) {
        list.getClass();
        aigwVar.getClass();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            aufs aufsVar = (aufs) it.next();
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
            aufsVar.c(aihlVarCheckIsLite);
            if (aufsVar.j.n(aihlVarCheckIsLite.d)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static augy gf(augy augyVar, aigw aigwVar, awqg awqgVar) {
        jrr jrrVar = (jrr) augyVar.toBuilder();
        jrrVar.copyOnWrite();
        ((augy) jrrVar.instance).t = augy.emptyProtobufList();
        aiie aiieVar = augyVar.t;
        aiieVar.getClass();
        jrrVar.f(gk(aiieVar, aigwVar, awqgVar));
        aihn aihnVarBuild = jrrVar.build();
        aihnVarBuild.getClass();
        return (augy) aihnVarBuild;
    }

    public static auhs gg(auhs auhsVar, aigw aigwVar, awqg awqgVar) {
        auhsVar.getClass();
        aigwVar.getClass();
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        auhqVar.copyOnWrite();
        ((auhs) auhqVar.instance).f = auhs.emptyProtobufList();
        aiie aiieVar = auhsVar.f;
        aiieVar.getClass();
        auhqVar.c(gk(aiieVar, aigwVar, awqgVar));
        aihn aihnVarBuild = auhqVar.build();
        aihnVarBuild.getClass();
        return (auhs) aihnVarBuild;
    }

    public static Object gh(List list, aigw aigwVar) {
        Object next;
        aufs aufsVar;
        aihl aihlVarCheckIsLite;
        list.getClass();
        aigwVar.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            aufsVar = (aufs) next;
            aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
            aufsVar.c(aihlVarCheckIsLite);
        } while (!aufsVar.j.n(aihlVarCheckIsLite.d));
        aufs aufsVar2 = (aufs) next;
        if (aufsVar2 == null) {
            return null;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aigwVar);
        aufsVar2.c(aihlVarCheckIsLite2);
        Object objK = aufsVar2.j.k(aihlVarCheckIsLite2.d);
        return objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
    }

    public static Object gi(List list, aigw aigwVar) {
        list.getClass();
        aigwVar.getClass();
        Object objGh = gh(list, aigwVar);
        if (objGh != null) {
            return objGh;
        }
        Object obj = ((aihl) aigwVar).b;
        obj.getClass();
        return obj;
    }

    public static List gj(List list, aigw aigwVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            aufs aufsVar = (aufs) obj;
            aihl aihlVarCheckIsLite = aihn.checkIsLite(aigwVar);
            aufsVar.c(aihlVarCheckIsLite);
            if (!aufsVar.j.n(aihlVarCheckIsLite.d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List gk(List list, aigw aigwVar, awqg awqgVar) {
        aihh aihhVar = (aihh) aufs.a.createBuilder();
        aihhVar.e(aigwVar, awqgVar.invoke(gi(list, aigwVar)));
        aihn aihnVarBuild = aihhVar.build();
        aihnVarBuild.getClass();
        aufs aufsVar = (aufs) aihnVarBuild;
        int iGe = ge(list, aigwVar);
        return iGe == -1 ? atqq.aj(list, atqq.H(aufsVar)) : atqq.aj(atqq.aj(list.subList(0, iGe), atqq.H(aufsVar)), list.subList(iGe + 1, list.size()));
    }

    public static aufa gl(auhs auhsVar, long j) {
        Optional optionalM = usj.m(auhsVar, j);
        optionalM.getClass();
        return (aufa) awrc.f(optionalM);
    }

    public static aufa gm(auhs auhsVar) {
        aiie aiieVar = auhsVar.f;
        aiieVar.getClass();
        aihl aihlVar = aufn.b;
        aihlVar.getClass();
        aufn aufnVar = (aufn) gh(aiieVar, aihlVar);
        if (aufnVar == null) {
            return null;
        }
        return gl(auhsVar, aufnVar.d);
    }

    public static Map gn(auhs auhsVar, long j) {
        Map mapUnmodifiableMap;
        auhsVar.getClass();
        augd augdVar = (augd) DesugarCollections.unmodifiableMap(((auge) gx(auhsVar, auge.b)).c).get(Long.valueOf(j));
        return (augdVar == null || (mapUnmodifiableMap = DesugarCollections.unmodifiableMap(augdVar.b)) == null) ? awnp.a : mapUnmodifiableMap;
    }

    public static boolean go(aufd aufdVar, auhs auhsVar) {
        Duration durationV;
        Duration durationV2;
        if ((aufdVar.b & 2) == 0) {
            return true;
        }
        aufh aufhVar = aufdVar.h;
        if (aufhVar == null) {
            aufhVar = aufh.a;
        }
        aufhVar.getClass();
        if ((aufhVar.b & 2) != 0) {
            aigu aiguVar = aufhVar.d;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aiguVar.getClass();
            durationV = aext.v(aiguVar);
        } else {
            durationV = Duration.ZERO;
            durationV.getClass();
        }
        Duration durationL = usj.l(auhsVar);
        durationL.getClass();
        if ((aufhVar.b & 4) != 0) {
            aigu aiguVar2 = aufhVar.e;
            if (aiguVar2 == null) {
                aiguVar2 = aigu.a;
            }
            aiguVar2.getClass();
            durationV2 = aext.v(aiguVar2);
        } else {
            durationV2 = durationL;
        }
        Duration durationB = ahng.B(1);
        return durationV.compareTo(durationB) <= 0 && durationV2.compareTo(durationL.minus(durationB)) >= 0;
    }

    public static arfu gp(auhs auhsVar, long j) {
        Object next;
        aiie aiieVar;
        aiie aiieVar2;
        aiie<aufw> aiieVar3;
        aiie aiieVar4 = auhsVar.f;
        aiieVar4.getClass();
        aihl aihlVar = aufx.b;
        aihlVar.getClass();
        aufx aufxVar = (aufx) gh(aiieVar4, aihlVar);
        if (aufxVar != null && (aiieVar3 = aufxVar.c) != null && !aiieVar3.isEmpty()) {
            for (aufw aufwVar : aiieVar3) {
                if ((aufwVar.b & 2) != 0 && aufwVar.d == j) {
                    return arfu.VOLUME_TYPE_ORIGINAL;
                }
            }
        }
        aiie aiieVar5 = auhsVar.f;
        aiieVar5.getClass();
        aihl aihlVar2 = aufn.b;
        aihlVar2.getClass();
        aufn aufnVar = (aufn) gh(aiieVar5, aihlVar2);
        if (aufnVar != null && aufnVar.d == j) {
            return arfu.VOLUME_TYPE_ADDED_MUSIC;
        }
        aiie aiieVar6 = auhsVar.f;
        aiieVar6.getClass();
        aihl aihlVar3 = augp.b;
        aihlVar3.getClass();
        augp augpVar = (augp) gh(aiieVar6, aihlVar3);
        if (augpVar != null && (aiieVar2 = augpVar.c) != null && !aiieVar2.isEmpty()) {
            Iterator<E> it = aiieVar2.iterator();
            while (it.hasNext()) {
                if (((augo) it.next()).b == j) {
                    return arfu.VOLUME_TYPE_VOICEOVER;
                }
            }
        }
        aiie aiieVar7 = auhsVar.f;
        aiieVar7.getClass();
        aihl aihlVar4 = augl.b;
        aihlVar4.getClass();
        augl auglVar = (augl) gh(aiieVar7, aihlVar4);
        if (auglVar != null && (aiieVar = auglVar.c) != null && !aiieVar.isEmpty()) {
            Iterator<E> it2 = aiieVar.iterator();
            while (it2.hasNext()) {
                if (((augk) it2.next()).c == j) {
                    return arfu.VOLUME_TYPE_TEXT_TO_SPEECH;
                }
            }
        }
        aiie aiieVar8 = auhsVar.e;
        aiieVar8.getClass();
        Iterator<E> it3 = aiieVar8.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((aufa) next).e != j);
        aufa aufaVar = (aufa) next;
        if (aufaVar != null) {
            aiie aiieVar9 = aufaVar.k;
            aiieVar9.getClass();
            aihl aihlVar5 = augn.b;
            aihlVar5.getClass();
            if (gh(aiieVar9, aihlVar5) != null) {
                return arfu.VOLUME_TYPE_VISUAL_REMIX;
            }
        }
        return arfu.VOLUME_TYPE_UNKNOWN;
    }

    public static String gq(utv utvVar) {
        return utvVar.getClass().getSimpleName();
    }

    public static File gr(Context context) {
        return new File(context.getFilesDir(), vcb.a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qvm] */
    public static qvk gs(Effect effect, aufd aufdVar, asjv asjvVar, qvm qvmVar) {
        Optional optionalOf = Optional.of(aufdVar.e == 1001 ? (aufl) aufdVar.f : aufl.a);
        optionalOf.isPresent();
        Optional optionalOfNullable = Optional.ofNullable(((aufl) optionalOf.get()).b);
        if (true == optionalOfNullable.isPresent() && ((String) optionalOfNullable.get()).isEmpty()) {
            optionalOfNullable = Optional.empty();
        }
        hqb hqbVar = new hqb(effect, qvmVar, 20, null);
        if (true == optionalOfNullable.isPresent()) {
            Object obj = optionalOfNullable.get();
            optionalOfNullable = Optional.ofNullable(new qvn((Effect) hqbVar.b, (String) obj, hqbVar.a));
        }
        qvk qvkVar = (qvk) (true != optionalOfNullable.isPresent() ? new qvk((Effect) new hly(effect, 12).a) : optionalOfNullable.get());
        qvkVar.g = new rbl(asjvVar);
        return qvkVar;
    }

    public static boolean gt(uzj uzjVar, String str) {
        aiie<apsr> aiieVar = uzjVar.b.d;
        if (aiieVar.isEmpty()) {
            return true;
        }
        for (apsr apsrVar : aiieVar) {
            int i = apsrVar.b;
            if (i == 4) {
                if ((i == 4 ? (apse) apsrVar.c : apse.a).c.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static qvc gu(qvc qvcVar) {
        qvc qviVar;
        qvcVar.getClass();
        Objects.checkIndex(0, 4);
        if (qvcVar instanceof qvn) {
            qviVar = new qvn((qvn) qvcVar);
        } else if (qvcVar instanceof qvk) {
            qviVar = new qvk(((qvk) qvcVar).a, (byte[]) null);
        } else {
            qviVar = qvcVar instanceof qvi ? new qvi(((qvi) qvcVar).a) : qvcVar.clone();
        }
        qviVar.h(qvcVar.d);
        qviVar.g(qvcVar.e);
        qviVar.f = qvcVar.f;
        qviVar.g = qvcVar.g;
        return qviVar;
    }

    public static aufx gv(auhs auhsVar) {
        return (aufx) gx(auhsVar, aufx.b);
    }

    public static auhs gw(auhs auhsVar, aigw aigwVar, Function function) {
        return gg(auhsVar, aigwVar, new urx(function));
    }

    public static Object gx(auht auhtVar, aigw aigwVar) {
        return gi(((auhs) auhtVar).f, aigwVar);
    }

    public static urp gy(auew auewVar) {
        Duration durationV;
        auewVar.getClass();
        if ((auewVar.b & 4) != 0) {
            aigu aiguVar = auewVar.e;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aiguVar.getClass();
            durationV = aext.v(aiguVar);
        } else {
            durationV = null;
        }
        String str = auewVar.f;
        str.getClass();
        String string = str.length() > 0 ? auewVar.f : UUID.randomUUID().toString();
        string.getClass();
        auhs auhsVar = auewVar.c;
        if (auhsVar == null) {
            auhsVar = auhs.a;
        }
        auhsVar.getClass();
        String str2 = auewVar.d;
        str2.getClass();
        return new urp(auhsVar, str2, durationV, string);
    }

    public static int gz(akgx akgxVar, DisplayMetrics displayMetrics) {
        float f = akgxVar.j;
        agrf agrfVar = twm.a;
        return (int) TypedValue.applyDimension(1, f, displayMetrics);
    }

    public static jte h(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 32) {
            return null;
        }
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 32, length);
            if (bArr[8] != 0) {
                zhr.e(zhq.DRM, "Expected PSSH version 0, actual version %s ", Byte.valueOf(bArr[8]));
                return null;
            }
            atzp atzpVar = (atzp) aihn.parseFrom(atzp.a, bArrCopyOfRange);
            if (atzpVar == null) {
                zhr.d(zhq.DRM, "Widevine PSSH Proto parsing failed.");
                return null;
            }
            if ((atzpVar.b & 32) != 0) {
                return new jte(atzpVar.c.G(), atzpVar.d, (atzpVar.b & SemanticState.Hidden) != 0 ? atzpVar.e : 120);
            }
            return null;
        } catch (aiik | ArrayIndexOutOfBoundsException unused) {
            zhr.d(zhq.DRM, "Could not parse drmInitData from PSSH");
            return null;
        }
    }

    public static /* synthetic */ int i(Object obj) {
        Objects.checkIndex(0, 4);
        if (obj instanceof yua) {
            return 0;
        }
        if (obj instanceof yub) {
            return 1;
        }
        return obj instanceof ytz ? 2 : -2;
    }

    public static boolean j(zcf zcfVar) {
        wja wjaVar = zcfVar.A;
        if (!wjaVar.D()) {
            akwm akwmVar = zcfVar.y.d.f;
            if (akwmVar == null) {
                akwmVar = akwm.b;
            }
            int iQ = atqp.Q(akwmVar.aU);
            if ((iQ == 0 || iQ != 2) && (!wjaVar.A || zcfVar.H.l.m(23, 45665897L))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String k(int i) {
        return i != 1 ? "NET_FETCH_PARAMS" : "DATA_SOURCE_PARAMS";
    }

    public static /* synthetic */ String l(int i) {
        return i != 1 ? "ONESIE_VIDEO_DATA" : "ONESIE_RESPONSE_SELECTOR";
    }

    public static boolean m(yrg yrgVar, mbc mbcVar) {
        return yrgVar != null && mbcVar.b() - yrgVar.a < 30000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yno n(boolean z, String str, FormatIdOuterClass$FormatId formatIdOuterClass$FormatId, Iterable iterable, PlaybackControllerWrapper playbackControllerWrapper, abxv abxvVar) {
        str.getClass();
        abxvVar.getClass();
        if (z || iterable == 0 || !iterable.iterator().hasNext()) {
            return yhx.a;
        }
        agkz agkzVarN = agkz.n(iterable);
        agkzVarN.getClass();
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadataBr = zik.br(agkzVarN, str, formatIdOuterClass$FormatId);
        if (formatInitializationMetadataOuterClass$FormatInitializationMetadataBr != null) {
            return new yhw(formatInitializationMetadataOuterClass$FormatInitializationMetadataBr);
        }
        elq elqVarG = elq.G(abxvVar.A(agkzVarN, zik.bu(str, formatIdOuterClass$FormatId.c, formatIdOuterClass$FormatId.e, formatIdOuterClass$FormatId.d), false));
        if (elqVarG == null || playbackControllerWrapper == null) {
            return yhx.a;
        }
        wgs wgsVarA = playbackControllerWrapper.a(formatIdOuterClass$FormatId);
        if (wgsVarA == null) {
            return yhx.a;
        }
        FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadataCs = zik.cs(str, formatIdOuterClass$FormatId, wgsVarA, elqVarG);
        formatInitializationMetadataOuterClass$FormatInitializationMetadataCs.getClass();
        return new yhv(formatInitializationMetadataOuterClass$FormatInitializationMetadataCs);
    }

    public static void o(Set set, abxv abxvVar, PlaybackControllerWrapper playbackControllerWrapper, String str, List list, FormatInitializationMetadataReceiver formatInitializationMetadataReceiver) {
        wgs wgsVarA;
        elq elqVarG;
        if (set.isEmpty()) {
            synchronized (zik.class) {
                formatInitializationMetadataReceiver.pushFormatInitializationMetadatas(StatusOr.fromStatus(Status.l));
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormatIdOuterClass$FormatId formatIdOuterClass$FormatId = (FormatIdOuterClass$FormatId) it.next();
            FormatInitializationMetadataOuterClass$FormatInitializationMetadata formatInitializationMetadataOuterClass$FormatInitializationMetadataBr = zik.br(set, str, formatIdOuterClass$FormatId);
            if (formatInitializationMetadataOuterClass$FormatInitializationMetadataBr != null) {
                arrayList.add(formatInitializationMetadataOuterClass$FormatInitializationMetadataBr);
            } else if (playbackControllerWrapper != null && (wgsVarA = playbackControllerWrapper.a(formatIdOuterClass$FormatId)) != null && (elqVarG = elq.G(abxvVar.A(set, zik.bu(str, formatIdOuterClass$FormatId.c, formatIdOuterClass$FormatId.e, formatIdOuterClass$FormatId.d), false))) != null) {
                arrayList.add(zik.cs(str, formatIdOuterClass$FormatId, wgsVarA, elqVarG));
            }
        }
        synchronized (zik.class) {
            formatInitializationMetadataReceiver.pushFormatInitializationMetadatas(StatusOr.fromValue(arrayList));
        }
    }

    public static zia p(zew zewVar) {
        return zia.a(zewVar.e(), zewVar.f(), zewVar.g(), zewVar.d(), zewVar.c(), zewVar.i(), zewVar.h(), zewVar.r());
    }

    public static int q(zjr zjrVar, List list, long j, long j2, agex agexVar) {
        int size = list.size();
        for (int i = 1; i < size; i++) {
            aawx aawxVar = (aawx) list.get(i);
            if ((!zjrVar.i.m(6, 45362171L) || j < aawxVar.a) && aawxVar.a - j >= j2 && agexVar.a(aawxVar.c)) {
                return i;
            }
        }
        return size;
    }

    public static boolean r(yha yhaVar, zed zedVar, String str, wiu wiuVar, boolean z, long j) {
        return !TextUtils.isEmpty(str) && !wiuVar.ab() && z && yhaVar.e(str, zedVar.c(), j, 0, 0, 0);
    }

    public static boolean s(yha yhaVar, String str, wiu wiuVar, String str2) {
        return TextUtils.isEmpty(str) || zik.cn(str2) == -1 || wiuVar.ab() || yhaVar.e(str, str2, 0L, 1, 3, 3);
    }

    public static boolean t(zjr zjrVar, wgs wgsVar, cdq[] cdqVarArr) {
        if (!zjrVar.fm()) {
            return false;
        }
        vxz vxzVar = zjrVar.j;
        if (vxzVar.m(183, 45617911L) && wgsVar.X()) {
            return false;
        }
        if (wgsVar.F() || wgsVar.ad()) {
            int iE = wgsVar.e();
            if (vxzVar.m(182, 45617910L)) {
                return false;
            }
            if (vxzVar.m(211, 45632883L) && iE != 140 && iE != 141) {
                return false;
            }
        }
        try {
            bse bseVarM = wgsVar.m();
            cdq cdqVar = cdqVarArr[0];
            bsd bsdVar = new bsd(bseVarM);
            bsdVar.I = 48000;
            bsdVar.G = 2;
            return (cdqVar.c(new bse(bsdVar)) & 3584) != 0;
        } catch (cbo unused) {
            zvp.a(zvn.b, zvm.f, "Checking audio renderer offload ability caused an exception.");
            return false;
        }
    }

    public static boolean u(MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities, MediaCapabilitiesOuterClass$MediaCapabilities mediaCapabilitiesOuterClass$MediaCapabilities2) {
        if (mediaCapabilitiesOuterClass$MediaCapabilities != mediaCapabilitiesOuterClass$MediaCapabilities2) {
            return mediaCapabilitiesOuterClass$MediaCapabilities == null || mediaCapabilitiesOuterClass$MediaCapabilities2 == null || !gK(mediaCapabilitiesOuterClass$MediaCapabilities).equals(gK(mediaCapabilitiesOuterClass$MediaCapabilities2));
        }
        return false;
    }

    public static Pair v(cjz cjzVar, List list, boolean z) {
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wgs wgsVar = (wgs) it.next();
            if (!wgsVar.Z() || z) {
                if (wgsVar.I()) {
                    arrayList3.add(wgsVar);
                } else if (wgsVar.af()) {
                    arrayList4.add(wgsVar);
                }
            }
        }
        int i = 8;
        bse[] bseVarArr = (bse[]) j$.util.Collection.EL.stream(arrayList3).map(new yom(i)).toArray(new hhv(13));
        bse[] bseVarArr2 = (bse[]) j$.util.Collection.EL.stream(arrayList4).map(new yom(i)).toArray(new hhv(14));
        if (bseVarArr.length > 0) {
            arrayList.add(gL(cjzVar, bseVarArr));
            arrayList2.add(new aami(1, (wgs[]) arrayList3.toArray(new wgs[0])));
        }
        if (bseVarArr2.length > 0) {
            arrayList.add(gL(cjzVar, bseVarArr2));
            arrayList2.add(new aami(2, (wgs[]) arrayList4.toArray(new wgs[0])));
        }
        return new Pair(new coy((bto[]) arrayList.toArray(new bto[0])), (aami[]) arrayList2.toArray(new aami[0]));
    }

    public static zlo w(zjr zjrVar) {
        return (zjrVar.bf() || !zjrVar.eH()) ? zlo.DUAL_SURFACE : zlo.VIDEO_DECODER_GL_SURFACE_VIEW;
    }

    public static boolean x(wja wjaVar, boolean z) {
        return wjaVar != null && (wjaVar.equals(wja.c) || !(wjaVar.t.isEmpty() || wjaVar.A)) && !z;
    }

    public static boolean y(zjr zjrVar, wiu wiuVar, boolean z) {
        int iOrdinal = zjrVar.eR().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 5) {
                return true;
            }
        } else if (z && wiuVar.aI()) {
            return true;
        }
        return false;
    }

    public static long z(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j + j2;
    }

    public yno(byte[] bArr) {
    }

    public yno() {
    }

    public yno(byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3) {
        ahng.aj();
    }

    public yno(Executor executor) {
        new ahud((short[]) null);
        new ahfg(executor);
    }

    public yno(int[] iArr, byte[] bArr) {
        agke agkeVar = agpi.a;
    }

    public yno(short[] sArr, byte[] bArr) {
        new AtomicInteger(0);
    }

    public yno(char[] cArr, char[] cArr2) {
        new ConcurrentHashMap();
    }

    public yno(aqsa aqsaVar) {
        aqsaVar.getClass();
    }
}
