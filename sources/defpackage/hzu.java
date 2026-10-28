package defpackage;

import com.google.android.apps.youtube.music.R;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzu implements abrn {
    private final /* synthetic */ int $cid;
    private final aunn a;

    public hzu(aunn aunnVar, int i) {
        this.$cid = i;
        this.a = aunnVar;
    }

    @Override // defpackage.abrn
    public final int a() {
        return this.$cid != 0 ? R.drawable.yt_fill_skip_back_10_vd_theme_24 : R.drawable.yt_fill_skip_forward_30_vd_theme_24;
    }

    @Override // defpackage.abrn
    public final int b() {
        return this.$cid != 0 ? R.string.accessibility_rewind : R.string.accessibility_fast_forward_30_seconds;
    }

    @Override // defpackage.abrn
    public final agev c() {
        return this.$cid != 0 ? agev.i(xhb.b(147862)) : agev.i(xhb.b(147861));
    }

    @Override // defpackage.abrn
    public final String d() {
        return this.$cid != 0 ? "music_notification_seek_back" : "music_notification_seek_forward";
    }

    @Override // defpackage.abrn
    public final /* synthetic */ Set e() {
        return this.$cid != 0 ? aajg.i(this) : aajg.i(this);
    }

    @Override // defpackage.abrn
    public final boolean i(String str) {
        if (this.$cid != 0) {
            if ("music_notification_seek_back".equals(str)) {
                ((acdo) this.a.io()).g(-10000L);
                return true;
            }
        } else if ("music_notification_seek_forward".equals(str)) {
            ((acdo) this.a.io()).g(30000L);
            return true;
        }
        return false;
    }

    @Override // defpackage.abrn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.abrn
    public final boolean k() {
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
