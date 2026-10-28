package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class thu extends ths {
    public final awmd a;
    public final awmd b;
    public final tfu c;
    public volatile transient toh d;
    public volatile transient boolean e;
    private final tao f;

    public thu(awmd awmdVar, awmd awmdVar2, tao taoVar, tfu tfuVar) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.f = taoVar;
        this.c = tfuVar;
    }

    @Override // defpackage.ths
    public final tao a() {
        throw null;
    }

    @Override // defpackage.ths
    public final awmd b() {
        throw null;
    }

    @Override // defpackage.ths
    public final awmd c() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof thu) {
            thu thuVar = (thu) obj;
            if (this.a.equals(thuVar.a) && this.b.equals(thuVar.b) && this.f.equals(thuVar.f) && this.c.equals(thuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        tfu tfuVar = this.c;
        tao taoVar = this.f;
        awmd awmdVar = this.b;
        return "CronetHttpClientConfig{cronetEngineProvider=" + this.a.toString() + ", headerDecoratorProvider=" + awmdVar.toString() + ", commonConfigs=" + taoVar.toString() + ", httpClientConfig=" + tfuVar.toString() + '}';
    }

    public thu() {
        throw null;
    }
}
