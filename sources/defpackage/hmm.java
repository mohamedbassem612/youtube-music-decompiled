package defpackage;

import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hmm {
    public final cf a;
    public final hpy b;
    public final hpb c;
    public final hlp d;
    public final tts e;
    public final aaug f;
    public final vxe g;
    public final huf h;
    public final Integer i;
    public final hmn j;
    public final Executor k;
    public final Executor l;
    public final tbt m;
    public final tfq n;
    public final abxv o;
    public final hfn p;
    public final kwq q;
    public final xsc r;

    public hmm(cf cfVar, hpy hpyVar, tfq tfqVar, hlp hlpVar, kwq kwqVar, xsc xscVar, vxe vxeVar, aaug aaugVar, tts ttsVar, hpb hpbVar, abxv abxvVar, tbt tbtVar, Executor executor, Executor executor2, Integer num, huf hufVar, hfn hfnVar, hmn hmnVar) {
        this.m = tbtVar;
        this.a = cfVar;
        this.b = hpyVar;
        this.c = hpbVar;
        this.d = hlpVar;
        this.h = hufVar;
        this.n = tfqVar;
        this.e = ttsVar;
        this.o = abxvVar;
        this.p = hfnVar;
        this.f = aaugVar;
        this.q = kwqVar;
        this.r = xscVar;
        this.g = vxeVar;
        this.i = num;
        this.j = hmnVar;
        this.k = executor;
        this.l = executor2;
        tbtVar.f(this);
    }

    public final void a(aaub aaubVar, Runnable runnable) {
        if (aaubVar.a) {
            this.q.o(new hml(runnable, 1), aaubVar);
        } else {
            runnable.run();
        }
    }

    public final void b() {
        hmn hmnVar = this.j;
        cf cfVar = hmnVar.a;
        jio jioVarE = jin.e();
        ((jik) jioVarE).k(cfVar.getText(R.string.offline_download_removed));
        hmnVar.e.d(jioVarE.b());
    }

    public final void c(final String str, final aoia aoiaVar, final adbm adbmVar, final xgn xgnVar, final aodn aodnVar) {
        if (this.n.i()) {
            typ.f(str);
            taf.n(this.c.j(this.b, str), this.l, new tae() { // from class: hmj
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.tae, defpackage.twi
                public final void a(Object obj) {
                    int i;
                    Object obj2;
                    if (((Optional) obj).isPresent()) {
                        agrx agrxVar = agso.a;
                        return;
                    }
                    aoia aoiaVar2 = aoiaVar;
                    if (aoiaVar2 == null) {
                        agrx agrxVar2 = agso.a;
                        return;
                    }
                    xgn xgnVar2 = xgnVar;
                    hmm hmmVar = this.a;
                    int iR = 2;
                    if (!aoiaVar2.c) {
                        aohy aohyVar = aoiaVar2.d;
                        if (aohyVar == null) {
                            aohyVar = aohy.a;
                        }
                        if ((aohyVar.b & 2) != 0) {
                            aohy aohyVar2 = aoiaVar2.d;
                            if (aohyVar2 == null) {
                                aohyVar2 = aohy.a;
                            }
                            obj2 = aohyVar2.d;
                            if (obj2 == null) {
                                obj2 = arat.a;
                            }
                        } else {
                            aohy aohyVar3 = aoiaVar2.d;
                            if (((aohyVar3 == null ? aohy.a : aohyVar3).b & 1) != 0) {
                                if (aohyVar3 == null) {
                                    aohyVar3 = aohy.a;
                                }
                                obj2 = aohyVar3.c;
                                if (obj2 == null) {
                                    obj2 = akmh.a;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 != null) {
                            hmmVar.f.b(obj2, xgnVar2, null);
                            return;
                        }
                        return;
                    }
                    byte[] bArrG = (aoiaVar2.b & SemanticState.Hidden) != 0 ? aoiaVar2.g.G() : vzh.b;
                    aodn aodnVar2 = aodnVar;
                    aohx aohxVarE = hmmVar.d.e();
                    aamn aamnVar = aamn.OFFLINE_IMMEDIATELY;
                    if (aodnVar2 == null || (aodnVar2.b & 2) == 0) {
                        i = 0;
                    } else {
                        int iBc = a.bc(aodnVar2.c);
                        i = iBc == 0 ? 1 : iBc;
                    }
                    String str2 = str;
                    aaja.c(aoiaVar2, xgnVar2, null, str2, aohxVarE, aamnVar, i);
                    huf hufVar = hmmVar.h;
                    Integer num = hmmVar.i;
                    aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE;
                    int iIntValue = num.intValue();
                    if (!hufVar.i.G() || iIntValue == 0) {
                        iR = hufVar.k.b().i().r(str2, aohxVarE, aamnVar, bArrG, aogfVar);
                    } else {
                        try {
                            aihf aihfVarCreateBuilder = aofh.a.createBuilder();
                            aihfVarCreateBuilder.copyOnWrite();
                            aofh aofhVar = (aofh) aihfVarCreateBuilder.instance;
                            aofhVar.c = 1;
                            aofhVar.b |= 1;
                            String strG = wfs.g(iIntValue, str2);
                            aihfVarCreateBuilder.copyOnWrite();
                            aofh aofhVar2 = (aofh) aihfVarCreateBuilder.instance;
                            strG.getClass();
                            aofhVar2.b |= 2;
                            aofhVar2.d = strG;
                            aihf aihfVarCreateBuilder2 = anue.a.createBuilder();
                            aigj aigjVarV = aigj.v(bArrG);
                            aihfVarCreateBuilder2.copyOnWrite();
                            anue anueVar = (anue) aihfVarCreateBuilder2.instance;
                            aigjVarV.getClass();
                            anueVar.c |= 1;
                            anueVar.f = aigjVarV;
                            aihfVarCreateBuilder2.copyOnWrite();
                            anue anueVar2 = (anue) aihfVarCreateBuilder2.instance;
                            anueVar2.g = aohxVarE.l;
                            anueVar2.c |= 2;
                            aihfVarCreateBuilder2.copyOnWrite();
                            anue anueVar3 = (anue) aihfVarCreateBuilder2.instance;
                            anueVar3.c |= 4;
                            anueVar3.h = Alert.DURATION_SHOW_INDEFINITELY;
                            aihfVarCreateBuilder2.copyOnWrite();
                            anue anueVar4 = (anue) aihfVarCreateBuilder2.instance;
                            anueVar4.c |= 8;
                            anueVar4.i = aamnVar.h;
                            aihfVarCreateBuilder2.copyOnWrite();
                            anue anueVar5 = (anue) aihfVarCreateBuilder2.instance;
                            anueVar5.j = aogfVar.e;
                            anueVar5.c |= 16;
                            anue anueVar6 = (anue) aihfVarCreateBuilder2.build();
                            aihh aihhVar = (aihh) aofg.b.createBuilder();
                            int iK = hmy.k(2, hufVar.d.intValue(), aogfVar);
                            aihhVar.copyOnWrite();
                            aofg aofgVar = (aofg) aihhVar.instance;
                            aofgVar.c |= 1;
                            aofgVar.d = iK;
                            aihhVar.e(anue.b, anueVar6);
                            aihf aihfVarCreateBuilder3 = aofa.a.createBuilder();
                            aofb aofbVar = aofb.OFFLINE_NOW;
                            aihfVarCreateBuilder3.copyOnWrite();
                            aofa aofaVar = (aofa) aihfVarCreateBuilder3.instance;
                            aofaVar.d = aofbVar.i;
                            aofaVar.b |= 4;
                            aihf aihfVarCreateBuilder4 = aoez.a.createBuilder();
                            aihfVarCreateBuilder4.copyOnWrite();
                            aoez aoezVar = (aoez) aihfVarCreateBuilder4.instance;
                            aoezVar.c = 1;
                            aoezVar.b |= 1;
                            aihfVarCreateBuilder3.copyOnWrite();
                            aofa aofaVar2 = (aofa) aihfVarCreateBuilder3.instance;
                            aoez aoezVar2 = (aoez) aihfVarCreateBuilder4.build();
                            aoezVar2.getClass();
                            aofaVar2.e = aoezVar2;
                            aofaVar2.b |= 8;
                            aofa aofaVar3 = (aofa) aihfVarCreateBuilder3.build();
                            aihhVar.copyOnWrite();
                            aofg aofgVar2 = (aofg) aihhVar.instance;
                            aofaVar3.getClass();
                            aofgVar2.g = aofaVar3;
                            aofgVar2.c |= 2;
                            aofg aofgVar3 = (aofg) aihhVar.build();
                            aihfVarCreateBuilder.copyOnWrite();
                            aofh aofhVar3 = (aofh) aihfVarCreateBuilder.instance;
                            aofgVar3.getClass();
                            aofhVar3.e = aofgVar3;
                            aofhVar3.b |= 4;
                            aofh aofhVar4 = (aofh) aihfVarCreateBuilder.build();
                            aajg.b(aofhVar4, agpi.a, hufVar.h.a(aofhVar4), hufVar.j, hufVar.k.b(), 28);
                            iR = 0;
                        } catch (aaob e) {
                            ((agrc) ((agrc) ((agrc) aatx.g.b()).j(e)).k("com/google/android/libraries/youtube/offline/ui/DefaultPlaylistDownloadController", "savePlaylistWithOrchestration", 's', "DefaultPlaylistDownloadController.java")).w("[Offline] Couldn't save playlist through orchestration: %s", str2);
                        }
                    }
                    adbm adbmVar2 = adbmVar;
                    agrx agrxVar3 = agso.a;
                    if (adbmVar2 == null || iR != 0) {
                        return;
                    }
                    ((gvy) adbmVar2.a).b.d(((aofx) adbmVar2.c).g, adbmVar2.b);
                }
            });
        } else {
            this.e.a();
            this.p.e(3, 3);
            agrx agrxVar = agso.a;
        }
    }

    @tcc
    void handleOfflinePlaylistAddEvent(aahj aahjVar) {
        taf.n(this.c.p(this.b, aahjVar.a), this.l, new gov(this, aahjVar, 13));
    }

    @tcc
    void handleOfflinePlaylistAddFailedEvent(aahk aahkVar) {
        int i = aahkVar.a;
        if (i == 0) {
            this.j.b(R.string.offline_failed_disk_full);
            return;
        }
        hmn hmnVar = this.j;
        if (i != 1) {
            hmnVar.b(R.string.offline_failed);
        } else {
            hmnVar.b(R.string.offline_failed_network_error);
        }
    }

    @tcc
    void handleOfflinePlaylistAlreadyAddedEvent(aahl aahlVar) {
        this.j.c(aahlVar.a);
    }
}
