package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acob implements vqi {
    final /* synthetic */ acoi a;

    public acob(acoi acoiVar) {
        this.a = acoiVar;
    }

    @Override // defpackage.vqi
    public final void a(vob vobVar) {
        acoi acoiVar = this.a;
        acoiVar.T(acoiVar.bS.b(vobVar));
        if (acoiVar.ci.b(acoiVar.getContext())) {
            acoiVar.bS.a(vobVar);
        }
        acoiVar.ap();
        if (vobVar == null && acoiVar.ck.aM()) {
            acoiVar.q.g();
        }
        acoq acoqVar = acoiVar.bS;
        String str = null;
        if (vobVar != null) {
            String strW = vobVar.w();
            if (strW != null && acoqVar.h.a(acoqVar.a, strW)) {
                str = strW;
            }
        } else if (acoqVar.g) {
            str = acoqVar.d;
        }
        acoqVar.d = str;
    }
}
