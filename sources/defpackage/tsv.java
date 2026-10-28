package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tsv {
    private static volatile Boolean a;

    public static final String a(trz trzVar, String str) {
        if (str.length() == 0) {
            String str2 = trzVar.b().a;
            str2.getClass();
            return str2;
        }
        qci qciVarB = trzVar.b();
        Objects.toString(qciVarB);
        return String.valueOf(qciVarB).concat(str);
    }

    public static final boolean b(trz trzVar) {
        return trzVar.c() && Build.VERSION.SDK_INT >= 29;
    }

    public static final void c(trz trzVar, String str) {
        str.getClass();
        if (tym.ab(trzVar)) {
            awrc.x(a(trzVar, str), 127);
        }
    }

    public static final void d(Context context, trz trzVar, String str) {
        if (b(trzVar)) {
            awrc.x(a(trzVar, str), 127);
        } else {
            k(context);
        }
    }

    public static final void e(Context context, trz trzVar, String str) {
        if (b(trzVar)) {
            awrc.x(a(trzVar, str), 127);
        } else {
            k(context);
        }
    }

    public static void f(SwipeLayout swipeLayout, List list) {
        swipeLayout.getClass();
        list.getClass();
        if (swipeLayout.j == null && list.isEmpty()) {
            return;
        }
        if (!(swipeLayout.j instanceof LinearLayout)) {
            swipeLayout.l(l(swipeLayout.getContext()));
        }
        m((LinearLayout) swipeLayout.j, list);
        swipeLayout.l = !list.isEmpty();
    }

    public static void g(SwipeLayout swipeLayout, List list) {
        swipeLayout.getClass();
        list.getClass();
        if (swipeLayout.g == null && list.isEmpty()) {
            return;
        }
        if (!(swipeLayout.g instanceof LinearLayout)) {
            swipeLayout.n(l(swipeLayout.getContext()));
        }
        m((LinearLayout) swipeLayout.g, list);
        swipeLayout.i = !list.isEmpty();
    }

    public static int h(ajwo ajwoVar) {
        int iBc;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(ajmj.a);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            aokt aoktVar = ((ajmf) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).j;
            if (aoktVar == null) {
                aoktVar = aokt.a;
            }
            iBc = a.bc(aoktVar.b);
            if (iBc == 0) {
                return 1;
            }
        } else {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (!ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                return 1;
            }
            aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apfp.b);
            ajwoVar.c(aihlVarCheckIsLite4);
            Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
            aokt aoktVar2 = ((apfp) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).V;
            if (aoktVar2 == null) {
                aoktVar2 = aokt.a;
            }
            iBc = a.bc(aoktVar2.b);
            if (iBc == 0) {
                return 1;
            }
        }
        return iBc;
    }

    public static void i(ImageView imageView, int i) {
        boolean z = false;
        if (i >= 0 && i <= 255) {
            z = true;
        }
        ahno.F(z);
        imageView.getClass();
        imageView.setImageAlpha(i);
    }

    public static final zdj j(View view) {
        view.getClass();
        return new zdj(view);
    }

    private static final void k(Context context) {
        if (context != null) {
            Boolean bool = a;
            if (bool != null) {
                bool.booleanValue();
                return;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.isEnabled();
            }
            a = Boolean.FALSE;
        }
    }

    private static LinearLayout l(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        return linearLayout;
    }

    private static void m(LinearLayout linearLayout, List list) {
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linearLayout.addView((View) it.next(), new LinearLayout.LayoutParams(-2, -1));
            }
        }
    }
}
