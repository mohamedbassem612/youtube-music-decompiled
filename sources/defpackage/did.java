package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class did {
    public static final did a = new did(new Bundle(), null);
    public final Bundle b;
    public List c;

    public did(Bundle bundle, List list) {
        this.b = bundle;
        this.c = list;
    }

    public static did a(Bundle bundle) {
        if (bundle != null) {
            return new did(bundle, null);
        }
        return null;
    }

    public final List b() {
        c();
        return new ArrayList(this.c);
    }

    public final void c() {
        if (this.c == null) {
            ArrayList<String> stringArrayList = this.b.getStringArrayList("controlCategories");
            this.c = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.c = Collections.EMPTY_LIST;
            }
        }
    }

    public final boolean d() {
        c();
        return this.c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof did)) {
            return false;
        }
        did didVar = (did) obj;
        c();
        didVar.c();
        return this.c.equals(didVar.c);
    }

    public final int hashCode() {
        c();
        return this.c.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(b().toArray()) + " }";
    }
}
