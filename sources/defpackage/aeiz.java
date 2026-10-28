package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeiz extends aejb {
    public aeja a;
    private ImageView c;
    private View d;
    private boolean e;

    public aeiz(LoadingFrameLayout loadingFrameLayout, int i) {
        super(loadingFrameLayout, 3, i, R.id.error_message_text);
    }

    @Override // defpackage.aejb
    protected final View a() {
        View viewA = super.a();
        this.c = (ImageView) viewA.findViewById(R.id.error_icon);
        View viewFindViewById = viewA.findViewById(R.id.error_retry_button);
        this.d = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new aefn(this, 3));
        }
        b(this.e);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setImageResource(0);
        }
        return viewA;
    }

    public final void b(boolean z) {
        View view = this.d;
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        } else {
            this.e = z;
        }
    }
}
