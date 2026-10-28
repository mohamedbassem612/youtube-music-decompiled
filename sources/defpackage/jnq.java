package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.watchpage.MusicPlaybackControls;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnq extends abge {
    private final hwy a;
    private final hvz b;
    private final hvw c;
    private final vxz d;

    public jnq(MusicPlaybackControls musicPlaybackControls, abvk abvkVar, abmt abmtVar, ci ciVar, yha yhaVar, ScheduledExecutorService scheduledExecutorService, Executor executor, axfd axfdVar, jnj jnjVar, vxz vxzVar, abgo abgoVar, hhb hhbVar, vxz vxzVar2, vxz vxzVar3) {
        super(abvkVar, ciVar, musicPlaybackControls, yhaVar, scheduledExecutorService, executor, abmtVar, vxzVar, abgoVar, vxzVar3);
        this.d = vxzVar2;
        musicPlaybackControls.h.f = vxzVar2;
        View viewFindViewById = musicPlaybackControls.findViewById(R.id.playback_queue_shuffle_button_view);
        ImageView imageView = (ImageView) viewFindViewById.findViewById(R.id.playback_control_indicator);
        View viewFindViewById2 = musicPlaybackControls.findViewById(R.id.playback_queue_loop_button_view);
        ImageView imageView2 = (ImageView) viewFindViewById2.findViewById(R.id.playback_control_indicator);
        hwy hwyVarAl = axfdVar.al(imageView, viewFindViewById);
        this.a = hwyVarAl;
        hwyVarAl.c();
        hvz hvzVarZ = jnjVar.z(imageView2, viewFindViewById2);
        this.b = hvzVarZ;
        hvzVarZ.c();
        this.c = hhbVar.c((YouTubeButton) musicPlaybackControls.findViewById(R.id.playback_rate_text_button));
    }

    @Override // defpackage.abge
    public final void f() {
        hvw hvwVar;
        super.f();
        hwy hwyVar = this.a;
        if (hwyVar != null) {
            hwyVar.d();
        }
        hvz hvzVar = this.b;
        if (hvzVar != null) {
            hvzVar.d();
        }
        if (!this.d.l(44, 45682398L, false) || (hvwVar = this.c) == null) {
            return;
        }
        hvwVar.b(null);
    }

    @Override // defpackage.abge
    public final void g() {
        super.g();
        this.a.e();
        this.b.e();
        if (this.d.l(44, 45682398L, false)) {
            hvw hvwVar = this.c;
            new adly();
            hvwVar.f();
        }
    }
}
