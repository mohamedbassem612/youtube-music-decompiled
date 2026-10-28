package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.Spanned;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hin {
    public static final /* synthetic */ int c = 0;
    private static final agrf d = agrf.h("com/google/android/apps/youtube/music/mediabrowser/content/MediaItemFactory");
    private static final agkz e = agkz.q(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED_CHILDREN, amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SETTINGS);
    private static final agkz f = agkz.q(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_UNSPECIFIED, amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DETAILS_FOOTER);
    public final Context a;
    public final aunn b;
    private final aunn g;
    private final aunn h;
    private final aunn i;
    private final aunn j;
    private final aunn k;
    private final Executor l;
    private final Executor m;
    private final aunn n;
    private final Set o = new HashSet();
    private final vxz p;

    public hin(Context context, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, Executor executor, Executor executor2, aunn aunnVar7, vxz vxzVar) {
        this.a = context;
        this.g = aunnVar;
        this.h = aunnVar2;
        this.b = aunnVar3;
        this.i = aunnVar4;
        this.j = aunnVar5;
        this.k = aunnVar6;
        this.l = executor;
        this.m = executor2;
        this.n = aunnVar7;
        this.p = vxzVar;
    }

    private static int l(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return 2;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1 : 4;
        }
        return 3;
    }

    final MediaBrowserCompat$MediaItem a(amzw amzwVar) {
        return b(amzwVar, new Bundle());
    }

    final MediaBrowserCompat$MediaItem b(amzw amzwVar, Bundle bundle) {
        Uri uri;
        String str;
        String str2;
        String str3;
        String string;
        Uri uriR;
        int iOrdinal = amzwVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 7) {
                    Context context = this.a;
                    String str4 = gzl.b;
                    string = context.getString(R.string.library_downloads_shelf_title);
                    bundle.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", context.getString(R.string.library_downloads_shelf_title));
                    uri = null;
                    str2 = str4;
                } else if (iOrdinal == 8) {
                    Context context2 = this.a;
                    aunn aunnVar = this.n;
                    str3 = gzl.e;
                    string = context2.getString(R.string.settings);
                    uriR = ixt.r(context2, ((adxj) aunnVar.io()).b(arqz.hF));
                } else {
                    if (iOrdinal != 10) {
                        throw new IllegalArgumentException("Must specify a container type");
                    }
                    Context context3 = this.a;
                    aunn aunnVar2 = this.n;
                    str3 = gzl.c;
                    string = context3.getString(R.string.android_auto_local_content_parent_tab_title);
                    uriR = ixt.r(context3, ((adxj) aunnVar2.io()).b(arqz.gN));
                    bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
                }
                str = string;
            } else {
                Context context4 = this.a;
                aunn aunnVar3 = this.n;
                str3 = gzl.d;
                string = context4.getString(R.string.library_device_files_songs_shelf_title);
                uriR = ixt.r(context4, ((adxj) aunnVar3.io()).b(arqz.jf));
                bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 1);
                bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
            }
            uri = uriR;
            str2 = str3;
            str = string;
        } else {
            Context context5 = this.a;
            String str5 = gzl.a;
            String string2 = context5.getString(R.string.library_downloads_shelf_title);
            Uri uriR2 = ixt.r(context5, ((adxj) this.n.io()).b(arqz.gN));
            bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
            uri = uriR2;
            str = string2;
            str2 = str5;
        }
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str2, str, null, null, null, uri, bundle, null), 1);
    }

    final MediaBrowserCompat$MediaItem c(amzz amzzVar) {
        alay alayVar;
        alay alayVar2;
        String str = ((amzzVar.b & 8) == 0 || amzzVar.e.isEmpty()) ? "__DEFAULT_PROMOTION_ITEM_ID__" : amzzVar.e;
        Bundle bundle = null;
        if ((amzzVar.b & 1) != 0) {
            alayVar = amzzVar.c;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK = ackj.k(null, alayVar, null, false);
        if ((amzzVar.b & 2) != 0) {
            alayVar2 = amzzVar.d;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        Spanned spannedK2 = ackj.k(null, alayVar2, null, false);
        if (this.p.l(6, 45680102L, false)) {
            bundle = new Bundle();
            bundle.putBoolean("com.google.android.apps.youtube.music.mediabrowser.IS_PROMOTION", true);
        }
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str, spannedK, spannedK2, null, null, null, bundle, null), 1);
    }

    final MediaBrowserCompat$MediaItem d(anzs anzsVar) {
        Uri uriR;
        ajwo ajwoVar = anzsVar.f;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        String strY = hmy.y(ajwoVar);
        String str = anzsVar.c;
        String str2 = anzsVar.d;
        if ((anzsVar.b & 4) != 0) {
            aqmh aqmhVar = anzsVar.e;
            if (aqmhVar == null) {
                aqmhVar = aqmh.a;
            }
            uriR = aawb.F(aqmhVar);
        } else {
            uriR = ixt.r(this.a, R.drawable.empty_state_cover_square);
        }
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(strY, str, str2, null, null, uriR, null, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    final ListenableFuture e(zne zneVar) {
        ListenableFuture listenableFutureA;
        if (zneVar == null || !hhs.b(zneVar)) {
            return ahng.n(agpr.a);
        }
        agkx agkxVar = new agkx();
        if (txz.g(this.a)) {
            aunn aunnVar = this.h;
            if (((hpy) aunnVar.io()).i()) {
                listenableFutureA = ((hpy) this.h.io()).a(kro.aq());
            } else {
                listenableFutureA = ((hpy) aunnVar.io()).d(kro.aq());
            }
        } else {
            listenableFutureA = ((hpy) this.h.io()).a(kro.aq());
        }
        afxd afxdVarF = afxd.f(listenableFutureA);
        hdn hdnVar = new hdn(6);
        Executor executor = this.l;
        afxd afxdVarG = afxdVarF.g(hdnVar, executor);
        aunn aunnVar2 = this.i;
        aunnVar2.getClass();
        ListenableFuture listenableFutureAs = ahno.as(ahno.ap(new ub(aunnVar2, 10), this.m), new gqb(this, zneVar, 4), executor);
        return ahno.av(afxdVarG, listenableFutureAs).k(new hlm((ListenableFuture) afxdVarG, agkxVar, listenableFutureAs, zneVar, 1), executor);
    }

    public final amzx f(zne zneVar) {
        aihf aihfVarCreateBuilder = anfb.a.createBuilder();
        Context context = this.a;
        amzw amzwVar = txz.g(context) ? amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED_CHILDREN : amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED;
        aihfVarCreateBuilder.copyOnWrite();
        anfb anfbVar = (anfb) aihfVarCreateBuilder.instance;
        anfbVar.d = Integer.valueOf(amzwVar.p);
        anfbVar.c = 2;
        int i = zneVar.i() - 1;
        aihfVarCreateBuilder.copyOnWrite();
        anfb anfbVar2 = (anfb) aihfVarCreateBuilder.instance;
        anfbVar2.b |= 4;
        anfbVar2.g = i;
        anfb anfbVar3 = (anfb) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = amzx.a.createBuilder();
        alay alayVarC = ackj.c(context.getString(R.string.library_downloads_shelf_title));
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar = (amzx) aihfVarCreateBuilder2.instance;
        alayVarC.getClass();
        amzxVar.g = alayVarC;
        amzxVar.b |= 4;
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.OFFLINE_DOWNLOAD;
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar2 = (amzx) aihfVarCreateBuilder2.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        amzxVar2.d = aljaVar2;
        amzxVar2.c = 7;
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar3 = (amzx) aihfVarCreateBuilder2.instance;
        anfbVar3.getClass();
        amzxVar3.f = anfbVar3;
        amzxVar3.b |= 2;
        String strB = zls.b(anfbVar3);
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar4 = (amzx) aihfVarCreateBuilder2.instance;
        amzxVar4.b |= 1;
        amzxVar4.e = strB;
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar5 = (amzx) aihfVarCreateBuilder2.instance;
        amzxVar5.b |= SemanticState.Focused;
        amzxVar5.l = true;
        return (amzx) aihfVarCreateBuilder2.build();
    }

    public final amzx g(zne zneVar) {
        aihf aihfVarCreateBuilder = anfb.a.createBuilder();
        amzw amzwVar = amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_LOCAL_CONTENT_PARENT;
        aihfVarCreateBuilder.copyOnWrite();
        anfb anfbVar = (anfb) aihfVarCreateBuilder.instance;
        anfbVar.d = Integer.valueOf(amzwVar.p);
        anfbVar.c = 2;
        int i = zneVar.i() - 1;
        aihfVarCreateBuilder.copyOnWrite();
        anfb anfbVar2 = (anfb) aihfVarCreateBuilder.instance;
        anfbVar2.b |= 4;
        anfbVar2.g = i;
        long jNextLong = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
        aihfVarCreateBuilder.copyOnWrite();
        anfb anfbVar3 = (anfb) aihfVarCreateBuilder.instance;
        anfbVar3.b |= 8;
        anfbVar3.h = jNextLong;
        anfb anfbVar4 = (anfb) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = amzx.a.createBuilder();
        alay alayVarC = ackj.c(this.a.getString(R.string.android_auto_local_content_parent_tab_title));
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar = (amzx) aihfVarCreateBuilder2.instance;
        alayVarC.getClass();
        amzxVar.g = alayVarC;
        amzxVar.b |= 4;
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.OFFLINE_DOWNLOAD;
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar2 = (amzx) aihfVarCreateBuilder2.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        amzxVar2.d = aljaVar2;
        amzxVar2.c = 7;
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar3 = (amzx) aihfVarCreateBuilder2.instance;
        anfbVar4.getClass();
        amzxVar3.f = anfbVar4;
        amzxVar3.b |= 2;
        String strB = zls.b(anfbVar4);
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar4 = (amzx) aihfVarCreateBuilder2.instance;
        amzxVar4.b |= 1;
        amzxVar4.e = strB;
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar5 = (amzx) aihfVarCreateBuilder2.instance;
        amzxVar5.b |= SemanticState.Focused;
        amzxVar5.l = true;
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar6 = (amzx) aihfVarCreateBuilder2.instance;
        amzxVar6.m = 1;
        amzxVar6.b |= SemanticState.Hidden;
        aihfVarCreateBuilder2.bD(agke.r(f(zneVar), h(zneVar)));
        return (amzx) aihfVarCreateBuilder2.build();
    }

    public final amzx h(zne zneVar) {
        aihf aihfVarCreateBuilder = anfb.a.createBuilder();
        amzw amzwVar = amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED;
        aihfVarCreateBuilder.copyOnWrite();
        anfb anfbVar = (anfb) aihfVarCreateBuilder.instance;
        anfbVar.d = Integer.valueOf(amzwVar.p);
        anfbVar.c = 2;
        int i = zneVar.i() - 1;
        aihfVarCreateBuilder.copyOnWrite();
        anfb anfbVar2 = (anfb) aihfVarCreateBuilder.instance;
        anfbVar2.b |= 4;
        anfbVar2.g = i;
        anfb anfbVar3 = (anfb) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = amzx.a.createBuilder();
        alay alayVarC = ackj.c(this.a.getString(R.string.library_device_files_songs_shelf_title));
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar = (amzx) aihfVarCreateBuilder2.instance;
        alayVarC.getClass();
        amzxVar.g = alayVarC;
        amzxVar.b |= 4;
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.MOBILE_FRIENDLY;
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar2 = (amzx) aihfVarCreateBuilder2.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        amzxVar2.d = aljaVar2;
        amzxVar2.c = 7;
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar3 = (amzx) aihfVarCreateBuilder2.instance;
        anfbVar3.getClass();
        amzxVar3.f = anfbVar3;
        amzxVar3.b |= 2;
        String strB = zls.b(anfbVar3);
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar4 = (amzx) aihfVarCreateBuilder2.instance;
        amzxVar4.b |= 1;
        amzxVar4.e = strB;
        aihfVarCreateBuilder2.copyOnWrite();
        amzx amzxVar5 = (amzx) aihfVarCreateBuilder2.instance;
        amzxVar5.b |= SemanticState.Focused;
        amzxVar5.l = true;
        return (amzx) aihfVarCreateBuilder2.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional i(amzx amzxVar, Set set, zne zneVar) {
        alay alayVar;
        amzw amzwVarA;
        alay alayVar2;
        alay alayVar3;
        alay alayVar4;
        Spanned spannedK;
        alay alayVar5;
        Bundle bundle = new Bundle();
        if ((amzxVar.b & 32768) != 0) {
            alayVar = amzxVar.s;
            if (alayVar == null) {
                alayVar = alay.a;
            }
        } else {
            alayVar = null;
        }
        Spanned spannedK2 = ackj.k(null, alayVar, null, false);
        if (!TextUtils.isEmpty(spannedK2)) {
            bundle.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", spannedK2.toString());
        }
        anfb anfbVar = amzxVar.f;
        if (anfbVar == null) {
            anfbVar = anfb.a;
        }
        if (anfbVar.c != 2 || (amzwVarA = amzw.a(((Integer) anfbVar.d).intValue())) == null) {
            amzwVarA = amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_UNSPECIFIED;
        }
        if (!f.contains(amzwVarA)) {
            Object[] objArr = txz.g(this.a) && e.contains(amzwVarA);
            if (!this.p.l(6, 45680102L, false) || objArr != false) {
                return !set.contains(amzwVarA) ? Optional.empty() : Optional.of(b(amzwVarA, bundle));
            }
        }
        if ((amzxVar.b & 4) != 0) {
            alayVar2 = amzxVar.g;
            if (alayVar2 == null) {
                alayVar2 = alay.a;
            }
        } else {
            alayVar2 = null;
        }
        if (!TextUtils.isEmpty(ackj.k(null, alayVar2, null, false))) {
            if (amzxVar.k) {
                anfb anfbVar2 = amzxVar.f;
                if (anfbVar2 == null) {
                    anfbVar2 = anfb.a;
                }
                if ((anfbVar2.b & 1) == 0) {
                    String str = amzxVar.e;
                    znf znfVar = znf.a;
                    if (yno.ai(str).a() == null) {
                        ((agrc) ((agrc) d.b()).k("com/google/android/apps/youtube/music/mediabrowser/content/MediaItemFactory", "hasValidPlayableState", 869, "MediaItemFactory.java")).t("Playable mbfeItem has no command.");
                    }
                }
            }
            String str2 = amzxVar.e;
            if ((amzxVar.b & 4) != 0) {
                alayVar3 = amzxVar.g;
                if (alayVar3 == null) {
                    alayVar3 = alay.a;
                }
            } else {
                alayVar3 = null;
            }
            Spanned spannedK3 = ackj.k(null, alayVar3, null, false);
            if ((amzxVar.b & 8) != 0) {
                alayVar4 = amzxVar.h;
                if (alayVar4 == null) {
                    alayVar4 = alay.a;
                }
            } else {
                alayVar4 = null;
            }
            if (TextUtils.isEmpty(ackj.k(null, alayVar4, null, false))) {
                spannedK = null;
            } else {
                if ((amzxVar.b & 8) != 0) {
                    alayVar5 = amzxVar.h;
                    if (alayVar5 == null) {
                        alayVar5 = alay.a;
                    }
                } else {
                    alayVar5 = null;
                }
                spannedK = ackj.k(null, alayVar5, null, false);
            }
            Uri uriR = amzxVar.k ? ixt.r(this.a, R.drawable.empty_state_cover_square) : null;
            if ((amzxVar.c == 6 ? (aqmh) amzxVar.d : aqmh.a).c.size() != 0) {
                uriR = aawb.H(amzxVar.c == 6 ? (aqmh) amzxVar.d : aqmh.a);
            } else {
                if (((amzxVar.c == 7 ? (alja) amzxVar.d : alja.a).b & 1) != 0) {
                    izf izfVar = (izf) this.g.io();
                    aliz alizVarA = aliz.a((amzxVar.c == 7 ? (alja) amzxVar.d : alja.a).c);
                    if (alizVarA == null) {
                        alizVarA = aliz.UNKNOWN;
                    }
                    int iA = izfVar.a(alizVarA);
                    if (iA != 0) {
                        uriR = ixt.r(this.a, iA);
                    }
                }
            }
            if (uriR != null) {
                uriR.getScheme();
            }
            int iAV = a.aV(amzxVar.p);
            if (iAV == 0) {
                iAV = 1;
            }
            if (iAV - 1 == 1) {
                bundle.putLong("android.media.IS_EXPLICIT", 1L);
            }
            anfb anfbVar3 = amzxVar.f;
            if (anfbVar3 == null) {
                anfbVar3 = anfb.a;
            }
            int iBc = a.bc(anfbVar3.f);
            if (iBc == 0) {
                iBc = 1;
            }
            int i = iBc - 1;
            if (i == 1) {
                bundle.putBoolean("com.google.android.apps.youtube.music.mediabrowser.IS_LAST_PLAYED", true);
            } else if (i == 2) {
                bundle.putBoolean("com.google.android.apps.youtube.music.mediabrowser.IS_RECOMMENDED", true);
            } else if (i == 4) {
                bundle.putBoolean("com.google.android.apps.youtube.music.mediabrowser.IS_RECOMMENDED_PODCASTS", true);
            }
            if ((amzxVar.b & SemanticState.LiveRegion) != 0) {
                int iBc2 = a.bc(amzxVar.n);
                if (iBc2 == 0) {
                    iBc2 = 1;
                }
                bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", l(iBc2));
            }
            if ((amzxVar.b & SemanticState.Hidden) != 0) {
                int iBc3 = a.bc(amzxVar.m);
                if (iBc3 == 0) {
                    iBc3 = 1;
                }
                bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", l(iBc3));
            }
            if ((amzxVar.b & SemanticState.ReadOnly) != 0) {
                int iBc4 = a.bc(amzxVar.o);
                if (iBc4 == 0) {
                    iBc4 = 1;
                }
                bundle.putInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT", l(iBc4));
            }
            if (amzxVar.t.size() > 0) {
                ArrayList<String> arrayList = new ArrayList<>(amzxVar.t.size());
                Iterator it = amzxVar.t.iterator();
                while (it.hasNext()) {
                    arrayList.add(hmy.z((amzy) it.next()));
                }
                bundle.putStringArrayList("com.google.android.apps.youtube.music.mediabrowser.custom_actions", arrayList);
            }
            if (zneVar.equals(zmw.a)) {
                bundle.putBoolean("com.google.android.apps.youtube.music.mediabrowser.can_play_in_background", ((jnm) this.k.io()).C());
            }
            if ((amzxVar.b & 65536) != 0) {
                anfa anfaVar = amzxVar.u;
                if (anfaVar == null) {
                    anfaVar = anfa.a;
                }
                bundle.putString("com.google.android.apps.youtube.music.mediabrowser.display_configuration", hmy.A(anfaVar));
            }
            int i2 = (amzxVar.l ? 1 : 0) | (true != amzxVar.k ? 0 : 2);
            if (zneVar.equals(znd.a) || this.p.l(6, 45680102L, false)) {
                return Optional.of(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str2, spannedK3, spannedK, null, null, uriR, bundle, null), i2));
            }
            return amzxVar.k ? Optional.of(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str2, spannedK3, spannedK, null, null, uriR, bundle, null), 2)) : Optional.of(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str2, spannedK3, spannedK, null, null, uriR, bundle, null), 1));
        }
        ((agrc) ((agrc) d.b()).k("com/google/android/apps/youtube/music/mediabrowser/content/MediaItemFactory", "isMediaItemValid", 852, "MediaItemFactory.java")).t("mbfeItem has no title.");
        throw new IllegalArgumentException("Media item missing required fields.");
    }

    final void j() {
        this.o.clear();
    }

    final void k() {
    }
}
