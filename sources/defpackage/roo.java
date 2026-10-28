package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class roo extends ClickableSpan {
    final /* synthetic */ int a;
    final /* synthetic */ rop b;

    public roo(rop ropVar, int i) {
        this.a = i;
        this.b = ropVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i = this.a;
        if (i == R.string.other_methods_suffix) {
            this.b.c.j(4);
        } else if (i == R.string.use_fingerprint_suffix) {
            this.b.c.j(6);
        }
    }
}
