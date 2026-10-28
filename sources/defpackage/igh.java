package defpackage;

import android.content.Context;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igh {
    public static final /* synthetic */ int b = 0;
    private static final agrf c = agrf.h("com/google/android/apps/youtube/music/player/sideloaded/SideloadedWatchNextResponseFactory");
    private static final agkj d;
    public final Executor a;
    private final hfn e;

    static {
        zh zhVar = new zh();
        zhVar.a = 1;
        d = agkj.j("display_context", zhVar.d());
    }

    public igh(hfn hfnVar, Executor executor) {
        this.e = hfnVar;
        this.a = executor;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x037c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0388  */
    /* JADX WARN: Code duplicated, block: B:60:0x038e  */
    /* JADX WARN: Code duplicated, block: B:62:0x039a  */
    /* JADX WARN: Code duplicated, block: B:65:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:67:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:70:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x03be  */
    /* JADX WARN: Code duplicated, block: B:73:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x0409 A[PHI: r3
      0x0409: PHI (r3v1 int) = (r3v0 int), (r3v7 int) binds: [B:51:0x037a, B:79:0x0408] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0423 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[LOOP:0: B:75:0x03f3->B:87:?, LOOP_END, SYNTHETIC] */
    public final ListenableFuture a(Context context, hcg hcgVar, int i, apzg apzgVar) {
        ajwo ajwoVar;
        aouj aoujVarAb;
        anyx anyxVar;
        String str;
        agke agkeVar;
        int size;
        int i2;
        int i3;
        int i4;
        aoun aounVar;
        ajwo ajwoVar2;
        aihl aihlVarCheckIsLite;
        Object objK;
        Object objC;
        int i5 = i;
        apzg apzgVar2 = apzgVar;
        context.getClass();
        alzq alzqVar = alzq.a;
        aihh aihhVar = (aihh) amae.a.createBuilder();
        amaf amafVar = amaf.a;
        aihf aihfVarCreateBuilder = amafVar.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amaf amafVar2 = (amaf) aihfVarCreateBuilder.instance;
        alzqVar.getClass();
        amafVar2.c = alzqVar;
        amafVar2.b = 125354411;
        aihhVar.copyOnWrite();
        amae amaeVar = (amae) aihhVar.instance;
        amaf amafVar3 = (amaf) aihfVarCreateBuilder.build();
        amafVar3.getClass();
        amaeVar.e = amafVar3;
        amaeVar.b |= 2;
        if (apzgVar2 != null) {
            if (apzgVar2.d) {
                aihf aihfVarCreateBuilder2 = amah.a.createBuilder();
                aihf aihfVarCreateBuilder3 = aqjj.a.createBuilder();
                String string = context.getString(R.string.default_queue_title);
                aihfVarCreateBuilder3.copyOnWrite();
                aqjj aqjjVar = (aqjj) aihfVarCreateBuilder3.instance;
                string.getClass();
                aqjjVar.b |= 4;
                aqjjVar.e = string;
                aihf aihfVarCreateBuilder4 = aqjg.a.createBuilder();
                anvq anvqVar = anvq.a;
                aihfVarCreateBuilder4.copyOnWrite();
                aqjg aqjgVar = (aqjg) aihfVarCreateBuilder4.instance;
                anvqVar.getClass();
                aqjgVar.e = anvqVar;
                aqjgVar.b |= 4194304;
                aihfVarCreateBuilder3.copyOnWrite();
                aqjj aqjjVar2 = (aqjj) aihfVarCreateBuilder3.instance;
                aqjg aqjgVar2 = (aqjg) aihfVarCreateBuilder4.build();
                aqjgVar2.getClass();
                aqjjVar2.i = aqjgVar2;
                aqjjVar2.b |= 16384;
                aihfVarCreateBuilder2.copyOnWrite();
                amah amahVar = (amah) aihfVarCreateBuilder2.instance;
                aqjj aqjjVar3 = (aqjj) aihfVarCreateBuilder3.build();
                aqjjVar3.getClass();
                amahVar.c = aqjjVar3;
                amahVar.b = 58174010;
                amah amahVar2 = (amah) aihfVarCreateBuilder2.build();
                amaf amafVar4 = ((amae) aihhVar.instance).e;
                if (amafVar4 == null) {
                    amafVar4 = amafVar;
                }
                if (amafVar4.b == 125354411) {
                    alzqVar = (alzq) amafVar4.c;
                }
                aihf builder = alzqVar.toBuilder();
                aihh aihhVar2 = (aihh) apji.a.createBuilder();
                aihl aihlVar = amaj.a;
                aihf aihfVarCreateBuilder5 = amai.a.createBuilder();
                aihfVarCreateBuilder5.bu(amahVar2);
                aihhVar2.e(aihlVar, (amai) aihfVarCreateBuilder5.build());
                builder.copyOnWrite();
                alzq alzqVar2 = (alzq) builder.instance;
                apji apjiVar = (apji) aihhVar2.build();
                apjiVar.getClass();
                alzqVar2.d = apjiVar;
                alzqVar2.b |= 64;
                alzq alzqVar3 = (alzq) builder.build();
                amaf amafVar5 = ((amae) aihhVar.instance).e;
                if (amafVar5 != null) {
                    amafVar = amafVar5;
                }
                aihf builder2 = amafVar.toBuilder();
                builder2.copyOnWrite();
                amaf amafVar6 = (amaf) builder2.instance;
                alzqVar3.getClass();
                amafVar6.c = alzqVar3;
                amafVar6.b = 125354411;
                amaf amafVar7 = (amaf) builder2.build();
                aihhVar.copyOnWrite();
                amae amaeVar2 = (amae) aihhVar.instance;
                amafVar7.getClass();
                amaeVar2.e = amafVar7;
                amaeVar2.b |= 2;
            }
            amae amaeVar3 = (amae) aihhVar.build();
            aoujVarAb = fhz.ab(amaeVar3);
            if (i5 != -1) {
                agke agkeVar2 = hcgVar.c;
                anyxVar = (anyx) agkeVar2.get(Math.max(0, Math.min(agkeVar2.size() - 1, i5)));
            } else {
                if (apzgVar2 != null && apzgVar2.c && !apzgVar2.d) {
                    if (aoujVarAb != null) {
                        i3 = aoujVarAb.k;
                        i4 = aoujVarAb.h;
                        if (i3 <= i4) {
                            ((agrc) ((agrc) c.c().i(agso.a, "SideloadedWatchNextResp")).k("com/google/android/apps/youtube/music/player/sideloaded/SideloadedWatchNextResponseFactory", "getCurrentUriFromPlaylistPanel", 184, "SideloadedWatchNextResponseFactory.java")).t("Playlist panel has no current sideloaded track.");
                            str = "";
                        } else {
                            aounVar = ((aoui) aoujVarAb.g.get(i4)).c;
                            if (aounVar == null) {
                                aounVar = aoun.a;
                            }
                            if ((aounVar.b & SemanticState.Hidden) != 0) {
                                ajwoVar2 = aounVar.l;
                                if (ajwoVar2 == null) {
                                    ajwoVar2 = ajwo.a;
                                }
                                aihlVarCheckIsLite = aihn.checkIsLite(apzf.b);
                                ajwoVar2.c(aihlVarCheckIsLite);
                                objK = ajwoVar2.j.k(aihlVarCheckIsLite.d);
                                if (objK == null) {
                                    objC = aihlVarCheckIsLite.b;
                                } else {
                                    objC = aihlVarCheckIsLite.c(objK);
                                }
                                str = ((apzf) objC).d;
                            } else {
                                ((agrc) ((agrc) c.c().i(agso.a, "SideloadedWatchNextResp")).k("com/google/android/apps/youtube/music/player/sideloaded/SideloadedWatchNextResponseFactory", "getCurrentUriFromPlaylistPanel", 184, "SideloadedWatchNextResponseFactory.java")).t("Playlist panel has no current sideloaded track.");
                                str = "";
                            }
                        }
                    } else {
                        ((agrc) ((agrc) c.c().i(agso.a, "SideloadedWatchNextResp")).k("com/google/android/apps/youtube/music/player/sideloaded/SideloadedWatchNextResponseFactory", "getCurrentUriFromPlaylistPanel", 184, "SideloadedWatchNextResponseFactory.java")).t("Playlist panel has no current sideloaded track.");
                        str = "";
                    }
                    agkeVar = hcgVar.c;
                    size = agkeVar.size();
                    i2 = 0;
                    while (i2 < size) {
                        anyxVar = (anyx) agkeVar.get(i2);
                        i2++;
                        if (anyxVar.getAndroidMediaStoreContentUri().equals(str)) {
                        }
                    }
                }
                i5 = -1;
                agke agkeVar3 = hcgVar.c;
                anyxVar = (anyx) agkeVar3.get(Math.max(0, Math.min(agkeVar3.size() - 1, i5)));
            }
            aihh aihhVar3 = (aihh) amaeVar3.toBuilder();
            ListenableFuture listenableFutureAo = this.e.ao(anyx.class, amto.class, anyxVar, d);
            iat iatVar = new iat(aihhVar3, 19);
            Executor executor = this.a;
            return ahno.ar(ahno.ar(listenableFutureAo, iatVar, executor), new iat(anyxVar, 20), executor);
        }
        apzgVar2 = null;
        aaua aauaVar = new aaua();
        aauaVar.e(false);
        aauaVar.d(-1);
        aauaVar.d(i5);
        aauaVar.e(apzgVar2 != null && apzgVar2.c);
        if ((aauaVar.c & 1) == 0) {
            throw new IllegalStateException("Property \"playbackPosition\" has not been set");
        }
        aauaVar.d(Math.max(aauaVar.b, -1));
        if (aauaVar.c != 3) {
            StringBuilder sb = new StringBuilder();
            if ((aauaVar.c & 1) == 0) {
                sb.append(" playbackPosition");
            }
            if ((aauaVar.c & 2) == 0) {
                sb.append(" shouldShuffleLocally");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        inh inhVar = new inh(aauaVar.b, aauaVar.a);
        agkh agkhVar = new agkh(4);
        agkhVar.i(d);
        agkhVar.e("playlist_panel_context", inhVar);
        agkj agkjVarD = agkhVar.d(true);
        aihf aihfVarCreateBuilder6 = anvq.a.createBuilder();
        apji apjiVar2 = apji.a;
        aihh aihhVar4 = (aihh) apjiVar2.createBuilder();
        aihhVar4.e(aouq.a, (aouj) this.e.ap(hcg.class, aouj.class, hcgVar, agkjVarD));
        aihfVarCreateBuilder6.copyOnWrite();
        anvq anvqVar2 = (anvq) aihfVarCreateBuilder6.instance;
        apji apjiVar3 = (apji) aihhVar4.build();
        apjiVar3.getClass();
        anvqVar2.c = apjiVar3;
        anvqVar2.b |= 1;
        String str2 = hcgVar.f;
        boolean zR = hef.r(Uri.parse(str2));
        String string2 = context.getString(R.string.queue_header_title);
        String str3 = hcgVar.g;
        if (zR) {
            aihh aihhVar5 = (aihh) ajwo.a.createBuilder();
            aihl aihlVar2 = ajmj.a;
            aihf aihfVarCreateBuilder7 = ajmf.a.createBuilder();
            aihfVarCreateBuilder7.copyOnWrite();
            ajmf ajmfVar = (ajmf) aihfVarCreateBuilder7.instance;
            str2.getClass();
            ajmfVar.b |= 1;
            ajmfVar.c = str2;
            aihhVar5.e(aihlVar2, (ajmf) aihfVarCreateBuilder7.build());
            ajwoVar = (ajwo) aihhVar5.build();
        } else {
            ajwoVar = null;
        }
        apji apjiVarI = hna.i(context, string2, ahno.Z(str3), ajwoVar);
        aihfVarCreateBuilder6.copyOnWrite();
        anvq anvqVar3 = (anvq) aihfVarCreateBuilder6.instance;
        apjiVarI.getClass();
        anvqVar3.e = apjiVarI;
        anvqVar3.b |= 4;
        aihf aihfVarCreateBuilder8 = amah.a.createBuilder();
        aihf aihfVarCreateBuilder9 = aqjj.a.createBuilder();
        String string3 = context.getString(R.string.default_queue_title);
        aihfVarCreateBuilder9.copyOnWrite();
        aqjj aqjjVar4 = (aqjj) aihfVarCreateBuilder9.instance;
        string3.getClass();
        aqjjVar4.b |= 4;
        aqjjVar4.e = string3;
        aihf aihfVarCreateBuilder10 = aqjg.a.createBuilder();
        aihfVarCreateBuilder10.copyOnWrite();
        aqjg aqjgVar3 = (aqjg) aihfVarCreateBuilder10.instance;
        anvq anvqVar4 = (anvq) aihfVarCreateBuilder6.build();
        anvqVar4.getClass();
        aqjgVar3.e = anvqVar4;
        aqjgVar3.b |= 4194304;
        aihfVarCreateBuilder9.copyOnWrite();
        aqjj aqjjVar5 = (aqjj) aihfVarCreateBuilder9.instance;
        aqjg aqjgVar4 = (aqjg) aihfVarCreateBuilder10.build();
        aqjgVar4.getClass();
        aqjjVar5.i = aqjgVar4;
        aqjjVar5.b |= 16384;
        aihfVarCreateBuilder8.copyOnWrite();
        amah amahVar3 = (amah) aihfVarCreateBuilder8.instance;
        aqjj aqjjVar6 = (aqjj) aihfVarCreateBuilder9.build();
        aqjjVar6.getClass();
        amahVar3.c = aqjjVar6;
        amahVar3.b = 58174010;
        amah amahVar4 = (amah) aihfVarCreateBuilder8.build();
        amaf amafVar8 = ((amae) aihhVar.instance).e;
        if (amafVar8 == null) {
            amafVar8 = amafVar;
        }
        aihf builder3 = amafVar8.toBuilder();
        amaf amafVar9 = ((amae) aihhVar.instance).e;
        if (amafVar9 != null) {
            amafVar = amafVar9;
        }
        aihf builder4 = (amafVar.b == 125354411 ? (alzq) amafVar.c : alzqVar).toBuilder();
        aihh aihhVar6 = (aihh) apjiVar2.createBuilder();
        aihl aihlVar3 = amaj.a;
        aihf aihfVarCreateBuilder11 = amai.a.createBuilder();
        aihfVarCreateBuilder11.bu(amahVar4);
        aihhVar6.e(aihlVar3, (amai) aihfVarCreateBuilder11.build());
        builder4.copyOnWrite();
        alzq alzqVar4 = (alzq) builder4.instance;
        apji apjiVar4 = (apji) aihhVar6.build();
        apjiVar4.getClass();
        alzqVar4.d = apjiVar4;
        alzqVar4.b |= 64;
        builder3.copyOnWrite();
        amaf amafVar10 = (amaf) builder3.instance;
        alzq alzqVar5 = (alzq) builder4.build();
        alzqVar5.getClass();
        amafVar10.c = alzqVar5;
        amafVar10.b = 125354411;
        aihhVar.copyOnWrite();
        amae amaeVar4 = (amae) aihhVar.instance;
        amaf amafVar11 = (amaf) builder3.build();
        amafVar11.getClass();
        amaeVar4.e = amafVar11;
        amaeVar4.b |= 2;
        apzgVar2 = apzgVar2;
        amae amaeVar5 = (amae) aihhVar.build();
        aoujVarAb = fhz.ab(amaeVar5);
        if (i5 != -1) {
            agke agkeVar4 = hcgVar.c;
            anyxVar = (anyx) agkeVar4.get(Math.max(0, Math.min(agkeVar4.size() - 1, i5)));
        } else {
            if (apzgVar2 != null) {
                if (aoujVarAb != null) {
                    i3 = aoujVarAb.k;
                    i4 = aoujVarAb.h;
                    if (i3 <= i4) {
                        ((agrc) ((agrc) c.c().i(agso.a, "SideloadedWatchNextResp")).k("com/google/android/apps/youtube/music/player/sideloaded/SideloadedWatchNextResponseFactory", "getCurrentUriFromPlaylistPanel", 184, "SideloadedWatchNextResponseFactory.java")).t("Playlist panel has no current sideloaded track.");
                        str = "";
                    } else {
                        aounVar = ((aoui) aoujVarAb.g.get(i4)).c;
                        if (aounVar == null) {
                            aounVar = aoun.a;
                        }
                        if ((aounVar.b & SemanticState.Hidden) != 0) {
                            ajwoVar2 = aounVar.l;
                            if (ajwoVar2 == null) {
                                ajwoVar2 = ajwo.a;
                            }
                            aihlVarCheckIsLite = aihn.checkIsLite(apzf.b);
                            ajwoVar2.c(aihlVarCheckIsLite);
                            objK = ajwoVar2.j.k(aihlVarCheckIsLite.d);
                            if (objK == null) {
                                objC = aihlVarCheckIsLite.b;
                            } else {
                                objC = aihlVarCheckIsLite.c(objK);
                            }
                            str = ((apzf) objC).d;
                        } else {
                            ((agrc) ((agrc) c.c().i(agso.a, "SideloadedWatchNextResp")).k("com/google/android/apps/youtube/music/player/sideloaded/SideloadedWatchNextResponseFactory", "getCurrentUriFromPlaylistPanel", 184, "SideloadedWatchNextResponseFactory.java")).t("Playlist panel has no current sideloaded track.");
                            str = "";
                        }
                    }
                } else {
                    ((agrc) ((agrc) c.c().i(agso.a, "SideloadedWatchNextResp")).k("com/google/android/apps/youtube/music/player/sideloaded/SideloadedWatchNextResponseFactory", "getCurrentUriFromPlaylistPanel", 184, "SideloadedWatchNextResponseFactory.java")).t("Playlist panel has no current sideloaded track.");
                    str = "";
                }
                agkeVar = hcgVar.c;
                size = agkeVar.size();
                i2 = 0;
                while (i2 < size) {
                    anyxVar = (anyx) agkeVar.get(i2);
                    i2++;
                    if (anyxVar.getAndroidMediaStoreContentUri().equals(str)) {
                    }
                }
            }
            i5 = -1;
            agke agkeVar5 = hcgVar.c;
            anyxVar = (anyx) agkeVar5.get(Math.max(0, Math.min(agkeVar5.size() - 1, i5)));
        }
        aihh aihhVar7 = (aihh) amaeVar5.toBuilder();
        ListenableFuture listenableFutureAo2 = this.e.ao(anyx.class, amto.class, anyxVar, d);
        iat iatVar2 = new iat(aihhVar7, 19);
        Executor executor2 = this.a;
        return ahno.ar(ahno.ar(listenableFutureAo2, iatVar2, executor2), new iat(anyxVar, 20), executor2);
    }
}
