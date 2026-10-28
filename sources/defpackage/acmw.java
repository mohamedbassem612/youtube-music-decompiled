package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmw {
    public final abvn b;
    public final acqz c;
    public ViewGroup d;
    public View e;
    private final Context g;
    public final avmm a = new avmm();
    public boolean f = true;

    public acmw(Context context, abvn abvnVar, acqz acqzVar) {
        this.g = context;
        this.b = abvnVar;
        this.c = acqzVar;
    }

    public final void a() {
        View view = this.e;
        if (view != null) {
            view.clearAnimation();
            tuk.l(this.e, false);
        }
    }

    public final void b() {
        if (this.f) {
            ViewGroup viewGroup = this.d;
            if (viewGroup != null && viewGroup.findViewById(R.id.reel_playback_loading_spinner) == null) {
                View viewInflate = LayoutInflater.from(this.g).inflate(R.layout.reel_player_loading_spinner, (ViewGroup) null);
                this.e = viewInflate;
                this.d.addView(viewInflate);
            }
            View view = this.e;
            if (view != null) {
                tuk.l(view, true);
                view.setAlpha(0.0f);
                view.animate().alpha(1.0f).setDuration(125L).setStartDelay(1500L);
            }
        }
    }
}
