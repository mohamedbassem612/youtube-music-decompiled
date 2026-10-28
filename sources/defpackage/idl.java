package defpackage;

import com.google.android.libraries.elements.interfaces.DebugCounters;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class idl implements Supplier {
    private final /* synthetic */ int $cid;

    public /* synthetic */ idl(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.$cid) {
            case 0:
                return new HashSet();
            case 1:
                return new ArrayList();
            case 2:
                return new ArrayList();
            case 3:
                return Integer.valueOf(DebugCounters.jsControllerCreateDisposeCount());
            case 4:
                return Integer.valueOf(DebugCounters.jsControllerCreateCount());
            case 5:
                return Integer.valueOf(DebugCounters.jsControllerDisposeCount());
            case 6:
                return Integer.valueOf(DebugCounters.djinniProxyCacheSize());
            case 7:
                return new ArrayList();
            case 8:
                return new ArrayList();
            case 9:
                return new ArrayList();
            case 10:
                return new agjz(4);
            case 11:
                return new agkx();
            case 12:
                agkw agkwVar = agkw.a;
                return new ahub((char[]) null);
            default:
                return new agkh(4);
        }
    }
}
