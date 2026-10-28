package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jza extends jyv {
    final /* synthetic */ jyn a;
    final /* synthetic */ kjc b;

    public jza(jyn jynVar, kjc kjcVar) {
        this.a = jynVar;
        this.b = kjcVar;
    }

    @Override // defpackage.jyv
    public final void c(Status status, jyo jyoVar) {
        boolean z = this.a.n;
        kjc kjcVar = this.b;
        if (z) {
            jzb.d(status, jyoVar, kjcVar);
        } else {
            jzb.e(status, jyoVar, kjcVar);
        }
    }

    @Override // defpackage.jyv
    public final void d(Status status, jyo jyoVar) {
        boolean z = this.a.n;
        kjc kjcVar = this.b;
        if (z) {
            jzb.d(status, jyoVar, kjcVar);
        } else {
            jzb.e(status, jyoVar, kjcVar);
        }
    }
}
