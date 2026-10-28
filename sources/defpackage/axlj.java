package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class axlj {
    public final Object a;
    public final Object b;
    public final Object c;

    public axlj(aetb aetbVar) {
        aqiu aqiuVar = aetbVar.io().g;
        aqiv aqivVar = (aqiuVar == null ? aqiu.a : aqiuVar).c;
        aqivVar = aqivVar == null ? aqiv.a : aqivVar;
        this.c = K(DesugarCollections.unmodifiableMap(aqivVar.b));
        K(DesugarCollections.unmodifiableMap(aqivVar.c));
        aqja aqjaVar = aqivVar.e;
        aqjaVar = aqjaVar == null ? aqja.a : aqjaVar;
        agu aguVar = new agu(6);
        aihv aihvVar = aqjaVar.b;
        float f = aqjaVar.c;
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(aqjaVar.d);
        Iterator it = aihvVar.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Integer num = (Integer) it.next();
            num.intValue();
            if (f <= 0.0f || f > 1.0f || ThreadLocalRandom.current().nextFloat() >= f) {
                z = false;
            }
            aguVar.h(num, Boolean.valueOf(z));
        }
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            float fFloatValue = ((Float) entry.getValue()).floatValue();
            aguVar.h((Integer) entry.getKey(), Boolean.valueOf(fFloatValue > 0.0f && fFloatValue <= 1.0f && ThreadLocalRandom.current().nextFloat() < fFloatValue));
        }
        this.a = aguVar;
        aqja aqjaVar2 = aqivVar.e;
        aqjaVar2 = aqjaVar2 == null ? aqja.a : aqjaVar2;
        agu aguVar2 = new agu(6);
        for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(aqjaVar2.e).entrySet()) {
            float fFloatValue2 = ((Float) entry2.getValue()).floatValue();
            aguVar2.h((Integer) entry2.getKey(), Boolean.valueOf(fFloatValue2 > 0.0f && fFloatValue2 <= 1.0f && ThreadLocalRandom.current().nextFloat() < fFloatValue2));
        }
        this.b = aguVar2;
    }

    public static final adrr F() {
        return new adrr(new ConcurrentHashMap());
    }

    public static final Typeface H(Context context, int i) {
        context.getClass();
        int i2 = avt.a;
        if (context.isRestricted()) {
            return null;
        }
        return avt.e(context, i, new TypedValue(), 0, null, false, false);
    }

    public static void J(axlj axljVar, aciz acizVar) {
        axlj axljVar2 = (axlj) acizVar.a;
        Object obj = axljVar2.c;
        long[] jArr = (long[]) acizVar.b;
        ahgv.a((long[]) axljVar.c, (long[]) obj, jArr);
        Object obj2 = axljVar2.b;
        long[] jArr2 = (long[]) axljVar2.a;
        ahgv.a((long[]) axljVar.b, (long[]) obj2, jArr2);
        ahgv.a((long[]) axljVar.a, jArr2, jArr);
    }

    private static boolean[] K(Map map) {
        if (map.isEmpty()) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[((Integer) Collections.max(map.keySet())).intValue() + 1];
        for (Map.Entry entry : map.entrySet()) {
            float fFloatValue = ((Float) entry.getValue()).floatValue();
            zArr[((Integer) entry.getKey()).intValue()] = fFloatValue > 0.0f && fFloatValue <= 1.0f && ThreadLocalRandom.current().nextFloat() < fFloatValue;
        }
        return zArr;
    }

    private final void L(Intent intent, Bitmap bitmap, double d, double d2) throws Exception {
        try {
            File fileM = aedi.m((Activity) this.c, bitmap, "sticker");
            Object obj = this.c;
            int iIntValue = ((Integer) twm.o((Context) obj).first).intValue();
            float f = iIntValue * 0.65f;
            Pair pairCreate = Pair.create(Float.valueOf(f), Float.valueOf(bitmap.getHeight() * (f / bitmap.getWidth())));
            Activity activity = (Activity) obj;
            Uri uriL = aedi.l(activity, fileM);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uri", uriL);
            jSONObject.put("posX", d);
            jSONObject.put("posY", d2);
            jSONObject.put("width", pairCreate.first);
            jSONObject.put("height", pairCreate.second);
            intent.putExtra("sticker", jSONObject.toString());
            activity.grantUriPermission("com.snapchat.android", uriL, 1);
        } catch (IOException e) {
            throw new Exception("Failed to create story sticker asset.", e);
        }
    }

    public static final Intent j(String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setDataAndType(Uri.parse(str2), "image/*");
        intent.putExtra("CLIENT_ID", str);
        intent.setPackage("com.snapchat.android");
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("attachmentUrl", str3);
        }
        intent.setAction("android.intent.action.SEND");
        return intent;
    }

    public static /* synthetic */ void o(Throwable th) {
        if ((th instanceof RuntimeException) && th.getCause() != null) {
            th = th.getCause();
        }
        if ((th instanceof jye) || (th instanceof jxr) || (th instanceof IOException)) {
            String message = th.getMessage();
            if (message == null) {
                message = th.getClass().getSimpleName();
            }
            aegn.r(message);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void A(String str, aqhn aqhnVar) {
        ((adrr) j$.util.Map.EL.computeIfAbsent(this.b, str, new accu(13))).c = aqhnVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void B(String str, agke agkeVar) {
        ((adrr) j$.util.Map.EL.computeIfAbsent(this.b, str, new accu(14))).d = agkeVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void C(String str, String str2, Object obj, boolean z) {
        adrr adrrVar = (adrr) j$.util.Map.EL.computeIfAbsent(this.b, str, new accu(12));
        adrrVar.a.put(str2, obj);
        if (z || !str2.equals(adrrVar.b)) {
            return;
        }
        y(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void D(String str, adcw adcwVar) {
        if (j$.util.Map.EL.remove(this.a, str, adcwVar)) {
            this.b.remove(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    public final void E(String str, String str2, adcw adcwVar) {
        if (j$.util.Map.EL.remove(this.a, str2, adcwVar)) {
            this.b.remove(str2);
            this.c.remove(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [awou] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r15v6, types: [awou, java.lang.Object] */
    public final Object G(Context context, int i, awoq awoqVar) throws Throwable {
        ackt acktVar;
        axlj axljVar;
        Object obj;
        boolean zBooleanValue;
        Object obj2;
        ?? r12;
        Object objP;
        if (awoqVar instanceof ackt) {
            acktVar = (ackt) awoqVar;
            int i2 = acktVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acktVar.d = i2 - Integer.MIN_VALUE;
            } else {
                acktVar = new ackt(this, awoqVar);
            }
        } else {
            acktVar = new ackt(this, awoqVar);
        }
        Object objP2 = acktVar.c;
        awox awoxVar = awox.a;
        int i3 = acktVar.d;
        if (i3 == 0) {
            atqp.j(objP2);
            Boolean bool = (Boolean) ((acla) this.b).a(i);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
                axljVar = this;
                obj2 = context;
                int i4 = i;
                if (zBooleanValue) {
                    r12 = axljVar.c;
                } else {
                    r12 = axljVar.a;
                }
                acku ackuVar = new acku(axljVar, (Context) obj2, i4, null, 1, null);
                acktVar.a = null;
                acktVar.d = 2;
                objP = awro.p(r12, ackuVar, acktVar);
                if (objP != awoxVar) {
                    return objP;
                }
            } else {
                ?? r15 = this.c;
                axljVar = this;
                acku ackuVar2 = new acku(axljVar, context, i, null, 0);
                acktVar.a = context;
                acktVar.b = i;
                acktVar.d = 1;
                objP2 = awro.p(r15, ackuVar2, acktVar);
                if (objP2 != awoxVar) {
                    obj = context;
                    i = i;
                }
            }
            return awoxVar;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objP2);
            return objP2;
        }
        i = acktVar.b;
        Object obj3 = acktVar.a;
        atqp.j(objP2);
        axljVar = this;
        obj = obj3;
        zBooleanValue = ((Boolean) objP2).booleanValue();
        obj2 = obj;
        int i5 = i;
        if (zBooleanValue) {
            r12 = axljVar.c;
        } else {
            r12 = axljVar.a;
        }
        acku ackuVar3 = new acku(axljVar, (Context) obj2, i5, null, 1, null);
        acktVar.a = null;
        acktVar.d = 2;
        objP = awro.p(r12, ackuVar3, acktVar);
        if (objP != awoxVar) {
            return objP;
        }
        return awoxVar;
    }

    public final long I(long j) {
        return Math.max(0L, j - ((abmt) this.b).j.c(23, 45723357L, 0L));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void a(aifl aiflVar) {
        ?? r0 = this.c;
        if (r0.containsKey(aiflVar)) {
            Object obj = ((auzk) r0.get(aiflVar)).b;
        } else {
            this.b.containsKey(aiflVar);
        }
        ?? r2 = this.b;
        if (r0.containsKey(aiflVar)) {
            if (((auzk) r0.get(aiflVar)).b != null) {
                boolean z = ((auzk) r0.get(aiflVar)).a;
            }
        } else if (r2.containsKey(aiflVar)) {
            boolean z2 = ((aifm) r2.get(aiflVar)).c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public final void b(aifl aiflVar, Object obj) {
        int i = aiflVar.bh;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        boolean zBooleanValue = true;
        if (i2 == 1) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            Float f = (Float) obj;
                            if (f.isNaN() || f.isInfinite()) {
                                zBooleanValue = false;
                            }
                        }
                    } else if (((Long) obj).longValue() < 0) {
                        zBooleanValue = false;
                    }
                } else if (((Integer) obj).intValue() < 0) {
                    zBooleanValue = false;
                }
                this.c.put(aiflVar, new auzk(obj));
            }
            zBooleanValue = true ^ ((String) obj).isEmpty();
        }
        if (!zBooleanValue) {
            this.c.put(aiflVar, new auzk(null));
            return;
        }
        this.c.put(aiflVar, new auzk(obj));
    }

    public final byte[] c() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        int i = ahgv.a;
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.a;
        ahgv.d(jArr4, jArr14);
        ahgv.d(jArr13, jArr4);
        ahgv.d(jArr12, jArr13);
        ahgv.a(jArr5, jArr12, jArr14);
        ahgv.a(jArr6, jArr5, jArr4);
        ahgv.d(jArr12, jArr6);
        ahgv.a(jArr7, jArr12, jArr5);
        ahgv.d(jArr12, jArr7);
        ahgv.d(jArr13, jArr12);
        ahgv.d(jArr12, jArr13);
        ahgv.d(jArr13, jArr12);
        ahgv.d(jArr12, jArr13);
        ahgv.a(jArr8, jArr12, jArr7);
        ahgv.d(jArr12, jArr8);
        ahgv.d(jArr13, jArr12);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            ahgv.d(jArr12, jArr13);
            ahgv.d(jArr13, jArr12);
        }
        ahgv.a(jArr9, jArr13, jArr8);
        ahgv.d(jArr12, jArr9);
        ahgv.d(jArr13, jArr12);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            ahgv.d(jArr12, jArr13);
            ahgv.d(jArr13, jArr12);
        }
        ahgv.a(jArr12, jArr13, jArr9);
        ahgv.d(jArr13, jArr12);
        ahgv.d(jArr12, jArr13);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            ahgv.d(jArr13, jArr12);
            ahgv.d(jArr12, jArr13);
        }
        ahgv.a(jArr10, jArr12, jArr8);
        ahgv.d(jArr12, jArr10);
        ahgv.d(jArr13, jArr12);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            ahgv.d(jArr12, jArr13);
            ahgv.d(jArr13, jArr12);
        }
        ahgv.a(jArr11, jArr13, jArr10);
        ahgv.d(jArr13, jArr11);
        ahgv.d(jArr12, jArr13);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            ahgv.d(jArr13, jArr12);
            ahgv.d(jArr12, jArr13);
        }
        ahgv.a(jArr13, jArr12, jArr11);
        ahgv.d(jArr12, jArr13);
        ahgv.d(jArr13, jArr12);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            ahgv.d(jArr12, jArr13);
            ahgv.d(jArr13, jArr12);
        }
        ahgv.a(jArr12, jArr13, jArr10);
        ahgv.d(jArr13, jArr12);
        ahgv.d(jArr12, jArr13);
        ahgv.d(jArr13, jArr12);
        ahgv.d(jArr12, jArr13);
        ahgv.d(jArr13, jArr12);
        ahgv.a(jArr, jArr13, jArr6);
        ahgv.a(jArr2, (long[]) this.c, jArr);
        ahgv.a(jArr3, (long[]) this.b, jArr);
        byte[] bArrG = ahgv.g(jArr3);
        bArrG[31] = (byte) (bArrG[31] ^ (ahgq.a(jArr2) << 7));
        return bArrG;
    }

    public final IllegalArgumentException d() {
        Object obj = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        return new IllegalArgumentException("Multiple entries with same key: " + obj3.toString() + '=' + obj2.toString() + " and " + obj3.toString() + '=' + obj.toString());
    }

    public final void e() {
        Object obj = this.a;
        if (obj != null) {
            ((aeyu) obj).c((View) this.c);
        }
    }

    public final void f(Intent intent, Bitmap bitmap) throws Exception {
        try {
            intent.putExtra("android.intent.extra.STREAM", aedi.l((Activity) this.c, aedi.m((Activity) this.c, bitmap, "background")));
            if (((vxz) this.a).l(2, 45854523L, false)) {
                intent.addFlags(1);
            }
        } catch (IOException e) {
            throw new Exception("Failed to create story background asset.", e);
        }
    }

    public final void g(String str, String str2, Bitmap bitmap, double d, double d2) throws Exception {
        Intent intentJ = j(str2, "snapchat://creativekit/camera/1", str);
        L(intentJ, bitmap, d, d2);
        i(intentJ, "SHARE_TO_SNAPCHAT_CAMERA");
    }

    public final void h(String str, String str2, Bitmap bitmap, Bitmap bitmap2, double d, double d2) throws Exception {
        Intent intentJ = j(str2, "snapchat://creativekit/preview/1", str);
        L(intentJ, bitmap2, d, d2);
        f(intentJ, bitmap);
        i(intentJ, "YTM_SHARE_TO_SNAPCHAT_PREVIEW");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    public final void i(Intent intent, String str) throws Exception {
        String string;
        try {
            PackageInfo packageInfo = ((Activity) this.c).getPackageManager().getPackageInfo("com.snapchat.android", 0);
            long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
            Object obj = this.c;
            if (longVersionCode >= 2110) {
                Context context = (Context) obj;
                intent.putExtra("RESULT_INTENT", qof.b(context, 0, new Intent(context, obj.getClass()), 1140850688));
                Activity activity = (Activity) obj;
                String packageName = activity.getPackageName();
                int iHashCode = packageName.hashCode();
                if (iHashCode != 66280549) {
                    if (iHashCode != 1252744364) {
                        if (iHashCode == 1713433253 && packageName.equals("com.google.android.apps.youtube.music")) {
                            string = activity.getResources().getString(R.string.youtube_music_app_name);
                        } else {
                            string = activity.getResources().getString(R.string.youtube_app_name);
                        }
                    } else if (packageName.equals("com.google.android.apps.youtube.creator")) {
                        string = activity.getResources().getString(R.string.youtube_studio_app_name);
                    } else {
                        string = activity.getResources().getString(R.string.youtube_app_name);
                    }
                } else if (packageName.equals("com.google.android.youtube.oem")) {
                    string = activity.getResources().getString(R.string.youtube_oem_app_name);
                } else {
                    string = activity.getResources().getString(R.string.youtube_app_name);
                }
                intent.putExtra("CLIENT_APP_NAME", string);
                intent.addFlags(268435456);
                activity.startActivity(intent);
            } else {
                ((Activity) obj).startActivityForResult(intent, 0);
            }
            Object obj2 = this.b;
            if (obj2 != null) {
                ((aerv) obj2).e(str);
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new Exception("Snapchat is not installed.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture k(zwa zwaVar) {
        return ahno.ar(((syn) this.b).n(zwaVar), new acpb(this, 16), this.c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture l(List list, boolean z) {
        ((aeiv) this.a).c("ds_ds");
        if (((Optional) this.b.io()).isEmpty()) {
            return aher.a;
        }
        Callable callableJ = afwl.j(new aegt(this, 2));
        ?? r1 = this.c;
        return ahno.as(ahng.r(callableJ, r1), new iak(this, list, z, 4), r1);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture m(String str, boolean z) {
        if (!dvy.a("MULTI_PROFILE")) {
            twu.d("ProfileStoreManager", 6, "Multi-profile is not supported.", null);
            return aher.a;
        }
        if (ahno.aa(str)) {
            return aher.a;
        }
        if (!((Optional) this.b.io()).isEmpty()) {
            return ahng.r(afwl.j(new hqq(this, str, z, 2)), this.c);
        }
        twu.d("ProfileStoreManager", 6, "ProfileStore not available for deletion.", null);
        return aher.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture n(String str) {
        return ahng.r(afwl.j(new aalq(this, str, 14)), this.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [awmd, java.lang.Object] */
    public final aeam p(xgn xgnVar, ViewGroup viewGroup) {
        Context context = (Context) this.c.io();
        context.getClass();
        xgnVar.getClass();
        Handler handler = (Handler) this.a.io();
        handler.getClass();
        aeiv aeivVar = (aeiv) this.b.io();
        aeivVar.getClass();
        viewGroup.getClass();
        return new aeam(context, xgnVar, handler, aeivVar, viewGroup);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    public final adzx q(View view) {
        vxe vxeVar = (vxe) this.c.io();
        vxeVar.getClass();
        ci ciVar = (ci) this.b.io();
        view.getClass();
        return new adzx(vxeVar, ciVar, view, (vxz) this.a.io());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final agke r(String str) {
        adrr adrrVar = (adrr) this.b.get(str);
        return adrrVar != null ? agke.n(adrrVar.a.keySet()) : agpi.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final agke s(String str) {
        adrr adrrVar = (adrr) this.b.get(str);
        if (adrrVar != null) {
            return adrrVar.d;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final aqhn t(String str) {
        adrr adrrVar = (adrr) this.b.get(str);
        if (adrrVar != null) {
            return adrrVar.c;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Object u(String str, String str2) {
        adrr adrrVar = (adrr) this.b.get(str);
        if (adrrVar != null) {
            return adrrVar.a.get(str2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final String v(String str) {
        return (String) this.c.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final String w(String str) {
        adrr adrrVar = (adrr) this.b.get(str);
        if (adrrVar != null) {
            return adrrVar.b;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void x(String str) {
        this.b.remove(str);
        this.a.remove(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void y(String str) {
        String str2;
        aqhl aqhlVar;
        adcw adcwVar = (adcw) this.a.get(str);
        adrr adrrVar = (adrr) this.b.get(str);
        if (adcwVar == null || adrrVar == null || (str2 = adrrVar.b) == null) {
            return;
        }
        aigj aigjVarA = (aigj) adrrVar.a.get(str2);
        if (aigjVarA == null) {
            if (adcwVar.g) {
                aqhlVar = (aqhl) adcwVar.h.get(str);
            } else {
                aqhlVar = adcwVar.b.c;
                if (aqhlVar == null) {
                    aqhlVar = aqhl.a;
                }
            }
            if (aqhlVar != null) {
                aigjVarA = adcw.a(aqhlVar, str2);
            }
        }
        if (aigjVarA != null && adcwVar.g) {
            adcwVar.h(adcwVar.e, str);
        }
        adcr.aE(adcwVar.a, adcwVar, str2, aigjVarA);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void z(String str, String str2, boolean z) {
        adrr adrrVar = (adrr) j$.util.Map.EL.computeIfAbsent(this.b, str, new accu(15));
        boolean z2 = true;
        if (!z && !str2.equals(adrrVar.b)) {
            z2 = false;
        }
        adrrVar.b = str2;
        if (z2) {
            return;
        }
        y(str);
    }

    public axlj(Status status, avdv avdvVar, avbe avbeVar) {
        this.b = status;
        this.c = avdvVar;
        this.a = avbeVar;
    }

    public axlj(Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public axlj(Object obj, Object obj2, Object obj3, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public axlj(Map map, Map map2, ahql ahqlVar) {
        this.b = map;
        this.a = map2;
        this.c = ahqlVar;
    }

    public axlj(Executor executor, aeiv aeivVar, aunn aunnVar) {
        this.c = executor;
        this.a = aeivVar;
        this.b = aunnVar;
    }

    public axlj(syn synVar, ahex ahexVar, Context context) {
        this.b = synVar;
        this.c = ahexVar;
        this.a = context;
    }

    public axlj(vxe vxeVar, Map map, xgm xgmVar) {
        this.c = vxeVar;
        this.a = map;
        this.b = xgmVar;
    }

    public axlj() {
        EnumMap enumMap = new EnumMap(aifl.class);
        this.a = "";
        this.b = enumMap;
        this.c = new EnumMap(aifl.class);
    }

    public axlj(aeyt aeytVar, View view) {
        this.a = Build.VERSION.SDK_INT >= 34 ? new aeyw() : Build.VERSION.SDK_INT >= 33 ? new aeyu() : null;
        this.b = aeytVar;
        this.c = view;
    }

    public axlj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.c = awmdVar3;
    }

    public axlj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr, byte[] bArr2) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        this.a = awmdVar3;
    }

    public axlj(String str, String str2, Object obj) {
        str.getClass();
        this.b = str;
        str2.getClass();
        this.c = str2;
        obj.getClass();
        this.a = obj;
    }

    public axlj(wbz wbzVar, zwb zwbVar, abmt abmtVar) {
        wbzVar.getClass();
        zwbVar.getClass();
        abmtVar.getClass();
        this.c = wbzVar;
        this.a = zwbVar;
        this.b = abmtVar;
    }

    public axlj(byte[] bArr) {
        this(new long[10], new long[10], new long[10]);
    }

    public axlj(char[] cArr) {
        this.b = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
    }

    public axlj(aciz acizVar) {
        this((byte[]) null);
        J(this, acizVar);
    }

    public axlj(awou awouVar, awou awouVar2, aavv aavvVar) {
        awouVar.getClass();
        awouVar2.getClass();
        aavvVar.getClass();
        this.a = awouVar;
        this.c = awouVar2;
        this.b = new acla(16);
    }

    public axlj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, char[] cArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        this.a = awmdVar2;
        awmdVar3.getClass();
        this.b = awmdVar3;
    }

    public axlj(axlj axljVar) {
        this.c = Arrays.copyOf((long[]) axljVar.c, 10);
        this.b = Arrays.copyOf((long[]) axljVar.b, 10);
        this.a = Arrays.copyOf((long[]) axljVar.a, 10);
    }

    public axlj(Context context, awut awutVar, awou awouVar, awou awouVar2, aunn aunnVar, aedi aediVar) {
        context.getClass();
        awutVar.getClass();
        awouVar.getClass();
        awouVar2.getClass();
        aunnVar.getClass();
        aediVar.getClass();
        this.b = context;
        this.c = awutVar;
        this.a = awouVar;
    }

    public axlj(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, byte[] bArr) {
        awmdVar.getClass();
        this.c = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        awmdVar3.getClass();
        this.a = awmdVar3;
    }
}
