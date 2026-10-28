package defpackage;

import com.google.android.apps.youtube.music.R;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzt implements abrn {
    private final /* synthetic */ int $cid;
    private final Object a;
    private final Object b;

    public hzt(acdq acdqVar, acdo acdoVar, int i) {
        this.$cid = i;
        this.b = acdqVar;
        this.a = acdoVar;
    }

    @Override // defpackage.abrn
    public final int a() {
        int i = this.$cid;
        if (i == 0) {
            return ((acdq) this.a).C() ? R.drawable.quantum_ic_skip_previous_white_36 : R.drawable.ic_notifications_menu_previous_video_disabled;
        }
        if (i == 1) {
            return ((acdq) this.a).B() ? R.drawable.quantum_ic_skip_next_white_36 : R.drawable.ic_notifications_menu_next_video_disabled;
        }
        switch (((acdq) this.b).b()) {
            case 0:
            case 3:
            case 4:
            case 10:
                return R.drawable.quantum_ic_play_arrow_white_36;
            case 1:
            case 5:
            default:
                return R.drawable.ic_notification_play_arrow_disabled;
            case 2:
            case 9:
                return R.drawable.quantum_ic_pause_white_36;
            case 6:
                return R.drawable.ic_notifications_pause_disabled;
            case 7:
                return R.drawable.quantum_ic_replay_white_36;
            case 8:
                return R.drawable.quantum_ic_error_white_36;
        }
    }

    @Override // defpackage.abrn
    public final int b() {
        int i = this.$cid;
        if (i == 0) {
            return R.string.playback_control_previous;
        }
        if (i == 1) {
            return R.string.playback_control_next;
        }
        int iB = ((acdq) this.b).b();
        if (iB != 0) {
            if (iB != 2) {
                if (iB != 3 && iB != 4) {
                    switch (iB) {
                        case 7:
                            return R.string.playback_control_replay;
                        case 8:
                            return R.string.playback_control_retry;
                        case 9:
                            break;
                        case 10:
                            break;
                        default:
                            return R.string.playback_control_play_pause;
                    }
                }
            }
            return R.string.playback_control_pause;
        }
        return R.string.playback_control_play;
    }

    @Override // defpackage.abrn
    public final /* synthetic */ agev c() {
        if (this.$cid != 0) {
        }
        return agdf.a;
    }

    @Override // defpackage.abrn
    public final String d() {
        int i = this.$cid;
        if (i == 0) {
            return ((acdq) this.a).C() ? "music_notification_skip_to_previous" : "noop";
        }
        if (i == 1) {
            return ((acdq) this.a).B() ? "music_notification_skip_to_next" : "noop";
        }
        int iB = ((acdq) this.b).b();
        if (iB != 0) {
            if (iB != 2) {
                if (iB != 3 && iB != 4) {
                    switch (iB) {
                        case 7:
                            return "com.google.android.libraries.youtube.player.action.controller_notification_replay";
                        case 8:
                            return "com.google.android.libraries.youtube.player.action.controller_notification_retry";
                        case 9:
                            break;
                        case 10:
                            break;
                        default:
                            return "noop";
                    }
                }
            }
            return "com.google.android.libraries.youtube.player.action.controller_notification_pause";
        }
        return "com.google.android.libraries.youtube.player.action.controller_notification_play";
    }

    @Override // defpackage.abrn
    public final Set e() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? agkz.s("com.google.android.libraries.youtube.player.action.controller_notification_retry", "com.google.android.libraries.youtube.player.action.controller_notification_replay", "com.google.android.libraries.youtube.player.action.controller_notification_pause", "com.google.android.libraries.youtube.player.action.controller_notification_play") : new agqj("music_notification_skip_to_next");
        }
        return new agqj("music_notification_skip_to_previous");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aunn, java.lang.Object] */
    @Override // defpackage.abrn
    public final boolean i(String str) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                if ("com.google.android.libraries.youtube.player.action.controller_notification_play".equals(str)) {
                    ((acdo) this.a).d();
                } else if ("com.google.android.libraries.youtube.player.action.controller_notification_pause".equals(str)) {
                    ((acdo) this.a).c();
                } else if ("com.google.android.libraries.youtube.player.action.controller_notification_replay".equals(str)) {
                    ((acdo) this.a).e();
                } else {
                    if (!"com.google.android.libraries.youtube.player.action.controller_notification_retry".equals(str)) {
                        return false;
                    }
                    ((acdo) this.a).f();
                }
            } else {
                if (!"music_notification_skip_to_next".equals(str)) {
                    return false;
                }
                ((acdo) this.b.io()).j();
            }
        } else {
            if (!"music_notification_skip_to_previous".equals(str)) {
                return false;
            }
            ((acdo) this.b.io()).k();
        }
        return true;
    }

    @Override // defpackage.abrn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.abrn
    public final boolean k() {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1 && ((acdq) this.a).D()) {
                return false;
            }
        } else if (((acdq) this.a).D()) {
            return false;
        }
        return true;
    }

    public hzt(acdq acdqVar, aunn aunnVar, int i) {
        this.$cid = i;
        this.a = acdqVar;
        this.b = aunnVar;
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
