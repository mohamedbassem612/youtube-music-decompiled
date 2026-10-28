package defpackage;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import j$.util.Collection;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gem implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gem(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v36, types: [acdp, android.content.SharedPreferences$OnSharedPreferenceChangeListener, java.lang.Object, tbj, xzf] */
    /* JADX WARN: Type inference failed for: r10v66, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v67, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v70, types: [aunn, java.lang.Object] */
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
    @Override // defpackage.avni
    public final void a(Object obj) {
        int i = 2;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                WatchWhileLayout watchWhileLayout = ((get) this.a).j;
                watchWhileLayout.bB = ((Boolean) obj).booleanValue();
                watchWhileLayout.G();
                return;
            case 1:
                get getVar = (get) this.a;
                WatchWhileLayout watchWhileLayout2 = getVar.j;
                avw avwVarF = ((bbn) obj).f(519);
                watchWhileLayout2.bt = avwVarF.c;
                watchWhileLayout2.bu = avwVarF.e;
                watchWhileLayout2.G();
                getVar.w(getVar.o);
                getVar.o();
                getVar.z();
                return;
            case 2:
                ((gkt) this.a).b((Throwable) obj);
                return;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    gnf gnfVar = (gnf) this.a;
                    if (gnfVar.s.g == hei.d) {
                        gnfVar.B(false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((grf) this.a).ae();
                return;
            case 5:
                ((hca) this.a).b = ((Boolean) obj).booleanValue();
                return;
            case 6:
                ((avmm) this.a).c((avmn) obj);
                return;
            case 7:
                ((hca) this.a).a = (agkz) obj;
                return;
            case 8:
                hcy hcyVar = (hcy) this.a;
                hcyVar.b(hcyVar.c());
                return;
            case 9:
                ibv ibvVar = ibv.LOOP_OFF;
                int iOrdinal = ((ibv) obj).ordinal();
                if (iOrdinal != 1) {
                    i = iOrdinal != 2 ? iOrdinal != 3 ? 0 : -1 : 1;
                }
                fg fgVar = ((aceo) ((hgc) this.a).c.io()).a;
                if (fgVar == null) {
                    ((agrc) ((agrc) hgc.a.c().i(agso.a, "LoopStateAdapter")).k("com/google/android/apps/youtube/music/mediabrowser/MediaSessionLoopStateAdapter", "updateMediaSession", 94, "MediaSessionLoopStateAdapter.java")).u("attempted to update repeat mode but media session was null: %d", i);
                    return;
                }
                agrx agrxVar = agso.a;
                Object obj2 = fgVar.c;
                fb fbVar = (fb) obj2;
                if (fbVar.h != i) {
                    fbVar.h = i;
                    synchronized (fbVar.c) {
                        RemoteCallbackList remoteCallbackList = ((fb) obj2).d;
                        for (int iBeginBroadcast = remoteCallbackList.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                            try {
                                ((en) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).b(i);
                            } catch (RemoteException unused) {
                            }
                        }
                        ((fb) obj2).d.finishBroadcast();
                        break;
                    }
                    return;
                }
                return;
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ?? r10 = this.a;
                if (!zBooleanValue) {
                    agrx agrxVar2 = agso.a;
                    hgd hgdVar = (hgd) r10;
                    ((ycp) hgdVar.d.io()).d(r10);
                    ((abjp) hgdVar.b.io()).b.n(r10);
                    hgdVar.h.b();
                    ((acdq) hgdVar.a.io()).y(r10);
                    if (hgdVar.i.l(8, 45687082L, false)) {
                        hgdVar.f.unregisterOnSharedPreferenceChangeListener(r10);
                        return;
                    }
                    return;
                }
                agrx agrxVar3 = agso.a;
                hgd hgdVar2 = (hgd) r10;
                ((acdq) hgdVar2.a.io()).w(r10);
                avmm avmmVar = hgdVar2.h;
                avmmVar.b();
                avmmVar.e(hgdVar2.e.L(hgdVar2.g).al(new hbr(r10, 19), new gfh(6)));
                ((abjp) hgdVar2.b.io()).b.hK(r10);
                ((ycp) hgdVar2.d.io()).a(r10);
                if (hgdVar2.i.l(8, 45687082L, false)) {
                    hgdVar2.f.registerOnSharedPreferenceChangeListener(r10);
                    hgdVar2.i();
                }
                hgdVar2.j();
                return;
            case 11:
                int iOrdinal2 = ((icz) obj).ordinal();
                int i3 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? 0 : -1 : 1;
                fg fgVar2 = ((aceo) ((hgh) this.a).c.io()).a;
                if (fgVar2 == null) {
                    ((agrc) ((agrc) hgh.a.c()).k("com/google/android/apps/youtube/music/mediabrowser/MediaSessionShuffleStateAdapter", "updateMediaSession", 99, "MediaSessionShuffleStateAdapter.java")).u("attempted to update shuffle state but media session was null: %d", i3);
                    return;
                }
                Object obj3 = fgVar2.c;
                fb fbVar2 = (fb) obj3;
                if (fbVar2.i != i3) {
                    fbVar2.i = i3;
                    synchronized (fbVar2.c) {
                        RemoteCallbackList remoteCallbackList2 = ((fb) obj3).d;
                        for (int iBeginBroadcast2 = remoteCallbackList2.beginBroadcast() - 1; iBeginBroadcast2 >= 0; iBeginBroadcast2--) {
                            try {
                                ((en) remoteCallbackList2.getBroadcastItem(iBeginBroadcast2)).c(i3);
                            } catch (RemoteException unused2) {
                            }
                        }
                        ((fb) obj3).d.finishBroadcast();
                        break;
                    }
                    return;
                }
                return;
            case 12:
                ((hgn) this.a).a = ((Boolean) obj).booleanValue();
                return;
            case 13:
                if (((idd) obj).g()) {
                    return;
                }
                ((hgy) this.a).m();
                return;
            case 14:
                aazn aaznVar = (aazn) obj;
                Object obj4 = this.a;
                hgy hgyVar = (hgy) ((hhb) obj4).a;
                hgyVar.r = aaznVar;
                if (txz.d(hgyVar.b) && aaznVar.c()) {
                    agrx agrxVar4 = agso.a;
                    afwl.i(new hgx(obj4, i2)).run();
                    return;
                }
                return;
            case 15:
                aayw aaywVar = (aayw) obj;
                int iOrdinal3 = aaywVar.b.ordinal();
                int i4 = 4;
                if ((iOrdinal3 == 3 || iOrdinal3 == 4) && hna.w(aaywVar.c)) {
                    hgy hgyVar2 = (hgy) ((hhb) this.a).a;
                    if (Collection.EL.stream(hgyVar2.k.d.keySet()).anyMatch(new gqk(i4)) && Objects.equals(hgyVar2.f(), hgg.f)) {
                        hgyVar2.i();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((hhc) this.a).handleSequencerStageEvent((aayw) obj);
                return;
            case 17:
                ((hhc) this.a).handleSequencerEndedEvent((aayu) obj);
                return;
            case 18:
                this.a.invoke(obj);
                return;
            case 19:
                this.a.invoke(obj);
                return;
            default:
                if (zni.a.a((String) obj)) {
                    Object obj5 = this.a;
                    agrx agrxVar5 = agso.a;
                    ((xru) ((hed) obj5).a.io()).P();
                    return;
                }
                return;
        }
    }
}
