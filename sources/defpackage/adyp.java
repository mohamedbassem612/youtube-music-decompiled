package defpackage;

import j$.time.Instant;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adyp {
    public boolean a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;

    public final adyq a() {
        Object obj;
        Object obj2;
        if (this.b == 1 && (obj = this.c) != null && (obj2 = this.d) != null) {
            return new adyq((anfy) obj, (agkj) obj2, this.a, (ajwo) this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" menuModel");
        }
        if (this.d == null) {
            sb.append(" endpointArgs");
        }
        if (this.b == 0) {
            sb.append(" shouldResolveOfflineMenuItemAsync");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Map map) {
        this.d = agkj.h(map);
    }

    public final void c(anfy anfyVar) {
        if (anfyVar == null) {
            throw new NullPointerException("Null menuModel");
        }
        this.c = anfyVar;
    }

    public final void d(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final xyi e() {
        Object obj = this.e;
        Object obj2 = this.d;
        return new xyi((Instant) obj, (Instant) obj2, (Instant) this.c, this.a, (~this.b) & 15);
    }

    public final void f(boolean z) {
        this.a = z;
        this.b = (byte) (this.b | 8);
    }

    public final void g(long j) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        instantOfEpochMilli.getClass();
        this.d = instantOfEpochMilli;
        this.b = (byte) (this.b | 2);
    }

    public final void h(long j) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        instantOfEpochMilli.getClass();
        this.e = instantOfEpochMilli;
        this.b = (byte) (this.b | 1);
    }

    public final void i(long j) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        instantOfEpochMilli.getClass();
        this.c = instantOfEpochMilli;
        this.b = (byte) (this.b | 4);
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null group");
        }
        this.e = str;
    }
}
