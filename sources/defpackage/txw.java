package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class txw extends WeakReference implements Map.Entry {
    public final int a;
    public final boolean b;
    public Object c;
    public txw d;

    public txw(Object obj, Object obj2, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        int i = 0;
        boolean z = obj == null;
        this.b = z;
        if (!z) {
            int iHashCode = obj.hashCode();
            int i2 = iHashCode + ((iHashCode << 15) ^ (-12931));
            int i3 = i2 ^ (i2 >>> 10);
            int i4 = i3 + (i3 << 3);
            int i5 = i4 ^ (i4 >>> 6);
            int i6 = i5 + (i5 << 2) + (i5 << 14);
            i = (i6 >>> 16) ^ i6;
        }
        this.a = i;
        this.c = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = super.get();
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.c;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return super.get();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.c;
        return this.a + (obj == null ? 0 : obj.hashCode());
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.c;
        this.c = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(super.get()) + '=' + String.valueOf(this.c);
    }
}
