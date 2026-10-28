package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aewl extends kh {
    private static final int e = 2132085848;
    private static final int[] f = {R.attr.state_indeterminate};
    private static final int[] g = {R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    ColorStateList b;
    final ColorStateList c;
    public int[] d;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private final PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private CompoundButton.OnCheckedChangeListener w;
    private final dtf x;
    private final dta y;

    /* JADX WARN: Illegal instructions before constructor call */
    public aewl(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListY;
        int i2 = e;
        super(afev.a(context, attributeSet, R.attr.checkboxStyle, i2), attributeSet);
        new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.x = dtf.a(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.y = new aewi(this);
        Context context2 = getContext();
        ColorStateList buttonTintList = this.b;
        if (buttonTintList == null) {
            buttonTintList = super.getButtonTintList() != null ? super.getButtonTintList() : null;
        }
        this.b = buttonTintList;
        kj kjVar = this.a;
        if (kjVar != null) {
            kjVar.b = true;
            kjVar.a();
        }
        ahto ahtoVarE = aeym.e(context2, attributeSet, aewm.a, R.attr.checkboxStyle, i2, new int[0]);
        this.q = ahtoVarE.B(2);
        if (this.p != null && afba.w(context2, R.attr.isMaterial3Theme, false)) {
            int iZ = ahtoVarE.z(0, 0);
            int iZ2 = ahtoVarE.z(1, 0);
            if (iZ == i && iZ2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.p = dl.d(context2, R.drawable.mtrl_checkbox_button);
                this.r = true;
                if (this.q == null) {
                    this.q = dl.d(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.c = afba.Y(context2, ahtoVarE, 3);
        this.s = a.l(ahtoVarE.w(4, -1), PorterDuff.Mode.SRC_IN);
        this.l = ahtoVarE.G(11, false);
        this.m = ahtoVarE.G(6, true);
        this.n = ahtoVarE.G(9, false);
        this.o = ahtoVarE.D(8);
        if (ahtoVarE.H(7)) {
            a(ahtoVarE.w(7, 0));
        }
        if (ahtoVarE.H(10) && (colorStateListY = afba.Y(context2, ahtoVarE, 10)) != null) {
            Drawable background = getBackground();
            background = background instanceof DrawableWrapper ? ((DrawableWrapper) background).getDrawable() : background;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(colorStateListY);
            }
        }
        ahtoVarE.F();
        b();
    }

    private final void b() {
        ColorStateList colorStateList;
        Animator.AnimatorListener animatorListener;
        this.p = afba.G(this.p, this.b, getButtonTintMode());
        Drawable drawable = this.q;
        ColorStateList colorStateList2 = this.c;
        this.q = afba.G(drawable, colorStateList2, this.s);
        if (this.r) {
            dtf dtfVar = this.x;
            if (dtfVar != null) {
                dta dtaVar = this.y;
                if (dtaVar != null) {
                    Drawable drawable2 = dtfVar.e;
                    if (drawable2 != null) {
                        ((AnimatedVectorDrawable) drawable2).unregisterAnimationCallback(dtaVar.a());
                    }
                    ArrayList arrayList = dtfVar.c;
                    if (arrayList != null) {
                        arrayList.remove(dtaVar);
                        if (dtfVar.c.size() == 0 && (animatorListener = dtfVar.b) != null) {
                            dtfVar.a.c.removeListener(animatorListener);
                            dtfVar.b = null;
                        }
                    }
                }
                if (dtaVar != null) {
                    Drawable drawable3 = dtfVar.e;
                    if (drawable3 != null) {
                        ((AnimatedVectorDrawable) drawable3).registerAnimationCallback(dtaVar.a());
                    } else {
                        if (dtfVar.c == null) {
                            dtfVar.c = new ArrayList();
                        }
                        if (!dtfVar.c.contains(dtaVar)) {
                            dtfVar.c.add(dtaVar);
                            if (dtfVar.b == null) {
                                dtfVar.b = new dtc(dtfVar);
                            }
                            dtfVar.a.c.addListener(dtfVar.b);
                        }
                    }
                }
            }
            Drawable drawable4 = this.p;
            if ((drawable4 instanceof AnimatedStateListDrawable) && dtfVar != null) {
                ((AnimatedStateListDrawable) drawable4).addTransition(R.id.checked, R.id.unchecked, dtfVar, false);
                ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, dtfVar, false);
            }
        }
        Drawable drawable5 = this.p;
        if (drawable5 != null && (colorStateList = this.b) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.q;
        if (drawable6 != null && colorStateList2 != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.p;
        Drawable drawable8 = this.q;
        if (drawable7 == null) {
            drawable7 = drawable8;
        } else if (drawable8 != null) {
            int intrinsicWidth = drawable8.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable7.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable8.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable7.getIntrinsicWidth() || intrinsicHeight > drawable7.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable7.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable7.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable7, drawable8});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable7 = layerDrawable;
        }
        super.setButtonDrawable(drawable7);
        refreshDrawableState();
    }

    private final void c() {
        String string;
        if (Build.VERSION.SDK_INT < 30 || this.v != null) {
            return;
        }
        int i2 = this.t;
        if (i2 == 1) {
            string = getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        } else {
            string = i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
        }
        super.setStateDescription(string);
    }

    public final void a(int i2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            c();
            if (this.u) {
                return;
            }
            this.u = true;
            LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((aewj) it.next()).a();
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManagerM629m = bd$$ExternalSyntheticApiModelOutline1.m629m(getContext().getSystemService(bd$$ExternalSyntheticApiModelOutline1.m630m()));
            if (autofillManagerM629m != null) {
                autofillManagerM629m.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            ColorStateList colorStateList = this.k;
            if (colorStateList == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int I = afba.I(this, R.attr.colorControlActivated);
                int I2 = afba.I(this, R.attr.colorError);
                int I3 = afba.I(this, R.attr.colorSurface);
                int I4 = afba.I(this, R.attr.colorOnSurface);
                ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{afba.L(I3, I2, 1.0f), afba.L(I3, I, 1.0f), afba.L(I3, I4, 0.54f), afba.L(I3, I4, 0.38f), afba.L(I3, I4, 0.38f)});
                this.k = colorStateList2;
                colorStateList = colorStateList2;
            }
            setButtonTintList(colorStateList);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArr;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        int i3 = 0;
        while (true) {
            int length = iArrOnCreateDrawableState.length;
            if (i3 >= length) {
                int[] iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, length + 1);
                iArrCopyOf[length] = 16842912;
                iArr = iArrCopyOf;
                break;
            }
            int i4 = iArrOnCreateDrawableState[i3];
            if (i4 == 16842912) {
                iArr = iArrOnCreateDrawableState;
                break;
            }
            if (i4 == 0) {
                iArr = (int[]) iArrOnCreateDrawableState.clone();
                iArr[i3] = 16842912;
                break;
            }
            i3++;
        }
        this.d = iArr;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (!this.m || !TextUtils.isEmpty(getText()) || (drawable = this.p) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == afba.C(this) ? -1 : 1;
        int width = getWidth() - drawable.getIntrinsicWidth();
        int iSave = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo == null || !this.n) {
            return;
        }
        accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.o));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof aewk)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aewk aewkVar = (aewk) parcelable;
        super.onRestoreInstanceState(aewkVar.getSuperState());
        a(aewkVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        aewk aewkVar = new aewk(super.onSaveInstanceState());
        aewkVar.a = this.t;
        return aewkVar;
    }

    @Override // defpackage.kh, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(dl.d(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            b();
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        kj kjVar = this.a;
        if (kjVar != null) {
            kjVar.a = mode;
            kjVar.c = true;
            kjVar.a();
        }
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        a(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            c();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        a(!isChecked() ? 1 : 0);
    }

    @Override // defpackage.kh, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        b();
    }
}
