package defpackage;

import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzr implements abrn, hzv {
    private static final amlg b = amlg.INDIFFERENT;
    public amlg a = b;
    private boolean c;
    private final hzp d;
    private abrt e;

    public hzr(hzp hzpVar) {
        this.d = hzpVar;
        hzpVar.a(this);
    }

    @Override // defpackage.abrn
    public final int a() {
        return this.a == amlg.LIKE ? R.drawable.yt_fill_thumb_up_vd_theme_24 : R.drawable.yt_outline_thumb_up_vd_theme_24;
    }

    @Override // defpackage.abrn
    public final int b() {
        return R.string.accessibility_like_video;
    }

    @Override // defpackage.abrn
    public final /* synthetic */ agev c() {
        return agdf.a;
    }

    @Override // defpackage.abrn
    public final String d() {
        return "music_notification_like_video";
    }

    @Override // defpackage.abrn
    public final /* synthetic */ Set e() {
        return aajg.i(this);
    }

    @Override // defpackage.abrn
    public final void f() {
        this.d.c();
    }

    @Override // defpackage.hzv
    public final void h(Optional optional) {
        this.c = true;
        optional.ifPresentOrElse(new hsk(this, 12), new hgx(this, 14));
        abrt abrtVar = this.e;
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
        return this.c;
    }

    @Override // defpackage.abrn
    public final boolean k() {
        return false;
    }

    @Override // defpackage.abrn
    public final void l(abrt abrtVar) {
        this.e = abrtVar;
    }

    @Override // defpackage.hzv
    public final void m(aihh aihhVar) {
        amlg amlgVarEa = aihhVar != null ? yno.ea(aihhVar) : b;
        boolean z = aihhVar != null && ((amks) aihhVar.instance).f;
        if (this.a == amlgVarEa && this.c == z) {
            return;
        }
        this.a = amlgVarEa;
        this.c = z;
        abrt abrtVar = this.e;
        if (abrtVar != null) {
            abrtVar.c(false);
        }
    }

    @Override // defpackage.abrn
    public final /* synthetic */ void g() {
    }
}
