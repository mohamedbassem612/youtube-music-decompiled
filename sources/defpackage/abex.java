package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abex implements abhp {
    private final Map a = DesugarCollections.synchronizedMap(new HashMap());
    private final Map b = DesugarCollections.synchronizedMap(new HashMap());
    private final Map c;
    private volatile boolean d;
    private long e;
    private final isi f;

    public abex(isi isiVar) {
        this.f = isiVar;
        DesugarCollections.synchronizedMap(new HashMap());
        this.c = DesugarCollections.synchronizedMap(new HashMap());
        DesugarCollections.synchronizedMap(new HashMap());
        Optional.empty();
        Optional.empty();
        new ArrayDeque();
        abhs abhsVar = abhs.f;
        abhs abhsVar2 = abhs.h;
        abhs abhsVar3 = abhs.g;
        agla aglaVar = new agla();
        aglaVar.b(abhsVar, abhsVar);
        aglaVar.b(abhsVar2, abhsVar2);
        aglaVar.b(abhsVar3, abhsVar3);
        aglaVar.a();
    }

    private final void a(abht abhtVar, abhs abhsVar) {
        Map map = this.b;
        if (Objects.equals(abhtVar, (abht) map.get(abhsVar))) {
            return;
        }
        if (abhtVar != null) {
            map.put(abhsVar, abhtVar);
        } else {
            map.remove(abhsVar);
        }
        Set set = (Set) this.a.get(abhsVar);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((abew) it.next()).a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [axsp, java.lang.Object] */
    @Override // defpackage.abhp
    public final void f(int i, long j) {
        abht abhtVar;
        abht abhtVar2;
        int i2 = 0;
        this.d = i == 1 || i == 2;
        if (i == 4 || i == 5) {
            return;
        }
        this.e = j;
        abhs[] abhsVarArrValues = abhs.values();
        int length = abhsVarArrValues.length;
        int i3 = 0;
        while (i3 < length) {
            abhs abhsVar = abhsVarArrValues[i3];
            long j2 = this.e;
            if (((aawr) this.c.get(abhsVar)) != null) {
                throw null;
            }
            Optional optionalOfNullable = Optional.ofNullable(new abht[i2]);
            if (!optionalOfNullable.isEmpty()) {
                if (abhsVar.equals(abhs.g)) {
                    int length2 = ((abht[]) optionalOfNullable.get()).length - 1;
                    while (true) {
                        if (length2 < 0) {
                            abhtVar2 = null;
                            break;
                        }
                        abht abhtVar3 = ((abht[]) optionalOfNullable.get())[length2];
                        int i4 = length2;
                        long j3 = abhtVar3.b;
                        long j4 = abhtVar3.a;
                        Optional optionalOf = j3 > j4 ? Optional.of(Long.valueOf(j3)) : Optional.empty();
                        if (j4 <= j2 && (optionalOf.isEmpty() || ((Long) optionalOf.get()).longValue() > j2)) {
                            abhtVar2 = abhtVar3;
                            break;
                        }
                        length2 = i4 - 1;
                    }
                    a(abhtVar2, abhsVar);
                } else {
                    abht[] abhtVarArr = (abht[]) optionalOfNullable.get();
                    int length3 = abhtVarArr.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length3) {
                            abhtVar = null;
                            break;
                        }
                        abhtVar = abhtVarArr[i5];
                        if (abhtVar.a <= j2 && abhtVar.b > j2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    a(abhtVar, abhsVar);
                }
            }
            i3++;
            i2 = 0;
        }
        isi isiVar = this.f;
        ((awkv) isiVar.a).kk(isiVar.E(this.e));
        if (i == 3) {
            Optional optionalE = isiVar.E(j);
            yyk yykVar = new yyk(isiVar.c, 15);
            if (true == optionalE.isPresent()) {
                yykVar.a.kk(optionalE.get());
            }
        }
    }
}
