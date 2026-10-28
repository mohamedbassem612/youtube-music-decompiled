package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xpu extends oh {
    public final TextView s;
    public final View t;

    public xpu(View view, View.OnClickListener onClickListener) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.name);
        View viewFindViewById = view.findViewById(R.id.delete);
        this.t = viewFindViewById;
        viewFindViewById.setOnClickListener(onClickListener);
    }
}
