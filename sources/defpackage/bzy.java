package defpackage;

import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bzy implements bzx {
    public static final bzy a = new bzy(Collections.EMPTY_MAP);
    public final Map b;
    private int c;

    public bzy(Map map) {
        this.b = DesugarCollections.unmodifiableMap(map);
    }

    @Override // defpackage.bzx
    public final long a() {
        byte[] bArr = (byte[]) this.b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    public final bzy b(eol eolVar) {
        Map map = this.b;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList((Collection) eolVar.b));
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            map2.remove(listUnmodifiableList.get(i));
        }
        HashMap map3 = new HashMap((Map) eolVar.a);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(map3).entrySet()) {
            map2.put((String) entry2.getKey(), rpi.L(entry2.getValue()));
        }
        return !rpi.K(map, map2) ? new bzy(map2) : this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return rpi.K(this.b, ((bzy) obj).b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = 0;
        for (Map.Entry entry : this.b.entrySet()) {
            iHashCode += ((String) entry.getKey()).hashCode() ^ Arrays.hashCode((byte[]) entry.getValue());
        }
        this.c = iHashCode;
        return iHashCode;
    }

    public bzy() {
        this(Collections.EMPTY_MAP);
    }
}
