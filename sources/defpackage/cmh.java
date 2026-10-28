package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cmh implements crr {
    private final crr a;
    private final List b;

    public cmh(crr crrVar, List list) {
        this.a = crrVar;
        this.b = list;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.crr
    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) throws IOException {
        int i;
        int i2;
        int i3;
        long j;
        cio cioVarA = ((ciq) this.a).a(uri, inputStream);
        List list = this.b;
        if (list == null || list.isEmpty()) {
            return cioVarA;
        }
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new btj());
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        long j2 = 0;
        while (true) {
            if (i4 >= cioVarA.a()) {
                break;
            }
            btj btjVar = (btj) linkedList.peek();
            btjVar.getClass();
            if (btjVar.a != i4) {
                long jB = cioVarA.b(i4);
                if (jB != -9223372036854775807L) {
                    j2 += jB;
                }
                i2 = i4;
            } else {
                aesh aeshVarD = cioVarA.d(i4);
                ?? r9 = aeshVarD.f;
                btj btjVar2 = (btj) linkedList.poll();
                btjVar2.getClass();
                ArrayList arrayList2 = new ArrayList();
                btj btjVar3 = btjVar2;
                while (true) {
                    int i5 = btjVar3.b;
                    cij cijVar = (cij) r9.get(i5);
                    List list2 = cijVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    while (true) {
                        i = btjVar2.a;
                        arrayList3.add((ciy) list2.get(btjVar3.c));
                        btjVar3 = (btj) linkedList.poll();
                        btjVar3.getClass();
                        i2 = i4;
                        i3 = btjVar3.a;
                        j = j2;
                        if (i3 != i || btjVar3.b != i5) {
                            break;
                        }
                        i4 = i2;
                        j2 = j;
                    }
                    arrayList2.add(new cij(cijVar.a, cijVar.b, arrayList3, cijVar.d, cijVar.e, cijVar.f, cijVar.g));
                    if (i3 != i) {
                        break;
                    }
                    i4 = i2;
                    j2 = j;
                }
                linkedList.addFirst(btjVar3);
                arrayList.add(new aesh((String) aeshVarD.e, aeshVarD.a - j, arrayList2, aeshVarD.d, (cir) aeshVarD.b, aeshVarD.c));
                j2 = j;
            }
            i4 = i2 + 1;
        }
        long j3 = j2;
        long j4 = cioVarA.b;
        return new cio(cioVarA.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, cioVarA.c, cioVarA.d, cioVarA.e, cioVarA.f, cioVarA.g, cioVarA.h, cioVarA.k, cioVarA.i, cioVarA.j, arrayList, cioVarA.l, cioVarA.m);
    }
}
