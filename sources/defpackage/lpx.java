package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lpx implements kni {
    public final lpt a;
    private final Status b;

    public lpx(Status status, lpt lptVar) {
        this.b = status;
        this.a = lptVar;
    }

    @Override // defpackage.kni
    public final Status a() {
        return this.b;
    }

    public final String toString() {
        lpt lptVar = this.a;
        kro.l(lptVar);
        return String.format("OptInOptionsResultImpl[%s]", Boolean.valueOf(lptVar.a == 1));
    }
}
