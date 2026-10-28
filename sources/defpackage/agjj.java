package defpackage;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agjj extends agjn {
    @Override // defpackage.agjn
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new agjg(this.b, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        agjo agjoVar = this.b;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iE = agjoVar.e(key);
        return iE != -1 && Objects.equals(agjoVar.a[iE], value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            agjo agjoVar = this.b;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iX = aguu.X(key);
            int iF = agjoVar.f(key, iX);
            if (iF != -1 && Objects.equals(agjoVar.a[iF], value)) {
                agjoVar.j(iF, iX);
                return true;
            }
        }
        return false;
    }
}
