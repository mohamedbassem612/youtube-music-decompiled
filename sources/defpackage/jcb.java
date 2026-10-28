package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcb extends jbg {
    public jcb(Context context, izf izfVar) {
        super(context, izfVar, R.layout.music_expand_button);
    }

    @Override // defpackage.jbg
    public final void d() {
        tuk.u(this.d, this.g);
        ImageView imageView = this.e;
        imageView.setImageResource(this.i);
        imageView.setContentDescription(this.k);
    }
}
