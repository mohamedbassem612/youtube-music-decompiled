package defpackage;

import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class zto {
    public final awmd a;
    public zuj b;
    public ztr c;
    public int d;
    public int e;
    public long f;
    public long h;
    public int i = 0;
    private final List j = new ArrayList();
    public long g = Long.MAX_VALUE;

    public zto(awmd awmdVar) {
        this.a = awmdVar;
    }

    final void a() {
        if (this.h > 0) {
            String str = ztf.K;
            aihf aihfVar = this.b.b;
            int i = ((akkr) aihfVar.instance).bw + 1;
            aihfVar.copyOnWrite();
            akkr akkrVar = (akkr) aihfVar.instance;
            akkrVar.e |= SemanticState.Obscured;
            akkrVar.bw = i;
            this.h = 0L;
            this.i = 0;
            ((syn) this.a.io()).b("des_dispatch_all_task");
        }
    }

    final void b(ztp ztpVar, long j) {
        long j2;
        int i = ztpVar.f;
        int i2 = i - 1;
        if (this.b == null) {
            if (i2 != 3) {
                this.e++;
                return;
            } else {
                this.d++;
                return;
            }
        }
        String str = ztf.K;
        this.j.add(ztpVar);
        if (i == 4) {
            a();
        }
        long j3 = this.c.R;
        if (i == 2) {
            j2 = 7000;
            j3 += 7000;
        } else {
            j2 = 0;
            if (i == 4) {
                j3 = 120000;
            }
        }
        this.f = Math.max(this.f, j3 + j);
        this.g = Math.min(this.g, j + j2);
        zuj zujVar = this.b;
        if (i2 != 3) {
            aihf aihfVar = zujVar.b;
            int i3 = ((akkr) aihfVar.instance).bD + 1;
            aihfVar.copyOnWrite();
            akkr akkrVar = (akkr) aihfVar.instance;
            akkrVar.e |= 524288;
            akkrVar.bD = i3;
            return;
        }
        aihf aihfVar2 = zujVar.b;
        int i4 = ((akkr) aihfVar2.instance).bx + 1;
        aihfVar2.copyOnWrite();
        akkr akkrVar2 = (akkr) aihfVar2.instance;
        akkrVar2.e |= SemanticState.Multiline;
        akkrVar2.bx = i4;
    }

    final void c(int i) {
        String str = ztf.K;
        if (i == 6) {
            a();
        }
        List<ztp> list = this.j;
        for (ztp ztpVar : list) {
            int i2 = i - 1;
            if (ztpVar.f == 4) {
                if (i2 == 1) {
                    aihf aihfVar = this.b.b;
                    int i3 = ((akkr) aihfVar.instance).bz + 1;
                    aihfVar.copyOnWrite();
                    akkr akkrVar = (akkr) aihfVar.instance;
                    akkrVar.e |= 32768;
                    akkrVar.bz = i3;
                } else if (i2 == 3) {
                    aihf aihfVar2 = this.b.b;
                    int i4 = ((akkr) aihfVar2.instance).bB + 1;
                    aihfVar2.copyOnWrite();
                    akkr akkrVar2 = (akkr) aihfVar2.instance;
                    akkrVar2.e |= 131072;
                    akkrVar2.bB = i4;
                } else if (i2 == 4) {
                    aihf aihfVar3 = this.b.b;
                    int i5 = ((akkr) aihfVar3.instance).bC + 1;
                    aihfVar3.copyOnWrite();
                    akkr akkrVar3 = (akkr) aihfVar3.instance;
                    akkrVar3.e |= 262144;
                    akkrVar3.bC = i5;
                } else if (i2 == 5) {
                    aihf aihfVar4 = this.b.b;
                    int i6 = ((akkr) aihfVar4.instance).by + 1;
                    aihfVar4.copyOnWrite();
                    akkr akkrVar4 = (akkr) aihfVar4.instance;
                    akkrVar4.e |= 16384;
                    akkrVar4.by = i6;
                }
            } else if (i2 == 1) {
                aihf aihfVar5 = this.b.b;
                int i7 = ((akkr) aihfVar5.instance).bF + 1;
                aihfVar5.copyOnWrite();
                akkr akkrVar5 = (akkr) aihfVar5.instance;
                akkrVar5.e |= 2097152;
                akkrVar5.bF = i7;
            } else if (i2 == 3) {
                aihf aihfVar6 = this.b.b;
                int i8 = ((akkr) aihfVar6.instance).bH + 1;
                aihfVar6.copyOnWrite();
                akkr akkrVar6 = (akkr) aihfVar6.instance;
                akkrVar6.e |= 8388608;
                akkrVar6.bH = i8;
            } else if (i2 == 4) {
                aihf aihfVar7 = this.b.b;
                int i9 = ((akkr) aihfVar7.instance).bI + 1;
                aihfVar7.copyOnWrite();
                akkr akkrVar7 = (akkr) aihfVar7.instance;
                akkrVar7.e |= 16777216;
                akkrVar7.bI = i9;
            } else if (i2 == 5) {
                aihf aihfVar8 = this.b.b;
                int i10 = ((akkr) aihfVar8.instance).bE + 1;
                aihfVar8.copyOnWrite();
                akkr akkrVar8 = (akkr) aihfVar8.instance;
                akkrVar8.e |= 1048576;
                akkrVar8.bE = i10;
            }
            ztpVar.e.kn();
        }
        list.clear();
        this.f = 0L;
        this.g = Long.MAX_VALUE;
    }
}
