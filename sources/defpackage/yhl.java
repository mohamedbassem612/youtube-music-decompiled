package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yhl {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public yhl(Function0 function0) {
        this.b = function0;
        this.c = new LinkedHashSet();
        this.d = new TreeMap();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Map] */
    private final void d(int i) {
        int iMax = Math.max(0, i);
        if (this.a > iMax) {
            ?? r1 = this.c;
            if (!r1.isEmpty()) {
                Iterator it = ((LinkedHashSet) r1).iterator();
                it.getClass();
                while (this.a > iMax && it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    byte[] bArr = (byte[]) next;
                    it.remove();
                    Object obj = this.d;
                    int length = bArr.length;
                    Integer numValueOf = Integer.valueOf(length);
                    TreeMap treeMap = (TreeMap) obj;
                    LinkedHashSet linkedHashSet = (LinkedHashSet) treeMap.get(numValueOf);
                    if (linkedHashSet != null) {
                        linkedHashSet.remove(bArr);
                        if (linkedHashSet.isEmpty()) {
                            treeMap.remove(numValueOf);
                        }
                    }
                    this.a -= length;
                }
            }
        }
        if (((LinkedHashSet) this.c).isEmpty()) {
            if (this.a == 0 && this.d.isEmpty()) {
                return;
            }
            this.a = 0;
            ((TreeMap) this.d).clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    public final synchronized void a(byte[] bArr) {
        int iIntValue = ((Number) this.b.invoke()).intValue();
        int length = bArr.length;
        if (length > iIntValue || !((LinkedHashSet) this.c).add(bArr)) {
            return;
        }
        ?? r2 = this.d;
        Integer numValueOf = Integer.valueOf(length);
        Object linkedHashSet = r2.get(numValueOf);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            r2.put(numValueOf, linkedHashSet);
        }
        ((LinkedHashSet) linkedHashSet).add(bArr);
        this.a += length;
        d(iIntValue);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    public final synchronized void b() {
        d(((Number) this.b.invoke()).intValue());
    }

    public final synchronized byte[] c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Object obj = this.d;
        Map.Entry entryCeilingEntry = ((TreeMap) obj).ceilingEntry(numValueOf);
        if (entryCeilingEntry == null) {
            return new byte[i];
        }
        Object value = entryCeilingEntry.getValue();
        value.getClass();
        LinkedHashSet linkedHashSet = (LinkedHashSet) value;
        Object next = linkedHashSet.iterator().next();
        next.getClass();
        byte[] bArr = (byte[]) next;
        linkedHashSet.remove(bArr);
        if (linkedHashSet.isEmpty()) {
            ((TreeMap) obj).remove(entryCeilingEntry.getKey());
        }
        ((LinkedHashSet) this.c).remove(bArr);
        this.a -= bArr.length;
        return bArr;
    }

    public yhl(jij jijVar, hfn hfnVar, hfn hfnVar2) {
        this.a = 1000;
        this.d = jijVar;
        this.b = hfnVar;
        this.c = hfnVar2;
    }
}
