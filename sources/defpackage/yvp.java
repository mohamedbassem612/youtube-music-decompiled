package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yvp extends zyn {
    private final zza l;

    public yvp(String str, zza zzaVar) {
        super(2, str, zzaVar);
        this.l = zzaVar;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final boolean E() {
        return true;
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        try {
            return tnx.e(tnmVar.e());
        } catch (Exception e) {
            return tnx.d(new tnp(e));
        }
    }

    @Override // defpackage.tns
    public final Class ab() {
        return byte[].class;
    }

    @Override // defpackage.tns
    public final /* bridge */ /* synthetic */ void ad(Object obj) {
        ((ahch) this.l).set((byte[]) obj);
    }

    @Override // defpackage.tmn, defpackage.tns
    public final tnr af() {
        return tnr.d;
    }
}
