package defpackage;

import android.net.NetworkCapabilities;
import app.rive.semantics.SemanticState;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class odg extends odl {
    private final Map a;

    public odg(fxg fxgVar, ocu ocuVar, Map map, omj omjVar) {
        super("OIHjUnras6VexaBew92tZWT9UXIp7Ii9j0Jz2oMBGOXrVoYbfH3Dr3jwFahhbU73", "ISyVtAMdHwUVBtUoed3yeIQ6LffDXO6Qzz2cj8NSwCc=", fxgVar, ocuVar, omjVar.h(118));
        this.a = map;
    }

    @Override // defpackage.odl
    protected final void a(Method method, fxg fxgVar) {
        Object obj;
        Map map = this.a;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        synchronized (fxgVar) {
            long jLongValue = ((Long) objArr[0]).longValue();
            fxgVar.copyOnWrite();
            fxl fxlVar = (fxl) fxgVar.instance;
            fxl fxlVar2 = fxl.a;
            fxlVar.b |= SemanticState.ReadOnly;
            fxlVar.k = jLongValue;
            long jLongValue2 = ((Long) objArr[1]).longValue();
            if (jLongValue2 >= 0) {
                fxgVar.copyOnWrite();
                fxl fxlVar3 = (fxl) fxgVar.instance;
                fxlVar3.d |= SemanticState.Modal;
                fxlVar3.ae = jLongValue2;
            }
            long jLongValue3 = ((Long) objArr[2]).longValue();
            if (jLongValue3 >= 0) {
                fxgVar.copyOnWrite();
                fxl fxlVar4 = (fxl) fxgVar.instance;
                fxlVar4.d |= SemanticState.Obscured;
                fxlVar4.af = jLongValue3;
            }
            if (objArr.length > 3 && (obj = objArr[3]) != null) {
                int iAX = kro.aX(((Long) obj).intValue());
                if (iAX == 0) {
                    throw null;
                }
                fxgVar.copyOnWrite();
                fxl fxlVar5 = (fxl) fxgVar.instance;
                fxlVar5.ab = iAX - 1;
                fxlVar5.d |= 16;
            }
        }
    }
}
