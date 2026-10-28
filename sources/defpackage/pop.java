package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pop {
    public aifv a;
    private String b;
    private String c;
    private String d;
    private aiff e;
    private String f;
    private aial g;
    private aigu h;
    private byte i;
    private int j;

    public final pos a() {
        String str;
        int i;
        String str2;
        String str3;
        aiff aiffVar;
        String str4;
        aial aialVar;
        aigu aiguVar;
        if (this.i == 1 && (str = this.b) != null && (i = this.j) != 0 && (str2 = this.c) != null && (str3 = this.d) != null && (aiffVar = this.e) != null && (str4 = this.f) != null && (aialVar = this.g) != null && (aiguVar = this.h) != null) {
            return new pos(str, i, str2, str3, aiffVar, this.a, str4, aialVar, aiguVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" actionId");
        }
        if (this.j == 0) {
            sb.append(" builtInActionType");
        }
        if (this.i == 0) {
            sb.append(" iconResourceId");
        }
        if (this.c == null) {
            sb.append(" text");
        }
        if (this.d == null) {
            sb.append(" url");
        }
        if (this.e == null) {
            sb.append(" threadStateUpdate");
        }
        if (this.f == null) {
            sb.append(" replyHintText");
        }
        if (this.g == null) {
            sb.append(" preferenceKey");
        }
        if (this.h == null) {
            sb.append(" snoozeDuration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null actionId");
        }
        this.b = str;
    }

    public final void c() {
        this.i = (byte) 1;
    }

    public final void d(aial aialVar) {
        if (aialVar == null) {
            throw new NullPointerException("Null preferenceKey");
        }
        this.g = aialVar;
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null replyHintText");
        }
        this.f = str;
    }

    public final void f(aigu aiguVar) {
        if (aiguVar == null) {
            throw new NullPointerException("Null snoozeDuration");
        }
        this.h = aiguVar;
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.c = str;
    }

    public final void h(aiff aiffVar) {
        if (aiffVar == null) {
            throw new NullPointerException("Null threadStateUpdate");
        }
        this.e = aiffVar;
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.d = str;
    }

    public final void j(int i) {
        if (i == 0) {
            throw new NullPointerException("Null builtInActionType");
        }
        this.j = i;
    }

    public final ozi k() {
        String str;
        int i;
        String str2;
        String str3;
        aiff aiffVar;
        String str4;
        aial aialVar;
        aigu aiguVar;
        if (this.i == 1 && (str = this.b) != null && (i = this.j) != 0 && (str2 = this.c) != null && (str3 = this.d) != null && (aiffVar = this.e) != null && (str4 = this.f) != null && (aialVar = this.g) != null && (aiguVar = this.h) != null) {
            return new ozi(str, i, str2, str3, aiffVar, this.a, str4, aialVar, aiguVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" actionId");
        }
        if (this.j == 0) {
            sb.append(" builtInActionType");
        }
        if (this.i == 0) {
            sb.append(" iconResourceId");
        }
        if (this.c == null) {
            sb.append(" text");
        }
        if (this.d == null) {
            sb.append(" url");
        }
        if (this.e == null) {
            sb.append(" threadStateUpdate");
        }
        if (this.f == null) {
            sb.append(" replyHintText");
        }
        if (this.g == null) {
            sb.append(" preferenceKey");
        }
        if (this.h == null) {
            sb.append(" snoozeDuration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void l(String str) {
        if (str == null) {
            throw new NullPointerException("Null actionId");
        }
        this.b = str;
    }

    public final void m() {
        this.i = (byte) 1;
    }

    public final void n(aial aialVar) {
        if (aialVar == null) {
            throw new NullPointerException("Null preferenceKey");
        }
        this.g = aialVar;
    }

    public final void o(String str) {
        if (str == null) {
            throw new NullPointerException("Null replyHintText");
        }
        this.f = str;
    }

    public final void p(aigu aiguVar) {
        if (aiguVar == null) {
            throw new NullPointerException("Null snoozeDuration");
        }
        this.h = aiguVar;
    }

    public final void q(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.c = str;
    }

    public final void r(aiff aiffVar) {
        if (aiffVar == null) {
            throw new NullPointerException("Null threadStateUpdate");
        }
        this.e = aiffVar;
    }

    public final void s(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.d = str;
    }

    public final void t(int i) {
        if (i == 0) {
            throw new NullPointerException("Null builtInActionType");
        }
        this.j = i;
    }
}
