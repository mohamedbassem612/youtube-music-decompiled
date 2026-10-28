package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xaf implements vxe {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ xaf(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void a(ajwo ajwoVar) {
        if (this.$cid != 0) {
            yno.eB(this, ajwoVar);
        } else {
            yno.eB(this, ajwoVar);
        }
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void b(List list) {
        if (this.$cid != 0) {
            yno.eC(this, list);
        } else {
            yno.eC(this, list);
        }
    }

    @Override // defpackage.vxe
    public final void c(ajwo ajwoVar, Map map) {
        if (this.$cid == 0) {
            xag xagVar = (xag) this.a;
            xagVar.d().c(ajwoVar, xagVar.e());
            return;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajts.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        ajts ajtsVar = (ajts) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if ((ajtsVar.c & 1) != 0) {
            ajtr ajtrVar = ajtsVar.d;
            if (ajtrVar == null) {
                ajtrVar = ajtr.a;
            }
            int iAV = a.aV(ajtrVar.b);
            if ((iAV != 0 ? iAV : 1) - 1 == 2) {
                swx swxVar = (swx) this.a;
                swxVar.h();
                swxVar.i();
            }
        }
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void d(List list, Map map) {
        if (this.$cid != 0) {
            yno.eD(this, list, map);
        } else {
            yno.eD(this, list, map);
        }
    }

    @Override // defpackage.vxe
    public final /* synthetic */ void e(List list, Object obj) {
        if (this.$cid != 0) {
            yno.eE(this, list, obj);
        } else {
            yno.eE(this, list, obj);
        }
    }
}
