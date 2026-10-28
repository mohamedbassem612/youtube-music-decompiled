package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zrs {
    public final boolean a;
    public zsa b;
    public akkt c;
    public akwd d = h();
    private final tao e;
    private final long f;
    private akkj g;
    private akkn h;
    private akkn i;
    private akkn j;
    private akkn k;
    private final dov l;

    public zrs(tao taoVar, dov dovVar, tqj tqjVar) {
        this.e = taoVar;
        this.l = dovVar;
        int i = tqr.a;
        this.f = tqjVar.c(1077944256);
        this.a = tqjVar.k(1073814966);
        int i2 = 7;
        taoVar.c().K(new xee(i2)).r().af(new xwu(this, i2));
    }

    public static akwd h() {
        aihf aihfVarCreateBuilder = akwd.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        akwd akwdVar = (akwd) aihfVarCreateBuilder.instance;
        akwdVar.b |= 1;
        akwdVar.c = true;
        aihfVarCreateBuilder.copyOnWrite();
        akwd akwdVar2 = (akwd) aihfVarCreateBuilder.instance;
        akwdVar2.b |= 2;
        akwdVar2.e = 720;
        aihfVarCreateBuilder.copyOnWrite();
        akwd akwdVar3 = (akwd) aihfVarCreateBuilder.instance;
        akwdVar3.b |= 4;
        akwdVar3.f = true;
        aihfVarCreateBuilder.copyOnWrite();
        akwd akwdVar4 = (akwd) aihfVarCreateBuilder.instance;
        akwdVar4.b |= 8;
        akwdVar4.g = false;
        aihf aihfVarCreateBuilder2 = akwe.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        akwe akweVar = (akwe) aihfVarCreateBuilder2.instance;
        akweVar.b |= 1;
        akweVar.c = false;
        aihfVarCreateBuilder.copyOnWrite();
        akwd akwdVar5 = (akwd) aihfVarCreateBuilder.instance;
        akwe akweVar2 = (akwe) aihfVarCreateBuilder2.build();
        akweVar2.getClass();
        akwdVar5.h = akweVar2;
        akwdVar5.b |= 16;
        return (akwd) aihfVarCreateBuilder.build();
    }

    private static final void m(boolean z, aihf aihfVar, int i, int i2, int i3) {
        int iAS = a.aS(((akkn) aihfVar.instance).e);
        if (iAS == 0 || iAS == 1) {
            aihfVar.copyOnWrite();
            akkn akknVar = (akkn) aihfVar.instance;
            akknVar.e = i - 1;
            akknVar.b |= 4;
        }
        akkn akknVar2 = (akkn) aihfVar.instance;
        int i4 = akknVar2.c;
        int i5 = akknVar2.d;
        boolean z2 = z || i4 < 0 || i4 > i5 || i5 > 300;
        if (true != z2) {
            i2 = i4;
        }
        aihfVar.copyOnWrite();
        akkn akknVar3 = (akkn) aihfVar.instance;
        akknVar3.b |= 1;
        akknVar3.c = i2;
        if (true != z2) {
            i3 = i5;
        }
        aihfVar.copyOnWrite();
        akkn akknVar4 = (akkn) aihfVar.instance;
        akknVar4.b |= 2;
        akknVar4.d = i3;
    }

    private static final akkn n(akkn akknVar, akku akkuVar) {
        aihf builder;
        boolean z = akknVar == null;
        if (z) {
            builder = akkn.a.createBuilder();
        } else {
            akknVar.getClass();
            builder = akknVar.toBuilder();
        }
        int iOrdinal = akkuVar.ordinal();
        if (iOrdinal == 1) {
            m(z, builder, 2, 60, 120);
        } else if (iOrdinal == 2) {
            m(z, builder, 3, 60, 120);
        } else if (iOrdinal == 3) {
            m(z, builder, 3, 4, 5);
        } else if (iOrdinal != 4) {
            m(z, builder, 2, 60, 120);
        } else {
            m(z, builder, 2, 0, 0);
        }
        return (akkn) builder.build();
    }

    public final double a() {
        return c().k;
    }

    public final akkj b() {
        aihf aihfVarCreateBuilder;
        akkj akkjVar = this.g;
        if (akkjVar != null) {
            return akkjVar;
        }
        akkk akkkVarC = c();
        if ((akkkVarC.b & 16) != 0) {
            akkj akkjVar2 = akkkVarC.c;
            if (akkjVar2 == null) {
                akkjVar2 = akkj.a;
            }
            aihfVarCreateBuilder = akkjVar2.toBuilder();
        } else {
            aihfVarCreateBuilder = akkj.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            akkj akkjVar3 = (akkj) aihfVarCreateBuilder.instance;
            akkjVar3.b |= 1;
            akkjVar3.c = true;
        }
        akkj akkjVar4 = (akkj) aihfVarCreateBuilder.instance;
        int i = akkjVar4.d;
        boolean z = i >= 0 && akkjVar4.e > i;
        if (!z) {
            i = 0;
        }
        aihfVarCreateBuilder.copyOnWrite();
        akkj akkjVar5 = (akkj) aihfVarCreateBuilder.instance;
        akkjVar5.b |= 2;
        akkjVar5.d = i;
        int i2 = z ? akkjVar5.e : 10;
        aihfVarCreateBuilder.copyOnWrite();
        akkj akkjVar6 = (akkj) aihfVarCreateBuilder.instance;
        akkjVar6.b |= 4;
        akkjVar6.e = i2;
        akkj akkjVar7 = (akkj) aihfVarCreateBuilder.build();
        this.g = akkjVar7;
        return akkjVar7;
    }

    public final akkk c() {
        anhb anhbVar = this.e.a().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        akkk akkkVar = anhbVar.h;
        return akkkVar == null ? akkk.a : akkkVar;
    }

    public final akkn d() {
        akkn akknVar;
        akkn akknVar2 = this.h;
        if (akknVar2 != null) {
            return akknVar2;
        }
        akko akkoVar = c().e;
        if (akkoVar == null) {
            akkoVar = akko.a;
        }
        if ((akkoVar.b & 2) != 0) {
            akknVar = akkoVar.d;
            if (akknVar == null) {
                akknVar = akkn.a;
            }
        } else {
            akknVar = null;
        }
        akkn akknVarN = n(akknVar, akku.DELAYED_EVENT_TIER_DEFAULT);
        this.h = akknVarN;
        return akknVarN;
    }

    public final akkn e() {
        akkn akknVar;
        akkn akknVar2 = this.j;
        if (akknVar2 != null) {
            return akknVar2;
        }
        akko akkoVar = c().e;
        if (akkoVar == null) {
            akkoVar = akko.a;
        }
        if ((akkoVar.b & 4) != 0) {
            akknVar = akkoVar.e;
            if (akknVar == null) {
                akknVar = akkn.a;
            }
        } else {
            akknVar = null;
        }
        akkn akknVarN = n(akknVar, akku.DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY);
        this.j = akknVarN;
        return akknVarN;
    }

    public final akkn f() {
        akkn akknVar;
        akkn akknVar2 = this.i;
        if (akknVar2 != null) {
            return akknVar2;
        }
        akko akkoVar = c().e;
        if (akkoVar == null) {
            akkoVar = akko.a;
        }
        if ((akkoVar.b & 8) != 0) {
            akknVar = akkoVar.f;
            if (akknVar == null) {
                akknVar = akkn.a;
            }
        } else {
            akknVar = null;
        }
        akkn akknVarN = n(akknVar, akku.DELAYED_EVENT_TIER_FAST);
        this.i = akknVarN;
        return akknVarN;
    }

    public final akkn g() {
        akkn akknVar;
        akkn akknVar2 = this.k;
        if (akknVar2 != null) {
            return akknVar2;
        }
        akko akkoVar = c().e;
        if (akkoVar == null) {
            akkoVar = akko.a;
        }
        if ((akkoVar.b & 16) != 0) {
            akknVar = akkoVar.g;
            if (akknVar == null) {
                akknVar = akkn.a;
            }
        } else {
            akknVar = null;
        }
        akkn akknVarN = n(akknVar, akku.DELAYED_EVENT_TIER_IMMEDIATE);
        this.k = akknVarN;
        return akknVarN;
    }

    public final File i() {
        return new File(this.l.ag(), "desv2");
    }

    public final synchronized void j(amuh amuhVar) {
        if (amuhVar != null) {
            if ((amuhVar.b & 1) != 0) {
                akwd akwdVar = amuhVar.c;
                if (akwdVar == null) {
                    akwdVar = akwd.a;
                }
                aihf builder = akwdVar.toBuilder();
                if ((((akwd) builder.instance).b & 16) == 0) {
                    aihf aihfVarCreateBuilder = akwe.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    akwe akweVar = (akwe) aihfVarCreateBuilder.instance;
                    akweVar.b |= 1;
                    akweVar.c = false;
                    builder.copyOnWrite();
                    akwd akwdVar2 = (akwd) builder.instance;
                    akwe akweVar2 = (akwe) aihfVarCreateBuilder.build();
                    akweVar2.getClass();
                    akwdVar2.h = akweVar2;
                    akwdVar2.b |= 16;
                }
                this.d = (akwd) builder.build();
                return;
            }
        }
        this.d = h();
    }

    public final boolean k() {
        return c().j;
    }

    public final boolean l(long j) {
        return (this.f & j) != 0;
    }
}
