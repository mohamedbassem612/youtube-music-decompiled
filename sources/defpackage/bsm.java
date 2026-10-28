package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bsm {
    public final UUID a;
    public final Uri b;
    public final agkj c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final agke g;
    public final byte[] h;

    static {
        bwp.a;
    }

    public bsm(ggu gguVar) {
        Object obj = gguVar.c;
        obj.getClass();
        this.a = (UUID) obj;
        byte[] bArrCopyOf = null;
        this.b = null;
        this.c = (agkj) gguVar.e;
        this.d = false;
        this.f = false;
        this.e = true;
        this.g = (agke) gguVar.a;
        Object obj2 = gguVar.d;
        if (obj2 != null) {
            byte[] bArr = (byte[]) obj2;
            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        }
        this.h = bArrCopyOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bsm) {
            bsm bsmVar = (bsm) obj;
            if (this.a.equals(bsmVar.a)) {
                Uri uri = bsmVar.b;
                if (Objects.equals(null, null) && Objects.equals(this.c, bsmVar.c)) {
                    boolean z = bsmVar.d;
                    boolean z2 = bsmVar.f;
                    boolean z3 = bsmVar.e;
                    if (aguu.v(this.g, bsmVar.g) && Arrays.equals(this.h, bsmVar.h)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 961) + this.c.hashCode()) * 29791) + 1) * 31) + this.g.hashCode()) * 31) + Arrays.hashCode(this.h);
    }
}
