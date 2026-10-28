package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.dfi;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SubtitleView extends FrameLayout {
    private View a;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        List list = Collections.EMPTY_LIST;
        dfi dfiVar = new dfi(context);
        this.a = dfiVar;
        addView(dfiVar);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}
