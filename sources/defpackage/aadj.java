package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aadj implements aarp {
    public final /* synthetic */ aadk a;

    public aadj(aadk aadkVar) {
        this.a = aadkVar;
    }

    @Override // defpackage.aarp
    public final void d(aamw aamwVar) {
        if (aarq.l(aamwVar)) {
            aadk aadkVar = this.a;
            aadkVar.h.execute(new aadi(this, aamwVar, 3));
        }
    }

    @Override // defpackage.aarp
    public final void e(aamw aamwVar) {
        if (aarq.l(aamwVar)) {
            aadk aadkVar = this.a;
            aadkVar.h.execute(new aadi(this, aamwVar, 2));
        }
    }

    @Override // defpackage.aarp
    public final void f(aamw aamwVar) {
        if (aarq.l(aamwVar)) {
            aamb aambVar = aamwVar.f;
            this.a.o(aarq.e(aambVar), aambVar.f("playlist_id"));
        }
    }

    @Override // defpackage.aarp
    public final void g() {
        this.a.h.execute(new ztg(this, 19));
    }

    @Override // defpackage.aarp
    public final void h(aamw aamwVar) {
        if (aarq.l(aamwVar)) {
            aadk aadkVar = this.a;
            aadkVar.h.execute(new aadi(this, aamwVar, 0));
        }
    }

    @Override // defpackage.aarp
    public final void k(aamw aamwVar, aogv aogvVar, aamg aamgVar) {
        if (aarq.l(aamwVar)) {
            aadk aadkVar = this.a;
            aadkVar.h.execute(new aadi(this, aamwVar, 4));
        }
    }

    public final void m(aamw aamwVar) {
        String strE = aarq.e(aamwVar.f);
        aadk aadkVar = this.a;
        for (aaqw aaqwVar : ((aaqu) aadkVar.r.io()).c(strE)) {
            if (aaqwVar.c(aamwVar)) {
                aadkVar.i(aaqwVar.a());
            }
        }
    }

    @Override // defpackage.aarp
    public final void c() {
    }

    @Override // defpackage.aarp
    public final void a(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void b(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void i(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void j(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void l(aamw aamwVar) {
    }
}
