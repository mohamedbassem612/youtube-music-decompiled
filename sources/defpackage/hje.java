package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hje implements acel, acdp {
    public final awmd a;
    public final avmb b;
    public final avmm c;
    public boolean d;
    public String e;
    private final aunn f;
    private final avmm g;
    private acek h;
    private final hhb i;

    public hje(aunn aunnVar, awmd awmdVar, abvn abvnVar, avmb avmbVar) {
        hhb hhbVar = new hhb(this);
        this.i = hhbVar;
        avmm avmmVar = new avmm();
        this.g = avmmVar;
        this.c = new avmm();
        this.e = "";
        this.f = aunnVar;
        this.a = awmdVar;
        this.b = avmbVar;
        avmmVar.e(abvnVar.N().al(new hjd(hhbVar, 1), new gfh(13)), abvnVar.P().L(((hje) hhbVar.a).b).al(new hjd(hhbVar, 0), new gfh(13)));
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
        ibv ibvVar = ibv.LOOP_OFF;
        int iOrdinal = ((aesp) this.a.io()).q().ordinal();
        if (iOrdinal == 0) {
            return R.drawable.repeat_padded_delhi_off;
        }
        if (iOrdinal == 1) {
            return R.drawable.repeat_padded_delhi_indicator;
        }
        if (iOrdinal == 2) {
            return R.drawable.repeat_padded_delhi_one;
        }
        if (iOrdinal == 3) {
            return R.drawable.repeat_padded_delhi_disabled;
        }
        throw new RuntimeException(null, null);
    }

    @Override // defpackage.acel
    public final int c() {
        ibv ibvVar = ibv.LOOP_OFF;
        int iOrdinal = ((aesp) this.a.io()).q().ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? R.string.accessibility_repeat_off : R.string.accessibility_repeat_one;
        }
        return R.string.accessibility_repeat_on;
    }

    @Override // defpackage.acel
    public final int d() {
        return 256984;
    }

    @Override // defpackage.acel
    public final String e() {
        return "loop_mode_action";
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
        return (!this.d || ((aesp) this.a.io()).q().equals(ibv.LOOP_DISABLED) || (hgm.b(this.e) && ((acdq) this.f.io()).D())) ? false : true;
    }

    @Override // defpackage.acel
    public final void i() {
        ((aesp) this.a.io()).u();
    }

    @Override // defpackage.acel
    public final void j() {
    }
}
