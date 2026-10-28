package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afca extends bdl {
    final Rect a;
    private final afcd b;

    public afca(afcd afcdVar) {
        super(afcdVar);
        this.a = new Rect();
        this.b = afcdVar;
    }

    @Override // defpackage.bdl
    protected final int getVirtualViewAt(float f, float f2) {
        int i = 0;
        while (true) {
            afcd afcdVar = this.b;
            if (i >= afcdVar.d().size()) {
                return -1;
            }
            Rect rect = this.a;
            afcdVar.i(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.bdl
    protected final void getVisibleVirtualViews(List list) {
        for (int i = 0; i < this.b.d().size(); i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.bdl
    protected final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        afcd afcdVar = this.b;
        if (afcdVar.isEnabled()) {
            if (i2 == 4096 || i2 == 8192) {
                float fO = afcdVar.o();
                if (i2 == 8192) {
                    fO = -fO;
                }
                if (afcdVar.l()) {
                    fO = -fO;
                }
                if (afcdVar.n(i, ast.b(((Float) afcdVar.d().get(i)).floatValue() + fO, afcdVar.h, afcdVar.i))) {
                    afcdVar.j = i;
                    Runnable runnable = afcdVar.l;
                    afcdVar.removeCallbacks(runnable);
                    afcdVar.postDelayed(runnable, afcdVar.k);
                    afcdVar.j();
                    afcdVar.postInvalidate();
                    return true;
                }
            } else if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && afcdVar.n(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                afcdVar.j();
                afcdVar.postInvalidate();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bdl
    protected final void onPopulateNodeForVirtualView(int i, bbz bbzVar) {
        bbzVar.k(bby.l);
        afcd afcdVar = this.b;
        List listD = afcdVar.d();
        Float f = (Float) listD.get(i);
        float fFloatValue = f.floatValue();
        float fFloatValue2 = afcdVar.h;
        float fFloatValue3 = afcdVar.i;
        if (afcdVar.isEnabled()) {
            if (fFloatValue > fFloatValue2) {
                bbzVar.j(SemanticState.Multiline);
            }
            if (fFloatValue < fFloatValue3) {
                bbzVar.j(SemanticState.Obscured);
            }
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        try {
            fFloatValue2 = numberInstance.parse(numberInstance.format(fFloatValue2)).floatValue();
            fFloatValue3 = numberInstance.parse(numberInstance.format(fFloatValue3)).floatValue();
            fFloatValue = numberInstance.parse(numberInstance.format(fFloatValue)).floatValue();
        } catch (ParseException unused) {
            Log.w(afcd.a, String.format("Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.", f, Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue3)));
        }
        bbzVar.a.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, fFloatValue2, fFloatValue3, fFloatValue));
        bbzVar.v(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        afcd afcdVar2 = this.b;
        if (afcdVar2.getContentDescription() != null) {
            sb.append(afcdVar2.getContentDescription());
        }
        String strC = afcdVar2.c(fFloatValue);
        String string = afcdVar2.getContext().getString(R.string.material_slider_value);
        if (listD.size() > 1) {
            if (i == afcdVar2.d().size() - 1) {
                string = afcdVar2.getContext().getString(R.string.material_slider_range_end);
            } else {
                string = i == 0 ? afcdVar2.getContext().getString(R.string.material_slider_range_start) : "";
            }
        }
        CharSequence charSequenceG = bac.g(afcdVar2);
        if (TextUtils.isEmpty(charSequenceG)) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append(',');
            }
            sb.append(String.format(Locale.getDefault(), "%s, %s", string, strC));
        } else {
            bbzVar.N(charSequenceG);
        }
        bbzVar.z(sb.toString());
        Rect rect = this.a;
        afcdVar2.i(i, rect);
        bbzVar.q(rect);
    }
}
