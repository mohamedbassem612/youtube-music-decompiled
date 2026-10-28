package defpackage;

import androidx.car.app.model.Alert;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aupt implements aupn {
    public static final aupn a = aupo.b(Collections.EMPTY_SET);
    private final List b;
    private final List c;

    public aupt(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    public static aupn b() {
        return a;
    }

    @Override // defpackage.awmd, defpackage.awmc
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Set io() {
        List list = this.b;
        int size = list.size();
        List list2 = this.c;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((aupr) list2.get(i)).io();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Alert.DURATION_SHOW_INDEFINITELY);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object objIo = ((aupr) list.get(i2)).io();
            objIo.getClass();
            hashSet.add(objIo);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
