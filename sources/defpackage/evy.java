package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evy implements ett {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final ett g;
    private final Map h;
    private final ety i;
    private int j;

    public evy(Object obj, ett ettVar, int i, int i2, Map map, Class cls, Class cls2, ety etyVar) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.b = obj;
        if (ettVar == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.g = ettVar;
        this.c = i;
        this.d = i2;
        if (map == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.h = map;
        if (cls == null) {
            throw new NullPointerException("Resource class must not be null");
        }
        this.e = cls;
        this.f = cls2;
        if (etyVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.i = etyVar;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (!(obj instanceof evy)) {
            return false;
        }
        evy evyVar = (evy) obj;
        return this.b.equals(evyVar.b) && this.g.equals(evyVar.g) && this.d == evyVar.d && this.c == evyVar.c && this.h.equals(evyVar.h) && this.e.equals(evyVar.e) && this.f.equals(evyVar.f) && this.i.equals(evyVar.i);
    }

    @Override // defpackage.ett
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.j = iHashCode;
        int iHashCode2 = (((((iHashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
        this.j = iHashCode2;
        int iHashCode3 = (iHashCode2 * 31) + this.h.hashCode();
        this.j = iHashCode3;
        int iHashCode4 = (iHashCode3 * 31) + this.e.hashCode();
        this.j = iHashCode4;
        int iHashCode5 = (iHashCode4 * 31) + this.f.hashCode();
        this.j = iHashCode5;
        int iHashCode6 = (iHashCode5 * 31) + this.i.hashCode();
        this.j = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        ety etyVar = this.i;
        Map map = this.h;
        ett ettVar = this.g;
        Class cls = this.f;
        Class cls2 = this.e;
        return "EngineKey{model=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + ettVar.toString() + ", hashCode=" + this.j + ", transformations=" + map.toString() + ", options=" + etyVar.toString() + '}';
    }
}
