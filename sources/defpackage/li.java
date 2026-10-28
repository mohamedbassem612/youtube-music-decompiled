package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class li extends qa {
    public li() {
        super((byte[]) null);
    }

    @Override // defpackage.qa
    public final void fV(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.qa
    public final boolean fW(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
