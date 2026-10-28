package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjj implements acel, acdp {
    public boolean a;
    private final hgy b;
    private final acdq c;
    private final adxj d;
    private acek e;

    public hjj(hgy hgyVar, acdq acdqVar, adxj adxjVar) {
        this.b = hgyVar;
        this.c = acdqVar;
        this.d = adxjVar;
        acdqVar.w(this);
    }

    public final void a() {
        acek acekVar = this.e;
        if (acekVar != null) {
            acekVar.a();
        }
    }

    @Override // defpackage.acel
    public final int b() {
        return this.d.b(arqz.cB);
    }

    @Override // defpackage.acel
    public final int c() {
        return R.string.accessibility_next_track_enabled;
    }

    @Override // defpackage.acel
    public final int d() {
        return 256989;
    }

    @Override // defpackage.acel
    public final String e() {
        return "skip_next_action";
    }

    @Override // defpackage.acel
    public final void g(acek acekVar) {
        this.e = acekVar;
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if ((i & 2) != 0) {
            a();
        }
    }

    @Override // defpackage.acel
    public final boolean h() {
        return !this.a && this.c.B();
    }

    @Override // defpackage.acel
    public final void i() {
        this.b.f();
    }

    @Override // defpackage.acel
    public final void j() {
    }
}
