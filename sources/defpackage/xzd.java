package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Instant;
import j$.util.Optional;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xzd {
    public short a;
    public xwc b;
    private String c;
    private Instant d;
    private String e;
    private String f;
    private int g;
    private amyv h;
    private xyj i;
    private Optional j;
    private Optional k;
    private int l;

    public xzd(xze xzeVar) {
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = xzeVar.k;
        this.c = xzeVar.a;
        this.d = xzeVar.b;
        this.e = xzeVar.c;
        this.f = xzeVar.d;
        this.b = xzeVar.j;
        this.g = xzeVar.e;
        this.h = xzeVar.f;
        this.i = xzeVar.g;
        this.j = xzeVar.h;
        this.k = xzeVar.i;
        this.a = (short) 2047;
    }

    public final xze a() {
        int i = ~this.a;
        if ((i & 1) != 0) {
            throw new IllegalStateException("Missing required properties: sessionType");
        }
        int i2 = this.l;
        String str = this.c;
        Instant instant = this.d;
        String str2 = this.e;
        String str3 = this.f;
        xwc xwcVar = this.b;
        int i3 = this.g;
        amyv amyvVar = this.h;
        xyj xyjVar = this.i;
        Optional optionalEmpty = this.j;
        Optional optionalEmpty2 = this.k;
        String string = str;
        if ((i & 2) != 0) {
            string = UUID.randomUUID().toString();
            string.getClass();
        }
        if ((i & 4) != 0) {
            instant = Instant.EPOCH;
            instant.getClass();
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        if ((i & 16) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            xwcVar = null;
        }
        if ((i & 64) != 0) {
            i3 = 0;
        }
        if ((i & SemanticState.Focused) != 0) {
            amyvVar = amyv.MDX_SESSION_SOURCE_UNKNOWN;
        }
        if ((i & SemanticState.Hidden) != 0) {
            xyjVar = null;
        }
        if ((i & SemanticState.LiveRegion) != 0) {
            optionalEmpty = Optional.empty();
        }
        if ((i & SemanticState.ReadOnly) != 0) {
            optionalEmpty2 = Optional.empty();
        }
        String str4 = str2;
        Instant instant2 = instant;
        String str5 = string;
        Optional optional = optionalEmpty;
        xyj xyjVar2 = xyjVar;
        amyv amyvVar2 = amyvVar;
        return new xze(i2, str5, instant2, str4, str3, xwcVar, i3, amyvVar2, xyjVar2, optional, optionalEmpty2);
    }

    public final void b(xyi xyiVar) {
        this.j = Optional.of(xyiVar);
        this.a = (short) (this.a | 512);
    }

    public final void c(xyj xyjVar) {
        this.i = xyjVar;
        this.a = (short) (this.a | 256);
    }

    public final void d(amyu amyuVar) {
        this.k = Optional.of(amyuVar);
        this.a = (short) (this.a | 1024);
    }

    public final void e(amyv amyvVar) {
        if (amyvVar == null) {
            throw new NullPointerException("Null mdxSessionSource");
        }
        this.h = amyvVar;
        this.a = (short) (this.a | 128);
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null mediaRouteId");
        }
        this.e = str;
        this.a = (short) (this.a | 8);
    }

    public final void g(int i) {
        this.g = i;
        this.a = (short) (this.a | 64);
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null sessionNonce");
        }
        this.c = str;
        this.a = (short) (this.a | 2);
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null screenName");
        }
        this.f = str;
        this.a = (short) (this.a | 16);
    }

    public final void j(long j) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        instantOfEpochMilli.getClass();
        this.d = instantOfEpochMilli;
        this.a = (short) (this.a | 4);
    }

    public final void k(int i) {
        if (i == 0) {
            throw new NullPointerException("Null sessionType");
        }
        this.l = i;
        this.a = (short) (this.a | 1);
    }

    public xzd() {
        this.j = Optional.empty();
        this.k = Optional.empty();
    }
}
