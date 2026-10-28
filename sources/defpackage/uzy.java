package defpackage;

import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzy {
    public Optional a = Optional.empty();
    public agke b;
    public String c;
    public apvy d;
    public int e;
    private String f;
    private String g;
    private String h;
    private int i;

    public final uzz a() {
        String str;
        String str2;
        int i;
        int i2;
        agke agkeVar;
        String str3 = this.f;
        if (str3 != null && (str = this.g) != null && (str2 = this.h) != null && (i = this.e) != 0 && (i2 = this.i) != 0 && (agkeVar = this.b) != null) {
            return new uzz(str3, str, str2, i, i2, this.a, agkeVar, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" assetId");
        }
        if (this.g == null) {
            sb.append(" assetLoggingId");
        }
        if (this.h == null) {
            sb.append(" assetName");
        }
        if (this.e == 0) {
            sb.append(" assetSource");
        }
        if (this.i == 0) {
            sb.append(" assetUserType");
        }
        if (this.b == null) {
            sb.append(" assetParallelData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null assetId");
        }
        this.f = str;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null assetLoggingId");
        }
        this.g = str;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null assetName");
        }
        this.h = str;
    }

    public final void e(List list) {
        this.b = agke.n(list);
    }

    public final void f(int i) {
        if (i == 0) {
            throw new NullPointerException("Null assetUserType");
        }
        this.i = i;
    }
}
