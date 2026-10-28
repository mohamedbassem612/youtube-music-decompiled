package defpackage;

import android.os.Handler;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jki {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/util/BackStackUtil");
    public final aunn b;
    public final dd c;
    public final Handler d;
    public final vxz e;
    public final vxz f;

    public jki(dd ddVar, aunn aunnVar, Handler handler, vxz vxzVar, vxz vxzVar2) {
        this.b = aunnVar;
        this.c = ddVar;
        this.d = handler;
        this.e = vxzVar;
        this.f = vxzVar2;
    }

    public final cc a(int i) {
        String str;
        dd ddVar = this.c;
        int iB = ddVar.b();
        if (iB < i) {
            str = null;
        } else {
            str = iB == i ? ((hke) this.b.io()).c : ddVar.ag(iB - (i + 1)).m;
        }
        if (str != null) {
            return ddVar.g(str);
        }
        return null;
    }

    public final cc b() {
        String strE = e();
        if (strE != null) {
            return this.c.g(strE);
        }
        return null;
    }

    public final Optional c() {
        bpp bppVarB = b();
        return bppVarB instanceof hku ? Optional.of((hku) bppVarB) : Optional.empty();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [hku, java.lang.Object] */
    public final Optional d() {
        Optional optionalC = c();
        return true == optionalC.isPresent() ? optionalC.get().gS() : optionalC;
    }

    public final String e() {
        dd ddVar = this.c;
        int iB = ddVar.b();
        if (iB < 0) {
            return null;
        }
        return iB == 0 ? ((hke) this.b.io()).c : ddVar.ag(iB - 1).m;
    }

    public final void f() {
        dd ddVar = this.c;
        if (jku.e(ddVar)) {
            ddVar.ae(null, -1, 0);
        }
    }

    public final void g(cc ccVar) {
        if (i(ccVar)) {
            f();
        } else {
            this.c.n(new jkh(this, ccVar));
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [hku, java.lang.Object] */
    public final boolean h() {
        Optional optionalC = c();
        if (true == optionalC.isPresent()) {
            optionalC = Optional.ofNullable(Boolean.valueOf(optionalC.get().A()));
        }
        return ((Boolean) optionalC.orElse(Boolean.TRUE)).booleanValue();
    }

    public final boolean i(cc ccVar) {
        if (ccVar == null) {
            return false;
        }
        return ccVar.equals(b());
    }
}
