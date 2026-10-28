package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zcu implements zcx {
    final /* synthetic */ zcy a;
    private final int b;
    private final zcs c;

    public zcu(zcy zcyVar, zcs zcsVar, int i) {
        this.a = zcyVar;
        this.c = zcsVar;
        this.b = i;
    }

    @Override // defpackage.zcx
    public final int a() {
        return this.c.a;
    }

    @Override // defpackage.zcx
    public final int b() {
        int iA = a();
        if (iA == 1) {
            return 100;
        }
        aihf aihfVarCreateBuilder = akxc.a.createBuilder();
        int i = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar = (akxc) aihfVarCreateBuilder.instance;
        akxcVar.b |= 1;
        akxcVar.c = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar2 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar2.b |= 4;
        akxcVar2.e = 20000;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar3 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar3.b |= 2;
        akxcVar3.d = 1.3f;
        aihfVarCreateBuilder.copyOnWrite();
        akxc akxcVar4 = (akxc) aihfVarCreateBuilder.instance;
        akxcVar4.b |= 8;
        akxcVar4.f = 0.1f;
        return new zjh(new zaz((akxc) aihfVarCreateBuilder.build(), 4)).a(iA - 1);
    }

    @Override // defpackage.zcx
    public final /* synthetic */ long c() {
        return -9223372036854775807L;
    }

    @Override // defpackage.zcx
    public final void d() {
        this.c.a++;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    @Override // defpackage.zcx
    public final boolean e() {
        int iA = a();
        akwm akwmVar = ((wiu) this.a.b.io()).d.f;
        if (akwmVar == null) {
            akwmVar = akwm.b;
        }
        int i = akwmVar.aJ;
        if (i > 0) {
            if (i == -1) {
                i = Alert.DURATION_SHOW_INDEFINITELY;
            }
        } else if (i != -1) {
            i = 10;
        } else {
            i = -1;
            if (i == -1) {
                i = Alert.DURATION_SHOW_INDEFINITELY;
            }
        }
        return iA < i;
    }
}
