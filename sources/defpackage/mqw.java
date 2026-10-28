package defpackage;

import app.rive.semantics.SemanticState;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class mqw implements avnn {
    private final int a;
    private final agkj b;
    private final mqx c;

    public mqw(int i, agkj agkjVar, mqx mqxVar) {
        this.a = i;
        this.b = agkjVar;
        this.c = mqxVar;
    }

    @Override // defpackage.avnn
    public final /* synthetic */ Object a(Object obj) {
        HashMap map = new HashMap();
        agqr it = ((agkj) obj).entrySet().iterator();
        while (it.hasNext()) {
            agkj agkjVar = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            Integer num = (Integer) agkjVar.get(entry.getKey());
            num.getClass();
            num.intValue();
            map.put(num, new qcb((byte[]) entry.getValue(), null));
        }
        aigm aigmVarM = aigm.M(this.c.a);
        aigk aigkVar = (aigk) aigmVarM;
        aigkVar.a = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        aigr aigrVar = new aigr(byteArrayOutputStream, SemanticState.Obscured);
        while (!aigmVarM.D()) {
            int iN = aigmVarM.n();
            int i = iN >>> 3;
            int i2 = iN & 7;
            if (i2 == 0) {
                aigrVar.z(i, aigkVar.s());
            } else if (i2 == 1) {
                aigrVar.m(i, aigkVar.r());
            } else if (i2 == 2) {
                qcb qcbVar = (qcb) map.remove(Integer.valueOf(i));
                if (qcbVar == null) {
                    aigrVar.i(i, aigmVarM.w());
                } else {
                    aigmVarM.F(iN);
                    qcbVar.f(iN, aigrVar);
                }
            } else if (i2 == 5) {
                aigrVar.k(i, aigkVar.j());
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            ((qcb) entry2.getValue()).f((((Integer) entry2.getKey()).intValue() << 3) | 2, aigrVar);
        }
        aigrVar.d();
        return new mqx(byteArrayOutputStream.toByteArray()).b(this.a);
    }
}
