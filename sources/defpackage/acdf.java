package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class acdf extends ViewGroup implements acdg {
    protected final SparseArray a;
    public final SparseArray b;
    public boolean c;
    public Optional d;
    private float e;
    private float f;
    private int g;
    private int h;
    private double i;
    private double j;
    private accp k;
    private final Optional l;
    private double m;
    private double n;

    public acdf(Context context) {
        super(context);
        this.c = false;
        this.g = 0;
        this.h = 0;
        this.i = 1.0d;
        this.j = 1.0d;
        this.m = 0.0d;
        this.n = 0.0d;
        this.a = new SparseArray();
        this.b = new SparseArray();
        this.e = 1.0f;
        this.f = context.getResources().getDimensionPixelSize(R.dimen.medium_font_size);
        this.l = Optional.empty();
        this.d = Optional.empty();
        this.k = new accp(aawb.g(), aawb.j(), aawb.h(), aawb.f(), aawb.i(), accx.values()[3].i);
        setVisibility(4);
    }

    private final void n() {
        setTranslationX((float) (this.m * ((double) this.h)));
        setTranslationY((float) (this.n * ((double) this.g)));
    }

    private final void o(accs accsVar) {
        Typeface typeface;
        float f = this.f;
        if (Math.abs(accsVar.d - f) >= 0.01f) {
            accsVar.d = f;
            accsVar.b.h(f);
            Iterator it = accsVar.a.iterator();
            while (it.hasNext()) {
                ((acct) it.next()).h(f);
            }
        }
        int i = this.k.a;
        if (accsVar.h != i) {
            accsVar.h = i;
            accsVar.c();
        }
        accsVar.setBackgroundColor(this.k.b);
        int i2 = this.k.e;
        if (accsVar.c != i2) {
            accsVar.c = i2;
            Iterator it2 = accsVar.a.iterator();
            while (it2.hasNext()) {
                ((acct) it2.next()).g(i2);
            }
            accsVar.invalidate();
        }
        Context context = getContext();
        int i3 = this.k.f;
        accx accxVar = accx.a;
        if (i3 != 7) {
            accx[] accxVarArrValues = accx.values();
            int i4 = 0;
            while (true) {
                if (i4 >= accxVarArrValues.length) {
                    typeface = null;
                    break;
                }
                accx accxVar2 = accxVarArrValues[i4];
                if (accxVar2.i == i3) {
                    if (accxVar2.k == null) {
                        accxVar2.k = accxVar2.j.a(context);
                    }
                    typeface = accxVarArrValues[i4].k;
                    break;
                }
                i4++;
            }
        } else {
            typeface = ((CaptioningManager) context.getSystemService("captioning")).getUserStyle().getTypeface();
        }
        if (!Objects.equals(accsVar.e, typeface)) {
            accsVar.e = typeface;
            accsVar.b.i(typeface);
            Iterator it3 = accsVar.a.iterator();
            while (it3.hasNext()) {
                ((acct) it3.next()).i(typeface);
            }
            accsVar.invalidate();
            accsVar.requestLayout();
        }
        int i5 = this.k.c;
        if (accsVar.f != i5) {
            accsVar.f = i5;
            Iterator it4 = accsVar.a.iterator();
            while (it4.hasNext()) {
                ((acct) it4.next()).c(i5);
            }
            accsVar.invalidate();
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.subtitles_overlay_padding);
        accsVar.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        int i6 = this.k.d;
        if (accsVar.g != i6) {
            accsVar.g = i6;
            accsVar.b.d(i6);
            Iterator it5 = accsVar.a.iterator();
            while (it5.hasNext()) {
                ((acct) it5.next()).d(i6);
            }
            accsVar.invalidate();
            accsVar.requestLayout();
        }
        accsVar.a(this.c);
    }

    private final void p(int i, int i2) {
        float f = this.e;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        float fMin = Math.min(i, i2);
        float fFloatValue = i < i2 ? ((Float) this.l.orElse(Float.valueOf(0.055555556f))).floatValue() * (fMin / displayMetrics.scaledDensity) : 0.0625f * (fMin / displayMetrics.scaledDensity);
        if (fFloatValue < 13.0f) {
            fFloatValue = 13.0f;
        }
        this.f = fFloatValue * f;
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i3 >= sparseArray.size()) {
                return;
            }
            o((accs) sparseArray.valueAt(i3));
            i3++;
        }
    }

    @Override // defpackage.acdg
    public ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    protected final int c(int i) {
        return (i * (100 - ((Integer) this.d.orElse(15)).intValue())) / 100;
    }

    protected final int d(int i) {
        return ((i * ((Integer) this.d.orElse(15)).intValue()) / 100) / 2;
    }

    protected accs e(Object obj, acci acciVar) {
        accs accsVar = new accs(getContext());
        o(accsVar);
        accsVar.setTag(obj);
        accsVar.b(acciVar);
        return accsVar;
    }

    public void f() {
        removeAllViews();
        this.a.clear();
        this.b.clear();
    }

    public final void g(float f) {
        this.e = f;
        p(getWidth(), getHeight());
    }

    public final void h(double d) {
        this.j = d;
        requestLayout();
    }

    public final void i(double d) {
        this.i = d;
        requestLayout();
    }

    public final void j(double d) {
        this.m = d;
        n();
    }

    public final void k(double d) {
        this.n = d;
        n();
    }

    public void l(accp accpVar) {
        this.k = accpVar;
        p(getWidth(), getHeight());
    }

    public void m(List list) {
        SparseArray sparseArray;
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            sparseArray = this.a;
            if (i >= sparseArray.size()) {
                break;
            }
            hashSet.add(Integer.valueOf(sparseArray.keyAt(i)));
            i++;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            acci acciVar = (acci) list.get(i2);
            int i3 = acciVar.a;
            hashSet.remove(Integer.valueOf(i3));
            SparseArray sparseArray2 = this.b;
            accs accsVar = (accs) sparseArray2.get(i3);
            CharSequence charSequence = acciVar.d;
            if (!TextUtils.isEmpty(charSequence) && acciVar.c.e) {
                sparseArray.put(i3, acciVar);
                if (accsVar == null) {
                    accs accsVarE = e(charSequence, acciVar);
                    addView(accsVarE);
                    sparseArray2.put(i3, accsVarE);
                } else {
                    if (!charSequence.equals(accsVar.getTag())) {
                        accsVar.setTag(charSequence);
                        accsVar.b(acciVar);
                    }
                    accsVar.setVisibility(0);
                }
            } else if (accsVar != null) {
                accsVar.setVisibility(8);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            SparseArray sparseArray3 = this.b;
            removeView((View) sparseArray3.get(iIntValue));
            sparseArray.remove(iIntValue);
            sparseArray3.remove(iIntValue);
        }
        setVisibility(0);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int iD = d(i6);
        int i7 = i4 - i2;
        int iD2 = d(i7);
        n();
        int iC = c(i6);
        int iC2 = c(i7);
        int i8 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i8 >= sparseArray.size()) {
                return;
            }
            accs accsVar = (accs) this.b.get(sparseArray.keyAt(i8));
            if (accsVar.getVisibility() == 0) {
                acci acciVar = (acci) sparseArray.valueAt(i8);
                int measuredWidth = accsVar.getMeasuredWidth();
                int measuredHeight = accsVar.getMeasuredHeight();
                accf accfVar = acciVar.c;
                int i9 = accfVar.b;
                int i10 = accfVar.c * iC;
                if (accfVar.f) {
                    i5 = 0;
                } else {
                    i5 = i10 / 100;
                    if ((i9 & 1) == 0) {
                        if ((i9 & 2) != 0) {
                            i5 -= measuredWidth / 2;
                        } else if ((i9 & 4) != 0) {
                            i5 -= measuredWidth;
                        } else {
                            i5 = 0;
                        }
                    }
                }
                int i11 = i5 + iD;
                int i12 = i9 & 8;
                int i13 = (accfVar.d * iC2) / 100;
                if (i12 == 0) {
                    if ((i9 & 16) != 0) {
                        i13 -= measuredHeight / 2;
                    } else {
                        i13 = (i9 & 32) != 0 ? i13 - measuredHeight : 0;
                    }
                }
                int i14 = i13 + iD2;
                accsVar.layout(i11, i14, measuredWidth + i11, measuredHeight + i14);
            }
            i8++;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        this.g = View.MeasureSpec.getSize(i2);
        int size = View.MeasureSpec.getSize(i);
        this.h = size;
        int i3 = (int) (((double) size) * this.i);
        int i4 = (int) (((double) this.g) * this.j);
        setMeasuredDimension(i3, i4);
        p(i3, i4);
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i5 >= sparseArray.size()) {
                return;
            }
            accs accsVar = (accs) this.b.get(sparseArray.keyAt(i5));
            if (accsVar.getVisibility() == 0) {
                accf accfVar = ((acci) sparseArray.valueAt(i5)).c;
                int i6 = accfVar.b;
                int i7 = accfVar.c * i3;
                int i8 = accfVar.d * i4;
                int iMin = i7 / 100;
                if ((i6 & 1) != 0) {
                    iMin = i3 - iMin;
                } else if ((i6 & 2) != 0) {
                    iMin = Math.min(iMin, i3 - iMin) << 1;
                } else if ((i6 & 4) == 0) {
                    iMin = 0;
                }
                int iMin2 = i8 / 100;
                if ((i6 & 8) != 0) {
                    iMin2 = i4 - iMin2;
                } else if ((i6 & 16) != 0) {
                    iMin2 = Math.min(iMin2, i4 - iMin2) << 1;
                } else if ((i6 & 32) == 0) {
                    iMin2 = 0;
                }
                accsVar.measure(View.MeasureSpec.makeMeasureSpec(iMin, 0), View.MeasureSpec.makeMeasureSpec(iMin2, 0));
            }
            i5++;
        }
    }

    @Override // defpackage.acdg
    public final View jM() {
        return this;
    }
}
