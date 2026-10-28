package defpackage;

import j$.util.Objects;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeqx implements tct {
    private final awmd a;
    private final awmd b;
    private final Executor c;
    private final vxz d;

    public aeqx(vxz vxzVar, awmd awmdVar, awmd awmdVar2, Executor executor) {
        this.d = vxzVar;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = executor;
    }

    public final void a(int i) {
        String line;
        vxz vxzVar = this.d;
        float fA = (float) vxzVar.a(2, 45399385L, 0.0d);
        if (Float.compare(fA, 0.0f) == 0 || !((szb) this.b.io()).b(fA, szc.i)) {
            return;
        }
        aihf aihfVarCreateBuilder = aokn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aokn aoknVar = (aokn) aihfVarCreateBuilder.instance;
        aoknVar.b |= 1;
        aoknVar.c = true;
        aihfVarCreateBuilder.copyOnWrite();
        aokn aoknVar2 = (aokn) aihfVarCreateBuilder.instance;
        aoknVar2.e = i - 1;
        aoknVar2.b |= 4;
        if (vxzVar.l(49, 45400157L, false)) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/status"));
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            throw new IOException("Failed to find: VmRSS");
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } while (!line.startsWith("VmRSS:"));
                String[] strArrSplit = line.split("\\s+", -1);
                if (!Objects.equals(strArrSplit[2], "kB")) {
                    throw new IOException("Failed to find status bytes");
                }
                long j = Long.parseLong(strArrSplit[1]) << 10;
                bufferedReader.close();
                aihfVarCreateBuilder.copyOnWrite();
                aokn aoknVar3 = (aokn) aihfVarCreateBuilder.instance;
                aoknVar3.b |= 2;
                aoknVar3.d = j;
            } catch (IOException unused) {
            }
        }
        xeu xeuVar = (xeu) this.a.io();
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.OUT_OF_MEMORY);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        aokn aoknVar4 = (aokn) aihfVarCreateBuilder.build();
        aoknVar4.getClass();
        alouVar.d = aoknVar4;
        alouVar.c = 187;
        xeuVar.b((alou) alosVar.build());
    }

    @Override // defpackage.tct
    public final void b(int i) {
        int i2;
        int i3 = 1;
        if (i == 5) {
            i2 = 4;
        } else if (i != 10) {
            i2 = i != 15 ? 1 : 2;
        } else {
            i2 = 3;
        }
        if (i2 != 1) {
            if (this.d.l(55, 45401892L, false)) {
                this.c.execute(afwl.i(new aesl(this, i2, i3)));
            } else {
                a(i2);
            }
        }
    }
}
