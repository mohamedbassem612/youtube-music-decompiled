package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hjc implements acel, hha {
    private final hhd a;
    private final zwb b;
    private final adxj c;
    private acek d;
    private amlg e = amlg.INDIFFERENT;
    private boolean f;
    private boolean g;

    public hjc(hhd hhdVar, zwb zwbVar, adxj adxjVar) {
        this.a = hhdVar;
        this.b = zwbVar;
        this.c = adxjVar;
        hhdVar.b(this);
    }

    private final void k() {
        acek acekVar = this.d;
        if (acekVar != null) {
            acekVar.a();
        }
    }

    @Override // defpackage.hha
    public final void a(hgz hgzVar) {
        boolean z = false;
        if (hgzVar != null && hgzVar.b) {
            z = true;
        }
        amlg amlgVar = hgzVar != null ? hgzVar.a : amlg.INDIFFERENT;
        if (z == this.f && amlgVar == this.e) {
            return;
        }
        this.f = z;
        this.e = amlgVar;
        k();
    }

    @Override // defpackage.acel
    public final int b() {
        amlg amlgVar = this.e;
        amlg amlgVar2 = amlg.LIKE;
        adxj adxjVar = this.c;
        return amlgVar == amlgVar2 ? adxjVar.b(arqz.dm) : adxjVar.b(arqz.nS);
    }

    @Override // defpackage.acel
    public final int c() {
        return this.e == amlg.LIKE ? R.string.accessibility_undo_like_video : R.string.accessibility_like_video;
    }

    @Override // defpackage.acel
    public int d() {
        return 256980;
    }

    @Override // defpackage.acel
    public String e() {
        return "thumbs_up_action";
    }

    final void f(boolean z) {
        boolean zH = h();
        this.g = z;
        if (zH != h()) {
            k();
        }
    }

    @Override // defpackage.acel
    public final void g(acek acekVar) {
        this.d = acekVar;
    }

    @Override // defpackage.acel
    public final boolean h() {
        return !this.g && this.f && this.b.u();
    }

    @Override // defpackage.acel
    public final void i() {
        amlh amlhVar;
        hhd hhdVar = this.a;
        hgz hgzVar = hhdVar.e;
        if (hgzVar == null || !hgzVar.b || (amlhVar = hgzVar.c) == null) {
            return;
        }
        amlg amlgVar = hgzVar.a;
        amlg amlgVar2 = amlg.LIKE;
        if (amlgVar == amlgVar2) {
            hhdVar.a(amlg.INDIFFERENT, amlhVar.c);
        } else {
            hhdVar.a(amlgVar2, amlhVar.c);
        }
    }

    @Override // defpackage.acel
    public final void j() {
    }
}
