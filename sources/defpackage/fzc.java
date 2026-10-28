package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fzc implements fyy {
    @Override // defpackage.fyy
    public final fyy d() {
        return fyy.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof fzc;
    }

    @Override // defpackage.fyy
    public final Boolean g() {
        return Boolean.FALSE;
    }

    @Override // defpackage.fyy
    public final fyy gR(String str, kwq kwqVar, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    @Override // defpackage.fyy
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.fyy
    public final String i() {
        return "undefined";
    }

    @Override // defpackage.fyy
    public final Iterator l() {
        return null;
    }
}
