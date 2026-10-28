package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Comparator, Serializable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Comparator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(Comparator comparator, Object obj, byte b) {
        this.a = b;
        this.b = comparator;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.c;
        Comparator comparator = this.b;
        switch (b) {
            case 0:
                Comparator comparator2 = (Comparator) obj3;
                int iCompare = comparator.compare(obj, obj2);
                return iCompare == 0 ? comparator2.compare(obj, obj2) : iCompare;
            default:
                Function function = (Function) obj3;
                return comparator.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
