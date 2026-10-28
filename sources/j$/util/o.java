package j$.util;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class o implements java.util.Map.Entry {
    public java.util.Map.Entry a;

    public o(java.util.Map.Entry entry) {
        entry.getClass();
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        java.util.Map.Entry entry = this.a;
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) obj;
            Object key = entry.getKey();
            Object key2 = entry2.getKey();
            if (key == null) {
                zEquals = key2 == null;
            } else {
                zEquals = key.equals(key2);
            }
            if (zEquals) {
                Object value = entry.getValue();
                Object value2 = entry2.getValue();
                if (value == null) {
                    zEquals2 = value2 == null;
                } else {
                    zEquals2 = value.equals(value2);
                }
                if (zEquals2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.a.toString();
    }
}
