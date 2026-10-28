package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abzq extends zsz {
    static final int a;
    public static final amum[] b;
    private static final agrf e = agrf.h("com/google/android/libraries/youtube/player/stats/attestation/AttestationDelayedEventDispatcher");
    public final awmd c;
    public final vxu d;
    private final zwb f;
    private final awmd g;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        a = 720;
        b = new amum[]{amum.USER_AUTH, amum.VISITOR_ID, amum.PLUS_PAGE_ID};
    }

    public abzq(zwb zwbVar, awmd awmdVar, awmd awmdVar2, vxu vxuVar) {
        super(7);
        this.f = zwbVar;
        this.g = awmdVar;
        this.c = awmdVar2;
        this.d = vxuVar;
    }

    @Override // defpackage.zsz
    public final zsa a() {
        akkl akklVar = akkl.a;
        aihf aihfVarCreateBuilder = akklVar.createBuilder();
        akki akkiVarD = abzn.d(this.d);
        if (akkiVarD == null || (akkiVarD.b & 8) == 0) {
            int i = a;
            aihfVarCreateBuilder.copyOnWrite();
            akkl akklVar2 = (akkl) aihfVarCreateBuilder.instance;
            akklVar2.b |= 1;
            akklVar2.c = i;
            aihfVarCreateBuilder.copyOnWrite();
            akkl akklVar3 = (akkl) aihfVarCreateBuilder.instance;
            akklVar3.b |= 2;
            akklVar3.d = 30;
        } else {
            akkl akklVar4 = akkiVarD.e;
            if (akklVar4 == null) {
                akklVar4 = akklVar;
            }
            int i2 = akklVar4.c;
            aihfVarCreateBuilder.copyOnWrite();
            akkl akklVar5 = (akkl) aihfVarCreateBuilder.instance;
            akklVar5.b |= 1;
            akklVar5.c = i2;
            akkl akklVar6 = akkiVarD.e;
            if (akklVar6 != null) {
                akklVar = akklVar6;
            }
            int i3 = akklVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            akkl akklVar7 = (akkl) aihfVarCreateBuilder.instance;
            akklVar7.b |= 2;
            akklVar7.d = i3;
        }
        return new abzp(aihfVarCreateBuilder);
    }

    @Override // defpackage.zsz
    public final String c() {
        return "attestation";
    }

    @Override // defpackage.zsz
    public final void d(String str, zsr zsrVar, List list) {
        zwa zwaVarF = this.f.f(str);
        if (zwaVarF == null) {
            zwaVarF = zvz.a;
            ((agrc) ((agrc) e.c()).k("com/google/android/libraries/youtube/player/stats/attestation/AttestationDelayedEventDispatcher", "getIdentity", 152, "AttestationDelayedEventDispatcher.java")).t("Cannot resolve Identity from identityId. Dispatching as Identities.PSEUDONYMOUS.");
        }
        zvh zvhVar = ((zso) zsrVar).a;
        wof wofVar = (wof) this.g.io();
        wod wodVarA = wofVar.a(zwaVarF, zvhVar.a, zvhVar.b);
        wodVarA.b = ajgq.ENGAGEMENT_TYPE_PLAYBACK;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aihf aihfVar = (aihf) it.next();
            aihf aihfVarCreateBuilder = ajgs.a.createBuilder();
            try {
                aihfVarCreateBuilder.m54mergeFrom(((jrc) aihfVar.instance).e, ExtensionRegistryLite.getGeneratedRegistry());
                wodVarA.a.add((ajgs) aihfVarCreateBuilder.build());
            } catch (aiik unused) {
                zvp.a(zvn.b, zvm.m, "AttestationDelayedEventDispatcher.dispatchEvents() could not deserialize AttestationObjectId");
            }
        }
        if (wodVarA.e()) {
            return;
        }
        taf.i(wofVar.b(wodVarA, MoreExecutors.directExecutor(), null), MoreExecutors.directExecutor(), new abwu(7), new xwl(this, zwaVarF, 12), null);
    }
}
