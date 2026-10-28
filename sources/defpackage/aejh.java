package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aejh {
    public String a;
    public List b;
    public short c;
    private String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private Set k;
    private int l;

    public final aeji a() {
        String str;
        int i;
        Set set;
        if (this.c == 1023 && (str = this.d) != null && (i = this.l) != 0 && (set = this.k) != null) {
            return new aeji(str, this.a, this.e, this.f, this.b, this.g, this.h, this.i, this.j, i, set);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" clientName");
        }
        if ((this.c & 1) == 0) {
            sb.append(" assistedQueryIndex");
        }
        if ((this.c & 2) == 0) {
            sb.append(" lastVisibleSuggestionIndex");
        }
        if ((this.c & 4) == 0) {
            sb.append(" experimentTriggered");
        }
        if ((this.c & 8) == 0) {
            sb.append(" firstEditTimeMillis");
        }
        if ((this.c & 16) == 0) {
            sb.append(" lastEditTimeMillis");
        }
        if ((this.c & 32) == 0) {
            sb.append(" sessionDurationMillis");
        }
        if ((this.c & 64) == 0) {
            sb.append(" zeroPrefixSuggestionsEnabled");
        }
        if ((this.c & 128) == 0) {
            sb.append(" numZeroPrefixSuggestionsShown");
        }
        if (this.l == 0) {
            sb.append(" searchMethod");
        }
        if (this.k == null) {
            sb.append(" inputMethods");
        }
        if ((this.c & 256) == 0) {
            sb.append(" maxRoundTripTimeMsec");
        }
        if ((this.c & 512) == 0) {
            sb.append(" totalRoundTripTimeMsec");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.e = i;
        this.c = (short) (this.c | 1);
    }

    public final void c() {
        this.d = "youtube-music";
    }

    public final void d(int i) {
        this.g = i;
        this.c = (short) (this.c | 8);
    }

    public final void e(Set set) {
        if (set == null) {
            throw new NullPointerException("Null inputMethods");
        }
        this.k = set;
    }

    public final void f(int i) {
        this.h = i;
        this.c = (short) (this.c | 16);
    }

    public final void g(int i) {
        this.f = i;
        this.c = (short) (this.c | 2);
    }

    public final void h() {
        this.c = (short) (this.c | 128);
    }

    public final void i(int i) {
        this.i = i;
        this.c = (short) (this.c | 32);
    }

    public final void j(boolean z) {
        this.j = z;
        this.c = (short) (this.c | 64);
    }

    public final void k(int i) {
        if (i == 0) {
            throw new NullPointerException("Null searchMethod");
        }
        this.l = i;
    }
}
