package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import defpackage.ahto;
import defpackage.dl;
import defpackage.he;
import defpackage.jg;
import defpackage.kf;
import defpackage.kt;
import defpackage.ku;
import defpackage.kv;
import defpackage.kw;
import defpackage.kx;
import defpackage.ky;
import defpackage.mg;
import defpackage.ox;
import defpackage.rt;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class AppCompatSpinner extends Spinner {
    private static final int[] e = {R.attr.spinnerMode};
    public final Context a;
    public ky b;
    public int c;
    public final Rect d;
    private final kf f;
    private mg g;
    private SpinnerAdapter h;
    private final boolean i;

    /* JADX WARN: Code duplicated, block: B:29:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.d = new Rect();
        ox.d(this, getContext());
        ahto ahtoVarL = ahto.L(context, attributeSet, he.u, i, 0);
        this.f = new kf(this);
        if (theme != null) {
            this.a = new rt(context, theme);
        } else {
            int iZ = ahtoVarL.z(4, 0);
            if (iZ != 0) {
                this.a = new rt(context, iZ);
            } else {
                this.a = context;
            }
        }
        TypedArray typedArray = null;
        if (i2 == -1) {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e, i, 0);
                try {
                    int i3 = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getInt(0, 0) : -1;
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    i2 = i3;
                    if (i2 != 0) {
                        ku kuVar = new ku(this);
                        this.b = kuVar;
                        kuVar.i(ahtoVarL.E(2));
                    } else if (i2 == 1) {
                        kw kwVar = new kw(this, this.a, attributeSet, i);
                        ahto ahtoVarL2 = ahto.L(this.a, attributeSet, he.u, i, 0);
                        this.c = ahtoVarL2.y(3, -2);
                        kwVar.f(ahtoVarL2.B(1));
                        kwVar.a = ahtoVarL.E(2);
                        ahtoVarL2.F();
                        this.b = kwVar;
                        this.g = new kt(this, this, kwVar);
                    }
                } catch (Exception unused) {
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                } catch (Throwable th) {
                    th = th;
                    typedArray = typedArrayObtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                typedArrayObtainStyledAttributes = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } else if (i2 != 0) {
            ku kuVar2 = new ku(this);
            this.b = kuVar2;
            kuVar2.i(ahtoVarL.E(2));
        } else if (i2 == 1) {
            kw kwVar2 = new kw(this, this.a, attributeSet, i);
            ahto ahtoVarL3 = ahto.L(this.a, attributeSet, he.u, i, 0);
            this.c = ahtoVarL3.y(3, -2);
            kwVar2.f(ahtoVarL3.B(1));
            kwVar2.a = ahtoVarL.E(2);
            ahtoVarL3.F();
            this.b = kwVar2;
            this.g = new kt(this, this, kwVar2);
        }
        CharSequence[] textArray = ((TypedArray) ahtoVarL.b).getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.google.android.apps.youtube.music.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        ahtoVarL.F();
        this.i = true;
        SpinnerAdapter spinnerAdapter = this.h;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.h = null;
        }
        this.f.b(attributeSet, i);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.d;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    public final void b() {
        this.b.l(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        kf kfVar = this.f;
        if (kfVar != null) {
            kfVar.a();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        ky kyVar = this.b;
        return kyVar != null ? kyVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        ky kyVar = this.b;
        return kyVar != null ? kyVar.b() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.b != null ? this.c : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        ky kyVar = this.b;
        return kyVar != null ? kyVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.a;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        ky kyVar = this.b;
        return kyVar != null ? kyVar.d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ky kyVar = this.b;
        if (kyVar == null || !kyVar.u()) {
            return;
        }
        this.b.k();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        kx kxVar = (kx) parcelable;
        super.onRestoreInstanceState(kxVar.getSuperState());
        if (!kxVar.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new jg(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        kx kxVar = new kx(super.onSaveInstanceState());
        ky kyVar = this.b;
        boolean z = false;
        if (kyVar != null && kyVar.u()) {
            z = true;
        }
        kxVar.a = z;
        return kxVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        mg mgVar = this.g;
        if (mgVar == null || !mgVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        ky kyVar = this.b;
        if (kyVar == null) {
            return super.performClick();
        }
        if (!kyVar.u()) {
            b();
        }
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            Context context = this.a;
            if (context == null) {
                context = getContext();
            }
            this.b.e(new kv(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kf kfVar = this.f;
        if (kfVar != null) {
            kfVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kf kfVar = this.f;
        if (kfVar != null) {
            kfVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        ky kyVar = this.b;
        if (kyVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            kyVar.h(i);
            this.b.g(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        ky kyVar = this.b;
        if (kyVar != null) {
            kyVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        ky kyVar = this.b;
        if (kyVar != null) {
            kyVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(dl.d(this.a, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        ky kyVar = this.b;
        if (kyVar != null) {
            kyVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, com.google.android.apps.youtube.music.R.attr.spinnerStyle, i);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }
}
