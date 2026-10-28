package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watchpage.MusicPlaybackControlsTimeBar;
import com.google.android.libraries.youtube.player.features.storyboard.ScrubbedPreviewView;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwo extends ablt {
    public View a;
    public gei b;
    private final Rect e;
    private final ImageView f;
    private final TextView g;

    public hwo(ScrubbedPreviewView scrubbedPreviewView, ablx ablxVar) {
        super(scrubbedPreviewView, ablxVar);
        int dimensionPixelOffset = scrubbedPreviewView.getResources().getDimensionPixelOffset(R.dimen.storyboard_margin);
        this.e = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        this.f = (ImageView) scrubbedPreviewView.findViewById(R.id.thumbnail);
        this.g = (TextView) scrubbedPreviewView.findViewById(R.id.timestamp);
    }

    public final void a(int i, long j) {
        Optional optional;
        ablz ablzVar;
        int iA;
        if (c()) {
            if (i == 1) {
                ((ScrubbedPreviewView) this.c).setVisibility(4);
                return;
            }
            if (i == 2) {
                b(true);
            }
            if (c()) {
                int i2 = 0;
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        b(false);
                        return;
                    }
                    return;
                }
                ablx ablxVar = this.d;
                if (!ablxVar.e() || ablxVar.m || (optional = (Optional) ablxVar.e.aD()) == null || optional.isEmpty() || (iA = (ablzVar = (ablz) optional.get()).a(j)) < 0 || ablxVar.n) {
                    ablxVar.h();
                } else {
                    ablxVar.n = true;
                    ablxVar.b.execute(new qd(ablxVar, ablzVar, iA, 16, (byte[]) null));
                }
                ScrubbedPreviewView scrubbedPreviewView = (ScrubbedPreviewView) this.c;
                scrubbedPreviewView.b.setText(aaja.d(j));
                if (this.a == null || this.b == null) {
                    scrubbedPreviewView.a();
                    return;
                }
                this.g.setMinimumWidth(this.f.getWidth());
                Point point = new Point();
                Point point2 = new Point();
                gei geiVar = this.b;
                Object obj = geiVar.a;
                int[] iArr = new int[2];
                if (((hww) geiVar.b).b(hww.h)) {
                    get getVar = (get) obj;
                    ibe ibeVar = getVar.be;
                    ibeVar.getLocationInWindow(iArr);
                    Rect rect = ibeVar.a;
                    point.set(rect.right, rect.top);
                    point2.set(0, getVar.bh.getResources().getDimensionPixelOffset(R.dimen.storyboard_vertical_offset_control_overlay));
                } else {
                    get getVar2 = (get) obj;
                    MusicPlaybackControlsTimeBar musicPlaybackControlsTimeBar = (MusicPlaybackControlsTimeBar) getVar2.j.findViewById(R.id.time_bar);
                    musicPlaybackControlsTimeBar.getLocationInWindow(iArr);
                    point.set(musicPlaybackControlsTimeBar.c + (musicPlaybackControlsTimeBar.b() / 2), musicPlaybackControlsTimeBar.d + (musicPlaybackControlsTimeBar.b() / 2));
                    point2.set(0, getVar2.bh.getResources().getDimensionPixelOffset(R.dimen.storyboard_vertical_offset_now_playing));
                }
                point.set(iArr[0] + point.x, iArr[1] + point.y);
                Rect rect2 = new Rect(0, 0, this.a.getWidth(), this.a.getHeight());
                Rect rect3 = this.e;
                int width = scrubbedPreviewView.getWidth() / 2;
                int height = scrubbedPreviewView.getHeight() / 2;
                Drawable background = scrubbedPreviewView.getBackground();
                if (background != null) {
                    Rect rect4 = scrubbedPreviewView.d;
                    background.getPadding(rect4);
                    i2 = rect4.left;
                }
                rect2.set(rect2.left + rect3.left, rect2.top + rect3.top, rect2.right - rect3.right, rect2.bottom - rect3.bottom);
                rect2.inset(width - i2, height - i2);
                point.set(Math.max(rect2.left, Math.min(rect2.right, point.x)), Math.max(rect2.top, Math.min(rect2.bottom, point.y)));
                point.offset(point2.x, point2.y);
                point.offset(-width, -height);
                scrubbedPreviewView.setX(point.x);
                scrubbedPreviewView.setY(point.y);
            }
        }
    }

    @Override // defpackage.ablt, defpackage.abhp
    public final void f(int i, long j) {
        a(i, j);
    }
}
