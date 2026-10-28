package defpackage;

import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yoj implements Supplier {
    private final /* synthetic */ int $cid;

    public /* synthetic */ yoj(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.$cid) {
            case 0:
                return new ArrayList();
            case 1:
                return new ArrayList();
            case 2:
                return new ArrayList();
            case 3:
                return new ArrayList();
            case 4:
                return new ArrayList();
            case 5:
                return new ArrayList();
            case 6:
                return new ArrayList();
            case 7:
                return new HashSet();
            case 8:
                return new ArrayList();
            case 9:
                return new ArrayList();
            case 10:
                return new HashSet();
            case 11:
                return new ArrayList();
            case 12:
                return new ArrayList();
            case 13:
                return new ArrayList();
            case 14:
                return new ArrayList();
            case 15:
                return new LinkedList();
            case 16:
                return -1;
            case 17:
                return new LinkedHashMap();
            case 18:
                Collector collector = agol.a;
                return new ahgr((byte[]) null);
            default:
                Collector collector2 = agol.a;
                return new ahgr((byte[]) null);
        }
    }
}
