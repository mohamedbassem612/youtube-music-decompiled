package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tua {
    public apho a;
    public ajwo b;
    public Optional c = Optional.empty();
    public acjw d;
    private String e;
    private int f;
    private String g;
    private aigj h;
    private byte i;

    public final tub a() {
        String str;
        String str2;
        aigj aigjVar;
        acjw acjwVar;
        if (this.i == 1 && (str = this.e) != null && (str2 = this.g) != null && (aigjVar = this.h) != null && (acjwVar = this.d) != null) {
            return new tsw(str, this.a, this.b, this.c, this.f, str2, aigjVar, acjwVar, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" targetId");
        }
        if (this.i == 0) {
            sb.append(" pageType");
        }
        if (this.g == null) {
            sb.append(" continuation");
        }
        if (this.h == null) {
            sb.append(" trackingParams");
        }
        if (this.d == null) {
            sb.append(" continuationType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null continuation");
        }
        this.g = str;
    }

    public final void c(int i) {
        this.f = i;
        this.i = (byte) 1;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null targetId");
        }
        this.e = str;
    }

    public final void e(aigj aigjVar) {
        if (aigjVar == null) {
            throw new NullPointerException("Null trackingParams");
        }
        this.h = aigjVar;
    }
}
