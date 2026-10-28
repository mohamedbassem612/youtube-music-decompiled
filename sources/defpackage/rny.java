package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class rny extends ClickableSpan {
    final /* synthetic */ int a;
    final /* synthetic */ rnz b;

    public rny(rnz rnzVar, int i) {
        this.a = i;
        this.b = rnzVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int i = this.a;
        if (i == R.string.other_methods_suffix) {
            this.b.a.j(4);
        } else if (i == R.string.use_password_suffix) {
            this.b.a.j(7);
        }
    }
}
