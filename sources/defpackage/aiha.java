package defpackage;

import com.google.protobuf.MessageLite;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aiha {
    public static final aiha a = new aiha(null);
    public final aijl b = new aijl();
    boolean c;
    boolean d;

    private aiha(byte[] bArr) {
        f();
        f();
    }

    public static int a(aika aikaVar, int i, Object obj) {
        int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        if (aikaVar == aika.GROUP) {
            iNumberOfLeadingZeros <<= 1;
        }
        return iNumberOfLeadingZeros + b(aikaVar, obj);
    }

    static int b(aika aikaVar, Object obj) {
        int iNumberOfLeadingZeros;
        int iAN;
        int iNumberOfLeadingZeros2;
        int iNumberOfLeadingZeros3;
        int i;
        aika aikaVar2 = aika.DOUBLE;
        aikb aikbVar = aikb.a;
        switch (aikaVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                return 4;
            case INT64:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i = 640 - (iNumberOfLeadingZeros * 9);
                return i >>> 6;
            case UINT64:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i = 640 - (iNumberOfLeadingZeros * 9);
                return i >>> 6;
            case INT32:
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros(((Integer) obj).intValue());
                i = 640 - (iNumberOfLeadingZeros * 9);
                return i >>> 6;
            case FIXED64:
                ((Long) obj).longValue();
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                return 1;
            case STRING:
                if (obj instanceof aigj) {
                    iAN = ((aigj) obj).d();
                    iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iAN);
                } else {
                    iAN = ahng.aN((String) obj);
                    iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iAN);
                }
                return ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iAN;
            case GROUP:
                return ((MessageLite) obj).getSerializedSize();
            case MESSAGE:
                if (obj instanceof aiii) {
                    return ((aiii) obj).a();
                }
                iAN = ((MessageLite) obj).getSerializedSize();
                iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iAN);
                return ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iAN;
            case BYTES:
                if (!(obj instanceof aigj)) {
                    return aigs.G((byte[]) obj);
                }
                iAN = ((aigj) obj).d();
                iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iAN);
                return ((352 - (iNumberOfLeadingZeros2 * 9)) >>> 6) + iAN;
            case UINT32:
                iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(((Integer) obj).intValue());
                i = 352 - (iNumberOfLeadingZeros3 * 9);
                return i >>> 6;
            case ENUM:
                iNumberOfLeadingZeros = obj instanceof aihr ? Long.numberOfLeadingZeros(((aihr) obj).getNumber()) : Long.numberOfLeadingZeros(((Integer) obj).intValue());
                i = 640 - (iNumberOfLeadingZeros * 9);
                return i >>> 6;
            case SFIXED32:
                ((Integer) obj).intValue();
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                return 8;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros((iIntValue << 1) ^ (iIntValue >> 31));
                i = 352 - (iNumberOfLeadingZeros3 * 9);
                return i >>> 6;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                iNumberOfLeadingZeros = Long.numberOfLeadingZeros((jLongValue << 1) ^ (jLongValue >> 63));
                i = 640 - (iNumberOfLeadingZeros * 9);
                return i >>> 6;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static Object d(Object obj) {
        if (obj instanceof aiiw) {
            return ((aiiw) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static void g(aigs aigsVar, aika aikaVar, int i, Object obj) {
        if (aikaVar == aika.GROUP) {
            aigsVar.w(i, 3);
            ((MessageLite) obj).writeTo(aigsVar);
            aigsVar.w(i, 4);
            return;
        }
        aigsVar.w(i, aikaVar.t);
        aikb aikbVar = aikb.a;
        switch (aikaVar) {
            case DOUBLE:
                aigsVar.R(((Double) obj).doubleValue());
                break;
            case FLOAT:
                aigsVar.T(((Float) obj).floatValue());
                break;
            case INT64:
                aigsVar.A(((Long) obj).longValue());
                break;
            case UINT64:
                aigsVar.A(((Long) obj).longValue());
                break;
            case INT32:
                aigsVar.p(((Integer) obj).intValue());
                break;
            case FIXED64:
                aigsVar.n(((Long) obj).longValue());
                break;
            case FIXED32:
                aigsVar.l(((Integer) obj).intValue());
                break;
            case BOOL:
                aigsVar.e(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof aigj)) {
                    aigsVar.v((String) obj);
                } else {
                    aigsVar.j((aigj) obj);
                }
                break;
            case GROUP:
                ((MessageLite) obj).writeTo(aigsVar);
                break;
            case MESSAGE:
                aigsVar.r((MessageLite) obj);
                break;
            case BYTES:
                if (!(obj instanceof aigj)) {
                    byte[] bArr = (byte[]) obj;
                    aigsVar.B(bArr, bArr.length);
                } else {
                    aigsVar.j((aigj) obj);
                }
                break;
            case UINT32:
                aigsVar.y(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof aihr)) {
                    aigsVar.p(((Integer) obj).intValue());
                } else {
                    aigsVar.p(((aihr) obj).getNumber());
                }
                break;
            case SFIXED32:
                aigsVar.l(((Integer) obj).intValue());
                break;
            case SFIXED64:
                aigsVar.n(((Long) obj).longValue());
                break;
            case SINT32:
                int iIntValue = ((Integer) obj).intValue();
                aigsVar.y((iIntValue << 1) ^ (iIntValue >> 31));
                break;
            case SINT64:
                long jLongValue = ((Long) obj).longValue();
                aigsVar.A((jLongValue << 1) ^ (jLongValue >> 63));
                break;
        }
    }

    public static int j(aihk aihkVar, Object obj) {
        aika aikaVar = aihkVar.c;
        int i = aihkVar.b;
        if (!aihkVar.d) {
            return a(aikaVar, i, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!aihkVar.e) {
            int iA = 0;
            while (i2 < size) {
                iA += a(aikaVar, i, list.get(i2));
                i2++;
            }
            return iA;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iB = 0;
        while (i2 < size) {
            iB += b(aikaVar, list.get(i2));
            i2++;
        }
        return ((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + iB + ((352 - (Integer.numberOfLeadingZeros(iB) * 9)) >>> 6);
    }

    private static boolean o(Object obj) {
        if (obj instanceof aiis) {
            return ((aiis) obj).isInitialized();
        }
        if (obj instanceof aiii) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void p(aihk aihkVar, Object obj) {
        boolean z;
        obj.getClass();
        aika aikaVar = aika.DOUBLE;
        aikb aikbVar = aikb.a;
        aikb aikbVar2 = aihkVar.c.s;
        switch (aikbVar2.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(aihkVar.b), aikbVar2, obj.getClass().getName()));
            case 1:
                z = obj instanceof Long;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(aihkVar.b), aikbVar2, obj.getClass().getName()));
            case 2:
                z = obj instanceof Float;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(aihkVar.b), aikbVar2, obj.getClass().getName()));
            case 3:
                z = obj instanceof Double;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(aihkVar.b), aikbVar2, obj.getClass().getName()));
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(aihkVar.b), aikbVar2, obj.getClass().getName()));
            case 5:
                z = obj instanceof String;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(aihkVar.b), aikbVar2, obj.getClass().getName()));
            case 6:
                if ((obj instanceof aigj) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(aihkVar.b), aikbVar2, obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof aihr)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(aihkVar.b), aikbVar2, obj.getClass().getName()));
            case 8:
                if ((obj instanceof MessageLite) || (obj instanceof aiii)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(aihkVar.b), aikbVar2, obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(aihkVar.b), aikbVar2, obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aiha clone() {
        aiha aihaVar = new aiha();
        aijl aijlVar = this.b;
        int size = aijlVar.size();
        for (int i = 0; i < size; i++) {
            aiji aijiVar = (aiji) aijlVar.a(i);
            aihaVar.m(aijiVar.c, aijiVar.a);
        }
        aihaVar.d = this.d;
        return aihaVar;
    }

    public final Iterator e() {
        if (h()) {
            return Collections.emptyIterator();
        }
        boolean z = this.d;
        aijl aijlVar = this.b;
        return z ? new aiih(aijlVar.entrySet().iterator()) : aijlVar.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (obj instanceof aiha) {
            aijl aijlVar = this.b;
            aijl aijlVar2 = ((aiha) obj).b;
            if (aijlVar.size() == aijlVar2.size() && aijlVar.keySet().equals(aijlVar2.keySet())) {
                for (Map.Entry entry : aijlVar.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Object obj2 = aijlVar2.get(key);
                    if (value == obj2) {
                        zEquals = true;
                    } else if (value == null || obj2 == null) {
                        zEquals = false;
                    } else if (value instanceof aiii) {
                        zEquals = value.equals(obj2);
                    } else {
                        zEquals = obj2 instanceof aiii ? obj2.equals(value) : value.equals(obj2);
                    }
                    if (!zEquals) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.c) {
            return;
        }
        aijl aijlVar = this.b;
        int size = aijlVar.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((aiji) aijlVar.a(i)).a;
            if (obj instanceof aihn) {
                ((aihn) obj).makeImmutable();
            }
        }
        if (!aijlVar.c) {
            aijlVar.c();
            if (aijlVar.a != null) {
                for (int i2 = 0; i2 < aijlVar.b; i2++) {
                    aiji aijiVar = (aiji) aijlVar.a[i2];
                    if (aijiVar.c.d) {
                        aijiVar.setValue(DesugarCollections.unmodifiableList((List) aijiVar.a));
                    }
                }
            }
            aijlVar.c = true;
        }
        this.c = true;
    }

    final boolean h() {
        return this.b.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        aijl aijlVar = this.b;
        int size = aijlVar.size();
        for (int i = 0; i < size; i++) {
            aiji aijiVar = (aiji) aijlVar.a(i);
            aihk aihkVar = aijiVar.c;
            if (aihkVar.a() == aikb.i) {
                boolean z = aihkVar.d;
                Object obj = aijiVar.a;
                if (z) {
                    List list = (List) obj;
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (!o(list.get(i2))) {
                            return false;
                        }
                    }
                } else if (!o(obj)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final Object k(aihk aihkVar) {
        Object obj = this.b.get(aihkVar);
        return obj instanceof aiii ? ((aiii) obj).b() : obj;
    }

    public final void l(aihk aihkVar, Object obj) {
        List arrayList;
        if (!aihkVar.d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        p(aihkVar, obj);
        Object objK = k(aihkVar);
        if (objK == null) {
            arrayList = new ArrayList();
            this.b.d(aihkVar, arrayList);
        } else {
            arrayList = (List) objK;
        }
        arrayList.add(obj);
    }

    public final void m(aihk aihkVar, Object obj) {
        if (!aihkVar.d) {
            p(aihkVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                p(aihkVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof aiii) {
            this.d = true;
        }
        this.b.d(aihkVar, obj);
    }

    public final boolean n(aihk aihkVar) {
        if (aihkVar.d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.b.get(aihkVar) != null;
    }

    private aiha() {
    }
}
