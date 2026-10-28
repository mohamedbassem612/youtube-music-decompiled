package defpackage;

import android.text.TextUtils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ofz implements ofw {
    private final /* synthetic */ int $cid;
    final /* synthetic */ ofh a;
    final /* synthetic */ Object b;

    public ofz(ofh ofhVar, Object obj, int i) {
        this.$cid = i;
        this.a = ofhVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ofw
    public final String a(Map map) {
        int i = this.$cid;
        if (i == 0) {
            Iterable iterableB = nrz.b(map.get(this.a));
            if (iterableB == null) {
                return null;
            }
            ?? r5 = this.b;
            if (r5 != 0) {
                iterableB = nrz.a(iterableB, r5, true);
            }
            return TextUtils.join(",", iterableB);
        }
        ofh ofhVar = this.a;
        if (i == 1) {
            if (!(map.get(ofhVar) instanceof Double)) {
                return null;
            }
            return ((DecimalFormat) this.b).format(map.get(ofhVar));
        }
        Iterable iterableB2 = nrz.b(map.get(ofhVar));
        if (iterableB2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterableB2.iterator();
        while (it.hasNext()) {
            arrayList.add(((DecimalFormat) this.b).format((Number) it.next()));
        }
        return TextUtils.join(",", arrayList);
    }
}
