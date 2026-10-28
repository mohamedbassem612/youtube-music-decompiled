package defpackage;

import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import com.google.firebase.iid.Registrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahpn implements ahom {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ahpn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahom
    public final Object a(ahol aholVar) {
        switch (this.$cid) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.a();
            case 1:
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(aholVar);
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.a();
            case 3:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.a();
            case 4:
                return ahpp.INSTANCE;
            case 5:
                return TransportRegistrar.lambda$getComponents$0(aholVar);
            case 6:
                return TransportRegistrar.lambda$getComponents$1(aholVar);
            case 7:
                return TransportRegistrar.lambda$getComponents$2(aholVar);
            case 8:
                return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(aholVar);
            case 9:
                return Registrar.lambda$getComponents$0(aholVar);
            case 10:
                return Registrar.lambda$getComponents$1(aholVar);
            case 11:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(aholVar);
            default:
                Set setF = aholVar.f(new ahpd(ahpc.class, ahue.class));
                ahud ahudVar = ahud.a;
                if (ahudVar == null) {
                    synchronized (ahud.class) {
                        ahudVar = ahud.a;
                        if (ahudVar == null) {
                            ahudVar = new ahud();
                            ahud.a = ahudVar;
                        }
                        break;
                    }
                }
                return new ahuc(setF, ahudVar);
        }
    }
}
