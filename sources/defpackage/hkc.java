package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hkc {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/mediabrowser/waze/MusicWazeNavBarController");
    public final Context b;
    public final avlh c;
    public final avmm d = new avmm();
    public aumt e;
    public final hfn f;
    public final hfn g;
    private final awku h;
    private final iwe i;

    public hkc(Context context, avlh avlhVar, awku awkuVar, iwe iweVar, hfn hfnVar, hfn hfnVar2) {
        this.b = context;
        this.c = avlhVar;
        this.h = awkuVar;
        this.i = iweVar;
        this.f = hfnVar;
        this.g = hfnVar2;
    }

    public final void a() {
        aumt aumtVar = this.e;
        if (aumtVar != null) {
            boolean z = aumtVar.getVisibility() == 0;
            if (z) {
                this.e.getChildAt(0).setPadding(0, this.f.x().b(hww.h) ? 0 : this.g.K(), 0, 0);
                this.i.b(false);
                Context context = this.b;
                ((Activity) context).getWindow().setStatusBarColor(context.getColor(R.color.music_full_transparent));
            } else {
                this.i.b(true);
            }
            this.h.kk(Boolean.valueOf(z));
        }
    }

    public final void b(boolean z) {
        aumt aumtVar = this.e;
        if (aumtVar != null) {
            aumtVar.setVisibility(true != z ? 8 : 0);
        }
    }
}
