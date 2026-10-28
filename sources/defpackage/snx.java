package defpackage;

import com.google.android.apps.youtube.music.R;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class snx implements abrn {
    public abrt a;
    private final snv b;

    public snx(snv snvVar) {
        this.b = snvVar;
    }

    @Override // defpackage.abrn
    public final int a() {
        return R.drawable.quantum_ic_skip_next_white_36;
    }

    @Override // defpackage.abrn
    public final int b() {
        return R.string.playback_control_next;
    }

    @Override // defpackage.abrn
    public final /* synthetic */ agev c() {
        return agdf.a;
    }

    @Override // defpackage.abrn
    public final String d() {
        return "skip_ad";
    }

    @Override // defpackage.abrn
    public final /* synthetic */ Set e() {
        return aajg.i(this);
    }

    @Override // defpackage.abrn
    public final void f() {
        this.b.e.d(-1, -1);
    }

    @Override // defpackage.abrn
    public final /* synthetic */ boolean i(String str) {
        return aajg.j(this, str);
    }

    @Override // defpackage.abrn
    public final boolean j() {
        return this.b.d == 1;
    }

    @Override // defpackage.abrn
    public final boolean k() {
        return true;
    }

    @Override // defpackage.abrn
    public final void l(abrt abrtVar) {
        this.a = abrtVar;
    }

    @Override // defpackage.abrn
    public final /* synthetic */ void g() {
    }
}
