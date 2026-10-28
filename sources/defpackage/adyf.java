package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adyf {
    public final TextView a;
    public final ImageView b;
    public TextView c;
    public TextView d;
    public final ImageView e;
    public final ProgressBar f;
    public final FrameLayout g;
    public View h;
    public final View i;

    public adyf(View view, boolean z) {
        this.c = null;
        this.d = null;
        this.h = null;
        this.a = (TextView) view.findViewById(R.id.list_item_text);
        this.b = (ImageView) view.findViewById(R.id.list_item_icon_primary);
        this.e = (ImageView) view.findViewById(R.id.list_item_icon_secondary);
        this.f = (ProgressBar) view.findViewById(R.id.loading_spinner);
        this.g = (FrameLayout) view.findViewById(R.id.list_item_icon_primary_container);
        if (z) {
            this.h = view.findViewById(R.id.list_item_text_container);
        } else {
            this.c = (TextView) view.findViewById(R.id.list_item_text_secondary);
            this.d = (TextView) view.findViewById(R.id.list_item_text_secondary_separator);
        }
        this.i = view;
    }
}
