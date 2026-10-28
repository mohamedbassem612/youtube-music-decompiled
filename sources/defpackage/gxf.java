package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gxf extends gut {
    private final aunn a;

    public gxf(aunn aunnVar) {
        this.a = aunnVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apqe.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        int i = ((apqe) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c;
        int iBi = a.bi(i);
        if (iBi == 0) {
            iBi = 1;
        }
        int i2 = iBi - 1;
        if (i2 == 1) {
            aunn aunnVar = this.a;
            if (((abvk) aunnVar.io()).X()) {
                return;
            }
            ((abvk) aunnVar.io()).A();
            return;
        }
        if (i2 != 2) {
            int iBi2 = a.bi(i);
            int i3 = iBi2 != 0 ? iBi2 : 1;
            StringBuilder sb = new StringBuilder("Playback action not supported: ");
            sb.append(i3 - 1);
            throw new UnsupportedOperationException(sb.toString());
        }
        aunn aunnVar2 = this.a;
        if (((abvk) aunnVar2.io()).X()) {
            ((abvk) aunnVar2.io()).ap(false, 19);
        }
    }
}
