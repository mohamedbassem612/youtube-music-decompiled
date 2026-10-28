package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hhy implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    private final Object b;

    public hhy(yrj yrjVar, int i) {
        this.$cid = i;
        this.a = yrjVar;
        new ArrayDeque();
        this.b = new LinkedBlockingQueue();
        new ArrayList();
        new AtomicBoolean(false);
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x0124  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.BlockingQueue] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, java.util.Map] */
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
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        boolean z = true;
        switch (this.$cid) {
            case 0:
                try {
                    Object obj = this.a;
                    ListenableFuture listenableFuture = ((hia) obj).y;
                    if (listenableFuture == null || listenableFuture.isCancelled() || !listenableFuture.isDone() || !((Boolean) ahng.v(listenableFuture)).booleanValue()) {
                        return;
                    }
                    isw iswVar = (isw) ((hia) obj).i.io();
                    Object obj2 = this.b;
                    iswVar.h(((zne) obj2).a());
                    ((hia) obj).w.remove(obj2);
                    return;
                } catch (ExecutionException e) {
                    zvp.a(zvn.a, zvm.n, ahno.Z(e.getMessage()));
                    return;
                }
            case 1:
                Object obj3 = this.b;
                synchronized (((fed) obj3).a()) {
                    Object obj4 = this.a;
                    synchronized (obj4) {
                        try {
                            if (((evx) obj4).a.d((fed) obj3)) {
                                try {
                                    ((fed) obj3).g(((evx) obj4).f);
                                } catch (Throwable th) {
                                    throw new evf(th);
                                }
                            }
                            ((evx) obj4).b();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return;
            case 2:
                hia hiaVar = (hia) this.a;
                ListenableFuture listenableFuture2 = hiaVar.y;
                if (listenableFuture2 != null && listenableFuture2.isDone()) {
                    ((hjn) this.b).c(hiaVar.c(), null);
                }
                if (hiaVar.I.l(6, 45680102L, false)) {
                    ((hjn) this.b).c(hiaVar.c(), null);
                    return;
                }
                return;
            case 3:
                idr idrVar = (idr) this.a;
                if (nsj.g(idrVar.j)) {
                    ((agrc) ((agrc) idr.a.c().i(agso.a, "PersistentQueueCtlrImpl")).k("com/google/android/apps/youtube/music/player/queue/persistence/PersistentMusicPlaybackQueueControllerImpl$SaveContinuationsRunnable", "run", 689, "PersistentMusicPlaybackQueueControllerImpl.java")).t("Stop saving continuations, low on memory");
                    return;
                } else {
                    agrx agrxVar = agso.a;
                    idrVar.l.d(this.b);
                    return;
                }
            case 4:
                agrf agrfVar = idr.a;
                agrx agrxVar2 = agso.a;
                aima aimaVar = (aima) this.b;
                boolean zD = ibg.d(aimaVar);
                ibg ibgVar = ((idr) this.a).m;
                if (zD) {
                    ibgVar.e(aima.a);
                    return;
                } else {
                    ibgVar.e(aimaVar);
                    return;
                }
            case 5:
                aihf aihfVarCreateBuilder = ailx.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                ailx ailxVar = (ailx) aihfVarCreateBuilder.instance;
                aiie aiieVar = ailxVar.b;
                if (!aiieVar.c()) {
                    ailxVar.b = aihn.mutableCopy(aiieVar);
                }
                ieh iehVar = (ieh) this.b;
                aifs.addAll(iehVar.a, ailxVar.b);
                aihfVarCreateBuilder.copyOnWrite();
                ailx ailxVar2 = (ailx) aihfVarCreateBuilder.instance;
                aiie aiieVar2 = ailxVar2.c;
                if (!aiieVar2.c()) {
                    ailxVar2.c = aihn.mutableCopy(aiieVar2);
                }
                agke agkeVar = iehVar.b;
                Object obj5 = this.a;
                aifs.addAll(agkeVar, ailxVar2.c);
                ailx ailxVar3 = (ailx) aihfVarCreateBuilder.build();
                hwz hwzVar = ((idr) obj5).H;
                ((qrx) hwzVar.b).a(new gqa(hwzVar, ailxVar3, 19), MoreExecutors.directExecutor());
                return;
            case 6:
                idr idrVar2 = (idr) this.a;
                if (nsj.g(idrVar2.j)) {
                    ((agrc) ((agrc) idr.a.c().i(agso.a, "PersistentQueueCtlrImpl")).k("com/google/android/apps/youtube/music/player/queue/persistence/PersistentMusicPlaybackQueueControllerImpl$SaveQueueSnapshotRunnable", "run", 661, "PersistentMusicPlaybackQueueControllerImpl.java")).t("Stop saving queue snapshot, low on memory.");
                    return;
                }
                agrx agrxVar3 = agso.a;
                iej iejVar = (iej) this.b;
                iejVar.a();
                ids idsVar = idrVar2.l;
                idsVar.g(iejVar);
                if (idrVar2.E.l(47, 45690433L, false)) {
                    hwz hwzVar2 = idrVar2.I;
                    hwzVar2.f();
                    idsVar.e(hwzVar2.f());
                    return;
                }
                return;
            case 7:
                ((idy) this.a).c.p((aigj) this.b);
                return;
            case 8:
                try {
                    this.b.run();
                    return;
                } finally {
                    ((ojy) this.a).a();
                }
            case 9:
                yam yamVar = (yam) this.a;
                yamVar.ap = null;
                if (yamVar.y()) {
                    Object obj6 = this.b;
                    if (yamVar.L.d()) {
                        xvy xvyVar = new xvy();
                        if (obj6 != null) {
                            acca accaVar = (acca) obj6;
                            if (accaVar.g() || accaVar.q) {
                                xvyVar.a("videoId", yamVar.L.b);
                            } else {
                                xvyVar.a("format", String.valueOf(accaVar.e));
                                String str3 = accaVar.a;
                                xvyVar.a("languageCode", str3);
                                xvyVar.a("languageName", accaVar.b);
                                xvyVar.a("sourceLanguageCode", str3);
                                xvyVar.a("trackName", accaVar.c);
                                xvyVar.a("vss_id", accaVar.k);
                                xvyVar.a("videoId", yamVar.L.b);
                                xvyVar.a("captionId", accaVar.g);
                                acda acdaVar = yamVar.l;
                                float fA = acdaVar.a();
                                accp accpVarB = acdaVar.b();
                                HashMap map = new HashMap();
                                int i = accpVarB.a;
                                map.put("background", accp.a(i));
                                map.put("backgroundOpacity", accp.b(i));
                                int i2 = accpVarB.e;
                                map.put("color", accp.a(i2));
                                map.put("textOpacity", accp.b(i2));
                                map.put("fontSizeRelative", String.format(Locale.US, "%.2f", Float.valueOf(fA)));
                                int i3 = accpVarB.b;
                                map.put("windowColor", accp.a(i3));
                                map.put("windowOpacity", accp.b(i3));
                                int i4 = accpVarB.d;
                                if (i4 == 1) {
                                    str = "uniform";
                                } else if (i4 == 2) {
                                    str = "dropShadow";
                                } else if (i4 == 3) {
                                    str = "raised";
                                } else if (i4 == 4) {
                                    str = "depressed";
                                } else if (i4 != 5) {
                                    str = "none";
                                } else {
                                    str = "dropShadow";
                                }
                                map.put("charEdgeStyle", str);
                                switch (accpVarB.f) {
                                    case 0:
                                        str2 = "monoSerif";
                                        break;
                                    case 1:
                                        str2 = "propSerif";
                                        break;
                                    case 2:
                                        str2 = "monoSans";
                                        break;
                                    case 3:
                                        str2 = "propSans";
                                        break;
                                    case 4:
                                        str2 = "casual";
                                        break;
                                    case 5:
                                        str2 = "cursive";
                                        break;
                                    case 6:
                                        str2 = "smallCaps";
                                        break;
                                    default:
                                        str2 = "";
                                        break;
                                }
                                map.put("fontFamilyOption", str2);
                                xvyVar.a("style", new JSONObject(map).toString());
                            }
                        } else {
                            xvyVar.a("videoId", yamVar.L.b);
                        }
                        yamVar.q(xvu.SET_SUBTITLES_TRACK, xvyVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                try {
                    ysr ysrVar = (ysr) this.b.take();
                    if (ysrVar.equals(yrj.a)) {
                        throw null;
                    }
                    try {
                        Object obj7 = this.a;
                        ((yrj) obj7).b.P();
                        if (((yrj) obj7).c.a) {
                            boolean z2 = ysrVar.i;
                        }
                        boolean z3 = ysrVar.h;
                        throw null;
                    } catch (InterruptedException unused) {
                    }
                } catch (InterruptedException unused2) {
                    z = false;
                }
                Thread.currentThread().interrupt();
                if (z) {
                    ((yrj) this.a).b.O();
                    return;
                }
                return;
        }
    }

    public hhy(yam yamVar, acca accaVar, int i) {
        this.$cid = i;
        this.a = yamVar;
        this.b = accaVar;
    }

    public hhy(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
