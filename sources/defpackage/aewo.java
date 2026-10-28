package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Path;
import android.opengl.GLES20;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.widget.EditText;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aewo {
    public static volatile aewo f;
    public static aewo g;

    public aewo() {
    }

    public static void A(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyv ahyvVar = (ahyv) aihfVar.instance;
        ahyv ahyvVar2 = ahyv.a;
        ahyvVar.b |= 8;
        ahyvVar.f = j;
    }

    public static void B(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyv ahyvVar = (ahyv) aihfVar.instance;
        ahyv ahyvVar2 = ahyv.a;
        ahyvVar.b |= 2;
        ahyvVar.d = j;
    }

    public static void C(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyv ahyvVar = (ahyv) aihfVar.instance;
        ahyv ahyvVar2 = ahyv.a;
        ahyvVar.b |= 16;
        ahyvVar.g = j;
    }

    public static void D(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyv ahyvVar = (ahyv) aihfVar.instance;
        ahyv ahyvVar2 = ahyv.a;
        ahyvVar.b |= 32;
        ahyvVar.h = j;
    }

    public static void E(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyv ahyvVar = (ahyv) aihfVar.instance;
        ahyv ahyvVar2 = ahyv.a;
        ahyvVar.b |= SemanticState.Focused;
        ahyvVar.j = j;
    }

    public static void F(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyv ahyvVar = (ahyv) aihfVar.instance;
        ahyv ahyvVar2 = ahyv.a;
        ahyvVar.b |= 4;
        ahyvVar.e = j;
    }

    public static void G(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyv ahyvVar = (ahyv) aihfVar.instance;
        ahyv ahyvVar2 = ahyv.a;
        ahyvVar.b |= 1;
        ahyvVar.c = j;
    }

    public static void H(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyv ahyvVar = (ahyv) aihfVar.instance;
        ahyv ahyvVar2 = ahyv.a;
        ahyvVar.i = i - 1;
        ahyvVar.b |= 64;
    }

    public static /* synthetic */ ahys I(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahys) aihnVarBuild;
    }

    public static void J(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahys ahysVar = (ahys) aihfVar.instance;
        ahys ahysVar2 = ahys.a;
        ahysVar.b |= 4;
        ahysVar.d = j;
    }

    public static void K(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahys ahysVar = (ahys) aihfVar.instance;
        ahys ahysVar2 = ahys.a;
        ahysVar.b |= 8;
        ahysVar.e = str;
    }

    public static void L(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahys ahysVar = (ahys) aihfVar.instance;
        ahys ahysVar2 = ahys.a;
        ahysVar.b |= 16;
        ahysVar.f = j;
    }

    public static void M(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahys ahysVar = (ahys) aihfVar.instance;
        ahys ahysVar2 = ahys.a;
        ahysVar.b |= 1;
        ahysVar.c = str;
    }

    public static /* synthetic */ ahyp N(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahyp) aihnVarBuild;
    }

    public static void O(ahyr ahyrVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyp ahypVar = (ahyp) aihfVar.instance;
        ahyp ahypVar2 = ahyp.a;
        ahypVar.c = ahyrVar;
        ahypVar.b |= 1;
    }

    public static /* synthetic */ ahyo P(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahyo) aihnVarBuild;
    }

    public static void Q(ahys ahysVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyo ahyoVar = (ahyo) aihfVar.instance;
        ahyo ahyoVar2 = ahyo.a;
        ahyoVar.c = ahysVar;
        ahyoVar.b = 2;
    }

    public static void R(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyn ahynVar = (ahyn) aihfVar.instance;
        ahyn ahynVar2 = ahyn.a;
        ahynVar.c = i - 1;
        ahynVar.b |= 1;
    }

    public static /* synthetic */ ahyk S(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahyk) aihnVarBuild;
    }

    public static void T(ahyj ahyjVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyk ahykVar = (ahyk) aihfVar.instance;
        ahyk ahykVar2 = ahyk.a;
        ahykVar.c = ahyjVar;
        ahykVar.b |= 2;
    }

    public static void U(int i, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyk ahykVar = (ahyk) aihfVar.instance;
        ahyk ahykVar2 = ahyk.a;
        ahykVar.d = i - 1;
        ahykVar.b |= 4;
    }

    public static /* synthetic */ ahyj V(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahyj) aihnVarBuild;
    }

    public static void W(ahyh ahyhVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyj ahyjVar = (ahyj) aihfVar.instance;
        ahyj ahyjVar2 = ahyj.a;
        ahyjVar.e = ahyhVar;
        ahyjVar.b |= 1;
    }

    public static /* synthetic */ ahyg X(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahyg) aihnVarBuild;
    }

    public static void Y(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyg ahygVar = (ahyg) aihfVar.instance;
        ahyg ahygVar2 = ahyg.a;
        ahygVar.b |= 16;
        ahygVar.g = str;
    }

    public static void Z(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyg ahygVar = (ahyg) aihfVar.instance;
        ahyg ahygVar2 = ahyg.a;
        ahygVar.b |= 4;
        ahygVar.e = j;
    }

    private static String a(String str) {
        return str.startsWith("gcm.n.") ? str.replace("gcm.n.", "gcm.notification.") : str;
    }

    public static void aa(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyg ahygVar = (ahyg) aihfVar.instance;
        ahyg ahygVar2 = ahyg.a;
        ahygVar.b |= 8;
        ahygVar.f = str;
    }

    public static void ab(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyg ahygVar = (ahyg) aihfVar.instance;
        ahyg ahygVar2 = ahyg.a;
        ahygVar.b |= 1;
        ahygVar.c = str;
    }

    public static void ac(String str, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyg ahygVar = (ahyg) aihfVar.instance;
        ahyg ahygVar2 = ahyg.a;
        ahygVar.b |= SemanticState.LiveRegion;
        ahygVar.k = str;
    }

    public static void ad(aigj aigjVar, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyg ahygVar = (ahyg) aihfVar.instance;
        ahyg ahygVar2 = ahyg.a;
        ahygVar.b |= SemanticState.Focused;
        ahygVar.j = aigjVar;
    }

    public static void ae(long j, aihf aihfVar) {
        aihfVar.copyOnWrite();
        ahyg ahygVar = (ahyg) aihfVar.instance;
        ahyg ahygVar2 = ahyg.a;
        ahygVar.b |= 2;
        ahygVar.d = j;
    }

    public static void af(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new ahxq(str + ": GL error: 0x" + Integer.toHexString(iGlGetError));
    }

    public static void ag(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (a.U(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || a.U(b3) || a.U(b4)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    public static void ah(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    public static void ai(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!a.U(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!a.U(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!a.U(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!a.U(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!a.U(b3)) {
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }

    public static void aj(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }
        if (a.U(b2)) {
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static boolean ak(byte b) {
        return b >= 0;
    }

    public static boolean al(ahuj ahujVar, int i) {
        return ahujVar.b(i) != 0;
    }

    public static String am(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean an(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(a("gcm.n.e")));
    }

    public static Bundle ao(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public static Integer ap(String str, Bundle bundle) {
        String strAs = as(str, bundle);
        if (!TextUtils.isEmpty(strAs)) {
            try {
                return Integer.valueOf(Integer.parseInt(strAs));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + am(str) + '(' + strAs + ") into an int");
            }
        }
        return null;
    }

    public static String aq(Resources resources, String str, String str2, Bundle bundle) {
        String[] strArr;
        String strAs = as(str2.concat("_loc_key"), bundle);
        if (TextUtils.isEmpty(strAs)) {
            return null;
        }
        int identifier = resources.getIdentifier(strAs, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", am(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayAt = at(str2.concat("_loc_args"), bundle);
        if (jSONArrayAt == null) {
            strArr = null;
        } else {
            int length = jSONArrayAt.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayAt.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + am(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public static String ar(Resources resources, String str, String str2, Bundle bundle) {
        String strAs = as(str2, bundle);
        return TextUtils.isEmpty(strAs) ? aq(resources, str, str2, bundle) : strAs;
    }

    public static String as(String str, Bundle bundle) {
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strA = a(str);
            if (bundle.containsKey(strA)) {
                str = strA;
            }
        }
        return bundle.getString(str);
    }

    public static JSONArray at(String str, Bundle bundle) {
        String strAs = as(str, bundle);
        if (!TextUtils.isEmpty(strAs)) {
            try {
                return new JSONArray(strAs);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + am(str) + ": " + strAs + ", falling back to default");
            }
        }
        return null;
    }

    public static boolean au(String str, Bundle bundle) {
        String strAs = as(str, bundle);
        return "1".equals(strAs) || Boolean.parseBoolean(strAs);
    }

    public static /* synthetic */ axst av(aihf aihfVar) {
        aihfVar.getClass();
        return new axst(aihfVar);
    }

    public static void e(Outline outline, Path path) {
        outline.setConvexPath(path);
    }

    public static void f(Window window, boolean z) {
        new zf(window, window.getDecorView()).d(z);
    }

    public static boolean g(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static void h(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        list.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(list);
    }

    public static boolean i(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String strValueOf = String.valueOf(packageName);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 125) {
                if (!runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.processName.startsWith(strValueOf.concat(":"))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static File j(aess aessVar) {
        return afba.P(aessVar, aesv.ANR);
    }

    public static File k(aess aessVar, long j) {
        return afba.Q(aessVar, aesv.ANR, j);
    }

    public static List l(aess aessVar) {
        aesv aesvVar = aesv.ANR;
        List listR = afba.R(aessVar, aesvVar, true);
        File file = new File(((Context) aessVar.c).getCacheDir(), aesvVar.e);
        try {
            if (file.exists()) {
                listR.add(file);
            }
        } catch (SecurityException e) {
            afba.T(String.format("AnrJV3 !v1journal '%s'", file), e);
        }
        return listR;
    }

    public static void m(aess aessVar, ajeb ajebVar) {
        afba.U(aessVar, ajebVar, aesv.ANR);
    }

    public static aihf n(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                aihf aihfVarCreateBuilder = ajeb.a.createBuilder();
                aihfVarCreateBuilder.m57mergeFrom((InputStream) fileInputStream, ExtensionRegistryLite.getGeneratedRegistry());
                fileInputStream.close();
                return aihfVarCreateBuilder;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            afba.T(String.format("AnrJV3 !readToBuilder '%s'", file), e);
            return null;
        }
    }

    public static /* synthetic */ String o(int i) {
        if (i == 1) {
            return "NO_ANR";
        }
        if (i != 2) {
            return i != 3 ? "null" : "STFC_ANR";
        }
        return "EARLY_ANR";
    }

    public static ListenableFuture p(Runnable runnable, LinkedList linkedList, mbc mbcVar, ahey aheyVar) {
        if (linkedList.isEmpty()) {
            return aher.a;
        }
        long jLongValue = ((Long) linkedList.peek()).longValue();
        if (linkedList.size() > 1) {
            linkedList.removeFirst();
        }
        long jB = mbcVar.b() + jLongValue;
        SettableFuture settableFutureCreate = SettableFuture.create();
        AtomicReference atomicReference = new AtomicReference(null);
        a.ap(atomicReference, aheyVar.schedule(new aeqy(settableFutureCreate, runnable, atomicReference, aheyVar, jB, linkedList, mbcVar), jLongValue, TimeUnit.MILLISECONDS));
        settableFutureCreate.addListener(new aemk(atomicReference, 3, null), MoreExecutors.directExecutor());
        return settableFutureCreate;
    }

    public static aeqv q() {
        return aeqv.a;
    }

    public static aenr r(aenu aenuVar, aeno aenoVar) {
        aenoVar.getClass();
        return aenuVar.e(aenoVar, null);
    }

    public static aoar t(ajwo ajwoVar) {
        aihl aihlVar = aoaq.b;
        aihlVar.getClass();
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihf aihfVarCreateBuilder = aoar.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            return agvp.I(aihfVarCreateBuilder);
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        Object objC = objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK);
        objC.getClass();
        return (aoar) objC;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x0101  */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x0127  */
    /* JADX WARN: Code duplicated, block: B:58:0x0129  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0152  */
    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:67:0x0178 A[PHI: r9
      0x0178: PHI (r9v6 int) = (r9v5 int), (r9v5 int), (r9v5 int), (r9v0 int) binds: [B:62:0x0150, B:64:0x0163, B:66:0x0176, B:56:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x017a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0184  */
    /* JADX WARN: Code duplicated, block: B:75:0x0186  */
    public static aeno u(int i, aigj aigjVar, aoar aoarVar, ajwo ajwoVar, int i2) {
        ajwo ajwoVar2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        String str2;
        int i7;
        String str3;
        int i8;
        int i9;
        String str4;
        Integer num;
        Integer numValueOf;
        Integer numValueOf2;
        int i10;
        aihl aihlVarCheckIsLite;
        aihl aihlVarCheckIsLite2;
        aihl aihlVarCheckIsLite3;
        aihl aihlVarCheckIsLite4;
        aihl aihlVarCheckIsLite5;
        aihl aihlVarCheckIsLite6;
        aihl aihlVarCheckIsLite7;
        aihl aihlVarCheckIsLite8;
        Object objK;
        Object objC;
        ajwo ajwoVar3 = ajwoVar;
        aoarVar.getClass();
        int iK = atqp.K(i);
        if (iK == 0) {
            iK = 188;
        }
        if (ajwoVar3 != null) {
            aihl aihlVarCheckIsLite9 = aihn.checkIsLite(apfp.b);
            ajwoVar3.c(aihlVarCheckIsLite9);
            i3 = 41;
            if (!ajwoVar3.j.n(aihlVarCheckIsLite9.d)) {
                aihl aihlVarCheckIsLite10 = aihn.checkIsLite(apef.b);
                ajwoVar3.c(aihlVarCheckIsLite10);
                if (!ajwoVar3.j.n(aihlVarCheckIsLite10.d)) {
                    ajwoVar2 = ajwoVar3;
                }
                str = aoarVar.k;
                i5 = aoarVar.b;
                if ((i5 & SemanticState.ReadOnly) == 0) {
                    str = null;
                }
                i6 = i5 & 64;
                str2 = aoarVar.g;
                if (i6 == 0) {
                    str2 = null;
                }
                i7 = i5 & 1;
                str3 = aoarVar.c;
                i8 = 1;
                if (1 != i7) {
                    str3 = null;
                }
                i9 = i5 & 32;
                str4 = aoarVar.f;
                if (i9 == 0) {
                    num = null;
                    str4 = null;
                } else {
                    num = null;
                }
                String str5 = str;
                String str6 = str2;
                int i11 = aoarVar.h;
                numValueOf = Integer.valueOf(aoarVar.d);
                numValueOf.intValue();
                if ((aoarVar.b & 2) == 0) {
                    numValueOf = num;
                }
                numValueOf2 = Integer.valueOf(aoarVar.e);
                numValueOf2.intValue();
                if ((aoarVar.b & 4) == 0) {
                    numValueOf2 = num;
                }
                if (ajwoVar3 != null) {
                    aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                    ajwoVar3.c(aihlVarCheckIsLite);
                    if (ajwoVar3.j.n(aihlVarCheckIsLite.d)) {
                        i10 = 3;
                    } else {
                        aihlVarCheckIsLite2 = aihn.checkIsLite(apef.b);
                        ajwoVar3.c(aihlVarCheckIsLite2);
                        if (ajwoVar3.j.n(aihlVarCheckIsLite2.d)) {
                            i10 = 3;
                        } else {
                            aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
                            ajwoVar3.c(aihlVarCheckIsLite3);
                            if (ajwoVar3.j.n(aihlVarCheckIsLite3.d)) {
                                aihlVarCheckIsLite8 = aihn.checkIsLite(ajmj.a);
                                ajwoVar3.c(aihlVarCheckIsLite8);
                                objK = ajwoVar3.j.k(aihlVarCheckIsLite8.d);
                                if (objK == null) {
                                    objC = aihlVarCheckIsLite8.b;
                                } else {
                                    objC = aihlVarCheckIsLite8.c(objK);
                                }
                                if (awrc.c(((ajmf) objC).c, "FEwhat_to_watch")) {
                                    i10 = i8;
                                } else {
                                    i10 = 2;
                                }
                            } else {
                                aihlVarCheckIsLite4 = aihn.checkIsLite(apni.a);
                                ajwoVar3.c(aihlVarCheckIsLite4);
                                if (ajwoVar3.j.n(aihlVarCheckIsLite4.d)) {
                                    i10 = 4;
                                } else {
                                    aihlVarCheckIsLite5 = aihn.checkIsLite(arik.a);
                                    ajwoVar3.c(aihlVarCheckIsLite5);
                                    i8 = 5;
                                    if (!ajwoVar3.j.n(aihlVarCheckIsLite5.d)) {
                                        aihlVarCheckIsLite6 = aihn.checkIsLite(aohu.a);
                                        ajwoVar3.c(aihlVarCheckIsLite6);
                                        if (!ajwoVar3.j.n(aihlVarCheckIsLite6.d)) {
                                            aihlVarCheckIsLite7 = aihn.checkIsLite(apzf.b);
                                            ajwoVar3.c(aihlVarCheckIsLite7);
                                            if (!ajwoVar3.j.n(aihlVarCheckIsLite7.d)) {
                                                i10 = 7;
                                            }
                                        }
                                    }
                                    i10 = i8;
                                }
                            }
                        }
                    }
                } else {
                    i10 = 7;
                }
                if (i10 == 7) {
                    i10 = 0;
                }
                if (i10 == 0) {
                    if (i2 == 0) {
                        i10 = 7;
                    } else {
                        i10 = i2;
                    }
                }
                return new aeno(i4, aigjVar, str5, str6, str3, str4, i11, numValueOf, numValueOf2, aoarVar, i10, yno.dl(ajwoVar3, amdx.b), yno.dl(ajwoVar3, amdx.a));
            }
            i4 = i3;
            str = aoarVar.k;
            i5 = aoarVar.b;
            if ((i5 & SemanticState.ReadOnly) == 0) {
                str = null;
            }
            i6 = i5 & 64;
            str2 = aoarVar.g;
            if (i6 == 0) {
                str2 = null;
            }
            i7 = i5 & 1;
            str3 = aoarVar.c;
            i8 = 1;
            if (1 != i7) {
                str3 = null;
            }
            i9 = i5 & 32;
            str4 = aoarVar.f;
            if (i9 == 0) {
                num = null;
                str4 = null;
            } else {
                num = null;
            }
            String str7 = str;
            String str8 = str2;
            int i12 = aoarVar.h;
            numValueOf = Integer.valueOf(aoarVar.d);
            numValueOf.intValue();
            if ((aoarVar.b & 2) == 0) {
                numValueOf = num;
            }
            numValueOf2 = Integer.valueOf(aoarVar.e);
            numValueOf2.intValue();
            if ((aoarVar.b & 4) == 0) {
                numValueOf2 = num;
            }
            if (ajwoVar3 != null) {
                aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                ajwoVar3.c(aihlVarCheckIsLite);
                if (ajwoVar3.j.n(aihlVarCheckIsLite.d)) {
                    aihlVarCheckIsLite2 = aihn.checkIsLite(apef.b);
                    ajwoVar3.c(aihlVarCheckIsLite2);
                    if (ajwoVar3.j.n(aihlVarCheckIsLite2.d)) {
                        aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
                        ajwoVar3.c(aihlVarCheckIsLite3);
                        if (ajwoVar3.j.n(aihlVarCheckIsLite3.d)) {
                            aihlVarCheckIsLite8 = aihn.checkIsLite(ajmj.a);
                            ajwoVar3.c(aihlVarCheckIsLite8);
                            objK = ajwoVar3.j.k(aihlVarCheckIsLite8.d);
                            if (objK == null) {
                                objC = aihlVarCheckIsLite8.b;
                            } else {
                                objC = aihlVarCheckIsLite8.c(objK);
                            }
                            if (awrc.c(((ajmf) objC).c, "FEwhat_to_watch")) {
                                i10 = 2;
                            } else {
                                i10 = i8;
                            }
                        } else {
                            aihlVarCheckIsLite4 = aihn.checkIsLite(apni.a);
                            ajwoVar3.c(aihlVarCheckIsLite4);
                            if (ajwoVar3.j.n(aihlVarCheckIsLite4.d)) {
                                i10 = 4;
                            } else {
                                aihlVarCheckIsLite5 = aihn.checkIsLite(arik.a);
                                ajwoVar3.c(aihlVarCheckIsLite5);
                                i8 = 5;
                                if (!ajwoVar3.j.n(aihlVarCheckIsLite5.d)) {
                                    aihlVarCheckIsLite6 = aihn.checkIsLite(aohu.a);
                                    ajwoVar3.c(aihlVarCheckIsLite6);
                                    if (!ajwoVar3.j.n(aihlVarCheckIsLite6.d)) {
                                        aihlVarCheckIsLite7 = aihn.checkIsLite(apzf.b);
                                        ajwoVar3.c(aihlVarCheckIsLite7);
                                        if (!ajwoVar3.j.n(aihlVarCheckIsLite7.d)) {
                                            i10 = 7;
                                        }
                                    }
                                }
                                i10 = i8;
                            }
                        }
                    } else {
                        i10 = 3;
                    }
                } else {
                    i10 = 3;
                }
            } else {
                i10 = 7;
            }
            if (i10 == 7) {
                i10 = 0;
            }
            if (i10 == 0) {
                if (i2 == 0) {
                    i10 = 7;
                } else {
                    i10 = i2;
                }
            }
            return new aeno(i4, aigjVar, str7, str8, str3, str4, i12, numValueOf, numValueOf2, aoarVar, i10, yno.dl(ajwoVar3, amdx.b), yno.dl(ajwoVar3, amdx.a));
        }
        ajwoVar2 = null;
        if (ajwoVar2 != null) {
            aihl aihlVarCheckIsLite11 = aihn.checkIsLite(arik.a);
            ajwoVar2.c(aihlVarCheckIsLite11);
            if (!ajwoVar2.j.n(aihlVarCheckIsLite11.d)) {
                aihl aihlVarCheckIsLite12 = aihn.checkIsLite(aohu.a);
                ajwoVar2.c(aihlVarCheckIsLite12);
                if (!ajwoVar2.j.n(aihlVarCheckIsLite12.d)) {
                    aihl aihlVarCheckIsLite13 = aihn.checkIsLite(apzf.b);
                    ajwoVar2.c(aihlVarCheckIsLite13);
                    if (ajwoVar2.j.n(aihlVarCheckIsLite13.d)) {
                    }
                    str = aoarVar.k;
                    i5 = aoarVar.b;
                    if ((i5 & SemanticState.ReadOnly) == 0) {
                        str = null;
                    }
                    i6 = i5 & 64;
                    str2 = aoarVar.g;
                    if (i6 == 0) {
                        str2 = null;
                    }
                    i7 = i5 & 1;
                    str3 = aoarVar.c;
                    i8 = 1;
                    if (1 != i7) {
                        str3 = null;
                    }
                    i9 = i5 & 32;
                    str4 = aoarVar.f;
                    if (i9 == 0) {
                        num = null;
                        str4 = null;
                    } else {
                        num = null;
                    }
                    String str9 = str;
                    String str10 = str2;
                    int i13 = aoarVar.h;
                    numValueOf = Integer.valueOf(aoarVar.d);
                    numValueOf.intValue();
                    if ((aoarVar.b & 2) == 0) {
                        numValueOf = num;
                    }
                    numValueOf2 = Integer.valueOf(aoarVar.e);
                    numValueOf2.intValue();
                    if ((aoarVar.b & 4) == 0) {
                        numValueOf2 = num;
                    }
                    if (ajwoVar3 != null) {
                        aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                        ajwoVar3.c(aihlVarCheckIsLite);
                        if (ajwoVar3.j.n(aihlVarCheckIsLite.d)) {
                            aihlVarCheckIsLite2 = aihn.checkIsLite(apef.b);
                            ajwoVar3.c(aihlVarCheckIsLite2);
                            if (ajwoVar3.j.n(aihlVarCheckIsLite2.d)) {
                                aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
                                ajwoVar3.c(aihlVarCheckIsLite3);
                                if (ajwoVar3.j.n(aihlVarCheckIsLite3.d)) {
                                    aihlVarCheckIsLite8 = aihn.checkIsLite(ajmj.a);
                                    ajwoVar3.c(aihlVarCheckIsLite8);
                                    objK = ajwoVar3.j.k(aihlVarCheckIsLite8.d);
                                    if (objK == null) {
                                        objC = aihlVarCheckIsLite8.b;
                                    } else {
                                        objC = aihlVarCheckIsLite8.c(objK);
                                    }
                                    if (awrc.c(((ajmf) objC).c, "FEwhat_to_watch")) {
                                        i10 = 2;
                                    } else {
                                        i10 = i8;
                                    }
                                } else {
                                    aihlVarCheckIsLite4 = aihn.checkIsLite(apni.a);
                                    ajwoVar3.c(aihlVarCheckIsLite4);
                                    if (ajwoVar3.j.n(aihlVarCheckIsLite4.d)) {
                                        i10 = 4;
                                    } else {
                                        aihlVarCheckIsLite5 = aihn.checkIsLite(arik.a);
                                        ajwoVar3.c(aihlVarCheckIsLite5);
                                        i8 = 5;
                                        if (!ajwoVar3.j.n(aihlVarCheckIsLite5.d)) {
                                            aihlVarCheckIsLite6 = aihn.checkIsLite(aohu.a);
                                            ajwoVar3.c(aihlVarCheckIsLite6);
                                            if (!ajwoVar3.j.n(aihlVarCheckIsLite6.d)) {
                                                aihlVarCheckIsLite7 = aihn.checkIsLite(apzf.b);
                                                ajwoVar3.c(aihlVarCheckIsLite7);
                                                if (!ajwoVar3.j.n(aihlVarCheckIsLite7.d)) {
                                                    i10 = 7;
                                                }
                                            }
                                        }
                                        i10 = i8;
                                    }
                                }
                            } else {
                                i10 = 3;
                            }
                        } else {
                            i10 = 3;
                        }
                    } else {
                        i10 = 7;
                    }
                    if (i10 == 7) {
                        i10 = 0;
                    }
                    if (i10 == 0) {
                        if (i2 == 0) {
                            i10 = 7;
                        } else {
                            i10 = i2;
                        }
                    }
                    return new aeno(i4, aigjVar, str9, str10, str3, str4, i13, numValueOf, numValueOf2, aoarVar, i10, yno.dl(ajwoVar3, amdx.b), yno.dl(ajwoVar3, amdx.a));
                }
            }
            i4 = 3;
            str = aoarVar.k;
            i5 = aoarVar.b;
            if ((i5 & SemanticState.ReadOnly) == 0) {
                str = null;
            }
            i6 = i5 & 64;
            str2 = aoarVar.g;
            if (i6 == 0) {
                str2 = null;
            }
            i7 = i5 & 1;
            str3 = aoarVar.c;
            i8 = 1;
            if (1 != i7) {
                str3 = null;
            }
            i9 = i5 & 32;
            str4 = aoarVar.f;
            if (i9 == 0) {
                num = null;
                str4 = null;
            } else {
                num = null;
            }
            String str11 = str;
            String str12 = str2;
            int i14 = aoarVar.h;
            numValueOf = Integer.valueOf(aoarVar.d);
            numValueOf.intValue();
            if ((aoarVar.b & 2) == 0) {
                numValueOf = num;
            }
            numValueOf2 = Integer.valueOf(aoarVar.e);
            numValueOf2.intValue();
            if ((aoarVar.b & 4) == 0) {
                numValueOf2 = num;
            }
            if (ajwoVar3 != null) {
                aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                ajwoVar3.c(aihlVarCheckIsLite);
                if (ajwoVar3.j.n(aihlVarCheckIsLite.d)) {
                    aihlVarCheckIsLite2 = aihn.checkIsLite(apef.b);
                    ajwoVar3.c(aihlVarCheckIsLite2);
                    if (ajwoVar3.j.n(aihlVarCheckIsLite2.d)) {
                        aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
                        ajwoVar3.c(aihlVarCheckIsLite3);
                        if (ajwoVar3.j.n(aihlVarCheckIsLite3.d)) {
                            aihlVarCheckIsLite8 = aihn.checkIsLite(ajmj.a);
                            ajwoVar3.c(aihlVarCheckIsLite8);
                            objK = ajwoVar3.j.k(aihlVarCheckIsLite8.d);
                            if (objK == null) {
                                objC = aihlVarCheckIsLite8.b;
                            } else {
                                objC = aihlVarCheckIsLite8.c(objK);
                            }
                            if (awrc.c(((ajmf) objC).c, "FEwhat_to_watch")) {
                                i10 = 2;
                            } else {
                                i10 = i8;
                            }
                        } else {
                            aihlVarCheckIsLite4 = aihn.checkIsLite(apni.a);
                            ajwoVar3.c(aihlVarCheckIsLite4);
                            if (ajwoVar3.j.n(aihlVarCheckIsLite4.d)) {
                                i10 = 4;
                            } else {
                                aihlVarCheckIsLite5 = aihn.checkIsLite(arik.a);
                                ajwoVar3.c(aihlVarCheckIsLite5);
                                i8 = 5;
                                if (!ajwoVar3.j.n(aihlVarCheckIsLite5.d)) {
                                    aihlVarCheckIsLite6 = aihn.checkIsLite(aohu.a);
                                    ajwoVar3.c(aihlVarCheckIsLite6);
                                    if (!ajwoVar3.j.n(aihlVarCheckIsLite6.d)) {
                                        aihlVarCheckIsLite7 = aihn.checkIsLite(apzf.b);
                                        ajwoVar3.c(aihlVarCheckIsLite7);
                                        if (!ajwoVar3.j.n(aihlVarCheckIsLite7.d)) {
                                            i10 = 7;
                                        }
                                    }
                                }
                                i10 = i8;
                            }
                        }
                    } else {
                        i10 = 3;
                    }
                } else {
                    i10 = 3;
                }
            } else {
                i10 = 7;
            }
            if (i10 == 7) {
                i10 = 0;
            }
            if (i10 == 0) {
                if (i2 == 0) {
                    i10 = 7;
                } else {
                    i10 = i2;
                }
            }
            return new aeno(i4, aigjVar, str11, str12, str3, str4, i14, numValueOf, numValueOf2, aoarVar, i10, yno.dl(ajwoVar3, amdx.b), yno.dl(ajwoVar3, amdx.a));
        }
        i3 = iK - 1;
        ajwoVar3 = ajwoVar2;
        i4 = i3;
        str = aoarVar.k;
        i5 = aoarVar.b;
        if ((i5 & SemanticState.ReadOnly) == 0) {
            str = null;
        }
        i6 = i5 & 64;
        str2 = aoarVar.g;
        if (i6 == 0) {
            str2 = null;
        }
        i7 = i5 & 1;
        str3 = aoarVar.c;
        i8 = 1;
        if (1 != i7) {
            str3 = null;
        }
        i9 = i5 & 32;
        str4 = aoarVar.f;
        if (i9 == 0) {
            num = null;
            str4 = null;
        } else {
            num = null;
        }
        String str13 = str;
        String str14 = str2;
        int i15 = aoarVar.h;
        numValueOf = Integer.valueOf(aoarVar.d);
        numValueOf.intValue();
        if ((aoarVar.b & 2) == 0) {
            numValueOf = num;
        }
        numValueOf2 = Integer.valueOf(aoarVar.e);
        numValueOf2.intValue();
        if ((aoarVar.b & 4) == 0) {
            numValueOf2 = num;
        }
        if (ajwoVar3 != null) {
            aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
            ajwoVar3.c(aihlVarCheckIsLite);
            if (ajwoVar3.j.n(aihlVarCheckIsLite.d)) {
                aihlVarCheckIsLite2 = aihn.checkIsLite(apef.b);
                ajwoVar3.c(aihlVarCheckIsLite2);
                if (ajwoVar3.j.n(aihlVarCheckIsLite2.d)) {
                    aihlVarCheckIsLite3 = aihn.checkIsLite(ajmj.a);
                    ajwoVar3.c(aihlVarCheckIsLite3);
                    if (ajwoVar3.j.n(aihlVarCheckIsLite3.d)) {
                        aihlVarCheckIsLite8 = aihn.checkIsLite(ajmj.a);
                        ajwoVar3.c(aihlVarCheckIsLite8);
                        objK = ajwoVar3.j.k(aihlVarCheckIsLite8.d);
                        if (objK == null) {
                            objC = aihlVarCheckIsLite8.b;
                        } else {
                            objC = aihlVarCheckIsLite8.c(objK);
                        }
                        if (awrc.c(((ajmf) objC).c, "FEwhat_to_watch")) {
                            i10 = 2;
                        } else {
                            i10 = i8;
                        }
                    } else {
                        aihlVarCheckIsLite4 = aihn.checkIsLite(apni.a);
                        ajwoVar3.c(aihlVarCheckIsLite4);
                        if (ajwoVar3.j.n(aihlVarCheckIsLite4.d)) {
                            i10 = 4;
                        } else {
                            aihlVarCheckIsLite5 = aihn.checkIsLite(arik.a);
                            ajwoVar3.c(aihlVarCheckIsLite5);
                            i8 = 5;
                            if (!ajwoVar3.j.n(aihlVarCheckIsLite5.d)) {
                                aihlVarCheckIsLite6 = aihn.checkIsLite(aohu.a);
                                ajwoVar3.c(aihlVarCheckIsLite6);
                                if (!ajwoVar3.j.n(aihlVarCheckIsLite6.d)) {
                                    aihlVarCheckIsLite7 = aihn.checkIsLite(apzf.b);
                                    ajwoVar3.c(aihlVarCheckIsLite7);
                                    if (!ajwoVar3.j.n(aihlVarCheckIsLite7.d)) {
                                        i10 = 7;
                                    }
                                }
                            }
                            i10 = i8;
                        }
                    }
                } else {
                    i10 = 3;
                }
            } else {
                i10 = 3;
            }
        } else {
            i10 = 7;
        }
        if (i10 == 7) {
            i10 = 0;
        }
        if (i10 == 0) {
            if (i2 == 0) {
                i10 = 7;
            } else {
                i10 = i2;
            }
        }
        return new aeno(i4, aigjVar, str13, str14, str3, str4, i15, numValueOf, numValueOf2, aoarVar, i10, yno.dl(ajwoVar3, amdx.b), yno.dl(ajwoVar3, amdx.a));
    }

    public static /* synthetic */ aeno v(int i, aigj aigjVar, aoar aoarVar, ajwo ajwoVar, int i2, int i3) {
        if ((i3 & 4) != 0) {
            aihf aihfVarCreateBuilder = aoar.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            aoarVar = agvp.I(aihfVarCreateBuilder);
        }
        if ((i3 & 2) != 0) {
            aigjVar = null;
        }
        if ((i3 & 8) != 0) {
            ajwoVar = null;
        }
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        return u(i, aigjVar, aoarVar, ajwoVar, i2);
    }

    public static aeno w(ajwo ajwoVar, aoar aoarVar) {
        try {
            return v(187, (ajwoVar.b & 1) != 0 ? ajwoVar.c : null, aoarVar, ajwoVar, 0, 16);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static aptq x(aptq aptqVar, ResolveInfo resolveInfo) {
        ajwo ajwoVar = aptqVar.g;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(appo.b);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return aptqVar;
        }
        aihf builder = aptqVar.toBuilder();
        ajwo ajwoVar2 = ((aptq) builder.instance).g;
        if (ajwoVar2 == null) {
            ajwoVar2 = ajwo.a;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(appo.b);
        ajwoVar2.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
        aihf builder2 = ((appo) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).toBuilder();
        String str = resolveInfo.activityInfo.applicationInfo.packageName;
        String str2 = resolveInfo.activityInfo.name;
        almw almwVar = ((appo) builder2.instance).e;
        if (almwVar == null) {
            almwVar = almw.a;
        }
        aihf builder3 = almwVar.toBuilder();
        if (builder3 != null) {
            almw almwVar2 = (almw) builder3.instance;
            if ((almwVar2.b & 1) != 0) {
                aptj aptjVar = almwVar2.c;
                if (aptjVar == null) {
                    aptjVar = aptj.a;
                }
                aihf builder4 = aptjVar.toBuilder();
                builder4.copyOnWrite();
                aptj aptjVar2 = (aptj) builder4.instance;
                str.getClass();
                aptjVar2.b |= 2;
                aptjVar2.d = str;
                builder4.copyOnWrite();
                aptj aptjVar3 = (aptj) builder4.instance;
                str2.getClass();
                aptjVar3.b |= 4;
                aptjVar3.e = str2;
                builder3.copyOnWrite();
                almw almwVar3 = (almw) builder3.instance;
                aptj aptjVar4 = (aptj) builder4.build();
                aptjVar4.getClass();
                almwVar3.c = aptjVar4;
                almwVar3.b |= 1;
            }
        }
        builder2.copyOnWrite();
        appo appoVar = (appo) builder2.instance;
        almw almwVar4 = (almw) builder3.build();
        almwVar4.getClass();
        appoVar.e = almwVar4;
        appoVar.c |= 2;
        appo appoVar2 = (appo) builder2.instance;
        if ((appoVar2.c & 4) != 0) {
            almv almvVar = appoVar2.f;
            if (almvVar == null) {
                almvVar = almv.a;
            }
            if ((almvVar.b & 2) != 0) {
                ajwo ajwoVar3 = almvVar.d;
                if (ajwoVar3 == null) {
                    ajwoVar3 = ajwo.a;
                }
                aihl aihlVarCheckIsLite3 = aihn.checkIsLite(ajbh.a);
                ajwoVar3.c(aihlVarCheckIsLite3);
                if (ajwoVar3.j.n(aihlVarCheckIsLite3.d)) {
                    ajwo ajwoVar4 = almvVar.d;
                    if (ajwoVar4 == null) {
                        ajwoVar4 = ajwo.a;
                    }
                    aihh aihhVar = (aihh) ajwoVar4.toBuilder();
                    aihf builder5 = ((ajbg) aihhVar.b(ajbh.a)).toBuilder();
                    builder5.copyOnWrite();
                    ajbg ajbgVar = (ajbg) builder5.instance;
                    str.getClass();
                    ajbgVar.b |= 1;
                    ajbgVar.c = str;
                    builder5.copyOnWrite();
                    ajbg ajbgVar2 = (ajbg) builder5.instance;
                    str2.getClass();
                    ajbgVar2.b |= 2;
                    ajbgVar2.d = str2;
                    ajbg ajbgVar3 = (ajbg) builder5.build();
                    aihf builder6 = almvVar.toBuilder();
                    aihhVar.e(ajbh.a, ajbgVar3);
                    builder6.copyOnWrite();
                    almv almvVar2 = (almv) builder6.instance;
                    ajwo ajwoVar5 = (ajwo) aihhVar.build();
                    ajwoVar5.getClass();
                    almvVar2.d = ajwoVar5;
                    almvVar2.b |= 2;
                    almv almvVar3 = (almv) builder6.build();
                    builder2.copyOnWrite();
                    appo appoVar3 = (appo) builder2.instance;
                    almvVar3.getClass();
                    appoVar3.f = almvVar3;
                    appoVar3.c |= 4;
                }
            }
        }
        ajwo ajwoVar6 = ((aptq) builder.instance).g;
        if (ajwoVar6 == null) {
            ajwoVar6 = ajwo.a;
        }
        aihh aihhVar2 = (aihh) ajwoVar6.toBuilder();
        aihhVar2.e(appo.b, (appo) builder2.build());
        builder.copyOnWrite();
        aptq aptqVar2 = (aptq) builder.instance;
        ajwo ajwoVar7 = (ajwo) aihhVar2.build();
        ajwoVar7.getClass();
        aptqVar2.g = ajwoVar7;
        aptqVar2.b |= 16;
        return (aptq) builder.build();
    }

    public static /* synthetic */ ahzl y(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahzl) aihnVarBuild;
    }

    public static /* synthetic */ ahyv z(aihf aihfVar) {
        aihn aihnVarBuild = aihfVar.build();
        aihnVarBuild.getClass();
        return (ahyv) aihnVarBuild;
    }

    public final aeno s(ajwo ajwoVar) {
        ajwoVar.getClass();
        return w(ajwoVar, t(ajwoVar));
    }

    public aewo(byte[] bArr) {
    }

    public void d(Object obj) {
    }

    public void b(Object obj, int i) {
    }
}
