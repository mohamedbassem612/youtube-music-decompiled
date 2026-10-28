package defpackage;

import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iey implements tbj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public iey(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [awmd, java.lang.Object] */
    @Override // defpackage.tbj
    public final void d(int i, int i2) {
        int i3 = this.$cid;
        Object obj = this.a;
        if (i3 != 0) {
            jan janVar = (jan) obj;
            if (((ycp) janVar.c).e == null || janVar.h() || !janVar.i()) {
                return;
            }
            janVar.e();
            return;
        }
        isi isiVar = (isi) obj;
        if (isiVar.j() || !Collection.EL.stream(((abjp) isiVar.b.io()).o(0)).anyMatch(new hud(13))) {
            return;
        }
        agrx agrxVar = agso.a;
        isiVar.i(true);
    }

    @Override // defpackage.tbj
    public final void jT(int i, int i2) {
        if (this.$cid != 0) {
            jan janVar = (jan) this.a;
            if (janVar.i()) {
                janVar.e();
            }
        }
    }

    @Override // defpackage.tbj
    public final void jU(int i, int i2) {
        if (this.$cid != 0) {
            jan janVar = (jan) this.a;
            if (janVar.h() || !janVar.i()) {
                return;
            }
            janVar.e();
        }
    }

    @Override // defpackage.tbj
    public final void k(int i, int i2) {
    }
}
