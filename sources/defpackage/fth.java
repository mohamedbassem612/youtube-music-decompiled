package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fth {
    final SparseArray a = new SparseArray();
    final Map b = new HashMap();
    public final int c;
    private final boolean d;
    private int e;

    public fth(int i) {
        this.d = i != 0;
        this.c = i;
        this.e = i + 1;
    }

    public final fpu a(int i) {
        return (fpu) this.a.get(i);
    }

    public final void b(ftg ftgVar) {
        int iIntValue;
        if (ftgVar.m()) {
            ftg ftgVar2 = fsk.a;
            if ("AdapterProxyRenderInfo".equals(ftgVar.s())) {
                return;
            }
            if (this.d) {
                ftgVar.p();
                throw new IllegalStateException("If you enable custom viewTypes, you must provide a customViewType in ViewRenderInfo.");
            }
            ftgVar.p();
            fpu fpuVarE = ftgVar.e();
            Map map = this.b;
            if (map.containsKey(fpuVarE)) {
                iIntValue = ((Integer) map.get(fpuVarE)).intValue();
            } else {
                ftgVar.p();
                int i = this.e;
                this.e = i + 1;
                this.a.put(i, fpuVarE);
                map.put(fpuVarE, Integer.valueOf(i));
                iIntValue = i;
            }
            ftgVar.p();
            ftgVar.i(iIntValue);
        }
    }
}
