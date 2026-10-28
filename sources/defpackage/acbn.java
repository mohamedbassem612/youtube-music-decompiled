package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbn {
    public final List a;
    public final transient List b;

    public acbn(List list) {
        this.a = DesugarCollections.unmodifiableList(list);
        TreeSet treeSet = new TreeSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            acce acceVar = (acce) it.next();
            treeSet.addAll(acceVar.b.c);
            treeSet.addAll(acceVar.b.d);
            treeSet.addAll(acceVar.c.b);
        }
        this.b = DesugarCollections.unmodifiableList(new ArrayList(treeSet));
    }

    public static agke a(twi twiVar, long j) {
        return agke.q(new acbl(j, j, new ArrayList(), twiVar));
    }

    public final List b(twi twiVar, long j) {
        ArrayList arrayList = new ArrayList();
        List list = this.b;
        if (!list.isEmpty()) {
            int i = 0;
            while (i < list.size() - 1) {
                int i2 = i + 1;
                arrayList.add(new acbl(((Long) list.get(i)).longValue() + j, ((Long) list.get(i2)).longValue() + j, c(((Long) list.get(i)).longValue()), twiVar));
                i = i2;
            }
        }
        return arrayList;
    }

    public final List c(long j) {
        Pair pair;
        List list;
        ArrayList arrayList = new ArrayList();
        for (acce acceVar : this.a) {
            accf accfVarA = acceVar.c.a(j);
            if (accfVarA == null || !accfVarA.f) {
                acco accoVar = acceVar.b;
                int iA = accoVar.a(j, false);
                if (iA == -1) {
                    pair = acco.b;
                } else {
                    List list2 = accoVar.e;
                    CharSequence charSequenceB = accoVar.b((CharSequence) list2.get(iA));
                    List list3 = accoVar.d;
                    long jLongValue = ((Long) list3.get(iA)).longValue();
                    while (true) {
                        int i = iA + 1;
                        if (i >= accoVar.c.size() || ((Long) list3.get(i)).longValue() != jLongValue) {
                            break;
                        }
                        iA = i;
                    }
                    CharSequence charSequenceB2 = accoVar.b((CharSequence) list2.get(iA));
                    if (true != acco.c(charSequenceB, charSequenceB2)) {
                        charSequenceB2 = charSequenceB;
                    }
                    pair = new Pair(charSequenceB, charSequenceB2);
                }
            } else {
                acco accoVar2 = acceVar.b;
                int iA2 = accoVar2.a(j, true);
                if (iA2 == -1) {
                    pair = acco.b;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    while (true) {
                        int i2 = iA2 + 1;
                        list = accoVar2.c;
                        if (i2 >= list.size() || ((Long) list.get(i2)).longValue() > j || ((Long) accoVar2.d.get(i2)).longValue() <= j) {
                            break;
                        }
                        CharSequence charSequenceB3 = accoVar2.b((CharSequence) accoVar2.e.get(iA2));
                        if (charSequenceB3.length() > 0 && charSequenceB3.charAt(charSequenceB3.length() - 1) == '\n') {
                            spannableStringBuilder.append(charSequenceB3);
                            spannableStringBuilder2.append(charSequenceB3);
                        }
                        iA2 = i2;
                    }
                    List list4 = accoVar2.e;
                    spannableStringBuilder.append(accoVar2.b((CharSequence) list4.get(iA2)));
                    List list5 = accoVar2.d;
                    long jLongValue2 = ((Long) list5.get(iA2)).longValue();
                    while (iA2 < list.size() && ((Long) list5.get(iA2)).longValue() == jLongValue2) {
                        CharSequence charSequenceB4 = accoVar2.b((CharSequence) list4.get(iA2));
                        if ((charSequenceB4.length() > 0 && charSequenceB4.charAt(charSequenceB4.length() - 1) == '\n') || (iA2 = iA2 + 1) >= list.size() || ((Long) list5.get(iA2)).longValue() > jLongValue2) {
                            spannableStringBuilder2.append(charSequenceB4);
                            break;
                        }
                    }
                    if (true != acco.c(spannableStringBuilder, spannableStringBuilder2)) {
                        spannableStringBuilder2 = spannableStringBuilder;
                    }
                    pair = new Pair(spannableStringBuilder, spannableStringBuilder2);
                }
            }
            arrayList.add(new acci(acceVar.a, j, (CharSequence) pair.first, (CharSequence) pair.second, accfVarA));
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (acce acceVar : this.a) {
            sb.append('[');
            sb.append(acceVar);
            sb.append(']');
        }
        return sb.toString();
    }
}
