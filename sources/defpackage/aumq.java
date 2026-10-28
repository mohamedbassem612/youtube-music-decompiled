package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import internal.org.jni_zero.CommonApis;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class aumq extends Handler {
    private final auna a;

    public aumq(auna aunaVar) {
        this.a = aunaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        auna aunaVar = this.a;
        Bundle data = message.getData();
        boolean zB = aunaVar.b();
        String.format("Get message from Waze, msg=%s, data=%s, listen to navigation data? %s", Integer.valueOf(message.what), data, Boolean.valueOf(zB));
        int i2 = message.what;
        if (i2 == 502) {
            if (data != null) {
                data.getInt("reason");
            }
            aunaVar.c();
            return;
        }
        if (i2 == 702) {
            if (!zB || (i = data.getInt("instruction")) < 0) {
                return;
            }
            CommonApis.n();
            if (i < 21) {
                int i3 = CommonApis.n()[i];
                aumy aumyVar = new aumy(auna.c);
                while (aumyVar.hasNext()) {
                    aumyVar.next().j(i3);
                }
                return;
            }
            return;
        }
        if (i2 == 709) {
            if (zB) {
                String string = data.getString("streetName");
                aumy aumyVar2 = new aumy(auna.c);
                while (aumyVar2.hasNext()) {
                    aumyVar2.next().f(string);
                }
                return;
            }
            return;
        }
        if (i2 == 710) {
            if (zB) {
                boolean z = data.getBoolean("isNavigating");
                aumy aumyVar3 = new aumy(auna.c);
                while (aumyVar3.hasNext()) {
                    aumyVar3.next().d(z);
                }
                return;
            }
            return;
        }
        switch (i2) {
            case 704:
                if (zB) {
                    int i4 = data.getInt("exitNumber");
                    aumy aumyVar4 = new aumy(auna.c);
                    while (aumyVar4.hasNext()) {
                        aumyVar4.next().e(i4);
                    }
                }
                break;
            case 705:
                if (zB) {
                    String string2 = data.getString("distanceString");
                    data.getInt("distanceMeters");
                    aumy aumyVar5 = new aumy(auna.c);
                    while (aumyVar5.hasNext()) {
                        aumyVar5.next().m(string2);
                    }
                }
                break;
            case 706:
                if (zB) {
                    boolean z2 = data.getBoolean("isLeftHandTraffic");
                    aumy aumyVar6 = new aumy(auna.c);
                    while (aumyVar6.hasNext()) {
                        aumyVar6.next().g(z2);
                    }
                }
                break;
        }
    }
}
