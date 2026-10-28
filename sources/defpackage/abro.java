package defpackage;

import com.google.android.apps.youtube.music.R;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abro implements abrn {
    private final acdo a;

    public abro(acdo acdoVar) {
        this.a = acdoVar;
    }

    @Override // defpackage.abrn
    public final int a() {
        return R.drawable.quantum_ic_clear_white_24;
    }

    @Override // defpackage.abrn
    public final int b() {
        return R.string.playback_control_stop;
    }

    @Override // defpackage.abrn
    public final /* synthetic */ agev c() {
        return agdf.a;
    }

    @Override // defpackage.abrn
    public final String d() {
        return "com.google.android.libraries.youtube.player.action.controller_notification_close";
    }

    @Override // defpackage.abrn
    public final /* synthetic */ Set e() {
        return aajg.i(this);
    }

    @Override // defpackage.abrn
    public final boolean i(String str) {
        if (!"com.google.android.libraries.youtube.player.action.controller_notification_close".equals(str)) {
            return false;
        }
        this.a.b();
        return true;
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
