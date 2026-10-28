package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acor extends acdd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final Rect k;
    public avlh l;
    public acos m;
    public boolean n;
    public acou o;
    private final int p;
    private final int q;
    private final int r;
    private final avmm s;

    public acor(Context context) {
        super(context);
        this.a = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_padding_left);
        this.b = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_padding_top);
        this.c = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_padding_right);
        this.d = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_padding_bottom);
        this.p = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_padding_bottom_top_left_portrait);
        this.q = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_padding_bottom_top_left_landscape);
        this.e = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_below_video_padding_left);
        this.f = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_below_video_padding_top);
        this.g = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_below_video_padding_right);
        this.h = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_below_top_bar_padding_left);
        this.i = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_below_top_bar_padding_top);
        this.j = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_below_top_bar_padding_right);
        this.r = getResources().getDimensionPixelSize(R.dimen.reel_player_caption_window_bottom_center_padding_bottom);
        this.s = new avmm();
        this.k = new Rect();
        this.m = acos.a;
        this.n = false;
    }

    private final void e(avni avniVar) {
        if (this.l != null) {
            avmm avmmVar = this.s;
            avmmVar.b();
            avmmVar.c(this.l.p().al(avniVar, new abxq(17)));
        }
    }

    @Override // defpackage.acdg
    public final ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void c() {
        setPadding(this.h, this.i + this.k.top, this.j, 0);
    }

    public final void d(acos acosVar, boolean z) {
        if (this.m != acosVar || z) {
            this.m = acosVar;
            this.s.b();
            switch (acosVar.ordinal()) {
                case 0:
                    setPadding(this.a, this.b, this.c, this.d);
                    break;
                case 1:
                    setPadding(this.a, this.b, this.c, this.n ? this.q : this.p);
                    break;
                case 2:
                    setPadding(this.a, this.b, this.c, 0);
                    break;
                case 3:
                    setPadding(0, 0, 0, this.r);
                    break;
                case 4:
                    e(new acnt(this, 11));
                    break;
                case 5:
                    c();
                    break;
                case 6:
                    e(new acnt(this, 12));
                    break;
            }
        }
    }
}
