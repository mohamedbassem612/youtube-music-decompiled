package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hlh implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        hcg hcgVar = (hcg) obj;
        hcg hcgVar2 = (hcg) obj2;
        hcgVar.getClass();
        String str = hcgVar.g;
        str.getClass();
        hcgVar2.getClass();
        String str2 = hcgVar2.g;
        str2.getClass();
        return str.compareToIgnoreCase(str2);
    }
}
