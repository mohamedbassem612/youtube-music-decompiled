package defpackage;

import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uue implements utu {
    public final long a;
    private final int b;

    public uue(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // defpackage.utu
    public final utv a(auhs auhsVar) {
        throw null;
    }

    @Override // defpackage.utu
    public final /* synthetic */ utv b(auhs auhsVar) throws utw {
        int i = this.b;
        if (i <= 0) {
            throw new utw(new IllegalArgumentException("Attempting to move segment to Z index before the minimum allowed Z index. Ignoring."), this);
        }
        augy augyVar = (augy) usj.n(auhsVar, this.a).orElseThrow(new rzt(this, 11));
        int i2 = augyVar.g;
        if (i2 == i) {
            return new utt(agpi.a);
        }
        agke agkeVar = (agke) Collection.EL.stream(auhsVar.d).filter(new iab(augyVar, agpf.b(Integer.valueOf(Math.min(i2, i)), Integer.valueOf(Math.max(i2, i))), 3, null)).collect(aghu.a);
        agjz agjzVar = new agjz(4);
        int size = agkeVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            augy augyVar2 = (augy) agkeVar.get(i3);
            agjzVar.h(new uut(augyVar2.e, augyVar2.g + (i2 > i ? 1 : -1)));
        }
        agjzVar.h(new uut(augyVar.e, i));
        return new utt(agjzVar.g());
    }
}
