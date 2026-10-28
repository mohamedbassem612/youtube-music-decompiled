package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.watchpage.MusicPlaybackControls;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abhm implements abhp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ View a;

    public /* synthetic */ abhm(View view, int i) {
        this.$cid = i;
        this.a = view;
    }

    @Override // defpackage.abhp
    public final void f(int i, long j) {
        MusicPlaybackControls musicPlaybackControls;
        jno jnoVar;
        if (this.$cid != 0) {
            if ((i == 1 || i == 2) && (jnoVar = (musicPlaybackControls = (MusicPlaybackControls) this.a).n) != null) {
                jnoVar.b(j, musicPlaybackControls.i.a);
            }
        }
    }
}
