package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class gph extends qr {
    final /* synthetic */ gpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gph(gpl gplVar) {
        super(false);
        this.a = gplVar;
    }

    @Override // defpackage.qr
    public final void b() {
        gpl gplVar = this.a;
        gplVar.k();
        if (gplVar.ad() || !gplVar.H.l(225, 45767703L, false)) {
            return;
        }
        if (!gplVar.H.l(206, 45734052L, false)) {
            if (gplVar.s == null || !hdu.g.contains(gplVar.s.b())) {
                return;
            }
            gplVar.c.a(kro.ai("FEmusic_home"));
            return;
        }
        if (gplVar.ao == gpm.b && gplVar.y == null) {
            gplVar.c.a(kro.ai("FEmusic_home"));
        } else {
            gplVar.c.a(kro.ai("FEmusic_library_landing"));
        }
    }
}
