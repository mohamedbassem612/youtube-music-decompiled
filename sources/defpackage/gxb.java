package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gxb extends gut {
    private final awmd a;
    private final awmd b;
    private final aczl c;
    private final ahgb d;

    public gxb(awmd awmdVar, awmd awmdVar2, aczl aczlVar, ahgb ahgbVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = aczlVar;
        this.d = ahgbVar;
    }

    @Override // defpackage.gut, defpackage.vxc
    public final void c(ajwo ajwoVar, Map map) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apme.a);
        ajwoVar.c(aihlVarCheckIsLite);
        ahno.F(ajwoVar.j.n(aihlVarCheckIsLite.d));
        awmd awmdVar = this.b;
        if (((ico) awmdVar.io()).h()) {
            return;
        }
        xgn xgnVar = (xgn) tym.U(map, "com.google.android.libraries.youtube.logging.interaction_logger", xgn.class);
        int i = 0;
        if (((ico) awmdVar.io()).j()) {
            aigj aigjVar = ajwoVar.c;
            List listO = ((abjp) this.a.io()).o(0);
            ArrayList arrayList = new ArrayList(listO.size());
            while (i < listO.size()) {
                arrayList.add(((hyz) listO.get(i)).t());
                i++;
            }
            if (aigjVar != null && xgnVar != null) {
                xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(aigjVar, (amud) null), null);
            }
            this.c.v(arrayList, aigjVar, xgnVar, null);
            return;
        }
        if (((ico) awmdVar.io()).i()) {
            List listO2 = ((abjp) this.a.io()).o(0);
            ArrayList arrayList2 = new ArrayList(listO2.size());
            while (i < listO2.size()) {
                apzf apzfVarQ = gzj.Q(((hyz) listO2.get(i)).n());
                if (apzfVarQ != null && (apzfVarQ.c & 1) != 0) {
                    arrayList2.add(apzfVarQ.d);
                }
                i++;
            }
            this.d.X(arrayList2, xgnVar);
        }
    }
}
