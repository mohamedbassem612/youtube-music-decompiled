package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auzl {
    static final ager a = ager.d(',');
    public static final auzl b = new auzl(auyx.a, false, new auzl(new auyx(1), true, new auzl()));
    public final Map c;
    public final byte[] d;

    /* JADX WARN: Type inference failed for: r3v1, types: [auzj, java.lang.Object] */
    private auzl(auzj auzjVar, boolean z, auzl auzlVar) {
        String strB = auzjVar.b();
        ahno.G(!strB.contains(","), "Comma is currently not allowed in message encoding");
        int size = auzlVar.c.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(auzlVar.c.containsKey(auzjVar.b()) ? size : size + 1);
        for (auzk auzkVar : auzlVar.c.values()) {
            ?? r3 = auzkVar.b;
            String strB2 = r3.b();
            if (!strB2.equals(strB)) {
                linkedHashMap.put(strB2, new auzk((Object) r3, auzkVar.a));
            }
        }
        linkedHashMap.put(strB, new auzk(auzjVar, z));
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.c = mapUnmodifiableMap;
        ager agerVar = a;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((auzk) entry.getValue()).a) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.d = agerVar.b(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    private auzl() {
        this.c = new LinkedHashMap(0);
        this.d = new byte[0];
    }
}
