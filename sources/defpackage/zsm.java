package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zsm extends zsi implements zsk {
    protected final tzs a;
    private final vxz b;
    private final vwt c;

    public zsm(tzs tzsVar, vxz vxzVar, boolean z, abmt abmtVar) {
        tzsVar.getClass();
        this.a = tzsVar;
        this.b = vxzVar;
        dov dovVar = new dov((short[]) null, (byte[]) null);
        aawb.am(dovVar, z, abmtVar);
        aawb.an(dovVar, z, abmtVar);
        this.c = dovVar.ax();
    }

    @Override // defpackage.zsk
    public final /* synthetic */ Object b(Object obj) {
        acca accaVar = ((acap) obj).a;
        typ.f(accaVar.d);
        String str = accaVar.m;
        vxz vxzVar = this.b;
        tge tgeVarA = tgf.a(str);
        if (vxzVar.m(14, 45627566L)) {
            tgeVarA.d(tok.PLAYER_CAPTIONS_CLIENT_REQUEST);
        }
        return tgeVarA.a();
    }

    @Override // defpackage.zsi
    protected final Object g(InputStream inputStream) throws tzn {
        try {
            return ((zwz) this.a.a(inputStream, this.c)).a();
        } catch (Exception e) {
            throw new tzn(e);
        }
    }
}
