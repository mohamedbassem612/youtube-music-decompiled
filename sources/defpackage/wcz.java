package defpackage;

import android.content.ContentValues;
import android.util.Base64;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
abstract class wcz {
    protected static long c(String str) throws wcm {
        int iA;
        int i = wfs.a;
        try {
            iA = wfs.a((akve) aihn.parseFrom(akve.a, Base64.decode(URLDecoder.decode(str, StandardCharsets.UTF_8), 8)));
        } catch (Exception unused) {
            iA = Integer.MIN_VALUE;
        }
        if (iA != Integer.MIN_VALUE) {
            return iA;
        }
        throw wcm.a(null, -1, 4, 3);
    }

    protected static void d(wdl wdlVar, omr omrVar, wff wffVar, long j) throws wcm {
        weh wehVar = wffVar.b;
        wehVar.getClass();
        String strB = wehVar.b();
        try {
            long jC = c(strB);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("key", strB);
                contentValues.put("entity", wehVar.c());
                contentValues.put("last_modified_datetime", Long.valueOf(j));
                contentValues.put("data_type", Long.valueOf(jC));
                aijp aijpVar = wffVar.d;
                aikz.d(aijpVar);
                contentValues.put("batch_update_timestamp", Long.valueOf(a.d(aext.w(aijpVar.b, 1000000000L), aijpVar.c)));
                wej wejVar = wffVar.c;
                contentValues.put("metadata", wejVar.b.toByteArray());
                long jD = omrVar.d("entity_table", contentValues, 5);
                if (jD < 0) {
                    throw new IllegalStateException("Could not insert entity: " + strB + " with status: " + jD);
                }
                wdlVar.a(omrVar);
                Collection collection = (Collection) wdlVar.b.map.get(wehVar.getClass());
                if (collection != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        omrVar.o(wdl.b((abxv) it.next(), wehVar, wejVar));
                    }
                }
                omrVar.g("DELETE FROM entity_associations WHERE parent_entity_key=?", wehVar.b());
                tzk.O(omrVar, wehVar);
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw wcm.a(e, (int) jC, 4, 5);
            }
        } catch (Exception e2) {
            throw wcm.a(e2, -1, 4, 5);
        }
    }

    public abstract void b(wdl wdlVar, omr omrVar, agjz agjzVar);
}
