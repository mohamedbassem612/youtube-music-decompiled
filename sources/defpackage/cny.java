package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cny extends cms {
    private static final bss a;
    private final cno[] b;
    private final List c;
    private final btn[] d;
    private final ArrayList e;
    private int f = -1;
    private long[][] g;
    private cnx h;

    static {
        bsi bsiVar = new bsi();
        bsiVar.a = "MergingMediaSource";
        a = bsiVar.a();
    }

    public cny(cno... cnoVarArr) {
        this.b = cnoVarArr;
        this.e = new ArrayList(Arrays.asList(cnoVarArr));
        this.c = new ArrayList(cnoVarArr.length);
        int i = 0;
        while (true) {
            int length = cnoVarArr.length;
            if (i >= length) {
                this.d = new btn[length];
                this.g = new long[0][];
                new HashMap();
                agvp.k(new agon());
                return;
            }
            this.c.add(new ArrayList());
            i++;
        }
    }

    @Override // defpackage.cno
    public final cnk c(cnm cnmVar, cra craVar, long j) {
        btn[] btnVarArr = this.d;
        cno[] cnoVarArr = this.b;
        int length = cnoVarArr.length;
        cnk[] cnkVarArr = new cnk[length];
        int iA = btnVarArr[0].a(cnmVar.a);
        for (int i = 0; i < length; i++) {
            cnm cnmVarA = cnmVar.a(btnVarArr[i].f(iA));
            cnkVarArr[i] = cnoVarArr[i].c(cnmVarA, craVar, j - this.g[iA][i]);
            ((List) this.c.get(i)).add(new eol(cnmVarA, cnkVarArr[i], (byte[]) null));
        }
        return new cnw(this.g[iA], cnkVarArr);
    }

    @Override // defpackage.cms
    protected final /* bridge */ /* synthetic */ cnm f(Object obj, cnm cnmVar) {
        Object obj2;
        int iIntValue = ((Integer) obj).intValue();
        List list = this.c;
        List list2 = (List) list.get(iIntValue);
        for (int i = 0; i < list2.size(); i++) {
            if (((cnm) ((eol) list2.get(i)).b).equals(cnmVar)) {
                obj2 = ((eol) ((List) list.get(0)).get(i)).b;
                return (cnm) obj2;
            }
        }
        obj2 = null;
        return (cnm) obj2;
    }

    @Override // defpackage.cms
    protected final /* bridge */ /* synthetic */ void g(Object obj, cno cnoVar, btn btnVar) {
        int iB;
        Integer num = (Integer) obj;
        if (this.h == null) {
            if (this.f == -1) {
                iB = btnVar.b();
                this.f = iB;
            } else {
                int iB2 = btnVar.b();
                int i = this.f;
                if (iB2 != i) {
                    this.h = new cnx();
                    return;
                }
                iB = i;
            }
            if (this.g.length == 0) {
                this.g = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iB, this.d.length);
            }
            ArrayList arrayList = this.e;
            arrayList.remove(cnoVar);
            btn[] btnVarArr = this.d;
            btnVarArr[num.intValue()] = btnVar;
            if (arrayList.isEmpty()) {
                z(btnVarArr[0]);
            }
        }
    }

    @Override // defpackage.cno
    public final bss jF() {
        cno[] cnoVarArr = this.b;
        return cnoVarArr.length > 0 ? cnoVarArr[0].jF() : a;
    }

    @Override // defpackage.cms, defpackage.cno
    public final void jG() throws cnx {
        cnx cnxVar = this.h;
        if (cnxVar != null) {
            throw cnxVar;
        }
        super.jG();
    }

    @Override // defpackage.cms, defpackage.cmi
    protected final void jH(bzg bzgVar) {
        super.jH(bzgVar);
        int i = 0;
        while (true) {
            cno[] cnoVarArr = this.b;
            if (i >= cnoVarArr.length) {
                return;
            }
            h(Integer.valueOf(i), cnoVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.cms, defpackage.cmi
    protected final void jI() {
        super.jI();
        Arrays.fill(this.d, (Object) null);
        this.f = -1;
        this.h = null;
        ArrayList arrayList = this.e;
        arrayList.clear();
        Collections.addAll(arrayList, this.b);
    }

    @Override // defpackage.cmi, defpackage.cno
    public final void jJ(bss bssVar) {
        this.b[0].jJ(bssVar);
    }

    @Override // defpackage.cno
    public final void k(cnk cnkVar) {
        cnw cnwVar = (cnw) cnkVar;
        int i = 0;
        while (true) {
            cno[] cnoVarArr = this.b;
            if (i >= cnoVarArr.length) {
                return;
            }
            List list = (List) this.c.get(i);
            cnk cnkVarK = cnwVar.k(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((eol) list.get(i2)).a.equals(cnkVarK)) {
                    list.remove(i2);
                    break;
                }
            }
            cnoVarArr[i].k(cnwVar.k(i));
            i++;
        }
    }
}
