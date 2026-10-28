package defpackage;

import android.os.Parcelable;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xhm extends xho {
    public static final Parcelable.Creator CREATOR = new kwo(16);

    public xhm(xgz xgzVar, Optional optional, amdd amddVar) {
        xhn xhnVar = new xhn(xgzVar.b());
        amec amecVarB = new xhn(xgzVar.b()).b();
        amud amudVarB = xgzVar.b();
        amudVarB.getClass();
        super(xhnVar, amecVarB, agke.n(new aihx(amudVarB.g, amud.a)), xgzVar.c(), optional, amddVar);
    }

    public xhm(amec amecVar, argn argnVar, Optional optional, amdd amddVar) {
        super(amecVar, argnVar, xho.b, optional, amddVar);
    }
}
