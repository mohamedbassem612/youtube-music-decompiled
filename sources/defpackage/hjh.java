package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjh implements acel, acdp {
    private final /* synthetic */ int $cid;
    private final hgy a;
    private final acdq b;
    private final adxj c;
    private acek d;

    public hjh(hgy hgyVar, acdq acdqVar, adxj adxjVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = hgyVar;
        this.b = acdqVar;
        this.c = adxjVar;
        acdqVar.w(this);
    }

    @Override // defpackage.acel
    public final int b() {
        int i = this.$cid;
        adxj adxjVar = this.c;
        return i != 0 ? adxjVar.b(arqz.mE) : adxjVar.b(arqz.mw);
    }

    @Override // defpackage.acel
    public final int c() {
        return this.$cid != 0 ? R.string.accessibility_fast_forward_30_seconds : R.string.accessibility_rewind;
    }

    @Override // defpackage.acel
    public final int d() {
        return this.$cid != 0 ? 256986 : 256987;
    }

    @Override // defpackage.acel
    public final String e() {
        return this.$cid != 0 ? "fast_forward_action" : "rewind_action";
    }

    @Override // defpackage.acel
    public final void g(acek acekVar) {
        int i = this.$cid;
        this.d = acekVar;
    }

    @Override // defpackage.acdp
    public final void gU(int i) {
        acek acekVar;
        acek acekVar2;
        int i2 = i & 262144;
        if (this.$cid != 0) {
            if (i2 == 0 || (acekVar2 = this.d) == null) {
                return;
            }
            acekVar2.a();
            return;
        }
        if (i2 == 0 || (acekVar = this.d) == null) {
            return;
        }
        acekVar.a();
    }

    @Override // defpackage.acel
    public final boolean h() {
        int i = this.$cid;
        acdq acdqVar = this.b;
        return i != 0 ? acdqVar.D() : acdqVar.D();
    }

    @Override // defpackage.acel
    public final void i() {
        int i = this.$cid;
        hgy hgyVar = this.a;
        if (i != 0) {
            hgyVar.b();
        } else {
            hgyVar.e();
        }
    }

    public hjh(hgy hgyVar, acdq acdqVar, adxj adxjVar, int i) {
        this.$cid = i;
        this.a = hgyVar;
        this.b = acdqVar;
        this.c = adxjVar;
        acdqVar.w(this);
    }

    @Override // defpackage.acel
    public final void j() {
    }
}
