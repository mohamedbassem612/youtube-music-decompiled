package defpackage;

import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzq implements abrn, hzv {
    private static final amlg b = amlg.INDIFFERENT;
    public amlg a = b;
    private final acdq c;
    private boolean d;
    private final hzp e;
    private final vxu f;
    private abrt g;

    public hzq(hzp hzpVar, acdq acdqVar, vxu vxuVar) {
        this.e = hzpVar;
        this.f = vxuVar;
        this.c = acdqVar;
        hzpVar.a(this);
    }

    private final boolean n() {
        anhb anhbVar = this.f.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        ajdi ajdiVar = anhbVar.t;
        if (ajdiVar == null) {
            ajdiVar = ajdi.a;
        }
        if (!ajdiVar.b) {
            return false;
        }
        acdq acdqVar = this.c;
        return acdqVar.b() == 3 || acdqVar.b() == 4 || acdqVar.b() == 7;
    }

    @Override // defpackage.abrn
    public final int a() {
        if (n()) {
            return R.drawable.yt_outline_x_mark_vd_theme_24;
        }
        return this.a == amlg.DISLIKE ? R.drawable.yt_fill_thumb_down_vd_theme_24 : R.drawable.yt_outline_thumb_down_vd_theme_24;
    }

    @Override // defpackage.abrn
    public final int b() {
        return n() ? R.string.playback_control_stop : R.string.accessibility_dislike_video;
    }

    @Override // defpackage.abrn
    public final /* synthetic */ agev c() {
        return agdf.a;
    }

    @Override // defpackage.abrn
    public final String d() {
        return true != n() ? "music_notification_dislike_video" : "com.google.android.libraries.youtube.player.action.controller_notification_close";
    }

    @Override // defpackage.abrn
    public final Set e() {
        return agkz.q("com.google.android.libraries.youtube.player.action.controller_notification_close", "music_notification_dislike_video");
    }

    @Override // defpackage.abrn
    public final void f() {
        this.e.b();
    }

    @Override // defpackage.hzv
    public final void h(Optional optional) {
        this.d = true;
        optional.ifPresentOrElse(new hsk(this, 11), new hgx(this, 13));
        abrt abrtVar = this.g;
        if (abrtVar != null) {
            abrtVar.c(false);
        }
    }

    @Override // defpackage.abrn
    public final /* synthetic */ boolean i(String str) {
        return aajg.j(this, str);
    }

    @Override // defpackage.abrn
    public final boolean j() {
        return (this.d && !n()) || n();
    }

    @Override // defpackage.abrn
    public final boolean k() {
        return false;
    }

    @Override // defpackage.abrn
    public final void l(abrt abrtVar) {
        this.g = abrtVar;
    }

    @Override // defpackage.hzv
    public final void m(aihh aihhVar) {
        amlg amlgVarEa = aihhVar != null ? yno.ea(aihhVar) : b;
        boolean z = aihhVar != null && ((amks) aihhVar.instance).f;
        if (this.a == amlgVarEa && this.d == z) {
            return;
        }
        this.a = amlgVarEa;
        this.d = z;
        abrt abrtVar = this.g;
        if (abrtVar != null) {
            abrtVar.c(false);
        }
    }

    @Override // defpackage.abrn
    public final /* synthetic */ void g() {
    }
}
