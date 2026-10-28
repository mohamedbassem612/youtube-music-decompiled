package defpackage;

import internal.org.jni_zero.JniZero;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mcm implements qnt {
    public final ahey a;
    public final ahey b;
    public final ahey c;
    private final boolean d;
    private final boolean e;

    public mcm(ahey aheyVar, ahey aheyVar2, ahey aheyVar3, Optional optional, Optional optional2) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) optional.orElse(bool)).booleanValue();
        this.d = zBooleanValue;
        this.e = ((Boolean) optional2.orElse(bool)).booleanValue();
        this.a = zBooleanValue ? new mcl(aheyVar) : aheyVar;
        this.b = zBooleanValue ? new mcl(aheyVar2) : aheyVar2;
        this.c = zBooleanValue ? new mcl(aheyVar3) : aheyVar3;
    }

    @Override // defpackage.qnt
    public final void a() {
        hby hbyVar = new hby(this, 7);
        boolean z = atqp.w;
        atqp.c = hbyVar;
        hby hbyVar2 = new hby(this, 8);
        boolean z2 = atqp.w;
        atqp.e = hbyVar2;
        hby hbyVar3 = new hby(this, 9);
        boolean z3 = atqp.w;
        atqp.d = hbyVar3;
        hby hbyVar4 = new hby(this, 10);
        boolean z4 = atqp.w;
        atqp.f = hbyVar4;
        if (!this.d) {
            igz igzVar = new igz(11);
            boolean z5 = atqp.w;
            atqp.b = igzVar;
        }
        if (this.e) {
            JniZero.a = new ibj(this, 13);
        }
    }
}
