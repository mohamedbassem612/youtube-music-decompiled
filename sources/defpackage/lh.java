package defpackage;

import android.support.v7.widget.AppCompatTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lh extends lg {
    final /* synthetic */ AppCompatTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.c = appCompatTextView;
    }

    @Override // defpackage.lf
    public final void c(int i, float f) {
        super/*android.widget.TextView*/.setLineHeight(i, f);
    }
}
