package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgn implements acep {
    public boolean a;
    private final hwv b;
    private final awmd c;
    private final aunn d;
    private final aunn e;
    private final aunn f;
    private final aunn g;
    private avmn h;

    public hgn(hwv hwvVar, awmd awmdVar, aunn aunnVar, aunn aunnVar2, avlh avlhVar, aunn aunnVar3, aunn aunnVar4) {
        this.b = hwvVar;
        this.c = awmdVar;
        this.d = aunnVar;
        this.e = aunnVar2;
        this.f = aunnVar3;
        this.g = aunnVar4;
        avmn avmnVar = this.h;
        if (avmnVar == null || avmnVar.f()) {
            this.h = avlhVar.i(new abwr(1)).p().al(new gem(this, 12), new gfh(8));
        }
    }

    private final boolean i() {
        awmd awmdVar = this.c;
        if (awmdVar.io() != null) {
            abjr abjrVar = ((abjp) awmdVar.io()).b;
            if (!((abjp) awmdVar.io()).b.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.acep
    public final long a(acdq acdqVar, long j) {
        hjf hjfVar = (hjf) this.e.io();
        if (acdqVar.z()) {
            j |= 512;
        }
        if (hjfVar.e.h()) {
            j |= 2097152;
        }
        if (hjfVar.d.h()) {
            j |= 262144;
        }
        if (!hgm.e(acdqVar.D(), hjfVar.i, hjfVar.j)) {
            j &= -17;
        }
        if (!hgm.d(acdqVar.D(), hjfVar.i, hjfVar.j)) {
            j &= -33;
        }
        return j | 240769;
    }

    @Override // defpackage.acep
    public final long b() {
        hyz hyzVar;
        if (!this.b.a() || (hyzVar = (hyz) ((abjp) this.c.io()).k(((jnj) this.f.io()).q())) == null) {
            return -1L;
        }
        return hyzVar.m();
    }

    @Override // defpackage.acep
    public final Bundle c(acdq acdqVar) {
        Bundle bundle = new Bundle();
        amlg amlgVarR = acdqVar.r();
        if (this.a && amlgVarR != null) {
            int iOrdinal = amlgVarR.ordinal();
            if (iOrdinal == 0) {
                bundle.putBoolean("waze.state.isThumbUp", true);
                bundle.putBoolean("waze.state.isThumbDown", false);
            } else if (iOrdinal == 1) {
                bundle.putBoolean("waze.state.isThumbUp", false);
                bundle.putBoolean("waze.state.isThumbDown", true);
            } else if (iOrdinal == 2) {
                bundle.putBoolean("waze.state.isThumbUp", false);
                bundle.putBoolean("waze.state.isThumbDown", false);
            }
        }
        return bundle;
    }

    @Override // defpackage.acep
    public final Bundle d() {
        hjf hjfVar = (hjf) this.e.io();
        boolean zD = ((acdq) hjfVar.c.io()).D();
        boolean z = hjfVar.i;
        String str = hjfVar.j;
        agkz agkzVar = hgm.a;
        str.getClass();
        Bundle bundle = new Bundle();
        boolean zE = hgm.e(zD, z, str);
        boolean zD2 = hgm.d(zD, z, str);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", zE);
        bundle.putBoolean("com.google.android.gms.car.media.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", zD2);
        return bundle;
    }

    @Override // defpackage.acep
    public final List e() {
        hjf hjfVar = (hjf) this.e.io();
        return ((acdq) hjfVar.c.io()).D() ? hjfVar.l : hjfVar.k;
    }

    @Override // defpackage.acep
    public final long f() {
        if (this.b.a() && i()) {
            return ((vxz) this.g.io()).l(14, 45716162L, false) ? 245431L : 241335L;
        }
        return 241204L;
    }

    @Override // defpackage.acep
    public final long g() {
        if (i()) {
            return ((vxz) this.g.io()).l(14, 45716162L, false) ? 245431L : 241335L;
        }
        return 240640L;
    }

    @Override // defpackage.acep
    public final void h(ek ekVar, acdq acdqVar) {
        hyz hyzVar;
        aoun aounVar;
        ekVar.e("android.media.metadata.ALBUM", acdqVar.s().toString());
        if (acdqVar.r() != null) {
            int iOrdinal = acdqVar.r().ordinal();
            if (iOrdinal == 0) {
                ekVar.d(RatingCompat.a(true));
            } else if (iOrdinal == 1) {
                ekVar.d(RatingCompat.a(false));
            } else if (iOrdinal == 2) {
                ekVar.d(RatingCompat.b(2));
            }
        }
        if (Build.VERSION.SDK_INT < 33 || (hyzVar = (hyz) ((abjp) this.c.io()).l()) == null) {
            return;
        }
        if (hyzVar instanceof hzf) {
            aounVar = ((hzf) hyzVar).a;
        } else {
            aounVar = hyzVar instanceof hzg ? ((hzg) hyzVar).c : null;
        }
        if (aounVar != null) {
            aoup aoupVar = aounVar.y;
            if (aoupVar == null) {
                aoupVar = aoup.a;
            }
            if (aoupVar.d) {
                ekVar.c("android.media.IS_EXPLICIT", 1L);
            }
        }
    }
}
