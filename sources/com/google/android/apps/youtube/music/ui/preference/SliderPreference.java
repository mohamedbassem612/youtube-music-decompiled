package com.google.android.apps.youtube.music.ui.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.slider.Slider;
import defpackage.avkz;
import defpackage.awro;
import defpackage.dlj;
import defpackage.qcb;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class SliderPreference extends Preference {
    public int a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Object e;
    public qcb f;

    public SliderPreference(Context context, AttributeSet attributeSet, byte[] bArr) {
        super(context, attributeSet, 0, 0);
        this.C = R.layout.slider_preference_view;
    }

    @Override // androidx.preference.Preference
    public final void a(dlj dljVar) {
        int i;
        dljVar.getClass();
        super.a(dljVar);
        View viewC = dljVar.C(R.id.slider);
        Slider slider = viewC instanceof Slider ? (Slider) viewC : null;
        Integer num = this.b;
        Integer num2 = this.c;
        Integer num3 = this.d;
        if (slider == null || num == null || num2 == null || num3 == null) {
            return;
        }
        List list = slider.e;
        list.clear();
        List list2 = slider.f;
        list2.clear();
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        num3.intValue();
        float fMin = slider.h;
        float fMax = slider.i;
        float fQ = slider.q();
        float fH = awro.h(this.a, iIntValue, iIntValue2);
        slider.e(0.0f);
        float f = iIntValue;
        int i2 = 0;
        float[] fArr = {fH, f, fQ};
        int i3 = 0;
        while (true) {
            i = i2;
            if (i3 >= 3) {
                break;
            }
            fMin = Math.min(fMin, fArr[i3]);
            i3++;
            i2 = i;
        }
        slider.f(fMin);
        float f2 = iIntValue2;
        float[] fArr2 = new float[3];
        fArr2[i] = fH;
        fArr2[1] = f2;
        fArr2[2] = fQ;
        while (i2 < 3) {
            fMax = Math.max(fMax, fArr2[i2]);
            i2++;
        }
        slider.g(fMax);
        slider.r(fH);
        slider.f(f);
        slider.g(f2);
        slider.e(1.0f);
        list.add(this);
        list2.add(this);
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        typedArray.getClass();
        Integer numValueOf = Integer.valueOf(typedArray.getInt(i, 0));
        this.e = numValueOf;
        return numValueOf;
    }

    public final /* bridge */ /* synthetic */ void k(Object obj, float f, boolean z) {
        Slider slider = (Slider) obj;
        if (z) {
            int iH = avkz.h(f);
            qcb qcbVar = this.f;
            if (qcbVar != null) {
                ViewParent parent = slider.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                TextView textView = viewGroup != null ? (TextView) viewGroup.findViewById(android.R.id.summary) : null;
                if (textView != null) {
                    textView.setText(qcbVar.q(iH));
                }
            }
        }
    }

    public final void l(int i) {
        Integer num = this.b;
        Integer num2 = this.c;
        Integer num3 = this.d;
        if (num == null || num2 == null || num3 == null) {
            this.a = i;
            return;
        }
        long jH = awro.h(i, num.intValue(), num2.intValue());
        long jIntValue = num.intValue();
        num3.intValue();
        num3.intValue();
        num3.intValue();
        int iJ = (int) awro.j(((long) num.intValue()) + (jH - jIntValue), num.intValue(), num2.intValue());
        if (iJ != this.a) {
            this.a = iJ;
            qcb qcbVar = this.f;
            if (qcbVar != null) {
                n(qcbVar.q(iJ));
            }
            d();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
        context.getClass();
    }
}
