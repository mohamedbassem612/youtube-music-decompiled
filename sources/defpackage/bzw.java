package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bzw {
    public final bzv c;
    public bzv d;
    public final HashMap a = new HashMap();
    public final SparseArray b = new SparseArray();
    private final SparseBooleanArray e = new SparseBooleanArray();
    private final SparseBooleanArray f = new SparseBooleanArray();

    public bzw(bxo bxoVar, File file) {
        bzt bztVar = new bzt(bxoVar);
        bzu bzuVar = file != null ? new bzu(new File(file, "cached_content_index.exi")) : null;
        this.c = bztVar;
        this.d = bzuVar;
    }

    public static bzy c(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(a.bR(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = bwp.e;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new bzy(map);
    }

    public final bzs a(String str) {
        return (bzs) this.a.get(str);
    }

    public final bzs b(String str) {
        HashMap map = this.a;
        bzs bzsVar = (bzs) map.get(str);
        if (bzsVar != null) {
            return bzsVar;
        }
        SparseArray sparseArray = this.b;
        int iM = rpi.M(sparseArray);
        bzs bzsVar2 = new bzs(iM, str, bzy.a);
        map.put(str, bzsVar2);
        sparseArray.put(iM, str);
        this.f.put(iM, true);
        this.c.d(bzsVar2);
        return bzsVar2;
    }

    public final void d(String str) {
        HashMap map = this.a;
        bzs bzsVar = (bzs) map.get(str);
        if (bzsVar != null && bzsVar.c.isEmpty() && bzsVar.d.isEmpty()) {
            map.remove(str);
            int i = bzsVar.a;
            SparseBooleanArray sparseBooleanArray = this.f;
            bzv bzvVar = this.c;
            if (sparseBooleanArray.get(i)) {
                ((bzt) bzvVar).c.delete(i);
                this.b.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                ((bzt) bzvVar).c.put(i, null);
                this.b.put(i, null);
                this.e.put(i, true);
            }
        }
    }

    public final void e() {
        this.c.g();
        SparseBooleanArray sparseBooleanArray = this.e;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.f.clear();
    }
}
