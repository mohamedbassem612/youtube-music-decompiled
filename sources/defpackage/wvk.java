package defpackage;

import android.content.SharedPreferences;
import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wvk implements agek {
    private final /* synthetic */ int $cid;

    public /* synthetic */ wvk(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        Object dovVar;
        switch (this.$cid) {
            case 0:
                return DesugarCollections.unmodifiableMap(((atov) obj).e);
            case 1:
                dovVar = new dov(((wqe) ((dov) obj).a).a);
                break;
            case 2:
                return Boolean.valueOf(((atou) obj).c);
            case 3:
                aoqd aoqdVar = ((atov) obj).c;
                return aoqdVar == null ? aoqd.a : aoqdVar;
            case 4:
                int i = xnp.h;
                Map map = (Map) Collection.EL.stream(DesugarCollections.unmodifiableMap(((atpa) obj).b).entrySet()).sorted(new cru(10)).limit(100L).map(new rmm(18)).collect(aghu.a(new rmm(19), new rmm(20)));
                aihf aihfVarCreateBuilder = atpa.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ((atpa) aihfVarCreateBuilder.instance).a().putAll(map);
                return (atpa) aihfVarCreateBuilder.build();
            case 5:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                aihf aihfVarCreateBuilder2 = atpe.a.createBuilder();
                int i2 = sharedPreferences.getInt("mdx.recovery.session_type", -1);
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar = (atpe) aihfVarCreateBuilder2.instance;
                atpeVar.b |= 1;
                atpeVar.c = i2;
                int i3 = sharedPreferences.getInt("mdx.recovery.session_source", -1);
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar2 = (atpe) aihfVarCreateBuilder2.instance;
                atpeVar2.b |= SemanticState.Multiline;
                atpeVar2.n = i3;
                int i4 = sharedPreferences.getInt("mdx.recovery.disconnect_reason", -1);
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar3 = (atpe) aihfVarCreateBuilder2.instance;
                atpeVar3.b |= 2;
                atpeVar3.d = i4;
                long j = sharedPreferences.getLong("mdx.recovery.last_connected_time", -1L);
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar4 = (atpe) aihfVarCreateBuilder2.instance;
                atpeVar4.b |= 4;
                atpeVar4.e = j;
                long j2 = sharedPreferences.getLong("mdx.recovery.expiration_time", -1L);
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar5 = (atpe) aihfVarCreateBuilder2.instance;
                atpeVar5.b |= 8;
                atpeVar5.f = j2;
                String string = sharedPreferences.getString("mdx.recovery.route_id", "");
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar6 = (atpe) aihfVarCreateBuilder2.instance;
                string.getClass();
                atpeVar6.b |= 32;
                atpeVar6.g = string;
                String string2 = sharedPreferences.getString("mdx.recovery.ssdp_id", "");
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar7 = (atpe) aihfVarCreateBuilder2.instance;
                string2.getClass();
                atpeVar7.b |= SemanticState.Obscured;
                atpeVar7.m = string2;
                String string3 = sharedPreferences.getString("mdx.recovery.screen_name", "");
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar8 = (atpe) aihfVarCreateBuilder2.instance;
                string3.getClass();
                atpeVar8.b |= SemanticState.Focused;
                atpeVar8.h = string3;
                String string4 = sharedPreferences.getString("mdx.recovery.session_nonce", "");
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar9 = (atpe) aihfVarCreateBuilder2.instance;
                string4.getClass();
                atpeVar9.b |= SemanticState.Hidden;
                atpeVar9.i = string4;
                int i5 = sharedPreferences.getInt("mdx.recovery.session_index", 0);
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar10 = (atpe) aihfVarCreateBuilder2.instance;
                atpeVar10.b |= SemanticState.LiveRegion;
                atpeVar10.j = i5;
                long j3 = sharedPreferences.getLong("mdx.recovery.first_connected_time_ms", -1L);
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar11 = (atpe) aihfVarCreateBuilder2.instance;
                atpeVar11.b |= SemanticState.Modal;
                atpeVar11.l = j3;
                long j4 = sharedPreferences.getLong("mdx.recovery.started_time_ms", -1L);
                aihfVarCreateBuilder2.copyOnWrite();
                atpe atpeVar12 = (atpe) aihfVarCreateBuilder2.instance;
                atpeVar12.b |= SemanticState.ReadOnly;
                atpeVar12.k = j4;
                return (atpe) aihfVarCreateBuilder2.build();
            case 6:
                ainm ainmVar = (ainm) obj;
                ArrayList arrayList = new ArrayList(ainmVar.b.size());
                for (ainl ainlVar : ainmVar.b) {
                    agjz agjzVar = new agjz(4);
                    for (ainn ainnVar : ainlVar.g) {
                        xvo xvoVarA = xvo.a(ainnVar.c, ainnVar.d);
                        if (xvoVarA != null) {
                            agjzVar.h(xvoVarA);
                        } else {
                            ((agrc) ((agrc) xwm.a.b().i(agso.a, "MDX.remote")).k("com/google/android/libraries/youtube/mdx/pairing/MdxCloudScreenStorage", "list", 68, "MdxCloudScreenStorage.java")).w("Invalid MdxDiscoveryIdType: %s", ainnVar.c);
                        }
                    }
                    agke agkeVarG = agjzVar.g();
                    int i6 = xve.i;
                    xvb xvbVar = new xvb();
                    xvbVar.e(new xvv(1, false));
                    xvbVar.f(new xvz(ainlVar.c));
                    xvbVar.b(new xvg(ainlVar.e));
                    xvbVar.g(ainlVar.d);
                    xvbVar.c(null);
                    xvbVar.d(agkeVarG);
                    arrayList.add(new xvk(xvbVar.a(), ainlVar.f));
                }
                return arrayList;
            case 7:
                atpe atpeVar13 = (atpe) obj;
                if (atpeVar13 == null) {
                    return Optional.empty();
                }
                int i7 = atpeVar13.c;
                if (i7 == -1) {
                    return Optional.empty();
                }
                String str = atpeVar13.g;
                if ("".equals(str)) {
                    return Optional.empty();
                }
                int iBt = a.bt(i7);
                xzd xzdVarCS = yno.cS(null);
                xzdVarCS.k(iBt);
                xzdVarCS.i(atpeVar13.h);
                xzdVarCS.f(str);
                xzdVarCS.h(atpeVar13.i);
                xzdVarCS.g(atpeVar13.j);
                xzdVarCS.j(atpeVar13.k);
                long j5 = atpeVar13.l;
                long j6 = atpeVar13.e;
                long j7 = atpeVar13.f;
                if (j5 != -1 && j6 != -1 && j7 != -1) {
                    boolean z = j7 == -2;
                    adyp adypVar = new adyp();
                    adypVar.g(j5);
                    adypVar.h(j6);
                    if (j7 == -2) {
                        j7 = 0;
                    }
                    adypVar.i(j7);
                    adypVar.f(z);
                    xzdVarCS.b(adypVar.e());
                }
                int i8 = atpeVar13.d;
                if (i8 != -1) {
                    xzdVarCS.d(amyu.a(i8));
                }
                int i9 = atpeVar13.n;
                if (i9 != -1) {
                    xzdVarCS.e(amyv.a(i9));
                }
                if (iBt == 3) {
                    String str2 = atpeVar13.m;
                    if ("".equals(str2)) {
                        agrx agrxVar = agso.a;
                        return Optional.empty();
                    }
                    xyg xygVar = new xyg();
                    xygVar.b(new xwc(str2));
                    xzdVarCS.c(xygVar.a());
                }
                return Optional.of(xzdVarCS.a());
            case 8:
                return Boolean.valueOf(((atpl) obj).f >= 3);
            case 9:
                dovVar = new zfp((byte[]) obj);
                break;
            case 10:
                return Boolean.valueOf(((atpn) obj).j > 0);
            case 11:
                return Boolean.valueOf(((atpq) obj).o > 0);
            case 12:
                agrf agrfVar = aady.a;
                return agpi.a;
            case 13:
                agrf agrfVar2 = aady.a;
                return agpi.a;
            case 14:
                return ((acip) obj).K();
            case 15:
                return ((abvn) obj).H();
            case 16:
                return ((acip) obj).am();
            case 17:
                return ((acip) obj).G();
            case 18:
                return ((acip) obj).aq();
            case 19:
                return ((acip) obj).ab();
            default:
                return ((acip) obj).D();
        }
        return dovVar;
    }
}
