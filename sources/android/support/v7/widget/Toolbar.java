package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.youtube.music.R;
import defpackage.ahto;
import defpackage.ayn;
import defpackage.ayq;
import defpackage.ayr;
import defpackage.bac;
import defpackage.bq;
import defpackage.dl;
import defpackage.fj;
import defpackage.he;
import defpackage.hhb;
import defpackage.ib;
import defpackage.io;
import defpackage.iq;
import defpackage.is;
import defpackage.ja;
import defpackage.jx;
import defpackage.kb;
import defpackage.mc;
import defpackage.ok;
import defpackage.ol;
import defpackage.pa;
import defpackage.pb;
import defpackage.pc;
import defpackage.pd;
import defpackage.pe;
import defpackage.ph;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements ayn {
    public io A;
    public boolean B;
    private ImageButton C;
    private int D;
    private ol E;
    private int F;
    private int G;
    private int H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList M;
    private final int[] N;
    private ph O;
    private OnBackInvokedCallback P;
    private OnBackInvokedDispatcher Q;
    private final Runnable R;
    private final hhb S;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public CharSequence r;
    public CharSequence s;
    public final ArrayList t;
    public final ayq u;
    public ArrayList v;
    public pd w;
    public jx x;
    public pb y;
    public ja z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = 8388627;
        this.M = new ArrayList();
        this.t = new ArrayList();
        this.N = new int[2];
        this.u = new ayq(new bq(this, 18));
        this.v = new ArrayList();
        this.S = new hhb(this);
        this.R = new bq(this, 19, null);
        Context context2 = getContext();
        int[] iArr = he.x;
        ahto ahtoVar = new ahto(context2, context2.obtainStyledAttributes(attributeSet, iArr, i, 0));
        bac.o(this, context, iArr, attributeSet, (TypedArray) ahtoVar.b, i, 0);
        this.k = ahtoVar.z(28, 0);
        this.l = ahtoVar.z(19, 0);
        this.H = ahtoVar.x(0, this.H);
        this.m = ahtoVar.x(2, 48);
        int iU = ahtoVar.u(22, 0);
        iU = ahtoVar.H(27) ? ahtoVar.u(27, iU) : iU;
        this.q = iU;
        this.p = iU;
        this.o = iU;
        this.n = iU;
        int iU2 = ahtoVar.u(25, -1);
        if (iU2 >= 0) {
            this.n = iU2;
        }
        int iU3 = ahtoVar.u(24, -1);
        if (iU3 >= 0) {
            this.o = iU3;
        }
        int iU4 = ahtoVar.u(26, -1);
        if (iU4 >= 0) {
            this.p = iU4;
        }
        int iU5 = ahtoVar.u(23, -1);
        if (iU5 >= 0) {
            this.q = iU5;
        }
        this.D = ahtoVar.v(13, -1);
        int iU6 = ahtoVar.u(9, Integer.MIN_VALUE);
        int iU7 = ahtoVar.u(5, Integer.MIN_VALUE);
        int iV = ahtoVar.v(7, 0);
        int iV2 = ahtoVar.v(8, 0);
        L();
        ol olVar = this.E;
        olVar.h = false;
        if (iV != Integer.MIN_VALUE) {
            olVar.e = iV;
            olVar.a = iV;
        }
        if (iV2 != Integer.MIN_VALUE) {
            olVar.f = iV2;
            olVar.b = iV2;
        }
        if (iU6 != Integer.MIN_VALUE || iU7 != Integer.MIN_VALUE) {
            olVar.a(iU6, iU7);
        }
        this.F = ahtoVar.u(10, Integer.MIN_VALUE);
        this.G = ahtoVar.u(6, Integer.MIN_VALUE);
        this.e = ahtoVar.B(4);
        this.f = ahtoVar.D(3);
        CharSequence charSequenceD = ahtoVar.D(21);
        if (!TextUtils.isEmpty(charSequenceD)) {
            v(charSequenceD);
        }
        CharSequence charSequenceD2 = ahtoVar.D(18);
        if (!TextUtils.isEmpty(charSequenceD2)) {
            u(charSequenceD2);
        }
        this.i = getContext();
        t(ahtoVar.z(17, 0));
        Drawable drawableB = ahtoVar.B(16);
        if (drawableB != null) {
            r(drawableB);
        }
        CharSequence charSequenceD3 = ahtoVar.D(15);
        if (!TextUtils.isEmpty(charSequenceD3)) {
            p(charSequenceD3);
        }
        Drawable drawableB2 = ahtoVar.B(11);
        if (drawableB2 != null) {
            n(drawableB2);
        }
        CharSequence charSequenceD4 = ahtoVar.D(12);
        if (!TextUtils.isEmpty(charSequenceD4)) {
            if (!TextUtils.isEmpty(charSequenceD4)) {
                M();
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setContentDescription(charSequenceD4);
            }
        }
        if (ahtoVar.H(29)) {
            ColorStateList colorStateListA = ahtoVar.A(29);
            this.I = colorStateListA;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(colorStateListA);
            }
        }
        if (ahtoVar.H(20)) {
            ColorStateList colorStateListA2 = ahtoVar.A(20);
            this.J = colorStateListA2;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(colorStateListA2);
            }
        }
        if (ahtoVar.H(14)) {
            l(ahtoVar.z(14, 0));
        }
        ahtoVar.F();
    }

    protected static final pc B(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof pc) {
            return new pc((pc) layoutParams);
        }
        if (layoutParams instanceof fj) {
            return new pc((fj) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new pc((ViewGroup.MarginLayoutParams) layoutParams) : new pc(layoutParams);
    }

    private final int E(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private final int F(View view, int i) {
        pc pcVar = (pc) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = pcVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.H & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - pcVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < pcVar.topMargin) {
            iMax = pcVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i4 < pcVar.bottomMargin) {
                iMax = Math.max(0, iMax - (pcVar.bottomMargin - i4));
            }
        }
        return paddingTop + iMax;
    }

    private final int G(View view, int i, int[] iArr, int i2) {
        pc pcVar = (pc) view.getLayoutParams();
        int i3 = pcVar.leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iF = F(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iF, iMax + measuredWidth, view.getMeasuredHeight() + iF);
        return iMax + measuredWidth + pcVar.rightMargin;
    }

    private final int H(View view, int i, int[] iArr, int i2) {
        pc pcVar = (pc) view.getLayoutParams();
        int i3 = pcVar.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iF = F(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iF, iMax, view.getMeasuredHeight() + iF);
        return iMax - (measuredWidth + pcVar.leftMargin);
    }

    private final int I(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private final void J(List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                pc pcVar = (pc) childAt.getLayoutParams();
                if (pcVar.b == 0 && P(childAt) && E(pcVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            pc pcVar2 = (pc) childAt2.getLayoutParams();
            if (pcVar2.b == 0 && P(childAt2) && E(pcVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void K(View view, boolean z) {
        pc pcVarB;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            pcVarB = new pc(-2, -2);
        } else {
            pcVarB = !checkLayoutParams(layoutParams) ? B(layoutParams) : (pc) layoutParams;
        }
        pcVarB.b = 1;
        if (!z || this.h == null) {
            addView(view, pcVarB);
        } else {
            view.setLayoutParams(pcVarB);
            this.t.add(view);
        }
    }

    private final void L() {
        if (this.E == null) {
            this.E = new ol();
        }
    }

    private final void M() {
        if (this.d == null) {
            this.d = new AppCompatImageView(getContext());
        }
    }

    private final void N() {
        if (this.C == null) {
            this.C = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            pc pcVar = new pc(-2, -2);
            pcVar.a = (this.m & 112) | 8388611;
            this.C.setLayoutParams(pcVar);
        }
    }

    private final boolean O(View view) {
        return view.getParent() == this || this.t.contains(view);
    }

    private final boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private final void Q(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final ph A() {
        ph phVar = this.O;
        if (phVar != null) {
            return phVar;
        }
        ph phVar2 = new ph(this, true);
        this.O = phVar2;
        return phVar2;
    }

    public final void C() {
        if (this.F != 0) {
            this.F = 0;
            if (e() != null) {
                requestLayout();
            }
        }
    }

    public final void D() {
        n(dl.d(getContext(), R.drawable.action_bar_logo_ringo2));
    }

    public final int a() {
        ol olVar = this.E;
        if (olVar != null) {
            return olVar.g ? olVar.a : olVar.b;
        }
        return 0;
    }

    @Override // defpackage.ayn
    public final void addMenuProvider(ayr ayrVar) {
        this.u.a(ayrVar);
    }

    public final int b() {
        ol olVar = this.E;
        if (olVar != null) {
            return olVar.g ? olVar.b : olVar.a;
        }
        return 0;
    }

    public final int c() {
        iq iqVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (iqVar = actionMenuView.a) == null || !iqVar.hasVisibleItems()) ? a() : Math.max(a(), Math.max(this.G, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof pc);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.F, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.C;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        k();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu menuG = actionMenuView.g();
            if (this.y == null) {
                this.y = new pb(this);
            }
            this.a.c.o();
            ((iq) menuG).h(this.y, this.i);
            w();
        }
        return this.a.g();
    }

    public final MenuInflater g() {
        return new ib(getContext());
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new pc(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new pc(getContext(), attributeSet);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.C;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        Menu menuF = f();
        for (int i = 0; i < menuF.size(); i++) {
            arrayList.add(menuF.getItem(i));
        }
        return arrayList;
    }

    public final void j() {
        pb pbVar = this.y;
        is isVar = pbVar == null ? null : pbVar.b;
        if (isVar != null) {
            isVar.collapseActionView();
        }
    }

    public final void k() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.j(this.j);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.S;
            actionMenuView2.i(this.z, new kb(this, 2));
            pc pcVar = new pc(-2, -2);
            pcVar.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(pcVar);
            K(this.a, false);
        }
    }

    public final void l(int i) {
        g().inflate(i, f());
    }

    public final void m(int i, int i2) {
        L();
        this.E.a(i, i2);
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            M();
            if (!O(this.d)) {
                K(this.d, true);
            }
        } else {
            ImageView imageView = this.d;
            if (imageView != null && O(imageView)) {
                removeView(this.d);
                this.t.remove(this.d);
            }
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void o(int i) {
        p(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        w();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.L = false;
            actionMasked = 9;
        }
        if (this.L) {
            i = actionMasked;
        } else {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked != 9) {
                i = actionMasked;
            } else if (!zOnHoverEvent) {
                this.L = true;
            }
        }
        if (i == 10 || i == 3) {
            this.L = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0232 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0234  */
    /* JADX WARN: Code duplicated, block: B:102:0x0239  */
    /* JADX WARN: Code duplicated, block: B:105:0x024e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0271  */
    /* JADX WARN: Code duplicated, block: B:108:0x0274  */
    /* JADX WARN: Code duplicated, block: B:109:0x0298  */
    /* JADX WARN: Code duplicated, block: B:111:0x029b  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02af A[LOOP:0: B:114:0x02ad->B:115:0x02af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x02c7 A[LOOP:1: B:117:0x02c5->B:118:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x02e8 A[LOOP:2: B:120:0x02e6->B:121:0x02e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x0327 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0329  */
    /* JADX WARN: Code duplicated, block: B:126:0x032d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0335 A[LOOP:3: B:128:0x0333->B:129:0x0335, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0130  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x0175  */
    /* JADX WARN: Code duplicated, block: B:79:0x0185  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0198  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0200  */
    /* JADX WARN: Code duplicated, block: B:96:0x0226  */
    /* JADX WARN: Code duplicated, block: B:98:0x0229  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iG;
        int iH;
        int iD;
        int iC;
        boolean z2;
        int iMax;
        int iMin;
        boolean zP;
        boolean zP2;
        int measuredHeight;
        TextView textView;
        int iMax2;
        ArrayList arrayList;
        int size;
        int iG2;
        int i5;
        int size2;
        int i6;
        int size3;
        int i7;
        int i8;
        int i9;
        int measuredWidth;
        int i10;
        int i11;
        int size4;
        int i12;
        TextView textView2;
        pc pcVar;
        pc pcVar2;
        boolean z3;
        int i13;
        int paddingTop;
        int i14;
        boolean z4;
        int iMax3;
        int i15;
        int i16;
        int i17;
        boolean z5;
        int i18;
        int i19;
        int iMax4;
        int i20;
        View view;
        View view2;
        View view3;
        View view4;
        int layoutDirection = getLayoutDirection();
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i21 = width - paddingRight;
        int[] iArr = this.N;
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        iArr[1] = 0;
        iArr[0] = 0;
        int i22 = bac.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        boolean z6 = layoutDirection == 1;
        if (P(this.C)) {
            View view5 = this.C;
            if (z6) {
                iH = H(view5, i21, iArr, iMin2);
                iG = paddingLeft;
            } else {
                iG = G(view5, paddingLeft, iArr, iMin2);
            }
            if (P(this.g)) {
                view4 = this.g;
                if (z6) {
                    iH = H(view4, iH, iArr, iMin2);
                } else {
                    iG = G(view4, iG, iArr, iMin2);
                }
            }
            if (P(this.a)) {
                view3 = this.a;
                if (z6) {
                    iG = G(view3, iG, iArr, iMin2);
                } else {
                    iH = H(view3, iH, iArr, iMin2);
                }
            }
            if (getLayoutDirection() == 1) {
                iD = c();
            } else {
                iD = d();
            }
            if (getLayoutDirection() == 1) {
                iC = d();
            } else {
                iC = c();
            }
            z2 = z6;
            iArr[0] = Math.max(0, iD - iG);
            iArr[1] = Math.max(0, iC - (i21 - iH));
            iMax = Math.max(iG, iD);
            iMin = Math.min(iH, i21 - iC);
            if (P(this.h)) {
                view2 = this.h;
                if (z2) {
                    iMin = H(view2, iMin, iArr, iMin2);
                } else {
                    iMax = G(view2, iMax, iArr, iMin2);
                }
            }
            if (P(this.d)) {
                view = this.d;
                if (z2) {
                    iMin = H(view, iMin, iArr, iMin2);
                } else {
                    iMax = G(view, iMax, iArr, iMin2);
                }
            }
            zP = P(this.b);
            zP2 = P(this.c);
            if (zP) {
                pc pcVar3 = (pc) this.b.getLayoutParams();
                measuredHeight = pcVar3.bottomMargin + pcVar3.topMargin + this.b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zP2) {
                pc pcVar4 = (pc) this.c.getLayoutParams();
                measuredHeight += pcVar4.topMargin + this.c.getMeasuredHeight() + pcVar4.bottomMargin;
            }
            if (!zP) {
                if (zP2) {
                    textView = this.c;
                } else {
                    iMax2 = iMax;
                    width = width;
                }
                arrayList = this.M;
                J(arrayList, 3);
                size = arrayList.size();
                iG2 = iMax2;
                for (i5 = 0; i5 < size; i5++) {
                    iG2 = G((View) arrayList.get(i5), iG2, iArr, iMin2);
                }
                J(arrayList, 5);
                size2 = arrayList.size();
                for (i6 = 0; i6 < size2; i6++) {
                    iMin = H((View) arrayList.get(i6), iMin, iArr, iMin2);
                }
                J(arrayList, 1);
                int i23 = iArr[0];
                int i24 = iArr[1];
                size3 = arrayList.size();
                i7 = i24;
                i8 = i23;
                i9 = 0;
                measuredWidth = 0;
                while (i9 < size3) {
                    View view6 = (View) arrayList.get(i9);
                    pc pcVar5 = (pc) view6.getLayoutParams();
                    int i25 = pcVar5.leftMargin - i8;
                    int i26 = pcVar5.rightMargin - i7;
                    int iMax5 = Math.max(0, i25);
                    int iMax6 = Math.max(0, i26);
                    int iMax7 = Math.max(0, -i25);
                    int iMax8 = Math.max(0, -i26);
                    measuredWidth += iMax5 + view6.getMeasuredWidth() + iMax6;
                    i9++;
                    i7 = iMax8;
                    i8 = iMax7;
                }
                i10 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (measuredWidth / 2);
                i11 = measuredWidth + i10;
                if (i10 >= iG2) {
                    if (i11 > iMin) {
                        iG2 = i10 - (i11 - iMin);
                    } else {
                        iG2 = i10;
                    }
                }
                size4 = arrayList.size();
                for (i12 = 0; i12 < size4; i12++) {
                    iG2 = G((View) arrayList.get(i12), iG2, iArr, iMin2);
                }
                arrayList.clear();
            }
            textView = this.b;
            if (zP2) {
                textView2 = this.c;
            } else {
                textView2 = this.b;
            }
            pcVar = (pc) textView.getLayoutParams();
            pcVar2 = (pc) textView2.getLayoutParams();
            z3 = (!zP && this.b.getMeasuredWidth() > 0) || (zP2 && this.c.getMeasuredWidth() > 0);
            i13 = this.H & 112;
            if (i13 != 48) {
                paddingTop = getPaddingTop() + pcVar.topMargin + this.p;
            } else if (i13 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                if (iMax4 < pcVar.topMargin + this.p) {
                    iMax4 = pcVar.topMargin + this.p;
                } else {
                    i20 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    if (i20 < pcVar.bottomMargin + this.q) {
                        iMax4 = Math.max(0, iMax4 - ((pcVar2.bottomMargin + this.q) - i20));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - pcVar2.bottomMargin) - this.q) - measuredHeight;
            }
            if (z2) {
                if (z3) {
                    i17 = this.n;
                    z5 = true;
                } else {
                    i17 = 0;
                    z5 = false;
                }
                int i27 = i17 - iArr[1];
                iMin -= Math.max(0, i27);
                iArr[1] = Math.max(0, -i27);
                if (zP) {
                    pc pcVar6 = (pc) this.b.getLayoutParams();
                    int measuredWidth2 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                    i18 = measuredWidth2 - this.o;
                    paddingTop = measuredHeight2 + pcVar6.bottomMargin;
                } else {
                    i18 = iMin;
                }
                if (zP2) {
                    pc pcVar7 = (pc) this.c.getLayoutParams();
                    int i28 = paddingTop + pcVar7.topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i28, iMin, this.c.getMeasuredHeight() + i28);
                    i19 = iMin - this.o;
                    int i29 = pcVar7.bottomMargin;
                } else {
                    i19 = iMin;
                }
                if (z5) {
                    iMin = Math.min(i18, i19);
                }
                iMax2 = iMax;
            } else {
                if (z3) {
                    i14 = this.n;
                    z4 = true;
                } else {
                    i14 = 0;
                    z4 = false;
                }
                int i30 = i14 - iArr[0];
                iMax3 = iMax + Math.max(0, i30);
                iArr[0] = Math.max(0, -i30);
                if (zP) {
                    pc pcVar8 = (pc) this.b.getLayoutParams();
                    int measuredWidth3 = this.b.getMeasuredWidth() + iMax3;
                    int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax3, paddingTop, measuredWidth3, measuredHeight3);
                    i15 = measuredWidth3 + this.o;
                    paddingTop = measuredHeight3 + pcVar8.bottomMargin;
                } else {
                    i15 = iMax3;
                }
                if (zP2) {
                    pc pcVar9 = (pc) this.c.getLayoutParams();
                    int i31 = paddingTop + pcVar9.topMargin;
                    int measuredWidth4 = this.c.getMeasuredWidth() + iMax3;
                    this.c.layout(iMax3, i31, measuredWidth4, this.c.getMeasuredHeight() + i31);
                    i16 = measuredWidth4 + this.o;
                    int i32 = pcVar9.bottomMargin;
                } else {
                    i16 = iMax3;
                }
                if (z4) {
                    iMax2 = Math.max(i15, i16);
                } else {
                    iMax2 = iMax3;
                }
            }
            arrayList = this.M;
            J(arrayList, 3);
            size = arrayList.size();
            iG2 = iMax2;
            while (i5 < size) {
                iG2 = G((View) arrayList.get(i5), iG2, iArr, iMin2);
            }
            J(arrayList, 5);
            size2 = arrayList.size();
            while (i6 < size2) {
                iMin = H((View) arrayList.get(i6), iMin, iArr, iMin2);
            }
            J(arrayList, 1);
            int i210 = iArr[0];
            int i211 = iArr[1];
            size3 = arrayList.size();
            i7 = i211;
            i8 = i210;
            i9 = 0;
            measuredWidth = 0;
            while (i9 < size3) {
                View view7 = (View) arrayList.get(i9);
                pc pcVar10 = (pc) view7.getLayoutParams();
                int i212 = pcVar10.leftMargin - i8;
                int i213 = pcVar10.rightMargin - i7;
                int iMax9 = Math.max(0, i212);
                int iMax10 = Math.max(0, i213);
                int iMax11 = Math.max(0, -i212);
                int iMax12 = Math.max(0, -i213);
                measuredWidth += iMax9 + view7.getMeasuredWidth() + iMax10;
                i9++;
                i7 = iMax12;
                i8 = iMax11;
            }
            i10 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (measuredWidth / 2);
            i11 = measuredWidth + i10;
            if (i10 >= iG2) {
                if (i11 > iMin) {
                    iG2 = i10 - (i11 - iMin);
                } else {
                    iG2 = i10;
                }
            }
            size4 = arrayList.size();
            while (i12 < size4) {
                iG2 = G((View) arrayList.get(i12), iG2, iArr, iMin2);
            }
            arrayList.clear();
        }
        iG = paddingLeft;
        iH = i21;
        if (P(this.g)) {
            view4 = this.g;
            if (z6) {
                iH = H(view4, iH, iArr, iMin2);
            } else {
                iG = G(view4, iG, iArr, iMin2);
            }
        }
        if (P(this.a)) {
            view3 = this.a;
            if (z6) {
                iG = G(view3, iG, iArr, iMin2);
            } else {
                iH = H(view3, iH, iArr, iMin2);
            }
        }
        if (getLayoutDirection() == 1) {
            iD = c();
        } else {
            iD = d();
        }
        if (getLayoutDirection() == 1) {
            iC = d();
        } else {
            iC = c();
        }
        z2 = z6;
        iArr[0] = Math.max(0, iD - iG);
        iArr[1] = Math.max(0, iC - (i21 - iH));
        iMax = Math.max(iG, iD);
        iMin = Math.min(iH, i21 - iC);
        if (P(this.h)) {
            view2 = this.h;
            if (z2) {
                iMin = H(view2, iMin, iArr, iMin2);
            } else {
                iMax = G(view2, iMax, iArr, iMin2);
            }
        }
        if (P(this.d)) {
            view = this.d;
            if (z2) {
                iMin = H(view, iMin, iArr, iMin2);
            } else {
                iMax = G(view, iMax, iArr, iMin2);
            }
        }
        zP = P(this.b);
        zP2 = P(this.c);
        if (zP) {
            pc pcVar11 = (pc) this.b.getLayoutParams();
            measuredHeight = pcVar11.bottomMargin + pcVar11.topMargin + this.b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zP2) {
            pc pcVar12 = (pc) this.c.getLayoutParams();
            measuredHeight += pcVar12.topMargin + this.c.getMeasuredHeight() + pcVar12.bottomMargin;
        }
        if (!zP) {
            if (zP2) {
                textView = this.c;
            } else {
                iMax2 = iMax;
                width = width;
            }
            arrayList = this.M;
            J(arrayList, 3);
            size = arrayList.size();
            iG2 = iMax2;
            while (i5 < size) {
                iG2 = G((View) arrayList.get(i5), iG2, iArr, iMin2);
            }
            J(arrayList, 5);
            size2 = arrayList.size();
            while (i6 < size2) {
                iMin = H((View) arrayList.get(i6), iMin, iArr, iMin2);
            }
            J(arrayList, 1);
            int i214 = iArr[0];
            int i215 = iArr[1];
            size3 = arrayList.size();
            i7 = i215;
            i8 = i214;
            i9 = 0;
            measuredWidth = 0;
            while (i9 < size3) {
                View view8 = (View) arrayList.get(i9);
                pc pcVar13 = (pc) view8.getLayoutParams();
                int i216 = pcVar13.leftMargin - i8;
                int i217 = pcVar13.rightMargin - i7;
                int iMax13 = Math.max(0, i216);
                int iMax14 = Math.max(0, i217);
                int iMax15 = Math.max(0, -i216);
                int iMax16 = Math.max(0, -i217);
                measuredWidth += iMax13 + view8.getMeasuredWidth() + iMax14;
                i9++;
                i7 = iMax16;
                i8 = iMax15;
            }
            i10 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (measuredWidth / 2);
            i11 = measuredWidth + i10;
            if (i10 >= iG2) {
                if (i11 > iMin) {
                    iG2 = i10 - (i11 - iMin);
                } else {
                    iG2 = i10;
                }
            }
            size4 = arrayList.size();
            while (i12 < size4) {
                iG2 = G((View) arrayList.get(i12), iG2, iArr, iMin2);
            }
            arrayList.clear();
        }
        textView = this.b;
        if (zP2) {
            textView2 = this.c;
        } else {
            textView2 = this.b;
        }
        pcVar = (pc) textView.getLayoutParams();
        pcVar2 = (pc) textView2.getLayoutParams();
        if (zP) {
        }
        i13 = this.H & 112;
        if (i13 != 48) {
            paddingTop = getPaddingTop() + pcVar.topMargin + this.p;
        } else if (i13 != 80) {
            iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
            if (iMax4 < pcVar.topMargin + this.p) {
                iMax4 = pcVar.topMargin + this.p;
            } else {
                i20 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                if (i20 < pcVar.bottomMargin + this.q) {
                    iMax4 = Math.max(0, iMax4 - ((pcVar2.bottomMargin + this.q) - i20));
                }
            }
            paddingTop = paddingTop2 + iMax4;
        } else {
            paddingTop = (((height - paddingBottom) - pcVar2.bottomMargin) - this.q) - measuredHeight;
        }
        if (z2) {
            if (z3) {
                i17 = this.n;
                z5 = true;
            } else {
                i17 = 0;
                z5 = false;
            }
            int i218 = i17 - iArr[1];
            iMin -= Math.max(0, i218);
            iArr[1] = Math.max(0, -i218);
            if (zP) {
                pc pcVar14 = (pc) this.b.getLayoutParams();
                int measuredWidth5 = iMin - this.b.getMeasuredWidth();
                int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                this.b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                i18 = measuredWidth5 - this.o;
                paddingTop = measuredHeight4 + pcVar14.bottomMargin;
            } else {
                i18 = iMin;
            }
            if (zP2) {
                pc pcVar15 = (pc) this.c.getLayoutParams();
                int i219 = paddingTop + pcVar15.topMargin;
                this.c.layout(iMin - this.c.getMeasuredWidth(), i219, iMin, this.c.getMeasuredHeight() + i219);
                i19 = iMin - this.o;
                int i220 = pcVar15.bottomMargin;
            } else {
                i19 = iMin;
            }
            if (z5) {
                iMin = Math.min(i18, i19);
            }
            iMax2 = iMax;
        } else {
            if (z3) {
                i14 = this.n;
                z4 = true;
            } else {
                i14 = 0;
                z4 = false;
            }
            int i33 = i14 - iArr[0];
            iMax3 = iMax + Math.max(0, i33);
            iArr[0] = Math.max(0, -i33);
            if (zP) {
                pc pcVar16 = (pc) this.b.getLayoutParams();
                int measuredWidth6 = this.b.getMeasuredWidth() + iMax3;
                int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                this.b.layout(iMax3, paddingTop, measuredWidth6, measuredHeight5);
                i15 = measuredWidth6 + this.o;
                paddingTop = measuredHeight5 + pcVar16.bottomMargin;
            } else {
                i15 = iMax3;
            }
            if (zP2) {
                pc pcVar17 = (pc) this.c.getLayoutParams();
                int i34 = paddingTop + pcVar17.topMargin;
                int measuredWidth7 = this.c.getMeasuredWidth() + iMax3;
                this.c.layout(iMax3, i34, measuredWidth7, this.c.getMeasuredHeight() + i34);
                i16 = measuredWidth7 + this.o;
                int i35 = pcVar17.bottomMargin;
            } else {
                i16 = iMax3;
            }
            if (z4) {
                iMax2 = Math.max(i15, i16);
            } else {
                iMax2 = iMax3;
            }
        }
        arrayList = this.M;
        J(arrayList, 3);
        size = arrayList.size();
        iG2 = iMax2;
        while (i5 < size) {
            iG2 = G((View) arrayList.get(i5), iG2, iArr, iMin2);
        }
        J(arrayList, 5);
        size2 = arrayList.size();
        while (i6 < size2) {
            iMin = H((View) arrayList.get(i6), iMin, iArr, iMin2);
        }
        J(arrayList, 1);
        int i2110 = iArr[0];
        int i2111 = iArr[1];
        size3 = arrayList.size();
        i7 = i2111;
        i8 = i2110;
        i9 = 0;
        measuredWidth = 0;
        while (i9 < size3) {
            View view9 = (View) arrayList.get(i9);
            pc pcVar18 = (pc) view9.getLayoutParams();
            int i2112 = pcVar18.leftMargin - i8;
            int i2113 = pcVar18.rightMargin - i7;
            int iMax17 = Math.max(0, i2112);
            int iMax18 = Math.max(0, i2113);
            int iMax19 = Math.max(0, -i2112);
            int iMax110 = Math.max(0, -i2113);
            measuredWidth += iMax17 + view9.getMeasuredWidth() + iMax18;
            i9++;
            i7 = iMax110;
            i8 = iMax19;
        }
        i10 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (measuredWidth / 2);
        i11 = measuredWidth + i10;
        if (i10 >= iG2) {
            if (i11 > iMin) {
                iG2 = i10 - (i11 - iMin);
            } else {
                iG2 = i10;
            }
        }
        size4 = arrayList.size();
        while (i12 < size4) {
            iG2 = G((View) arrayList.get(i12), iG2, iArr, iMin2);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        Toolbar toolbar;
        int i3;
        int i4;
        int marginStart;
        int iMax;
        int iCombineMeasuredStates;
        int marginStart2;
        int i5;
        int layoutDirection = getLayoutDirection();
        int iMax2 = 0;
        if (P(this.C)) {
            toolbar = this;
            i3 = i;
            i4 = i2;
            toolbar.Q(this.C, i3, 0, i4, this.D);
            int measuredWidth = toolbar.C.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.C.getLayoutParams();
            marginStart = measuredWidth + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            int measuredHeight = toolbar.C.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) toolbar.C.getLayoutParams();
            iMax = Math.max(0, measuredHeight + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            iCombineMeasuredStates = View.combineMeasuredStates(0, toolbar.C.getMeasuredState());
        } else {
            toolbar = this;
            i3 = i;
            i4 = i2;
            marginStart = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (toolbar.P(toolbar.g)) {
            toolbar.Q(toolbar.g, i3, 0, i4, toolbar.D);
            int measuredWidth2 = toolbar.g.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) toolbar.g.getLayoutParams();
            marginStart = measuredWidth2 + marginLayoutParams3.getMarginStart() + marginLayoutParams3.getMarginEnd();
            int measuredHeight2 = toolbar.g.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) toolbar.g.getLayoutParams();
            iMax = Math.max(iMax, measuredHeight2 + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, toolbar.g.getMeasuredState());
        }
        int[] iArr = toolbar.N;
        char c = layoutDirection == 1 ? (char) 1 : (char) 0;
        int iD = toolbar.d();
        int iMax3 = Math.max(iD, marginStart);
        iArr[c] = Math.max(0, iD - marginStart);
        if (toolbar.P(toolbar.a)) {
            toolbar.Q(toolbar.a, i3, iMax3, i4, toolbar.D);
            int measuredWidth3 = toolbar.a.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) toolbar.a.getLayoutParams();
            marginStart2 = measuredWidth3 + marginLayoutParams5.getMarginStart() + marginLayoutParams5.getMarginEnd();
            int measuredHeight3 = toolbar.a.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) toolbar.a.getLayoutParams();
            iMax = Math.max(iMax, measuredHeight3 + marginLayoutParams6.topMargin + marginLayoutParams6.bottomMargin);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, toolbar.a.getMeasuredState());
        } else {
            marginStart2 = 0;
        }
        int iC = toolbar.c();
        int iMax4 = iMax3 + Math.max(iC, marginStart2);
        iArr[c ^ 1] = Math.max(0, iC - marginStart2);
        if (toolbar.P(toolbar.h)) {
            iMax4 += toolbar.I(toolbar.h, i3, iMax4, i4, 0, iArr);
            int measuredHeight4 = toolbar.h.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) toolbar.h.getLayoutParams();
            iMax = Math.max(iMax, measuredHeight4 + marginLayoutParams7.topMargin + marginLayoutParams7.bottomMargin);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, toolbar.h.getMeasuredState());
        }
        if (toolbar.P(toolbar.d)) {
            iMax4 += toolbar.I(toolbar.d, i3, iMax4, i4, 0, iArr);
            int measuredHeight5 = toolbar.d.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) toolbar.d.getLayoutParams();
            iMax = Math.max(iMax, measuredHeight5 + marginLayoutParams8.topMargin + marginLayoutParams8.bottomMargin);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, toolbar.d.getMeasuredState());
        }
        int childCount = toolbar.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = toolbar.getChildAt(i6);
            if (((pc) childAt.getLayoutParams()).b == 0 && toolbar.P(childAt)) {
                iMax4 += toolbar.I(childAt, i3, iMax4, i4, 0, iArr);
                int measuredHeight6 = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                iMax = Math.max(iMax, measuredHeight6 + marginLayoutParams9.topMargin + marginLayoutParams9.bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            } else {
                iMax4 = iMax4;
            }
        }
        int i7 = iMax4;
        int i8 = toolbar.p + toolbar.q;
        int i9 = toolbar.n + toolbar.o;
        if (toolbar.P(toolbar.b)) {
            toolbar.I(toolbar.b, i3, i7 + i9, i4, i8, iArr);
            int measuredWidth4 = toolbar.b.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) toolbar.b.getLayoutParams();
            iMax2 = measuredWidth4 + marginLayoutParams10.getMarginStart() + marginLayoutParams10.getMarginEnd();
            int measuredHeight7 = toolbar.b.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) toolbar.b.getLayoutParams();
            i5 = measuredHeight7 + marginLayoutParams11.topMargin + marginLayoutParams11.bottomMargin;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, toolbar.b.getMeasuredState());
        } else {
            i5 = 0;
        }
        if (toolbar.P(toolbar.c)) {
            iMax2 = Math.max(iMax2, toolbar.I(toolbar.c, i3, i7 + i9, i4, i5 + i8, iArr));
            int measuredHeight8 = toolbar.c.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) toolbar.c.getLayoutParams();
            i5 += measuredHeight8 + marginLayoutParams12.topMargin + marginLayoutParams12.bottomMargin;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, toolbar.c.getMeasuredState());
        }
        if (toolbar.P(toolbar.b) || toolbar.P(toolbar.c)) {
            i5 += i8;
        }
        toolbar.setMeasuredDimension(View.resolveSizeAndState(Math.max(i7 + iMax2 + toolbar.getPaddingLeft() + toolbar.getPaddingRight(), toolbar.getSuggestedMinimumWidth()), i3, (-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(Math.max(iMax, i5) + toolbar.getPaddingTop() + toolbar.getPaddingBottom(), toolbar.getSuggestedMinimumHeight()), i4, iCombineMeasuredStates << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof pe)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pe peVar = (pe) parcelable;
        super.onRestoreInstanceState(peVar.d);
        ActionMenuView actionMenuView = this.a;
        iq iqVar = actionMenuView != null ? actionMenuView.a : null;
        int i = peVar.a;
        if (i != 0 && this.y != null && iqVar != null && (menuItemFindItem = iqVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (peVar.b) {
            Runnable runnable = this.R;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        int i2;
        super.onRtlPropertiesChanged(i);
        L();
        ol olVar = this.E;
        boolean z = olVar.g;
        boolean z2 = i == 1;
        if (z2 != z) {
            olVar.g = z2;
            if (!olVar.h) {
                olVar.a = olVar.e;
                olVar.b = olVar.f;
                return;
            }
            if (z2) {
                int i3 = olVar.d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = olVar.e;
                }
                olVar.a = i3;
                i2 = olVar.c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = olVar.f;
                }
            } else {
                int i4 = olVar.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = olVar.e;
                }
                olVar.a = i4;
                i2 = olVar.d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = olVar.f;
                }
            }
            olVar.b = i2;
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        is isVar;
        pe peVar = new pe(super.onSaveInstanceState());
        pb pbVar = this.y;
        if (pbVar != null && (isVar = pbVar.b) != null) {
            peVar.a = isVar.a;
        }
        peVar.b = y();
        return peVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
            actionMasked = 0;
        }
        if (!this.K) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public final void p(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            N();
        }
        ImageButton imageButton = this.C;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.C.setTooltipText(charSequence);
        }
    }

    public final void q(int i) {
        r(ok.e().c(getContext(), i));
    }

    public void r(Drawable drawable) {
        if (drawable != null) {
            N();
            if (!O(this.C)) {
                K(this.C, true);
            }
        } else {
            ImageButton imageButton = this.C;
            if (imageButton != null && O(imageButton)) {
                removeView(this.C);
                this.t.remove(this.C);
            }
        }
        ImageButton imageButton2 = this.C;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    @Override // defpackage.ayn
    public final void removeMenuProvider(ayr ayrVar) {
        this.u.d(ayrVar);
    }

    public final void s(View.OnClickListener onClickListener) {
        N();
        this.C.setOnClickListener(onClickListener);
    }

    public final void t(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void u(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.c;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!O(this.c)) {
                K(this.c, true);
            }
        } else if (textView != null && O(textView)) {
            removeView(this.c);
            this.t.remove(this.c);
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.s = charSequence;
    }

    public final void v(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.b;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!O(this.b)) {
                K(this.b, true);
            }
        } else if (textView != null && O(textView)) {
            removeView(this.b);
            this.t.remove(this.b);
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.r = charSequence;
    }

    public final void w() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            byte[] bArr = null;
            if (!x() || onBackInvokedDispatcherFindOnBackInvokedDispatcher == null || !isAttachedToWindow() || !this.B) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.Q;
                if (onBackInvokedDispatcher != null) {
                    onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.P);
                    this.Q = null;
                    return;
                }
                return;
            }
            if (this.Q == null) {
                if (this.P == null) {
                    this.P = new pa(new mc(this, 7, bArr), 0);
                }
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.P);
                this.Q = onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            }
        }
    }

    public final boolean x() {
        pb pbVar = this.y;
        return (pbVar == null || pbVar.b == null) ? false : true;
    }

    public final boolean y() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.m();
    }

    public final boolean z() {
        jx jxVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (jxVar = actionMenuView.c) == null || !jxVar.m()) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return B(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
