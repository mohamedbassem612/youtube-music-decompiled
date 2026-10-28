package defpackage;

import android.content.Context;
import java.security.Security;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class afqv implements qnt {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ afqv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    @Override // defpackage.qnt
    public final void a() {
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                mcj.d = (mcj) ((agfa) this.a).a;
                return;
            }
            if (i != 2) {
                ?? r5 = this.a;
                if (!r5.isEmpty()) {
                    afty.m(agkz.n(r5));
                }
                afty.a = true;
                return;
            }
            afvm.a = 1;
            aftk.a = 3;
            afva.a = 1;
            ?? r6 = this.a;
            if (r6.isEmpty()) {
                return;
            }
            afty.m(agkz.n(r6));
            return;
        }
        qoz qozVar = new qoz(new qpb());
        aero aeroVar = new aero((Context) this.a, (byte[]) null);
        synchronized (qoz.a) {
            if (aero.c != null) {
                return;
            }
            aero.c = aeroVar;
            if (qoz.b == null) {
                qoz.b = new qpd(null);
            }
            if (Security.insertProviderAt(qoz.b, 1) != 1) {
                throw new RuntimeException("Failed to install SslGuard with top priority.");
            }
            qpc qpcVar = qozVar.c;
            qpc qpcVar2 = qpf.a;
            if (qpcVar == null) {
                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
            }
            qpf.a = qpcVar;
            qpc qpcVar3 = qozVar.c;
            qpc qpcVar4 = qpe.a;
            if (qpcVar3 == null) {
                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
            }
            qpe.a = qpcVar3;
            qoz.b();
            qoz.a();
        }
    }
}
