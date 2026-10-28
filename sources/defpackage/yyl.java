package defpackage;

import j$.util.Objects;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yyl implements Comparator {
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;

    private final int a(wgs wgsVar) {
        int iF = wgsVar.f();
        if (this.b || iF != 4) {
            return iF;
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        wgs wgsVar = (wgs) obj;
        wgs wgsVar2 = (wgs) obj2;
        return agil.b.f(wgsVar.Y(), wgsVar2.Y()).f(Objects.equals(wgsVar.v(), this.a), Objects.equals(wgsVar2.v(), this.a)).f(wgsVar.R() == this.c, wgsVar2.R() == this.c).f(wgsVar.F() == this.c, wgsVar2.F() == this.c).b(a(wgsVar2), a(wgsVar)).f(wgsVar.P() == this.d, wgsVar2.P() == this.d).f(wgsVar.X(), wgsVar2.X()).f(wgsVar.ad(), wgsVar2.ad()).a();
    }
}
