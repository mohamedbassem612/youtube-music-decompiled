package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.DeflaterOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qqu implements qpn {
    public qpu[] a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qqv] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.qpn
    public final /* synthetic */ Object a(rrq rrqVar) {
        OutputStream outputStreamF = rrqVar.f.f((Uri) rrqVar.d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStreamF);
        ?? r2 = rrqVar.a;
        if (!r2.isEmpty()) {
            Object obj = rrqVar.c;
            int i = qpl.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                qqy qqyVarB = ((qqz) it.next()).b((Uri) obj);
                if (qqyVarB != null) {
                    arrayList2.add(qqyVarB);
                }
            }
            qpl qplVar = !arrayList2.isEmpty() ? new qpl(outputStreamF, arrayList2) : null;
            if (qplVar != null) {
                arrayList.add(qplVar);
            }
        }
        for (nqv nqvVar : rrqVar.b) {
            arrayList.add(new DeflaterOutputStream((OutputStream) aguu.K(arrayList)));
        }
        Collections.reverse(arrayList);
        qpu[] qpuVarArr = this.a;
        if (qpuVarArr != null) {
            qpu qpuVar = qpuVarArr[0];
            Closeable closeable = (OutputStream) aguu.K(arrayList);
            if (closeable instanceof qqe) {
                qpuVar.b = (qqe) closeable;
                qpuVar.a = (OutputStream) arrayList.get(0);
            }
        }
        return (OutputStream) arrayList.get(0);
    }
}
