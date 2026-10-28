package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fyd extends fys {
    final boolean a;
    final boolean b;
    final /* synthetic */ fye c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyd(fye fyeVar, boolean z, boolean z2) {
        super("log");
        this.c = fyeVar;
        this.a = z;
        this.b = z2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    /* JADX WARN: Code duplicated, block: B:20:0x007a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0089 A[LOOP:0: B:21:0x007f->B:23:0x0089, LOOP_END] */
    @Override // defpackage.fys
    public final fyy a(kwq kwqVar, List list) {
        int i;
        int i2;
        String strI;
        ArrayList arrayList;
        fxw.k("log", 1, list);
        if (list.size() == 1) {
            this.c.a.i(3, kwqVar.v((fyy) list.get(0)).i(), Collections.EMPTY_LIST, this.a, this.b);
            return f;
        }
        int iB = fxw.b(kwqVar.v((fyy) list.get(0)).h().doubleValue());
        if (iB != 2) {
            i = 3;
            if (iB == 3) {
                i2 = 1;
            } else if (iB == 5) {
                i2 = 5;
            } else if (iB == 6) {
                i2 = 2;
            }
            strI = kwqVar.v((fyy) list.get(1)).i();
            if (list.size() == 2) {
                this.c.a.i(i2, strI, Collections.EMPTY_LIST, this.a, this.b);
                return f;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(kwqVar.v((fyy) list.get(i3)).i());
            }
            this.c.a.i(i2, strI, arrayList, this.a, this.b);
            return f;
        }
        i = 4;
        i2 = i;
        strI = kwqVar.v((fyy) list.get(1)).i();
        if (list.size() == 2) {
            this.c.a.i(i2, strI, Collections.EMPTY_LIST, this.a, this.b);
            return f;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(kwqVar.v((fyy) list.get(i3)).i());
        }
        this.c.a.i(i2, strI, arrayList, this.a, this.b);
        return f;
    }
}
