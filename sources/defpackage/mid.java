package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mid implements mky {
    @Override // defpackage.mky
    public final fgv a(fhd fhdVar, nsl nslVar, Object obj, String str, nds ndsVar, mip mipVar, List list) {
        mjd mjdVar = new mjd(fhdVar, new mje());
        mjdVar.e(list);
        mep mepVar = ndn.ae;
        if (ndsVar.e(mepVar)) {
            mjdVar.i(mjg.a(((ndn) ndsVar.d(mepVar)).J()));
        } else {
            mjdVar.i(1);
        }
        mep mepVar2 = nce.Y;
        if (ndsVar.e(mepVar2)) {
            nce nceVar = (nce) ndsVar.d(mepVar2);
            if (nceVar.h()) {
                mjdVar.g(nceVar.g());
            }
        }
        mep mepVar3 = mwo.B;
        if (ndsVar.e(mepVar3)) {
            mwo mwoVar = (mwo) ndsVar.d(mepVar3);
            if (mwoVar.m()) {
                mjdVar.w(mwoVar.k());
            } else {
                mjdVar.w(true);
            }
        } else {
            mjdVar.w(true);
        }
        return mjdVar;
    }
}
