package defpackage;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gfe extends oh {
    final TextView s;
    final TextView t;
    final TextView u;
    final TextView v;
    final RadioButton w;
    public final /* synthetic */ gff x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfe(gff gffVar, View view) {
        super(view);
        this.x = gffVar;
        view.setOnClickListener(new jn(this, 10));
        this.s = (TextView) view.findViewById(R.id.track_title);
        this.t = (TextView) view.findViewById(R.id.track_album);
        this.u = (TextView) view.findViewById(R.id.track_artist);
        this.v = (TextView) view.findViewById(R.id.duration);
        this.w = (RadioButton) view.findViewById(R.id.radio);
    }
}
