package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acwo extends FrameLayout {
    int a;
    int b;
    int c;
    private final Context d;

    public acwo(Context context) {
        super(context);
        this.d = context;
        Resources resources = context.getResources();
        resources.getClass();
        a(resources);
        setId(R.id.dialog_responsive_container);
    }

    private final void a(Resources resources) {
        this.a = resources.getDimensionPixelSize(R.dimen.modern_dialog_min_width);
        this.b = resources.getDimensionPixelSize(R.dimen.modern_dialog_max_width);
        this.c = resources.getDimensionPixelSize(R.dimen.modern_dialog_max_height);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Resources resources = this.d.getResources();
        resources.getClass();
        a(resources);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.a > size || this.b < size) {
            int mode = View.MeasureSpec.getMode(i);
            int i3 = this.a;
            if (i3 <= size) {
                i3 = this.b;
            }
            i = View.MeasureSpec.makeMeasureSpec(i3, mode);
        }
        if (this.c < View.MeasureSpec.getSize(i2)) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.c, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }
}
