package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xab extends ClickableSpan {
    final /* synthetic */ ClickableSpan a;
    final /* synthetic */ xac b;

    public xab(xac xacVar, ClickableSpan clickableSpan) {
        this.a = clickableSpan;
        this.b = xacVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.s = true;
        this.a.onClick(view);
    }
}
