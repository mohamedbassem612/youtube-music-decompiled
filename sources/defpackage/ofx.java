package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ofx implements ofw {
    public final /* synthetic */ ofh a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ofx(ofh ofhVar, Set set, boolean z) {
        this.a = ofhVar;
        this.b = set;
        this.c = z;
    }

    @Override // defpackage.ofw
    public final String a(Map map) {
        Iterable<Number> iterableB = nrz.b(map.get(this.a));
        Set set = this.b;
        if (set != null) {
            iterableB = nrz.a(iterableB, set, this.c);
        }
        if (iterableB == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Number number : iterableB) {
            if (number.longValue() != 0) {
                sb.append(number);
            }
            sb.append(',');
        }
        return sb.substring(0, sb.length() - 1);
    }
}
