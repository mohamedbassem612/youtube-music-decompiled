package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kam extends khj {
    public final /* synthetic */ kan a;

    public kam(kan kanVar) {
        this.a = kanVar;
    }

    @Override // defpackage.khk
    public final void b(jzt jztVar, String str, String str2, boolean z) {
        kan kanVar = this.a;
        kanVar.g = jztVar;
        kanVar.h = str;
        kgz kgzVar = new kgz(new Status(0, null, null, null), jztVar, str, str2, z);
        synchronized (kanVar.f) {
            kjc kjcVar = kanVar.s;
            if (kjcVar != null) {
                kjcVar.x(kgzVar);
            }
            kanVar.s = null;
        }
    }

    @Override // defpackage.khk
    public final void c(int i) {
        this.a.q(i);
    }

    @Override // defpackage.khk
    public final void d(int i) {
        kan kanVar = this.a;
        kanVar.s(i);
        if (kanVar.u != null) {
            kanVar.m().post(new awu(this, i, 15));
        }
    }

    @Override // defpackage.khk
    public final void e(int i) {
        this.a.s(i);
    }

    @Override // defpackage.khk
    public final void f(kgq kgqVar) {
        this.a.m().post(new jmi(this, kgqVar, 6));
    }

    @Override // defpackage.khk
    public final void g(int i) {
        this.a.s(i);
    }

    @Override // defpackage.khk
    public final void h(int i) {
        this.a.m().post(new awu(this, i, 14));
    }

    @Override // defpackage.khk
    public final void i(khf khfVar) {
        this.a.m().post(new jmi(this, khfVar, 5));
    }

    @Override // defpackage.khk
    public final void j(int i) {
        this.a.m().post(new awu(this, i, 13));
    }

    @Override // defpackage.khk
    public final void k(int i) {
        this.a.m().post(new awu(this, i, 16));
    }

    @Override // defpackage.khk
    public final void l(String str, String str2) {
        khn khnVar = kan.a;
        khn.e();
        this.a.m().post(new gwb((Object) this, (Object) str, (Object) str2, 11, (byte[]) null));
    }

    @Override // defpackage.khk
    public final void m(long j) {
        this.a.r(j, 0);
    }

    @Override // defpackage.khk
    public final void n(long j, int i) {
        this.a.r(j, i);
    }

    @Override // defpackage.khk
    public final void o() {
        khn khnVar = kan.a;
        khn.e();
    }

    @Override // defpackage.khk
    public final void p(byte[] bArr) {
        khn khnVar = kan.a;
        int length = bArr.length;
        khn.e();
    }
}
