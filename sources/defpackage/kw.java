package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kw extends mx implements ky {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c;
    public final /* synthetic */ AppCompatSpinner d;
    private int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = appCompatSpinner;
        this.c = new Rect();
        this.k = appCompatSpinner;
        z();
        this.l = new afej(this, 1);
    }

    @Override // defpackage.ky
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.mx, defpackage.ky
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.ky
    public final void h(int i) {
        this.r = i;
    }

    @Override // defpackage.ky
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.ky
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean zU = u();
        n();
        y();
        super.s();
        mb mbVar = this.e;
        mbVar.setChoiceMode(1);
        mbVar.setTextDirection(i);
        mbVar.setTextAlignment(i2);
        AppCompatSpinner appCompatSpinner = this.d;
        w(appCompatSpinner.getSelectedItemPosition());
        if (zU || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        jg jgVar = new jg(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(jgVar);
        v(new acxw(this, jgVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
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
    public final void n() {
        int i;
        Drawable drawableC = c();
        AppCompatSpinner appCompatSpinner = this.d;
        if (drawableC != null) {
            Rect rect = appCompatSpinner.d;
            drawableC.getPadding(rect);
            i = pl.a(appCompatSpinner) ? rect.right : -rect.left;
        } else {
            Rect rect2 = appCompatSpinner.d;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        AppCompatSpinner appCompatSpinner2 = this.d;
        int paddingLeft = appCompatSpinner2.getPaddingLeft();
        int paddingRight = appCompatSpinner2.getPaddingRight();
        int width = appCompatSpinner2.getWidth();
        int i2 = appCompatSpinner2.c;
        if (i2 == -2) {
            int i3 = (width - paddingLeft) - paddingRight;
            int iA = appCompatSpinner2.a(this.b, c());
            int i4 = appCompatSpinner2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = appCompatSpinner2.d;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (iA > i5) {
                iA = i5;
            }
            r(Math.max(iA, i3));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = pl.a(appCompatSpinner2) ? i + (((width - paddingRight) - this.f) - this.r) : i + paddingLeft + this.r;
    }
}
