package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nsj {
    public static oiz a(oin oinVar, int i) {
        aihf aihfVarCreateBuilder = oiz.a.createBuilder();
        String str = oinVar.d;
        aihfVarCreateBuilder.copyOnWrite();
        oiz oizVar = (oiz) aihfVarCreateBuilder.instance;
        str.getClass();
        oizVar.b |= 1;
        oizVar.c = str;
        long j = oinVar.e;
        aihfVarCreateBuilder.copyOnWrite();
        oiz oizVar2 = (oiz) aihfVarCreateBuilder.instance;
        oizVar2.b |= 2;
        oizVar2.d = j;
        String strE = nsp.e(oinVar);
        aihfVarCreateBuilder.copyOnWrite();
        oiz oizVar3 = (oiz) aihfVarCreateBuilder.instance;
        strE.getClass();
        oizVar3.b |= 4;
        oizVar3.e = strE;
        aihfVarCreateBuilder.copyOnWrite();
        oiz oizVar4 = (oiz) aihfVarCreateBuilder.instance;
        oizVar4.f = i - 1;
        oizVar4.b |= 8;
        if ((oinVar.b & 32) != 0) {
            atyn atynVar = oinVar.h;
            if (atynVar == null) {
                atynVar = atyn.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            oiz oizVar5 = (oiz) aihfVarCreateBuilder.instance;
            atynVar.getClass();
            oizVar5.g = atynVar;
            oizVar5.b |= 16;
        }
        return (oiz) aihfVarCreateBuilder.build();
    }

    public static CharSequence b(Resources resources, CharSequence charSequence) {
        String strP;
        int i;
        Object objP;
        resources.getClass();
        charSequence.getClass();
        List listH = agfm.b(':').h(charSequence.toString());
        if (listH.size() >= 3) {
            strP = p(resources, (String) listH.get(0), R.plurals.accessibility_duration_description_hours);
            i = 1;
        } else {
            strP = null;
            i = 0;
        }
        if (i < listH.size()) {
            objP = p(resources, (String) listH.get(i), R.plurals.accessibility_duration_description_minutes);
            i++;
        } else {
            objP = null;
        }
        Object objP2 = i < listH.size() ? p(resources, (String) listH.get(i), R.plurals.accessibility_duration_description_seconds) : null;
        return !TextUtils.isEmpty(strP) ? resources.getString(R.string.accessibility_duration_hour, strP, objP, objP2) : resources.getString(R.string.accessibility_duration_minutes, objP, objP2);
    }

    public static String c(long j) {
        if (j < 0) {
            return "";
        }
        long j2 = j / 3600;
        long j3 = j - (3600 * j2);
        StringBuilder sb = new StringBuilder();
        long j4 = j3 / 60;
        if (j2 > 0) {
            sb.append(j2);
            sb.append(':');
            if (j4 < 10) {
                sb.append('0');
            }
        }
        Long.signum(j4);
        long j5 = j3 - (60 * j4);
        sb.append(j4);
        sb.append(':');
        if (j5 < 10) {
            sb.append('0');
        }
        sb.append(j5);
        return sb.toString();
    }

    public static long d(long j, ajvu ajvuVar) {
        long j2;
        if ((ajvuVar.b & 262144) != 0) {
            anim animVar = ajvuVar.n;
            if (animVar == null) {
                animVar = anim.a;
            }
            j2 = animVar.c;
        } else {
            j2 = 52428800;
        }
        return Math.max(0L, j - j2);
    }

    public static long e(ajvu ajvuVar, File file) {
        return d(tym.D(file), ajvuVar);
    }

    public static final avlh f() {
        return avlh.G(Boolean.FALSE);
    }

    public static final boolean g(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            return false;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static List h(List list) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(null);
        arrayList.addAll(list);
        return arrayList;
    }

    public static twy i(int i, Deque deque) {
        if (deque.size() == 1) {
            return (twy) deque.getFirst();
        }
        agjz agjzVarF = agke.f(deque.size());
        Iterator it = deque.iterator();
        while (it.hasNext()) {
            agjzVarF.h(((twx) it.next()).b);
        }
        return new twz(i, agjzVarF.g());
    }

    public static cc j(cc ccVar, Class cls) {
        if (cls.isInstance(ccVar) || l(ccVar, cls)) {
            return ccVar;
        }
        Iterator it = ccVar.getChildFragmentManager().k().iterator();
        while (it.hasNext()) {
            cc ccVarJ = j((cc) it.next(), cls);
            if (ccVarJ != null) {
                return ccVarJ;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Optional k(cc ccVar, Class cls) {
        if (cls.isAssignableFrom(ccVar.getClass())) {
            return Optional.of(ccVar);
        }
        return l(ccVar, cls) ? Optional.of(((afnb) ccVar).peer()) : Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean l(cc ccVar, Class cls) {
        if (ccVar instanceof afnb) {
            return cls.isAssignableFrom(((afnb) ccVar).getPeerClass());
        }
        return false;
    }

    public static Bitmap m(aigj aigjVar) {
        return BitmapFactory.decodeByteArray(aigjVar.G(), 0, aigjVar.d());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[ORIG_RETURN, RETURN] */
    public static String n(Context context) {
        switch (context.getPackageName()) {
            case "com.google.android.youtube.sandbox":
                return "com.google.android.youtube.sandbox.fileprovider";
            case "com.google.android.youtube.oem":
                return "com.google.android.youtube.oem.fileprovider";
            case "com.google.android.apps.youtube.creator":
                return "com.google.android.apps.youtube.creator.fileprovider";
            case "com.google.android.apps.youtube.music":
                return "com.google.android.apps.youtube.music.fileprovider";
            default:
                return "com.google.android.youtube.fileprovider";
        }
    }

    public static void o(int i, int i2) {
        String str;
        if (i < 0 || i > i2) {
            if (i < 0) {
                str = String.format("index (%s) must not be negative", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.bR(i2, "negative size: "));
                }
                str = String.format("index (%s) must not be greater than size (%s)", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    private static String p(Resources resources, String str, int i) {
        int i2;
        try {
            i2 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i2 = 0;
        }
        int iAbs = Math.abs(i2);
        return resources.getQuantityString(i, iAbs, Integer.valueOf(iAbs));
    }
}
