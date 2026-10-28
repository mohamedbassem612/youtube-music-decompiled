package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmh {
    public apev a;
    public akrn b;
    public akrn c;
    public aqpq d;
    private boolean e;
    private boolean f;
    private agke g;
    private Optional h;
    private boolean i;
    private byte j;

    public acmh(acmi acmiVar) {
        this.h = Optional.empty();
        this.e = acmiVar.a;
        this.f = acmiVar.b;
        this.g = acmiVar.c;
        this.a = acmiVar.d;
        this.b = acmiVar.e;
        this.c = acmiVar.f;
        this.d = acmiVar.g;
        this.h = acmiVar.h;
        this.i = acmiVar.i;
        this.j = (byte) 7;
    }

    public final acmi a() {
        agke agkeVar;
        if (this.j == 7 && (agkeVar = this.g) != null) {
            return new acmi(this.e, this.f, agkeVar, this.a, this.b, this.c, this.d, this.h, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" shouldShowTopBar");
        }
        if ((this.j & 2) == 0) {
            sb.append(" logInteractions");
        }
        if (this.g == null) {
            sb.append(" topBarButtons");
        }
        if ((this.j & 4) == 0) {
            sb.append(" shouldShowSendToTvButton");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null blockRegistry");
        }
        this.h = optional;
    }

    public final void c(boolean z) {
        this.f = z;
        this.j = (byte) (this.j | 2);
    }

    public final void d(boolean z) {
        this.i = z;
        this.j = (byte) (this.j | 4);
    }

    public final void e(boolean z) {
        this.e = z;
        this.j = (byte) (this.j | 1);
    }

    public final void f(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null topBarButtons");
        }
        this.g = agkeVar;
    }

    public acmh() {
        this.h = Optional.empty();
    }
}
