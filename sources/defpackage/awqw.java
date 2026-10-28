package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awqw {
    private static final Object[] a = new Object[0];

    public static final Object[] a(Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return a;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            objArrCopyOf[i] = it.next();
            i++;
            if (i >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i2 = ((i * 3) + 1) >>> 1;
                if (i2 <= i) {
                    i2 = 2147483645;
                    if (i >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
                objArrCopyOf.getClass();
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i);
                objArrCopyOf2.getClass();
                return objArrCopyOf2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    objArrCopyOf[i] = it.next();
                    i++;
                    if (i >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i2 = ((i * 3) + 1) >>> 1;
                        if (i2 <= i) {
                            i2 = 2147483645;
                            if (i >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
                        objArrCopyOf.getClass();
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i);
                            objArrCopyOf2.getClass();
                            return objArrCopyOf2;
                        }
                        objArr[i] = null;
                    }
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }
}
