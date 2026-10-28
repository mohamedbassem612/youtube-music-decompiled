package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class gin implements abqi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public gin(giq giqVar, int i) {
        this.$cid = i;
        this.a = giqVar;
    }

    @Override // defpackage.abqi
    public final abql a(abxv abxvVar, zwa zwaVar, byte[] bArr, yrr yrrVar, agke agkeVar, xir xirVar, int i) {
        int i2 = this.$cid;
        Object obj = this.a;
        if (i2 != 0) {
            ght ghtVar = ((giq) obj).a;
            return new abql((wlp) ghtVar.gL.io(), (vxu) ghtVar.at.io(), (vyo) ghtVar.av.io(), (abmt) ghtVar.cT.io(), abxvVar, zwaVar, bArr, yrrVar, agkeVar, xirVar, i);
        }
        ght ghtVar2 = ((giq) obj).a;
        return new abql((wlp) ghtVar2.gL.io(), (vxu) ghtVar2.at.io(), (vyo) ghtVar2.av.io(), (abmt) ghtVar2.cT.io(), abxvVar, zwaVar, bArr, yrrVar, agkeVar, xirVar, i);
    }
}
