package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dc implements cy {
    final /* synthetic */ dd a;
    private final String b;

    public dc(dd ddVar, String str) {
        this.a = ddVar;
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    @Override // defpackage.cy
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        String strConcat;
        int i;
        int i2;
        dd ddVar = this.a;
        String str = this.b;
        byte b = -1;
        int iA = ddVar.a(str, -1, true);
        if (iA < 0) {
            return false;
        }
        for (int i3 = iA; i3 < ddVar.c.size(); i3++) {
            av avVar = (av) ddVar.c.get(i3);
            if (!avVar.t) {
                ddVar.U(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + avVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        int i4 = iA;
        while (i4 < ddVar.c.size()) {
            av avVar2 = (av) ddVar.c.get(i4);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            ArrayList arrayList3 = avVar2.e;
            int size = arrayList3.size();
            int i5 = 0;
            while (i5 < size) {
                dm dmVar = (dm) arrayList3.get(i5);
                byte b2 = b;
                cc ccVar = dmVar.b;
                if (ccVar == null) {
                    i = i4;
                } else {
                    if (dmVar.c) {
                        int i6 = dmVar.a;
                        i = i4;
                        if (i6 == 1 || i6 == 2 || i6 == 8) {
                        }
                        i2 = dmVar.a;
                        if (i2 != 1 || i2 == 2) {
                            hashSet3.add(ccVar);
                        }
                    } else {
                        i = i4;
                    }
                    hashSet.add(ccVar);
                    hashSet2.add(ccVar);
                    i2 = dmVar.a;
                    if (i2 != 1) {
                        hashSet3.add(ccVar);
                    } else {
                        hashSet3.add(ccVar);
                    }
                }
                i5++;
                b = b2;
                i4 = i;
            }
            byte b3 = b;
            int i7 = i4;
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb = new StringBuilder("saveBackStack(\"");
                sb.append(str);
                sb.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    Object next = hashSet2.iterator().next();
                    Objects.toString(next);
                    strConcat = " ".concat(String.valueOf(next));
                } else {
                    hashSet2.toString();
                    strConcat = "s ".concat(hashSet2.toString());
                }
                sb.append(strConcat);
                sb.append(" in ");
                sb.append(avVar2);
                sb.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                ddVar.U(new IllegalArgumentException(sb.toString()));
            }
            i4 = i7 + 1;
            b = b3;
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            cc ccVar2 = (cc) arrayDeque.removeFirst();
            if (ccVar2.mRetainInstance) {
                StringBuilder sb2 = new StringBuilder("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must not contain retained fragments. Found ");
                sb2.append(true != hashSet.contains(ccVar2) ? "retained child " : "direct reference to retained ");
                sb2.append("fragment ");
                sb2.append(ccVar2);
                ddVar.U(new IllegalArgumentException(sb2.toString()));
            }
            for (cc ccVar3 : ccVar2.mChildFragmentManager.C.e()) {
                if (ccVar3 != null) {
                    arrayDeque.addLast(ccVar3);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList4.add(((cc) it.next()).mWho);
        }
        ArrayList arrayList5 = new ArrayList(ddVar.c.size() - iA);
        for (int i8 = iA; i8 < ddVar.c.size(); i8++) {
            arrayList5.add(null);
        }
        ay ayVar = new ay(arrayList4, arrayList5);
        for (int size2 = ddVar.c.size() - 1; size2 >= iA; size2--) {
            av avVar3 = (av) ddVar.c.remove(size2);
            av avVar4 = new av(avVar3);
            avVar4.d();
            arrayList5.set(size2 - iA, new aw(avVar4));
            avVar3.d = true;
            arrayList.add(avVar3);
            arrayList2.add(Boolean.TRUE);
        }
        ddVar.j.put(str, ayVar);
        return true;
    }
}
