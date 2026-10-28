package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import com.google.android.apps.youtube.music.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hif implements hiq {
    private static final agke b = agke.t(hui.a, hui.b, hui.c, hui.d);
    public final aunn a;
    private final Context c;
    private final mbc d;
    private final aunn e;
    private final aunn f;
    private final aunn g;
    private final aunn h;
    private final zne i;
    private final ConcurrentHashMap j = new ConcurrentHashMap();
    private final ConcurrentHashMap k = new ConcurrentHashMap();
    private Set l;
    private MediaBrowserCompat$MediaItem m;
    private MediaBrowserCompat$MediaItem n;
    private boolean o;

    public hif(Context context, mbc mbcVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, zne zneVar) {
        this.c = context;
        this.d = mbcVar;
        this.e = aunnVar;
        this.a = aunnVar2;
        this.f = aunnVar3;
        this.g = aunnVar4;
        this.h = aunnVar5;
        this.i = zneVar;
        agpr agprVar = agpr.a;
        agprVar.getClass();
        this.l = agprVar;
    }

    private final boolean A(Map map, znf znfVar) {
        List listV;
        him himVar = (him) map.get(znfVar);
        return (himVar == null || (listV = v(himVar)) == null || listV.isEmpty()) ? false : true;
    }

    private final him s(znf znfVar) {
        return hmy.J(this.j, znfVar);
    }

    private final him t(znf znfVar) {
        him himVar = (him) this.j.get(znfVar);
        if (himVar != null) {
            return himVar;
        }
        him himVar2 = (him) this.k.get(znfVar);
        return himVar2 == null ? u(znfVar) : himVar2;
    }

    private final him u(znf znfVar) {
        agrf agrfVar = him.a;
        return hmy.D(znfVar, this.i, this.j);
    }

    private final List v(him himVar) {
        Set set = this.l;
        agrf agrfVar = him.a;
        Object objK = himVar.k(this.e, this.i, this.d, set, null);
        if (true == (objK instanceof awmm)) {
            objK = null;
        }
        return (List) objK;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    private final List w(List list, ConcurrentMap concurrentMap, amzl amzlVar, him himVar) {
        List listC;
        if (list.isEmpty()) {
            agke agkeVar = agpi.a;
            agkeVar.getClass();
            return agkeVar;
        }
        if (himVar != null) {
            himVar.n(list, amzlVar, this.d, this.h);
            listC = himVar.m();
            if (listC == null) {
                agrf agrfVar = him.a;
                listC = hmy.C(list, this.k, this.i, this.d, this.h);
            }
        } else {
            agrf agrfVar2 = him.a;
            listC = hmy.C(list, this.k, this.i, this.d, this.h);
        }
        aunn aunnVar = this.e;
        zne zneVar = this.i;
        Set set = this.l;
        listC.getClass();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = ((awoa) listC).listIterator(0);
        while (listIterator.hasNext()) {
            him himVar2 = (him) listIterator.next();
            Object objL = himVar2.l(aunnVar, zneVar, set);
            Throwable thA = awmn.a(objL);
            if (thA != null) {
                ((agrc) ((agrc) him.a.c()).j(thA).k("com/google/android/apps/youtube/music/mediabrowser/content/MediaItemData$Companion", "getOrCreateMediaCompatMediaItems$<anonymous>$<anonymous>", 755, "MediaItemData.kt")).w("Failed to create MediaCompatMediaItem. mediaId: %s", himVar2.c.l);
            }
            if (true == (objL instanceof awmm)) {
                objL = null;
            }
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) objL;
            if (mediaBrowserCompat$MediaItem != null) {
                arrayList.add(mediaBrowserCompat$MediaItem);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y((MediaBrowserCompat$MediaItem) it.next());
        }
        for (Object obj : concurrentMap.values()) {
            obj.getClass();
            List listV = v((him) obj);
            if (listV != null) {
                Iterator it2 = listV.iterator();
                while (it2.hasNext()) {
                    y((MediaBrowserCompat$MediaItem) it2.next());
                }
            }
        }
        return arrayList;
    }

    private final void x(znf znfVar, List list, boolean z, boolean z2) {
        him himVarS = s(znfVar);
        if (himVarS == null) {
            if (!z2) {
                return;
            }
            himVarS = u(znfVar);
            z2 = true;
        }
        List listV = v(himVarS);
        if (listV == null) {
            if (!z2) {
                return;
            }
            listV = new ArrayList();
            z(himVarS, listV);
        }
        HashSet hashSet = new HashSet();
        Iterator it = listV.iterator();
        while (it.hasNext()) {
            hashSet.add(((MediaBrowserCompat$MediaItem) it.next()).a());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) it2.next();
            if (hashSet.add(mediaBrowserCompat$MediaItem.a())) {
                arrayList.add(mediaBrowserCompat$MediaItem);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(listV);
        if (z) {
            arrayList2.addAll(0, arrayList);
        } else {
            arrayList2.addAll(arrayList);
        }
        z(himVarS, arrayList2);
    }

    private final void y(MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
        Bundle bundle = mediaBrowserCompat$MediaItem.a.f;
        if (bundle == null || !bundle.getBoolean("com.google.android.apps.youtube.music.mediabrowser.IS_RECOMMENDED")) {
            return;
        }
        this.m = mediaBrowserCompat$MediaItem;
    }

    private final void z(him himVar, List list) {
        himVar.o(list, this.d, this.h);
    }

    @Override // defpackage.hiq
    public final zne a() {
        return this.i;
    }

    @Override // defpackage.hiq
    public final ajwo b(hjy hjyVar, znf znfVar) {
        aunn aunnVar = this.f;
        return ((hht) aunnVar.io()).b(hjyVar, t(znfVar));
    }

    @Override // defpackage.hiq
    public final void c(znf znfVar, MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mediaBrowserCompat$MediaItem);
        x(znfVar, arrayList, true, true);
    }

    @Override // defpackage.hiq
    public final void d(hjn hjnVar) {
        hmy.I(u(hjnVar.j), hjnVar);
    }

    @Override // defpackage.hiq
    public final void e() {
        this.j.clear();
        this.k.clear();
    }

    @Override // defpackage.hiq
    public final void f(amzz amzzVar) {
        amzzVar.getClass();
        this.n = ((hin) this.e.io()).c(amzzVar);
    }

    @Override // defpackage.hiq
    public final void g(List list, amzl amzlVar, hjn hjnVar, Set set, byte[] bArr) {
        list.getClass();
        set.getClass();
        this.l = set;
        agrf agrfVar = him.a;
        zne zneVar = this.i;
        ConcurrentHashMap concurrentHashMap = this.j;
        him himVarE = hmy.E(zneVar, concurrentHashMap, this.d);
        himVarE.r(aigj.v(bArr));
        for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : w(list, concurrentHashMap, amzlVar, himVarE)) {
            if (mediaBrowserCompat$MediaItem.b()) {
                isw iswVar = (isw) this.h.io();
                znf znfVar = znf.a;
                iswVar.h(yno.ai(mediaBrowserCompat$MediaItem.a()));
            }
        }
        hin hinVar = (hin) this.e.io();
        String str = hjnVar.e.b;
        hinVar.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hiq
    public final void h(Map map, hjo hjoVar) {
        String string;
        this.k.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        agqs agqsVarListIterator = b.listIterator(0);
        agqsVarListIterator.getClass();
        while (agqsVarListIterator.hasNext()) {
            E next = agqsVarListIterator.next();
            next.getClass();
            hui huiVar = (hui) next;
            List list = (List) map.get(huiVar);
            if (list != null && !list.isEmpty()) {
                int iMin = Math.min(5, list.size());
                int iOrdinal = huiVar.ordinal();
                if (iOrdinal == 0) {
                    string = this.c.getString(R.string.search_shelf_top_result_title);
                } else if (iOrdinal == 1) {
                    string = this.c.getString(R.string.library_songs_shelf_title);
                } else if (iOrdinal != 2) {
                    string = iOrdinal != 3 ? null : this.c.getString(R.string.library_albums_shelf_title);
                } else {
                    string = this.c.getString(R.string.library_playlists_shelf_title);
                }
                if (string != null) {
                    linkedHashMap.put(string, list.subList(0, iMin));
                }
            }
        }
        taf.g(((jgc) this.a.io()).e(linkedHashMap), new gsu(this, hjoVar.b, hjoVar, 13, (byte[]) null));
    }

    @Override // defpackage.hiq
    public final void i(hjy hjyVar, znf znfVar) {
        hjyVar.getClass();
        znfVar.getClass();
        him himVarT = t(znfVar);
        Object objIo = this.f.io();
        objIo.getClass();
        ((hht) objIo).g(himVarT);
    }

    @Override // defpackage.hiq
    public final void j(znf znfVar, String str) {
        aunn aunnVar = this.f;
        ((hht) aunnVar.io()).c(t(znfVar), str);
    }

    @Override // defpackage.hiq
    public final void k(znf znfVar, List list) {
        x(znfVar, list, false, false);
    }

    @Override // defpackage.hiq
    public final void l(znf znfVar, znf znfVar2) {
        List listV;
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItemO;
        him himVar = (him) this.j.get(znfVar);
        if (himVar == null || (listV = v(himVar)) == null || (mediaBrowserCompat$MediaItemO = hmy.O(listV, znfVar2)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(listV);
        arrayList.remove(mediaBrowserCompat$MediaItemO);
        z(himVar, arrayList);
    }

    @Override // defpackage.hiq
    public final void m(Map map) {
        map.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            znf znfVar = (znf) entry.getKey();
            List list = (List) entry.getValue();
            n(znfVar, list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strA = ((MediaBrowserCompat$MediaItem) it.next()).a();
                if (strA != null && strA.length() > 0) {
                    linkedHashSet.add(strA);
                }
            }
        }
        for (Object obj : this.j.values()) {
            obj.getClass();
            him himVar = (him) obj;
            znf znfVar2 = himVar.c;
            boolean zContainsKey = map.containsKey(znfVar2);
            linkedHashSet.contains(znfVar2.l);
            if (!zContainsKey) {
                aunn aunnVar = this.h;
                ReentrantLock reentrantLock = himVar.d;
                reentrantLock.lock();
                try {
                    if (himVar.f == null) {
                        reentrantLock.unlock();
                    } else {
                        himVar.f = null;
                        himVar.g = null;
                        himVar.h = null;
                        reentrantLock.unlock();
                        himVar.p(aunnVar);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.hiq
    public final void n(znf znfVar, List list) {
        znfVar.getClass();
        list.getClass();
        z(u(znfVar), list);
    }

    @Override // defpackage.hiq
    public final void o(hjn hjnVar) {
        him himVarS;
        List listV;
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = this.m;
        String strA = mediaBrowserCompat$MediaItem != null ? mediaBrowserCompat$MediaItem.a() : null;
        znf znfVar = hjnVar.j;
        if (awrc.c(znfVar.l, strA)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = this.n;
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem3 = this.m;
            if (!this.o) {
                String strA2 = mediaBrowserCompat$MediaItem2 != null ? mediaBrowserCompat$MediaItem2.a() : null;
                if (strA2 != null && strA2.length() != 0 && mediaBrowserCompat$MediaItem3 != null && (himVarS = s(yno.ai(mediaBrowserCompat$MediaItem3.a()))) != null && (listV = v(himVarS)) != null) {
                    ArrayList arrayList = new ArrayList(listV.size() + 1);
                    arrayList.add(0, mediaBrowserCompat$MediaItem2);
                    arrayList.addAll(listV);
                    z(himVarS, arrayList);
                    this.o = true;
                    String strA3 = mediaBrowserCompat$MediaItem2.a();
                    if (strA3 != null) {
                        ((hja) this.g.io()).e(this.i, strA3);
                    }
                }
            }
        }
        him himVarU = u(znfVar);
        hmy.I(himVarU, hjnVar);
        List listV2 = v(himVarU);
        if (listV2 != null) {
            hjnVar.c(listV2, himVarU);
            return;
        }
        him himVarJ = hmy.J(this.k, znfVar);
        if (himVarJ != null) {
            hmy.I(himVarJ, hjnVar);
            List listV3 = v(himVarJ);
            if (listV3 != null) {
                hjnVar.c(listV3, himVarJ);
                return;
            }
        }
        hjnVar.c(agpi.a, null);
    }

    @Override // defpackage.hiq
    public final void p(anzs anzsVar) {
        him himVar;
        List listV;
        Object objR;
        int iBc;
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItemD = ((hin) this.e.io()).d(anzsVar);
        Collection collectionValues = this.j.values();
        collectionValues.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            him himVar2 = (him) obj;
            if (!himVar2.c.f()) {
                ReentrantLock reentrantLock = himVar2.d;
                reentrantLock.lock();
                try {
                    amzx amzxVar = himVar2.e;
                    reentrantLock.unlock();
                    if (amzxVar != null) {
                        anfb anfbVar = amzxVar.f;
                        if (anfbVar == null) {
                            anfbVar = anfb.a;
                        }
                        if (anfbVar == null || (iBc = a.bc(anfbVar.f)) == 0 || iBc != 2) {
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            arrayList.add(obj);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && (listV = v((himVar = (him) it.next()))) != null) {
            List listAr = atqq.ar(listV);
            Iterator it2 = listAr.iterator();
            while (true) {
                objR = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) next;
                if (mediaBrowserCompat$MediaItem.a() != null) {
                    String strA = mediaBrowserCompat$MediaItem.a();
                    if (strA != null) {
                        ajwo ajwoVar = ajwo.a;
                        ajwoVar.getClass();
                        znf znfVar = znf.a;
                        anfb anfbVarC = yno.ai(strA).c();
                        if (anfbVarC != null && (anfbVarC.b & 1) != 0) {
                            ajwo ajwoVar2 = anfbVarC.e;
                            if (ajwoVar2 != null) {
                                ajwoVar = ajwoVar2;
                            }
                            ajwoVar.getClass();
                        }
                        objR = gzj.R(ajwoVar);
                    }
                    ajwo ajwoVar3 = anzsVar.f;
                    if (ajwoVar3 == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    if (awrc.c(objR, gzj.R(ajwoVar3))) {
                        objR = next;
                        break;
                    }
                }
            }
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (MediaBrowserCompat$MediaItem) objR;
            if (mediaBrowserCompat$MediaItem2 != null) {
                listAr.remove(mediaBrowserCompat$MediaItem2);
            }
            listAr.add(0, mediaBrowserCompat$MediaItemD);
            z(himVar, listAr);
            ((isw) this.h.io()).h(himVar.c);
        }
    }

    @Override // defpackage.hiq
    public final boolean q(znf znfVar) {
        znfVar.getClass();
        return A(this.j, znfVar) || A(this.k, znfVar);
    }

    @Override // defpackage.hiq
    public final void r(List list, hjo hjoVar) {
        list.getClass();
        ConcurrentHashMap concurrentHashMap = this.k;
        concurrentHashMap.clear();
        hjoVar.b(w(list, concurrentHashMap, null, null));
    }
}
