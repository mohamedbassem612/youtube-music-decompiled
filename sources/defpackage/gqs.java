package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqs implements gmz {
    private static final agrf h = agrf.h("com/google/android/apps/youtube/music/browse/ShortcutController");
    public final Context a;
    public final aduv b = new gqr();
    public final ShortcutManager c;
    public final hpk d;
    public final cf e;
    public final Executor f;
    public final jin g;
    private final Executor i;

    public gqs(Context context, hpk hpkVar, cf cfVar, jin jinVar, Executor executor, Executor executor2) {
        this.a = context;
        this.c = zs$$ExternalSyntheticApiModelOutline0.m949m(context.getSystemService(zs$$ExternalSyntheticApiModelOutline0.m()));
        this.d = hpkVar;
        this.e = cfVar;
        this.g = jinVar;
        this.i = executor;
        this.f = executor2;
    }

    @Override // defpackage.gmz
    public final void a(final heh hehVar) {
        final ShortcutManager shortcutManager = this.c;
        if (shortcutManager == null || hehVar == null || hehVar.g != hei.c) {
            return;
        }
        ajwo ajwoVar = hehVar.f;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(ajmj.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        if ("FEmusic_home".equals(((ajmf) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK))).c)) {
            Callable callable = new Callable() { // from class: gqo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Integer.valueOf(shortcutManager.getMaxShortcutCountPerActivity());
                }
            };
            Executor executor = this.i;
            ojf ojfVar = new ojf(callable, 19);
            long j = afwl.a;
            ahfo ahfoVar = new ahfo(new afwh(afty.c(false), ojfVar, 0));
            executor.execute(ahfoVar);
            afxd afxdVarG = afxd.f(ahfoVar).h(new ahcy() { // from class: gqp
                /* JADX WARN: Code duplicated, block: B:23:0x004c  */
                /* JADX WARN: Code duplicated, block: B:83:0x013f  */
                @Override // defpackage.ahcy
                public final ListenableFuture a(Object obj) {
                    aiie aiieVar;
                    final ShortcutInfo shortcutInfoBuild;
                    String str;
                    almd almdVar;
                    int iIntValue = ((Integer) obj).intValue();
                    heh hehVar2 = hehVar;
                    Object obj2 = hehVar2.h;
                    if (obj2 == null || (almdVar = ((wfy) obj2).a) == null) {
                        aiieVar = null;
                    } else {
                        allz allzVar = almdVar.e;
                        if (allzVar == null) {
                            allzVar = allz.a;
                        }
                        if ((allzVar.b == 100625508 ? (anki) allzVar.c : anki.a).f.size() > 0) {
                            allz allzVar2 = ((wfy) hehVar2.h).a.e;
                            if (allzVar2 == null) {
                                allzVar2 = allz.a;
                            }
                            aiieVar = (allzVar2.b == 100625508 ? (anki) allzVar2.c : anki.a).f;
                        } else {
                            aiieVar = null;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    if (aiieVar != null) {
                        int iMin = Math.min(aiieVar.size(), iIntValue);
                        for (int i = 0; i < iMin; i++) {
                            alib alibVar = ((alia) aiieVar.get(i)).c;
                            if (alibVar == null) {
                                alibVar = alib.a;
                            }
                            int iBt = a.bt(alibVar.g);
                            if (iBt != 0 && iBt != 1) {
                                gqs gqsVar = this.a;
                                alia aliaVar = (alia) aiieVar.get(i);
                                if ((aliaVar.b & 1) == 0) {
                                    shortcutInfoBuild = null;
                                } else {
                                    alib alibVar2 = aliaVar.c;
                                    if (alibVar2 == null) {
                                        alibVar2 = alib.a;
                                    }
                                    Intent intent = new Intent("com.google.android.youtube.music.action.shortcut");
                                    Context context = gqsVar.a;
                                    intent.setClassName(context, "com.google.android.apps.youtube.music.activities.InternalMusicActivity");
                                    intent.setPackage(context.getPackageName());
                                    int iBt2 = a.bt(alibVar2.g);
                                    if (iBt2 == 0) {
                                        iBt2 = 1;
                                    }
                                    intent.putExtra("com.google.android.youtube.music.action.shortcut_type", iBt2 - 1);
                                    int i2 = alibVar2.b;
                                    if ((i2 & 8) != 0) {
                                        ajwo ajwoVar2 = alibVar2.e;
                                        if (ajwoVar2 == null) {
                                            ajwoVar2 = ajwo.a;
                                        }
                                        intent.putExtra("com.google.android.youtube.music.action.shortcut", Base64.encodeToString(ajwoVar2.toByteArray(), 0));
                                    } else if ((i2 & 16) != 0) {
                                        ajwo ajwoVar3 = alibVar2.f;
                                        if (ajwoVar3 == null) {
                                            ajwoVar3 = ajwo.a;
                                        }
                                        intent.putExtra("com.google.android.youtube.music.action.shortcut", Base64.encodeToString(ajwoVar3.toByteArray(), 0));
                                    } else {
                                        shortcutInfoBuild = null;
                                    }
                                    int iBt3 = a.bt(alibVar2.g);
                                    if (iBt3 == 0 || iBt3 == 1) {
                                        str = "QUICK_ACTION_TYPE_UNKNOWN";
                                    } else if (iBt3 == 2) {
                                        str = "QUICK_ACTION_TYPE_SEARCH";
                                    } else if (iBt3 == 3) {
                                        str = "QUICK_ACTION_TYPE_MY_MIX";
                                    } else if (iBt3 != 4) {
                                        str = iBt3 != 5 ? "QUICK_ACTION_TYPE_PODCASTS" : "QUICK_ACTION_TYPE_SHUFFLE_DOWNLOADS";
                                    } else {
                                        str = "QUICK_ACTION_TYPE_OFFLINE_MIXTAPE";
                                    }
                                    ShortcutInfo.Builder intent2 = new ShortcutInfo.Builder(context, str).setShortLabel(alibVar2.c).setIntent(intent);
                                    alja aljaVar = alibVar2.d;
                                    if (aljaVar == null) {
                                        aljaVar = alja.a;
                                    }
                                    if ((aljaVar.b & 1) != 0) {
                                        aduv aduvVar = gqsVar.b;
                                        alja aljaVar2 = alibVar2.d;
                                        if (aljaVar2 == null) {
                                            aljaVar2 = alja.a;
                                        }
                                        aliz alizVarA = aliz.a(aljaVar2.c);
                                        if (alizVarA == null) {
                                            alizVarA = aliz.UNKNOWN;
                                        }
                                        intent2.setIcon(Icon.createWithResource(context, aduvVar.a(alizVarA)));
                                    }
                                    shortcutInfoBuild = intent2.build();
                                }
                                if (shortcutInfoBuild != null) {
                                    int iBt4 = a.bt(alibVar.g);
                                    if (iBt4 == 0 || iBt4 != 5) {
                                        arrayList.add(new aher(shortcutInfoBuild));
                                    } else {
                                        ListenableFuture listenableFutureH = gqsVar.d.h();
                                        agek agekVar = new agek() { // from class: gqm
                                            @Override // defpackage.agek
                                            public final Object apply(Object obj3) {
                                                if (Boolean.TRUE.equals((Boolean) obj3)) {
                                                    return shortcutInfoBuild;
                                                }
                                                return null;
                                            }
                                        };
                                        Executor executorDirectExecutor = MoreExecutors.directExecutor();
                                        long j2 = afwl.a;
                                        ahcr ahcrVar = new ahcr(listenableFutureH, new afwi(afty.c(false), agekVar));
                                        listenableFutureH.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
                                        arrayList.add(ahcrVar);
                                    }
                                }
                            }
                        }
                    }
                    return new ahdn(agke.j(arrayList), true);
                }
            }, executor).g(new gqq(this, 0), executor);
            hmb hmbVar = new hmb(1);
            Executor executor2 = taf.a;
            afxdVarG.addListener(new ahei(afxdVarG, new afwj(afty.c(false), new taa(taf.c, null, hmbVar), 0)), MoreExecutors.directExecutor());
        }
    }

    public final Optional d(String str) {
        try {
            return Optional.of((ajwo) ((aihh) ((aihh) ajwo.a.createBuilder()).mergeFrom(Base64.decode(str, 0), ExtensionRegistryLite.getGeneratedRegistry())).build());
        } catch (Exception unused) {
            return Optional.empty();
        }
    }

    @Override // defpackage.gmz
    public final void b(heh hehVar) {
    }

    @Override // defpackage.gmz
    public final void c(String str) {
    }
}
