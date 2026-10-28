package com.google.android.libraries.youtube.creation.effects.deprecated.picker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.music.R;
import defpackage.agrc;
import defpackage.ahno;
import defpackage.csd;
import defpackage.pr;
import defpackage.uxp;
import defpackage.uxu;
import defpackage.uxv;
import defpackage.uxw;
import defpackage.uxx;
import defpackage.uxz;
import defpackage.uzl;
import defpackage.zf;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ChooseFilterView extends LinearLayout {
    public final uxx a;
    public ValueAnimator b;
    public final zf c;
    private boolean d;

    public ChooseFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        LayoutInflater.from(context).inflate(R.layout.choose_asset_view, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uxz.a, 0, 0);
        int i = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i2 = i != 1 ? i != 2 ? i != 3 ? R.layout.choose_filter_list_item : R.layout.choose_filter_list_item_shorts_camera_preset : R.layout.choose_filter_list_item_camera_preset : R.layout.choose_filter_list_item_camera;
        this.c = new zf((Object) this);
        this.a = new uxx(getContext(), i2);
        setImportantForAccessibility(1);
        setAlpha(0.0f);
    }

    public final ValueAnimator a(int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addUpdateListener(new pr(this, 16, null));
        if (i2 == 1) {
            valueAnimatorOfInt.addListener(new uxu(this));
        } else {
            valueAnimatorOfInt.addListener(new uxv(this));
        }
        return valueAnimatorOfInt;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        List list = this.a.e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((uzl) it.next()).a();
        }
        list.clear();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            uxx uxxVar = this.a;
            String strZ = ahno.Z(bundle.getString("SELECTED_FILTER"));
            if (uxxVar.c(strZ)) {
                uxxVar.notifyChanged();
            } else {
                uxxVar.c = true != uxxVar.c(strZ) ? strZ : "NORMAL";
                if (uxxVar.b()) {
                    uxp uxpVarA = uxp.a(uxxVar.d, uxxVar.c);
                    if (uxpVarA == null) {
                        ((agrc) ((agrc) uxx.a.b()).k("com/google/android/libraries/youtube/creation/effects/deprecated/picker/FilterList", "setSelectedEffectPreviewed", 870, "FilterList.java")).w("setSelectedEffectPreviewed Filter not found: %s", uxxVar.c);
                    } else if (!uxpVarA.d() && uxpVarA.c.a != 2) {
                        ((agrc) ((agrc) uxx.a.b()).k("com/google/android/libraries/youtube/creation/effects/deprecated/picker/FilterList", "setSelectedEffectPreviewed", 882, "FilterList.java")).w("FilterList.setSelectedEffectPreviewed failed to set effect previewed: %s", uxxVar.c);
                    }
                    uxxVar.notifyChanged();
                }
                View viewA = uxxVar.a(strZ);
                if (viewA != null) {
                    viewA.getViewTreeObserver().addOnGlobalLayoutListener(new uxw(uxxVar, uxxVar.getClass().getSimpleName(), viewA));
                }
            }
            boolean z = bundle.getBoolean("CHOOSE_FILTER_VIEW_VISIBLE");
            this.d = z;
            post(new csd(this, z, 9));
            parcelable = bundle.getParcelable("SUPER_STATE");
            if (parcelable == null) {
                parcelable = new Bundle();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_STATE", super.onSaveInstanceState());
        bundle.putString("SELECTED_FILTER", this.a.c);
        bundle.putBoolean("CHOOSE_FILTER_VIEW_VISIBLE", this.d);
        return bundle;
    }
}
