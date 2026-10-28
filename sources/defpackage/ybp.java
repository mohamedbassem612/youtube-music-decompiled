package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ybp implements aced {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/remote/internal/MdxPlaybackControlDismissPlugin");
    private final ycp b;

    public ybp(ycp ycpVar) {
        this.b = ycpVar;
    }

    @Override // defpackage.aced
    public final void a() {
        ycp ycpVar = this.b;
        if (ycpVar.j()) {
            ycpVar.g();
            return;
        }
        yco ycoVar = ycpVar.e;
        if (ycoVar == null) {
            ((agrc) ((agrc) a.c().i(agso.a, "MDX.DismissPlugin")).k("com/google/android/libraries/youtube/mdx/remote/internal/MdxPlaybackControlDismissPlugin", "onDismissPlayback", 42, "MdxPlaybackControlDismissPlugin.java")).t("onDismissPlayback got called when mdx session isn't active");
        } else if (Build.VERSION.SDK_INT < 33) {
            ycoVar.J();
        }
    }
}
