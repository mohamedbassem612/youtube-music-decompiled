package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class accs extends ViewGroup {
    public final List a;
    public final acct b;
    public int c;
    public float d;
    public Typeface e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    private final Resources k;
    private final List l;
    private final List m;
    private final List n;
    private final List o;
    private acci p;
    private boolean q;

    public accs(Context context) {
        super(context);
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.a = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.e = null;
        this.p = null;
        this.q = false;
        Resources resources = context.getResources();
        this.k = resources;
        int dimension = (int) resources.getDimension(R.dimen.subtitle_window_padding);
        acct acctVar = new acct(context);
        acctVar.setPadding(dimension, dimension, dimension, dimension);
        this.b = acctVar;
    }

    private final int d() {
        acby acbyVar;
        acci acciVar = this.p;
        if (acciVar != null && (acbyVar = acciVar.c.g) != null) {
            Integer num = acbyVar.a;
            if (num != null) {
                return num.intValue();
            }
            Integer num2 = acbyVar.b;
            if (num2 != null) {
                return avv.f(this.h, num2.intValue());
            }
        }
        return this.h;
    }

    private static final void e(List list, CharSequence charSequence) {
        String string = charSequence.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int i = 0;
        while (i < spannableStringBuilder.length()) {
            int iIndexOf = string.substring(i).indexOf("\n");
            int length = iIndexOf == -1 ? spannableStringBuilder.length() : iIndexOf + i;
            list.add(spannableStringBuilder.subSequence(i, length));
            i = length + 1;
        }
    }

    private static final int f(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        if (i4 == 3) {
            i5 = i2 - i3;
        } else {
            i5 = i4 == 2 ? ((int) (((double) ((i2 - i) - i3)) / 2.0d)) + i : i;
        }
        return !z ? i5 : i;
    }

    public final void a(boolean z) {
        if (this.q != z) {
            this.q = z;
            this.b.e(z);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((acct) it.next()).e(z);
            }
        }
    }

    public final void b(acci acciVar) {
        this.p = acciVar;
        List list = this.m;
        list.clear();
        List list2 = this.l;
        list2.clear();
        this.n.clear();
        this.o.clear();
        boolean z = acciVar.f;
        e(list, acciVar.d);
        e(list2, acciVar.e);
        c();
        requestLayout();
    }

    public final void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((acct) it.next()).setBackgroundColor(d());
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        acci acciVar;
        int i6;
        Pair pair;
        float f;
        Pair pairCreate;
        Pair pairCreate2;
        acby acbyVar;
        accs accsVar = this;
        List list = accsVar.o;
        if (list.isEmpty()) {
            return;
        }
        List list2 = accsVar.n;
        if (list2.isEmpty()) {
            return;
        }
        int paddingLeft = accsVar.getPaddingLeft();
        int paddingRight = (i3 - i) - accsVar.getPaddingRight();
        int paddingTop = accsVar.getPaddingTop();
        acci acciVar2 = accsVar.p;
        Pair pair2 = null;
        if (acciVar2 != null) {
            i5 = acciVar2.c.b;
            acciVar = acciVar2;
        } else {
            i5 = 34;
            acciVar = null;
        }
        if (acciVar == null || (acbyVar = acciVar.c.g) == null || (i6 = acbyVar.c) == 0) {
            if ((i5 & 4) != 0) {
                i6 = 3;
            } else {
                i6 = 2;
                if ((i5 & 2) == 0) {
                    i6 = 1;
                }
            }
        }
        int i7 = 0;
        while (true) {
            List list3 = accsVar.l;
            if (i7 >= list3.size()) {
                return;
            }
            List list4 = accsVar.a;
            acct acctVar = (acct) list4.get(i7);
            int iIntValue = ((Integer) list2.get(i7)).intValue();
            int iIntValue2 = ((Integer) list.get(i7)).intValue();
            boolean z2 = acciVar2 != null && acciVar2.c.f;
            int iF = f(paddingLeft, paddingRight, iIntValue, i6, z2);
            if (accsVar.i) {
                if (i7 == 0) {
                    acctVar.f = pair2;
                    list = list;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    acct acctVar2 = (acct) list4.get(i7 - 1);
                    int left = iF - acctVar2.getLeft();
                    StaticLayout staticLayoutA = acctVar2.a();
                    if (staticLayoutA == null) {
                        Float fValueOf = Float.valueOf(0.0f);
                        pairCreate = Pair.create(fValueOf, fValueOf);
                    } else {
                        int lineCount = staticLayoutA.getLineCount() - 1;
                        pairCreate = Pair.create(Float.valueOf(staticLayoutA.getLineLeft(lineCount)), Float.valueOf(staticLayoutA.getLineRight(lineCount)));
                    }
                    float f2 = left;
                    acctVar.f = Pair.create(Float.valueOf(((Float) pairCreate.first).floatValue() - f2), Float.valueOf(((Float) pairCreate.second).floatValue() - f2));
                }
                if (i7 >= list3.size() - 1) {
                    pair = null;
                    acctVar.g = null;
                } else {
                    pair = null;
                    int i8 = i7 + 1;
                    acct acctVar3 = (acct) list4.get(i8);
                    int iF2 = iF - f(paddingLeft, paddingRight, ((Integer) list2.get(i8)).intValue(), i6, z2);
                    StaticLayout staticLayoutA2 = acctVar3.a();
                    if (staticLayoutA2 == null) {
                        Float fValueOf2 = Float.valueOf(f);
                        pairCreate2 = Pair.create(fValueOf2, fValueOf2);
                    } else {
                        pairCreate2 = Pair.create(Float.valueOf(staticLayoutA2.getLineLeft(0)), Float.valueOf(staticLayoutA2.getLineRight(0)));
                    }
                    float f3 = iF2;
                    acctVar.g = Pair.create(Float.valueOf(((Float) pairCreate2.first).floatValue() - f3), Float.valueOf(((Float) pairCreate2.second).floatValue() - f3));
                }
            } else {
                list = list;
                pair = pair2;
            }
            acctVar.layout(iF, paddingTop, acctVar.getMeasuredWidth() + iF, acctVar.getMeasuredHeight() + paddingTop);
            paddingTop += iIntValue2;
            i7++;
            list = list;
            pair2 = pair;
            accsVar = this;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        List<CharSequence> list;
        acci acciVar;
        acby acbyVar;
        acct acctVar;
        acby acbyVar2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = size2 - (getPaddingTop() + getPaddingBottom());
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - paddingLeft, Integer.MIN_VALUE);
        int iMax = 0;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 0);
        int i3 = 0;
        while (true) {
            list = this.l;
            if (i3 >= list.size()) {
                break;
            }
            List list2 = this.a;
            if (i3 < list2.size()) {
                acctVar = (acct) list2.get(i3);
            } else {
                acct acctVar2 = new acct(getContext());
                acctVar2.g(this.c);
                acctVar2.h(this.d);
                acctVar2.i(this.e);
                acctVar2.c(this.f);
                acctVar2.d(this.g);
                acctVar2.e(this.q);
                acctVar2.setBackgroundColor(d());
                acctVar2.b = null;
                acctVar2.a = null;
                acctVar2.requestLayout();
                acctVar2.d = this.i;
                acctVar2.e = this.j;
                int dimension = (int) this.k.getDimension(R.dimen.subtitle_window_padding);
                acctVar2.setPadding(dimension, dimension, dimension, dimension);
                addView(acctVar2);
                list2.add(acctVar2);
                acctVar = acctVar2;
            }
            acci acciVar2 = this.p;
            if (acciVar2 != null) {
                int i4 = acciVar2.c.b;
            }
            if (this.j && acciVar2 != null && (acbyVar2 = acciVar2.c.g) != null && acbyVar2.c != 0) {
                acctVar.c = Layout.Alignment.ALIGN_NORMAL;
            }
            List list3 = this.m;
            if (i3 < list3.size()) {
                acctVar.setVisibility(0);
                acctVar.f((CharSequence) list3.get(i3));
                acctVar.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                acctVar.b();
            }
            i3++;
        }
        int size3 = list.size();
        while (true) {
            List list4 = this.a;
            if (size3 >= list4.size()) {
                break;
            }
            ((acct) list4.get(size3)).b();
            size3++;
        }
        List list5 = this.n;
        list5.clear();
        List list6 = this.o;
        list6.clear();
        if (this.j && (acciVar = this.p) != null && (acbyVar = acciVar.c.g) != null && acbyVar.c != 0) {
            this.b.c = Layout.Alignment.ALIGN_NORMAL;
        }
        int i5 = 0;
        for (CharSequence charSequence : list) {
            acct acctVar3 = this.b;
            acctVar3.f(charSequence);
            acctVar3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = acctVar3.getMeasuredWidth();
            int measuredHeight = acctVar3.getMeasuredHeight();
            list5.add(Integer.valueOf(measuredWidth));
            list6.add(Integer.valueOf(measuredHeight));
            i5 += measuredHeight;
            iMax = Math.max(measuredWidth, iMax);
        }
        int paddingLeft2 = iMax + getPaddingLeft() + getPaddingRight();
        int paddingTop2 = i5 + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, paddingLeft2);
        } else if (mode == 1073741824) {
            mode = 1073741824;
        } else {
            size = paddingLeft2;
        }
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingTop2);
        } else if (mode != 1073741824) {
            size2 = paddingTop2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (i == 0) {
            super.setBackgroundColor(0);
            return;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) this.k.getDrawable(R.drawable.subtitle_window).mutate();
        gradientDrawable.setColor(i);
        setBackground(gradientDrawable);
    }
}
