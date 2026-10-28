package defpackage;

import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ycx {
    public final xvu a;
    public final JSONObject b;

    public ycx(xvu xvuVar, JSONObject jSONObject) {
        this.a = xvuVar;
        this.b = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ycx) {
            ycx ycxVar = (ycx) obj;
            if (this.a.equals(ycxVar.a) && this.b.equals(ycxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        JSONObject jSONObject = this.b;
        return "MdxMessage{method=" + String.valueOf(this.a) + ", data=" + String.valueOf(jSONObject) + '}';
    }

    public ycx() {
        throw null;
    }
}
