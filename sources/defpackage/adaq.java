package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adaq {
    public final Object a;
    public final amdd b;
    public final xgn c;
    public final ajwo d;

    public adaq(Object obj, amdd amddVar, xgn xgnVar, ajwo ajwoVar) {
        this.a = obj;
        this.b = amddVar;
        this.c = xgnVar;
        this.d = ajwoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adaq) {
            adaq adaqVar = (adaq) obj;
            Object obj2 = this.a;
            if (obj2 != null ? obj2.equals(adaqVar.a) : adaqVar.a == null) {
                amdd amddVar = this.b;
                if (amddVar != null ? amddVar.equals(adaqVar.b) : adaqVar.b == null) {
                    xgn xgnVar = this.c;
                    if (xgnVar != null ? xgnVar.equals(adaqVar.c) : adaqVar.c == null) {
                        ajwo ajwoVar = this.d;
                        if (ajwoVar == null) {
                            if (adaqVar.d == null) {
                                return true;
                            }
                        } else if (ajwoVar.equals(adaqVar.d)) {
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
        amdd amddVar = this.b;
        int iHashCode2 = amddVar == null ? 0 : amddVar.hashCode();
        int i = iHashCode ^ 1000003;
        xgn xgnVar = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (xgnVar == null ? 0 : xgnVar.hashCode())) * 1000003;
        ajwo ajwoVar = this.d;
        return (iHashCode3 ^ (ajwoVar != null ? ajwoVar.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        ajwo ajwoVar = this.d;
        xgn xgnVar = this.c;
        amdd amddVar = this.b;
        return "YouTubeCustomCommandEventDataImpl{tag=" + String.valueOf(this.a) + ", interactionLoggingClientData=" + String.valueOf(amddVar) + ", interactionLogger=" + String.valueOf(xgnVar) + ", command=" + String.valueOf(ajwoVar) + ", customConverters=null}";
    }

    public adaq() {
        throw null;
    }
}
