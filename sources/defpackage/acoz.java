package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acoz extends acde implements abgl {
    public final acdg a;
    public final abgp b;
    public View c;
    public final acoy d;
    public final acoy e;
    private final acoy f;

    public acoz(Context context, acdg acdgVar, abgp abgpVar) {
        super(context);
        this.d = new acoy(R.id.reels_playback);
        this.f = new acoy(R.id.reels_response);
        this.e = new acoy(R.id.reels_sequence);
        this.a = acdgVar;
        this.b = abgpVar;
    }

    @Override // defpackage.acdg
    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void c(long j) {
        this.f.b(j);
    }

    public final boolean d() {
        View view = this.c;
        return view != null && view.getVisibility() == 0;
    }

    @Override // defpackage.abgl
    public final void g() {
        this.b.g();
    }

    @Override // defpackage.abgl
    public final void h() {
        View viewInflate = this.c;
        if (viewInflate == null) {
            viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.reel_player_csi_overlay, this);
            this.d.a(viewInflate);
            this.f.a(viewInflate);
            this.e.a(viewInflate);
            this.c = viewInflate;
        }
        tuk.l(viewInflate, false);
        Object obj = this.a;
        if (obj != null) {
            jfx jfxVar = new jfx(this, 12, null);
            View viewFindViewById = ((View) obj).findViewById(R.id.nerd_stats_layout);
            if (viewFindViewById != null) {
                if (viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    tym.h(viewFindViewById, new tyj(getResources().getDimensionPixelSize(R.dimen.reel_nerd_stats_margin_top), 2), ViewGroup.MarginLayoutParams.class);
                }
                viewFindViewById.addOnLayoutChangeListener(jfxVar);
            }
        }
        this.b.k();
    }
}
