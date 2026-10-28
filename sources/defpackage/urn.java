package defpackage;

import android.util.SizeF;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class urn {
    public static final ujr a = new ujr(0.0f, 0.0f);
    public static final SizeF b = new SizeF(1.0f, 1.0f);
    public final Optional c;
    public final Optional d;
    public final Optional e;

    public urn(Optional optional, Optional optional2, Optional optional3) {
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
    }

    public static urn a() {
        return new urn(Optional.empty(), Optional.empty(), Optional.empty());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof urn) {
            urn urnVar = (urn) obj;
            if (this.c.equals(urnVar.c) && this.d.equals(urnVar.d) && this.e.equals(urnVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        return "MotionEventDiff{translation=" + this.c.toString() + ", rotationDegreesClockwise=" + optional2.toString() + ", scale=" + optional.toString() + '}';
    }

    public urn() {
        throw null;
    }
}
