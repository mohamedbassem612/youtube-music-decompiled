package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aje extends awnk implements Set, Collection, j$.util.Set, awrp {
    private final /* synthetic */ int $cid;
    private final ajc a;

    public aje(ajc ajcVar, int i) {
        this.$cid = i;
        this.a = ajcVar;
    }

    @Override // defpackage.awna
    public final int a() {
        return 0;
    }

    @Override // defpackage.awna, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.$cid == 0) {
            this.a.containsKey(obj);
        } else if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (entry instanceof Map.Entry) {
                ajc ajcVar = this.a;
                ajcVar.get(entry.getKey());
                if (entry.getValue() == null) {
                    ajcVar.containsKey(entry.getKey());
                }
            }
        }
        return false;
    }

    @Override // defpackage.awnk, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ajd ajdVar;
        int i = 0;
        if (this.$cid != 0) {
            ajh[] ajhVarArr = new ajh[8];
            while (i < 8) {
                ajhVarArr[i] = new aji();
                i++;
            }
            ajdVar = new ajd(this.a.a, ajhVarArr);
        } else {
            ajh[] ajhVarArr2 = new ajh[8];
            while (i < 8) {
                ajhVarArr2[i] = new ajj();
                i++;
            }
            ajdVar = new ajd(this.a.a, ajhVarArr2);
        }
        return ajdVar;
    }
}
