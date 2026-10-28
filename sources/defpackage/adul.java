package defpackage;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adul {
    public adul(byte[] bArr, byte[] bArr2) {
        new HashSet();
    }

    public static int a(View view) {
        view.getClass();
        Object tag = view.getTag(R.id.presenter_adapter_viewtype_tag);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public static adly b(View view) {
        adly adlyVarC = c(view);
        if (adlyVarC == null) {
            adlyVarC = new adly();
            i(view, adlyVarC);
        }
        adlyVarC.h();
        return adlyVarC;
    }

    public static adly c(View view) {
        view.getClass();
        Object tag = view.getTag(R.id.presenter_adapter_context_tag);
        if (tag instanceof adly) {
            return (adly) tag;
        }
        return null;
    }

    public static adma d(View view) {
        view.getClass();
        Object tag = view.getTag(R.id.presenter_adapter_tag);
        if (tag instanceof adma) {
            return (adma) tag;
        }
        return null;
    }

    public static adma e(admh admhVar, Object obj, ViewGroup viewGroup) {
        admhVar.getClass();
        obj.getClass();
        int iA = admhVar.a(obj);
        if (iA == -1) {
            return null;
        }
        return admhVar.c(iA, viewGroup);
    }

    public static agev f(admh admhVar, Object obj, ViewGroup viewGroup) {
        adma admaVarE = e(admhVar, obj, viewGroup);
        if (admaVarE == null) {
            return agdf.a;
        }
        j(admaVarE.a(), admaVarE, admhVar.a(obj));
        return agev.i(admaVarE);
    }

    public static void g(View view, admh admhVar) {
        view.getClass();
        adma admaVarD = d(view);
        if (admaVarD != null) {
            w(admaVarD, view, admhVar);
        }
    }

    public static void h(adma admaVar, admh admhVar) {
        w(admaVar, admaVar.a(), admhVar);
    }

    public static void i(View view, adly adlyVar) {
        view.getClass();
        view.setTag(R.id.presenter_adapter_context_tag, adlyVar);
    }

    public static void j(View view, adma admaVar, int i) {
        view.getClass();
        view.setTag(R.id.presenter_adapter_tag, admaVar);
        view.setTag(R.id.presenter_adapter_viewtype_tag, Integer.valueOf(i));
    }

    public static tmo k(Context context, Executor executor, vxz vxzVar, tqj tqjVar) {
        File file = new File(context.getCacheDir(), "glide_disk_cache");
        if (!file.isDirectory() && !file.mkdirs()) {
            return new tnn();
        }
        tou touVar = new tou(file, executor, vxzVar, tqjVar);
        touVar.f();
        return touVar;
    }

    public static final adia l(tsz tszVar, ImageView imageView) {
        tszVar.getClass();
        imageView.getClass();
        return new adia(tszVar, imageView, false);
    }

    public static boolean m(tao taoVar, tqj tqjVar) {
        int i = tqr.a;
        return tqjVar.k(1073808320) ? tqjVar.k(1073808321) : tym.aj(taoVar.e());
    }

    public static final Animator n(View view, int i, int i2, long j) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        valueAnimatorOfObject.setDuration(j);
        valueAnimatorOfObject.addUpdateListener(new adey(view, 9));
        return valueAnimatorOfObject;
    }

    public static final void o(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((avmn) it.next()).dispose();
        }
        list.clear();
    }

    public static Integer p(String str, ajdl ajdlVar) {
        if (ajdlVar != null && !TextUtils.isEmpty(str)) {
            for (ajdm ajdmVar : ajdlVar.b) {
                if (TextUtils.equals(str, ajdmVar.c)) {
                    return Integer.valueOf(ajdmVar.b);
                }
            }
        }
        return null;
    }

    public static List q(Collection collection, ajdl ajdlVar) {
        if (collection == null || ajdlVar == null || ajdlVar.b.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = ((ResolveInfo) it.next()).activityInfo.applicationInfo.packageName;
            if (!TextUtils.isEmpty(str)) {
                hashSet.add(str);
            }
        }
        ArrayList arrayList = new ArrayList(hashSet.size());
        for (ajdm ajdmVar : ajdlVar.b) {
            if (hashSet.contains(ajdmVar.c)) {
                arrayList.add(Integer.valueOf(ajdmVar.b));
            }
        }
        return arrayList;
    }

    public static tza r(Map map, awmd awmdVar, Activity activity) {
        return (tza) ((awmd) agev.h((awmd) map.get(activity.getClass())).e(awmdVar)).io();
    }

    public static tza s(Map map, awmd awmdVar, Activity activity) {
        return (tza) ((awmd) agev.h((awmd) map.get(activity.getClass())).e(awmdVar)).io();
    }

    public static ajet t(Map map, Activity activity) {
        return map.containsKey(activity.getClass()) ? (ajet) ((awmd) map.get(activity.getClass())).io() : ajet.USER_INTERFACE_THEME_DARK;
    }

    public static adne u(abxv abxvVar, vxz vxzVar) {
        return new adne(abxvVar, vxzVar.l(24, 45718873L, false), vxzVar.l(74, 45797931L, false));
    }

    public static abxv v(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, Map map, Map map2, Map map3, Map map4) {
        abxv abxvVar = new abxv();
        ahto ahtoVar = (ahto) abxvVar.d;
        ahtoVar.h(awmdVar);
        ahto ahtoVar2 = (ahto) abxvVar.c;
        ahtoVar2.h(awmdVar2);
        ahto ahtoVar3 = (ahto) abxvVar.b;
        ahtoVar3.h(awmdVar3);
        ahto ahtoVar4 = (ahto) abxvVar.a;
        ahtoVar4.h(awmdVar4);
        ahtoVar.g(map);
        ahtoVar2.g(map2);
        ahtoVar3.g(map3);
        ahtoVar4.g(map4);
        return abxvVar;
    }

    private static void w(adma admaVar, View view, admh admhVar) {
        adly adlyVarC = c(view);
        if (adlyVarC != null) {
            adlyVarC.h();
        }
        admhVar.getClass();
        admaVar.b(admhVar);
    }

    public adul() {
    }
}
