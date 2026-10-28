package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.metadataeditor.elements.OverlayView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zpl extends FrameLayout {
    public final RecyclerView a;
    public final OverlayView b;
    private final int c;

    public zpl(Context context) {
        super(context);
        this.c = twm.c(context.getResources().getDisplayMetrics(), 4);
        RecyclerView recyclerView = new RecyclerView(context);
        this.a = recyclerView;
        recyclerView.setId(R.id.suggestions);
        OverlayView overlayView = new OverlayView(context);
        this.b = overlayView;
        overlayView.setId(R.id.social_suggestions_overlay);
        setBackground(new ColorDrawable(tzk.i(getContext(), R.attr.ytRaisedBackground)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.c;
        int i6 = (i4 - i2) + i5;
        this.a.layout(i, i5, i3, i6);
        this.b.layout(i, i5, i3, i6);
    }
}
