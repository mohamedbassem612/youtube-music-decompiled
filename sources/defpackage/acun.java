package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acun extends absg {
    public final Map a;
    public final vxz j;
    private final awly k;
    private String l;

    public acun(Context context, absl abslVar, vxz vxzVar) {
        super(context, abslVar);
        this.a = new HashMap();
        this.k = new awli().az();
        this.j = vxzVar;
    }

    private final Optional v() {
        String str = this.l;
        acnm acnmVar = null;
        if (str != null) {
            Map map = this.a;
            if (map.containsKey(str)) {
                acnmVar = (acnm) map.get(this.l);
            }
        }
        return acnmVar != null ? acnmVar.a() : Optional.empty();
    }

    private final void w(boolean z) {
        if (z) {
            p();
        }
    }

    @Override // defpackage.absg
    protected final zwa b() {
        Optional optionalV = v();
        if (true == optionalV.isPresent()) {
            optionalV = Optional.ofNullable(((acnn) optionalV.get()).hw());
        }
        return (zwa) optionalV.orElse(null);
    }

    @Override // defpackage.absg
    public final void e() {
        w(true);
    }

    public final void f(acnm acnmVar, String str) {
        if (acnmVar == null || str == null || str.isEmpty()) {
            return;
        }
        this.l = str;
        Map map = this.a;
        if (!map.containsKey(str)) {
            map.put(this.l, acnmVar);
        }
        if (this.j.l(91, 45647746L, false)) {
            this.k.kk(v());
        }
    }

    @Override // defpackage.absg
    protected final boolean g() {
        zwa zwaVarB = b();
        return (zwaVarB == null || zwaVarB.h()) ? false : true;
    }

    @Override // defpackage.absg
    public final void n() {
        super.n();
        if (s()) {
            q(false);
        }
    }

    @Override // defpackage.absg
    protected final void o() {
        this.e = k();
        q(false);
        w(l().booleanValue());
    }
}
