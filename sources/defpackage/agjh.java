package defpackage;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agjh extends agjn {
    final /* synthetic */ agjo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agjh(agjo agjoVar) {
        super(agjoVar);
        this.a = agjoVar;
    }

    @Override // defpackage.agjn
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new agjf(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        agjo agjoVar = this.a;
        int iC = agjoVar.c(key);
        return iC != -1 && Objects.equals(value, agjoVar.b[iC]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iX = aguu.X(key);
            agjo agjoVar = this.a;
            int iD = agjoVar.d(key, iX);
            if (iD != -1 && Objects.equals(value, agjoVar.b[iD])) {
                agjoVar.i(iD, iX);
                return true;
            }
        }
        return false;
    }
}
