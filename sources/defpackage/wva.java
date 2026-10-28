package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wva extends wnn {
    public final wnh c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public wva(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.e = zwbVar;
        int i = 6;
        int i2 = 7;
        this.c = f(altj.a, wlpVar, new wqy(i), new wrj(i2));
        int i3 = 8;
        this.d = f(altm.a, wlpVar, new wqy(13), new wrj(i3));
        this.g = f(altb.a, wlpVar, new wqy(i2), new wrj(0));
        this.f = f(alto.a, wlpVar, new wqy(i3), new wrj(2));
        f(alth.a, wlpVar, new wqy(9), new wrj(3));
        f(altf.a, wlpVar, new wqy(10), new wrj(4));
        f(altd.a, wlpVar, new wqy(11), new wrj(5));
        f(alsx.a, wlpVar, new wqy(12), new wrj(i));
    }

    public wva(wlp wlpVar, abxv abxvVar, zwb zwbVar, vxz vxzVar, zwy zwyVar, tgg tggVar, Executor executor) {
        super(abxvVar, tggVar);
        this.d = zwbVar;
        this.e = executor;
        this.g = vxzVar;
        this.f = zwyVar;
        this.c = f(aluj.a, wlpVar, new wut(5), new wvb(1));
    }
}
