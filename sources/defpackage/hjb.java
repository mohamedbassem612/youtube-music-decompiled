package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class hjb implements acel, hha {
    private final hhd a;
    private final zwb b;
    private final adxj c;
    private acek d;
    private amlg e;
    private boolean f;
    private boolean g;

    public hjb(hhd hhdVar, zwb zwbVar, adxj adxjVar) {
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
        amlg amlgVar2 = amlg.DISLIKE;
        adxj adxjVar = this.c;
        return amlgVar == amlgVar2 ? adxjVar.b(arqz.dh) : adxjVar.b(arqz.nO);
    }

    @Override // defpackage.acel
    public final int c() {
        return this.e == amlg.DISLIKE ? R.string.accessibility_undo_dislike_video : R.string.accessibility_dislike_video;
    }

    @Override // defpackage.acel
    public int d() {
        return 256981;
    }

    @Override // defpackage.acel
    public String e() {
        return "thumbs_down_action";
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
        amlg amlgVar2 = amlg.DISLIKE;
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
