package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rqc implements syk {
    public final Set a = new HashSet();

    @Override // defpackage.syk
    public final int a(Bundle bundle) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rpy) it.next()).a();
        }
        return 0;
    }
}
