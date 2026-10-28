package defpackage;

import android.content.Intent;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ytj implements agfr {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ytj(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agfr
    public final Object io() {
        switch (this.$cid) {
            case 0:
                return new yll();
            case 1:
                return new yjp();
            case 2:
                return new ykz();
            case 3:
                return new ykk();
            case 4:
                return new ykm();
            case 5:
                return new ykl();
            case 6:
                return new ykj();
            case 7:
                return new yki();
            case 8:
                return new ylm();
            case 9:
                return new yln();
            case 10:
                return Boolean.FALSE;
            case 11:
                return Boolean.FALSE;
            case 12:
                zfc zfcVar = zfc.a;
                return 0L;
            case 13:
                return Optional.empty();
            case 14:
                agfr agfrVar = adhi.a;
                aihf aihfVarCreateBuilder = akvd.a.createBuilder();
                aikh aikhVar = aikh.a;
                aikg aikgVar = new aikg();
                aikgVar.d(1, 2, 3, 4);
                affc affcVarA = aikgVar.a();
                aihfVarCreateBuilder.copyOnWrite();
                akvd akvdVar = (akvd) aihfVarCreateBuilder.instance;
                affcVarA.getClass();
                akvdVar.d = affcVarA;
                akvdVar.b |= 2;
                return (akvd) aihfVarCreateBuilder.build();
            case 15:
                return new Intent();
            case 16:
                return Boolean.FALSE;
            case 17:
                return Boolean.FALSE;
            case 18:
                long j = ahuz.a;
                return Boolean.FALSE;
            case 19:
                Logger logger = avaw.a;
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("avij"));
                    break;
                } catch (ClassNotFoundException e) {
                    avaw.a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
                }
                try {
                    arrayList.add(Class.forName("io.grpc.util.SecretRoundRobinLoadBalancerProvider$Provider"));
                    break;
                } catch (ClassNotFoundException e2) {
                    avaw.a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
                }
                return DesugarCollections.unmodifiableList(arrayList);
            default:
                Logger logger2 = avbw.a;
                ArrayList arrayList2 = new ArrayList();
                try {
                    arrayList2.add(Class.forName("avez"));
                    break;
                } catch (ClassNotFoundException e3) {
                    avbw.a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e3);
                }
                try {
                    arrayList2.add(Class.forName("avcq"));
                    break;
                } catch (ClassNotFoundException e4) {
                    avbw.a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", (Throwable) e4);
                }
                return DesugarCollections.unmodifiableList(arrayList2);
        }
    }
}
