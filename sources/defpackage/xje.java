package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xje {
    public static final /* synthetic */ int b = 0;
    private static final agkz c = agkz.r("img_lf", "img_lc", "img_lerr");
    public final awmd a;
    private final awmd d;
    private final vxz e;

    public xje(awmd awmdVar, awmd awmdVar2, vxz vxzVar) {
        this.a = awmdVar;
        this.d = awmdVar2;
        this.e = vxzVar;
    }

    public final void a(String str) {
        if (c()) {
            ((xit) this.a.io()).g().d(269, str);
        }
    }

    public final void b(String str, String str2) {
        if (c()) {
            Optional optionalB = ((xit) this.a.io()).g().b(269, str);
            xdd xddVar = new xdd(str2, 4);
            if (true == optionalB.isPresent()) {
                ((xir) optionalB.get()).n((String) xddVar.a);
            }
            if (c.contains(str2)) {
                a(str);
            }
        }
    }

    public final boolean c() {
        vxz vxzVar = this.e;
        if (!vxzVar.l(50, 45425859L, false)) {
            return false;
        }
        float fA = (float) vxzVar.a(0, 45425862L, 0.0d);
        return fA > 0.0f && fA <= 1.0f && ((szb) this.d.io()).b(fA, szc.k);
    }
}
