package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class amv extends anx {
    private final Object a;
    private final Object b = null;
    private final Object[] d = null;
    private final PointerInputEventHandler e;

    public amv(Object obj, PointerInputEventHandler pointerInputEventHandler) {
        this.a = obj;
        this.e = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof amv) {
            amv amvVar = (amv) obj;
            if (awrc.c(this.a, amvVar.a)) {
                Object obj2 = amvVar.b;
                Object[] objArr = amvVar.d;
                if (this.e == amvVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj != null ? obj.hashCode() : 0) * 29791) + this.e.hashCode();
    }
}
