package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class isr {
    static final String a = znf.h.l;
    static final String b = znf.i.l;
    static final String c = znf.j.l;
    public final Context d;
    private final iup e;
    private final Executor f;
    private final Set g = new HashSet();
    private final Set h = new HashSet();

    public isr(Context context, iup iupVar, Executor executor) {
        this.d = context;
        this.e = iupVar;
        this.f = executor;
    }

    public static String c(String str, boolean z) {
        return hmy.y(hef.o("", str, 0, z));
    }

    public final Uri a(aqmh aqmhVar, int i) {
        Context context = this.d;
        Optional optionalX = hmy.x(context, aqmhVar);
        if (!optionalX.isPresent()) {
            return ixt.r(context, i);
        }
        this.h.add(optionalX.get());
        return (Uri) optionalX.get();
    }

    public final ListenableFuture b() {
        this.g.clear();
        this.h.clear();
        iup iupVar = this.e;
        final ListenableFuture listenableFutureQ = iupVar.q();
        final ListenableFuture listenableFutureP = iupVar.p(false);
        final ListenableFuture listenableFutureN = iupVar.n();
        final ListenableFuture listenableFutureO = iupVar.o();
        return ahng.h(listenableFutureQ, listenableFutureP, listenableFutureN, listenableFutureO).a(new Callable() { // from class: isq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list;
                List list2;
                List<anjx> list3;
                List<ankr> list4;
                ArrayList arrayList;
                Iterator it;
                isr isrVar;
                ListenableFuture listenableFuture = listenableFutureO;
                ListenableFuture listenableFuture2 = listenableFutureN;
                ListenableFuture listenableFuture3 = listenableFutureP;
                try {
                    list = (List) ahng.v(listenableFutureQ);
                } catch (ExecutionException unused) {
                    list = agpi.a;
                }
                try {
                    list2 = (List) ahng.v(listenableFuture3);
                } catch (ExecutionException unused2) {
                    list2 = agpi.a;
                }
                try {
                    try {
                        list3 = (List) ahng.v(listenableFuture2);
                        while (true) {
                            isrVar = this.a;
                            if (!it.hasNext()) {
                                break;
                            }
                            anuk anukVar = (anuk) it.next();
                            String title = anukVar.getTitle();
                            Context context = isrVar.d;
                            arrayList.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(isr.c(hef.p(anukVar), true), title, a.bN(context, R.string.num_songs, "num_songs", anukVar.getTrackCount()), context.getResources().getString(R.string.default_media_item_desc), null, isrVar.a(anukVar.getThumbnailDetails(), R.drawable.playlist_empty_state), null, null), 2));
                        }
                    } catch (ExecutionException unused3) {
                        list3 = agpi.a;
                    }
                    list4 = (List) ahng.v(listenableFuture);
                } catch (ExecutionException unused4) {
                    list4 = agpi.a;
                }
                ArrayList arrayList2 = new ArrayList();
                HashMap map = new HashMap();
                arrayList = new ArrayList(list2.size());
                it = list2.iterator();
                boolean z = false;
                if (!arrayList.isEmpty()) {
                    Context context2 = isrVar.d;
                    String string = context2.getResources().getString(R.string.library_playlists_shelf_title);
                    String str = isr.a;
                    arrayList2.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str, string, null, null, null, ixt.r(context2, R.drawable.yt_outline_list_play_arrow_vd_theme_24), null, null), 1));
                    map.put(str, arrayList);
                }
                ArrayList arrayList3 = new ArrayList(list3.size());
                for (anjx anjxVar : list3) {
                    arrayList3.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(isr.c(anjxVar.getAndroidMediaStoreContentUri(), z), anjxVar.getTitle(), anjxVar.getArtistDisplayName(), isrVar.d.getResources().getString(R.string.default_media_item_desc), null, isrVar.a(anjxVar.getThumbnailDetails(), R.drawable.empty_state_cover_square), null, null), 2));
                    z = false;
                }
                if (!arrayList3.isEmpty()) {
                    Context context3 = isrVar.d;
                    String string2 = context3.getResources().getString(R.string.library_albums_shelf_title);
                    String str2 = isr.b;
                    arrayList2.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str2, string2, null, null, null, ixt.r(context3, R.drawable.yt_outline_album_vd_theme_24), null, null), 1));
                    map.put(str2, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList(list4.size());
                for (ankr ankrVar : list4) {
                    arrayList4.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(isr.c(ankrVar.getAndroidMediaStoreContentUri(), true), ankrVar.getName(), null, isrVar.d.getResources().getString(R.string.default_media_item_desc), null, isrVar.a(ankrVar.getThumbnailDetails(), R.drawable.cover_profile_empty_state), null, null), 2));
                }
                if (!arrayList4.isEmpty()) {
                    Context context4 = isrVar.d;
                    String string3 = context4.getResources().getString(R.string.library_artists_shelf_title);
                    String str3 = isr.c;
                    arrayList2.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str3, string3, null, null, null, ixt.r(context4, R.drawable.yt_outline_person_music_vd_theme_24), null, null), 1));
                    map.put(str3, arrayList4);
                }
                if (!list.isEmpty()) {
                    String string4 = ixt.t().toString();
                    Context context5 = isrVar.d;
                    arrayList2.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(isr.c(string4, true), context5.getString(R.string.media_browser_sideloaded_shuffle_songs_title), a.bN(context5, R.string.num_songs, "num_songs", Integer.valueOf(list.size())), context5.getResources().getString(R.string.default_media_item_desc), null, ixt.r(context5, R.drawable.quantum_ic_music_note_vd_theme_24), null, null), 2));
                }
                if (!arrayList2.isEmpty()) {
                    map.put(gzl.d, arrayList2);
                }
                return map;
            }
        }, this.f);
    }

    public final void d(String str) {
        Set set = this.g;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            this.d.grantUriPermission(str, (Uri) it.next(), 1);
        }
    }
}
