package defpackage;

import internal.org.jni_zero.JniZero;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abyd {
    public static final abyd a = new abyd((byte[]) null);
    public static final Map b;
    public final Map c;

    static {
        int i = awrn.a;
        b = atqq.y(new awml(new awqv(abxk.class), new abya(abxk.a)), new awml(new awqv(abxo.class), new abya(abxo.e)), new awml(new awqv(abxj.class), new abya(abxj.a)), new awml(new awqv(abxi.class), new abya(abxi.a)));
    }

    public abyd(Map map) {
        this.c = map;
    }

    public final abxp a(Class cls) {
        Map map = this.c;
        awsd awsdVarI = JniZero.i(cls);
        abyc abycVar = (abyc) map.get(awsdVarI);
        abxp abxpVarA = abycVar != null ? abycVar.a() : null;
        if (true != (abxpVarA instanceof abxp)) {
            abxpVarA = null;
        }
        if (abxpVarA != null) {
            return abxpVarA;
        }
        abyc abycVar2 = (abyc) b.get(awsdVarI);
        abxp abxpVarA2 = abycVar2 != null ? abycVar2.a() : null;
        abxpVarA2.getClass();
        return abxpVarA2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof abyd) && awrc.c(this.c, ((abyd) obj).c);
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "PlayerSettingsConfiguration(overriddenSettings=" + this.c + ')';
    }

    public abyd() {
        this((byte[]) null);
    }

    public /* synthetic */ abyd(byte[] bArr) {
        this(awnp.a);
    }
}
