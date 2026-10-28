package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jsb {
    public final Integer a;
    public final Object b;
    public final int c;
    private final jsc d;

    public jsb(Integer num, Object obj, int i, jsc jscVar) {
        this.a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = obj;
        this.c = i;
        this.d = jscVar;
    }

    public static jsb a(int i, Object obj) {
        return new jsb(Integer.valueOf(i), obj, 2, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jsb) {
            jsb jsbVar = (jsb) obj;
            Integer num = this.a;
            if (num != null ? num.equals(jsbVar.a) : jsbVar.a == null) {
                if (this.b.equals(jsbVar.b) && this.c == jsbVar.c) {
                    jsc jscVar = this.d;
                    if (jscVar == null) {
                        if (jsbVar.d == null) {
                            return true;
                        }
                    } else if (jscVar.equals(jsbVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.c;
        jsc jscVar = this.d;
        return ((((iHashCode * 1000003) ^ i) * 1000003) ^ (jscVar != null ? jscVar.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        int i = this.c;
        String string = this.b.toString();
        String str = i != 1 ? "VERY_LOW" : "DEFAULT";
        return "Event{code=" + this.a + ", payload=" + string + ", priority=" + str + ", productData=" + String.valueOf(this.d) + ", eventContext=null}";
    }

    public jsb() {
        throw null;
    }
}
