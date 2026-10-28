package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ttt extends LayerDrawable implements Drawable.Callback {
    public ttt(Context context, Drawable drawable) {
        super(new Drawable[]{drawable == null ? new ColorDrawable(0) : drawable, context.getDrawable(R.drawable.tab_new_content_background)});
    }
}
