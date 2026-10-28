package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbs {
    public static final acbs a = new acbs();
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public String k;
    public boolean l;
    public int m;
    public boolean n;
    public String o;
    public boolean p;
    public int q;
    public String r;

    public acbs(acbs acbsVar) {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.k = "#FFFFFF";
        this.m = 255;
        this.o = "#000000";
        this.q = 255;
        this.r = "#000000";
        this.b = acbsVar.b;
        this.c = acbsVar.c;
        this.d = acbsVar.d;
        this.e = acbsVar.e;
        this.f = acbsVar.f;
        this.g = acbsVar.g;
        this.h = acbsVar.h;
        this.i = acbsVar.i;
        this.j = acbsVar.j;
        this.k = acbsVar.k;
        this.l = acbsVar.l;
        this.m = acbsVar.m;
        this.n = acbsVar.n;
        this.o = acbsVar.o;
        this.p = acbsVar.p;
        this.q = acbsVar.q;
        this.r = acbsVar.r;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder(SemanticState.Focused);
        if (!this.k.equals("#FFFFFF")) {
            sb.append("<font color=");
            sb.append(this.k);
            sb.append('>');
        }
        if (this.c) {
            sb.append("<I>");
        }
        return sb.toString();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder(SemanticState.Focused);
        if (this.c) {
            sb.append("</I>");
        }
        if (!this.k.equals("#FFFFFF")) {
            sb.append("</font>");
        }
        return sb.toString();
    }

    public acbs() {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.k = "#FFFFFF";
        this.m = 255;
        this.o = "#000000";
        this.q = 255;
        this.r = "#000000";
    }
}
