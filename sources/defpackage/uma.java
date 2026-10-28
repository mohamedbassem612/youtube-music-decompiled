package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.editor.ShortsPlayerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uma {
    public final ShortsPlayerView a;
    public final View b;
    public final View c;
    public final ulj d;
    public final Context e;
    View.OnTouchListener f;
    uls g;
    public final uwf h;
    public final umf i;
    public final aaok j;

    public uma(aaok aaokVar, ulj uljVar, Context context, umf umfVar, View view, uwf uwfVar) {
        this.j = aaokVar;
        ShortsPlayerView shortsPlayerView = (ShortsPlayerView) view.findViewById(R.id.shorts_edit_player_view);
        this.a = shortsPlayerView;
        this.b = shortsPlayerView.b;
        this.c = view.findViewById(R.id.trash_container);
        this.d = uljVar;
        this.e = context;
        this.i = umfVar;
        this.h = uwfVar;
    }
}
