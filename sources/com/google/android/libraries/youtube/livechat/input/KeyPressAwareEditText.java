package com.google.android.libraries.youtube.livechat.input;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.KeyEvent;
import defpackage.xbs;
import defpackage.xxj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class KeyPressAwareEditText extends AppCompatEditText {
    public xxj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyPressAwareEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        xxj xxjVar = this.a;
        if (xxjVar != null && i == 4) {
            if (keyEvent.getAction() == 1) {
                ((xbs) xxjVar.a).w();
            }
            i = 4;
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
