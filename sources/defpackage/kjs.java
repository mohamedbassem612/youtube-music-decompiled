package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kjs {
    private static volatile kjs c;
    public int a;
    public final Object b;

    public kjs(int i) {
        this.a = 0;
        this.b = new int[(i + 1) << 1];
    }

    public static kjs b() {
        if (c == null) {
            synchronized (kjs.class) {
                if (c == null) {
                    c = new kjs();
                }
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    private final synchronized void q(String str, int i, int i2, kjt kjtVar) {
        if (i != 1002) {
            axq axqVar = new axq(str, Integer.valueOf(i));
            ?? r1 = this.b;
            kjt kjtVar2 = (kjt) r1.get(axqVar);
            if (kjtVar2 != null) {
                kjtVar2.c = ahng.Y(kjtVar2.c, i2);
                return;
            } else if (((aha) r1).d < 100) {
                if (kjtVar == null) {
                    kjtVar = new kjt(str, i, i2);
                }
                r1.put(axqVar, kjtVar);
                return;
            }
        }
        this.a = ahng.Y(this.a, i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized kjg a() {
        ArrayList arrayList;
        ?? r0 = this.b;
        arrayList = new ArrayList(r0.values());
        int i = this.a;
        if (i > 0) {
            arrayList.add(new kjt("UNKNOWN", 1002, i));
            this.a = 0;
        }
        r0.clear();
        return new kjg(arrayList);
    }

    public final synchronized void c(kjt kjtVar) {
        q(kjtVar.a, kjtVar.b, kjtVar.c, kjtVar);
    }

    public final void d(int i, Context context) {
        if (auqk.a.io().a(context)) {
            e("UNKNOWN", i);
        }
    }

    public final synchronized void e(String str, int i) {
        q(str, i, 1, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void f(jlf jlfVar) {
        if (this.b.add(jlfVar)) {
            int i = this.a;
            if (i == 1) {
                jlfVar.b();
            } else if (i == 2) {
                jlfVar.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void g(jlf jlfVar) {
        this.b.remove(jlfVar);
    }

    public final void h() {
        ImageView imageView = (ImageView) this.b;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.a);
        }
    }

    public final void i() {
        Drawable drawable = ((ImageView) this.b).getDrawable();
        if (drawable != null) {
            lx.b(drawable);
        }
    }

    public final void j(AttributeSet attributeSet, int i) {
        int iZ;
        Object obj = this.b;
        ImageView imageView = (ImageView) obj;
        Context context = imageView.getContext();
        int[] iArr = he.f;
        ahto ahtoVar = new ahto(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        bac.o((View) obj, imageView.getContext(), iArr, attributeSet, (TypedArray) ahtoVar.b, i, 0);
        try {
            Drawable drawable = ((ImageView) obj).getDrawable();
            if (drawable == null && (iZ = ahtoVar.z(1, -1)) != -1) {
                drawable = ok.e().c(((ImageView) obj).getContext(), iZ);
                if (drawable != null) {
                    ((ImageView) obj).setImageDrawable(drawable);
                }
            }
            if (drawable != null) {
                lx.b(drawable);
            }
            if (ahtoVar.H(2)) {
                ((ImageView) obj).setImageTintList(ahtoVar.A(2));
            }
            if (ahtoVar.H(3)) {
                int iW = ahtoVar.w(3, -1);
                Rect rect = lx.a;
                ((ImageView) obj).setImageTintMode(a.l(iW, null));
            }
        } finally {
            ahtoVar.F();
        }
    }

    public final void k(Drawable drawable) {
        this.a = drawable.getLevel();
    }

    public final void l(int i) {
        Object obj = this.b;
        if (i != 0) {
            ImageView imageView = (ImageView) obj;
            Drawable drawableC = ok.e().c(imageView.getContext(), i);
            if (drawableC != null) {
                lx.b(drawableC);
            }
            imageView.setImageDrawable(drawableC);
        } else {
            ((ImageView) obj).setImageDrawable(null);
        }
        i();
    }

    public final boolean m() {
        return !(((ImageView) this.b).getBackground() instanceof RippleDrawable);
    }

    public final Object n() {
        int i = this.a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = (Object[]) this.b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.a = i2;
        return obj;
    }

    public final void o(Object obj) {
        int i = this.a;
        if (i < 256) {
            ((Object[]) this.b)[i] = obj;
            this.a = i + 1;
        }
    }

    public final void p(int i, int i2) {
        int i3 = this.a;
        int i4 = i3 + 1;
        this.a = i4;
        int[] iArr = (int[]) this.b;
        iArr[i3] = i;
        this.a = i3 + 2;
        iArr[i4] = i2;
    }

    public kjs(ImageView imageView) {
        this.a = 0;
        this.b = imageView;
    }

    public kjs(char[] cArr) {
        this.b = new Object[SemanticState.Hidden];
    }

    public kjs(byte[] bArr) {
        this.b = Collections.newSetFromMap(new WeakHashMap());
    }

    private kjs() {
        this.a = 0;
        this.b = new afv();
    }
}
