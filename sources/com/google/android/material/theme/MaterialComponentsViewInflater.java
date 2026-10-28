package com.google.android.material.theme;

import android.content.Context;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import defpackage.aewl;
import defpackage.afaj;
import defpackage.afel;
import defpackage.ke;
import defpackage.kg;
import defpackage.kh;
import defpackage.kp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatViewInflater
    public final ke a(Context context, AttributeSet attributeSet) {
        return new afel(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatViewInflater
    public final kg b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatViewInflater
    public final kh c(Context context, AttributeSet attributeSet) {
        return new aewl(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatViewInflater
    public final kp d(Context context, AttributeSet attributeSet) {
        return new afaj(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatViewInflater
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
