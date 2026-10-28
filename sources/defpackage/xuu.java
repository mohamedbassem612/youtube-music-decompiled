package defpackage;

import com.google.android.apps.youtube.music.R;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xuu implements abrn {
    private final /* synthetic */ int $cid;
    private final awmd a;
    private final hzt b;

    public xuu(hzt hztVar, awmd awmdVar, int i) {
        this.$cid = i;
        this.b = hztVar;
        this.a = awmdVar;
    }

    private final boolean h() {
        return ((ycp) this.a.io()).j();
    }

    private final boolean m() {
        return ((snv) this.a.io()).d == 1;
    }

    @Override // defpackage.abrn
    public final int a() {
        if (this.$cid == 0) {
            return h() ? R.drawable.ic_notifications_pause_disabled : this.b.a();
        }
        if (m()) {
            return 0;
        }
        return this.b.a();
    }

    @Override // defpackage.abrn
    public final int b() {
        if (this.$cid == 0) {
            return h() ? R.string.playback_control_play_pause : this.b.b();
        }
        if (m()) {
            return 0;
        }
        return this.b.b();
    }

    @Override // defpackage.abrn
    public final /* synthetic */ agev c() {
        int i = this.$cid;
        return agdf.a;
    }

    @Override // defpackage.abrn
    public final String d() {
        if (this.$cid != 0) {
            return !m() ? this.b.d() : "noop";
        }
        return !h() ? this.b.d() : "noop";
    }

    @Override // defpackage.abrn
    public final Set e() {
        return this.$cid != 0 ? agkz.s("com.google.android.libraries.youtube.player.action.controller_notification_retry", "com.google.android.libraries.youtube.player.action.controller_notification_replay", "com.google.android.libraries.youtube.player.action.controller_notification_pause", "com.google.android.libraries.youtube.player.action.controller_notification_play") : agkz.s("com.google.android.libraries.youtube.player.action.controller_notification_retry", "com.google.android.libraries.youtube.player.action.controller_notification_replay", "com.google.android.libraries.youtube.player.action.controller_notification_pause", "com.google.android.libraries.youtube.player.action.controller_notification_play");
    }

    @Override // defpackage.abrn
    public final /* synthetic */ boolean i(String str) {
        return this.$cid != 0 ? aajg.j(this, str) : aajg.j(this, str);
    }

    @Override // defpackage.abrn
    public final boolean j() {
        if (this.$cid != 0) {
            return !m();
        }
        h();
        return true;
    }

    @Override // defpackage.abrn
    public final boolean k() {
        if (this.$cid != 0) {
            if (m()) {
                return false;
            }
        } else if (h()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.abrn
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.abrn
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.abrn
    public final /* synthetic */ void l(abrt abrtVar) {
    }
}
