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
/* JADX INFO: loaded from: classes.dex */
public final class jsv implements jsu {
    public static final jsv a = new jsv(Collections.EMPTY_MAP);
    public final Map b;
    private int c;

    public jsv(Map map) {
        this.b = DesugarCollections.unmodifiableMap(map);
    }

    @Override // defpackage.jsu
    public final long a() {
        Map map = this.b;
        if (map.containsKey("exo_len")) {
            return ByteBuffer.wrap((byte[]) map.get("exo_len")).getLong();
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    public final jsv b(kyr kyrVar) {
        Map map = this.b;
        HashMap map2 = new HashMap(map);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList((Collection) kyrVar.b));
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            map2.remove(listUnmodifiableList.get(i));
        }
        HashMap map3 = new HashMap((Map) kyrVar.a);
        for (Map.Entry entry : map3.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(map3);
        for (String str : mapUnmodifiableMap.keySet()) {
            map2.put(str, rpi.L(mapUnmodifiableMap.get(str)));
        }
        return !rpi.K(map, map2) ? new jsv(map2) : this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return rpi.K(this.b, ((jsv) obj).b);
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

    public jsv() {
        this(Collections.EMPTY_MAP);
    }
}
