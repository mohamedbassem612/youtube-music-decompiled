package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class doo implements dos {
    public final Set a = new LinkedHashSet();

    public doo(dou douVar) {
        douVar.b("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.dos
    public final Bundle a() {
        Bundle bundleH = aie.h((awml[]) Arrays.copyOf(new awml[0], 0));
        List listAp = atqq.ap(this.a);
        bundleH.putStringArrayList("classes_to_restore", listAp instanceof ArrayList ? (ArrayList) listAp : new ArrayList<>(listAp));
        return bundleH;
    }
}
