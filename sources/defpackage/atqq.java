package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class atqq {
    private atqq() {
    }

    public static Map A(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map B(Map map, awml awmlVar) {
        if (map.isEmpty()) {
            return v(awmlVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(awmlVar.a, awmlVar.b);
        return linkedHashMap;
    }

    public static Map C(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            F(linkedHashMap, iterable);
            int size = linkedHashMap.size();
            if (size != 0) {
                return size != 1 ? linkedHashMap : w(linkedHashMap);
            }
            return awnp.a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return awnp.a;
        }
        if (size2 == 1) {
            return v((awml) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(u(collection.size()));
        F(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static Map D(Map map) {
        map.getClass();
        int size = map.size();
        if (size != 0) {
            return size != 1 ? new LinkedHashMap(map) : w(map);
        }
        return awnp.a;
    }

    public static Map E(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static void F(Map map, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            awml awmlVar = (awml) it.next();
            map.put(awmlVar.a, awmlVar.b);
        }
    }

    public static void G(Map map, awml[] awmlVarArr) {
        for (awml awmlVar : awmlVarArr) {
            map.put(awmlVar.a, awmlVar.b);
        }
    }

    public static final List H(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List I(Object obj) {
        return obj != null ? H(obj) : awno.a;
    }

    public static List J(Object... objArr) {
        return new ArrayList(new awnl(objArr, true));
    }

    public static List K(List list) {
        int size = list.size();
        if (size != 0) {
            return size == 1 ? H(list.get(0)) : list;
        }
        return awno.a;
    }

    public static void L() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void M() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static int N(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static List O(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aA(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static void P(List list, Comparator comparator) {
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static Object Q(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(list.size() - 1);
    }

    public static int R(List list, int i) {
        if (i >= 0) {
            awni awniVar = (awni) list;
            if (i <= awniVar.a() - 1) {
                return (awniVar.a() - 1) - i;
            }
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new awsa(0, ((awni) list).a() - 1) + "].");
    }

    public static int S(List list, int i) {
        if (i >= 0) {
            awni awniVar = (awni) list;
            if (i <= awniVar.a()) {
                return awniVar.a() - i;
            }
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new awsa(0, ((awni) list).a()) + "].");
    }

    public static List T(List list) {
        list.getClass();
        return new awnv(list);
    }

    public static Comparable U(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable V(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Object W(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return X((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object X(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object Y(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
        } else {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                return it.next();
            }
        }
        return null;
    }

    public static Object Z(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Object a(Context context, Class cls) {
        return atqp.a(a.aJ(context.getApplicationContext()), cls);
    }

    public static void aA(Collection collection, Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void aB(Collection collection, awsx awsxVar) {
        Iterator itA = awsxVar.a();
        while (itA.hasNext()) {
            collection.add(itA.next());
        }
    }

    public static void aC(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, awqg awqgVar) {
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            awrc.k(appendable, obj, awqgVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String aD(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, awqg awqgVar, int i) {
        iterable.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        charSequence4.getClass();
        CharSequence charSequence5 = (i & 2) != 0 ? "" : charSequence2;
        charSequence5.getClass();
        CharSequence charSequence6 = (i & 4) != 0 ? "" : charSequence3;
        charSequence6.getClass();
        CharSequence charSequence7 = (i & 16) != 0 ? "..." : null;
        charSequence7.getClass();
        StringBuilder sb = new StringBuilder();
        aC(iterable, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : awqgVar);
        return sb.toString();
    }

    public static void aE(Iterable iterable, awqg awqgVar) {
        iterable.getClass();
        aI(iterable, awqgVar, true);
    }

    public static void aF(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        list.remove(list.size() - 1);
    }

    public static final void aG(int i, Object[] objArr) {
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }

    public static void aH(Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void aI(Iterable iterable, awqg awqgVar, boolean z) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) awqgVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
            }
        }
    }

    public static final void aJ(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(a.cj(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static boolean aK(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        int length = objArr.length;
        if (length == objArr2.length) {
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!aK((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if (!(obj instanceof boolean[]) || !(obj2 instanceof boolean[])) {
                            if ((obj instanceof awms) && (obj2 instanceof awms)) {
                                throw null;
                            }
                            if ((obj instanceof awmw) && (obj2 instanceof awmw)) {
                                throw null;
                            }
                            if ((obj instanceof awmt) && (obj2 instanceof awmt)) {
                                throw null;
                            }
                            if ((obj instanceof awmu) && (obj2 instanceof awmu)) {
                                throw null;
                            }
                            if (awrc.c(obj, obj2)) {
                            }
                        } else if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static List aL(Object[] objArr) {
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static byte[] aM(byte[] bArr, int i, int i2) {
        bArr.getClass();
        aJ(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static Object[] aN(Object[] objArr, int i, int i2) {
        objArr.getClass();
        aJ(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static int aO(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Object aP(Object[] objArr, int i) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static List aQ(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        ba(objArr, arrayList);
        return arrayList;
    }

    public static List aR(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return awno.a;
        }
        if (length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        objArrCopyOf.getClass();
        List listAsList = Arrays.asList(objArrCopyOf);
        listAsList.getClass();
        return listAsList;
    }

    public static Set aS(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return awnq.a;
        }
        if (length != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(u(length));
            bb(objArr, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(objArr[0]);
        setSingleton.getClass();
        return setSingleton;
    }

    public static awsx aT(Object[] objArr) {
        return objArr.length == 0 ? awsq.a : new bag(objArr, 2);
    }

    public static boolean aU(Object[] objArr, Object obj) {
        int i;
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] != null) {
                    i++;
                }
            }
            return false;
        }
        int length2 = objArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            if (awrc.c(obj, objArr[i2])) {
                i = i2;
            }
        }
        return false;
        return i >= 0;
    }

    public static void aV(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void aW(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void aX(int[] iArr, int[] iArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = iArr.length;
        }
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, 0, iArr2, 0, i);
    }

    public static /* synthetic */ void aY(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    public static /* synthetic */ void aZ(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static Object aa(List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static Object ab(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static Object ac(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Object ad(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object ae(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object af(List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static HashSet ag(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(u(N(iterable, 12)));
        aH(iterable, hashSet);
        return hashSet;
    }

    public static List ah(Iterable iterable) {
        iterable.getClass();
        return ap(av(iterable));
    }

    public static List ai(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List aj(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + iterable.size());
        arrayList.addAll(collection);
        arrayList.addAll(iterable);
        return arrayList;
    }

    public static List ak(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List al(Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return ap(iterable);
        }
        Object[] array = iterable.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List am(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listAq = aq(iterable);
            P(listAq, comparator);
            return listAq;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return ap(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List an(Iterable iterable, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.bP(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return awno.a;
        }
        if (i >= iterable.size()) {
            return ap(iterable);
        }
        if (i == 1) {
            return H(W(iterable));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return K(arrayList);
    }

    public static List ao(List list, int i) {
        list.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.bP(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return awno.a;
        }
        int size = list.size();
        if (i >= size) {
            return ap(list);
        }
        if (i == 1) {
            return H(ab(list));
        }
        int i2 = size - i;
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            while (i2 < size) {
                arrayList.add(list.get(i2));
                i2++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i2);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List ap(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return K(aq(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return awno.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        List listSingletonList = Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List aq(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ar((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        aH(iterable, arrayList);
        return arrayList;
    }

    public static List ar(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static List as(Iterable iterable, Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(N(iterable, 10), N(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new awml(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set at(Iterable iterable, Iterable iterable2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        agqr it = ((agpl) iterable).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (iterable2.contains(next)) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set au(Iterable iterable, Iterable iterable2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!iterable2.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static Set av(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        aH(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set aw(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            aH(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return awnq.a;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set setSingleton = Collections.singleton(linkedHashSet.iterator().next());
            setSingleton.getClass();
            return setSingleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return awnq.a;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(u(collection.size()));
            aH(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set setSingleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        setSingleton2.getClass();
        return setSingleton2;
    }

    public static awsx ax(Iterable iterable) {
        iterable.getClass();
        return new bag(iterable, 3);
    }

    public static boolean ay(Iterable iterable, Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    M();
                }
                if (awrc.c(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            return false;
        }
        iIndexOf = ((List) iterable).indexOf(obj);
        return iIndexOf >= 0;
    }

    public static int[] az(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static void b(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static void ba(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static void bb(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static void bc(Object[] objArr, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void d(Object obj) {
        obj.getClass();
    }

    public static awou e(awou awouVar, awou awouVar2) {
        awouVar2.getClass();
        return awouVar2 != awov.a ? (awou) awouVar2.fold(awouVar, new jnk(3)) : awouVar;
    }

    public static final int f(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static Comparable g(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    public static Comparable h(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        return comparable.compareTo(comparable2) > 0 ? comparable2 : comparable;
    }

    public static final int i(int i) {
        if (i <= 0) {
            i = 1;
        }
        return Integer.highestOneBit(i * 3);
    }

    public static final int j(Object[] objArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final String k(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append('[');
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static final void l(Object[] objArr, int i) {
        objArr.getClass();
        objArr[i] = null;
    }

    public static final void m(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            l(objArr, i);
            i++;
        }
    }

    public static final boolean n(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!awrc.c(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final Set o(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static Set p(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(u(1));
        bb(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set q(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        if (iterable.isEmpty()) {
            return aw(set);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (!iterable.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set r(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(u(set.size() + Integer.valueOf(iterable.size()).intValue()));
        linkedHashSet.addAll(set);
        aA(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static Set s(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(u(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final Object t(Map map, Object obj) {
        if (map instanceof awnt) {
            return ((awnt) map).a();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(a.bV(obj, "Key ", " is missing in the map."));
    }

    public static int u(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        return i >= 1073741824 ? Alert.DURATION_SHOW_INDEFINITELY : (int) ((i / 0.75f) + 1.0f);
    }

    public static Map v(awml awmlVar) {
        awmlVar.getClass();
        Map mapSingletonMap = Collections.singletonMap(awmlVar.a, awmlVar.b);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Map w(Map map) {
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static Object x(Map map, Object obj) {
        map.getClass();
        return t(map, obj);
    }

    public static Map y(awml... awmlVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(u(awmlVarArr.length));
        G(linkedHashMap, awmlVarArr);
        return linkedHashMap;
    }

    public static Map z(awml... awmlVarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(u(1));
        G(linkedHashMap, awmlVarArr);
        return linkedHashMap;
    }
}
