package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcc extends jbg {
    public jcc(Context context, izf izfVar) {
        super(context, izfVar, R.layout.expandable_expand_button);
    }

    @Override // defpackage.jbg
    public final void d() {
        this.f = false;
        tuk.u(this.d, this.g);
        ImageView imageView = this.e;
        imageView.setImageResource(this.i);
        imageView.setContentDescription(this.k);
    }
}
