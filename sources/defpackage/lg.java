package defpackage;

import android.support.v7.widget.AppCompatTextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class lg extends lf {
    final /* synthetic */ AppCompatTextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.b = appCompatTextView;
    }

    @Override // defpackage.lf
    public final void a(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.lf
    public final void b(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }
}
