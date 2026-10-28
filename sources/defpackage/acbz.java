package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acbz {
    public String a;
    public String b;
    public CharSequence c;
    private String d;
    private String e;
    private String f;
    private String g;
    private int h;
    private String i;
    private boolean j;
    private int k;
    private String l;
    private String m;
    private String n;
    private String o;
    private Optional p;
    private boolean q;
    private byte r;

    public acbz(acca accaVar) {
        this.p = Optional.empty();
        this.d = accaVar.a;
        this.e = accaVar.b;
        this.f = accaVar.c;
        this.g = accaVar.d;
        this.h = accaVar.e;
        this.a = accaVar.f;
        this.i = accaVar.g;
        this.j = accaVar.h;
        this.k = accaVar.i;
        this.b = accaVar.j;
        this.l = accaVar.k;
        this.m = accaVar.l;
        this.n = accaVar.m;
        this.o = accaVar.n;
        this.p = accaVar.o;
        this.c = accaVar.p;
        this.q = accaVar.q;
        this.r = (byte) 15;
    }

    public final acca a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (this.r == 15 && (str = this.d) != null && (str2 = this.e) != null && (str3 = this.f) != null && (str4 = this.g) != null && (str5 = this.i) != null && (str6 = this.l) != null && (str7 = this.m) != null && (str8 = this.n) != null && (str9 = this.o) != null) {
            return new acca(str, str2, str3, str4, this.h, this.a, str5, this.j, this.k, this.b, str6, str7, str8, str9, this.p, this.c, this.q);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" languageCode");
        }
        if (this.e == null) {
            sb.append(" languageName");
        }
        if (this.f == null) {
            sb.append(" trackName");
        }
        if (this.g == null) {
            sb.append(" videoId");
        }
        if ((this.r & 1) == 0) {
            sb.append(" format");
        }
        if (this.i == null) {
            sb.append(" trackId");
        }
        if ((this.r & 2) == 0) {
            sb.append(" isForOffline");
        }
        if ((this.r & 4) == 0) {
            sb.append(" autoTranslateRecommendedDisplayOrder");
        }
        if (this.l == null) {
            sb.append(" vssId");
        }
        if (this.m == null) {
            sb.append(" kind");
        }
        if (this.n == null) {
            sb.append(" url");
        }
        if (this.o == null) {
            sb.append(" id");
        }
        if ((this.r & 8) == 0) {
            sb.append(" isForcedTrack");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.k = i;
        this.r = (byte) (this.r | 4);
    }

    public final void c(acbk acbkVar) {
        this.p = Optional.of(acbkVar);
    }

    public final void d(int i) {
        this.h = i;
        this.r = (byte) (this.r | 1);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.o = str;
    }

    public final void f(boolean z) {
        this.j = z;
        this.r = (byte) (this.r | 2);
    }

    public final void g(boolean z) {
        this.q = z;
        this.r = (byte) (this.r | 8);
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null kind");
        }
        this.m = str;
    }

    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null languageCode");
        }
        this.d = str;
    }

    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null languageName");
        }
        this.e = str;
    }

    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Null trackId");
        }
        this.i = str;
    }

    public final void l(String str) {
        if (str == null) {
            throw new NullPointerException("Null trackName");
        }
        this.f = str;
    }

    public final void m(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.n = str;
    }

    public final void n(String str) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.g = str;
    }

    public final void o(String str) {
        if (str == null) {
            throw new NullPointerException("Null vssId");
        }
        this.l = str;
    }

    public acbz() {
        this.p = Optional.empty();
    }
}
