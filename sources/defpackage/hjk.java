package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjk implements acel, acdp {
    public boolean a;
    private final hgy b;
    private final aunn c;
    private final adxj d;
    private acek e;

    public hjk(hgy hgyVar, aunn aunnVar, adxj adxjVar) {
        this.b = hgyVar;
        this.c = aunnVar;
        this.d = adxjVar;
        ((acdq) aunnVar.io()).w(this);
    }

    public final void a() {
        acek acekVar = this.e;
        if (acekVar != null) {
            acekVar.a();
        }
    }

    @Override // defpackage.acel
    public final int b() {
        return this.d.b(arqz.cE);
    }

    @Override // defpackage.acel
    public final int c() {
        return R.string.accessibility_previous_track_enabled;
    }

    @Override // defpackage.acel
    public final int d() {
        return 256990;
    }

    @Override // defpackage.acel
    public final String e() {
        return "skip_previous_action";
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
        return !this.a && ((acdq) this.c.io()).C();
    }

    @Override // defpackage.acel
    public final void i() {
        this.b.g();
    }

    @Override // defpackage.acel
    public final void j() {
    }
}
