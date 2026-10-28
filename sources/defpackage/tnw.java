package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tnw {
    public final Object a;
    public final tmt b;
    public final tny c;
    public final boolean d;

    public tnw(Object obj, tmt tmtVar, tny tnyVar, boolean z) {
        this.a = obj;
        this.b = tmtVar;
        this.c = tnyVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tnw) {
            tnw tnwVar = (tnw) obj;
            Object obj2 = this.a;
            if (obj2 != null ? obj2.equals(tnwVar.a) : tnwVar.a == null) {
                tmt tmtVar = this.b;
                if (tmtVar != null ? tmtVar.equals(tnwVar.b) : tnwVar.b == null) {
                    tny tnyVar = this.c;
                    if (tnyVar != null ? tnyVar.equals(tnwVar.c) : tnwVar.c == null) {
                        if (this.d == tnwVar.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        tmt tmtVar = this.b;
        int iHashCode2 = tmtVar == null ? 0 : tmtVar.hashCode();
        int i = iHashCode ^ 1000003;
        tny tnyVar = this.c;
        return (((((i * 1000003) ^ iHashCode2) * 1000003) ^ (tnyVar != null ? tnyVar.hashCode() : 0)) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        tny tnyVar = this.c;
        tmt tmtVar = this.b;
        return "Success{result=" + String.valueOf(this.a) + ", cacheMetadata=" + String.valueOf(tmtVar) + ", sharedDataContext=" + String.valueOf(tnyVar) + ", isCacheHit=" + this.d + '}';
    }

    public tnw() {
        throw null;
    }
}
