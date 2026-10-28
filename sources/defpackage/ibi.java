package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ibi implements abji {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ibi(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.abji
    public final void hp(Object obj, abjm abjmVar) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                ((awku) this.a).kk(new hzc((hyz) obj));
                return;
            } else {
                ((hxj) this.a).d((hyz) obj);
                return;
            }
        }
        hyz hyzVar = (hyz) obj;
        if (hyzVar != null) {
            ibn ibnVar = (ibn) this.a;
            if (ibnVar.g || !(hyzVar instanceof hzf)) {
                return;
            }
            aoun aounVar = ((hzf) hyzVar).a;
            ajwo ajwoVar = aounVar.l;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
            anzw anzwVarP = gzj.P(ajwoVar);
            ajwo ajwoVar2 = aounVar.l;
            if (ajwoVar2 == null) {
                ajwoVar2 = ajwo.a;
            }
            if (gzj.T(ajwoVar2)) {
                ibh ibhVar = ibh.ATV_PREFERRED;
                ibnVar.d(ibhVar);
                ibnVar.i.j(ibhVar);
            } else {
                if (ibnVar.j.C() || igs.c(anzwVarP)) {
                    return;
                }
                ibh ibhVar2 = ibh.OMV_PREFERRED;
                ibnVar.d(ibhVar2);
                ibnVar.i.j(ibhVar2);
            }
        }
    }
}
