package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ufm implements rbi {
    public static final rbm a = rbm.c(ufm.class);
    private final agke b;
    private final aepx c;

    public ufm(aepx aepxVar, qua quaVar) {
        this.c = aepxVar;
        this.b = quaVar.A ? agke.q(new ufl()) : agpi.a;
    }

    @Override // defpackage.rbi
    public final void a(UUID uuid, anck anckVar) {
        this.c.a(uuid, anckVar);
        Iterable$EL.forEach(this.b, new rew(uuid, anckVar, 8));
    }

    @Override // defpackage.rbi
    public final void b(UUID uuid) {
        this.c.b(uuid);
        Iterable$EL.forEach(this.b, new tsd(uuid, 6));
    }
}
