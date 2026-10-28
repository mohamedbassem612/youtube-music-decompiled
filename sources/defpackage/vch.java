package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class vch extends oh {
    public final TextView s;
    public final TextView t;
    public final vce u;
    public final qcb v;

    public vch(View view, vce vceVar, qcb qcbVar) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.location_search_item_title);
        this.t = (TextView) view.findViewById(R.id.location_search_item_subtitle);
        this.u = vceVar;
        this.v = qcbVar;
    }
}
