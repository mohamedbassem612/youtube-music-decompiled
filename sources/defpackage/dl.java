package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.youtube.music.R;
import java.util.ConcurrentModificationException;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class dl {
    public dl(byte[] bArr, byte[] bArr2) {
    }

    public static void a(String str, Runnable runnable) {
        drd drdVar = drd.d;
        drdVar.a("androidx.fragment");
        axjt axjtVar = axjt.a;
        try {
            runnable.run();
            afxw.v(axjtVar);
        } catch (Throwable th) {
            try {
                wg.d(drdVar, th);
                throw new awmh();
            } catch (Throwable th2) {
                afxw.v(axjtVar);
                throw th2;
            }
        }
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static eb c(ViewGroup viewGroup, dl dlVar) {
        dlVar.getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof eb) {
            return (eb) tag;
        }
        eb ebVar = new eb(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, ebVar);
        return ebVar;
    }

    public static Drawable d(Context context, int i) {
        return ok.e().c(context, i);
    }

    public static void e(Configuration configuration, awq awqVar) {
        configuration.setLocales(LocaleList.forLanguageTags(awqVar.e()));
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static void g(int i, View view, ViewGroup viewGroup) {
        int i2 = i - 1;
        if (i2 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (dd.aa(2)) {
                    Objects.toString(view);
                    Objects.toString(viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (dd.aa(2)) {
                    Objects.toString(view);
                }
                view.setVisibility(4);
                return;
            } else {
                if (dd.aa(2)) {
                    Objects.toString(view);
                }
                view.setVisibility(8);
                return;
            }
        }
        if (dd.aa(2)) {
            Objects.toString(view);
        }
        ViewParent parent2 = view.getParent();
        if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
            if (dd.aa(2)) {
                Objects.toString(view);
                Objects.toString(viewGroup);
            }
            viewGroup.addView(view);
        }
        view.setVisibility(0);
    }

    public static int h(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(a.bR(i, "Unknown visibility "));
    }

    public static int i(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return h(view.getVisibility());
    }

    public static void j() {
        throw new IllegalStateException("Invalid applier");
    }

    public static void k(String str) {
        throw new IllegalArgumentException(str);
    }

    public static void l(String str) {
        throw new IllegalStateException(str);
    }

    public static int m(afx afxVar, int i) {
        try {
            return ahe.a(afxVar.a, afxVar.c, i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static int n(afx afxVar, Object obj, int i) {
        int i2 = afxVar.c;
        if (i2 == 0) {
            return -1;
        }
        int iM = m(afxVar, i);
        if (iM < 0 || awrc.c(obj, afxVar.b[iM])) {
            return iM;
        }
        int i3 = iM + 1;
        while (i3 < i2 && afxVar.a[i3] == i) {
            if (awrc.c(obj, afxVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM - 1; i4 >= 0 && afxVar.a[i4] == i; i4--) {
            if (awrc.c(obj, afxVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static /* synthetic */ void o(agk agkVar, long j) {
        int iB = ahe.b(agkVar.b, agkVar.d, j);
        if (iB >= 0) {
            Object[] objArr = agkVar.c;
            Object obj = objArr[iB];
            Object obj2 = agl.a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                agkVar.a = true;
            }
        }
    }

    public static /* synthetic */ qx p(int i, int i2) {
        return new qx(i, i2, (awqg) new akl(1));
    }
}
