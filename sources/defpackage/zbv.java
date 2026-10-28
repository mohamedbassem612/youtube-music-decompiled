package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zbv extends zcp {
    public final zjv a;
    public final int b;
    public final wgs c;
    private final bse d;
    private volatile transient bto e;
    private volatile transient cqs f;

    public zbv(zjv zjvVar, int i, wgs wgsVar, bse bseVar) {
        this.a = zjvVar;
        this.b = i;
        if (wgsVar == null) {
            throw new NullPointerException("Null compatibleFormatStream");
        }
        this.c = wgsVar;
        this.d = bseVar;
    }

    @Override // defpackage.zcp
    public final int a() {
        return this.b;
    }

    @Override // defpackage.zcp
    public final bse b() {
        return this.d;
    }

    @Override // defpackage.zcp
    public final wgs c() {
        return this.c;
    }

    @Override // defpackage.zcp
    public final zjv d() {
        return this.a;
    }

    @Override // defpackage.zcp
    public final bto e() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = new bto("", this.d);
                    if (this.e == null) {
                        throw new NullPointerException("trackGroup() cannot return null");
                    }
                }
            }
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zcp) {
            zcp zcpVar = (zcp) obj;
            if (this.a.equals(zcpVar.d()) && this.b == zcpVar.a() && this.c.equals(zcpVar.c()) && this.d.equals(zcpVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zcp
    public final cqs f() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    this.f = new cqt(e(), 0, 0, null);
                    if (this.f == null) {
                        throw new NullPointerException("trackSelection() cannot return null");
                    }
                }
            }
        }
        return this.f;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        bse bseVar = this.d;
        wgs wgsVar = this.c;
        return "VideoFormatAndRendererInformation{trackRendererType=" + this.a.toString() + ", rendererIndex=" + this.b + ", compatibleFormatStream=" + wgsVar.toString() + ", exoFormat=" + bseVar.toString() + '}';
    }
}
