package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ilv implements hwi {
    public final Context a;
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    public boolean f = false;
    private final xgm g;
    private final vxe h;
    private final isi i;
    private final omn j;

    public ilv(Context context, omn omnVar, isi isiVar, xgm xgmVar, vxe vxeVar) {
        this.a = context;
        this.j = omnVar;
        this.i = isiVar;
        this.g = xgmVar;
        this.h = vxeVar;
    }

    @Override // defpackage.hwi
    public final void L() {
        this.h.a(vxh.a("FEmusic_home"));
    }

    @Override // defpackage.hwi
    public final void N() {
        this.h.a(vxh.b("FEmusic_offline"));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.hwi
    public final void O() {
        Optional optional = this.c;
        if (true == optional.isPresent()) {
            optional.get().run();
        }
    }

    public final ilt a(LoadingFrameLayout loadingFrameLayout) {
        return new ilt(loadingFrameLayout, this.i.s(loadingFrameLayout));
    }

    public final ilu b(View view) {
        if (view.getId() != R.id.music_playback_error_root) {
            return null;
        }
        return new ilu(view, this.j.l(this.g.hB(), view, this));
    }

    @Override // defpackage.hwi
    public final void M() {
    }
}
