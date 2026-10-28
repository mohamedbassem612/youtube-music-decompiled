package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rla implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rla(int i) {
        this.$cid = i;
        this.a = "S3TextToSpeechController";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [uok] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [uoj] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v61, types: [java.lang.Object, ulj] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        ?? linkedHashMap;
        ListenableFuture listenableFutureE;
        switch (this.$cid) {
            case 0:
                Object obj2 = this.a;
                akxt akxtVar = (akxt) obj;
                synchronized (((rlc) obj2).a) {
                    if (!((rlc) obj2).b.get()) {
                        ((rlc) obj2).c.set(akxtVar);
                    }
                    break;
                }
                return awmy.a;
            case 1:
                Map map = (Map) obj;
                linkedHashMap = new LinkedHashMap(atqq.u(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    ?? r1 = this.a;
                    linkedHashMap.put((plx) atqq.x(r1, entry.getKey()), entry.getValue());
                }
                break;
            case 2:
                tea teaVar = (tea) this.a;
                teb tebVar = (teb) obj;
                Object objIo = teaVar.a.io();
                objIo.getClass();
                rnj rnjVar = (rnj) objIo;
                if (tebVar != null) {
                    int iOrdinal = tebVar.ordinal();
                    if (iOrdinal == 0) {
                        boolean z = teaVar.b;
                        teaVar.b = true;
                        if (!z && ((vxz) rnjVar.a).l(210, 45814558L, false) && teaVar.d.i() == 2) {
                            teaVar.c.j(tew.b, 10);
                        }
                    } else if (iOrdinal == 1) {
                        boolean z2 = teaVar.b;
                        teaVar.b = false;
                        if (z2 && ((vxz) rnjVar.a).l(211, 45814559L, false) && teaVar.d.i() == 3) {
                            teaVar.c.j(tew.g, 11);
                        }
                    } else if (iOrdinal == 2) {
                        teaVar.c.j(tew.f, 9);
                    }
                    return awmy.a;
                }
                throw new awmj();
            case 3:
                ((String) obj).getClass();
                return new aeiv((String) this.a);
            case 4:
                agrf agrfVar = tsl.a;
                ((mgr) obj).a((String) this.a);
                return awmy.a;
            case 5:
                agrf agrfVar2 = tsl.a;
                ((mgr) obj).a((String) this.a);
                return awmy.a;
            case 6:
                agrf agrfVar3 = tsl.a;
                ((mgr) obj).b((String) this.a, -1);
                return awmy.a;
            case 7:
                asdl asdlVar = (asdl) obj;
                aihf aihfVarCreateBuilder = ascu.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                String str = asdlVar.c;
                str.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                ascu ascuVar = (ascu) aihfVarCreateBuilder.instance;
                ascuVar.b |= 1;
                ascuVar.c = str;
                aihfVarCreateBuilder.copyOnWrite();
                ascu ascuVar2 = (ascu) aihfVarCreateBuilder.instance;
                ascuVar2.d = 7;
                ascuVar2.b |= 2;
                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                aihnVarBuild.getClass();
                ascu ascuVar3 = (ascu) aihnVarBuild;
                aaok aaokVar = (aaok) this.a;
                Object obj3 = aaokVar.a;
                vcl vclVarI = ((afzc) obj3).i();
                if (vclVarI != null) {
                    listenableFutureE = vclVarI.a(ascuVar3);
                } else {
                    ascv ascvVar = ascv.a;
                    listenableFutureE = ((BaseClient) obj3).e(160946708, ascuVar3, aihn.getParserForClass(ascv.class));
                }
                return ahno.ar(listenableFutureE, new rwj(new rla(asdlVar, 8), 15), aaokVar.d);
            case 8:
                String str2 = ((asdl) this.a).c;
                str2.getClass();
                String str3 = ((ascv) obj).c;
                str3.getClass();
                linkedHashMap = new uok(str2, str3);
                break;
            case 9:
                alps alpsVar = ((asdb) obj).c;
                if (alpsVar == null) {
                    alpsVar = alps.a;
                }
                Object obj4 = this.a;
                alpsVar.getClass();
                linkedHashMap = new uoj((String) obj4, alpsVar);
                break;
            case 10:
                ((urt) this.a).l();
                return awmy.a;
            case 11:
                Optional optionalN = usj.n((auhs) this.a, ((Long) obj).longValue());
                optionalN.getClass();
                return (augy) awrc.f(optionalN);
            case 12:
                aufa aufaVar = (aufa) obj;
                aufaVar.getClass();
                return new uty(aufaVar.e, 0).a((auhs) this.a);
            case 13:
                return ((uuu) this.a).a;
            case 14:
                obj.getClass();
                return this.a;
            case 15:
                obj.getClass();
                return this.a;
            case 16:
                obj.getClass();
                return this.a;
            case 17:
                augg auggVar = (augg) obj;
                auggVar.getClass();
                aihf builder = auggVar.toBuilder();
                builder.getClass();
                atqo.C(builder);
                builder.copyOnWrite();
                ((augg) builder.instance).d = augg.emptyIntList();
                atqo.C(builder);
                aihx aihxVar = new aihx(auggVar.d, augg.a);
                List listAL = atqq.aL((Object[]) this.a);
                Set setAv = atqq.av(aihxVar);
                atqq.aA(setAv, listAL);
                builder.copyOnWrite();
                augg auggVar2 = (augg) builder.instance;
                aihv aihvVar = auggVar2.d;
                if (!aihvVar.c()) {
                    auggVar2.d = aihn.mutableCopy(aihvVar);
                }
                Iterator it = setAv.iterator();
                while (it.hasNext()) {
                    auggVar2.d.h(((augf) it.next()).getNumber());
                }
                aihn aihnVarBuild2 = builder.build();
                aihnVarBuild2.getClass();
                return (augg) aihnVarBuild2;
            case 18:
                uvq uvqVar = (uvq) obj;
                uvqVar.getClass();
                ?? r6 = ((abix) this.a).d;
                return uvq.a(uvqVar, ahng.C(r6.k().f()), ahng.C(r6.k().g()), r6.k().B(), 0, 8);
            case 19:
                Object obj5 = this.a;
                ((roq) ((abix) obj5).b).h(new pge(obj5, (Boolean) obj, 13, null));
                return awmy.a;
            default:
                uvq uvqVar2 = (uvq) obj;
                uvqVar2.getClass();
                return uvq.a(uvqVar2, (Duration) this.a, null, false, 0, 14);
        }
        return linkedHashMap;
    }

    public /* synthetic */ rla(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
