package defpackage;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qqs implements qpn {
    private boolean a = false;

    public final void b() {
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qqv] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.qpn
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream a(rrq rrqVar) {
        InputStream inputStreamD = rrqVar.f.d((Uri) rrqVar.d);
        if (this.a) {
            inputStreamD = new BufferedInputStream(inputStreamD);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStreamD);
        ?? r1 = rrqVar.a;
        if (!r1.isEmpty()) {
            int i = qpk.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                ((qqz) it.next()).f();
            }
            qpk qpkVar = !arrayList2.isEmpty() ? new qpk(inputStreamD, arrayList2) : null;
            if (qpkVar != null) {
                arrayList.add(qpkVar);
            }
        }
        for (nqv nqvVar : rrqVar.b) {
            arrayList.add(new InflaterInputStream((InputStream) aguu.K(arrayList)));
        }
        Collections.reverse(arrayList);
        return (InputStream) arrayList.get(0);
    }
}
