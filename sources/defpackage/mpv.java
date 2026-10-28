package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mpv implements nyb {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ mpv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, ntq] */
    @Override // defpackage.nyb
    public final void a(int i, nal nalVar) {
        int i2 = this.$cid;
        if (i2 == 0) {
            int i3 = nalVar.i() - 1;
            Object obj = this.a;
            if (i3 != 2) {
                ((fgv) obj).J(i, nalVar.co());
                return;
            }
            float fCo = nalVar.co() * 100.0f;
            fgs fgsVar = (fgs) ((fgv) obj).b.k().E();
            fgsVar.a |= 16777216;
            if (fgsVar.x == null) {
                fgsVar.x = new fik();
            }
            fgsVar.x.e(i, fCo);
            return;
        }
        if (i2 == 1) {
            Set set = mpo.a;
            this.a.a().K(i, nalVar.co());
            return;
        }
        int i4 = nalVar.i() - 1;
        Object obj2 = this.a;
        if (i4 != 2) {
            fgv fgvVar = (fgv) obj2;
            fgvVar.Q(i, fgvVar.c.z(nalVar.co()));
        } else {
            float fCo2 = nalVar.co() * 100.0f;
            fgs fgsVar2 = (fgs) ((fgv) obj2).b.k().E();
            fgsVar2.a |= 67108864;
            if (fgsVar2.v == null) {
                fgsVar2.v = new fik();
            }
            fgsVar2.v.e(i, fCo2);
        }
    }
}
