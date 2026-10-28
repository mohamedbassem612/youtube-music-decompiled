package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adse implements adsd {
    private final View a;

    public adse(View view) {
        this.a = view;
    }

    @Override // defpackage.adsd
    public final void a(SpannableStringBuilder spannableStringBuilder, int i) {
        View view = this.a;
        if (view != null) {
            View viewFindViewById = view.findViewById(i);
            if (viewFindViewById instanceof TextView) {
                ((TextView) viewFindViewById).setText(spannableStringBuilder);
            }
        }
    }
}
