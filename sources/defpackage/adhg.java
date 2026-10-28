package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import com.google.android.apps.youtube.music.R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adhg {
    public boolean a;
    public final Object b;

    public adhg(jkp jkpVar, Context context, AttributeSet attributeSet) {
        this.b = jkpVar;
        if (attributeSet != null) {
            this.a = context.getTheme().obtainStyledAttributes(attributeSet, jaa.a, 0, 0).getBoolean(0, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [awmd, java.lang.Object] */
    public final synchronized void a(xkd xkdVar) {
        ((szu) this.b.io()).execute(afwl.i(new xoy(this, xkdVar, 1, null)));
    }

    public final String b(String str) {
        if (!this.a) {
            return str;
        }
        jkp jkpVar = (jkp) this.b;
        return !str.startsWith(jkpVar.a.e().k().concat("_")) ? jkpVar.b(str) : str;
    }

    public final void c() {
        ((CheckedTextView) this.b).getCheckMarkDrawable();
    }

    public final void d(AttributeSet attributeSet) {
        int iZ;
        int iZ2;
        Object obj = this.b;
        CheckedTextView checkedTextView = (CheckedTextView) obj;
        Context context = checkedTextView.getContext();
        int[] iArr = he.l;
        ahto ahtoVarL = ahto.L(context, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        bac.o((View) obj, checkedTextView.getContext(), iArr, attributeSet, (TypedArray) ahtoVarL.b, R.attr.checkedTextViewStyle, 0);
        try {
            if (ahtoVarL.H(1) && (iZ2 = ahtoVarL.z(1, 0)) != 0) {
                try {
                    ((CheckedTextView) obj).setCheckMarkDrawable(dl.d(((CheckedTextView) obj).getContext(), iZ2));
                } catch (Resources.NotFoundException unused) {
                    if (ahtoVarL.H(0)) {
                        Object obj2 = this.b;
                        ((CheckedTextView) obj2).setCheckMarkDrawable(dl.d(((CheckedTextView) obj2).getContext(), iZ));
                    }
                }
            } else if (ahtoVarL.H(0) && (iZ = ahtoVarL.z(0, 0)) != 0) {
                Object obj3 = this.b;
                ((CheckedTextView) obj3).setCheckMarkDrawable(dl.d(((CheckedTextView) obj3).getContext(), iZ));
            }
            if (ahtoVarL.H(2)) {
                ((CheckedTextView) this.b).setCheckMarkTintList(ahtoVarL.A(2));
            }
            if (ahtoVarL.H(3)) {
                Object obj4 = this.b;
                int iW = ahtoVarL.w(3, -1);
                Rect rect = lx.a;
                ((CheckedTextView) obj4).setCheckMarkTintMode(a.l(iW, null));
            }
        } finally {
            ahtoVarL.F();
        }
    }

    public adhg(awmd awmdVar) {
        this.b = awmdVar;
    }

    public adhg(Object obj) {
        this.b = obj;
        this.a = false;
    }

    public adhg(CheckedTextView checkedTextView) {
        this.b = checkedTextView;
    }

    public adhg(List list) {
        this.b = agke.n(list);
        this.a = false;
    }
}
