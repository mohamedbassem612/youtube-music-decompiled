package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class agki implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public agki(agkj agkjVar) {
        Object[] objArr = new Object[agkjVar.size()];
        Object[] objArr2 = new Object[agkjVar.size()];
        agqr it = agkjVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public agkh a(int i) {
        return new agkh(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        boolean z = obj instanceof agkz;
        Object obj2 = this.b;
        if (z) {
            agkz agkzVar = (agkz) obj;
            agkh agkhVarA = a(agkzVar.size());
            agqr it = agkzVar.iterator();
            agqr it2 = ((agjw) obj2).iterator();
            while (it.hasNext()) {
                agkhVarA.e(it.next(), it2.next());
            }
            return agkhVarA.b();
        }
        Object[] objArr = (Object[]) obj;
        agkh agkhVarA2 = a(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            agkhVarA2.e(objArr[i], ((Object[]) obj2)[i]);
        }
        return agkhVarA2.b();
    }
}
