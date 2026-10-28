package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aakx {
    public final HashSet a;
    public boolean b = false;
    public final String c;
    public final tbt d;
    public final aaqn e;
    public final int f;
    public final int g;

    public aakx(aofh aofhVar, agke agkeVar, tbt tbtVar, aaqn aaqnVar, int i) {
        this.a = new HashSet(agkeVar);
        this.c = wfs.h(aofhVar.d);
        int iBc = a.bc(aofhVar.c);
        this.g = iBc == 0 ? 1 : iBc;
        this.d = tbtVar;
        this.e = aaqnVar;
        this.f = i;
    }
}
