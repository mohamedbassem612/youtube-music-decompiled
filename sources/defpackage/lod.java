package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lod implements kms {
    public static final lod a = new lod();
    private final boolean b = false;
    private final boolean c = false;
    private final String d = null;
    private final boolean e = false;
    private final boolean i = false;
    private final String g = null;
    private final String h = null;
    private final Long j = null;
    private final Long k = null;

    private lod() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lod) {
            lod lodVar = (lod) obj;
            boolean z = lodVar.b;
            boolean z2 = lodVar.c;
            String str = lodVar.d;
            if (Objects.equals(null, null)) {
                boolean z3 = lodVar.e;
                boolean z4 = lodVar.i;
                String str2 = lodVar.g;
                if (Objects.equals(null, null)) {
                    String str3 = lodVar.h;
                    if (Objects.equals(null, null)) {
                        Long l = lodVar.j;
                        if (Objects.equals(null, null)) {
                            Long l2 = lodVar.k;
                            if (Objects.equals(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hash(bool, bool, null, bool, bool, null, null, null, null);
    }
}
