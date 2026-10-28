package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class adlo implements adky {
    public final adkz a;
    public int b;
    final /* synthetic */ adlq c;
    private int d;

    public adlo(adlq adlqVar, adkz adkzVar) {
        this.c = adlqVar;
        adkzVar.getClass();
        this.a = adkzVar;
        this.b = 0;
        this.d = adkzVar.a();
    }

    public final int b(int i) {
        return i - this.b;
    }

    @Override // defpackage.tbj
    public void d(int i, int i2) {
        adlq adlqVar = this.c;
        adlqVar.r();
        adlqVar.z(this.b + i, i2);
        this.d = this.a.a();
    }

    public final int f() {
        return this.b + this.a.a();
    }

    @Override // defpackage.adky
    public void jS() {
        adlq adlqVar = this.c;
        adlqVar.r();
        int iA = this.a.a();
        int iMin = Math.min(this.d, iA);
        if (iMin > 0) {
            adlqVar.y(this.b, iMin);
        }
        int i = this.d;
        if (i > iMin) {
            adlqVar.A(this.b + iMin, i - iMin);
        } else if (iA > iMin) {
            adlqVar.z(this.b + iMin, iA - iMin);
        }
        this.d = iA;
    }

    @Override // defpackage.tbj
    public void jT(int i, int i2) {
        adlq adlqVar = this.c;
        adlqVar.r();
        adlqVar.y(this.b + i, i2);
        this.d = this.a.a();
    }

    @Override // defpackage.tbj
    public void jU(int i, int i2) {
        adlq adlqVar = this.c;
        adlqVar.r();
        adlqVar.A(this.b + i, i2);
        this.d = this.a.a();
    }

    @Override // defpackage.tbj
    public void k(int i, int i2) {
        adlq adlqVar = this.c;
        adlqVar.r();
        int i3 = this.b;
        adlqVar.C(i + i3, i3 + i2);
        this.d = this.a.a();
    }
}
