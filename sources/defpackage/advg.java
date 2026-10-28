package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class advg implements adwp {
    private static final agex a = new advf();

    @Override // defpackage.adwp
    public final agex b() {
        return a;
    }

    @Override // defpackage.adwp
    public final /* bridge */ /* synthetic */ void e(Object obj, abgb abgbVar) {
        amgj amgjVar = (amgj) obj;
        if ((amgjVar.d & 2) == 0) {
            MessageLite messageLiteEu = yno.eu(amgjVar);
            if (messageLiteEu != null) {
                abgbVar.b(messageLiteEu);
                return;
            }
            return;
        }
        apun apunVar = amgjVar.aD;
        if (apunVar == null) {
            apunVar = apun.a;
        }
        apup apupVar = apunVar.l;
        if (apupVar == null) {
            apupVar = apup.a;
        }
        if ((apupVar.b & 4) != 0) {
            abgbVar.b(new wfz(apunVar));
            return;
        }
        apup apupVar2 = apunVar.l;
        if (apupVar2 == null) {
            apupVar2 = apup.a;
        }
        if ((apupVar2.b & 8) != 0) {
            abgbVar.b(new wgh(apunVar));
        }
    }

    @Override // defpackage.adwp
    public final /* synthetic */ void d() {
    }
}
