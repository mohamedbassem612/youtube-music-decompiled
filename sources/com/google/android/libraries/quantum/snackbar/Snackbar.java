package com.google.android.libraries.quantum.snackbar;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.qob;
import defpackage.qod;
import defpackage.rbm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class Snackbar extends LinearLayout {
    public final rbm a;
    private final TextView b;
    private final TextView c;

    public Snackbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new rbm(this);
        LayoutInflater.from(context).inflate(R.layout.snackbar, this);
        TextView textView = (TextView) findViewById(R.id.message);
        this.b = textView;
        TextView textView2 = (TextView) findViewById(R.id.action);
        this.c = textView2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qob.a, i, R.style.Snackbar);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(1);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
        setBackgroundDrawable(drawable);
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            textView2.setTextColor(colorStateList2);
        }
    }

    public final void a() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("translationY", 0.0f, getHeight()));
        objectAnimatorOfPropertyValuesHolder.addListener(new qod(this));
        rbm rbmVar = this.a;
        rbmVar.d();
        if (((Snackbar) rbmVar.a).c()) {
            return;
        }
        rbmVar.b = objectAnimatorOfPropertyValuesHolder;
        ((Animator) rbmVar.b).start();
    }

    public final void b(CharSequence charSequence, String str, View.OnClickListener onClickListener) {
        TextView textView = this.b;
        textView.setText(charSequence);
        TextView textView2 = this.c;
        textView2.setText(str);
        textView2.setOnClickListener(onClickListener);
        textView2.setVisibility(true != TextUtils.isEmpty(str) ? 0 : 8);
        textView.requestLayout();
    }

    public final boolean c() {
        return getVisibility() != 0;
    }

    public Snackbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.snackbarStyle);
    }

    public Snackbar(Context context) {
        this(context, null);
    }
}
