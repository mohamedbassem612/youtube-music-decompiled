package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fxy extends fyv {
    private final fyl b;

    public fxy(fyl fylVar) {
        this.b = fylVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [fyy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [fzb] */
    /* JADX WARN: Type inference failed for: r5v2, types: [fyr] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [fyv] */
    @Override // defpackage.fyv, defpackage.fyy
    public final fyy gR(String str, kwq kwqVar, List list) {
        ?? fzbVar;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    fxw.i("getEventName", 0, list);
                    fzbVar = new fzb(this.b.b.a);
                    return fzbVar;
                }
                return super.gR(str, kwqVar, list);
            case 45521504:
                if (str.equals("getTimestamp")) {
                    fxw.i("getTimestamp", 0, list);
                    fzbVar = new fyr(Double.valueOf(this.b.b.b));
                    return fzbVar;
                }
                return super.gR(str, kwqVar, list);
            case 146575578:
                if (str.equals("getParamValue")) {
                    fxw.i("getParamValue", 1, list);
                    return fhz.at(this.b.b.b(kwqVar.v((fyy) list.get(0)).i()));
                }
                return super.gR(str, kwqVar, list);
            case 700587132:
                if (str.equals("getParams")) {
                    fxw.i("getParams", 0, list);
                    Map map = this.b.b.c;
                    fzbVar = new fyv();
                    for (String str2 : map.keySet()) {
                        fzbVar.r(str2, fhz.at(map.get(str2)));
                    }
                    return fzbVar;
                }
                return super.gR(str, kwqVar, list);
            case 920706790:
                if (str.equals("setParamValue")) {
                    fxw.i("setParamValue", 2, list);
                    String strI = kwqVar.v((fyy) list.get(0)).i();
                    fyy fyyVarV = kwqVar.v((fyy) list.get(1));
                    fyk fykVar = this.b.b;
                    Object objE = fxw.e(fyyVarV);
                    if (objE == null) {
                        fykVar.c.remove(strI);
                    } else {
                        Map map2 = fykVar.c;
                        map2.put(strI, fyk.c(strI, map2.get(strI), objE));
                    }
                    return fyyVarV;
                }
                return super.gR(str, kwqVar, list);
            case 1570616835:
                if (str.equals("setEventName")) {
                    fxw.i("setEventName", 1, list);
                    fyy fyyVarV2 = kwqVar.v((fyy) list.get(0));
                    if (f.equals(fyyVarV2) || g.equals(fyyVarV2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    this.b.b.a = fyyVarV2.i();
                    return new fzb(fyyVarV2.i());
                }
                return super.gR(str, kwqVar, list);
            default:
                return super.gR(str, kwqVar, list);
        }
    }
}
