package defpackage;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abzr implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ abzr(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                return Optional.ofNullable((ajgu) obj);
            case 1:
                acip acipVar = (acip) obj;
                acipVar.getClass();
                return acipVar.aq();
            case 2:
                return ((abvn) obj).C();
            case 3:
                return ((acip) obj).D();
            case 4:
                return ((acip) obj).E();
            case 5:
                return ((acip) obj).I();
            case 6:
                return ((acip) obj).P();
            case 7:
                return ((acip) obj).V();
            case 8:
                return ((acip) obj).aq();
            case 9:
                return ((acip) obj).G();
            case 10:
                return ((acip) obj).ad();
            case 11:
                return Boolean.valueOf(((amef) obj) == amef.REEL_PERSISTENT_EDU_STATE_ENABLED);
            case 12:
                return Long.valueOf(((acra) obj).b);
            case 13:
                agrf agrfVar = acuu.a;
                return null;
            case 14:
                return acuz.a;
            case 15:
                return Boolean.valueOf(((Activity) obj).isFinishing());
            case 16:
                aigj aigjVar = (aigj) obj;
                if (aigjVar == null) {
                    return InnertubeContext$InnerTubeContext.getDefaultInstance();
                }
                aihf aihfVarCreateBuilder = InnertubeContext$InnerTubeContext.a.createBuilder();
                aihf aihfVarCreateBuilder2 = InnertubeContext$ClientInfo.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) aihfVarCreateBuilder2.instance;
                innertubeContext$ClientInfo.d |= 32768;
                innertubeContext$ClientInfo.R = aigjVar;
                aihfVarCreateBuilder.copyOnWrite();
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder.instance;
                InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder2.build();
                innertubeContext$ClientInfo2.getClass();
                innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo2;
                innertubeContext$InnerTubeContext.b |= 1;
                return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder.build();
            case 17:
                aigj aigjVar2 = (aigj) obj;
                if (aigjVar2 == null) {
                    return InnertubeContext$InnerTubeContext.getDefaultInstance();
                }
                aihf aihfVarCreateBuilder3 = InnertubeContext$InnerTubeContext.a.createBuilder();
                aihf aihfVarCreateBuilder4 = InnertubeContext$ClientInfo.a.createBuilder();
                aihfVarCreateBuilder4.copyOnWrite();
                InnertubeContext$ClientInfo innertubeContext$ClientInfo3 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder4.instance;
                innertubeContext$ClientInfo3.d |= 32768;
                innertubeContext$ClientInfo3.R = aigjVar2;
                aihfVarCreateBuilder3.copyOnWrite();
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder3.instance;
                InnertubeContext$ClientInfo innertubeContext$ClientInfo4 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder4.build();
                innertubeContext$ClientInfo4.getClass();
                innertubeContext$InnerTubeContext2.c = innertubeContext$ClientInfo4;
                innertubeContext$InnerTubeContext2.b |= 1;
                return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder3.build();
            case 18:
                return aigj.v(((ResourceLoader) obj).getServingContext());
            case 19:
                aihf builder = ((asmo) obj).toBuilder();
                builder.copyOnWrite();
                asmo asmoVar = (asmo) builder.instance;
                asmoVar.b &= -2;
                asmoVar.c = asmo.a.c;
                return (asmo) builder.build();
            default:
                afhq afhqVar = ((afhn) obj).b;
                agrf agrfVar2 = aegn.a;
                return new Account(afhqVar.e, "com.google");
        }
    }
}
