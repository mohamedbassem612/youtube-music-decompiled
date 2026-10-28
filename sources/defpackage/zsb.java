package defpackage;

import app.rive.semantics.SemanticState;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zsb implements zrw {
    private static final int a;
    private static final agke b;
    private final aonh c;
    private zrx d;
    private zrx e;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        a = 720;
        b = agpi.a;
    }

    public zsb(tao taoVar) {
        anhb anhbVar = taoVar.a().j;
        aonh aonhVar = (anhbVar == null ? anhb.a : anhbVar).g;
        this.c = aonhVar == null ? aonh.a : aonhVar;
    }

    @Override // defpackage.zrw
    public final int a() {
        aonh aonhVar = this.c;
        if ((aonhVar.b & 2) != 0) {
            return aonhVar.d;
        }
        return 100;
    }

    @Override // defpackage.zrw
    public final int b() {
        aonh aonhVar = this.c;
        return (aonhVar.b & 32) != 0 ? aonhVar.f : a;
    }

    @Override // defpackage.zrw
    public final int c() {
        aonh aonhVar = this.c;
        if ((aonhVar.b & 1) != 0) {
            return aonhVar.c;
        }
        return 1000;
    }

    @Override // defpackage.zrw
    public final int d() {
        aonh aonhVar = this.c;
        if ((aonhVar.b & 16) != 0) {
            return aonhVar.e;
        }
        return 60;
    }

    @Override // defpackage.zrw
    public final zrx e() {
        zsc zscVar;
        if (this.e == null) {
            aonh aonhVar = this.c;
            if ((aonhVar.b & SemanticState.Obscured) != 0) {
                aoni aoniVar = aonhVar.j;
                if (aoniVar == null) {
                    aoniVar = aoni.a;
                }
                zscVar = new zsc(aoniVar);
            } else {
                zscVar = new zsc(a, b);
            }
            this.e = zscVar;
        }
        return this.e;
    }

    @Override // defpackage.zrw
    public final zrx f() {
        zsc zscVar;
        if (this.d == null) {
            aonh aonhVar = this.c;
            if ((aonhVar.b & SemanticState.Modal) != 0) {
                aoni aoniVar = aonhVar.i;
                if (aoniVar == null) {
                    aoniVar = aoni.a;
                }
                zscVar = new zsc(aoniVar);
            } else {
                zscVar = new zsc(a, b);
            }
            this.d = zscVar;
        }
        return this.d;
    }

    @Override // defpackage.zrw
    public final boolean g() {
        aonh aonhVar = this.c;
        if ((aonhVar.b & SemanticState.LiveRegion) != 0) {
            return aonhVar.g;
        }
        return true;
    }

    @Override // defpackage.zrw
    public final boolean h() {
        return this.c.h;
    }

    @Override // defpackage.zrw
    public final boolean i() {
        aonh aonhVar = this.c;
        if ((aonhVar.b & 131072) != 0) {
            return aonhVar.k;
        }
        return false;
    }
}
