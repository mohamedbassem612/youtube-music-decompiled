package defpackage;

import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abit implements absr {
    final /* synthetic */ abiu a;

    public abit(abiu abiuVar) {
        this.a = abiuVar;
    }

    @Override // defpackage.absr
    public final void a(wjf wjfVar) {
        tam tamVar = this.a.a;
        if (tamVar.b) {
            return;
        }
        agev agevVar = tamVar.l;
        Optional optionalOfNullable = Optional.ofNullable(wjfVar.m());
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Collection.EL.stream(((aisu) optionalOfNullable.get()).e).map(new snm(2)).filter(new sde(8)).findFirst();
            optionalOfNullable.getClass();
        }
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((arcg) optionalOfNullable.get()).e.G());
        }
        Object obj = ((agfa) agevVar).a;
        sla slaVar = new sla(obj, 2);
        if (true == optionalOfNullable.isPresent()) {
            Object obj2 = optionalOfNullable.get();
            optionalOfNullable = Optional.ofNullable((alvt) ((wjr) ((tld) slaVar.a).a).D((byte[]) obj2, alvt.a));
        }
        if (true == optionalOfNullable.isPresent() && true != Objects.nonNull((alvt) optionalOfNullable.get())) {
            optionalOfNullable = Optional.empty();
        }
        if (true == optionalOfNullable.isPresent()) {
            int i = ((alvt) optionalOfNullable.get()).b;
            if ((i & 16) == 0 || (i & 8) == 0) {
                optionalOfNullable = Optional.empty();
            }
        }
        sla slaVar2 = new sla(obj, 3);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(new wji((alvt) optionalOfNullable.get(), 0L, (wjb) ((tld) slaVar2.a).b));
        }
        wjf wjfVar2 = (wjf) optionalOfNullable.orElse(null);
        wjf wjfVar3 = wjfVar2 != null ? wjfVar2 : wjfVar;
        abis abisVar = tamVar.o;
        xsc xscVar = (xsc) abisVar.b.io();
        if (xscVar == null) {
            zvp.a(zvn.b, zvm.k, "MediaCacheDownloadManagerProvider misconfigured");
            return;
        }
        long jV = wjfVar3.f().v();
        long j = abisVar.a.b;
        agev agevVar2 = abisVar.d;
        if (agevVar2.g()) {
            agevVar2.c();
        }
        abisVar.e = xscVar.B(wjfVar3, jV, j, abisVar);
    }

    @Override // defpackage.absr
    public final void b(int i) {
        int i2 = i - 1;
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            this.a.a.p = true;
        }
    }
}
