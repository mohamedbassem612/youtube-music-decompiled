package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ieu implements Supplier {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ieu(int i) {
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
                return new LinkedHashMap();
            case 3:
                return new ArrayList();
            case 4:
                return new ArrayList();
            case 5:
                return new HashSet();
            case 6:
                return new ArrayList();
            case 7:
                return new ArrayList();
            case 8:
                return new PriorityQueue();
            case 9:
                return new ArrayList();
            case 10:
                return new IllegalStateException("Unable to parse the ad player response from the AdIntro renderer.");
            case 11:
                return new sav("Unable to calculate the time range for the trigger.", 116);
            case 12:
                return new sav("Unable to calculate the time range for the trigger.", 116);
            case 13:
                return new PriorityQueue();
            case 14:
                return new ArrayList();
            case 15:
                return new IllegalStateException("Segment not found in MediaComposition");
            case 16:
                return new IllegalStateException("Segment could not be found in EditorMediaComposition.");
            case 17:
                return new ArrayList();
            case 18:
                return new ArrayList();
            case 19:
                return new TreeSet();
            default:
                return new ArrayList();
        }
    }
}
