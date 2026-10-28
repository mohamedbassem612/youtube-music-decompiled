package defpackage;

import android.widget.TextView;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abhv {
    public final TextView a;

    public abhv(TextView textView) {
        textView.getClass();
        this.a = textView;
    }

    public final void a(int i) {
        this.a.setVisibility(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(SemanticState.Focused);
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.a.getId());
        sb.append(']');
        return sb.toString();
    }
}
