package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hji implements acel, acdp {
    public final awmd a;
    public final avmb b;
    public boolean d;
    private final aunn f;
    private final aunn g;
    private acek h;
    public final avmm c = new avmm();
    public String e = "";

    public hji(aunn aunnVar, awmd awmdVar, aunn aunnVar2, abvn abvnVar, avmb avmbVar) {
        this.f = aunnVar;
        this.a = awmdVar;
        this.g = aunnVar2;
        this.b = avmbVar;
        hhb hhbVar = new hhb(this);
        new avmm().e(abvnVar.N().N().L(((hji) hhbVar.a).b).al(new hjd(hhbVar, 6), new gfh(16)), abvnVar.P().N().L(((hji) hhbVar.a).b).al(new hjd(hhbVar, 7), new gfh(16)));
        ((acdq) aunnVar.io()).w(this);
    }

    public final void a() {
        acek acekVar = this.h;
        if (acekVar != null) {
            acekVar.a();
        }
    }

    @Override // defpackage.acel
    public final int b() {
        int iOrdinal = ((jan) this.a.io()).b().ordinal();
        if (iOrdinal == 0) {
            return R.drawable.shuffle_padded_delhi_off;
        }
        if (iOrdinal == 1) {
            return R.drawable.shuffle_padded_delhi_indicator;
        }
        if (iOrdinal == 2) {
            return R.drawable.shuffle_padded_delhi_disabled;
        }
        throw new RuntimeException(null, null);
    }

    @Override // defpackage.acel
    public final int c() {
        int iOrdinal = ((jan) this.a.io()).b().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return R.string.accessibility_shuffle_on;
            }
            if (iOrdinal != 2) {
                throw new RuntimeException(null, null);
            }
        }
        return R.string.accessibility_shuffle_off;
    }

    @Override // defpackage.acel
    public final int d() {
        return 256985;
    }

    @Override // defpackage.acel
    public final String e() {
        return "shuffle_action";
    }

    @Override // defpackage.acel
    public final void g(acek acekVar) {
        this.h = acekVar;
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        if (!hgm.b(this.e) || (i & 262144) == 0) {
            return;
        }
        a();
    }

    @Override // defpackage.acel
    public final boolean h() {
        return (!this.d || ((jan) this.a.io()).b().equals(icz.c) || (hgm.b(this.e) && ((acdq) this.f.io()).D())) ? false : true;
    }

    @Override // defpackage.acel
    public final void i() {
        ((aceu) this.g.io()).e(true);
        ((jan) this.a.io()).f();
    }

    @Override // defpackage.acel
    public final void j() {
    }
}
