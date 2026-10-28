package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class kh extends CheckBox {
    public final kj a;
    private final kf b;
    private final le c;
    private pj d;

    public kh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        ox.d(this, getContext());
        kj kjVar = new kj(this);
        this.a = kjVar;
        kjVar.b(attributeSet, R.attr.checkboxStyle);
        kf kfVar = new kf(this);
        this.b = kfVar;
        kfVar.b(attributeSet, R.attr.checkboxStyle);
        le leVar = new le(this);
        this.c = leVar;
        leVar.h(attributeSet, R.attr.checkboxStyle);
        a().i(attributeSet, R.attr.checkboxStyle);
    }

    private final pj a() {
        pj pjVar = this.d;
        if (pjVar != null) {
            return pjVar;
        }
        pj pjVar2 = new pj(this);
        this.d = pjVar2;
        return pjVar2;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        kf kfVar = this.b;
        if (kfVar != null) {
            kfVar.a();
        }
        le leVar = this.c;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        bme bmeVar = bme.b;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kf kfVar = this.b;
        if (kfVar != null) {
            kfVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kf kfVar = this.b;
        if (kfVar != null) {
            kfVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(dl.d(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        le leVar = this.c;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        le leVar = this.c;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        a();
        bme bmeVar = bme.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        kj kjVar = this.a;
        if (kjVar != null) {
            kjVar.c();
        }
    }
}
